---
title: Class PrecisionModel
second_title: Справочник по Aspose.GIS for .NET API
description: Aspose.Gis.PrecisionModel сорт. PrecisionModel указывает количество значащих цифр в координате.
type: docs
weight: 1310
url: /ru/net/aspose.gis/precisionmodel/
---
## PrecisionModel class

`PrecisionModel` указывает количество значащих цифр в координате.

```csharp
public abstract class PrecisionModel : IEquatable<PrecisionModel>
```

## Характеристики

| Имя | Описание |
| --- | --- |
| static [Exact](../../aspose.gis/precisionmodel/exact/) { get; } | Возвращает модель точной точности. В соответствии с моделью точной точности все цифры в двойном значении являются значащими. |
| [IsExact](../../aspose.gis/precisionmodel/isexact/) { get; } | Получает значение, указывающее, является ли эта модель точности точной. |
| [IsRounding](../../aspose.gis/precisionmodel/isrounding/) { get; } | Получает значение, указывающее, округляется ли эта модель точности. |
| abstract [SignificantDigits](../../aspose.gis/precisionmodel/significantdigits/) { get; } | Получает количество значащих цифр в модели точности, если она округляется. |

## Методы

| Имя | Описание |
| --- | --- |
| static [Rounding](../../aspose.gis/precisionmodel/rounding/)(int) | Возвращает модель точности округления. В соответствии с моделью точности округления имеет значение только ограниченное число цифр. |
| override [Equals](../../aspose.gis/precisionmodel/equals/#equals_1)(object) | Указывает, равен ли текущий объект другому объекту того же типа. |
| [Equals](../../aspose.gis/precisionmodel/equals/#equals)(PrecisionModel) | Указывает, равен ли текущий объект другому объекту того же типа. |
| override [GetHashCode](../../aspose.gis/precisionmodel/gethashcode/)() | Служит хеш-функцией по умолчанию. |
| [operator ==](../../aspose.gis/precisionmodel/op_equality/) | Реализует оператор ==. |
| [operator !=](../../aspose.gis/precisionmodel/op_inequality/) | Реализует оператор !=. |

### Примечания

Существует два типа PrecisionModel:  Точный`PrecisionModel` (все цифры значащие); Закругленный`PrecisionModel` (некоторое количество цифр является значимым). А`PrecisionModel` можно установить на[`VectorLayer`](../vectorlayer/) с помощью[`DriverOptions`](../driveroptions/) для округления координат при записи или чтении геометрии.

### Смотрите также

* property [XYPrecisionModel](../driveroptions/xyprecisionmodel/)
* property [ZPrecisionModel](../driveroptions/zprecisionmodel/)
* property [MPrecisionModel](../driveroptions/mprecisionmodel/)
* пространство имен [Aspose.Gis](../../aspose.gis/)
* сборка [Aspose.GIS](../../)


