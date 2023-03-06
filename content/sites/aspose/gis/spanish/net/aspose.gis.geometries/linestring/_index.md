---
title: Class LineString
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.Geometries.LineString clase. Una línea de varios vértices.
type: docs
weight: 1120
url: /es/net/aspose.gis.geometries/linestring/
---
## LineString class

Una línea de varios vértices.

```csharp
public class LineString : Curve, ILineString
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [LineString](linestring/#constructor)() | Inicializa una nueva instancia del`LineString` clase. |
| [LineString](linestring/#constructor_2)(IEnumerable&lt;IPoint&gt;) | Inicializa una nueva instancia del`LineString` clase. |
| [LineString](linestring/#constructor_1)(ILineString) | Inicializa una nueva instancia del`LineString` clase. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | Obtiene el número de dimensiones de coordenadas para este[`Geometry`](../geometry/) . |
| [Count](../../aspose.gis.geometries/linestring/count/) { get; } | Obtiene el número de puntos en el`LineString` . |
| [Dimension](../../aspose.gis.geometries/curve/dimension/) { get; } | Obtiene la dimensión topológica de este[`Geometry`](../geometry/) . |
| override [EndPoint](../../aspose.gis.geometries/linestring/endpoint/) { get; } | Devuelve una copia del punto final de la curva. |
| override [GeometryType](../../aspose.gis.geometries/linestring/geometrytype/) { get; } | Obtiene el tipo de la geometría. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry/) { get; } | Obtiene un valor que indica si esta geometría es o contiene geometría curva (no lineal). |
| [HasM](../../aspose.gis.geometries/linestring/hasm/) { get; set; } | Obtiene un valor que indica si esta instancia tiene coordenada M. |
| [HasZ](../../aspose.gis.geometries/linestring/hasz/) { get; set; } | Obtiene un valor que indica si esta instancia tiene coordenada Z. |
| [IsClosed](../../aspose.gis.geometries/curve/isclosed/) { get; } | Obtiene valores que indican si una curva está cerrada. Una curva es cerrada si su punto inicial es igual a su punto final. |
| override [IsEmpty](../../aspose.gis.geometries/linestring/isempty/) { get; } | Obtiene un valor que indica si esta instancia está vacía. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | Obtiene un valor que indica si esta instancia es simple desde el punto de vista de SFA. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | Obtiene un valor que indica si esta instancia es válida. |
| [Item](../../aspose.gis.geometries/linestring/item/) { get; set; } | Obtiene o establece el[`IPoint`](../ipoint/) en el índice especificado. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/linestring/spatialreferencesystem/) { get; set; } | Obtiene SpatialReferenceSystem de esta instancia. Esta propiedad se puede`null` , si SpatialReferenceSystem no está configurado. La asignación de un nuevo SpatialReferenceSystem no realizará ninguna transformación de coordenadas, solo cambiará la referencia. |
| override [StartPoint](../../aspose.gis.geometries/linestring/startpoint/) { get; } | Devuelve una copia del punto inicial de la curva. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint/#addpoint)(IPoint) | Añade un punto al final de la línea. |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint/#addpoint_1)(double, double) | Añade un punto al final de la línea. |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint/#addpoint_2)(double, double, double) | Añade un punto al final de la línea. |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint/#addpoint_3)(double, double, double, double) | Añade un punto al final de la línea. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | Traduce esta geometría a su representación binaria conocida. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | Traduce esta geometría a su representación binaria conocida. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | Exportar esta geometría a una representación de imagen. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportar esta geometría a una representación de imagen. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportar esta geometría a una representación de imagen. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | Traduce esta geometría a su representación de Texto conocido. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | Traduce esta geometría a su representación de Texto conocido. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | Traduce esta geometría a su representación de Texto conocido. |
| override [Clone](../../aspose.gis.geometries/linestring/clone/)() | Clona esta instancia. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | Determina si esta geometría está cubierta por una geometría específica. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | Determina si esta geometría cubre una geometría específica. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | Determina si esta geometría y una geometría especificada se cruzan. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | Resta una geometría especificada de esta geometría. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | Determina si esta geometría es disjunta de una geometría especificada. |
| [Equals](../../aspose.gis.geometries/linestring/equals/#equals)(ILineString) | Indica si el objeto actual es igual a otro objeto del mismo tipo. |
| override [Equals](../../aspose.gis.geometries/linestring/equals/#equals_1)(object) | Determina si el objeto especificado es igual al objeto actual. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | Calcula el área de esta geometría. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | Calcula una región de amortiguamiento alrededor de esta geometría. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | Calcula el centroide de esta geometría. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | Calcula el casco convexo de esta geometría. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | Calcula la distancia mínima entre esta geometría y una geometría especificada. |
| [GetEnumerator](../../aspose.gis.geometries/linestring/getenumerator/)() | Devuelve un enumerador que itera a través de la colección. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | Calcula y devuelve una extensión límite de esta geometría. |
| override [GetHashCode](../../aspose.gis.geometries/linestring/gethashcode/)() | Sirve como la función hash predeterminada. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | Calcula la longitud de esta geometría. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | Construye una intersección entre esta geometría y una geometría especificada. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | Determina si esta geometría se cruza con una extensión especificada. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | Determina si esta geometría y una geometría específica se cruzan. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | Determina si esta geometría se superpone con una geometría especificada. |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | Determina si la matriz de intersección DE-9IM de esta geometría y una geometría específica coinciden con el patrón proporcionado. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | Obtiene los polígonos representados como líneas de esta geometría. |
| override [Reverse](../../aspose.gis.geometries/linestring/reverse/)() | Invierte el orden de los puntos en este`LineString` . |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | Redondea la coordenada M a un número especificado de dígitos fraccionarios. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | Redondea las coordenadas X e Y a un número especificado de dígitos fraccionarios. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Redondea la coordenada Z a un número específico de dígitos fraccionarios. |
| override [SetEmpty](../../aspose.gis.geometries/linestring/setempty/)() | hace esto[`Geometry`](../geometry/) vacío. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | Determina si esta geometría contiene espacialmente una geometría específica. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | Determina si esta geometría es espacialmente igual a una geometría especificada. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | Construye una diferencia simétrica entre esta geometría y una geometría especificada. |
| [ToEditable](../../aspose.gis.geometries/linestring/toeditable/#toeditable_2)() | Obtiene una copia editable de esta geometría. (3 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | Obtiene una copia editable de esta geometría. |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/)() | Obtiene una versión no curva aproximada o equivalente de esta geometría usando el valor predeterminado`tolerancia` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/)(double) | Obtiene una versión no curva aproximada o equivalente de esta geometría usando el`tolerancia` . (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | Devuelve una cadena que representa el objeto actual. |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | Determina si esta geometría y una geometría específica se tocan. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | Une esta geometría y una geometría especificada. |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | Determina si esta geometría está dentro de una extensión especificada. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | Determina si esta geometría está dentro de una geometría especificada. |
| [operator ==](../../aspose.gis.geometries/linestring/op_equality/) | Implementa el operador ==. |
| [operator !=](../../aspose.gis.geometries/linestring/op_inequality/) | Implementa el operador !=. |

### Ver también

* class [Curve](../curve/)
* interface [ILineString](../ilinestring/)
* espacio de nombres [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* asamblea [Aspose.GIS](../../)


