---
title: MarkerCluster.FeaturesBasedConfiguration
second_title: Référence de l'API Aspose.GIS pour .NET
description: MarkerCluster propriété. Un rappel utilisé pour configurer ce symboliseur avant de rendre un centre de cluster.
type: docs
weight: 20
url: /fr/net/aspose.gis.rendering.symbolizers/markercluster/featuresbasedconfiguration/
---
## MarkerCluster.FeaturesBasedConfiguration property

Un rappel utilisé pour configurer ce symboliseur avant de rendre un centre de cluster.

```csharp
public Action<IEnumerable<Feature>, MarkerCluster> FeaturesBasedConfiguration { get; set; }
```

### Remarques

Ce rappel est invoqué avant le rendu de chaque centre de cluster. Il accepte une entité qui est sur le point d'être rendue et un clone de ce symboliseur. En modifiant les propriétés du clone, il est possible de mettre à jour le comportement du symboliseur en fonction des attributs des entités.

### Voir également

* class [Feature](../../../aspose.gis/feature/)
* class [MarkerCluster](../)
* espace de noms [Aspose.Gis.Rendering.Symbolizers](../../markercluster/)
* Assemblée [Aspose.GIS](../../../)


