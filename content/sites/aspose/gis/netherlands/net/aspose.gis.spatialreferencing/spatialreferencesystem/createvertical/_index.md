---
title: SpatialReferenceSystem.CreateVertical
second_title: Aspose.GIS voor .NET API-referentie
description: SpatialReferenceSystem methode. Creëer verticale SRS.
type: docs
weight: 390
url: /nl/net/aspose.gis.spatialreferencing/spatialreferencesystem/createvertical/
---
## SpatialReferenceSystem.CreateVertical method

Creëer verticale SRS.

```csharp
public static VerticalSpatialReferenceSystem CreateVertical(string name, 
    VerticalDatum verticalDatum, Unit verticalUnit = null, Axis verticalAxis = null, 
    Identifier identifier = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | Naam SRS. Als`null` . |
| verticalDatum | VerticalDatum | Datum te gebruiken in SRS. |
| verticalUnit | Unit | Eenheid voor gebruik in SRS. Als`null` ,[`Meter`](../../unit/meter/) zal worden gebruikt. |
| verticalAxis | Axis | As met "omhoog" of "omlaag" richting, te gebruiken in SRS. Als`null` , as met opwaartse richting wordt gebruikt. |
| identifier | Identifier | Identifier, die zal worden toegevoegd aan SRS. Het toevoegen van een identifier heeft geen invloed op andere SRS-parameters. Het is aan u om te zorgen voor consistentie van identifier en SRS-parameters. |

### Winstwaarde

Nieuwe verticale SRS.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| InvalidOperationException | *verticalAxis* richting is niet omhoog of omlaag. |
| ArgumentNullException | Sommige vereiste parameters zijn null. |

### Zie ook

* class [VerticalSpatialReferenceSystem](../../verticalspatialreferencesystem/)
* class [VerticalDatum](../../verticaldatum/)
* class [Unit](../../unit/)
* class [Axis](../../axis/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* naamruimte [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* montage [Aspose.GIS](../../../)


