---
title: Shape
second_title: Справочник по Aspose.3D для .NET API
description: Форма описывает деформацию на наборе контрольных точек аналогичную кластерному деформатору в Maya. Например мы можем добавить форму к созданной геометрии. И форма и геометрия имеют одинаковую топологическую информацию но разное положение контрольных точек. При различной степени влияния геометрия выполняет эффект деформации.
type: docs
weight: 640
url: /ru/net/aspose.threed.entities/shape/
---
## Shape class

Форма описывает деформацию на наборе контрольных точек, аналогичную кластерному деформатору в Maya. Например, мы можем добавить форму к созданной геометрии. И форма, и геометрия имеют одинаковую топологическую информацию, но разное положение контрольных точек. При различной степени влияния геометрия выполняет эффект деформации.

```csharp
public class Shape : Geometry
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [Shape](shape#constructor)() | Инициализирует новый экземпляр класса[`Shape`](../shape). |
| [Shape](shape#constructor_1)(string) | Инициализирует новый экземпляр класса[`Shape`](../shape). |

## Характеристики

| Имя | Описание |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows) { get; set; } | Получает или устанавливает, может ли эта геометрия отбрасывать тень |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints) { get; } | Получает все контрольные точки |
| [Deformers](../../aspose.threed.entities/geometry/deformers) { get; } | Получает все деформаторы, связанные с этой геометрией. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Получает или задает, следует ли исключить этот объект при экспорте. |
| [Indices](../../aspose.threed.entities/shape/indices) { get; } | Получает индексы. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Получает или задает имя. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Получает или устанавливает первый родительский узел, если установлен первый родительский узел, этот объект будет отсоединен от других родительских узлов. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Получает все родительские узлы, сущность может быть присоединена к нескольким родительским узлам для создания экземпляров геометрии |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Получает коллекцию всех свойств. |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows) { get; set; } | Получает или задает, может ли эта геометрия получать тень. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Получает сцену, которой принадлежит этот объект |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements) { get; } | Получает все элементы вершин |
| [Visible](../../aspose.threed.entities/geometry/visible) { get; set; } | Получает или задает, если геометрия видна |

## Методы

| Имя | Описание |
| --- | --- |
| static [FromControlPoints](../../aspose.threed.entities/shape/fromcontrolpoints)(params Vector3[]) | Создать форму с указанными контрольными точками с индексами по умолчанию. |
| [AddElement](../../aspose.threed.entities/geometry/addelement)(VertexElement) | Добавляет существующий элемент вершины к текущей геометрии |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType) | Создает вершинный элемент указанного типа и добавляет его в геометрию. |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType, MappingMode, ReferenceMode) | Создает вершинный элемент указанного типа и добавляет его в геометрию. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping) | Создает[`VertexElementUV`](../vertexelementuv)с заданным типом наложения текстуры. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping, MappingMode, ReferenceMode) | Создает[`VertexElementUV`](../vertexelementuv)с заданным типом наложения текстуры. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Находит свойство. Это может быть динамическое свойство (созданное CreateDynamicProperty/SetProperty) или родное свойство (идентифицированное по имени) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Получает ограничивающую рамку текущего объекта в его системе координат объектного пространства. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement)(VertexElementType) | Получает элемент вершины с указанным типом |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Получает ключ рендерера сущности, зарегистрированного в рендерере |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Получить значение указанного свойства |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv)(TextureMapping) | Получает экземпляр[`VertexElementUV`](../vertexelementuv)с заданным типом наложения текстуры |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Удаляет динамическое свойство. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Удалить указанное свойство, идентифицированное по имени |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Устанавливает значение указанного свойства |

### Смотрите также

* class [Geometry](../geometry)
* пространство имен [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* сборка [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
