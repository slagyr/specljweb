[:h3 "should-throw"]

[:div {:id "comp_box"}
  [:p "Asserts that a Throwable is throws by the evaluation of a form. When an class is passed, it assets that the thrown Exception is an instance of the class. When a string is also passed, it asserts that the message of the Exception is equal to the string."]

  [:code "(should-throw (+ 1 1)) ; fails<br />
    (should-throw (Exception.)) ; passes<br />
    (should-throw NullPointerException (Exception.)) ; fails<br />
    (should-throw<br />
	  &nbsp;&nbsp;Exception (NullPointerException.)) ; passes<br />
    (should-throw<br />
	  &nbsp;&nbsp;Exception \"Foo\" (Exception. \"Bar\")) ; fails<br />
    (should-throw<br />
	  &nbsp;&nbsp;Exception \"Foo\" (Exception. \"Foo\")) ; passes"]]