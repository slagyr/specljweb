(ns speclj_www.core
  (:require
    [compojure.core :refer :all ]
    [compojure.handler :as handler]
    [compojure.route :as route]
    [joodo.env :as env]
    [joodo.middleware.asset-fingerprint :refer [wrap-asset-fingerprint]]
    [joodo.middleware.favicon :refer [wrap-favicon-bouncer]]
    [joodo.middleware.keyword-cookies :refer [wrap-keyword-cookies]]
    [joodo.middleware.refresh :as refresh]
    [joodo.middleware.request :refer [wrap-bind-request]]
    [joodo.middleware.util :refer [wrap-development-maybe]]
    [joodo.middleware.view-context :refer [wrap-view-context]]
    [joodo.middleware.view-context :refer [wrap-view-context]]
    [joodo.views :refer [render-template render-html]]
    [ring.middleware.file-info :refer [wrap-file-info]]
    [ring.middleware.flash :refer [wrap-flash]]
    [ring.middleware.head :refer [wrap-head]]
    [ring.middleware.keyword-params :refer [wrap-keyword-params]]
    [ring.middleware.multipart-params :refer [wrap-multipart-params]]
    [ring.middleware.multipart-params.byte-array :refer [byte-array-store]]
    [ring.middleware.params :refer [wrap-params]]
    [ring.middleware.resource :refer [wrap-resource]]
    [ring.middleware.session :refer [wrap-session]]))

(defroutes speclj_www-routes
  (GET "/" [] (render-template "index" :layout "layouts/index"))
  (GET "/install" [] (render-template "install"))
  (GET "/community" [] (render-template "community"))
  (GET "/license" [] (render-template "license"))
  (refresh/handler 'speclj_www.controller.docs-controller/docs-controller)
  (refresh/handler 'speclj_www.controller.plugins-controller/plugins-controller)
  (refresh/handler 'speclj_www.controller.speclj-tutorial-controller/speclj-tutorial-controller)
  (refresh/handler 'speclj_www.controller.specljs-tutorial-controller/specljs-tutorial-controller)
;  (route/not-found (render-template "not_found" :template-root "speclj_www/view" :ns `speclj_www.view.view-helpers))
)

(def app-handler
  (->
    speclj_www-routes
    (wrap-view-context :template-root "speclj_www/view" :layout "layouts/main" :ns `speclj_www.view.view-helpers)))

(def app
  (-> app-handler
    wrap-development-maybe
    wrap-bind-request
    wrap-keyword-params
    wrap-params
    wrap-multipart-params
    wrap-flash
    wrap-keyword-cookies
    wrap-session
    wrap-favicon-bouncer
    (wrap-resource "public")
    wrap-asset-fingerprint
    wrap-file-info
    wrap-head
    ))

