(ns jmx-client.core
  (:require [clojure.java.jmx :as jmx])
  (:gen-class))

(defn print-memory
  ([]
     (print-memory "localhost" "9010"))
  ([host port]
     (println (str "connecting to " host ":" port))
     (jmx/with-connection {:host host :port (Integer/parseInt port)}
       (println (jmx/mbean "java.lang:type=Memory")))))

(defn -main [& args]
  (apply print-memory args))
