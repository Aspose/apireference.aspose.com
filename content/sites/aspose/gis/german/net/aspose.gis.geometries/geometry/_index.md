---
title: Geometry
second_title: Aspose.GIS für .NET-API-Referenz
description: Die abstrakte Stammklasse der Geometriehierarchie.
type: docs
weight: 820
url: /de/net/aspose.gis.geometries/geometry/
---
## Geometry class

Die abstrakte Stammklasse der Geometriehierarchie.

```csharp
public abstract class Geometry : IGeometry
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension) { get; } | Liefert die Anzahl der Koordinatendimensionen dafür[`Geometry`](../geometry) . |
| abstract [Dimension](../../aspose.gis.geometries/geometry/dimension) { get; } | Ruft die topologische Dimension davon ab[`Geometry`](../geometry) . Wenn die Dimension unbekannt ist (z. B. bei einer leeren GEOMETRYCOLLECTION)Point wird zurückgegeben. |
| abstract [GeometryType](../../aspose.gis.geometries/geometry/geometrytype) { get; } | Ruft den Typ der Geometrie ab. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry) { get; } | Ruft einen Wert ab, der angibt, ob diese Geometrie Kurvengeometrie (nicht linear) ist oder enthält. |
| virtual [HasM](../../aspose.gis.geometries/geometry/hasm) { get; set; } | Ruft einen Wert ab, der angibt, ob diese Instanz eine M-Koordinate hat. |
| virtual [HasZ](../../aspose.gis.geometries/geometry/hasz) { get; set; } | Ruft einen Wert ab, der angibt, ob diese Instanz eine Z-Koordinate hat. |
| virtual [IsEmpty](../../aspose.gis.geometries/geometry/isempty) { get; } | Ruft einen Wert ab, der angibt, ob diese Instanz leer ist. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple) { get; } | Ruft einen Wert ab, der angibt, ob diese Instanz aus SFA-Sicht einfach ist. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid) { get; } | Ruft einen Wert ab, der angibt, ob diese Instanz gültig ist. |
| abstract [SpatialReferenceSystem](../../aspose.gis.geometries/geometry/spatialreferencesystem) { get; set; } | Ruft SpatialReferenceSystem dieser Instanz ab. Diese Eigenschaft kann sein`null` , ist SpatialReferenceSystem ist unbekannt. Beim Zuweisen eines neuen SpatialReferenceSystem wird keine Koordinatentransformation durchgeführt, nur die Referenz ändert sich. |
| static [Null](../../aspose.gis.geometries/geometry/null) { get; } | Ruft eine Instanz von Nullgeometrie ab. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary#asbinary)() | Übersetzt diese Geometrie in ihre bekannte binäre Darstellung. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary#asbinary_1)(WkbVariant) | Übersetzt diese Geometrie in ihre bekannte binäre Darstellung. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage#asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | Exportieren Sie diese Geometrie in eine Bilddarstellung. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage#asimage_1)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportieren Sie diese Geometrie in eine Bilddarstellung. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage#asimage_2)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportieren Sie diese Geometrie in eine Bilddarstellung. |
| [AsText](../../aspose.gis.geometries/geometry/astext#astext)() | Übersetzt diese Geometrie in ihre bekannte Textdarstellung. |
| [AsText](../../aspose.gis.geometries/geometry/astext#astext_1)(WktVariant) | Übersetzt diese Geometrie in ihre bekannte Textdarstellung. |
| [AsText](../../aspose.gis.geometries/geometry/astext#astext_2)(WktVariant, NumericFormat) | Übersetzt diese Geometrie in ihre bekannte Textdarstellung. |
| abstract [Clone](../../aspose.gis.geometries/geometry/clone)() | Klont diese Instanz. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby)(IGeometry) | Bestimmt, ob diese Geometrie von einer angegebenen Geometrie abgedeckt wird. |
| [Covers](../../aspose.gis.geometries/geometry/covers)(IGeometry) | Bestimmt, ob diese Geometrie eine bestimmte Geometrie abdeckt. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses)(IGeometry) | Bestimmt, ob sich diese Geometrie und eine angegebene Geometrie kreuzen. |
| [Difference](../../aspose.gis.geometries/geometry/difference)(IGeometry) | Subtrahiert eine angegebene Geometrie von dieser Geometrie. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint)(IGeometry) | Bestimmt, ob diese Geometrie von einer angegebenen Geometrie disjunkt ist. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea)() | Berechnet die Fläche dieser Geometrie. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer)(double, int) | Berechnet einen Pufferbereich um diese Geometrie herum. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid)() | Berechnet den Schwerpunkt dieser Geometrie. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull)() | Berechnet die konvexe Hülle dieser Geometrie. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto)(IGeometry) | Berechnet den Mindestabstand zwischen dieser Geometrie und einer angegebenen Geometrie. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent)() | Berechnet und gibt eine Begrenzungsausdehnung dieser Geometrie zurück. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength)() | Berechnet die Länge dieser Geometrie. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection)(IGeometry) | Erstellt einen Schnittpunkt zwischen dieser Geometrie und einer angegebenen Geometrie. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects#intersects)(Extent) | Bestimmt, ob diese Geometrie eine bestimmte Ausdehnung schneidet. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects#intersects_1)(IGeometry) | Bestimmt, ob sich diese Geometrie und eine angegebene Geometrie schneiden. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps)(IGeometry) | Bestimmt, ob sich diese Geometrie mit einer bestimmten Geometrie überschneidet. |
| [Relate](../../aspose.gis.geometries/geometry/relate)(IGeometry, string) | Bestimmt, ob die DE-9IM-Schnittpunktmatrix dieser Geometrie und einer bestimmten Geometrie mit dem bereitgestellten Muster übereinstimmt. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines)() | Ruft Polygone ab, die als Linien dieser Geometrie dargestellt werden. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm)(int) | Rundet die M-Koordinate auf eine angegebene Anzahl von Nachkommastellen. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy)(int) | Rundet X- und Y-Koordinaten auf eine angegebene Anzahl von Nachkommastellen. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz)(int) | Rundet die Z-Koordinate auf eine angegebene Anzahl von Nachkommastellen. |
| virtual [SetEmpty](../../aspose.gis.geometries/geometry/setempty)() | Macht das[`Geometry`](../geometry) leer. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains)(IGeometry) | Bestimmt, ob diese Geometrie räumlich eine bestimmte Geometrie enthält. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals)(IGeometry) | Bestimmt, ob diese Geometrie räumlich gleich einer bestimmten Geometrie ist. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference)(IGeometry) | Erstellt eine symmetrische Differenz zwischen dieser Geometrie und einer angegebenen Geometrie. |
| [ToEditable](../../aspose.gis.geometries/geometry/toeditable#toeditable)() | Ruft eine bearbeitbare Kopie dieser Geometrie ab. |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable#toeditable_1)() | Ruft eine bearbeitbare Kopie dieser Geometrie ab. |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry#tolineargeometry)() | Ruft eine ungefähre oder äquivalente Nicht-Kurven-Version dieser Geometrie unter Verwendung der Vorgabe ab`Toleranz` . |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry#tolineargeometry_1)(double) | Ruft eine ungefähre oder äquivalente Nicht-Kurven-Version dieser Geometrie unter Verwendung der angegebenen ab`Toleranz` . |
| override [ToString](../../aspose.gis.geometries/geometry/tostring)() | Gibt eine Zeichenfolge zurück, die das aktuelle Objekt darstellt. |
| [Touches](../../aspose.gis.geometries/geometry/touches)(IGeometry) | Bestimmt, ob sich diese Geometrie und eine bestimmte Geometrie berühren. |
| [Union](../../aspose.gis.geometries/geometry/union)(IGeometry) | Vereint diese Geometrie und eine angegebene Geometrie. |
| [Within](../../aspose.gis.geometries/geometry/within#within)(Extent) | Bestimmt, ob sich diese Geometrie innerhalb einer bestimmten Ausdehnung befindet. |
| [Within](../../aspose.gis.geometries/geometry/within#within_1)(IGeometry) | Bestimmt, ob diese Geometrie innerhalb einer angegebenen Geometrie liegt. |
| static [FromBinary](../../aspose.gis.geometries/geometry/frombinary#frombinary)(byte[]) | Erstellt eine Geometrie aus ihrer bekannten binären Darstellung. |
| static [FromBinary](../../aspose.gis.geometries/geometry/frombinary#frombinary_1)(byte[], SpatialReferenceSystem) | Erstellt eine Geometrie aus ihrer bekannten binären Darstellung. |
| static [FromText](../../aspose.gis.geometries/geometry/fromtext#fromtext)(string) | Erstellt eine Geometrie aus ihrer bekannten Textdarstellung. |
| static [FromText](../../aspose.gis.geometries/geometry/fromtext#fromtext_1)(string, SpatialReferenceSystem) | Erstellt eine Geometrie aus ihrer bekannten Textdarstellung. |

### Siehe auch

* interface [IGeometry](../igeometry)
* namensraum [Aspose.Gis.Geometries](../../aspose.gis.geometries)
* Montage [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
