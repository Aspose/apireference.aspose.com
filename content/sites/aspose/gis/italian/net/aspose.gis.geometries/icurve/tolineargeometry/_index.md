---
title: ICurve.ToLinearGeometry
second_title: Riferimento API Aspose.GIS per .NET
description: ICurve metodo. Ottiene una versione non curva approssimativa o equivalente di questa geometria utilizzando limpostazione predefinitatolleranza .
type: docs
weight: 50
url: /it/net/aspose.gis.geometries/icurve/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry}

Ottiene una versione non curva approssimativa o equivalente di questa geometria utilizzando l'impostazione predefinita`tolleranza` .

```csharp
public ILineString ToLinearGeometry()
```

### Valore di ritorno

A[`ILineString`](../../ilinestring/) che si avvicina o è equivalente a questa curva. Questo è l'equivalente di`ToLinearGeometry` con predefinito`tolleranza` . Predefinito`tolleranza` Il valore di s dipende da[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) di questa geometria:  Per la tolleranza SRS prevista è di 0,001 metri (in unità SRS) Per la tolleranza SRS geografica è`1e-5` gradi (in unità SRS) Per Tolleranza SRS sconosciuta è`1e-5` Per maggiori dettagli su quali trasformazioni vengono applicate fare riferimento a`ToLinearGeometry` specifica.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| InvalidOperationException | Questa geometria non è valida in modo tale che l'operazione non può essere completata. |

### Guarda anche

* interface [ILineString](../../ilinestring/)
* interface [ICurve](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../icurve/)
* assemblea [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_1}

Ottiene una versione non curva approssimativa o equivalente di questa geometria utilizzando l'oggetto specificato`tolleranza` .

```csharp
public ILineString ToLinearGeometry(double tolerance)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| tolerance | Double | Il`tolleranza`usare. Il risultato è garantito per essere inferiore a`tolleranza` lontano dalla geometria curva, a meno che il numero di punti necessari per linearizzare la geometria non superi il massimo per quadrante, attualmente pari a 10000 punti. |

### Valore di ritorno

A[`ILineString`](../../ilinestring/) che si avvicina o equivale a questa curva:  Se questo oggetto è[`ILineString`](../../ilinestring/) stesso il risultato è equivalente a questo oggetto Se questo oggetto lo è[`ICircularString`](../../icircularstring/) il risultato è la stringa circolare linearizzata con lo specificato*tolerance* Se questo oggetto è[`ICompoundCurve`](../../icompoundcurve/) - tutte le curve da esso vengono linearizzate e quindi unite[`ILineString`](../../ilinestring/)

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentOutOfRangeException | `tolleranza` è minore o uguale a`0` . |
| InvalidOperationException | Questa geometria non è valida in modo tale che l'operazione non può essere completata. |

### Guarda anche

* interface [ILineString](../../ilinestring/)
* interface [ICurve](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../icurve/)
* assemblea [Aspose.GIS](../../../)


