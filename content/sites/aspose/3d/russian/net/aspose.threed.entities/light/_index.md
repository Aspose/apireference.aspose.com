---
title: Light
second_title: Справочник по Aspose.3D для .NET API
description: Свет освещает сцену.
type: docs
weight: 400
url: /ru/net/aspose.threed.entities/light/
---
## Light class

Свет освещает сцену.

Формула для расчета полного затухания света: `A = Постоянное затухание + (Расстояние * Линейное затухание) + ((Расст^2) * Квадратичное затухание)`

```csharp
public class Light : Frustum
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [Light](light#constructor)() | Инициализирует новый экземпляр[`Light`](../light) класс. |
| [Light](light#constructor_1)(string) | Инициализирует новый экземпляр[`Light`](../light) класс. |
| [Light](light#constructor_2)(string, LightType) | Инициализирует новый экземпляр[`Light`](../light) класс. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [Aspect](../../aspose.threed.entities/frustum/aspect) { get; set; } | Получает или задает соотношение сторон пирамиды |
| [CastLight](../../aspose.threed.entities/light/castlight) { get; set; } | Получает или задает, может ли текущий экземпляр источника света освещать другие объекты. |
| [CastShadows](../../aspose.threed.entities/light/castshadows) { get; set; } | Получает или задает, может ли свет отбрасывать тени на другие объекты. |
| [Color](../../aspose.threed.entities/light/color) { get; set; } | Получает или устанавливает цвет источника света |
| [ConstantAttenuation](../../aspose.threed.entities/light/constantattenuation) { get; set; } | Получает или задает постоянное затухание для расчета общего затухания света |
| [Direction](../../aspose.threed.entities/frustum/direction) { get; set; } | Получает или задает направление, на которое смотрит камера. Изменения этого свойства также влияют на[`LookAt`](../frustum/lookat) а также[`Target`](../frustum/target) . |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Получает или задает, следует ли исключить этот объект при экспорте. |
| [Falloff](../../aspose.threed.entities/light/falloff) { get; set; } | Получает или задает угол конуса спада (в градусах). |
| [FarPlane](../../aspose.threed.entities/frustum/farplane) { get; set; } | Получает или задает расстояние до дальней плоскости усеченного конуса. |
| [HotSpot](../../aspose.threed.entities/light/hotspot) { get; set; } | Получает или задает угол конуса горячей точки (в градусах). |
| [Intensity](../../aspose.threed.entities/light/intensity) { get; set; } | Получает или устанавливает интенсивность света, значение по умолчанию 100 |
| [LightType](../../aspose.threed.entities/light/lighttype) { get; set; } | Получает или устанавливает тип источника света |
| [LinearAttenuation](../../aspose.threed.entities/light/linearattenuation) { get; set; } | Получает или задает линейное затухание для расчета общего затухания света |
| [LookAt](../../aspose.threed.entities/frustum/lookat) { get; set; } | Получает или задает интересующую позицию, на которую смотрит камера. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Получает или задает имя. |
| [NearPlane](../../aspose.threed.entities/frustum/nearplane) { get; set; } | Получает или задает расстояние ближней плоскости усеченного конуса. |
| [OrthoHeight](../../aspose.threed.entities/frustum/orthoheight) { get; set; } | Получает или задает высоту усеченного конуса в ортогональной проекции. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Получает или задает первый родительский узел, если задан первый родительский узел, этот объект будет отсоединен от других родительских узлов. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Получает все родительские узлы, сущность может быть присоединена к нескольким родительским узлам для экземпляра геометрии |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Получает коллекцию всех свойств. |
| [QuadraticAttenuation](../../aspose.threed.entities/light/quadraticattenuation) { get; set; } | Получает или задает квадратичное затухание для расчета общего затухания источника света |
| [RotationMode](../../aspose.threed.entities/frustum/rotationmode) { get; set; } | Получает или задает ориентацию усеченного конуса mode Это свойство работает, только если[`Target`](../frustum/target) равно null. Если значение равноFixedTarget , направление всегда вычисляется свойством[`LookAt`](../frustum/lookat) В противном случае[`LookAt`](../frustum/lookat)всегда рассчитывается по[`Direction`](../frustum/direction) |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Получает сцену, которой принадлежит этот объект |
| [ShadowColor](../../aspose.threed.entities/light/shadowcolor) { get; set; } | Получает или задает цвет тени. |
| [Target](../../aspose.threed.entities/frustum/target) { get; set; } | Получает или задает цель, на которую смотрит камера. Если пользователь поддерживает это свойство, оно должно быть до[`LookAt`](../frustum/lookat) свойство. |
| [Up](../../aspose.threed.entities/frustum/up) { get; set; } | Получает или задает направление камеры вверх |

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

### Смотрите также

* class [Frustum](../frustum)
* пространство имен [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* сборка [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
