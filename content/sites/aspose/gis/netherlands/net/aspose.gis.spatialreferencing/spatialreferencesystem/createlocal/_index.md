---
title: SpatialReferenceSystem.CreateLocal
second_title: Aspose.GIS voor .NET API-referentie
description: SpatialReferenceSystem methode. Lokale SRS maken.
type: docs
weight: 370
url: /nl/net/aspose.gis.spatialreferencing/spatialreferencesystem/createlocal/
---
## SpatialReferenceSystem.CreateLocal method

Lokale SRS maken.

```csharp
public static LocalSpatialReferenceSystem CreateLocal(string name, LocalDatum datum, Unit unit, 
    ICollection<Axis> axises, Identifier identifier = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | Naam SRS. |
| datum | LocalDatum | Datum te gebruiken in SRS. |
| unit | Unit | Eenheid voor gebruik in SRS. |
| axises | ICollection`1 | Assen te gebruiken in SRS. Mag niet leeg zijn |
| identifier | Identifier | Identifier, die zal worden toegevoegd aan SRS. Het toevoegen van een identifier heeft geen invloed op andere SRS-parameters. Het is aan u om te zorgen voor consistentie van identifier en SRS-parameters. |

### Winstwaarde

Nieuwe lokale SRS.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| InvalidOperationException | *axises* is leeg. |
| ArgumentNullException | Elk argument, behalve*identifier* is niets. |

### Zie ook

* class [LocalSpatialReferenceSystem](../../localspatialreferencesystem/)
* class [LocalDatum](../../localdatum/)
* class [Unit](../../unit/)
* class [Axis](../../axis/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* naamruimte [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* montage [Aspose.GIS](../../../)


