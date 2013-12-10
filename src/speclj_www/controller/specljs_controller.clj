(ns speclj_www.controller.specljs-controller
  (:use
	[compojure.core :only (routes GET)]
    [joodo.views :only (render-template render-html)]
))

(def specljs-controller
  (->
    (routes
      (GET "/specljs" [] (render-template "specljs/notes"))
)))