# Package By

In this repo you will find different ways to structure the packages in a Java Application. They are: [package by feature](https://github.com/enriquemolinari/packages-by/tree/main/byfeature) (it reveals the domain as soon you open the repo root folder, [Screaming Architecture](http://blog.cleancoder.com/uncle-bob/2011/09/30/Screaming-Architecture.html)). You might also have a second level by feature, for instance for the user package it could be: user.*login*, user.*register*, user.*forgotpwd*. Then, [package by layers classic](https://github.com/enriquemolinari/packages-by/tree/main/classiclayer/user) and [package by layers with a shared model](https://github.com/enriquemolinari/packages-by/tree/main/orm/user), the [Hexagonal](https://github.com/enriquemolinari/packages-by/tree/main/hexagonal/user) (or port & adapters), by [Alistair Cockburn](https://alistair.cockburn.us/hexagonal-architecture/) and finally the package by component by [Simon Brown](https://simonbrown.je/). Simon use package protected classes to hide implementation details within each component (which is great). The downside of this is that only with a DI framework you can inject dependencies, as they use reflection that bypass package protected classes. I prefer to create a main package with a Main class that creates and injects dependencies, so I cannot use the package protected modifier. That is why I need external tools to the language to enforce architectural decisions.

The diagrams below show each strategy showing how dependencies between packages are organized. These decisions must be validated, we should take care that dependencies are not violated. We can do this by using separate compilation or tools like ArchUnit.

What about if in the package by feature a class in the orders package needs to talk with a class in the user package. In a similar way, what about if a class in the user forgot password component needs to talk with a class in the user login component. Should a LoginComponet interface return a User model, shared by all other components in the system or a pretty specific, decoupled from others, object like AuthUser?

You have to decide, it is a trade off. However, some principles cannot be violated. All dependencies between top level packages must be done against the package entry point/interface (domain services for instance, not controller please) or the component interface (this is a cleaner way). Or, not depend at all between them, and use async event mechanisms (link in the microservice world). 

![package-feature](https://user-images.githubusercontent.com/11150895/201540382-55fed0e0-98ff-4429-b5a5-ed7af84e7887.png)  

![package-layers](https://user-images.githubusercontent.com/11150895/201475194-dc37d8ea-4976-43c7-bba2-923852d5e440.png)
![package-layer-shared-model](https://user-images.githubusercontent.com/11150895/201475200-a608e979-a072-44c7-a9ec-44e3c50ed197.png)
![package-hexagonal](https://user-images.githubusercontent.com/11150895/201475212-57ba3a23-23c2-43cb-977b-b729757c540e.png)
![package-component](https://user-images.githubusercontent.com/11150895/201540410-7ac04a35-763e-4204-ac70-ece4a1f718e3.png)

