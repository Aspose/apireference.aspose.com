---
title: GeographicDatum.GeographicDatum
second_title: Référence de l'API Aspose.GIS pour .NET
description: GeographicDatum constructeur. Crée une nouvelle instance.
type: docs
weight: 10
url: /fr/net/aspose.gis.spatialreferencing/geographicdatum/geographicdatum/
---
## GeographicDatum constructor

Crée une nouvelle instance.

```csharp
public GeographicDatum(string name, Ellipsoid ellipsoid, 
    BursaWolfParameters toWgs84Parameters = null, Identifier identifier = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| name | String | Nom de cette donnée. |
| ellipsoid | Ellipsoid | Ellipsoïde de cette donnée. Ne peut pas être nul. |
| toWgs84Parameters | BursaWolfParameters | Paramètres, qui peuvent être donnés à la formule Bursa Wolf, pour convertir les coordonnées dans cette donnée en coordonnées dans la donnée WGS84. Si cette donnée est proche de WGS84 et qu'aucune transformation n'est nécessaire, passez les paramètres Bursa Wolf avec toutes les valeurs définies sur 0. Si null, ToWgs84 sera défini sur[`IsNull`](../../bursawolfparameters/isnull/) paramètres. |
| identifier | Identifier | Identifiant de cette donnée. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | ellipsoid est nul. |

### Voir également

* class [Ellipsoid](../../ellipsoid/)
* class [BursaWolfParameters](../../bursawolfparameters/)
* class [Identifier](../../identifier/)
* class [GeographicDatum](../)
* espace de noms [Aspose.Gis.SpatialReferencing](../../geographicdatum/)
* Assemblée [Aspose.GIS](../../../)


