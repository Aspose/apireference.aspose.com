---
title: IGeometry
second_title: Aspose.GIS für .NET-API-Referenz
description: Die Schnittstellenstammklasse der Geometriehierarchie
type: docs
weight: 900
url: /de/net/aspose.gis.geometries/igeometry/
---
## IGeometry interface

Die Schnittstellenstammklasse der Geometriehierarchie

```csharp
public interface IGeometry
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Dimension](../../aspose.gis.geometries/igeometry/dimension) { get; } | Ruft die topologische Dimension davon ab[`IGeometry`](../igeometry) . Wenn die Dimension unbekannt ist (z. B. bei einer leeren GEOMETRYCOLLECTION)Point wird zurückgegeben. |
| [GeometryType](../../aspose.gis.geometries/igeometry/geometrytype) { get; } | Ruft den Typ der Geometrie ab. |
| [HasCurveGeometry](../../aspose.gis.geometries/igeometry/hascurvegeometry) { get; } | Ruft einen Wert ab, der angibt, ob diese Geometrie Kurvengeometrie (nicht linear) ist oder enthält. |
| [HasM](../../aspose.gis.geometries/igeometry/hasm) { get; } | Ruft einen Wert ab, der angibt, ob diese Instanz eine M-Koordinate hat. |
| [HasZ](../../aspose.gis.geometries/igeometry/hasz) { get; } | Ruft einen Wert ab, der angibt, ob diese Instanz eine Z-Koordinate hat. |
| [IsEmpty](../../aspose.gis.geometries/igeometry/isempty) { get; } | Ruft einen Wert ab, der angibt, ob diese Instanz leer ist (repräsentiert die leere Punktmenge). |
| [IsSimple](../../aspose.gis.geometries/igeometry/issimple) { get; } | Ruft einen Wert ab, der angibt, ob diese Instanz aus SFA-Sicht einfach ist. |
| [IsValid](../../aspose.gis.geometries/igeometry/isvalid) { get; } | Ruft einen Wert ab, der angibt, ob diese Instanz gültig ist. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/igeometry/spatialreferencesystem) { get; } | Ruft SpatialReferenceSystem dieser Instanz ab. Diese Eigenschaft kann sein`null` , wenn SpatialReferenceSystem unbekannt ist. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/igeometry/asbinary#asbinary)() | Übersetzt diese Geometrie in ihre bekannte binäre Darstellung. |
| [AsBinary](../../aspose.gis.geometries/igeometry/asbinary#asbinary_1)(WkbVariant) | Übersetzt diese Geometrie in ihre bekannte binäre Darstellung. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage#asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | Exportieren Sie diese Geometrie in eine Bilddarstellung. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage#asimage_1)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportieren Sie diese Geometrie in eine Bilddarstellung. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage#asimage_2)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportieren Sie diese Geometrie in eine Bilddarstellung. |
| [AsText](../../aspose.gis.geometries/igeometry/astext#astext)() | Übersetzt diese Geometrie in ihre bekannte Textdarstellung. |
| [AsText](../../aspose.gis.geometries/igeometry/astext#astext_1)(WktVariant) | Übersetzt diese Geometrie in ihre bekannte Textdarstellung. |
| [AsText](../../aspose.gis.geometries/igeometry/astext#astext_2)(WktVariant, NumericFormat) | Übersetzt diese Geometrie in ihre bekannte Textdarstellung. |
| [Clone](../../aspose.gis.geometries/igeometry/clone)() | Klont diese Instanz. |
| [CoveredBy](../../aspose.gis.geometries/igeometry/coveredby)(IGeometry) | Bestimmt, ob diese Geometrie von einer angegebenen Geometrie abgedeckt wird. |
| [Covers](../../aspose.gis.geometries/igeometry/covers)(IGeometry) | Bestimmt, ob diese Geometrie eine bestimmte Geometrie abdeckt. |
| [Crosses](../../aspose.gis.geometries/igeometry/crosses)(IGeometry) | Bestimmt, ob sich diese Geometrie und eine angegebene Geometrie kreuzen. |
| [Difference](../../aspose.gis.geometries/igeometry/difference)(IGeometry) | Subtrahiert eine angegebene Geometrie von dieser Geometrie. |
| [Disjoint](../../aspose.gis.geometries/igeometry/disjoint)(IGeometry) | Bestimmt, ob diese Geometrie von einer angegebenen Geometrie disjunkt ist. |
| [GetArea](../../aspose.gis.geometries/igeometry/getarea)() | Berechnet die Fläche dieser Geometrie. |
| [GetBuffer](../../aspose.gis.geometries/igeometry/getbuffer)(double, int) | Berechnet einen Pufferbereich um diese Geometrie herum. |
| [GetCentroid](../../aspose.gis.geometries/igeometry/getcentroid)() | Berechnet den Schwerpunkt dieser Geometrie. |
| [GetConvexHull](../../aspose.gis.geometries/igeometry/getconvexhull)() | Berechnet die konvexe Hülle dieser Geometrie. |
| [GetDistanceTo](../../aspose.gis.geometries/igeometry/getdistanceto)(IGeometry) | Berechnet den Mindestabstand zwischen dieser Geometrie und einer angegebenen Geometrie. |
| [GetExtent](../../aspose.gis.geometries/igeometry/getextent)() | Berechnet und gibt eine Begrenzungsausdehnung dieser Geometrie zurück. |
| [GetLength](../../aspose.gis.geometries/igeometry/getlength)() | Berechnet die Länge dieser Geometrie. |
| [Intersection](../../aspose.gis.geometries/igeometry/intersection)(IGeometry) | Erstellt einen Schnittpunkt zwischen dieser Geometrie und einer angegebenen Geometrie. |
| [Intersects](../../aspose.gis.geometries/igeometry/intersects#intersects)(Extent) | Bestimmt, ob diese Geometrie eine bestimmte Ausdehnung schneidet. |
| [Intersects](../../aspose.gis.geometries/igeometry/intersects#intersects_1)(IGeometry) | Bestimmt, ob sich diese Geometrie und eine angegebene Geometrie schneiden. |
| [Overlaps](../../aspose.gis.geometries/igeometry/overlaps)(IGeometry) | Bestimmt, ob sich diese Geometrie mit einer bestimmten Geometrie überschneidet. |
| [Relate](../../aspose.gis.geometries/igeometry/relate)(IGeometry, string) | Bestimmt, ob die DE-9IM-Schnittpunktmatrix dieser Geometrie und einer bestimmten Geometrie mit dem bereitgestellten Muster übereinstimmt. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/igeometry/replacepolygonsbylines)() | Ruft Polygone ab, die als Linien dieser Geometrie dargestellt werden. |
| [SpatiallyContains](../../aspose.gis.geometries/igeometry/spatiallycontains)(IGeometry) | Bestimmt, ob diese Geometrie räumlich eine bestimmte Geometrie enthält. |
| [SpatiallyEquals](../../aspose.gis.geometries/igeometry/spatiallyequals)(IGeometry) | Bestimmt, ob diese Geometrie räumlich gleich einer bestimmten Geometrie ist. |
| [SymDifference](../../aspose.gis.geometries/igeometry/symdifference)(IGeometry) | Erstellt eine symmetrische Differenz zwischen dieser Geometrie und einer angegebenen Geometrie. |
| [ToEditable](../../aspose.gis.geometries/igeometry/toeditable#toeditable)() | Ruft eine bearbeitbare Kopie dieser Geometrie ab. |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/igeometry/toeditable#toeditable_1)() | Ruft eine bearbeitbare Kopie dieser Geometrie ab. |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometry/tolineargeometry#tolineargeometry)() | Ruft eine ungefähre oder äquivalente Nicht-Kurven-Version dieser Geometrie unter Verwendung der Vorgabe ab`Toleranz` . |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometry/tolineargeometry#tolineargeometry_1)(double) | Ruft eine ungefähre oder äquivalente Nicht-Kurven-Version dieser Geometrie unter Verwendung der angegebenen ab`Toleranz` . |
| [Touches](../../aspose.gis.geometries/igeometry/touches)(IGeometry) | Bestimmt, ob sich diese Geometrie und eine bestimmte Geometrie berühren. |
| [Union](../../aspose.gis.geometries/igeometry/union)(IGeometry) | Vereint diese Geometrie und eine angegebene Geometrie. |
| [Within](../../aspose.gis.geometries/igeometry/within#within)(Extent) | Bestimmt, ob sich diese Geometrie innerhalb einer bestimmten Ausdehnung befindet. |
| [Within](../../aspose.gis.geometries/igeometry/within#within_1)(IGeometry) | Bestimmt, ob diese Geometrie innerhalb einer angegebenen Geometrie liegt. |

### Siehe auch

* namensraum [Aspose.Gis.Geometries](../../aspose.gis.geometries)
* Montage [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
