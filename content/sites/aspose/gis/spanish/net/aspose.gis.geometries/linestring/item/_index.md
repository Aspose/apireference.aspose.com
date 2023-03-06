---
title: LineString.Item
second_title: Referencia de API de Aspose.GIS para .NET
description: LineString propiedad. Obtiene o establece elIPoint en el índice especificado.
type: docs
weight: 80
url: /es/net/aspose.gis.geometries/linestring/item/
---
## LineString indexer

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
* class [LineString](../)
* espacio de nombres [Aspose.Gis.Geometries](../../linestring/)
* asamblea [Aspose.GIS](../../../)


