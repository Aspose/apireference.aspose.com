---
title: CircularString.Item
second_title: Referencia de API de Aspose.GIS para .NET
description: CircularString propiedad. Obtiene o establece elIPoint en el índice especificado.
type: docs
weight: 90
url: /es/net/aspose.gis.geometries/circularstring/item/
---
## CircularString indexer

Obtiene o establece el[`IPoint`](../../ipoint/) en el índice especificado.

```csharp
public IPoint this[int index] { get; set; }
```

| Parámetro | Descripción |
| --- | --- |
| index | El índice. |

### El valor de la propiedad

El[`IPoint`](../../ipoint/) .

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentOutOfRangeException | El índice está fuera de rango. |
| ArgumentNullException | el valor es`null`. |
| ArgumentException | El punto está vacío. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) de esta geometría y[`SpatialReferenceSystem`](../spatialreferencesystem/) de argumento no son ambos`null` y no son iguales. |

### Ver también

* interface [IPoint](../../ipoint/)
* class [CircularString](../)
* espacio de nombres [Aspose.Gis.Geometries](../../circularstring/)
* asamblea [Aspose.GIS](../../../)


