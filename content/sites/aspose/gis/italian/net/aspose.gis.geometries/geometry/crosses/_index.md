---
title: Geometry.Crosses
second_title: Riferimento API Aspose.GIS per .NET
description: Geometry metodo. Determina se questa geometria e una geometria specificata si incrociano.
type: docs
weight: 170
url: /it/net/aspose.gis.geometries/geometry/crosses/
---
## Geometry.Crosses method

Determina se questa geometria e una geometria specificata si incrociano.

```csharp
public bool Crosses(IGeometry other)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| other | IGeometry | Una geometria. |

### Valore di ritorno

`true` se questa geometria "attraversa spazialmente" un'altra geometria.`false` altrimenti.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null`. |
| ArgumentException | Una delle geometrie non è valida in modo tale che l'operazione non può essere completata. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) delle geometrie non sono equivalenti. Puoi usare[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) per convertire le geometrie nello stesso sistema di riferimento spaziali . |

### Osservazioni

Questo metodo verifica se le geometrie sono incroci in termini di matrice di intersezione DE-9IM. Due geometrie si incrociano se hanno alcuni ma non tutti i punti interni in comune e la dimensione dell'intersezione è minore della dimensione di almeno uno dei geometrie. Ovvero: due[`LineString`](../../linestring/) s croce, se formano una lettera 'X', una LineString e a[`Polygon`](../../polygon/) croce se LineString passa attraverso l'interno di un poligono. Vedi OpenGIS Simple Features Specification per maggiori dettagli su DE-9IM e la relazione "spazially crosses".

### Guarda anche

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../geometry/)
* assemblea [Aspose.GIS](../../../)


