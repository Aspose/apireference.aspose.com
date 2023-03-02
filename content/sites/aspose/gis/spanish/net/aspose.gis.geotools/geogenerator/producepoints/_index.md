---
title: GeoGenerator.ProducePoints
second_title: Referencia de API de Aspose.GIS para .NET
description: GeoGenerator método. Crea una matriz de puntos pertenecientes al área especificada.
type: docs
weight: 20
url: /es/net/aspose.gis.geotools/geogenerator/producepoints/
---
## GeoGenerator.ProducePoints method

Crea una matriz de puntos pertenecientes al área especificada.

```csharp
public static IEnumerable<IGeometry> ProducePoints(Extent rect, PointGeneratorOptions options)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| rect | Extent | Área especificada (ver[`Medida`](../../../aspose.gis/extent/)). |
| options | PointGeneratorOptions | Opciones de creación de puntos (ver[`Opciones del generador de puntos`](../../pointgeneratoroptions/)). |

### Valor_devuelto

Matriz de puntos (ver enumeración de[`IGeometría`](../../../aspose.gis.geometries/igeometry/)).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentOutOfRangeException | El número de puntos debe ser mayor que uno. |
| NullReferenceException | La extensión debe tener un valor (no ser NULL). |

### Ver también

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../../../aspose.gis/extent/)
* class [PointGeneratorOptions](../../pointgeneratoroptions/)
* class [GeoGenerator](../)
* espacio de nombres [Aspose.Gis.GeoTools](../../geogenerator/)
* asamblea [Aspose.GIS](../../../)


