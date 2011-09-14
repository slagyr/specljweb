[:h3 "should-not-throw"]

[:p "Asserts that nothing is thrown by the evaluation of a form."]

[:code "
<pre>(should-not-throw (+ 1 1)) ; passes
(should-not-throw (Exception.)) ; fails</pre>"]




