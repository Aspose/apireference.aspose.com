---
title: SpatialReferenceSystem.CreateTransformationTo
second_title: Referencia de API de Aspose.GIS para .NET
description: SpatialReferenceSystem método. Crea la transformación a partir de estoSistema de referencia espacial a otroSistema de referencia espacial .
type: docs
weight: 180
url: /es/net/aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/
---
## SpatialReferenceSystem.CreateTransformationTo method

Crea la transformación a partir de esto`Sistema de referencia espacial` a otro`Sistema de referencia espacial` .

```csharp
public SpatialReferenceSystemTransformation CreateTransformationTo(SpatialReferenceSystem targetSrs)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | Otro`Sistema de referencia espacial`. |

### Valor_devuelto

Transformación de este`Sistema de referencia espacial` a otro`Sistema de referencia espacial`.

### Excepciones

| excepción | condición |
| --- | --- |
| NotSupportedException | Transformación entre este`Sistema de referencia espacial` y el argumento no es compatible. Esto puede suceder porque una de las proyecciones no es compatible o uno de los sistemas no es compatible.[`VerticalSpatialReferenceSystem`](../../verticalspatialreferencesystem/) o [`LocalSpatialReferenceSystem`](../../localspatialreferencesystem/) . |
| [TransformationException](../../transformationexception/) | No se pudo crear la transformación debido a parámetros incorrectos dentro`Sistema de referencia espacial` . |

### Ver también

* method [TryCreateTransformationTo](../trycreatetransformationto/)
* class [SpatialReferenceSystemTransformation](../../spatialreferencesystemtransformation/)
* class [SpatialReferenceSystem](../)
* espacio de nombres [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* asamblea [Aspose.GIS](../../../)


