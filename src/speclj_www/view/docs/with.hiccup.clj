[:h3 "with"]

[:p "Declares a reference-able symbol that will be lazily evaluated once per characteristic of the containing describe scope. The body may contain any forms, the last of which will be the value of the dereferenced symbol."]

[:code "
<pre>(with nice-format (java.text.DecimalFormat. \"0.00000\"))

(it \"formats numbers nicely\"
  (should= \"3.14159\" (.format @nice-format Math/PI)))</pre>"]