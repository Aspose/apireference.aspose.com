---
title: MarkerCluster.FeaturesBasedConfiguration
second_title: Aspose.GIS voor .NET API-referentie
description: MarkerCluster eigendom. Een callback die wordt gebruikt om deze symbolizer te configureren voordat een clustercentrum wordt weergegeven.
type: docs
weight: 20
url: /nl/net/aspose.gis.rendering.symbolizers/markercluster/featuresbasedconfiguration/
---
## MarkerCluster.FeaturesBasedConfiguration property

Een callback die wordt gebruikt om deze symbolizer te configureren voordat een clustercentrum wordt weergegeven.

```csharp
public Action<IEnumerable<Feature>, MarkerCluster> FeaturesBasedConfiguration { get; set; }
```

### Opmerkingen

Deze callback wordt aangeroepen voordat elk clustercentrum wordt weergegeven. Het accepteert functies die op het punt staan te worden weergegeven en een kloon van deze symbolizer. Door de eigenschappen van de kloon te wijzigen, is het mogelijk om het gedrag van de symbolizer bij te werken op basis van de attributen van objecten.

### Zie ook

* class [Feature](../../../aspose.gis/feature/)
* class [MarkerCluster](../)
* naamruimte [Aspose.Gis.Rendering.Symbolizers](../../markercluster/)
* montage [Aspose.GIS](../../../)


