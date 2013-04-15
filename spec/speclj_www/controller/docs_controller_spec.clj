(ns speclj_www.controller.docs-controller-spec
  (:require [joodo.spec-helpers.controller :refer :all ]
            [speclj.core :refer :all ]
            [speclj_www.controller.docs-controller :refer :all ]))

(describe "docs_controller_spec.clj"

  (with-routes docs-controller)
  (with-mock-rendering :strict true :template-root "speclj_www/view")

  (it "renders a components documentation"
    (let [response (do-get "/docs/describe")]
      (should= 200 (:status response))
      (should= "describe" (:component-name @rendered-context))
      (should-not= nil (:doc @rendered-context))))

  (it "404s on a missing component"
    (let [response (do-get "/docs/foo")]
      (should= 404 (:status response))
      (should= "not_found" @rendered-template)))

  )