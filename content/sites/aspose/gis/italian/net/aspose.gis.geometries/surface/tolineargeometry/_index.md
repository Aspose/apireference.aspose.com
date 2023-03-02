---
title: Surface.ToLinearGeometry
second_title: Riferimento API Aspose.GIS per .NET
description: Surface metodo. Ottiene una versione non curva approssimativa o equivalente di questa geometria utilizzando limpostazione predefinitatolleranza .
type: docs
weight: 40
url: /it/net/aspose.gis.geometries/surface/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry_2}

Ottiene una versione non curva approssimativa o equivalente di questa geometria utilizzando l'impostazione predefinita`tolleranza` .

```csharp
public IPolygon ToLinearGeometry()
```

### Valore di ritorno

A[`IPolygon`](../../ipolygon/) che si avvicina o equivale a questo`ISuperficie`. Questo è l'equivalente di[`ToLinearGeometry`](../../isurface/tolineargeometry/) con predefinito`tolleranza` . Predefinito`tolleranza` Il valore di s dipende da[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) di questa geometria:  Per la tolleranza SRS prevista è di 0,001 metri (in unità SRS) Per la tolleranza SRS geografica è`1e-5` gradi (in unità SRS) Per Tolleranza SRS sconosciuta è`1e-5` Per maggiori dettagli su quali trasformazioni vengono applicate fare riferimento a[`ToLinearGeometry`](../../isurface/tolineargeometry/) specifica.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| InvalidOperationException | Questa geometria non è valida in modo tale che l'operazione non può essere completata. |

### Guarda anche

* interface [IPolygon](../../ipolygon/)
* class [Surface](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../surface/)
* assemblea [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_3}

Ottiene una versione non curva approssimativa o equivalente di questa geometria utilizzando l'oggetto specificato`tolleranza` .

```csharp
public IPolygon ToLinearGeometry(double tolerance)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| tolerance | Double | Il`tolleranza`usare. Il risultato è garantito per essere inferiore a`tolleranza` lontano dalla geometria curva, a meno che il numero di punti necessari per linearizzare la geometria non superi il massimo per quadrante, attualmente pari a 10000 punti. |

### Valore di ritorno

A[`IPolygon`](../../ipolygon/) che si avvicina o equivale a questo`ISuperficie` :  Se questo oggetto è[`IPolygon`](../../ipolygon/) stesso il risultato è equivalente a questo oggetto Se questo oggetto non lo è[`IPolygon`](../../ipolygon/) è linearizzato e[`IPolygon`](../../ipolygon/) è creato

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentOutOfRangeException | `tolleranza` è minore o uguale a`0` . |
| InvalidOperationException | Questa geometria non è valida in modo tale che l'operazione non può essere completata. |

### Guarda anche

* interface [IPolygon](../../ipolygon/)
* class [Surface](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../surface/)
* assemblea [Aspose.GIS](../../../)


