[:h3 "around"]

[:p "Declares a function that will be invoked around each characteristic of the containing describe scope. The characteristic will be passed in and the around function is responsible for invoking it."]

[:code "
<pre>(declare *the-answer*) ; outside of a describe

(around [it]
  (binding [*the-answer* 42]
    (it)))

(it \"knows the answer\"
  (should= 42 *the-answer*))</pre>"]