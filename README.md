# Package By

In this repo you will find different ways to structure the packages in a Java Application. They are: [package by feature](https://github.com/enriquemolinari/packages-by/tree/main/byfeature) (it reveals the domain as soon you open the repo root folder, [Screaming Architecture](http://blog.cleancoder.com/uncle-bob/2011/09/30/Screaming-Architecture.html)). Then, [package by layers classic](https://github.com/enriquemolinari/packages-by/tree/main/classiclayer/user) and [package by layers with a shared model](https://github.com/enriquemolinari/packages-by/tree/main/orm/user) and finally the [Hexagonal](https://github.com/enriquemolinari/packages-by/tree/main/hexagonal/user) (or port & adapters), by [Alistair Cockburn](https://alistair.cockburn.us/hexagonal-architecture/).

The diagrams below shows each strategy showing how dependencies between packages are organized. Any other dependency not shown on the diagrams are invalid. This must be validated, we should take care that dependencies are not violated. We can do this by using separate compilation or tools like ArchUnit.

![package-feature-1](https://user-images.githubusercontent.com/11150895/201475215-d4289882-8b30-4f41-b742-fef793b23751.png)
![package-layers](https://user-images.githubusercontent.com/11150895/201475194-dc37d8ea-4976-43c7-bba2-923852d5e440.png)
![package-layer-shared-model](https://user-images.githubusercontent.com/11150895/201475200-a608e979-a072-44c7-a9ec-44e3c50ed197.png)
![package-hexagonal](https://user-images.githubusercontent.com/11150895/201475212-57ba3a23-23c2-43cb-977b-b729757c540e.png)


