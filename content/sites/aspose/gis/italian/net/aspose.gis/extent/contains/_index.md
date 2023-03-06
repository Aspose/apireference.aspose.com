---
title: Extent.Contains
second_title: Riferimento API Aspose.GIS per .NET
description: Extent metodo. Determina se questa estensione contiene una coordinata definita dagli argomenti.
type: docs
weight: 120
url: /it/net/aspose.gis/extent/contains/
---
## Contains(double, double) {#contains_2}

Determina se questa estensione contiene una coordinata definita dagli argomenti.

```csharp
public bool Contains(double x, double y)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | Double | X della coordinata. |
| y | Double | Y della coordinata. |

### Valore di ritorno

Valore, che indica se la coordinata è all'interno del riquadro di delimitazione.

### Osservazioni

Coordinate situate ai limiti di questo[`Extent`](../) are considerato contenuto da questo[`Extent`](../) .

### Guarda anche

* class [Extent](../)
* spazio dei nomi [Aspose.Gis](../../extent/)
* assemblea [Aspose.GIS](../../../)

---

## Contains(Extent) {#contains}

Determina se questo extent contiene l'argomento.

```csharp
public bool Contains(Extent extent)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| extent | Extent | Un'altra misura. |

### Valore di ritorno

Valore, che indica se questa estensione contiene l'argomento.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) di questa portata e l'argomento non lo sono entrambi`null` e non uguali tra loro. |

### Osservazioni

Coordinate situate ai limiti di questo[`Extent`](../) are considerato contenuto da questo[`Extent`](../) . Per questo motivo si considera che estensioni uguali si contengano a vicenda.

### Guarda anche

* class [Extent](../)
* spazio dei nomi [Aspose.Gis](../../extent/)
* assemblea [Aspose.GIS](../../../)

---

## Contains(IGeometry) {#contains_1}

Determina se questo extent contiene l'argomento.

```csharp
public bool Contains(IGeometry geometry)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| geometry | IGeometry | Una geometria da testare per il contenimento. |

### Valore di ritorno

Valore, che indica se questa estensione contiene l'argomento.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) di questa portata e l'argomento non lo sono entrambi`null` e non uguali tra loro. |

### Osservazioni

Coordinate situate ai limiti di questo[`Extent`](../) are considerato contenuto da questo[`Extent`](../) .

### Guarda anche

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../)
* spazio dei nomi [Aspose.Gis](../../extent/)
* assemblea [Aspose.GIS](../../../)


