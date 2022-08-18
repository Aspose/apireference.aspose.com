---
title: Geometry
second_title: Справочник по Aspose.3D для .NET API
description: Базовый класс всех визуализируемых геометрических объектов напримерMesh./mesh NurbsSurface./nurbssurface Patch./patch и др..
type: docs
weight: 360
url: /ru/net/aspose.threed.entities/geometry/
---
## Geometry class

Базовый класс всех визуализируемых геометрических объектов (например,[`Mesh`](../mesh) ,[`NurbsSurface`](../nurbssurface) ,[`Patch`](../patch) и др.).

[`Geometry`](../geometry) базовый класс поддерживает:  **Управление пунктом управления** , контрольные точки определяют базовую трехмерную пространственную структуру геометрии, разные геометрические типы по-разному определяют конкретные трехмерные модели. **Определение вершинного элемента** , вершинные элементы применяют к геометрии дополнительную информацию, такую как нормали/координаты UV/цвета вершин, см.[`VertexElement`](../vertexelement) Больше подробностей. **Деформация объекта** ,[`Deformer`](../../aspose.threed.deformers/deformer) могут быть связаны с анимацией геометрической формы.

```csharp
public class Geometry : Entity
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [Geometry](geometry)(string) | Инициализирует новый экземпляр[`Geometry`](../geometry) класс. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows) { get; set; } | Получает или задает, может ли эта геометрия отбрасывать тень |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints) { get; } | Получить все контрольные точки |
| [Deformers](../../aspose.threed.entities/geometry/deformers) { get; } | Получает все деформаторы, связанные с этой геометрией. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Получает или задает, следует ли исключить этот объект при экспорте. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Получает или задает имя. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Получает или задает первый родительский узел, если задан первый родительский узел, этот объект будет отсоединен от других родительских узлов. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Получает все родительские узлы, сущность может быть присоединена к нескольким родительским узлам для экземпляра геометрии |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Получает коллекцию всех свойств. |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows) { get; set; } | Получает или задает, может ли эта геометрия получать тени. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Получает сцену, которой принадлежит этот объект |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements) { get; } | Получает все элементы вершины |
| [Visible](../../aspose.threed.entities/geometry/visible) { get; set; } | Получает или задает видимость геометрии |

## Методы

| Имя | Описание |
| --- | --- |
| [AddElement](../../aspose.threed.entities/geometry/addelement)(VertexElement) | Добавляет существующий элемент вершины к текущей геометрии |
| [CreateElement](../../aspose.threed.entities/geometry/createelement#createelement)(VertexElementType) | Создает вершинный элемент указанного типа и добавляет его в геометрию. |
| [CreateElement](../../aspose.threed.entities/geometry/createelement#createelement_1)(VertexElementType, MappingMode, ReferenceMode) | Создает вершинный элемент указанного типа и добавляет его в геометрию. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv#createelementuv)(TextureMapping) | Создает[`VertexElementUV`](../vertexelementuv) с заданным типом отображения текстуры. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv#createelementuv_1)(TextureMapping, MappingMode, ReferenceMode) | Создает[`VertexElementUV`](../vertexelementuv) с заданным типом отображения текстуры. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Находит свойство. Это может быть динамическое свойство (созданное CreateDynamicProperty/SetProperty) или родное свойство (идентифицированное по имени) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Получает ограничивающую рамку текущего объекта в его системе координат объектного пространства. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement)(VertexElementType) | Получает элемент вершины с указанным типом |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Получает ключ средства визуализации объектов, зарегистрированного в средстве визуализации |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Получить значение указанного свойства |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv)(TextureMapping) | Получает[`VertexElementUV`](../vertexelementuv) экземпляр с заданным отображением текстуры type |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Удаляет динамическое свойство. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Удалить указанное свойство с именем name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Устанавливает значение указанного свойства |

### Смотрите также

* class [Entity](../../aspose.threed/entity)
* пространство имен [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* сборка [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
