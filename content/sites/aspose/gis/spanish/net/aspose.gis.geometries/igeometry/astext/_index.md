---
title: IGeometry.AsText
second_title: Referencia de API de Aspose.GIS para .NET
description: IGeometry método. Traduce esta geometría a su representación de Texto conocido.
type: docs
weight: 120
url: /es/net/aspose.gis.geometries/igeometry/astext/
---
## AsText() {#astext}

Traduce esta geometría a su representación de Texto conocido.

```csharp
public string AsText()
```

### Valor_devuelto

Representación de texto conocido de esta geometría.

### Observaciones

La salida de este método está enIso variante WKT.

### Ver también

* interface [IGeometry](../)
* espacio de nombres [Aspose.Gis.Geometries](../../igeometry/)
* asamblea [Aspose.GIS](../../../)

---

## AsText(WktVariant) {#astext_1}

Traduce esta geometría a su representación de Texto conocido.

```csharp
public string AsText(WktVariant variant)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| variant | WktVariant | Variante de texto conocido a utilizar. |

### Valor_devuelto

Representación de texto conocido de esta geometría.

### Excepciones

| excepción | condición |
| --- | --- |
| NotSupportedException | La geometría no es compatible con la variante WKT solicitada. Las siguientes geometrías solo son compatibles conIsoVariante WKT: [`CircularString`](../../circularstring/)[`CompoundCurve`](../../compoundcurve/)[`CurvePolygon`](../../curvepolygon/)[`MultiCurve`](../../multicurve/)[`MultiSurface`](../../multisurface/) Todas las demás geometrías son compatibles con cualquier variante WKT. |
| ArgumentOutOfRangeException | *variant* no es valido[`WktVariant`](../../wktvariant/). |

### Ver también

* enum [WktVariant](../../wktvariant/)
* interface [IGeometry](../)
* espacio de nombres [Aspose.Gis.Geometries](../../igeometry/)
* asamblea [Aspose.GIS](../../../)

---

## AsText(WktVariant, NumericFormat) {#astext_2}

Traduce esta geometría a su representación de Texto conocido.

```csharp
public string AsText(WktVariant variant, NumericFormat format)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| variant | WktVariant | Variante de texto conocido a utilizar. |
| format | NumericFormat | Formato de coordenadas para la conversión a cadena. Ver el[`NumericFormat`](../../../aspose.gis/numericformat/) para conseguirlo. |

### Valor_devuelto

Representación de texto conocido de esta geometría.

### Excepciones

| excepción | condición |
| --- | --- |
| NotSupportedException | La geometría no se puede representar en la variante WKT solicitada. Actualmente esto sucede cuando [`HasCurveGeometry`](../hascurvegeometry/) de geometría es`true` y la variante WKT es SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* no es valido[`WktVariant`](../../wktvariant/). |

### Ver también

* enum [WktVariant](../../wktvariant/)
* class [NumericFormat](../../../aspose.gis/numericformat/)
* interface [IGeometry](../)
* espacio de nombres [Aspose.Gis.Geometries](../../igeometry/)
* asamblea [Aspose.GIS](../../../)


