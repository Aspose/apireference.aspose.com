---
title: TriMesh
second_title: Справочник по Aspose.3D для .NET API
description: TriMesh содержит необработанные данные которые могут использоваться GPU напрямую. Этот класс представляет собой утилиту помогающую построить сетку содержащую только данные для каждой вершины.
type: docs
weight: 730
url: /ru/net/aspose.threed.entities/trimesh/
---
## TriMesh class

TriMesh содержит необработанные данные, которые могут использоваться GPU напрямую. Этот класс представляет собой утилиту, помогающую построить сетку, содержащую только данные для каждой вершины.

```csharp
public class TriMesh : Entity, IEnumerable<Vertex>
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [TriMesh](trimesh)(string, VertexDeclaration) | Инициализировать экземпляр[`TriMesh`](../trimesh) |

## Характеристики

| Имя | Описание |
| --- | --- |
| [Capacity](../../aspose.threed.entities/trimesh/capacity) { get; } | Емкость предварительно выделенных вершин. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Получает или задает, следует ли исключить этот объект при экспорте. |
| [IndicesCount](../../aspose.threed.entities/trimesh/indicescount) { get; } | Количество индексов в этом[`TriMesh`](../trimesh) |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Получает или задает имя. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Получает или задает первый родительский узел, если задан первый родительский узел, этот объект будет отсоединен от других родительских узлов. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Получает все родительские узлы, сущность может быть присоединена к нескольким родительским узлам для экземпляра геометрии |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Получает коллекцию всех свойств. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Получает сцену, которой принадлежит этот объект |
| [UnmergedVerticesCount](../../aspose.threed.entities/trimesh/unmergedverticescount) { get; } | Количество неслитых вершин, которые прошли через[`BeginVertex`](./beginvertex) а также[`EndVertex`](./endvertex) . |
| [VertexDeclaration](../../aspose.threed.entities/trimesh/vertexdeclaration) { get; } | Вершинный макет[`TriMesh`](../trimesh) . |
| [VerticesCount](../../aspose.threed.entities/trimesh/verticescount) { get; } | Количество вершин в этом[`TriMesh`](../trimesh) |
| [VerticesSizeInBytes](../../aspose.threed.entities/trimesh/verticessizeinbytes) { get; } | Общий размер всех вершин в байтах |

## Методы

| Имя | Описание |
| --- | --- |
| static [CopyFrom](../../aspose.threed.entities/trimesh/copyfrom)(TriMesh, VertexDeclaration) | Скопируйте[`TriMesh`](../trimesh)из ввода с новой вершиной layout |
| static [FromMesh](../../aspose.threed.entities/trimesh/frommesh#frommesh)(Mesh, bool) | Создать TriMesh из заданного объекта меша, объявление вершин основано на структуре входного меша. |
| static [FromMesh](../../aspose.threed.entities/trimesh/frommesh#frommesh_1)(VertexDeclaration, Mesh) | Создать TriMesh из заданного объекта сетки с заданным расположением вершин. |
| static [FromRawData](../../aspose.threed.entities/trimesh/fromrawdata)(VertexDeclaration, byte[], int[], bool) | Создать TriMesh из необработанных данных |
| [BeginVertex](../../aspose.threed.entities/trimesh/beginvertex)() | Начать добавление вершины |
| [EndVertex](../../aspose.threed.entities/trimesh/endvertex)() | Завершить добавление вершины |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Находит свойство. Это может быть динамическое свойство (созданное CreateDynamicProperty/SetProperty) или родное свойство (идентифицированное по имени) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Получает ограничивающую рамку текущего объекта в его системе координат объектного пространства. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Получает ключ средства визуализации объектов, зарегистрированного в средстве визуализации |
| [GetEnumerator](../../aspose.threed.entities/trimesh/getenumerator)() | Получить счетчик для перечисления[`Vertex`](../../aspose.threed.utilities/vertex) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Получить значение указанного свойства |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray#indicestoarray)(out int[]) |  |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray#indicestoarray_1)(out ushort[]) |  |
| [LoadVerticesFromBytes](../../aspose.threed.entities/trimesh/loadverticesfrombytes)(byte[]) | Загружать вершины из байтов, длина байтов должна быть целым числом, кратным размеру вершины. |
| [ReadDouble](../../aspose.threed.entities/trimesh/readdouble)(int, VertexField) | Читать двойное поле |
| [ReadFloat](../../aspose.threed.entities/trimesh/readfloat)(int, VertexField) | Чтение поля с плавающей запятой |
| [ReadFVector2](../../aspose.threed.entities/trimesh/readfvector2)(int, VertexField) | Прочитать поле vector2 |
| [ReadFVector3](../../aspose.threed.entities/trimesh/readfvector3)(int, VertexField) | Прочитать поле vector3 |
| [ReadFVector4](../../aspose.threed.entities/trimesh/readfvector4)(int, VertexField) | Прочитать поле vector4 |
| [ReadVector2](../../aspose.threed.entities/trimesh/readvector2)(int, VertexField) | Прочитать поле vector2 |
| [ReadVector3](../../aspose.threed.entities/trimesh/readvector3)(int, VertexField) | Прочитать поле vector3 |
| [ReadVector4](../../aspose.threed.entities/trimesh/readvector4)(int, VertexField) | Прочитать поле vector4 |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Удаляет динамическое свойство. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Удалить указанное свойство с именем name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Устанавливает значение указанного свойства |
| override [ToString](../../aspose.threed.entities/trimesh/tostring)() | Получает строковое представление[`TriMesh`](../trimesh) |
| [VerticesToArray](../../aspose.threed.entities/trimesh/verticestoarray)() | Преобразование данных вершин в массив байтов |
| [Write16bIndicesTo](../../aspose.threed.entities/trimesh/write16bindicesto)(Stream) | Записать данные индексов в виде 16-битного целого числа в поток |
| [Write32bIndicesTo](../../aspose.threed.entities/trimesh/write32bindicesto)(Stream) | Записать данные индексов в виде 32-битного целого числа в поток |
| [WriteVerticesTo](../../aspose.threed.entities/trimesh/writeverticesto)(Stream) | Записать данные вершин в указанный поток |

### Смотрите также

* class [Entity](../../aspose.threed/entity)
* class [Vertex](../../aspose.threed.utilities/vertex)
* пространство имен [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* сборка [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
