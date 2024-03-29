---
title: Camera
second_title: Справочник по Aspose.3D для .NET API
description: Камера описывает точку зрения зрителя смотрящего на сцену.
type: docs
weight: 250
url: /ru/net/aspose.threed.entities/camera/
---
## Camera class

Камера описывает точку зрения зрителя, смотрящего на сцену.

```csharp
public class Camera : Frustum
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [Camera](camera#constructor)() | Инициализирует новый экземпляр[`Camera`](../camera) класс. |
| [Camera](camera#constructor_1)(ProjectionType) | Инициализирует новый экземпляр[`Camera`](../camera) класс. |
| [Camera](camera#constructor_2)(string) | Инициализирует новый экземпляр[`Camera`](../camera) класс. |
| [Camera](camera#constructor_3)(string, ProjectionType) | Инициализирует новый экземпляр[`Camera`](../camera) класс. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [ApertureMode](../../aspose.threed.entities/camera/aperturemode) { get; set; } | Получает или устанавливает режим апертуры камеры |
| [Aspect](../../aspose.threed.entities/frustum/aspect) { get; set; } | Получает или задает соотношение сторон пирамиды |
| [AspectRatio](../../aspose.threed.entities/camera/aspectratio) { get; set; } | Получает или задает соотношение сторон плоскости обзора. |
| [Direction](../../aspose.threed.entities/frustum/direction) { get; set; } | Получает или задает направление, на которое смотрит камера. Изменения этого свойства также влияют на[`LookAt`](../frustum/lookat) а также[`Target`](../frustum/target) . |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Получает или задает, следует ли исключить этот объект при экспорте. |
| [FarPlane](../../aspose.threed.entities/frustum/farplane) { get; set; } | Получает или задает расстояние до дальней плоскости усеченного конуса. |
| [FieldOfView](../../aspose.threed.entities/camera/fieldofview) { get; set; } | Получает или задает поле зрения камеры в градусах, это свойство используется только в том случае, если установлен режим ApertureMode.Horizontal или жеVertical |
| [FieldOfViewX](../../aspose.threed.entities/camera/fieldofviewx) { get; set; } | Получает или задает горизонтальное поле зрения камеры в градусах. Это свойство используется только в том случае, если установлен режим ApertureMode.HorizAndVert |
| [FieldOfViewY](../../aspose.threed.entities/camera/fieldofviewy) { get; set; } | Получает или задает поле зрения камеры по вертикали в градусах. Это свойство используется только в том случае, если установлен режим ApertureMode.HorizAndVert |
| [Height](../../aspose.threed.entities/camera/height) { get; set; } | Получает или задает высоту плоскости просмотра, измеренную в дюймах |
| [LookAt](../../aspose.threed.entities/frustum/lookat) { get; set; } | Получает или задает интересующую позицию, на которую смотрит камера. |
| [Magnification](../../aspose.threed.entities/camera/magnification) { get; set; } | Получает или задает увеличение, используемое в ортогональной камере |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Получает или задает имя. |
| [NearPlane](../../aspose.threed.entities/frustum/nearplane) { get; set; } | Получает или задает расстояние ближней плоскости усеченного конуса. |
| [OrthoHeight](../../aspose.threed.entities/frustum/orthoheight) { get; set; } | Получает или задает высоту усеченного конуса в ортогональной проекции. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Получает или задает первый родительский узел, если задан первый родительский узел, этот объект будет отсоединен от других родительских узлов. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Получает все родительские узлы, сущность может быть присоединена к нескольким родительским узлам для экземпляра геометрии |
| [ProjectionType](../../aspose.threed.entities/camera/projectiontype) { get; set; } | Получает или задает тип проекции камеры. По умолчанию используется перспективная проекция. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Получает коллекцию всех свойств. |
| [RotationMode](../../aspose.threed.entities/frustum/rotationmode) { get; set; } | Получает или задает ориентацию усеченного конуса mode Это свойство работает, только если[`Target`](../frustum/target) равно null. Если значение равноFixedTarget , направление всегда вычисляется свойством[`LookAt`](../frustum/lookat) В противном случае[`LookAt`](../frustum/lookat)всегда рассчитывается по[`Direction`](../frustum/direction) |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Получает сцену, которой принадлежит этот объект |
| [Target](../../aspose.threed.entities/frustum/target) { get; set; } | Получает или задает цель, на которую смотрит камера. Если пользователь поддерживает это свойство, оно должно быть до[`LookAt`](../frustum/lookat) свойство. |
| [Up](../../aspose.threed.entities/frustum/up) { get; set; } | Получает или задает направление камеры вверх |
| [Width](../../aspose.threed.entities/camera/width) { get; set; } | Получает или задает ширину плоскости обзора, измеренную в дюймах |

## Методы

| Имя | Описание |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Находит свойство. Это может быть динамическое свойство (созданное CreateDynamicProperty/SetProperty) или родное свойство (идентифицированное по имени) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Получает ограничивающую рамку текущего объекта в его системе координат объектного пространства. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Получает ключ средства визуализации объектов, зарегистрированного в средстве визуализации |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Получить значение указанного свойства |
| [MoveForward](../../aspose.threed.entities/camera/moveforward)(double) | Переместить камеру вперед в направлении или цели. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Удаляет динамическое свойство. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Удалить указанное свойство с именем name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Устанавливает значение указанного свойства |

### Смотрите также

* class [Frustum](../frustum)
* пространство имен [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* сборка [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
