---
title: RasterLayer.GetSpatialPoint
second_title: Riferimento API Aspose.GIS per .NET
description: RasterLayer metodo. Converte la colonna e la riga specificate nella coordinata spaziale.
type: docs
weight: 150
url: /it/net/aspose.gis.raster/rasterlayer/getspatialpoint/
---
## RasterLayer.GetSpatialPoint method

Converte la colonna e la riga specificate nella coordinata spaziale.

```csharp
public IPoint GetSpatialPoint(int cellX, int cellY)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| cellX | Int32 | Il valore per la colonna (coordinata x). La numerazione parte da 0. |
| cellY | Int32 | Il valore per la riga (coordinata y). La numerazione parte da 0. |

### Valore di ritorno

Restituisce la coordinata x dell'angolo superiore sinistro date una colonna e una riga.

### Osservazioni

Se uno dei parametri viene passato al di fuori dell'intervallo della rispettiva dimensione del raster, restituirà le coordinate al di fuori del raster supponendo che la griglia del raster sia applicabile al di fuori dei limiti del raster.

### Guarda anche

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [RasterLayer](../)
* spazio dei nomi [Aspose.Gis.Raster](../../rasterlayer/)
* assemblea [Aspose.GIS](../../../)


