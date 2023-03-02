---
title: GeoGenerator.ProducePolygons
second_title: Riferimento API Aspose.GIS per .NET
description: GeoGenerator metodo. Crea un nuovo IPolygon Enumerator con un dato numero di elementi casuali tutti entro una data estensione.
type: docs
weight: 30
url: /it/net/aspose.gis.geotools/geogenerator/producepolygons/
---
## GeoGenerator.ProducePolygons method

Crea un nuovo IPolygon Enumerator con un dato numero di elementi casuali, tutti entro una data estensione.

```csharp
public static IEnumerable<IPolygon> ProducePolygons(Extent rect, PolygonGeneratorOptions options)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| rect | Extent | zona specificata (cfr[`Estensione`](../../../aspose.gis/extent/)) |
| options | PolygonGeneratorOptions | Opzioni di creazione del poligono (vedi[`Opzioni PolygonGenerator`](../../polygongeneratoroptions/)) |

### Valore di ritorno

Array di poligoni (vedi enumerazione di[`IPolygon`](../../../aspose.gis.geometries/ipolygon/))

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentOutOfRangeException | Il numero di poligoni deve essere maggiore di uno. |
| NullReferenceException | L'estensione deve avere un valore (non essere NULL) |
| ArgumentException | Le lunghezze minima e massima devono essere diverse e maggiori di 0 |
| ArgumentException | La lunghezza massima deve essere maggiore della minima |

### Guarda anche

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [PolygonGeneratorOptions](../../polygongeneratoroptions/)
* class [GeoGenerator](../)
* spazio dei nomi [Aspose.Gis.GeoTools](../../geogenerator/)
* assemblea [Aspose.GIS](../../../)


