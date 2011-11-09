[:h3 "should-not"]

[:div {:id "comp_box"}
  [:p (:doc (meta #'should-not))]

  [:code "(should-not true) ; fails<br />
    (should-not false) ; passes</pre>"]]