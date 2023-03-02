---
title: FileGdbCoordinatePrecisionGrid.XYScale
second_title: Aspose.GIS für .NET-API-Referenz
description: FileGdbCoordinatePrecisionGrid eigendom. Ruft die Skalierung der X und YKoordinaten ab oder legt sie fest. Wenn eingestelltnull der Standardwert wird verwendet.
type: docs
weight: 60
url: /de/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xyscale/
---
## FileGdbCoordinatePrecisionGrid.XYScale property

Ruft die Skalierung der X- und Y-Koordinaten ab oder legt sie fest. Wenn eingestellt`null` der Standardwert wird verwendet.

```csharp
public double? XYScale { get; set; }
```

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentOutOfRangeException | Argument ist nicht positiv. |

### Bemerkungen

Standardwert ist`1e9` für[`VectorLayer`](../../../aspose.gis/vectorlayer/)mit geografischen[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) und`XYScale = 1 / XYToleranz * 10` für[`VectorLayer`](../../../aspose.gis/vectorlayer/) with projiziert[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) .

### Siehe auch

* class [FileGdbCoordinatePrecisionGrid](../)
* namensraum [Aspose.Gis.Formats.FileGdb](../../filegdbcoordinateprecisiongrid/)
* Montage [Aspose.GIS](../../../)


