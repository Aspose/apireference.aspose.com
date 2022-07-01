---
title: Mesh
second_title: Справочник по Aspose.3D для .NET API
description: Сетка состоит из множества n-сторонних полигонов.
type: docs
weight: 450
url: /ru/net/aspose.threed.entities/mesh/
---
## Mesh class

Сетка состоит из множества n-сторонних полигонов.

```csharp
public class Mesh : Geometry, IEnumerable<int[]>, IMeshConvertible
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [Mesh](mesh#constructor)() | Инициализирует новый экземпляр класса[`Mesh`](../mesh). |
| [Mesh](mesh#constructor_1)(Bitmap) | Построить сетку, используя указанную карту высот, если пиксельный формат карты высот содержит несколько компонентов, первый (обычно красный) компонент будет используется как значение высоты (z) Компоненты x и y контрольной точки являются нормализованными координатами пикселя. |
| [Mesh](mesh#constructor_4)(string) | Инициализирует новый экземпляр класса[`Mesh`](../mesh). |
| [Mesh](mesh#constructor_2)(Bitmap, Matrix4) | Построить сетку, используя указанную карту высот, если пиксельный формат карты высот содержит несколько компонентов, первый (обычно красный) компонент будет используется как значение высоты (z) Компоненты x и y контрольной точки являются нормализованными координатами пикселя. |
| [Mesh](mesh#constructor_3)(Bitmap, bool, Matrix4) | Построить сетку, используя указанную карту высот, если пиксельный формат карты высот содержит несколько компонентов, первый (обычно красный) компонент будет используется как значение высоты (z) Компоненты x и y контрольной точки являются нормализованными координатами пикселя. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows) { get; set; } | Получает или устанавливает, может ли эта геометрия отбрасывать тень |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints) { get; } | Получает все контрольные точки |
| [Deformers](../../aspose.threed.entities/geometry/deformers) { get; } | Получает все деформаторы, связанные с этой геометрией. |
| [Edges](../../aspose.threed.entities/mesh/edges) { get; } | Получает ребра сетки. Край необязателен в сетке, поэтому он может быть пустым. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Получает или задает, следует ли исключить этот объект при экспорте. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Получает или задает имя. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Получает или устанавливает первый родительский узел, если установлен первый родительский узел, этот объект будет отсоединен от других родительских узлов. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Получает все родительские узлы, сущность может быть присоединена к нескольким родительским узлам для создания экземпляров геометрии |
| [PolygonCount](../../aspose.threed.entities/mesh/polygoncount) { get; } | Получает количество полигонов |
| [Polygons](../../aspose.threed.entities/mesh/polygons) { get; } | Получает определение полигонов меша |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Получает коллекцию всех свойств. |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows) { get; set; } | Получает или задает, может ли эта геометрия получать тень. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Получает сцену, которой принадлежит этот объект |
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
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_2)(int[]) | Создает новый многоугольник со всеми вершинами, определенными в*indices*. Чтобы создать многоугольник вершина за вершиной, используйте[`PolygonBuilder`](../polygonbuilder). |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon)(int, int, int) | Создать многоугольник с 3 вершинами (треугольник) |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_3)(int[], int, int) | Создает новый многоугольник со всеми вершинами, определенными в*indices*. Чтобы создать многоугольник вершина за вершиной, используйте[`PolygonBuilder`](../polygonbuilder). |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_1)(int, int, int, int) | Создать многоугольник с 4 вершинами (quad) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Находит свойство. Это может быть динамическое свойство (созданное CreateDynamicProperty/SetProperty) или родное свойство (идентифицированное по имени) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Получает ограничивающую рамку текущего объекта в его системе координат объектного пространства. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement)(VertexElementType) | Получает элемент вершины с указанным типом |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Получает ключ рендерера сущности, зарегистрированного в рендерере |
| [GetEnumerator](../../aspose.threed.entities/mesh/getenumerator)() | Получает перечислитель для каждого внутреннего полигона. |
| [GetPolygonSize](../../aspose.threed.entities/mesh/getpolygonsize)(int) | Получает количество вершин указанного полигона. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Получить значение указанного свойства |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv)(TextureMapping) | Получает экземпляр[`VertexElementUV`](../vertexelementuv)с заданным типом наложения текстуры |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Удаляет динамическое свойство. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Удалить указанное свойство, идентифицированное по имени |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Устанавливает значение указанного свойства |
| [ToMesh](../../aspose.threed.entities/mesh/tomesh)() | Получает экземпляр Mesh из текущего объекта. |

### Примеры

Чтобы добавить полигон в сетку: Пройти через все полигоны в меше:

```csharp
int[] indices = new int[] {0, 1, 2};
mesh.CreatePolygon(indices);
```

```csharp
foreach(int[] polygon in mesh)
{
    //работаем с многоугольником
}
```

### Смотрите также

* class [Geometry](../geometry)
* interface [IMeshConvertible](../imeshconvertible)
* пространство имен [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* сборка [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
