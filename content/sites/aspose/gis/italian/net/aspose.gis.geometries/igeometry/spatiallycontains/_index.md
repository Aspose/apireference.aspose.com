---
title: IGeometry.SpatiallyContains
second_title: Riferimento API Aspose.GIS per .NET
description: IGeometry metodo. Determina se questa geometria contiene spazialmente una geometria specificata.
type: docs
weight: 310
url: /it/net/aspose.gis.geometries/igeometry/spatiallycontains/
---
## IGeometry.SpatiallyContains method

Determina se questa geometria contiene spazialmente una geometria specificata.

```csharp
public bool SpatiallyContains(IGeometry other)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| other | IGeometry | Una geometria. |

### Valore di ritorno

`true`se questa geometria è "contiene spazialmente" un'altra geometria.`false` altrimenti.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null`. |
| ArgumentException | Una delle geometrie non è valida in modo tale che l'operazione non può essere completata. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) delle geometrie non sono equivalenti. Puoi usare[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) per convertire le geometrie nello stesso sistema di riferimento spaziali . |

### Osservazioni

Questo metodo verifica se una geometria ne contiene un'altra in termini di matrice di intersezione DE-9IM. Questo metodo equivale a:

```csharp
other.Within(this);
```

### Guarda anche

* method [Within](../within/)
* method [Covers](../covers/)
* interface [IGeometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../igeometry/)
* assemblea [Aspose.GIS](../../../)


