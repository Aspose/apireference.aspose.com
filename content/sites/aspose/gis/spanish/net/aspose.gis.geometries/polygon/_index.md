---
title: Polygon
second_title: Referencia de API de Aspose.GIS para .NET
description: APolygon./polygon es una superficie plana definida por 1 límite exterior y 0 o más límites interiores.
type: docs
weight: 1100
url: /es/net/aspose.gis.geometries/polygon/
---
## Polygon class

A[`Polygon`](../polygon) es una superficie plana, definida por 1 límite exterior y 0 o más límites interiores.

```csharp
public class Polygon : Surface, IPolygon
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [Polygon](polygon#constructor)() | Inicializa una nueva instancia del[`Polygon`](../polygon) clase. |
| [Polygon](polygon#constructor_1)(ILinearRing) | Inicializa una nueva instancia del[`Polygon`](../polygon) clase. |
| [Polygon](polygon#constructor_2)(ILinearRing, IEnumerable&lt;ILinearRing&gt;) | Inicializa una nueva instancia del[`Polygon`](../polygon) clase. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension) { get; } | Obtiene el número de dimensiones de coordenadas para este[`Geometry`](../geometry) . |
| [Dimension](../../aspose.gis.geometries/surface/dimension) { get; } | Obtiene la dimensión topológica de este[`Geometry`](../geometry) . |
| [ExteriorRing](../../aspose.gis.geometries/polygon/exteriorring) { get; set; } | Obtiene el anillo exterior. |
| override [GeometryType](../../aspose.gis.geometries/polygon/geometrytype) { get; } | Obtiene el tipo de la geometría. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry) { get; } | Obtiene un valor que indica si esta geometría es o contiene geometría curva (no lineal). |
| override [HasM](../../aspose.gis.geometries/polygon/hasm) { get; set; } | Obtiene un valor que indica si esta instancia tiene coordenada M. |
| override [HasZ](../../aspose.gis.geometries/polygon/hasz) { get; set; } | Obtiene un valor que indica si esta instancia tiene coordenada Z. |
| [InteriorRingsCount](../../aspose.gis.geometries/polygon/interiorringscount) { get; } | Obtiene el número de anillos interiores. |
| override [IsEmpty](../../aspose.gis.geometries/polygon/isempty) { get; } | Obtiene un valor que indica si esta instancia está vacía. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple) { get; } | Obtiene un valor que indica si esta instancia es simple desde el punto de vista de SFA. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid) { get; } | Obtiene un valor que indica si esta instancia es válida. |
| override [SpatialReferenceSystem](../../aspose.gis.geometries/polygon/spatialreferencesystem) { get; set; } | Obtiene SpatialReferenceSystem de esta instancia. Esta propiedad se puede`null` , es SpatialReferenceSystem es desconocido. La asignación de un nuevo SpatialReferenceSystem no realizará ninguna transformación de coordenadas, solo cambiará la referencia. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [AddInteriorRing](../../aspose.gis.geometries/polygon/addinteriorring)(ILinearRing) | Agrega un anillo interior. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)() | Traduce esta geometría a su representación binaria conocida. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)(WkbVariant) | Traduce esta geometría a su representación binaria conocida. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | Exportar esta geometría a una representación de imagen. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportar esta geometría a una representación de imagen. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportar esta geometría a una representación de imagen. |
| [AsText](../../aspose.gis.geometries/geometry/astext)() | Traduce esta geometría a su representación de Texto conocido. |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant) | Traduce esta geometría a su representación de Texto conocido. |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant, NumericFormat) | Traduce esta geometría a su representación de Texto conocido. |
| override [Clone](../../aspose.gis.geometries/polygon/clone)() | Clona esta instancia. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby)(IGeometry) | Determina si esta geometría está cubierta por una geometría específica. |
| [Covers](../../aspose.gis.geometries/geometry/covers)(IGeometry) | Determina si esta geometría cubre una geometría específica. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses)(IGeometry) | Determina si esta geometría y una geometría especificada se cruzan. |
| [Difference](../../aspose.gis.geometries/geometry/difference)(IGeometry) | Resta una geometría especificada de esta geometría. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint)(IGeometry) | Determina si esta geometría es disjunta de una geometría especificada. |
| [Equals](../../aspose.gis.geometries/polygon/equals#equals)(ICurvePolygon) | Determina si el objeto especificado es igual al objeto actual. |
| [Equals](../../aspose.gis.geometries/polygon/equals#equals_1)(IPolygon) | Determina si el objeto especificado es igual al objeto actual. |
| override [Equals](../../aspose.gis.geometries/polygon/equals#equals_2)(object) | Determina si el objeto especificado es igual al objeto actual. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea)() | Calcula el área de esta geometría. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer)(double, int) | Calcula una región de amortiguamiento alrededor de esta geometría. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid)() | Calcula el centroide de esta geometría. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull)() | Calcula el casco convexo de esta geometría. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto)(IGeometry) | Calcula la distancia mínima entre esta geometría y una geometría especificada. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent)() | Calcula y devuelve una extensión límite de esta geometría. |
| override [GetHashCode](../../aspose.gis.geometries/polygon/gethashcode)() | Sirve como la función hash predeterminada. |
| [GetInteriorRing](../../aspose.gis.geometries/polygon/getinteriorring)(int) | Obtiene el anillo interior por su índice. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength)() | Calcula la longitud de esta geometría. |
| override [GetPointOnSurface](../../aspose.gis.geometries/polygon/getpointonsurface)() | Encuentra un punto que está garantizado para estar en este polígono. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection)(IGeometry) | Construye una intersección entre esta geometría y una geometría especificada. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(Extent) | Determina si esta geometría se cruza con una extensión especificada. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(IGeometry) | Determina si esta geometría y una geometría específica se cruzan. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps)(IGeometry) | Determina si esta geometría se superpone con una geometría especificada. |
| [Relate](../../aspose.gis.geometries/geometry/relate)(IGeometry, string) | Determina si la matriz de intersección DE-9IM de esta geometría y una geometría específica coinciden con el patrón proporcionado. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines)() | Obtiene los polígonos representados como líneas de esta geometría. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm)(int) | Redondea la coordenada M a un número especificado de dígitos fraccionarios. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy)(int) | Redondea las coordenadas X e Y a un número especificado de dígitos fraccionarios. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz)(int) | Redondea la coordenada Z a un número específico de dígitos fraccionarios. |
| override [SetEmpty](../../aspose.gis.geometries/polygon/setempty)() | hace esto[`Geometry`](../geometry) vacío. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains)(IGeometry) | Determina si esta geometría contiene espacialmente una geometría específica. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals)(IGeometry) | Determina si esta geometría es espacialmente igual a una geometría especificada. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference)(IGeometry) | Construye una diferencia simétrica entre esta geometría y una geometría especificada. |
| [ToEditable](../../aspose.gis.geometries/polygon/toeditable#toeditable_1)() | Obtiene una copia editable de esta geometría. (3 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable)() | Obtiene una copia editable de esta geometría. |
| [ToLinearGeometry](../../aspose.gis.geometries/surface/tolineargeometry)() | Obtiene una versión no curva aproximada o equivalente de esta geometría usando el valor predeterminado`tolerancia` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/surface/tolineargeometry)(double) | Obtiene una versión no curva aproximada o equivalente de esta geometría usando el`tolerancia` . (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring)() | Devuelve una cadena que representa el objeto actual. |
| [Touches](../../aspose.gis.geometries/geometry/touches)(IGeometry) | Determina si esta geometría y una geometría específica se tocan. |
| [Union](../../aspose.gis.geometries/geometry/union)(IGeometry) | Une esta geometría y una geometría especificada. |
| [Within](../../aspose.gis.geometries/geometry/within)(Extent) | Determina si esta geometría está dentro de una extensión especificada. |
| [Within](../../aspose.gis.geometries/geometry/within)(IGeometry) | Determina si esta geometría está dentro de una geometría especificada. |
| [operator ==](../../aspose.gis.geometries/polygon/op_equality) | Implementa el operador ==. |
| [operator !=](../../aspose.gis.geometries/polygon/op_inequality) | Implementa el operador !=. |

### Ver también

* class [Surface](../surface)
* interface [IPolygon](../ipolygon)
* espacio de nombres [Aspose.Gis.Geometries](../../aspose.gis.geometries)
* asamblea [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
