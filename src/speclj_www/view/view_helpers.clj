(ns speclj_www.view.view-helpers
  "Put helper functions for views in this namespace."
  (:require [joodo.views :refer (render-partial *view-context*)]
            [joodo.middleware.request :refer :all ]
            [hiccup.page :refer :all ]
            [hiccup.form :refer :all ]
            [speclj.core]))

(def speclj-components
  (sort
    (filter
      #(not (or (.startsWith % "*") (.startsWith % "-")))
      (map name (keys (ns-publics 'speclj.core))))))