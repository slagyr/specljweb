[:h3 "should-throw"]

[:div {:id "comp_box"}
  [:p (:doc (meta #'should-throw))]

  [:code "(should-throw (+ 1 1)) ; fails<br />
    (should-throw (Exception.)) ; passes<br />
    (should-throw NullPointerException (Exception.)) ; fails<br />
    (should-throw<br />
	  &nbsp;&nbsp;Exception (NullPointerException.)) ; passes<br />
    (should-throw<br />
	  &nbsp;&nbsp;Exception \"Foo\" (Exception. \"Bar\")) ; fails<br />
    (should-throw<br />
	  &nbsp;&nbsp;Exception \"Foo\" (Exception. \"Foo\")) ; passes"]]