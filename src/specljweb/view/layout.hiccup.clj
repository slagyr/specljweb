(doctype :html5)
[:html
 [:head
  [:meta {:http-equiv "Content-Type" :content "text/html" :charset "iso-8859-1"}]
  [:title "specljweb"]
  (include-css "/stylesheets/specljweb.css")
  (include-js "/javascript/specljweb.js")]
 [:body
  (eval (:template-body gaeshi.views/*view-context*))
]]