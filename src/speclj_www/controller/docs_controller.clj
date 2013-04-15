(ns speclj_www.controller.docs-controller
  (:require [compojure.core :refer [routes GET context]]
            [joodo.views :refer [render-template render-html]]
            [speclj.core]))

(def speclj-ns (the-ns 'speclj.core))

(defn render-docs-for [component-name]
  (if-let [component (ns-resolve speclj-ns (symbol component-name))]
    (render-template "docs/doc" :component-name component-name :doc (:doc (meta component)))
    {:status 404 :body (render-template "not_found")}))

(def docs-controller
  (context "/docs" []
    (GET "/" [] (render-template "docs/index"))
    (GET "/:component-name" [component-name] (render-docs-for component-name))))
