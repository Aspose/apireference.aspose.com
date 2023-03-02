---
title: SpatialReferenceSystem.CreateVertical
second_title: Aspose.GIS für .NET-API-Referenz
description: SpatialReferenceSystem methode. Vertikale SRS erstellen.
type: docs
weight: 390
url: /de/net/aspose.gis.spatialreferencing/spatialreferencesystem/createvertical/
---
## SpatialReferenceSystem.CreateVertical method

Vertikale SRS erstellen.

```csharp
public static VerticalSpatialReferenceSystem CreateVertical(string name, 
    VerticalDatum verticalDatum, Unit verticalUnit = null, Axis verticalAxis = null, 
    Identifier identifier = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| name | String | Name des SRS. Wenn`null` . |
| verticalDatum | VerticalDatum | In SRS zu verwendendes Datum. |
| verticalUnit | Unit | In SRS zu verwendende Einheit. Wenn`null` ,[`Meter`](../../unit/meter/) wird verwendet. |
| verticalAxis | Axis | Achse mit "Auf"- oder "Ab"-Richtung, zur Verwendung in SRS. Wenn`null` , Achse mit Aufwärtsrichtung wird verwendet. |
| identifier | Identifier | Kennung, die an SRS angehängt wird. Durch das Anhängen einer Kennung werden andere SRS-Parameter nicht geändert. Es liegt an Ihnen, die Konsistenz von Kennung und SRS-Parametern sicherzustellen. |

### Rückgabewert

Neues vertikales SRS.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| InvalidOperationException | *verticalAxis* Richtung ist nicht oben oder unten. |
| ArgumentNullException | Einige der erforderlichen Parameter sind null. |

### Siehe auch

* class [VerticalSpatialReferenceSystem](../../verticalspatialreferencesystem/)
* class [VerticalDatum](../../verticaldatum/)
* class [Unit](../../unit/)
* class [Axis](../../axis/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* namensraum [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* Montage [Aspose.GIS](../../../)


