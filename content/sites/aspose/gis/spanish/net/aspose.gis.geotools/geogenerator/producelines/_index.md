---
title: GeoGenerator.ProduceLines
second_title: Referencia de API de Aspose.GIS para .NET
description: GeoGenerator método. Crea un nuevo Enumerador ILineString con un número determinado de elementos aleatorios todos ellos dentro de una extensión determinada.
type: docs
weight: 10
url: /es/net/aspose.gis.geotools/geogenerator/producelines/
---
## GeoGenerator.ProduceLines method

Crea un nuevo Enumerador ILineString con un número determinado de elementos aleatorios, todos ellos dentro de una extensión determinada.

```csharp
public static IEnumerable<ILineString> ProduceLines(Extent rect, LineGeneratorOptions options)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| rect | Extent | Área especificada (ver[`Medida`](../../../aspose.gis/extent/)) |
| options | LineGeneratorOptions | Opciones de creación de líneas (ver[`LineGeneratorOptions`](../../linegeneratoroptions/)) |

### Valor_devuelto

Matriz de líneas (ver enumeración de[`ILineString`](../../../aspose.gis.geometries/ilinestring/))

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentOutOfRangeException | El número de líneas debe ser mayor que uno. |
| NullReferenceException | La extensión debe tener un valor (no ser NULL) |

### Ver también

* interface [ILineString](../../../aspose.gis.geometries/ilinestring/)
* class [Extent](../../../aspose.gis/extent/)
* class [LineGeneratorOptions](../../linegeneratoroptions/)
* class [GeoGenerator](../)
* espacio de nombres [Aspose.Gis.GeoTools](../../geogenerator/)
* asamblea [Aspose.GIS](../../../)


