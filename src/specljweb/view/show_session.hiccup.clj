[:h1 "Session values"]
[:p "You have " (count (:session *view-context*)) " item(s) in your session."]
[:ul
 (for [[key value] (:session *view-context*)]
   [:li key " = " value
    [:span "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"]
    [:a {:href (format "/folcon/delete?key=%s" (name key))} "delete"]])]

[:form {:action "/folcon/add" :method :post}
 [:label "Key"] [:input {:type "text" :name "key"}]
 [:label "Value"] [:input {:type "text" :name "value"}]
 [:input {:type "submit" :value "Add"}]]