---
title: SpatialReferenceSystemTransformation.Transform
second_title: Riferimento API Aspose.GIS per .NET
description: SpatialReferenceSystemTransformation metodo. Trasforma la geometria dal sistema di riferimento spaziale di origine al sistema di riferimento spaziale di destinazione.
type: docs
weight: 40
url: /it/net/aspose.gis.spatialreferencing/spatialreferencesystemtransformation/transform/
---
## SpatialReferenceSystemTransformation.Transform method

Trasforma la geometria dal sistema di riferimento spaziale di origine al sistema di riferimento spaziale di destinazione.

```csharp
public Geometry Transform(IGeometry geometry)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| geometry | IGeometry | Geometria da trasformare. |

### Valore di ritorno

Nuova geometria nel sistema di riferimento spaziale target.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | La geometria è`null` . |
| ArgumentException | Geometrie[`SpatialReferenceSystem`](../../../aspose.gis.geometries/igeometry/spatialreferencesystem/) non è`null` e non equivale a [`Source`](../source/) |
| [TransformationException](../../transformationexception/) | Trasformazione fallita. |

### Guarda anche

* class [Geometry](../../../aspose.gis.geometries/geometry/)
* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [SpatialReferenceSystemTransformation](../)
* spazio dei nomi [Aspose.Gis.SpatialReferencing](../../spatialreferencesystemtransformation/)
* assemblea [Aspose.GIS](../../../)


