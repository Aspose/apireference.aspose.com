---
title: GeoGenerator.ProduceLines
second_title: Riferimento API Aspose.GIS per .NET
description: GeoGenerator metodo. Crea un nuovo enumeratore ILineString con un determinato numero di elementi casuali tutti allinterno di un determinato extent.
type: docs
weight: 10
url: /it/net/aspose.gis.geotools/geogenerator/producelines/
---
## GeoGenerator.ProduceLines method

Crea un nuovo enumeratore ILineString con un determinato numero di elementi casuali, tutti all'interno di un determinato extent.

```csharp
public static IEnumerable<ILineString> ProduceLines(Extent rect, LineGeneratorOptions options)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| rect | Extent | zona specificata (cfr[`Estensione`](../../../aspose.gis/extent/)) |
| options | LineGeneratorOptions | Opzioni di creazione della linea (vedi[`LineGeneratorOpzioni`](../../linegeneratoroptions/)) |

### Valore di ritorno

Array di linee (vedi enumerazione di[`ILineString`](../../../aspose.gis.geometries/ilinestring/))

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentOutOfRangeException | Il numero di righe deve essere maggiore di uno. |
| NullReferenceException | L'estensione deve avere un valore (non essere NULL) |

### Guarda anche

* interface [ILineString](../../../aspose.gis.geometries/ilinestring/)
* class [Extent](../../../aspose.gis/extent/)
* class [LineGeneratorOptions](../../linegeneratoroptions/)
* class [GeoGenerator](../)
* spazio dei nomi [Aspose.Gis.GeoTools](../../geogenerator/)
* assemblea [Aspose.GIS](../../../)


