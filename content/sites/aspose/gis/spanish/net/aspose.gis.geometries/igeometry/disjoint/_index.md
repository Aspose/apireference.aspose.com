---
title: IGeometry.Disjoint
second_title: Referencia de API de Aspose.GIS para .NET
description: IGeometry método. Determina si esta geometría es disjunta de una geometría especificada.
type: docs
weight: 180
url: /es/net/aspose.gis.geometries/igeometry/disjoint/
---
## IGeometry.Disjoint method

Determina si esta geometría es disjunta de una geometría especificada.

```csharp
public bool Disjoint(IGeometry other)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| other | IGeometry | Una geometría. |

### Valor_devuelto

`true` si esta geometría es "espacialmente separada" de otra geometría.`false` de lo contrario.

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | El argumento es`null`. |
| ArgumentException | Una de las geometrías no es válida por lo que no se puede finalizar la operación. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) de geometrías no son equivalentes. Puede utilizar[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) para convertir geometrías al mismo sistema de referencia espacial . |

### Observaciones

Este método prueba si las geometrías son disjuntas en términos de la matriz de intersección DE-9IM. Básicamente, prueba que dos geometrías no tienen puntos comunes. Este método es equivalente a: Consulte la Especificación de características simples de OpenGIS para obtener más detalles sobre DE-9IM.

```csharp
this.Relate(other, "FF*FF****");
```

### Ver también

* method [Intersects](../intersects/)
* interface [IGeometry](../)
* espacio de nombres [Aspose.Gis.Geometries](../../igeometry/)
* asamblea [Aspose.GIS](../../../)


