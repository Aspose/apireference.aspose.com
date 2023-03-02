---
title: SpatialReferenceSystem.CreateProjected
second_title: Aspose.GIS voor .NET API-referentie
description: SpatialReferenceSystem methode. Maak geprojecteerde SRS van aangepaste parameters.
type: docs
weight: 380
url: /nl/net/aspose.gis.spatialreferencing/spatialreferencesystem/createprojected/
---
## SpatialReferenceSystem.CreateProjected method

Maak geprojecteerde SRS van aangepaste parameters.

```csharp
public static ProjectedSpatialReferenceSystem CreateProjected(
    ProjectedSpatialReferenceSystemParameters parameters, Identifier identifier = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| parameters | ProjectedSpatialReferenceSystemParameters | Parameters om van te maken. |
| identifier | Identifier | Identifier, die zal worden toegevoegd aan SRS. Het toevoegen van een identifier heeft geen invloed op andere SRS-parameters. Het is aan u om te zorgen voor consistentie van identifier en SRS-parameters. |

### Winstwaarde

Nieuwe geprojecteerde SRS.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| InvalidOperationException | Basis SRS in parameters is`null` . Projectiemethode in parameters is`null` . |

### Zie ook

* class [ProjectedSpatialReferenceSystem](../../projectedspatialreferencesystem/)
* class [ProjectedSpatialReferenceSystemParameters](../../projectedspatialreferencesystemparameters/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* naamruimte [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* montage [Aspose.GIS](../../../)


