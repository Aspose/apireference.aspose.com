---
title: Geometry.Touches
second_title: Riferimento API Aspose.GIS per .NET
description: Geometry metodo. Determina se questa geometria e una geometria specificata si toccano.
type: docs
weight: 420
url: /it/net/aspose.gis.geometries/geometry/touches/
---
## Geometry.Touches method

Determina se questa geometria e una geometria specificata si toccano.

```csharp
public bool Touches(IGeometry other)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| other | IGeometry | Una geometria. |

### Valore di ritorno

`true` se questa geometria "tocca spazialmente" un'altra geometria.`false` altrimenti.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null`. |
| ArgumentException | Una delle geometrie non è valida in modo tale che l'operazione non può essere completata. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) delle geometrie non sono equivalenti. Puoi usare[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) per convertire le geometrie nello stesso sistema di riferimento spaziali . |

### Osservazioni

Questo metodo verifica se le geometrie si toccano in termini di matrice di intersezione DE-9IM. Due geometrie si toccano se hanno almeno un punto di confine in comune, ma nessun punto interno. Cioè: due[`LineString`](../../linestring/)Si toccano se condividono un punto finale, ma non condividono un segmento, due poligoni si toccano se condividono parte dell'anello esterno o interno, ma i loro interni non si sovrappongono. Questo metodo equivale a: Vedere OpenGIS Simple Features Specification per maggiori dettagli su DE-9IM e la relazione "tocchi spaziali".

```csharp
this.Relate(other, "FT*******") || this.Relate(other, "F**T*****") || this.Relate(other, "F***T****");
```

### Guarda anche

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../geometry/)
* assemblea [Aspose.GIS](../../../)


