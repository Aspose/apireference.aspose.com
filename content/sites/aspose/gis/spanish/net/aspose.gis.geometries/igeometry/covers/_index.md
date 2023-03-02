---
title: IGeometry.Covers
second_title: Referencia de API de Aspose.GIS para .NET
description: IGeometry método. Determina si esta geometría cubre una geometría específica.
type: docs
weight: 150
url: /es/net/aspose.gis.geometries/igeometry/covers/
---
## IGeometry.Covers method

Determina si esta geometría cubre una geometría específica.

```csharp
public bool Covers(IGeometry other)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| other | IGeometry | Una geometría. |

### Valor_devuelto

`true` si esta geometría "cubre espacialmente" otra geometría.`false` de lo contrario.

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | El argumento es`null`. |
| ArgumentException | Una de las geometrías no es válida por lo que no se puede finalizar la operación. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) de geometrías no son equivalentes. Puede utilizar[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) para convertir geometrías al mismo sistema de referencia espacial . |

### Observaciones

Este método comprueba si una geometría cubre a otra en términos de la matriz de intersección DE-9IM. Una geometría cubre a otra, si la geometría contiene todos los puntos de otra geometría. Este método es similar a[`SpatiallyContains`](../spatiallycontains/) , pero regresa`true` más a menudo, ya que no distingue entre puntos interiores y de contorno. Entonces, si la geometría A se encuentra en el límite de geometría B,[`SpatiallyContains`](../spatiallycontains/) devoluciones`false` , mientras este método devuelve`true`. Este método es equivalente a:

```csharp
this.Relate(other, "T*****FF*") || this.Relate(other, "*T****FF*") || this.Relate(other, "***T**FF*) || this.Relate(other, "***T*FF*");
```

### Ver también

* method [SpatiallyContains](../spatiallycontains/)
* method [CoveredBy](../coveredby/)
* interface [IGeometry](../)
* espacio de nombres [Aspose.Gis.Geometries](../../igeometry/)
* asamblea [Aspose.GIS](../../../)


