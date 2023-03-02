---
title: Interface IGeometry
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.Geometries.IGeometry interfaz. La clase raíz de la interfaz de la jerarquía de geometrías
type: docs
weight: 1000
url: /es/net/aspose.gis.geometries/igeometry/
---
## IGeometry interface

La clase raíz de la interfaz de la jerarquía de geometrías

```csharp
public interface IGeometry
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Dimension](../../aspose.gis.geometries/igeometry/dimension/) { get; } | Obtiene la dimensión topológica de este`IGeometry` . Si se desconoce la dimensión (por ejemplo, para una GEOMETRYCOLLECTION vacía)Point se devuelve. |
| [GeometryType](../../aspose.gis.geometries/igeometry/geometrytype/) { get; } | Obtiene el tipo de la geometría. |
| [HasCurveGeometry](../../aspose.gis.geometries/igeometry/hascurvegeometry/) { get; } | Obtiene un valor que indica si esta geometría es o contiene geometría curva (no lineal). |
| [HasM](../../aspose.gis.geometries/igeometry/hasm/) { get; } | Obtiene un valor que indica si esta instancia tiene coordenada M. |
| [HasZ](../../aspose.gis.geometries/igeometry/hasz/) { get; } | Obtiene un valor que indica si esta instancia tiene coordenada Z. |
| [IsEmpty](../../aspose.gis.geometries/igeometry/isempty/) { get; } | Obtiene un valor que indica si esta instancia está vacía (representa el conjunto de puntos vacío). |
| [IsSimple](../../aspose.gis.geometries/igeometry/issimple/) { get; } | Obtiene un valor que indica si esta instancia es simple desde el punto de vista de SFA. |
| [IsValid](../../aspose.gis.geometries/igeometry/isvalid/) { get; } | Obtiene un valor que indica si esta instancia es válida. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/igeometry/spatialreferencesystem/) { get; } | Obtiene SpatialReferenceSystem de esta instancia. Esta propiedad se puede`null` , si SpatialReferenceSystem es desconocido. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/igeometry/asbinary/#asbinary)() | Traduce esta geometría a su representación binaria conocida. |
| [AsBinary](../../aspose.gis.geometries/igeometry/asbinary/#asbinary_1)(WkbVariant) | Traduce esta geometría a su representación binaria conocida. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage/#asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | Exportar esta geometría a una representación de imagen. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage/#asimage_1)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportar esta geometría a una representación de imagen. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage/#asimage_2)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportar esta geometría a una representación de imagen. |
| [AsText](../../aspose.gis.geometries/igeometry/astext/#astext)() | Traduce esta geometría a su representación de Texto conocido. |
| [AsText](../../aspose.gis.geometries/igeometry/astext/#astext_1)(WktVariant) | Traduce esta geometría a su representación de Texto conocido. |
| [AsText](../../aspose.gis.geometries/igeometry/astext/#astext_2)(WktVariant, NumericFormat) | Traduce esta geometría a su representación de Texto conocido. |
| [Clone](../../aspose.gis.geometries/igeometry/clone/)() | Clona esta instancia. |
| [CoveredBy](../../aspose.gis.geometries/igeometry/coveredby/)(IGeometry) | Determina si esta geometría está cubierta por una geometría específica. |
| [Covers](../../aspose.gis.geometries/igeometry/covers/)(IGeometry) | Determina si esta geometría cubre una geometría específica. |
| [Crosses](../../aspose.gis.geometries/igeometry/crosses/)(IGeometry) | Determina si esta geometría y una geometría especificada se cruzan. |
| [Difference](../../aspose.gis.geometries/igeometry/difference/)(IGeometry) | Resta una geometría especificada de esta geometría. |
| [Disjoint](../../aspose.gis.geometries/igeometry/disjoint/)(IGeometry) | Determina si esta geometría es disjunta de una geometría especificada. |
| [GetArea](../../aspose.gis.geometries/igeometry/getarea/)() | Calcula el área de esta geometría. |
| [GetBuffer](../../aspose.gis.geometries/igeometry/getbuffer/)(double, int) | Calcula una región de amortiguamiento alrededor de esta geometría. |
| [GetCentroid](../../aspose.gis.geometries/igeometry/getcentroid/)() | Calcula el centroide de esta geometría. |
| [GetConvexHull](../../aspose.gis.geometries/igeometry/getconvexhull/)() | Calcula el casco convexo de esta geometría. |
| [GetDistanceTo](../../aspose.gis.geometries/igeometry/getdistanceto/)(IGeometry) | Calcula la distancia mínima entre esta geometría y una geometría especificada. |
| [GetExtent](../../aspose.gis.geometries/igeometry/getextent/)() | Calcula y devuelve una extensión límite de esta geometría. |
| [GetLength](../../aspose.gis.geometries/igeometry/getlength/)() | Calcula la longitud de esta geometría. |
| [Intersection](../../aspose.gis.geometries/igeometry/intersection/)(IGeometry) | Construye una intersección entre esta geometría y una geometría especificada. |
| [Intersects](../../aspose.gis.geometries/igeometry/intersects/#intersects)(Extent) | Determina si esta geometría se cruza con una extensión especificada. |
| [Intersects](../../aspose.gis.geometries/igeometry/intersects/#intersects_1)(IGeometry) | Determina si esta geometría y una geometría específica se cruzan. |
| [Overlaps](../../aspose.gis.geometries/igeometry/overlaps/)(IGeometry) | Determina si esta geometría se superpone con una geometría especificada. |
| [Relate](../../aspose.gis.geometries/igeometry/relate/)(IGeometry, string) | Determina si la matriz de intersección DE-9IM de esta geometría y una geometría específica coinciden con el patrón proporcionado. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/igeometry/replacepolygonsbylines/)() | Obtiene los polígonos representados como líneas de esta geometría. |
| [SpatiallyContains](../../aspose.gis.geometries/igeometry/spatiallycontains/)(IGeometry) | Determina si esta geometría contiene espacialmente una geometría específica. |
| [SpatiallyEquals](../../aspose.gis.geometries/igeometry/spatiallyequals/)(IGeometry) | Determina si esta geometría es espacialmente igual a una geometría especificada. |
| [SymDifference](../../aspose.gis.geometries/igeometry/symdifference/)(IGeometry) | Construye una diferencia simétrica entre esta geometría y una geometría especificada. |
| [ToEditable](../../aspose.gis.geometries/igeometry/toeditable/#toeditable)() | Obtiene una copia editable de esta geometría. |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/igeometry/toeditable/#toeditable_1)() | Obtiene una copia editable de esta geometría. |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometry/tolineargeometry/#tolineargeometry)() | Obtiene una versión no curva aproximada o equivalente de esta geometría usando el valor predeterminado`tolerancia` . |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometry/tolineargeometry/#tolineargeometry_1)(double) | Obtiene una versión no curva aproximada o equivalente de esta geometría usando el`tolerancia` . |
| [Touches](../../aspose.gis.geometries/igeometry/touches/)(IGeometry) | Determina si esta geometría y una geometría específica se tocan. |
| [Union](../../aspose.gis.geometries/igeometry/union/)(IGeometry) | Une esta geometría y una geometría especificada. |
| [Within](../../aspose.gis.geometries/igeometry/within/#within)(Extent) | Determina si esta geometría está dentro de una extensión especificada. |
| [Within](../../aspose.gis.geometries/igeometry/within/#within_1)(IGeometry) | Determina si esta geometría está dentro de una geometría especificada. |

### Ver también

* espacio de nombres [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* asamblea [Aspose.GIS](../../)


