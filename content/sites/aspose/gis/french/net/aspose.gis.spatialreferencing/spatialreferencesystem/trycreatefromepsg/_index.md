---
title: SpatialReferenceSystem.TryCreateFromEpsg
second_title: Référence de l'API Aspose.GIS pour .NET
description: SpatialReferenceSystem méthode. Créer un système de référence spatiale basé sur le code EPSG spécifié.
type: docs
weight: 400
url: /fr/net/aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromepsg/
---
## SpatialReferenceSystem.TryCreateFromEpsg method

Créer un système de référence spatiale basé sur le code EPSG spécifié.

```csharp
public static bool TryCreateFromEpsg(int epsg, out SpatialReferenceSystem value)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| epsg | Int32 | Code EPSG du référentiel spatial. |
| value | SpatialReferenceSystem& | Lorsque cette méthode revient`true` , contient un SRS avec le code EPSG spécifié ; sinon, contient`null` . |

### Return_Value

`true` si le code EPSG spécifié est connu et que SRS a été créé ;`false` sinon.

### Voir également

* method [CreateFromEpsg](../createfromepsg/)
* class [SpatialReferenceSystem](../)
* espace de noms [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* Assemblée [Aspose.GIS](../../../)


