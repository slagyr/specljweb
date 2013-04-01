(ns speclj_www.view.view-helpers
  "Put helper functions for views in this namespace."
  (:use
    [joodo.views :only (render-partial *view-context*)]
    [joodo.middleware.request]
    [hiccup.page]
    [hiccup.form]
    [speclj.core]))
