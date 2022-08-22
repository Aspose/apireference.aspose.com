---
title: Cylinder
second_title: Справочник по Aspose.3D для .NET API
description: Цилиндр с параметрами. Его также можно использовать для представления конуса когда одно из значений radiusTop/radiusBottom равно нулю.
type: docs
weight: 310
url: /ru/net/aspose.threed.entities/cylinder/
---
## Cylinder class

Цилиндр с параметрами. Его также можно использовать для представления конуса, когда одно из значений radiusTop/radiusBottom равно нулю.

```csharp
public class Cylinder : Primitive
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [Cylinder](cylinder#constructor)() | Инициализирует новый экземпляр[`Cylinder`](../cylinder) класс. |
| [Cylinder](cylinder#constructor_1)(double, double) | Инициализирует новый экземпляр[`Cylinder`](../cylinder) класс. |
| [Cylinder](cylinder#constructor_2)(double, double, double) | Инициализирует новый экземпляр[`Cylinder`](../cylinder) класс. |
| [Cylinder](cylinder#constructor_3)(double, double, double, int, int, bool) | Инициализирует новый экземпляр[`Cylinder`](../cylinder) класс. |
| [Cylinder](cylinder#constructor_4)(string, double, double, double, int, int, bool, double, double) | Инициализирует новый экземпляр[`Cylinder`](../cylinder) класс. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/primitive/castshadows) { get; set; } | Получает или задает, может ли эта геометрия отбрасывать тень |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Получает или задает, следует ли исключить этот объект при экспорте. |
| [GenerateFanCylinder](../../aspose.threed.entities/cylinder/generatefancylinder) { get; set; } | Получает или задает, следует ли генерировать веерообразный цилиндр, когда ThetaLength меньше 2*PI, иначе модель не будет разрезана. |
| [Height](../../aspose.threed.entities/cylinder/height) { get; set; } | Получает или задает высоту цилиндра. |
| [HeightSegments](../../aspose.threed.entities/cylinder/heightsegments) { get; set; } | Получает или задает сегменты высоты. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Получает или задает имя. |
| [OffsetBottom](../../aspose.threed.entities/cylinder/offsetbottom) { get; set; } | Получает или задает смещение преобразования вершин нижней стороны. |
| [OffsetTop](../../aspose.threed.entities/cylinder/offsettop) { get; set; } | Получает или задает смещение преобразования вершин верхней стороны. |
| [OpenEnded](../../aspose.threed.entities/cylinder/openended) { get; set; } | Получает или задает значение, указывающее, является ли это[`Cylinder`](../cylinder) open end. Значение по умолчанию — false. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Получает или задает первый родительский узел, если задан первый родительский узел, этот объект будет отсоединен от других родительских узлов. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Получает все родительские узлы, сущность может быть присоединена к нескольким родительским узлам для экземпляра геометрии |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Получает коллекцию всех свойств. |
| [RadialSegments](../../aspose.threed.entities/cylinder/radialsegments) { get; set; } | Получает или задает радиальные сегменты. |
| [RadiusBottom](../../aspose.threed.entities/cylinder/radiusbottom) { get; set; } | Получает или задает радиус нижней крышки цилиндра. |
| [RadiusTop](../../aspose.threed.entities/cylinder/radiustop) { get; set; } | Получает или задает радиус верхней крышки цилиндра. |
| [ReceiveShadows](../../aspose.threed.entities/primitive/receiveshadows) { get; set; } | Получает или задает, может ли эта геометрия получать тени. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Получает сцену, которой принадлежит этот объект |
| [ShearBottom](../../aspose.threed.entities/cylinder/shearbottom) { get; set; } | Получает или задает преобразование сдвига нижней стороны, вектор сохраняет значение сдвига (ось x, ось z), измеренное в радианах, значение по умолчанию — (0, 0) |
| [ShearTop](../../aspose.threed.entities/cylinder/sheartop) { get; set; } | Получает или задает преобразование сдвига верхней стороны, вектор сохраняет значение сдвига (ось X, ось Z), измеренное в радианах, значение по умолчанию — (0, 0) |
| [ThetaLength](../../aspose.threed.entities/cylinder/thetalength) { get; set; } | Получает или задает длину тета. Значение по умолчанию: 2π. |
| [ThetaStart](../../aspose.threed.entities/cylinder/thetastart) { get; set; } | Получает или задает начало тета. Значение по умолчанию: 0. |

## Методы

| Имя | Описание |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Находит свойство. Это может быть динамическое свойство (созданное CreateDynamicProperty/SetProperty) или родное свойство (идентифицированное по имени) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Получает ограничивающую рамку текущего объекта в его системе координат объектного пространства. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Получает ключ средства визуализации объектов, зарегистрированного в средстве визуализации |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Получить значение указанного свойства |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Удаляет динамическое свойство. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Удалить указанное свойство с именем name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Устанавливает значение указанного свойства |
| override [ToMesh](../../aspose.threed.entities/cylinder/tomesh)() | Преобразовать текущий объект в mesh |

### Смотрите также

* class [Primitive](../primitive)
* пространство имен [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* сборка [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
