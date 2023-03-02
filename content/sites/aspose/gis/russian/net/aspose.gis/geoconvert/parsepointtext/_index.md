---
title: GeoConvert.ParsePointText
second_title: Справочник по Aspose.GIS for .NET API
description: GeoConvert метод. Преобразует строку содержащую координаты в объект IPoint.
type: docs
weight: 20
url: /ru/net/aspose.gis/geoconvert/parsepointtext/
---
## GeoConvert.ParsePointText method

Преобразует строку, содержащую координаты, в объект IPoint.

```csharp
public static IPoint ParsePointText(string text)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| text | String | Строка, содержащая координаты для преобразования. Строка должна содержать координаты широты и долготы. Координаты должны быть разделены пробелом, запятой или точкой с запятой. |

### Возвращаемое значение

Объект IPoint с координатами, эквивалентными входной строке.

### Исключения

| исключение | условие |
| --- | --- |
| [GisException](../../gisexception/) |  |

### Примечания

Примеры: "80° 151°", "74°50,82', 172°08,21'", "80°;151°", "2CMB", "2CMB6682893142", "2C MB 66828 93142", "WMAQ12405535".

### Смотрите также

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [GeoConvert](../)
* пространство имен [Aspose.Gis](../../geoconvert/)
* сборка [Aspose.GIS](../../../)


