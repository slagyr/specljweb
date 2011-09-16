[:h3 "Installation"]
[:p "In order to install Speclj, you must have <a href=\"https://github.com/technomancy/leiningen\" target=\"_blank\">Leiningen</a> version 1.4 or later."]


[:div {:id "lein_install"}
 [:h4 "Install with Leiningen"]
 [:ul
  [:li "Include speclj in your :dev-dependencies and change the :test-path to \"spec/\".
   <code>
    :dev-dependencies [[speclj \"1.4.0\"]]<br />
    :test-path \"spec/\"</code>"]
  [:li "Run \"lein deps\" from your terminal while in your project directory."]]
]

[:div {:id "man_install"}
 [:h4 "Install Manually"]
 [:ul
  [:li "Make sure you have <a href=\"http://git-scm.com\" target=\"_blank\">Git</a>"]
  [:li "Check out the source code from our <a href=\"https://github.com/slagyr/speclj\">repository</a>."]
  [:li "Run \"lein jar\" from your terminal while in the speclj directory."]]
]