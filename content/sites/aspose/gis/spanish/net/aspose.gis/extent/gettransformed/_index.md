---
title: Extent.GetTransformed
second_title: Referencia de API de Aspose.GIS para .NET
description: Extent método. Devuelve una nueva extensión en la especificadaSpatialReferenceSystem que contiene esta extensión.
type: docs
weight: 150
url: /es/net/aspose.gis/extent/gettransformed/
---
## Extent.GetTransformed method

Devuelve una nueva extensión en la especificada[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) que contiene esta extensión.

```csharp
public Extent GetTransformed(SpatialReferenceSystem targetSrs)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | [`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) para transformar a. |

### Valor_devuelto

El resultado de la transformación hasta el SRS especificado.

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | El argumento es`null` . |
| NotSupportedException | No se admite la transformación al SRS proporcionado. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | La transformación falló. |
| InvalidOperationException | [`SpatialReferenceSystem`](../spatialreferencesystem/) de esta medida es`null` . |

### Ver también

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Extent](../)
* espacio de nombres [Aspose.Gis](../../extent/)
* asamblea [Aspose.GIS](../../../)


