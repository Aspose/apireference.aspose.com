---
title: SpatialReferenceSystem.CreateProjected
second_title: Référence de l'API Aspose.GIS pour .NET
description: SpatialReferenceSystem méthode. Créer un SRS projeté à partir de paramètres personnalisés.
type: docs
weight: 380
url: /fr/net/aspose.gis.spatialreferencing/spatialreferencesystem/createprojected/
---
## SpatialReferenceSystem.CreateProjected method

Créer un SRS projeté à partir de paramètres personnalisés.

```csharp
public static ProjectedSpatialReferenceSystem CreateProjected(
    ProjectedSpatialReferenceSystemParameters parameters, Identifier identifier = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| parameters | ProjectedSpatialReferenceSystemParameters | Paramètres à partir desquels créer. |
| identifier | Identifier | Identifiant, qui sera attaché au SRS. Attacher un identifiant ne modifiera pas les autres paramètres SRS. C'est à vous d'assurer la cohérence de l'identifiant et des paramètres SRS. |

### Return_Value

Nouveau SRS projeté.

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | Le SRS de base dans les paramètres est`null` . La méthode de projection dans les paramètres est`null` . |

### Voir également

* class [ProjectedSpatialReferenceSystem](../../projectedspatialreferencesystem/)
* class [ProjectedSpatialReferenceSystemParameters](../../projectedspatialreferencesystemparameters/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* espace de noms [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* Assemblée [Aspose.GIS](../../../)


