---
title: Class Extent
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.Extent clase. Un cuadro delimitador espacial bidimensional.
type: docs
weight: 120
url: /es/net/aspose.gis/extent/
---
## Extent class

Un cuadro delimitador espacial bidimensional.

```csharp
public class Extent : IEquatable<Extent>
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [Extent](extent/#constructor)() | Crea nueva instancia. |
| [Extent](extent/#constructor_1)(SpatialReferenceSystem) | Crea nueva instancia. |
| [Extent](extent/#constructor_2)(double, double, double, double, SpatialReferenceSystem) | Crea nueva instancia. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Center](../../aspose.gis/extent/center/) { get; } | Centro de la extensión. |
| [Height](../../aspose.gis/extent/height/) { get; } | Altura de la extensión. |
| [IsValid](../../aspose.gis/extent/isvalid/) { get; } | Determina si este`Extent` es válido. |
| [SpatialReferenceSystem](../../aspose.gis/extent/spatialreferencesystem/) { get; set; } | [`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) asociado con esta extensión. Puede ser`null` si[`SpatialReferenceSystem`](./spatialreferencesystem/) es desconocido. Uso[`GetTransformed`](./gettransformed/) para transformar la extensión entre diferentes sistemas de referencia espacial. |
| [Width](../../aspose.gis/extent/width/) { get; } | Ancho de la extensión. |
| [XMax](../../aspose.gis/extent/xmax/) { get; set; } | Valor máximo de la coordenada X. |
| [XMin](../../aspose.gis/extent/xmin/) { get; set; } | Valor mínimo de la coordenada X. |
| [YMax](../../aspose.gis/extent/ymax/) { get; set; } | Valor máximo de la coordenada Y. |
| [YMin](../../aspose.gis/extent/ymin/) { get; set; } | Valor mínimo de la coordenada Y. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Clone](../../aspose.gis/extent/clone/)() | Clona esta instancia. |
| [Contains](../../aspose.gis/extent/contains/#contains)(Extent) | Determina si esta extensión contiene el argumento. |
| [Contains](../../aspose.gis/extent/contains/#contains_1)(IGeometry) | Determina si esta extensión contiene el argumento. |
| [Contains](../../aspose.gis/extent/contains/#contains_2)(double, double) | Determina si esta extensión contiene una coordenada definida por los argumentos. |
| [Equals](../../aspose.gis/extent/equals/#equals)(Extent) | Indica si el objeto actual es igual a otro objeto del mismo tipo. |
| override [Equals](../../aspose.gis/extent/equals/#equals_1)(object) | Determina si el objeto especificado es igual al objeto actual. |
| override [GetHashCode](../../aspose.gis/extent/gethashcode/)() | Sirve como la función hash predeterminada. |
| [GetTransformed](../../aspose.gis/extent/gettransformed/)(SpatialReferenceSystem) | Devuelve una nueva extensión en la especificada[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) que contiene esta extensión. |
| [Grow](../../aspose.gis/extent/grow/#grow)(Extent) | Aumenta esta extensión para que incluya el argumento. |
| [Grow](../../aspose.gis/extent/grow/#grow_1)(double, double) | Aumenta esta extensión para que incluya el punto especificado. |
| [GrowX](../../aspose.gis/extent/growx/)(double) | Aumenta esta extensión a lo largo del eje X para que incluya el valor especificado. |
| [GrowY](../../aspose.gis/extent/growy/)(double) | Aumenta esta extensión a lo largo del eje Y para que incluya el valor especificado. |
| [Intersects](../../aspose.gis/extent/intersects/#intersects)(Extent) | Determina si esta extensión se cruza con el argumento. |
| [Intersects](../../aspose.gis/extent/intersects/#intersects_1)(IGeometry) | Determina si esta extensión se cruza con el argumento. |
| [Normalize](../../aspose.gis/extent/normalize/)() | Intercambios[`XMin`](./xmin/) con[`XMax`](./xmax/) si[`Width`](./width/) es negativo y [`YMin`](./ymin/) con[`YMax`](./ymax/) si[`Height`](./height/) es negativo. |
| [ToPolygon](../../aspose.gis/extent/topolygon/)() | Convierte esta extensión en un polígono rectangular que la representa. |
| override [ToString](../../aspose.gis/extent/tostring/)() | Devuelve una cadena que representa el objeto actual. |
| [operator ==](../../aspose.gis/extent/op_equality/) | Implementa el operador '=='. |
| [operator !=](../../aspose.gis/extent/op_inequality/) | Implementa el operador '!='. |

### Ver también

* espacio de nombres [Aspose.Gis](../../aspose.gis/)
* asamblea [Aspose.GIS](../../)


