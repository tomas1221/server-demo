(defproject server-demo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [aleph "0.4.2-alpha6"]
                 [clj-http "2.1.0"]
                 [cheshire "5.5.0"]
                 ]
  :main server-demo.web
  :min-lein-version "2.0.0"
  :uberjar-name "clojure-http-server.jar"
  :profiles {:production {:env {:production true}}})
