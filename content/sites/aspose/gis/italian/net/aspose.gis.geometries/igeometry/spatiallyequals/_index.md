---
title: IGeometry.SpatiallyEquals
second_title: Riferimento API Aspose.GIS per .NET
description: IGeometry metodo. Determina se questa geometria è spazialmente uguale a una geometria specificata.
type: docs
weight: 320
url: /it/net/aspose.gis.geometries/igeometry/spatiallyequals/
---
## IGeometry.SpatiallyEquals method

Determina se questa geometria è spazialmente uguale a una geometria specificata.

```csharp
public bool SpatiallyEquals(IGeometry other)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| other | IGeometry | Una geometria. |

### Valore di ritorno

`true` se questa geometria "uguale spazialmente" alla geometria specificata.`false` altrimenti.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null`. |
| ArgumentException | Una delle geometrie non è valida in modo tale che l'operazione non può essere completata. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) delle geometrie non sono equivalenti. Puoi usare[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) per convertire le geometrie nello stesso sistema di riferimento spaziali . |

### Osservazioni

Questo metodo verifica l'uguaglianza in termini di matrice di intersezione DE-9IM. Non dipende dall'ordine dei componenti (ad es. ordine degli anelli interni nel poligono), dai valori Z e M. Fondamentalmente, verifica che due geometrie occupino lo stesso "spazio" quando proiettate su uno spazio bidimensionale. Questo metodo equivale a: Per ulteriori dettagli su DE-9IM, vedere la specifica delle funzioni semplici di OpenGIS.

```csharp
this.Relate(other, "T*F**FFF*");
```

### Guarda anche

* interface [IGeometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../igeometry/)
* assemblea [Aspose.GIS](../../../)


