---
title: Patch
second_title: Справочник по Aspose.3D для .NET API
description: APatch./patch это поверхность параметрического моделирования похожая наNurbsSurface./nurbssurface он также определяется двумя PatchDirection./patchdirectionU./patch/uиV./patch/v. Но разница междуPatch./patchиNurbsSurface./nurbssurfaceэто то чтоPatchDirection./patchdirectioncurve может быть одним изBezierQuadraticBezierBasisSplineCardinalSplineиLinear
type: docs
weight: 500
url: /ru/net/aspose.threed.entities/patch/
---
## Patch class

A[`Patch`](../patch)— это поверхность параметрического моделирования, похожая на[`NurbsSurface`](../nurbssurface), он также определяется двумя [`PatchDirection`](../patchdirection),[`U`](./u)и[`V`](./v). Но разница между[`Patch`](../patch)и[`NurbsSurface`](../nurbssurface)это то, что[`PatchDirection`](../patchdirection)curve может быть одним изBezier,QuadraticBezier,BasisSpline,CardinalSplineиLinear

```csharp
public class Patch : Geometry
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [Patch](patch#constructor)() | Инициализирует новый экземпляр класса[`Patch`](../patch). |
| [Patch](patch#constructor_1)(string) | Инициализирует новый экземпляр класса[`Patch`](../patch). |

## Характеристики

| Имя | Описание |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows) { get; set; } | Получает или устанавливает, может ли эта геометрия отбрасывать тень |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints) { get; } | Получает все контрольные точки |
| [Deformers](../../aspose.threed.entities/geometry/deformers) { get; } | Получает все деформаторы, связанные с этой геометрией. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Получает или задает, следует ли исключить этот объект при экспорте. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Получает или задает имя. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Получает или устанавливает первый родительский узел, если установлен первый родительский узел, этот объект будет отсоединен от других родительских узлов. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Получает все родительские узлы, сущность может быть присоединена к нескольким родительским узлам для создания экземпляров геометрии |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Получает коллекцию всех свойств. |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows) { get; set; } | Получает или задает, может ли эта геометрия получать тень. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Получает сцену, которой принадлежит этот объект |
| [U](../../aspose.threed.entities/patch/u) { get; } | Получает направление u. |
| [V](../../aspose.threed.entities/patch/v) { get; } | Получает направление v. |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements) { get; } | Получает все элементы вершин |
| [Visible](../../aspose.threed.entities/geometry/visible) { get; set; } | Получает или задает, если геометрия видна |

## Методы

| Имя | Описание |
| --- | --- |
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
