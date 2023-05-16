(ns learning-clojure-gateway-api.core
  (:gen-class)
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.json :refer [wrap-json-response wrap-json-params]]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defroutes app-routes
  (GET "/" [] "Hello, World!")
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))