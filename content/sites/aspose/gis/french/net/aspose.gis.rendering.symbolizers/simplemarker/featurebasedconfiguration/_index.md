---
title: SimpleMarker.FeatureBasedConfiguration
second_title: Référence de l'API Aspose.GIS pour .NET
description: SimpleMarker propriété. Un rappel utilisé pour configurer ce symboliseur avant de rendre une entité.
type: docs
weight: 20
url: /fr/net/aspose.gis.rendering.symbolizers/simplemarker/featurebasedconfiguration/
---
## SimpleMarker.FeatureBasedConfiguration property

Un rappel utilisé pour configurer ce symboliseur avant de rendre une entité.

```csharp
public Action<Feature, SimpleMarker> FeatureBasedConfiguration { get; set; }
```

### Remarques

Ce rappel est invoqué avant le rendu de chaque fonctionnalité. Il accepte une entité qui est sur le point d'être rendue et un clone de ce symboliseur. En modifiant les propriétés du clone, il est possible de mettre à jour le comportement du symboliseur en fonction des attributs de l'entité.

### Voir également

* class [Feature](../../../aspose.gis/feature/)
* class [SimpleMarker](../)
* espace de noms [Aspose.Gis.Rendering.Symbolizers](../../simplemarker/)
* Assemblée [Aspose.GIS](../../../)


