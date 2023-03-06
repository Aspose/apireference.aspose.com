---
title: IGeometry.AsText
second_title: Riferimento API Aspose.GIS per .NET
description: IGeometry metodo. Traduce questa geometria nella sua rappresentazione WellKnown Text.
type: docs
weight: 120
url: /it/net/aspose.gis.geometries/igeometry/astext/
---
## AsText() {#astext}

Traduce questa geometria nella sua rappresentazione Well-Known Text.

```csharp
public string AsText()
```

### Valore di ritorno

Rappresentazione Well-Known Text di questa geometria.

### Osservazioni

L'output di questo metodo è inIso Variante WKT.

### Guarda anche

* interface [IGeometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../igeometry/)
* assemblea [Aspose.GIS](../../../)

---

## AsText(WktVariant) {#astext_1}

Traduce questa geometria nella sua rappresentazione Well-Known Text.

```csharp
public string AsText(WktVariant variant)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| variant | WktVariant | Variante di testo noto da utilizzare. |

### Valore di ritorno

Rappresentazione Well-Known Text di questa geometria.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| NotSupportedException | La geometria non è supportata dalla variante WKT richiesta. Le seguenti geometrie sono supportate solo daIsoVariante WKT: [`CircularString`](../../circularstring/)[`CompoundCurve`](../../compoundcurve/)[`CurvePolygon`](../../curvepolygon/)[`MultiCurve`](../../multicurve/)[`MultiSurface`](../../multisurface/) Tutte le altre geometrie sono supportate da qualsiasi variante WKT. |
| ArgumentOutOfRangeException | *variant* non è valido[`WktVariant`](../../wktvariant/). |

### Guarda anche

* enum [WktVariant](../../wktvariant/)
* interface [IGeometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../igeometry/)
* assemblea [Aspose.GIS](../../../)

---

## AsText(WktVariant, NumericFormat) {#astext_2}

Traduce questa geometria nella sua rappresentazione Well-Known Text.

```csharp
public string AsText(WktVariant variant, NumericFormat format)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| variant | WktVariant | Variante di testo noto da utilizzare. |
| format | NumericFormat | Formato delle coordinate per la conversione in stringa. Vedi il[`NumericFormat`](../../../aspose.gis/numericformat/) capirlo. |

### Valore di ritorno

Rappresentazione Well-Known Text di questa geometria.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| NotSupportedException | La geometria non può essere rappresentata nella variante WKT richiesta. Attualmente questo accade quando [`HasCurveGeometry`](../hascurvegeometry/) della geometria è`true` e la variante WKT è SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* non è valido[`WktVariant`](../../wktvariant/). |

### Guarda anche

* enum [WktVariant](../../wktvariant/)
* class [NumericFormat](../../../aspose.gis/numericformat/)
* interface [IGeometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../igeometry/)
* assemblea [Aspose.GIS](../../../)


