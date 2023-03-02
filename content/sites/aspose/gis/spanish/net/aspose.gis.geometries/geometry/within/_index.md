---
title: Geometry.Within
second_title: Referencia de API de Aspose.GIS para .NET
description: Geometry método. Determina si esta geometría está dentro de una extensión especificada.
type: docs
weight: 440
url: /es/net/aspose.gis.geometries/geometry/within/
---
## Within(Extent) {#within}

Determina si esta geometría está dentro de una extensión especificada.

```csharp
public bool Within(Extent extent)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| extent | Extent | El grado. |

### Valor_devuelto

`true` si esta geometría está dentro de la extensión;`false` de lo contrario.

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | El argumento es`null`. |

### Ver también

* method [Contains](../../../aspose.gis/extent/contains/)
* class [Extent](../../../aspose.gis/extent/)
* class [Geometry](../)
* espacio de nombres [Aspose.Gis.Geometries](../../geometry/)
* asamblea [Aspose.GIS](../../../)

---

## Within(IGeometry) {#within_1}

Determina si esta geometría está dentro de una geometría especificada.

```csharp
public bool Within(IGeometry other)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| other | IGeometry | Una geometría. |

### Valor_devuelto

`true` si esta geometría está "espacialmente dentro" de otra geometría.`false` de lo contrario.

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | El argumento es`null`. |
| ArgumentException | Una de las geometrías no es válida por lo que no se puede finalizar la operación. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) de geometrías no son equivalentes. Puede utilizar[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) para convertir geometrías al mismo sistema de referencia espacial . |

### Observaciones

Este método comprueba si una geometría está dentro de otra en términos de la matriz de intersección DE-9IM. Una geometría está dentro de otra, si otra geometría contiene todos los puntos de la geometría y las geometrías interiores se intersecan. Este método es equivalente a: Consulte la Especificación de características simples de OpenGIS para obtener más detalles sobre DE-9IM y la relación "espacialmente dentro".

```csharp
this.Relate(other, "T*F**F***");
```

### Ver también

* method [SpatiallyContains](../../igeometry/spatiallycontains/)
* method [CoveredBy](../../igeometry/coveredby/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* espacio de nombres [Aspose.Gis.Geometries](../../geometry/)
* asamblea [Aspose.GIS](../../../)


