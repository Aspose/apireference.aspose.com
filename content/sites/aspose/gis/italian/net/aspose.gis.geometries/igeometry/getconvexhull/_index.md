---
title: IGeometry.GetConvexHull
second_title: Riferimento API Aspose.GIS per .NET
description: IGeometry metodo. Calcola lo scafo convesso di questa geometria.
type: docs
weight: 220
url: /it/net/aspose.gis.geometries/igeometry/getconvexhull/
---
## IGeometry.GetConvexHull method

Calcola lo scafo convesso di questa geometria.

```csharp
public IGeometry GetConvexHull()
```

### Valore di ritorno

Una geometria che rappresenta uno scafo convesso di questa geometria. Se questa geometria non ha punti, il risultato è[`Null`](../../geometry/null/) . Se questa geometria ha solo un punto, il risultato è questo punto. Se questa geometria ha solo due punti, il risultato è[`ILineString`](../../ilinestring/) con i punti. Se questa geometria ha tre o più punti, il risultato è[`ILinearRing`](../../ilinearring/) che rappresenta uno scafo convesso attorno a tutti i punti delle geometrie.

### Guarda anche

* interface [IGeometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../igeometry/)
* assemblea [Aspose.GIS](../../../)


