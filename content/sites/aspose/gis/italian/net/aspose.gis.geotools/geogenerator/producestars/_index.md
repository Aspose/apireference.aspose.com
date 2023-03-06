---
title: GeoGenerator.ProduceStars
second_title: Riferimento API Aspose.GIS per .NET
description: GeoGenerator metodo. Crea una serie di stelle tutte entro una data estensione.
type: docs
weight: 40
url: /it/net/aspose.gis.geotools/geogenerator/producestars/
---
## GeoGenerator.ProduceStars method

Crea una serie di stelle, tutte entro una data estensione.

```csharp
public static IEnumerable<IPolygon> ProduceStars(Extent rect, StarGeneratorOptions options)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| rect | Extent | zona specificata (cfr[`Estensione`](../../../aspose.gis/extent/)) |
| options | StarGeneratorOptions | Opzioni di creazione del poligono (vedi[`Opzioni StarGenerator`](../../stargeneratoroptions/)) |

### Valore di ritorno

Schiera di stelle (vedi enumerazione di[`IPolygon`](../../../aspose.gis.geometries/ipolygon/))

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentOutOfRangeException | Il numero di stelle deve essere maggiore di uno. |
| NullReferenceException | L'estensione deve avere un valore (non essere NULL) |
| ArgumentException | Le lunghezze minima e massima devono essere diverse e maggiori di 3 |
| ArgumentException | La lunghezza massima deve essere maggiore della minima |

### Guarda anche

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [StarGeneratorOptions](../../stargeneratoroptions/)
* class [GeoGenerator](../)
* spazio dei nomi [Aspose.Gis.GeoTools](../../geogenerator/)
* assemblea [Aspose.GIS](../../../)


