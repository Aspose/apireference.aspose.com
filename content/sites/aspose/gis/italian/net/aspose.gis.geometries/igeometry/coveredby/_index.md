---
title: IGeometry.CoveredBy
second_title: Riferimento API Aspose.GIS per .NET
description: IGeometry metodo. Determina se questa geometria è coperta da una geometria specificata.
type: docs
weight: 140
url: /it/net/aspose.gis.geometries/igeometry/coveredby/
---
## IGeometry.CoveredBy method

Determina se questa geometria è coperta da una geometria specificata.

```csharp
public bool CoveredBy(IGeometry other)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| other | IGeometry | Una geometria. |

### Valore di ritorno

`true`se questa geometria è "spazialmente coperta da" un'altra geometria.`false` altrimenti.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null`. |
| ArgumentException | Una delle geometrie non è valida in modo tale che l'operazione non può essere completata. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) delle geometrie non sono equivalenti. Puoi usare[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) per convertire le geometrie nello stesso sistema di riferimento spaziali . |

### Osservazioni

Questo metodo verifica se una geometria è coperta da un'altra in termini di matrice di intersezione DE-9IM. Questo metodo equivale a:

```csharp
other.Covers(this);
```

### Guarda anche

* method [SpatiallyContains](../spatiallycontains/)
* method [Covers](../covers/)
* interface [IGeometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../igeometry/)
* assemblea [Aspose.GIS](../../../)


