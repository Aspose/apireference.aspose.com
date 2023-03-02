---
title: MarkerPatternFill.FeatureBasedConfiguration
second_title: Справочник по Aspose.GIS for .NET API
description: MarkerPatternFill свойство. Обратный вызов который используется для настройки этого символизатора перед визуализацией функции.
type: docs
weight: 20
url: /ru/net/aspose.gis.rendering.symbolizers/markerpatternfill/featurebasedconfiguration/
---
## MarkerPatternFill.FeatureBasedConfiguration property

Обратный вызов, который используется для настройки этого символизатора перед визуализацией функции.

```csharp
public Action<Feature, MarkerPatternFill> FeatureBasedConfiguration { get; set; }
```

### Примечания

Этот обратный вызов вызывается перед рендерингом каждой функции. Он принимает функцию, которая должна быть визуализирована, и клон этого символизатора. Изменяя свойства клона, можно обновить поведение символизатора на основе атрибутов функции.

### Смотрите также

* class [Feature](../../../aspose.gis/feature/)
* class [MarkerPatternFill](../)
* пространство имен [Aspose.Gis.Rendering.Symbolizers](../../markerpatternfill/)
* сборка [Aspose.GIS](../../../)


