---
title: Class DatabaseDriverOptions
second_title: Aspose.GIS für .NET-API-Referenz
description: Aspose.Gis.DatabaseDriverOptions klas. Optionen für aDatabaseDriver .
type: docs
weight: 70
url: /de/net/aspose.gis/databasedriveroptions/
---
## DatabaseDriverOptions class

Optionen für a[`DatabaseDriver`](../databasedriver/) .

```csharp
public abstract class DatabaseDriverOptions : DriverOptions
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Bestimmt, ob ein nicht geschlossener geschlossen wirdLinearRing in jeder Geometrie. Standardmäßig auf`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Legt fest, ob jedem Segment der Geometrie ein neuer Punkt in der Mitte hinzugefügt wird. Standardmäßig auf`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Legt fest, ob nahe Punkte in jeder Geometrie gelöscht werden. Standardmäßig auf`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Bestimmt Entfernung für[`DeleteNearPoints`](../driveroptions/deletenearpoints/) . Standardmäßig auf`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Eine Toleranz zum Linearisieren von Kurvengeometrien. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../precisionmodel/) die auf M-Koordinate angewendet wird, wenn Geometrien hinzugefügt werden[`VectorLayer`](../vectorlayer/) oder wenn sie aus dem gelesen werden[`VectorLayer`](../vectorlayer/) . Der Standardwert ist[`Exact`](../precisionmodel/exact/) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Bestimmt, ob Punkte gelöscht werden, die in jeder Geometrie auf demselben Segment liegen. Standardmäßig auf`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Bestimmt Entfernung für[`SimplifySegments`](../driveroptions/simplifysegments/) . Standardmäßig auf`0` . |
| [SpatialReferenceSystemMode](../../aspose.gis/databasedriveroptions/spatialreferencesystemmode/) { get; set; } | Legt fest, wie die SRS der unbekannten Geometrien für die Datenbank gehandhabt werden soll, wenn sie der Ebene hinzugefügt werden. Der Standardwert istThrowException . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Legt fest, ob Geometrien validiert werden sollen, wenn sie der Ebene hinzugefügt werden. Wenn festgelegt auf`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) wird für each -Geometrie aufgerufen, wenn sie der Ebene hinzugefügt wird und wenn die Validierung fehlschlägt ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) Ist`false` ),[`GisException`](../gisexception/) wird geworfen. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Legt fest, ob die Umwandlung eines Polygons oder Multipolygons in einen Linienzug zulässig ist. Standardmäßig auf`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../precisionmodel/) die auf X- und Y-Koordinaten angewendet werden, wenn Geometrien hinzugefügt werden[`VectorLayer`](../vectorlayer/) oder wenn sie aus dem gelesen werden[`VectorLayer`](../vectorlayer/) . Der Standardwert ist[`Exact`](../precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../precisionmodel/) die auf Z-Koordinate angewendet wird, wenn Geometrien hinzugefügt werden[`VectorLayer`](../vectorlayer/) oder wenn sie aus dem gelesen werden[`VectorLayer`](../vectorlayer/) . Der Standardwert ist[`Exact`](../precisionmodel/exact/) . |

### Siehe auch

* class [DriverOptions](../driveroptions/)
* namensraum [Aspose.Gis](../../aspose.gis/)
* Montage [Aspose.GIS](../../)


