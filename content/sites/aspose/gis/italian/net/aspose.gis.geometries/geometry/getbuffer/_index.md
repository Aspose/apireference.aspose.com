---
title: Geometry.GetBuffer
second_title: Riferimento API Aspose.GIS per .NET
description: Geometry metodo. Calcola una regione buffer attorno a questa geometria.
type: docs
weight: 210
url: /it/net/aspose.gis.geometries/geometry/getbuffer/
---
## Geometry.GetBuffer method

Calcola una regione buffer attorno a questa geometria.

```csharp
public IGeometry GetBuffer(double distance, int quadrantSegments = 30)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| distance | Double | La larghezza della regione del buffer. |
| quadrantSegments | Int32 | Numero di segmenti utilizzati per approssimare un grado di curvatura di 90. Maggiore è questo numero, migliore sarà l'approssimazione delle curve prodotta. Il valore predefinito è 30. |

### Valore di ritorno

Una geometria che rappresenta tutti i punti che si trovano entro una distanza specificata da questa geometria. Il tipo di risultato è o[`Null`](../null/) ,[`IPolygon`](../../ipolygon/) O[`IMultiPolygon`](../../imultipolygon/) .

### Eccezioni

| eccezione | condizione |
| --- | --- |
| InvalidOperationException | Questa geometria non è valida in modo tale che l'operazione non può essere completata. |
| ArgumentOutOfRangeException | I segmenti del quadrante sono minori o uguali a 0. |

### Guarda anche

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../geometry/)
* assemblea [Aspose.GIS](../../../)


