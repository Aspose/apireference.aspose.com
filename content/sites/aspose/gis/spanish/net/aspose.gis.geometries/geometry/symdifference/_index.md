---
title: Geometry.SymDifference
second_title: Referencia de API de Aspose.GIS para .NET
description: Geometry método. Construye una diferencia simétrica entre esta geometría y una geometría especificada.
type: docs
weight: 380
url: /es/net/aspose.gis.geometries/geometry/symdifference/
---
## Geometry.SymDifference method

Construye una diferencia simétrica entre esta geometría y una geometría especificada.

```csharp
public IGeometry SymDifference(IGeometry other)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| other | IGeometry | Una geometría con la que calcular la diferencia simétrica. |

### Valor_devuelto

Una geometría que representa una diferencia simétrica de esta geometría y un argumento. La geometría resultante contiene conjunto de puntos presente en una de las geometrías pero no presente en ambas.

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | *other* es`null`. |
| ArgumentException | Una de las geometrías no es válida por lo que no se puede finalizar la operación. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) de geometrías no son equivalentes. Puede utilizar[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) para convertir geometrías al mismo sistema de referencia espacial . |

### Ver también

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* espacio de nombres [Aspose.Gis.Geometries](../../geometry/)
* asamblea [Aspose.GIS](../../../)


