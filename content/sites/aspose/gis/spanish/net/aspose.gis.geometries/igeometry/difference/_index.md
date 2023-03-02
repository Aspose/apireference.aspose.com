---
title: IGeometry.Difference
second_title: Referencia de API de Aspose.GIS para .NET
description: IGeometry método. Resta una geometría especificada de esta geometría.
type: docs
weight: 170
url: /es/net/aspose.gis.geometries/igeometry/difference/
---
## IGeometry.Difference method

Resta una geometría especificada de esta geometría.

```csharp
public IGeometry Difference(IGeometry other)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| other | IGeometry | Una geometría para restar. |

### Valor_devuelto

Una geometría que representa una diferencia de esta geometría y un argumento. La geometría resultante contiene conjunto de puntos presente en esta geometría pero no presente en un argumento.

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | *other* es`null`. |
| ArgumentException | Una de las geometrías no es válida por lo que no se puede finalizar la operación. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) de geometrías no son equivalentes. Puede utilizar[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) para convertir geometrías al mismo sistema de referencia espacial . |

### Ver también

* interface [IGeometry](../)
* espacio de nombres [Aspose.Gis.Geometries](../../igeometry/)
* asamblea [Aspose.GIS](../../../)


