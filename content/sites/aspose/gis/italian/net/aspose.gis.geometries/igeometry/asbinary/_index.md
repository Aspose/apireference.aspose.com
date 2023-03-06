---
title: IGeometry.AsBinary
second_title: Riferimento API Aspose.GIS per .NET
description: IGeometry metodo. Traduce questa geometria nella sua rappresentazione binaria ben nota.
type: docs
weight: 100
url: /it/net/aspose.gis.geometries/igeometry/asbinary/
---
## AsBinary() {#asbinary}

Traduce questa geometria nella sua rappresentazione binaria ben nota.

```csharp
public byte[] AsBinary()
```

### Valore di ritorno

Ben noto Rappresentazione binaria di questa geometria.

### Osservazioni

L'output di questo metodo è inIso Variante WKB.

### Guarda anche

* interface [IGeometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../igeometry/)
* assemblea [Aspose.GIS](../../../)

---

## AsBinary(WkbVariant) {#asbinary_1}

Traduce questa geometria nella sua rappresentazione binaria ben nota.

```csharp
public byte[] AsBinary(WkbVariant variant)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| variant | WkbVariant | Variante binaria ben nota da utilizzare. |

### Valore di ritorno

Ben noto Rappresentazione binaria di questa geometria.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| NotSupportedException | La geometria non può essere rappresentata nella variante WKB richiesta. Attualmente questo accade quando [`HasCurveGeometry`](../hascurvegeometry/) della geometria è`true` e la variante WKB è SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* non è valido[`WkbVariant`](../../wkbvariant/). |

### Guarda anche

* enum [WkbVariant](../../wkbvariant/)
* interface [IGeometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../igeometry/)
* assemblea [Aspose.GIS](../../../)


