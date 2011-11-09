[:h3 "should-not="]

[:div {:id "comp_box"}
  [:p (:doc (meta #'should-not=))]

  [:code "(should-not= 1 1) ; fails<br />
    (should-not= 1 2) ; passes</pre>"]]