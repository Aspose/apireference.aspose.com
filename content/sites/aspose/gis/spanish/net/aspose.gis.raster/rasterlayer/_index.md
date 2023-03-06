---
title: Class RasterLayer
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.Raster.RasterLayer clase. Representa una capa ráster.
type: docs
weight: 1390
url: /es/net/aspose.gis.raster/rasterlayer/
---
## RasterLayer class

Representa una capa ráster.

```csharp
public abstract class RasterLayer : IDisposable
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| abstract [BandCount](../../aspose.gis.raster/rasterlayer/bandcount/) { get; } | Obtiene el número de bandas en la capa ráster. |
| [Bounds](../../aspose.gis.raster/rasterlayer/bounds/) { get; } | Obtiene los límites del ráster. |
| abstract [CellSize](../../aspose.gis.raster/rasterlayer/cellsize/) { get; } | Obtiene el tamaño de celda o píxel del ráster. |
| abstract [Driver](../../aspose.gis.raster/rasterlayer/driver/) { get; } | Obtiene el[`Driver`](./driver/) que instancia esta capa. |
| abstract [Height](../../aspose.gis.raster/rasterlayer/height/) { get; } | Obtiene la altura del ráster en píxeles. También se conoce como recuento de filas. |
| abstract [NoDataValues](../../aspose.gis.raster/rasterlayer/nodatavalues/) { get; } | Obtiene los valores que representan el fondo o 'sin datos' del ráster. |
| abstract [SpatialReferenceSystem](../../aspose.gis.raster/rasterlayer/spatialreferencesystem/) { get; } | Obtiene un sistema de referencia espacial de raster. Puede ser`null` si es desconocido. |
| abstract [UpperLeftX](../../aspose.gis.raster/rasterlayer/upperleftx/) { get; } | Obtiene la coordenada x de la esquina superior izquierda del ráster. |
| abstract [UpperLeftY](../../aspose.gis.raster/rasterlayer/upperlefty/) { get; } | Obtiene la coordenada y de la esquina superior izquierda del ráster. |
| abstract [Width](../../aspose.gis.raster/rasterlayer/width/) { get; } | Obtiene el ancho del ráster en píxeles. También se le conoce como conteo de columnas. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Crop](../../aspose.gis.raster/rasterlayer/crop/#crop_1)(double[]) | Recorta la capa ráster utilizando una máscara de banda). |
| [Crop](../../aspose.gis.raster/rasterlayer/crop/#crop)(IGeometry, double[]) | Recorta la capa ráster usando una forma de forma (y una máscara de banda). |
| [Dispose](../../aspose.gis.raster/rasterlayer/dispose/)() | Libera los recursos utilizados por el`RasterLayer` . |
| abstract [GetBand](../../aspose.gis.raster/rasterlayer/getband/)(int) | Obtiene una banda por el índice especificado. |
| virtual [GetExtent](../../aspose.gis.raster/rasterlayer/getextent/)() | Calcula una extensión espacial de esta capa. |
| [GetSpatialPoint](../../aspose.gis.raster/rasterlayer/getspatialpoint/)(int, int) | Convierte la columna y la fila especificadas a la coordenada espacial. |
| [GetStatistics](../../aspose.gis.raster/rasterlayer/getstatistics/)(int, bool) | Calcula estadísticas de resumen que consisten en recuento, suma, media, min, max. |
| [GetValues](../../aspose.gis.raster/rasterlayer/getvalues/)(int, int) | Lee los valores en la celda especificada. |
| [GetValuesDump](../../aspose.gis.raster/rasterlayer/getvaluesdump/)(RasterRect) | Lee los valores en el bloque especificado como una matriz de 1 dimensión. |
| [GetValuesOnExpression](../../aspose.gis.raster/rasterlayer/getvaluesonexpression/)(RasterRect, RasterReadExpression) | Lee y procesa valores de banda en una expresión. |
| override [ToString](../../aspose.gis.raster/rasterlayer/tostring/)() | Devuelve una cadena que representa el objeto actual. |
| [Warp](../../aspose.gis.raster/rasterlayer/warp/)(WarpOptions) | Deforma la capa ráster a otra. |

### Ver también

* espacio de nombres [Aspose.Gis.Raster](../../aspose.gis.raster/)
* asamblea [Aspose.GIS](../../)


