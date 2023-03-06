---
title: SimpleLine.FeatureBasedConfiguration
second_title: Aspose.GIS voor .NET API-referentie
description: SimpleLine eigendom. Een callback die wordt gebruikt om deze symbolizer te configureren voordat een object wordt weergegeven.
type: docs
weight: 60
url: /nl/net/aspose.gis.rendering.symbolizers/simpleline/featurebasedconfiguration/
---
## SimpleLine.FeatureBasedConfiguration property

Een callback die wordt gebruikt om deze symbolizer te configureren voordat een object wordt weergegeven.

```csharp
public Action<Feature, SimpleLine> FeatureBasedConfiguration { get; set; }
```

### Opmerkingen

Deze callback wordt aangeroepen voordat elk object wordt weergegeven. Het accepteert een feature die op het punt staat gerenderd te worden en een kloon van deze symbolizer. Door de eigenschappen van de kloon te wijzigen, is het mogelijk om het gedrag van de symbolizer bij te werken op basis van de attributen van het object.

### Zie ook

* class [Feature](../../../aspose.gis/feature/)
* class [SimpleLine](../)
* naamruimte [Aspose.Gis.Rendering.Symbolizers](../../simpleline/)
* montage [Aspose.GIS](../../../)


