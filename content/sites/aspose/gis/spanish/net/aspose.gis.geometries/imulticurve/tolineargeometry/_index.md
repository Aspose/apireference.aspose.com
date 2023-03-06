---
title: IMultiCurve.ToLinearGeometry
second_title: Referencia de API de Aspose.GIS para .NET
description: IMultiCurve método. Obtiene una versión no curva aproximada o equivalente de esta geometría usando el valor predeterminadotolerancia .
type: docs
weight: 20
url: /es/net/aspose.gis.geometries/imulticurve/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry}

Obtiene una versión no curva aproximada o equivalente de esta geometría usando el valor predeterminado`tolerancia` .

```csharp
public IMultiLineString ToLinearGeometry()
```

### Valor_devuelto

A[`IMultiLineString`](../../imultilinestring/) que se aproxima o equivale a este[`IMultiCurve`](../). Este es el equivalente de`ToLinearGeometry` con predeterminado`tolerancia` . Por defecto`tolerancia` el valor de s depende de[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) de esta geometría:  Para SRS proyectado, la tolerancia es de 0,001 metros (en unidades SRS) Para la tolerancia SRS geográfica es`1e-5` grados (en unidades SRS) Para SRS desconocido, la tolerancia es`1e-5` Para obtener más detalles sobre qué transformaciones se aplican, consulte`ToLinearGeometry` especificación.

### Excepciones

| excepción | condición |
| --- | --- |
| InvalidOperationException | Esta geometría no es válida por lo que la operación no se puede completar. |

### Ver también

* interface [IMultiLineString](../../imultilinestring/)
* interface [IMultiCurve](../)
* espacio de nombres [Aspose.Gis.Geometries](../../imulticurve/)
* asamblea [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_1}

Obtiene una versión no curva aproximada o equivalente de esta geometría usando el`tolerancia` .

```csharp
public IMultiLineString ToLinearGeometry(double tolerance)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| tolerance | Double | El`tolerancia`usar. Se garantiza que el resultado será inferior a`tolerancia` lejos de la geometría curvada , a menos que el número de puntos necesarios para linealizar la geometría exceda el máximo por cuadrante, actualmente igual a 10000 puntos. |

### Valor_devuelto

A[`IMultiLineString`](../../imultilinestring/) que se aproxima o equivale a este[`IMultiCurve`](../) :  Si este objeto es[`IMultiLineString`](../../imultilinestring/) en sí mismo el resultado es equivalente a este objeto Si este objeto no es[`IMultiLineString`](../../imultilinestring/) - todas las curvas están linealizadas y son nuevas`IMultiLineString` se crea

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentOutOfRangeException | `tolerancia` es menor o igual que`0` . |
| InvalidOperationException | Esta geometría no es válida por lo que la operación no se puede completar. |

### Ver también

* interface [IMultiLineString](../../imultilinestring/)
* interface [IMultiCurve](../)
* espacio de nombres [Aspose.Gis.Geometries](../../imulticurve/)
* asamblea [Aspose.GIS](../../../)


