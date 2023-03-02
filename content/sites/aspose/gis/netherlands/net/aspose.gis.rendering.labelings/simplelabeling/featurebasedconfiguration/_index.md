---
title: SimpleLabeling.FeatureBasedConfiguration
second_title: Aspose.GIS voor .NET API-referentie
description: SimpleLabeling eigendom. Een callback die wordt gebruikt om deze labeling te configureren voordat een functie wordt afgehandeld.
type: docs
weight: 20
url: /nl/net/aspose.gis.rendering.labelings/simplelabeling/featurebasedconfiguration/
---
## SimpleLabeling.FeatureBasedConfiguration property

Een callback die wordt gebruikt om deze labeling te configureren voordat een functie wordt afgehandeld.

```csharp
public Action<Feature, SimpleLabeling> FeatureBasedConfiguration { get; set; }
```

### Opmerkingen

Deze callback wordt aangeroepen voordat elk object wordt gelabeld. Het accepteert een functie die op het punt staat om gelabeld te worden en een kloon van deze labeling. Door de eigenschappen van de kloon te wijzigen, is het mogelijk om het labelgedrag bij te werken op basis van de kenmerken van het object.

### Zie ook

* class [Feature](../../../aspose.gis/feature/)
* class [SimpleLabeling](../)
* naamruimte [Aspose.Gis.Rendering.Labelings](../../simplelabeling/)
* montage [Aspose.GIS](../../../)


