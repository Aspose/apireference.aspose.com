---
title: IGeometry.Overlaps
second_title: Riferimento API Aspose.GIS per .NET
description: IGeometry metodo. Determina se questa geometria si sovrappone a una geometria specificata.
type: docs
weight: 280
url: /it/net/aspose.gis.geometries/igeometry/overlaps/
---
## IGeometry.Overlaps method

Determina se questa geometria si sovrappone a una geometria specificata.

```csharp
public bool Overlaps(IGeometry other)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| other | IGeometry | Una geometria. |

### Valore di ritorno

`true` se questa geometria è "sovrapposta spazialmente" a un'altra geometria.`false` altrimenti.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null`. |
| ArgumentException | Una delle geometrie non è valida in modo tale che l'operazione non può essere completata. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) delle geometrie non sono equivalenti. Puoi usare[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) per convertire le geometrie nello stesso sistema di riferimento spaziali . |

### Osservazioni

Questo metodo verifica se le geometrie sono sovrapposizioni in termini di matrice di intersezione DE-9IM. Due geometrie si sovrappongono se hanno alcuni ma non tutti i punti interni in comune e l'intersezione delle geometrie ha la stessa dimensione delle geometrie stesse. Per duePoint geometrie o dueSurface geometrie this metodo è equivalente a: Per dueLine geometrie questo metodo equivale a: Per due geometrie non uguali[`Dimension`](../dimension/) questo metodo restituisce sempre`false`. Vedere OpenGIS Simple Features Specification per maggiori dettagli su DE-9IM e sulla relazione di "sovrapposizione spaziale".

```csharp
this.Relate(other, "T*T***T**");
```

```csharp
this.Relate(other, "1*T***T**");
```

### Guarda anche

* interface [IGeometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../igeometry/)
* assemblea [Aspose.GIS](../../../)


