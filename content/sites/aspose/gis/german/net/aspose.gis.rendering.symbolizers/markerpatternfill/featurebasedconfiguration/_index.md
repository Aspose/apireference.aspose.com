---
title: MarkerPatternFill.FeatureBasedConfiguration
second_title: Aspose.GIS für .NET-API-Referenz
description: MarkerPatternFill eigendom. Ein Rückruf der verwendet wird um diesen Symbolisierer zu konfigurieren bevor ein Feature gerendert wird.
type: docs
weight: 20
url: /de/net/aspose.gis.rendering.symbolizers/markerpatternfill/featurebasedconfiguration/
---
## MarkerPatternFill.FeatureBasedConfiguration property

Ein Rückruf, der verwendet wird, um diesen Symbolisierer zu konfigurieren, bevor ein Feature gerendert wird.

```csharp
public Action<Feature, MarkerPatternFill> FeatureBasedConfiguration { get; set; }
```

### Bemerkungen

Dieser Callback wird aufgerufen, bevor jedes Feature gerendert wird. Es akzeptiert ein Feature, das gerade gerendert wird, und einen Klon dieses Symbolisierers. Durch Ändern der Eigenschaften des Klons ist es möglich, das Verhalten des Symbolisierers basierend auf den Attributen des Features zu aktualisieren.

### Siehe auch

* class [Feature](../../../aspose.gis/feature/)
* class [MarkerPatternFill](../)
* namensraum [Aspose.Gis.Rendering.Symbolizers](../../markerpatternfill/)
* Montage [Aspose.GIS](../../../)


