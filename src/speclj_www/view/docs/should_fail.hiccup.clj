[:h3 "should-fail"]

[:div {:id "comp_box"}
  [:p (:doc (meta #'should-fail))]

  [:code "(should-fail) ; fails<br />
    (should-fail \"my message\") ; fails and \"my message\" is used as failure message</pre>"]]