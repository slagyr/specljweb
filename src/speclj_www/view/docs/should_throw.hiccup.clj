[:h3 "should-throw"]

[:p "Asserts that a Throwable is throws by the evaluation of a form. When an class is passed, it assets that the thrown Exception is an instance of the class. When a string is also passed, it asserts that the message of the Exception is equal to the string."]

[:code "
<pre>(should-throw (+ 1 1)) ; fails
(should-throw (Exception.)) ; passes
(should-throw NullPointerException (Exception.)) ; fails
(should-throw Exception (NullPointerException.)) ; passes
(should-throw Exception \"Foo\" (Exception. \"Bar\")) ; fails
(should-throw Exception \"Foo\" (Exception. \"Foo\")) ; passes</pre>"]