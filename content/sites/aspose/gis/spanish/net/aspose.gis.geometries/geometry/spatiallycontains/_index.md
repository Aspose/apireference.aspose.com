---
title: Geometry.SpatiallyContains
second_title: Referencia de API de Aspose.GIS para .NET
description: Geometry método. Determina si esta geometría contiene espacialmente una geometría específica.
type: docs
weight: 360
url: /es/net/aspose.gis.geometries/geometry/spatiallycontains/
---
## Geometry.SpatiallyContains method

Determina si esta geometría contiene espacialmente una geometría específica.

```csharp
public bool SpatiallyContains(IGeometry other)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| other | IGeometry | Una geometría. |

### Valor_devuelto

`true`si esta geometría es "espacialmente contiene" otra geometría.`false` de lo contrario.

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | El argumento es`null`. |
| ArgumentException | Una de las geometrías no es válida por lo que no se puede finalizar la operación. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) de geometrías no son equivalentes. Puede utilizar[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) para convertir geometrías al mismo sistema de referencia espacial . |

### Observaciones

Este método prueba si una geometría contiene otra en términos de matriz de intersección DE-9IM. Este método es equivalente a:

```csharp
other.Within(this);
```

### Ver también

* method [Within](../../igeometry/within/)
* method [Covers](../../igeometry/covers/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* espacio de nombres [Aspose.Gis.Geometries](../../geometry/)
* asamblea [Aspose.GIS](../../../)


