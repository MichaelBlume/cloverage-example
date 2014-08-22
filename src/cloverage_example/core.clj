(ns cloverage-example.core
  (:use compojure.core))

(defroutes handler
  (GET "/" [] "<h1>Hello World</h1>"))
