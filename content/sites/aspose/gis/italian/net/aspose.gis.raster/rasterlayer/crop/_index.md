---
title: RasterLayer.Crop
second_title: Riferimento API Aspose.GIS per .NET
description: RasterLayer metodo. Ritaglia il livello raster utilizzando una forma e una maschera di banda.
type: docs
weight: 110
url: /it/net/aspose.gis.raster/rasterlayer/crop/
---
## Crop(IGeometry, double[]) {#crop}

Ritaglia il livello raster utilizzando una forma (e una maschera di banda).

```csharp
public RasterLayer Crop(IGeometry geometry, double[] masks = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| geometry | IGeometry | La geometria rappresentava la forma della forma. |
| masks | Double[] | Maschera per il livello di ritaglio |

### Valore di ritorno

Il livello raster ritagliato. Se non vengono trovati incroci, ritorna`null`.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento non può essere nullo. Nome del parametro: geometria. |
| NotSupportedException | L'argomento non può essere diverso dal poligono o dalla superficie. Nome del parametro: geometria. |
| InvalidOperationException | Il livello originale non può essere un altro CropRasterLayer. |
| [GisException](../../../aspose.gis/gisexception/) | Errore durante il ritaglio del livello. |

### Guarda anche

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [RasterLayer](../)
* spazio dei nomi [Aspose.Gis.Raster](../../rasterlayer/)
* assemblea [Aspose.GIS](../../../)

---

## Crop(double[]) {#crop_1}

Ritaglia il livello raster utilizzando una maschera di banda).

```csharp
public RasterLayer Crop(double[] masks)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| masks | Double[] | Maschera per il livello di ritaglio |

### Valore di ritorno

Il livello raster ritagliato. Se non vengono trovati incroci, ritorna`null`.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| InvalidOperationException |  |

### Guarda anche

* class [RasterLayer](../)
* spazio dei nomi [Aspose.Gis.Raster](../../rasterlayer/)
* assemblea [Aspose.GIS](../../../)


