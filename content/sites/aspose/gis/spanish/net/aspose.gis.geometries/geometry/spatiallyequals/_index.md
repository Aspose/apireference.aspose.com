---
title: Geometry.SpatiallyEquals
second_title: Referencia de API de Aspose.GIS para .NET
description: Geometry método. Determina si esta geometría es espacialmente igual a una geometría especificada.
type: docs
weight: 370
url: /es/net/aspose.gis.geometries/geometry/spatiallyequals/
---
## Geometry.SpatiallyEquals method

Determina si esta geometría es espacialmente igual a una geometría especificada.

```csharp
public bool SpatiallyEquals(IGeometry other)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| other | IGeometry | Una geometría. |

### Valor_devuelto

`true` si esta geometría "espacialmente es igual" a la geometría especificada.`false` de lo contrario.

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | El argumento es`null`. |
| ArgumentException | Una de las geometrías no es válida por lo que no se puede finalizar la operación. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) de geometrías no son equivalentes. Puede utilizar[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) para convertir geometrías al mismo sistema de referencia espacial . |

### Observaciones

Este método prueba la igualdad en términos de la matriz de intersección DE-9IM. No depende del orden de los componentes (por ejemplo, el orden de los anillos interiores en el polígono), los valores Z y M. Básicamente, prueba que dos geometrías ocupan el mismo "espacio" cuando se proyectan en un espacio bidimensional. Este método es equivalente a: Consulte la Especificación de características simples de OpenGIS para obtener más detalles sobre DE-9IM.

```csharp
this.Relate(other, "T*F**FFF*");
```

### Ver también

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* espacio de nombres [Aspose.Gis.Geometries](../../geometry/)
* asamblea [Aspose.GIS](../../../)


