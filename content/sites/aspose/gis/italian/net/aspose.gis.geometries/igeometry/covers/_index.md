---
title: IGeometry.Covers
second_title: Riferimento API Aspose.GIS per .NET
description: IGeometry metodo. Determina se questa geometria copre una geometria specificata.
type: docs
weight: 150
url: /it/net/aspose.gis.geometries/igeometry/covers/
---
## IGeometry.Covers method

Determina se questa geometria copre una geometria specificata.

```csharp
public bool Covers(IGeometry other)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| other | IGeometry | Una geometria. |

### Valore di ritorno

`true` se questa geometria "copre spazialmente" un'altra geometria.`false` altrimenti.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null`. |
| ArgumentException | Una delle geometrie non è valida in modo tale che l'operazione non può essere completata. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) delle geometrie non sono equivalenti. Puoi usare[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) per convertire le geometrie nello stesso sistema di riferimento spaziali . |

### Osservazioni

Questo metodo verifica se una geometria ne copre un'altra in termini di matrice di intersezione DE-9IM. Una geometria ne copre un'altra, se la geometria contiene ogni punto di un'altra geometria. Questo metodo è simile a[`SpatiallyContains`](../spatiallycontains/) , ma ritorna`true` più spesso, poiché non distingue tra punti interni e punti di confine. Quindi, se la geometria A giace sul confine di geometria B,[`SpatiallyContains`](../spatiallycontains/) ritorna`false` , mentre questo metodo restituisce`true`. Questo metodo equivale a:

```csharp
this.Relate(other, "T*****FF*") || this.Relate(other, "*T****FF*") || this.Relate(other, "***T**FF*) || this.Relate(other, "***T*FF*");
```

### Guarda anche

* method [SpatiallyContains](../spatiallycontains/)
* method [CoveredBy](../coveredby/)
* interface [IGeometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../igeometry/)
* assemblea [Aspose.GIS](../../../)


