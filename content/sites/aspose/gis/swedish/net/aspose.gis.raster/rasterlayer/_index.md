---
title: Class RasterLayer
second_title: Aspose.GIS för .NET API Referens
description: Aspose.Gis.Raster.RasterLayer klass. Representerar ett rasterlager.
type: docs
weight: 1390
url: /sv/net/aspose.gis.raster/rasterlayer/
---
## RasterLayer class

Representerar ett rasterlager.

```csharp
public abstract class RasterLayer : IDisposable
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| abstract [BandCount](../../aspose.gis.raster/rasterlayer/bandcount/) { get; } | Hämtar antalet band i rasterlagret. |
| [Bounds](../../aspose.gis.raster/rasterlayer/bounds/) { get; } | Får rastergränserna. |
| abstract [CellSize](../../aspose.gis.raster/rasterlayer/cellsize/) { get; } | Hämtar cell- eller pixelstorlek för rastret. |
| abstract [Driver](../../aspose.gis.raster/rasterlayer/driver/) { get; } | Får[`Driver`](./driver/) som instansierade det här lagret. |
| abstract [Height](../../aspose.gis.raster/rasterlayer/height/) { get; } | Hämtar höjden på rastret i pixlar. Det är också känt som radräkning. |
| abstract [NoDataValues](../../aspose.gis.raster/rasterlayer/nodatavalues/) { get; } | Hämtar värdena som representerar bakgrund eller "ingen data" för rastret. |
| abstract [SpatialReferenceSystem](../../aspose.gis.raster/rasterlayer/spatialreferencesystem/) { get; } | Får ett rumsligt referenssystem av raster. Kan vara`null` om det är okänt. |
| abstract [UpperLeftX](../../aspose.gis.raster/rasterlayer/upperleftx/) { get; } | Får x-koordinaten för rastrets övre vänstra hörn. |
| abstract [UpperLeftY](../../aspose.gis.raster/rasterlayer/upperlefty/) { get; } | Får y-koordinaten för rastrets övre vänstra hörn. |
| abstract [Width](../../aspose.gis.raster/rasterlayer/width/) { get; } | Hämtar rastrets bredd i pixlar. Det är också känt som kolumnräkning. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Crop](../../aspose.gis.raster/rasterlayer/crop/#crop_1)(double[]) | Beskär rasterlagret med en bandmask). |
| [Crop](../../aspose.gis.raster/rasterlayer/crop/#crop)(IGeometry, double[]) | Beskär rasterlagret med en formform (och bandmask). |
| [Dispose](../../aspose.gis.raster/rasterlayer/dispose/)() | Frigör resurserna som används av`RasterLayer` . |
| abstract [GetBand](../../aspose.gis.raster/rasterlayer/getband/)(int) | Får ett band med angivet index. |
| virtual [GetExtent](../../aspose.gis.raster/rasterlayer/getextent/)() | Beräknar en rumslig utsträckning av detta lager. |
| [GetSpatialPoint](../../aspose.gis.raster/rasterlayer/getspatialpoint/)(int, int) | Konverterar den angivna kolumnen och raden till den rumsliga koordinaten. |
| [GetStatistics](../../aspose.gis.raster/rasterlayer/getstatistics/)(int, bool) | Beräkna sammanfattande statistik som består av antal, summa, medelvärde, min, max. |
| [GetValues](../../aspose.gis.raster/rasterlayer/getvalues/)(int, int) | Läser värdena i den angivna cellen. |
| [GetValuesDump](../../aspose.gis.raster/rasterlayer/getvaluesdump/)(RasterRect) | Läser värdena i det angivna blocket som en 1-dimensionell array. |
| [GetValuesOnExpression](../../aspose.gis.raster/rasterlayer/getvaluesonexpression/)(RasterRect, RasterReadExpression) | Läser och bearbetar bandvärden i ett uttryck. |
| override [ToString](../../aspose.gis.raster/rasterlayer/tostring/)() | Returnerar en sträng som representerar det aktuella objektet. |
| [Warp](../../aspose.gis.raster/rasterlayer/warp/)(WarpOptions) | Förvränger rasterlagret till ett annat. |

### Se även

* namnutrymme [Aspose.Gis.Raster](../../aspose.gis.raster/)
* hopsättning [Aspose.GIS](../../)


