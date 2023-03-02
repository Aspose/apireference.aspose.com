---
title: GeoGenerator.ProduceStars
second_title: Referencia de API de Aspose.GIS para .NET
description: GeoGenerator método. Crea una matriz de estrellas todas dentro de una determinada extensión.
type: docs
weight: 40
url: /es/net/aspose.gis.geotools/geogenerator/producestars/
---
## GeoGenerator.ProduceStars method

Crea una matriz de estrellas, todas dentro de una determinada extensión.

```csharp
public static IEnumerable<IPolygon> ProduceStars(Extent rect, StarGeneratorOptions options)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| rect | Extent | Área especificada (ver[`Medida`](../../../aspose.gis/extent/)) |
| options | StarGeneratorOptions | Opciones de creación de polígonos (ver[`StarGeneratorOpciones`](../../stargeneratoroptions/)) |

### Valor_devuelto

Matriz de estrellas (ver enumeración de[`polígono`](../../../aspose.gis.geometries/ipolygon/))

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentOutOfRangeException | El número de estrellas debe ser mayor que uno. |
| NullReferenceException | La extensión debe tener un valor (no ser NULL) |
| ArgumentException | Las longitudes mínima y máxima deben ser desiguales y mayores de 3 |
| ArgumentException | La longitud máxima debe ser mayor que la mínima. |

### Ver también

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [StarGeneratorOptions](../../stargeneratoroptions/)
* class [GeoGenerator](../)
* espacio de nombres [Aspose.Gis.GeoTools](../../geogenerator/)
* asamblea [Aspose.GIS](../../../)


