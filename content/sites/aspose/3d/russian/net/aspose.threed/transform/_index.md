---
title: Transform
second_title: Справочник по Aspose.3D для .NET API
description: Преобразование содержит информацию позволяющую получить доступ к матрице перемещения/масштабирования/вращения или преобразования объекта с минимальными затратами Используется локальным преобразованием.
type: docs
weight: 2410
url: /ru/net/aspose.threed/transform/
---
## Transform class

Преобразование содержит информацию, позволяющую получить доступ к матрице перемещения/масштабирования/вращения или преобразования объекта с минимальными затратами Используется локальным преобразованием.

```csharp
public class Transform : A3DObject
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [EulerAngles](../../aspose.threed/transform/eulerangles) { get; set; } | Получает или задает поворот, представленный в углах Эйлера, измеренных в градусах |
| [GeometricRotation](../../aspose.threed/transform/geometricrotation) { get; set; } | Получает или задает геометрическое вращение Эйлера (измеряется в градусах). Геометрическое преобразование влияет только на присоединенные объекты и не затрагивает дочерние узлы. Оно будет объединено как локальное преобразование при экспорте геометрического преобразования в типы файлов, которые его не поддерживают. |
| [GeometricScaling](../../aspose.threed/transform/geometricscaling) { get; set; } | Получает или задает геометрическое масштабирование. Геометрическое преобразование влияет только на присоединенные объекты и не затрагивает дочерние узлы. Оно будет объединено как локальное преобразование при экспорте геометрического преобразования в типы файлов, которые его не поддерживают. |
| [GeometricTranslation](../../aspose.threed/transform/geometrictranslation) { get; set; } | Получает или задает геометрический сдвиг. Геометрическое преобразование влияет только на присоединенные объекты и не затрагивает дочерние узлы. Оно будет объединено как локальное преобразование при экспорте геометрического преобразования в типы файлов, которые его не поддерживают. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Получает или задает имя. |
| [PostRotation](../../aspose.threed/transform/postrotation) { get; set; } | Получает или задает пост-поворот, представленный в градусах |
| [PreRotation](../../aspose.threed/transform/prerotation) { get; set; } | Получает или задает предварительное вращение, представленное в градусах |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Получает коллекцию всех свойств. |
| [Rotation](../../aspose.threed/transform/rotation) { get; set; } | Получает или задает вращение, представленное в кватернионе. |
| [Scale](../../aspose.threed/transform/scale) { get; set; } | Получает или устанавливает масштаб |
| [TransformMatrix](../../aspose.threed/transform/transformmatrix) { get; set; } | Получает или задает матрицу преобразования. |
| [Translation](../../aspose.threed/transform/translation) { get; set; } | Получает или устанавливает перевод |

## Методы

| Имя | Описание |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Находит свойство. Это может быть динамическое свойство (созданное CreateDynamicProperty/SetProperty) или родное свойство (идентифицированное по имени) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Получить значение указанного свойства |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Удаляет динамическое свойство. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Удалить указанное свойство, идентифицированное по имени |
| [SetEulerAngles](../../aspose.threed/transform/seteulerangles)(double, double, double) | Устанавливает углы Эйлера в градусах текущего преобразования. |
| [SetGeometricRotation](../../aspose.threed/transform/setgeometricrotation)(double, double, double) | Устанавливает геометрическое вращение Эйлера (измеряется в градусах). Геометрическое преобразование влияет только на присоединенные объекты и не затрагивает дочерние узлы. Оно будет объединено как локальное преобразование при экспорте геометрического преобразования в типы файлов, которые его не поддерживают. |
| [SetGeometricScaling](../../aspose.threed/transform/setgeometricscaling)(double, double, double) | Устанавливает геометрическое масштабирование. Геометрическое преобразование влияет только на присоединенные объекты и не затрагивает дочерние узлы. Оно будет объединено как локальное преобразование при экспорте геометрического преобразования в типы файлов, которые его не поддерживают. |
| [SetGeometricTranslation](../../aspose.threed/transform/setgeometrictranslation)(double, double, double) | Устанавливает геометрический сдвиг. Геометрическое преобразование влияет только на присоединенные объекты и не затрагивает дочерние узлы. Оно будет объединено как локальное преобразование при экспорте геометрического преобразования в типы файлов, которые его не поддерживают. |
| [SetPostRotation](../../aspose.threed/transform/setpostrotation)(double, double, double) | Устанавливает пост-вращение, представленное в градусах |
| [SetPreRotation](../../aspose.threed/transform/setprerotation)(double, double, double) | Устанавливает предварительное вращение, представленное в градусах |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Устанавливает значение указанного свойства |
| [SetRotation](../../aspose.threed/transform/setrotation)(double, double, double, double) | Устанавливает вращение (как компоненты кватерниона) текущего преобразования. |
| [SetScale](../../aspose.threed/transform/setscale)(double, double, double) | Устанавливает масштаб текущего преобразования. |
| [SetTranslation](../../aspose.threed/transform/settranslation)(double, double, double) | Устанавливает перевод текущего преобразования. |

### Смотрите также

* class [A3DObject](../a3dobject)
* пространство имен [Aspose.ThreeD](../../aspose.threed)
* сборка [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
