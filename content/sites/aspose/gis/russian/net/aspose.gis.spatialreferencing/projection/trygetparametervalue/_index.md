---
title: Projection.TryGetParameterValue
second_title: Справочник по Aspose.GIS for .NET API
description: Projection метод. Получает параметр с указанным именем этой проекции. Если такого параметра нет  возвращаетnull .
type: docs
weight: 60
url: /ru/net/aspose.gis.spatialreferencing/projection/trygetparametervalue/
---
## Projection.TryGetParameterValue method

Получает параметр с указанным именем этой проекции. Если такого параметра нет - возвращает`null` .

```csharp
public double? TryGetParameterValue(string name, ParameterType type = ParameterType.Other)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| name | String | Имя параметра. |
| type | ParameterType | Тип параметра. Определяет коэффициент единицы измерения, который будет отменен: , если типLinear затем[`LinearParametersUnit`](../linearparametersunit/) будет отменено, и результат будет в метрах. , если типAngular затем[`AngularParametersUnit`](../angularparametersunit/) будет отменено, и результат будет в радианах. , если типOtherзначение параметра будет возвращено «как есть». |

### Возвращаемое значение

Параметр с указанным именем или`null` если его нет.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент нулевой. |

### Смотрите также

* enum [ParameterType](../../parametertype/)
* class [Projection](../)
* пространство имен [Aspose.Gis.SpatialReferencing](../../projection/)
* сборка [Aspose.GIS](../../../)


