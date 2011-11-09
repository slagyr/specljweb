[:h3 "should-not-throw"]

[:div {:id "comp_box"}
  [:p (:doc (meta #'should-not-throw))]

  [:code "(should-not-throw (+ 1 1)) ; passes<br />
    (should-not-throw (Exception.)) ; fails</pre>"]]




