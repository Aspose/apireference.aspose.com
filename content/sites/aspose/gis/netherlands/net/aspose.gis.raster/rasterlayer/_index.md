---
title: Class RasterLayer
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.Raster.RasterLayer klas. Vertegenwoordigt een rasterlaag.
type: docs
weight: 1390
url: /nl/net/aspose.gis.raster/rasterlayer/
---
## RasterLayer class

Vertegenwoordigt een rasterlaag.

```csharp
public abstract class RasterLayer : IDisposable
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| abstract [BandCount](../../aspose.gis.raster/rasterlayer/bandcount/) { get; } | Krijgt het aantal banden in de rasterlaag. |
| [Bounds](../../aspose.gis.raster/rasterlayer/bounds/) { get; } | Haalt de rastergrenzen op. |
| abstract [CellSize](../../aspose.gis.raster/rasterlayer/cellsize/) { get; } | Haalt de cel- of pixelgrootte van het raster op. |
| abstract [Driver](../../aspose.gis.raster/rasterlayer/driver/) { get; } | Krijgt de[`Driver`](./driver/) die deze laag heeft geïnstantieerd. |
| abstract [Height](../../aspose.gis.raster/rasterlayer/height/) { get; } | Krijgt de hoogte van het raster in pixels. Het staat ook bekend als het aantal rijen. |
| abstract [NoDataValues](../../aspose.gis.raster/rasterlayer/nodatavalues/) { get; } | Haalt de waarden op die de achtergrond of 'geen gegevens' van het raster vertegenwoordigen. |
| abstract [SpatialReferenceSystem](../../aspose.gis.raster/rasterlayer/spatialreferencesystem/) { get; } | Krijgt een ruimtelijk referentiesysteem van raster. Kan zijn`null` als het onbekend is. |
| abstract [UpperLeftX](../../aspose.gis.raster/rasterlayer/upperleftx/) { get; } | Krijgt de x-coördinaat van de linkerbovenhoek van het raster. |
| abstract [UpperLeftY](../../aspose.gis.raster/rasterlayer/upperlefty/) { get; } | Krijgt de y-coördinaat van de linkerbovenhoek van het raster. |
| abstract [Width](../../aspose.gis.raster/rasterlayer/width/) { get; } | Krijgt de breedte van het raster in pixels. Het staat ook bekend als het aantal kolommen. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Crop](../../aspose.gis.raster/rasterlayer/crop/#crop_1)(double[]) | Snijdt de rasterlaag bij met behulp van een bandmasker). |
| [Crop](../../aspose.gis.raster/rasterlayer/crop/#crop)(IGeometry, double[]) | Snijdt de rasterlaag bij met behulp van een vormvorm (en bandmasker). |
| [Dispose](../../aspose.gis.raster/rasterlayer/dispose/)() | Geeft de bronnen vrij die worden gebruikt door de`RasterLayer` . |
| abstract [GetBand](../../aspose.gis.raster/rasterlayer/getband/)(int) | Haalt een band op volgens de opgegeven index. |
| virtual [GetExtent](../../aspose.gis.raster/rasterlayer/getextent/)() | Berekent een ruimtelijke omvang van deze laag. |
| [GetSpatialPoint](../../aspose.gis.raster/rasterlayer/getspatialpoint/)(int, int) | Converteert de opgegeven kolom en rij naar de ruimtelijke coördinaat. |
| [GetStatistics](../../aspose.gis.raster/rasterlayer/getstatistics/)(int, bool) | Bereken samenvattende statistieken bestaande uit telling, som, gemiddelde, min, max. |
| [GetValues](../../aspose.gis.raster/rasterlayer/getvalues/)(int, int) | Leest de waarden in de opgegeven cel. |
| [GetValuesDump](../../aspose.gis.raster/rasterlayer/getvaluesdump/)(RasterRect) | Leest de waarden in het gespecificeerde blok als een 1-dimensionale array. |
| [GetValuesOnExpression](../../aspose.gis.raster/rasterlayer/getvaluesonexpression/)(RasterRect, RasterReadExpression) | Leest en verwerkt bandwaarden in een uitdrukking. |
| override [ToString](../../aspose.gis.raster/rasterlayer/tostring/)() | Retourneert een tekenreeks die het huidige object vertegenwoordigt. |
| [Warp](../../aspose.gis.raster/rasterlayer/warp/)(WarpOptions) | Vervormt de rasterlaag naar een andere. |

### Zie ook

* naamruimte [Aspose.Gis.Raster](../../aspose.gis.raster/)
* montage [Aspose.GIS](../../)


