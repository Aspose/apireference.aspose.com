---
title: SpatialReferenceSystem.CreateCompound
second_title: Référence de l'API Aspose.GIS pour .NET
description: SpatialReferenceSystem méthode. Créer SRS composé.
type: docs
weight: 340
url: /fr/net/aspose.gis.spatialreferencing/spatialreferencesystem/createcompound/
---
## SpatialReferenceSystem.CreateCompound method

Créer SRS composé.

```csharp
public static CompoundSpatialReferenceSystem CreateCompound(string name, 
    SpatialReferenceSystem head, SpatialReferenceSystem tail, Identifier identifier = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| name | String | Nom du nouveau SRS. |
| head | SpatialReferenceSystem | Chef SRS du nouveau SRS. |
| tail | SpatialReferenceSystem | Tail SRS du nouveau SRS. |
| identifier | Identifier | Identifiant, qui sera attaché au SRS. Attacher un identifiant ne modifiera pas les autres paramètres SRS. C'est à vous d'assurer la cohérence de l'identifiant et des paramètres SRS. |

### Return_Value

Nouveau composé SRS.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | N'importe quel argument sauf*identifier* est`null` . |
| InvalidOperationException | *head* ou*tail* sont eux-mêmes des SRS composés. |

### Voir également

* class [CompoundSpatialReferenceSystem](../../compoundspatialreferencesystem/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* espace de noms [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* Assemblée [Aspose.GIS](../../../)


