---
title: IGeometry.GetDistanceTo
second_title: Referencia de API de Aspose.GIS para .NET
description: IGeometry método. Calcula la distancia mínima entre esta geometría y una geometría especificada.
type: docs
weight: 230
url: /es/net/aspose.gis.geometries/igeometry/getdistanceto/
---
## IGeometry.GetDistanceTo method

Calcula la distancia mínima entre esta geometría y una geometría especificada.

```csharp
public double GetDistanceTo(IGeometry other)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| other | IGeometry | Una geometría para encontrar la distancia a. |

### Valor_devuelto

Si ambas geometrías no son[`IsEmpty`](../isempty/) - una distancia entre los puntos más cercanos de las geometrías. Si al menos una geometría está vacía, se devuelve -1.

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | El argumento es`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) de geometrías no son equivalentes. Puede utilizar[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) para convertir geometrías al mismo sistema de referencia espacial . |

### Ver también

* interface [IGeometry](../)
* espacio de nombres [Aspose.Gis.Geometries](../../igeometry/)
* asamblea [Aspose.GIS](../../../)


