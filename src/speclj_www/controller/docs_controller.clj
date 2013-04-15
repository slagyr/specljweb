(ns speclj_www.controller.docs-controller
  (:use [compojure.core :only (routes GET context)]
        [joodo.views :only (render-template render-html)]))

(def speclj-ns (the-ns 'speclj.core))

(defn render-docs-for [component-name]
  (if-let [component (ns-resolve speclj-ns (symbol component-name))]
    (render-template "docs/doc" :component-name component-name :doc (:doc (meta component)))
    {:status 404 :body (render-template "not_found")}))

(def docs-controller
  (context "/docs" []
    (GET "/:component-name" [component-name] (render-docs-for component-name))))
