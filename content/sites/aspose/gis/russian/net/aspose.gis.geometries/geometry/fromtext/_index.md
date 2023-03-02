---
title: Geometry.FromText
second_title: Справочник по Aspose.GIS for .NET API
description: Geometry метод. Создает геометрию из ее общеизвестного текстового представления.
type: docs
weight: 470
url: /ru/net/aspose.gis.geometries/geometry/fromtext/
---
## FromText(string) {#fromtext}

Создает геометрию из ее общеизвестного текстового представления.

```csharp
public static IGeometry FromText(string wkt)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| wkt | String | Общеизвестное текстовое представление геометрии. |

### Возвращаемое значение

Геометрия, представленная аргументом.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент нулевой. |
| NotSupportedException | Аргумент представляет геометрию неподдерживаемого типа. |
| FormatException | Аргумент не является допустимым общеизвестным текстом. |

### Смотрите также

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* пространство имен [Aspose.Gis.Geometries](../../geometry/)
* сборка [Aspose.GIS](../../../)

---

## FromText(string, SpatialReferenceSystem) {#fromtext_1}

Создает геометрию из ее общеизвестного текстового представления.

```csharp
public static IGeometry FromText(string wkt, SpatialReferenceSystem spatialReferenceSystem)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| wkt | String | Общеизвестное текстовое представление геометрии. |
| spatialReferenceSystem | SpatialReferenceSystem | Пространственная система отсчета, которая будет назначена геометрии. |

### Возвращаемое значение

Геометрия, представленная аргументом.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент нулевой. |
| NotSupportedException | Аргумент представляет геометрию неподдерживаемого типа. |
| FormatException | Аргумент не является допустимым общеизвестным текстом. |

### Смотрите также

* interface [IGeometry](../../igeometry/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Geometry](../)
* пространство имен [Aspose.Gis.Geometries](../../geometry/)
* сборка [Aspose.GIS](../../../)


