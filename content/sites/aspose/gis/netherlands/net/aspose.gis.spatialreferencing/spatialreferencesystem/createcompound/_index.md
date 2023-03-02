---
title: SpatialReferenceSystem.CreateCompound
second_title: Aspose.GIS voor .NET API-referentie
description: SpatialReferenceSystem methode. Maak samengestelde SRS.
type: docs
weight: 340
url: /nl/net/aspose.gis.spatialreferencing/spatialreferencesystem/createcompound/
---
## SpatialReferenceSystem.CreateCompound method

Maak samengestelde SRS.

```csharp
public static CompoundSpatialReferenceSystem CreateCompound(string name, 
    SpatialReferenceSystem head, SpatialReferenceSystem tail, Identifier identifier = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | Naam van nieuwe SRS. |
| head | SpatialReferenceSystem | Hoofd SRS van nieuwe SRS. |
| tail | SpatialReferenceSystem | Staart SRS van nieuwe SRS. |
| identifier | Identifier | Identifier, die zal worden toegevoegd aan SRS. Het toevoegen van een identifier heeft geen invloed op andere SRS-parameters. Het is aan u om te zorgen voor consistentie van identifier en SRS-parameters. |

### Winstwaarde

Nieuwe samengestelde SRS.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Elk argument behalve*identifier* is`null` . |
| InvalidOperationException | *head* of*tail* zijn zelf samengestelde SRS. |

### Zie ook

* class [CompoundSpatialReferenceSystem](../../compoundspatialreferencesystem/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* naamruimte [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* montage [Aspose.GIS](../../../)


