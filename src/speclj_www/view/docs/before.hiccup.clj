[:h1 "before"]

[:p "Declares a function that is invoked before each characteristic in the containing describe scope is evaluated. The body may consist of any forms, presumably ones that perform side effects."]

[:code "
<pre>(before (println \"A spec is about to be evaluated\"))</pre>"]