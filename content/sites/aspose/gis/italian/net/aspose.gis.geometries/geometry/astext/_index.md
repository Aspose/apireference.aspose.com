---
title: Geometry.AsText
second_title: Riferimento API Aspose.GIS per .NET
description: Geometry metodo. Traduce questa geometria nella sua rappresentazione WellKnown Text.
type: docs
weight: 130
url: /it/net/aspose.gis.geometries/geometry/astext/
---
## AsText() {#astext}

Traduce questa geometria nella sua rappresentazione Well-Known Text.

```csharp
public string AsText()
```

### Valore di ritorno

Rappresentazione Well-Known Text di questa geometria.

### Osservazioni

L'output di questo metodo è presenteIso Variante WKT. Il formato numerico predefinito è[`General`](../../../aspose.gis/numericformat/general/) (con precisione "0").

### Guarda anche

* class [Geometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../geometry/)
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
| NotSupportedException | La geometria non può essere rappresentata nella variante WKT richiesta. Attualmente questo accade quando [`HasCurveGeometry`](../hascurvegeometry/) della geometria è`true` e la variante WKT è SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* non è valido[`WktVariant`](../../wktvariant/). |

### Osservazioni

Il formato numerico predefinito è[`General`](../../../aspose.gis/numericformat/general/) (con precisione "0").

### Guarda anche

* enum [WktVariant](../../wktvariant/)
* class [Geometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../geometry/)
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
* class [Geometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../geometry/)
* assemblea [Aspose.GIS](../../../)


