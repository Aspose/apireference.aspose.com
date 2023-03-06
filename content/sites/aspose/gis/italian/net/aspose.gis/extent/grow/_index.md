---
title: Extent.Grow
second_title: Riferimento API Aspose.GIS per .NET
description: Extent metodo. Aumenta questa estensione in modo da includere largomento.
type: docs
weight: 160
url: /it/net/aspose.gis/extent/grow/
---
## Grow(Extent) {#grow}

Aumenta questa estensione in modo da includere l'argomento.

```csharp
public void Grow(Extent extent)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| extent | Extent | Altra misura. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) di questa portata e l'argomento non lo sono entrambi`null` e non uguali tra loro. |

### Osservazioni

Se[`SpatialReferenceSystem`](../spatialreferencesystem/) di questo SRS è`null` quindi viene aggiornato con SRS dell'argomento.

### Guarda anche

* class [Extent](../)
* spazio dei nomi [Aspose.Gis](../../extent/)
* assemblea [Aspose.GIS](../../../)

---

## Grow(double, double) {#grow_1}

Aumenta questa estensione in modo da includere il punto specificato.

```csharp
public void Grow(double x, double y)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | Double | Coordinata X da includere. |
| y | Double | Coordinata Y da includere. |

### Guarda anche

* class [Extent](../)
* spazio dei nomi [Aspose.Gis](../../extent/)
* assemblea [Aspose.GIS](../../../)


