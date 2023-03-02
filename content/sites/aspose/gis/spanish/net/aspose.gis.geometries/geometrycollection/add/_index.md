---
title: GeometryCollection.Add
second_title: Referencia de API de Aspose.GIS para .NET
description: GeometryCollection método. Agrega la geometría especificada a la colección.
type: docs
weight: 110
url: /es/net/aspose.gis.geometries/geometrycollection/add/
---
## GeometryCollection.Add method

Agrega la geometría especificada a la colección.

```csharp
public void Add(IGeometry geometry)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| geometry | IGeometry | La geometría a agregar. |

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | el argumento es`null`. |
| ArgumentException | La colección no acepta geometrías de este tipo. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) de esta geometría y[`SpatialReferenceSystem`](../spatialreferencesystem/) de argumento son ambos not `null` y no son iguales entre si. |

### Ver también

* interface [IGeometry](../../igeometry/)
* class [GeometryCollection](../)
* espacio de nombres [Aspose.Gis.Geometries](../../geometrycollection/)
* asamblea [Aspose.GIS](../../../)


