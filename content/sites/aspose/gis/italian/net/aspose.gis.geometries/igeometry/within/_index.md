---
title: IGeometry.Within
second_title: Riferimento API Aspose.GIS per .NET
description: IGeometry metodo. Determina se questa geometria si trova allinterno di unestensione specificata.
type: docs
weight: 380
url: /it/net/aspose.gis.geometries/igeometry/within/
---
## Within(Extent) {#within}

Determina se questa geometria si trova all'interno di un'estensione specificata.

```csharp
public bool Within(Extent extent)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| extent | Extent | La misura. |

### Valore di ritorno

`true` se questa geometria è all'interno dell'estensione;`false` altrimenti.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null`. |

### Guarda anche

* method [Contains](../../../aspose.gis/extent/contains/)
* class [Extent](../../../aspose.gis/extent/)
* interface [IGeometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../igeometry/)
* assemblea [Aspose.GIS](../../../)

---

## Within(IGeometry) {#within_1}

Determina se questa geometria si trova all'interno di una geometria specificata.

```csharp
public bool Within(IGeometry other)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| other | IGeometry | Una geometria. |

### Valore di ritorno

`true` se questa geometria è "spazialmente all'interno" di un'altra geometria.`false` altrimenti.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null`. |
| ArgumentException | Una delle geometrie non è valida in modo tale che l'operazione non può essere completata. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) delle geometrie non sono equivalenti. Puoi usare[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) per convertire le geometrie nello stesso sistema di riferimento spaziali . |

### Osservazioni

Questo metodo verifica se una geometria è all'interno di un'altra in termini di matrice di intersezione DE-9IM. Una geometria è all'interno di un'altra, se un'altra geometria contiene tutti i punti della geometria e gli interni delle geometrie si intersecano. Questo metodo equivale a: Vedere OpenGIS Simple Features Specification per maggiori dettagli su DE-9IM e la relazione "spazialmente all'interno".

```csharp
this.Relate(other, "T*F**F***");
```

### Guarda anche

* method [SpatiallyContains](../spatiallycontains/)
* method [CoveredBy](../coveredby/)
* interface [IGeometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../igeometry/)
* assemblea [Aspose.GIS](../../../)


