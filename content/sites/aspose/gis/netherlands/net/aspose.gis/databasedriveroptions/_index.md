---
title: Class DatabaseDriverOptions
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.DatabaseDriverOptions klas. Opties voor eenDatabaseDriver .
type: docs
weight: 70
url: /nl/net/aspose.gis/databasedriveroptions/
---
## DatabaseDriverOptions class

Opties voor een[`DatabaseDriver`](../databasedriver/) .

```csharp
public abstract class DatabaseDriverOptions : DriverOptions
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Bepaalt of een niet geslotenLinearRing in elke geometrie. Standaard naar`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Bepaalt of een nieuw punt in het midden wordt toegevoegd aan elk geometriesegment. Standaard naar`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Bepaalt of nabije punten in elke geometrie moeten worden verwijderd. Standaard naar`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Bepaalt de afstand voor[`DeleteNearPoints`](../driveroptions/deletenearpoints/) . Standaard naar`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Een tolerantie om te gebruiken om krommegeometrieën te lineariseren. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | EEN[`PrecisionModel`](../precisionmodel/) die zal worden toegepast op M coordinate wanneer geometrieën worden toegevoegd aan de[`VectorLayer`](../vectorlayer/) of wanneer ze worden voorgelezen uit de[`VectorLayer`](../vectorlayer/) . De standaardwaarde is[`Exact`](../precisionmodel/exact/) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Bepaalt of verwijder punten die op hetzelfde segment in elke geometrie liggen. Standaard naar`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Bepaalt de afstand voor[`SimplifySegments`](../driveroptions/simplifysegments/) . Standaard naar`0` . |
| [SpatialReferenceSystemMode](../../aspose.gis/databasedriveroptions/spatialreferencesystemmode/) { get; set; } | Bepaalt hoe de SRS van de onbekende geometrieën voor de database moeten worden afgehandeld wanneer ze aan de laag worden toegevoegd. De standaardwaarde isThrowException . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Bepaalt of geometrieën moeten worden gevalideerd wanneer ze aan de laag worden toegevoegd. Indien ingesteld op`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) wordt aangeroepen voor elke geometrie wanneer deze wordt toegevoegd aan de laag en als de validatie mislukt ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) is`false` ),[`GisException`](../gisexception/) wordt gegooid. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Bepaalt of transformatie van polygoon of multipolygoon naar lijnstring is toegestaan. Standaard naar`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | EEN[`PrecisionModel`](../precisionmodel/) die zal worden toegepast op X- en Y-coördinaten wanneer geometrieën worden toegevoegd aan de[`VectorLayer`](../vectorlayer/) of wanneer ze worden voorgelezen uit de[`VectorLayer`](../vectorlayer/) . De standaardwaarde is[`Exact`](../precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | EEN[`PrecisionModel`](../precisionmodel/) die zal worden toegepast op Z coordinate wanneer geometrieën worden toegevoegd aan de[`VectorLayer`](../vectorlayer/) of wanneer ze worden voorgelezen uit de[`VectorLayer`](../vectorlayer/) . De standaardwaarde is[`Exact`](../precisionmodel/exact/) . |

### Zie ook

* class [DriverOptions](../driveroptions/)
* naamruimte [Aspose.Gis](../../aspose.gis/)
* montage [Aspose.GIS](../../)


