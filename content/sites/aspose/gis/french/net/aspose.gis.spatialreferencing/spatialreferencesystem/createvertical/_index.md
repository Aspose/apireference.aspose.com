---
title: SpatialReferenceSystem.CreateVertical
second_title: Référence de l'API Aspose.GIS pour .NET
description: SpatialReferenceSystem méthode. Créer un SRS vertical.
type: docs
weight: 390
url: /fr/net/aspose.gis.spatialreferencing/spatialreferencesystem/createvertical/
---
## SpatialReferenceSystem.CreateVertical method

Créer un SRS vertical.

```csharp
public static VerticalSpatialReferenceSystem CreateVertical(string name, 
    VerticalDatum verticalDatum, Unit verticalUnit = null, Axis verticalAxis = null, 
    Identifier identifier = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| name | String | Nom du SRS. Si`null` . |
| verticalDatum | VerticalDatum | Données à utiliser dans SRS. |
| verticalUnit | Unit | Unité à utiliser dans SRS. Si`null` ,[`Meter`](../../unit/meter/) sera utilisé. |
| verticalAxis | Axis | Axe avec sens "haut" ou "bas", à utiliser en SRS. Si`null` , l'axe avec la direction vers le haut sera utilisé. |
| identifier | Identifier | Identifiant, qui sera attaché au SRS. Attacher un identifiant ne modifiera pas les autres paramètres SRS. C'est à vous d'assurer la cohérence de l'identifiant et des paramètres SRS. |

### Return_Value

Nouveau SRS vertical.

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | *verticalAxis* la direction n'est ni vers le haut ni vers le bas. |
| ArgumentNullException | Certains des paramètres requis sont nuls. |

### Voir également

* class [VerticalSpatialReferenceSystem](../../verticalspatialreferencesystem/)
* class [VerticalDatum](../../verticaldatum/)
* class [Unit](../../unit/)
* class [Axis](../../axis/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* espace de noms [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* Assemblée [Aspose.GIS](../../../)


