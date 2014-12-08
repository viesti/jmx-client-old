(defproject jmx-client "0.1.0"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/java.jmx "0.3.0"]]
  :main ^:skip-aot jmx-client.core
  :uberjar-name "jmx-client.jar"
  :profiles {:uberjar {:aot :all}})
