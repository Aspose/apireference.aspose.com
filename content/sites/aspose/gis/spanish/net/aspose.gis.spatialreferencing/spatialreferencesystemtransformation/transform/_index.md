---
title: SpatialReferenceSystemTransformation.Transform
second_title: Referencia de API de Aspose.GIS para .NET
description: SpatialReferenceSystemTransformation método. Transforma la geometría del sistema de referencia espacial de origen al sistema de referencia espacial de destino.
type: docs
weight: 40
url: /es/net/aspose.gis.spatialreferencing/spatialreferencesystemtransformation/transform/
---
## SpatialReferenceSystemTransformation.Transform method

Transforma la geometría del sistema de referencia espacial de origen al sistema de referencia espacial de destino.

```csharp
public Geometry Transform(IGeometry geometry)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| geometry | IGeometry | Geometría para transformar. |

### Valor_devuelto

Nueva geometría en el sistema de referencia espacial de destino.

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | La geometría es`null` . |
| ArgumentException | Geometrías[`SpatialReferenceSystem`](../../../aspose.gis.geometries/igeometry/spatialreferencesystem/) no es`null` y no equivale a [`Source`](../source/) |
| [TransformationException](../../transformationexception/) | La transformación falló. |

### Ver también

* class [Geometry](../../../aspose.gis.geometries/geometry/)
* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [SpatialReferenceSystemTransformation](../)
* espacio de nombres [Aspose.Gis.SpatialReferencing](../../spatialreferencesystemtransformation/)
* asamblea [Aspose.GIS](../../../)


