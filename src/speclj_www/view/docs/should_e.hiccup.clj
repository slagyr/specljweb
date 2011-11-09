[:h3 "should="]

[:div {:id "comp_box"}
  [:p (:doc (meta #'should=))]

  [:code "(should= 1 1) ; passes<br />
    (should= 1 2) ; fails</pre>"]]