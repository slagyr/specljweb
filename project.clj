(defproject speclj_www "0.0.1"
  :description "A website deployable to AppEngine"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [joodo "1.1.2"]]

  ; lein 1.x
  :dev-dependencies [[speclj "2.5.0"]]
  :test-path "spec/"

   ;lein 2.x
  :profiles {:dev {:dependencies [[speclj "2.5.0"]]}}
  :plugins [[speclj "2.5.0"]
            [joodo/lein-joodo "1.1.2"]]
  :test-paths ["spec"]

  :java-source-path "src/"
  :repl-init-script "config/development/repl_init.clj"
  :joodo-core-namespace speclj_www.core)
