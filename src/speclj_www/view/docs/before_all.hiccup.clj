[:h1 "before-all"]

[:p "Declares a function that is invoked once before any characteristic in the containing describe scope is evaluated. The body may consist of any forms, presumably ones that perform side effects."]

[:code "
<pre>(before-all (println \"May the spec'ing begin!\"))</pre>"]