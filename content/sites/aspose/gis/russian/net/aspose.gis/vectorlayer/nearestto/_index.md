---
title: VectorLayer.NearestTo
second_title: Справочник по Aspose.GIS for .NET API
description: VectorLayer метод. Получает ближайший объект к предоставленным координатам.
type: docs
weight: 150
url: /ru/net/aspose.gis/vectorlayer/nearestto/
---
## NearestTo(double, double) {#nearestto_1}

Получает ближайший объект к предоставленным координатам.

```csharp
public Feature NearestTo(double x, double y)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| x | Double | X координаты. |
| y | Double | Y координаты. |

### Возвращаемое значение

Ближайший объект к предоставленным координатам.

### Смотрите также

* class [Feature](../../feature/)
* class [VectorLayer](../)
* пространство имен [Aspose.Gis](../../vectorlayer/)
* сборка [Aspose.GIS](../../../)

---

## NearestTo(IPoint) {#nearestto}

Получает ближайший объект к указанной точке.

```csharp
public Feature NearestTo(IPoint point)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| point | IPoint | Смысл. |

### Возвращаемое значение

Ближайший объект к указанной точке.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Точка`null`. |
| ArgumentException | Точка пуста или недействительна. |

### Смотрите также

* class [Feature](../../feature/)
* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [VectorLayer](../)
* пространство имен [Aspose.Gis](../../vectorlayer/)
* сборка [Aspose.GIS](../../../)


