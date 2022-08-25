---
title: GeometryCollection
second_title: Referencia de API de Aspose.GIS para .NET
description: AGeometryCollection./geometrycollection es unGeometry./geometry que es una colección de una o más geometrías.
type: docs
weight: 830
url: /es/net/aspose.gis.geometries/geometrycollection/
---
## GeometryCollection class

A[`GeometryCollection`](../geometrycollection) es un[`Geometry`](../geometry) que es una colección de una o más geometrías.

```csharp
public class GeometryCollection : Geometry, IGeometryCollection
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [GeometryCollection](geometrycollection)() | Inicializa una nueva instancia del[`GeometryCollection`](../geometrycollection) clase. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension) { get; } | Obtiene el número de dimensiones de coordenadas para este[`Geometry`](../geometry) . |
| [Count](../../aspose.gis.geometries/geometrycollection/count) { get; } | Obtiene el número de geometrías en esta colección. |
| override [Dimension](../../aspose.gis.geometries/geometrycollection/dimension) { get; } | Obtiene la dimensión topológica de este[`Geometry`](../geometry) . Si la colección está vacía,Point se devuelve. |
| override [GeometryType](../../aspose.gis.geometries/geometrycollection/geometrytype) { get; } | Obtiene el tipo de la geometría. |
| override [HasCurveGeometry](../../aspose.gis.geometries/geometrycollection/hascurvegeometry) { get; } | Obtiene un valor que indica si esta geometría es o contiene geometría curva (no lineal). |
| override [HasM](../../aspose.gis.geometries/geometrycollection/hasm) { get; set; } | Obtiene un valor que indica si esta instancia tiene coordenada M. |
| override [HasZ](../../aspose.gis.geometries/geometrycollection/hasz) { get; set; } | Obtiene un valor que indica si esta instancia tiene coordenada Z. |
| override [IsEmpty](../../aspose.gis.geometries/geometrycollection/isempty) { get; } | Obtiene un valor que indica si esta instancia está vacía. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple) { get; } | Obtiene un valor que indica si esta instancia es simple desde el punto de vista de SFA. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid) { get; } | Obtiene un valor que indica si esta instancia es válida. |
| [Item](../../aspose.gis.geometries/geometrycollection/item) { get; } | Obtiene un[`IGeometry`](../igeometry) en el índice especificado. |
| override [SpatialReferenceSystem](../../aspose.gis.geometries/geometrycollection/spatialreferencesystem) { get; set; } | Obtiene SpatialReferenceSystem de esta instancia. Esta propiedad se puede`null` , es SpatialReferenceSystem es desconocido. La asignación de un nuevo SpatialReferenceSystem no realizará ninguna transformación de coordenadas, solo cambiará la referencia. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Add](../../aspose.gis.geometries/geometrycollection/add)(IGeometry) | Agrega la geometría especificada a la colección. |
| [AddRange](../../aspose.gis.geometries/geometrycollection/addrange)(IEnumerable&lt;IGeometry&gt;) | Agrega las geometrías especificadas a la colección. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)() | Traduce esta geometría a su representación binaria conocida. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)(WkbVariant) | Traduce esta geometría a su representación binaria conocida. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | Exportar esta geometría a una representación de imagen. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportar esta geometría a una representación de imagen. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportar esta geometría a una representación de imagen. |
| [AsText](../../aspose.gis.geometries/geometry/astext)() | Traduce esta geometría a su representación de Texto conocido. |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant) | Traduce esta geometría a su representación de Texto conocido. |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant, NumericFormat) | Traduce esta geometría a su representación de Texto conocido. |
| override [Clone](../../aspose.gis.geometries/geometrycollection/clone)() | Clona esta instancia. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby)(IGeometry) | Determina si esta geometría está cubierta por una geometría específica. |
| [Covers](../../aspose.gis.geometries/geometry/covers)(IGeometry) | Determina si esta geometría cubre una geometría específica. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses)(IGeometry) | Determina si esta geometría y una geometría especificada se cruzan. |
| [Difference](../../aspose.gis.geometries/geometry/difference)(IGeometry) | Resta una geometría especificada de esta geometría. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint)(IGeometry) | Determina si esta geometría es disjunta de una geometría especificada. |
| [Equals](../../aspose.gis.geometries/geometrycollection/equals#equals)(IGeometryCollection) | Indica si el objeto actual es igual a otro objeto del mismo tipo. |
| override [Equals](../../aspose.gis.geometries/geometrycollection/equals#equals_1)(object) | Determina si el objeto especificado es igual al objeto actual. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea)() | Calcula el área de esta geometría. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer)(double, int) | Calcula una región de amortiguamiento alrededor de esta geometría. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid)() | Calcula el centroide de esta geometría. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull)() | Calcula el casco convexo de esta geometría. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto)(IGeometry) | Calcula la distancia mínima entre esta geometría y una geometría especificada. |
| [GetEnumerator](../../aspose.gis.geometries/geometrycollection/getenumerator)() | Devuelve un enumerador que itera a través de la colección. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent)() | Calcula y devuelve una extensión límite de esta geometría. |
| override [GetHashCode](../../aspose.gis.geometries/geometrycollection/gethashcode)() | Sirve como la función hash predeterminada. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength)() | Calcula la longitud de esta geometría. |
| [GetPointOnSurface](../../aspose.gis.geometries/geometrycollection/getpointonsurface)() | Encuentra un punto que está garantizado para estar en una de las superficies de esta colección. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection)(IGeometry) | Construye una intersección entre esta geometría y una geometría especificada. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(Extent) | Determina si esta geometría se cruza con una extensión especificada. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(IGeometry) | Determina si esta geometría y una geometría específica se cruzan. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps)(IGeometry) | Determina si esta geometría se superpone con una geometría especificada. |
| [Relate](../../aspose.gis.geometries/geometry/relate)(IGeometry, string) | Determina si la matriz de intersección DE-9IM de esta geometría y una geometría específica coinciden con el patrón proporcionado. |
| [RemoveAt](../../aspose.gis.geometries/geometrycollection/removeat)(int) | Elimina la geometría especificada de la colección. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometrycollection/replacepolygonsbylines#replacepolygonsbylines_1)() | Obtiene los polígonos representados como líneas de esta geometría. (2 methods) |
| [RoundM](../../aspose.gis.geometries/geometry/roundm)(int) | Redondea la coordenada M a un número especificado de dígitos fraccionarios. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy)(int) | Redondea las coordenadas X e Y a un número especificado de dígitos fraccionarios. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz)(int) | Redondea la coordenada Z a un número específico de dígitos fraccionarios. |
| override [SetEmpty](../../aspose.gis.geometries/geometrycollection/setempty)() | hace esto[`Geometry`](../geometry) vacío. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains)(IGeometry) | Determina si esta geometría contiene espacialmente una geometría específica. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals)(IGeometry) | Determina si esta geometría es espacialmente igual a una geometría especificada. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference)(IGeometry) | Construye una diferencia simétrica entre esta geometría y una geometría especificada. |
| [ToEditable](../../aspose.gis.geometries/geometrycollection/toeditable#toeditable_1)() | Obtiene una copia editable de esta geometría. (2 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable)() | Obtiene una copia editable de esta geometría. |
| [ToLinearGeometry](../../aspose.gis.geometries/geometrycollection/tolineargeometry#tolineargeometry_2)() | Obtiene una versión no curva aproximada o equivalente de esta geometría usando el valor predeterminado`tolerancia` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/geometrycollection/tolineargeometry#tolineargeometry_3)(double) | Obtiene una versión no curva aproximada o equivalente de esta geometría usando el`tolerancia` . (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring)() | Devuelve una cadena que representa el objeto actual. |
| [Touches](../../aspose.gis.geometries/geometry/touches)(IGeometry) | Determina si esta geometría y una geometría específica se tocan. |
| [Union](../../aspose.gis.geometries/geometry/union)(IGeometry) | Une esta geometría y una geometría especificada. |
| [Within](../../aspose.gis.geometries/geometry/within)(Extent) | Determina si esta geometría está dentro de una extensión especificada. |
| [Within](../../aspose.gis.geometries/geometry/within)(IGeometry) | Determina si esta geometría está dentro de una geometría especificada. |
| [operator ==](../../aspose.gis.geometries/geometrycollection/op_equality) | Implementa el operador ==. |
| [operator !=](../../aspose.gis.geometries/geometrycollection/op_inequality) | Implementa el operador !=. |

### Ver también

* class [Geometry](../geometry)
* interface [IGeometryCollection](../igeometrycollection)
* espacio de nombres [Aspose.Gis.Geometries](../../aspose.gis.geometries)
* asamblea [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
