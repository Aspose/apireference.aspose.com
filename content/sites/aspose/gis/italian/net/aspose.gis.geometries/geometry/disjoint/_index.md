---
title: Geometry.Disjoint
second_title: Riferimento API Aspose.GIS per .NET
description: Geometry metodo. Determina se questa geometria è disgiunta da una geometria specificata.
type: docs
weight: 190
url: /it/net/aspose.gis.geometries/geometry/disjoint/
---
## Geometry.Disjoint method

Determina se questa geometria è disgiunta da una geometria specificata.

```csharp
public bool Disjoint(IGeometry other)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| other | IGeometry | Una geometria. |

### Valore di ritorno

`true` se questa geometria è "spazialmente disgiunta" da un'altra geometria.`false` altrimenti.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null`. |
| ArgumentException | Una delle geometrie non è valida in modo tale che l'operazione non può essere completata. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) delle geometrie non sono equivalenti. Puoi usare[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) per convertire le geometrie nello stesso sistema di riferimento spaziali . |

### Osservazioni

Questo metodo verifica se le geometrie sono disgiunte in termini di matrice di intersezione DE-9IM. Fondamentalmente, verifica che due geometrie non abbiano punti in comune. Questo metodo equivale a: Per ulteriori dettagli su DE-9IM, vedere la specifica delle funzioni semplici di OpenGIS.

```csharp
this.Relate(other, "FF*FF****");
```

### Guarda anche

* method [Intersects](../../igeometry/intersects/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../geometry/)
* assemblea [Aspose.GIS](../../../)


