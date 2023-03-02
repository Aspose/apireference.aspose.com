---
title: VectorLayer.NearestTo
second_title: Riferimento API Aspose.GIS per .NET
description: VectorLayer metodo. Ottiene lelemento più vicino alla coordinata fornita.
type: docs
weight: 150
url: /it/net/aspose.gis/vectorlayer/nearestto/
---
## NearestTo(double, double) {#nearestto_1}

Ottiene l'elemento più vicino alla coordinata fornita.

```csharp
public Feature NearestTo(double x, double y)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | Double | X della coordinata. |
| y | Double | Y della coordinata. |

### Valore di ritorno

L'elemento più vicino alla coordinata fornita.

### Guarda anche

* class [Feature](../../feature/)
* class [VectorLayer](../)
* spazio dei nomi [Aspose.Gis](../../vectorlayer/)
* assemblea [Aspose.GIS](../../../)

---

## NearestTo(IPoint) {#nearestto}

Ottiene la feature più vicina al punto fornito.

```csharp
public Feature NearestTo(IPoint point)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| point | IPoint | Il punto. |

### Valore di ritorno

L'elemento più vicino al punto fornito.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il punto è`null`. |
| ArgumentException | Il punto è vuoto o non valido. |

### Guarda anche

* class [Feature](../../feature/)
* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [VectorLayer](../)
* spazio dei nomi [Aspose.Gis](../../vectorlayer/)
* assemblea [Aspose.GIS](../../../)


