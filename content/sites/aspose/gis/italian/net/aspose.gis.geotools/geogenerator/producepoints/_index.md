---
title: GeoGenerator.ProducePoints
second_title: Riferimento API Aspose.GIS per .NET
description: GeoGenerator metodo. Crea un array di punti appartenenti allarea specificata.
type: docs
weight: 20
url: /it/net/aspose.gis.geotools/geogenerator/producepoints/
---
## GeoGenerator.ProducePoints method

Crea un array di punti appartenenti all'area specificata.

```csharp
public static IEnumerable<IGeometry> ProducePoints(Extent rect, PointGeneratorOptions options)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| rect | Extent | zona specificata (cfr[`Estensione`](../../../aspose.gis/extent/)). |
| options | PointGeneratorOptions | Opzioni di creazione punti (vedi[`Opzioni di PointGenerator`](../../pointgeneratoroptions/)). |

### Valore di ritorno

Array di punti (vedi enumerazione di[`Geometria`](../../../aspose.gis.geometries/igeometry/)).

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentOutOfRangeException | Il numero di punti deve essere maggiore di uno. |
| NullReferenceException | L'estensione deve avere un valore (non essere NULL). |

### Guarda anche

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../../../aspose.gis/extent/)
* class [PointGeneratorOptions](../../pointgeneratoroptions/)
* class [GeoGenerator](../)
* spazio dei nomi [Aspose.Gis.GeoTools](../../geogenerator/)
* assemblea [Aspose.GIS](../../../)


