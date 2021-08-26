# jenkins-shared-library-demo

This repo demonstrates the best practice for developing and managing Jenkins Shared Library with examples.

**What is Jenkins Shared Library?**

Jenkins is a self-contained, open source automation server which can be used to automate all sorts of tasks related to building, testing, and delivering or deploying software.

Jenkins can be installed through native system packages, Docker, or even run standalone by any machine with a Java Runtime Environment (JRE) installed.

I assume that you may be already very familiar with Jenkins and Jenkins pipeline scripting. (Reference - https://www.jenkins.io/doc/book/pipeline/)
You might have seen or used syntaxes like `node {}`, `stages("...") {}`, `steps { ... }`, `script{ ... }`, `withCredential() { ... }` in your jenkinsfiles. Reference - https://www.jenkins.io/doc/book/pipeline/syntax/)

Interestingly, they are simply shared libraries developed and shared as community plugins by the community members and Jenkins. Those are declaratively predefined in a groovy script like `node|stages|steps|script|withCredential.groovy`, and you will see available parameters in plugin source code. 

**Instructions**

Every subfolder in `./pipelines` represents an example. Each folder comes with two files `old.Jenkinsfile`, representing pipeline script without the shared library, and `new.Jenkinsfile` representing equivalent code with a shared library. 

In `./vars` each `.groovy` file is a Shared Library, the shared library name `./vars/${LibraryName}` is the same as `./pipelines/${LibraryName}`.

You can copy and paste the content of `old.Jenkinsfile` to Jenkins Pipeline Configuration and run it once. And then do the same thing with `new.Jenkinsfile`.

**Set up your Jenkins before playing with this Repo**

Jenkins -> Manage Jenkins -> Configure System -> Search: Global Pipeline Libraries

Fill in git URL, check "Load Implicitly" (if not check, you need to manually declare `@Library("${LibraryName}")` at beginning of your Jenkinsfile). So your Jenkins system can load the shared library implemented in this repo.

TODO - Instructions for setting up jenkins




