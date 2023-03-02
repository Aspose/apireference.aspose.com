---
title: Class RasterLayer
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.Raster.RasterLayer classe. Rappresenta un livello raster.
type: docs
weight: 1390
url: /it/net/aspose.gis.raster/rasterlayer/
---
## RasterLayer class

Rappresenta un livello raster.

```csharp
public abstract class RasterLayer : IDisposable
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| abstract [BandCount](../../aspose.gis.raster/rasterlayer/bandcount/) { get; } | Ottiene il numero di bande nel livello raster. |
| [Bounds](../../aspose.gis.raster/rasterlayer/bounds/) { get; } | Ottiene i limiti del raster. |
| abstract [CellSize](../../aspose.gis.raster/rasterlayer/cellsize/) { get; } | Ottiene la dimensione della cella o dei pixel del raster. |
| abstract [Driver](../../aspose.gis.raster/rasterlayer/driver/) { get; } | Ottiene il[`Driver`](./driver/) che ha istanziato questo livello. |
| abstract [Height](../../aspose.gis.raster/rasterlayer/height/) { get; } | Ottiene l'altezza del raster in pixel. Inoltre è noto come conteggio delle righe. |
| abstract [NoDataValues](../../aspose.gis.raster/rasterlayer/nodatavalues/) { get; } | Ottiene i valori che rappresentano lo sfondo o "nessun dato" del raster. |
| abstract [SpatialReferenceSystem](../../aspose.gis.raster/rasterlayer/spatialreferencesystem/) { get; } | Ottiene un sistema di riferimento spaziale raster. Può essere`null` se è sconosciuto. |
| abstract [UpperLeftX](../../aspose.gis.raster/rasterlayer/upperleftx/) { get; } | Ottiene la coordinata x dell'angolo superiore sinistro del raster. |
| abstract [UpperLeftY](../../aspose.gis.raster/rasterlayer/upperlefty/) { get; } | Ottiene la coordinata y dell'angolo superiore sinistro del raster. |
| abstract [Width](../../aspose.gis.raster/rasterlayer/width/) { get; } | Ottiene la larghezza del raster in pixel. Inoltre è noto come conteggio delle colonne. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Crop](../../aspose.gis.raster/rasterlayer/crop/#crop_1)(double[]) | Ritaglia il livello raster utilizzando una maschera di banda). |
| [Crop](../../aspose.gis.raster/rasterlayer/crop/#crop)(IGeometry, double[]) | Ritaglia il livello raster utilizzando una forma (e una maschera di banda). |
| [Dispose](../../aspose.gis.raster/rasterlayer/dispose/)() | Rilascia le risorse utilizzate da`RasterLayer` . |
| abstract [GetBand](../../aspose.gis.raster/rasterlayer/getband/)(int) | Ottiene una banda in base all'indice specificato. |
| virtual [GetExtent](../../aspose.gis.raster/rasterlayer/getextent/)() | Calcola un'estensione spaziale di questo layer. |
| [GetSpatialPoint](../../aspose.gis.raster/rasterlayer/getspatialpoint/)(int, int) | Converte la colonna e la riga specificate nella coordinata spaziale. |
| [GetStatistics](../../aspose.gis.raster/rasterlayer/getstatistics/)(int, bool) | Calcola statistiche riassuntive costituite da conteggio, somma, media, min, max. |
| [GetValues](../../aspose.gis.raster/rasterlayer/getvalues/)(int, int) | Legge i valori nella cella specificata. |
| [GetValuesDump](../../aspose.gis.raster/rasterlayer/getvaluesdump/)(RasterRect) | Legge i valori nel blocco specificato come un array a 1 dimensione. |
| [GetValuesOnExpression](../../aspose.gis.raster/rasterlayer/getvaluesonexpression/)(RasterRect, RasterReadExpression) | Legge ed elabora i valori di banda in un'espressione. |
| override [ToString](../../aspose.gis.raster/rasterlayer/tostring/)() | Restituisce una stringa che rappresenta l'oggetto corrente. |
| [Warp](../../aspose.gis.raster/rasterlayer/warp/)(WarpOptions) | Distorce il livello raster in un altro. |

### Guarda anche

* spazio dei nomi [Aspose.Gis.Raster](../../aspose.gis.raster/)
* assemblea [Aspose.GIS](../../)


