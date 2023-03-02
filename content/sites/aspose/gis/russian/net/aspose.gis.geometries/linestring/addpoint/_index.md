---
title: LineString.AddPoint
second_title: Справочник по Aspose.GIS for .NET API
description: LineString метод. Добавляет точку в конец строки.
type: docs
weight: 110
url: /ru/net/aspose.gis.geometries/linestring/addpoint/
---
## AddPoint(IPoint) {#addpoint}

Добавляет точку в конец строки.

```csharp
public void AddPoint(IPoint point)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| point | IPoint | Пункт, который нужно добавить. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент`null`. |
| ArgumentException | Аргумент пуст (его[`IsEmpty`](../../igeometry/isempty/) является`true` ). |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) этой геометрии и[`SpatialReferenceSystem`](../spatialreferencesystem/) аргумента оба не`null` и не равны друг другу. |

### Смотрите также

* interface [IPoint](../../ipoint/)
* class [LineString](../)
* пространство имен [Aspose.Gis.Geometries](../../linestring/)
* сборка [Aspose.GIS](../../../)

---

## AddPoint(double, double) {#addpoint_1}

Добавляет точку в конец строки.

```csharp
public void AddPoint(double x, double y)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| x | Double | Значение координаты X. |
| y | Double | Значение координаты Y. |

### Смотрите также

* class [LineString](../)
* пространство имен [Aspose.Gis.Geometries](../../linestring/)
* сборка [Aspose.GIS](../../../)

---

## AddPoint(double, double, double) {#addpoint_2}

Добавляет точку в конец строки.

```csharp
public void AddPoint(double x, double y, double z)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| x | Double | Значение координаты X. |
| y | Double | Значение координаты Y. |
| z | Double | Значение координаты Z. |

### Смотрите также

* class [LineString](../)
* пространство имен [Aspose.Gis.Geometries](../../linestring/)
* сборка [Aspose.GIS](../../../)

---

## AddPoint(double, double, double, double) {#addpoint_3}

Добавляет точку в конец строки.

```csharp
public void AddPoint(double x, double y, double z, double m)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| x | Double | Значение координаты X. |
| y | Double | Значение координаты Y. |
| z | Double | Значение координаты Z. |
| m | Double | Значение координаты М. |

### Смотрите также

* class [LineString](../)
* пространство имен [Aspose.Gis.Geometries](../../linestring/)
* сборка [Aspose.GIS](../../../)


