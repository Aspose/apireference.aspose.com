---
title: IGeometry.ToLinearGeometry
second_title: Referencia de API de Aspose.GIS para .NET
description: IGeometry método. Obtiene una versión no curva aproximada o equivalente de esta geometría usando el valor predeterminadotolerancia .
type: docs
weight: 350
url: /es/net/aspose.gis.geometries/igeometry/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry}

Obtiene una versión no curva aproximada o equivalente de esta geometría usando el valor predeterminado`tolerancia` .

```csharp
public IGeometry ToLinearGeometry()
```

### Valor_devuelto

Una geometría que no tiene geometrías de curvas. Este es el equivalente de`ToLinearGeometry` con predeterminado`tolerancia` . Por defecto`tolerancia` es definido por[`SpatialReferenceSystem`](../spatialreferencesystem/) de esta geometría:  Para SRS proyectado, la tolerancia es de 0,001 metros (en unidades SRS) Para la tolerancia SRS geográfica es`1e-5` grados (en unidades SRS) Para SRS desconocido, la tolerancia es`1e-5` Para obtener más detalles sobre qué transformaciones se aplican, consulte`ToLinearGeometry` especificación.

### Excepciones

| excepción | condición |
| --- | --- |
| InvalidOperationException | Esta geometría no es válida por lo que la operación no se puede completar. |

### Ver también

* interface [IGeometry](../)
* espacio de nombres [Aspose.Gis.Geometries](../../igeometry/)
* asamblea [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_1}

Obtiene una versión no curva aproximada o equivalente de esta geometría usando el`tolerancia` .

```csharp
public IGeometry ToLinearGeometry(double tolerance)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| tolerance | Double | El`tolerancia`usar. Se garantiza que el resultado será inferior a`tolerancia` lejos de la geometría curvada , a menos que el número de puntos necesarios para linealizar la geometría exceda el máximo por cuadrante que actualmente es igual a 10000 puntos. |

### Valor_devuelto

Una geometría que no tiene geometrías curvas. Se aplican las siguientes transformaciones: CircularString s están linealizados (transformados enLineString s con especificado*tolerance* )CompoundCurve s se unen en`LineString` sCurvePolygon s se transforman enPolygon sMultiCurve s se transforman enMultiLineString sMultiSurface s se transforman enMultiPolygon s Como resultado,[`HasCurveGeometry`](../hascurvegeometry/) de la geometría de salida es`false` .

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentOutOfRangeException | `tolerancia` es menor o igual que`0` . |
| InvalidOperationException | Esta geometría no es válida por lo que la operación no se puede completar. |

### Ver también

* interface [IGeometry](../)
* espacio de nombres [Aspose.Gis.Geometries](../../igeometry/)
* asamblea [Aspose.GIS](../../../)


