# weasel-src-paths

This is a small repository making it easy to reproduce a [problem](https://github.com/tomjakubowski/weasel/issues/28) with Weasel in the case of multiple source path roots.

*UPDATE*: Adding the additional source root to the project-level `:source-paths` appears to address the issue. This revision has been committed to this repo, showing the fix. This could act as a workaround for projects that don't use different sets of `:source-paths` for each cljsbuild build key.

## Usage

First, remove `"foo-src"` from the project-level, so that you have `:source-paths ["src"]`.

Observe that `lein cljsbuild once dev` builds the project without issue.

This project has a `bar.baz` namespace defined in `src-foo`. The `weasel-src-paths.core` namespace refers to a `hello` function in the `bar.baz` namespace.

First, in the project directory start up a REPL
```
lein repl
```
and then start up Weasel using [simple-brepl](https://github.com/james-henderson/simple-brepl):
```
user=> (simple-brepl)

ExceptionInfo No such namespace: bar.baz at line 1 /Users/mfikes/Documents/Projects/weasel-src-paths/src/weasel_src_paths/core.cljs  clojure.core/ex-info (core.clj:4403)
```

This prevents Weasel from starting up.

Previously, with earlier versions of ClojureScript, this simply resulted in analysis warnings. To see this, revise `project.clj` to instead refer to `[org.clojure/clojurescript "0.0-2371"]`, `[weasel "0.4.2"]`, and `[jarohen/simple-brepl "0.1.2"]`.

```
user=> (simple-brepl)
WARNING: Referred var bar.baz/hello does not exist at line 1 /Users/mfikes/Documents/Projects/weasel-src-paths/src/weasel_src_paths/core.cljs
<< started Weasel server on ws://127.0.0.1:9001 >>
```

## License

Copyright © 2015 Mike Fikes

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
