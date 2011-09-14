(ns speclj_www.core
  (:use
    [compojure.core :only (defroutes GET)]
    [compojure.route :only (not-found)]
    [joodo.middleware.view-context :only (wrap-view-context)]
    [joodo.views :only (render-template render-html)]
    [joodo.controllers :only (controller-router)]))

(defroutes speclj_www-routes
  (GET "/" [] (render-template "index" :layout "layouts/index"))
  (GET "/install" [] (render-template "install"))
  (GET "/community" [] (render-template "community"))
  (GET "/license" [] (render-template "license"))
  (controller-router 'speclj_www.controller)
;  (not-found (render-template "not_found" :template-root "speclj_www/view" :layout "layouts/main" :ns `speclj_www.view.view-helpers))
)

(def app-handler
  (->
    speclj_www-routes
    (wrap-view-context :template-root "speclj_www/view" :layout "layouts/main" :ns `speclj_www.view.view-helpers)))

