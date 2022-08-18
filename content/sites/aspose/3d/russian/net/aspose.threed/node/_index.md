---
title: Node
second_title: Справочник по Aspose.3D для .NET API
description: Представляет элемент графа сцены. Граф сцены представляет собой дерево объектов Node. Службы управления деревом являются самостоятельными в этом классе. Обратите внимание что Aspose.3D SDK не проверяет достоверность построенного графа сцены. Вызывающий объект обязан убедиться что он не генерирует циклические графы в иерархии узлов. Помимо управления деревом этот класс определяет все свойства необходимые для описания положения объекта в сцене. Эта информация включает в себя базовые свойства перемещения вращения и масштабирования а также более продвинутые параметры для поворотов пределов и атрибутов IK-соединений таких как жесткость и демпфирование. объект без какого-либо графического представления который содержит только информацию о положении. В этом состоянии его можно использовать для представления родителей в структуре дерева узлов но не более того. Обычное использование этого типа объектов заключается в добавлении к ним сущности которая будет специализировать узел см. Сущность. Сущность сама по себе является объектом и связана с узлом. Это также означает что один и тот же объект может совместно использоваться несколькими узлами. Камера свет сетка и т. д.  все это сущности и все они являются производными от базового класса Entity. .
type: docs
weight: 1470
url: /ru/net/aspose.threed/node/
---
## Node class

Представляет элемент графа сцены. Граф сцены представляет собой дерево объектов Node. Службы управления деревом являются самостоятельными в этом классе. Обратите внимание, что Aspose.3D SDK не проверяет достоверность построенного графа сцены. Вызывающий объект обязан убедиться, что он не генерирует циклические графы в иерархии узлов. Помимо управления деревом, этот класс определяет все свойства, необходимые для описания положения объекта в сцене. Эта информация включает в себя базовые свойства перемещения, вращения и масштабирования, а также более продвинутые параметры для поворотов, пределов и атрибутов IK-соединений, таких как жесткость и демпфирование. объект без какого-либо графического представления, который содержит только информацию о положении). В этом состоянии его можно использовать для представления родителей в структуре дерева узлов, но не более того. Обычное использование этого типа объектов заключается в добавлении к ним сущности, которая будет специализировать узел (см. «Сущность»). Сущность сама по себе является объектом и связана с узлом. Это также означает, что один и тот же объект может совместно использоваться несколькими узлами. Камера, свет, сетка и т. д. — все это сущности, и все они являются производными от базового класса Entity. .

```csharp
public class Node : SceneObject
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [Node](node#constructor)() | Инициализирует новый экземпляр[`Node`](../node) класс. |
| [Node](node#constructor_1)(string) | Инициализирует новый экземпляр[`Node`](../node) класс. |
| [Node](node#constructor_2)(string, Entity) | Инициализирует новый экземпляр[`Node`](../node) класс. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [AssetInfo](../../aspose.threed/node/assetinfo) { get; set; } | Информация об активах для каждого узла |
| [ChildNodes](../../aspose.threed/node/childnodes) { get; } | Получает дочерние узлы. |
| [Entities](../../aspose.threed/node/entities) { get; } | Получает все сущности узла. |
| [Entity](../../aspose.threed/node/entity) { get; set; } | Получает или устанавливает первый объект, присоединенный к этому узлу, если он установлен, очищает другие объекты. |
| [Excluded](../../aspose.threed/node/excluded) { get; set; } | Получает или задает, следует ли исключить этот узел и все дочерние узлы/объекты при экспорте. |
| [GlobalTransform](../../aspose.threed/node/globaltransform) { get; } | Получает глобальное преобразование. |
| [Material](../../aspose.threed/node/material) { get; set; } | Получает или задает первый материал, связанный с этим узлом, если задано, будут очищены другие материалы |
| [Materials](../../aspose.threed/node/materials) { get; } | Получает материалы, связанные с этим узлом. |
| [MetaDatas](../../aspose.threed/node/metadatas) { get; } | Получает метаданные, определенные в этом узле. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Получает или задает имя. |
| [ParentNode](../../aspose.threed/node/parentnode) { get; set; } | Получает или задает родительский узел. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Получает коллекцию всех свойств. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Получает сцену, которой принадлежит этот объект |
| [Transform](../../aspose.threed/node/transform) { get; } | Получает локальное преобразование. |
| [Visible](../../aspose.threed/node/visible) { get; set; } | Получает или задает отображение node |

## Методы

| Имя | Описание |
| --- | --- |
| [Accept](../../aspose.threed/node/accept)(NodeVisitor) | Проходит по всем дочерним узлам (включая текущий узел) и вызывает посетителя с узлом. Посетитель может прервать обход, возвращая false |
| [AddChildNode](../../aspose.threed/node/addchildnode)(Node) | Добавить дочерний узел к этому node |
| [AddEntity](../../aspose.threed/node/addentity)(Entity) | Добавить объект к узлу. |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode)() | Создает дочерний узел |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_1)(Entity) | Создать новый дочерний узел с прикрепленным данным объектом |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_2)(string) | Создать новый дочерний узел с заданным именем узла |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_3)(string, Entity) | Создать новый дочерний узел с заданным именем узла |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_4)(string, Entity, Material) | Создать новый дочерний узел с заданным именем узла и прикрепить указанный объект и материал |
| [EvaluateGlobalTransform](../../aspose.threed/node/evaluateglobaltransform)(bool) | Оценка глобального преобразования, включая геометрическое преобразование или нет. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Находит свойство. Это может быть динамическое свойство (созданное CreateDynamicProperty/SetProperty) или родное свойство (идентифицированное по имени) |
| [GetBoundingBox](../../aspose.threed/node/getboundingbox)() | Вычислить ограничивающую рамку node |
| [GetChild](../../aspose.threed/node/getchild#getchild)(int) | Получает дочерний узел по указанному индексу. |
| [GetChild](../../aspose.threed/node/getchild#getchild_1)(string) | Получает дочерний узел с указанным именем |
| [GetEntity&lt;T&gt;](../../aspose.threed/node/getentity)() |  |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Получить значение указанного свойства |
| [Merge](../../aspose.threed/node/merge)(Node) | Отсоединить все под узлом и присоединить к текущему узлу. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Удаляет динамическое свойство. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Удалить указанное свойство с именем name |
| [SelectObjects](../../aspose.threed/node/selectobjects)(string) | Выберите несколько объектов в текущем узле, используя синтаксис запроса, подобный XPath. |
| [SelectSingleObject](../../aspose.threed/node/selectsingleobject)(string) | Выберите один объект в текущем узле, используя синтаксис запроса, подобный XPath. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Устанавливает значение указанного свойства |
| override [ToString](../../aspose.threed/node/tostring)() | Получает строковое представление этого узла. |

### Смотрите также

* class [SceneObject](../sceneobject)
* пространство имен [Aspose.ThreeD](../../aspose.threed)
* сборка [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
