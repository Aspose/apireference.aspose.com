---
title: SimpleLabeling.FeatureBasedConfiguration
second_title: Aspose.GIS für .NET-API-Referenz
description: SimpleLabeling eigendom. Ein Rückruf der verwendet wird um diese Bezeichnung zu konfigurieren bevor eine Funktion behandelt wird.
type: docs
weight: 20
url: /de/net/aspose.gis.rendering.labelings/simplelabeling/featurebasedconfiguration/
---
## SimpleLabeling.FeatureBasedConfiguration property

Ein Rückruf, der verwendet wird, um diese Bezeichnung zu konfigurieren, bevor eine Funktion behandelt wird.

```csharp
public Action<Feature, SimpleLabeling> FeatureBasedConfiguration { get; set; }
```

### Bemerkungen

Dieser Callback wird aufgerufen, bevor jedes Feature beschriftet wird. Es akzeptiert ein Feature, das gleich mit beschriftet werden soll, und einen Klon dieser Beschriftung. Durch Ändern der Eigenschaften des Klons ist es möglich, das Verhalten der Beschriftung basierend auf den Attributen des Features zu aktualisieren.

### Siehe auch

* class [Feature](../../../aspose.gis/feature/)
* class [SimpleLabeling](../)
* namensraum [Aspose.Gis.Rendering.Labelings](../../simplelabeling/)
* Montage [Aspose.GIS](../../../)


