[:h3 "should-not="]

[:p "Asserts that two forms evaluate to inequal values, with the unexpexcted value as the first parameter."]

[:code "
<pre>(should-not= 1 1) ; fails
(should-not= 1 2) ; passes</pre>"]