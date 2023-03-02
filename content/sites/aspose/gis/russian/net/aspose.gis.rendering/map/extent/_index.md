---
title: Map.Extent
second_title: Справочник по Aspose.GIS for .NET API
description: Map свойство. Указывает границы карты для визуализации. Если установлено значениеnull  экстент вычисляется во время рендеринга чтобы включить всю геометрию во всех слоях.
type: docs
weight: 40
url: /ru/net/aspose.gis.rendering/map/extent/
---
## Map.Extent property

Указывает границы карты для визуализации. Если установлено значение`null` , экстент вычисляется во время рендеринга, чтобы включить всю геометрию во всех слоях.

```csharp
public Extent Extent { get; set; }
```

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentException | [`IsValid`](../../../aspose.gis/extent/isvalid/) является`false`.[`Width`](../../../aspose.gis/extent/width/) меньше или равно нулю.[`Height`](../../../aspose.gis/extent/height/) меньше или равно нулю.[`SpatialReferenceSystem`](../../../aspose.gis/extent/spatialreferencesystem/) является`null`. |

### Примечания

Если система пространственной привязки экстента не равна системе пространственной привязки карты, экстент трансформируется в целевую систему пространственной привязки во время рендеринга.

### Смотрите также

* class [Extent](../../../aspose.gis/extent/)
* class [Map](../)
* пространство имен [Aspose.Gis.Rendering](../../map/)
* сборка [Aspose.GIS](../../../)


