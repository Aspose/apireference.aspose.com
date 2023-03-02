---
title: Class Point
second_title: Aspose.GIS für .NET-API-Referenz
description: Aspose.Gis.Geometries.Point klas. APoint stellt einen einzelnen Ort im Koordinatenraum dar.
type: docs
weight: 1190
url: /de/net/aspose.gis.geometries/point/
---
## Point class

A`Point` stellt einen einzelnen Ort im Koordinatenraum dar.

```csharp
public class Point : Geometry, IPoint
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [Point](point/#constructor)() | Initialisiert eine neue Instanz von`Point` Klasse. |
| [Point](point/#constructor_1)(IPoint) | Initialisiert eine neue Instanz von`Point` Klasse. |
| [Point](point/#constructor_2)(double, double) | Initialisiert eine neue Instanz von`Point` Klasse. |
| [Point](point/#constructor_3)(double, double, double) | Initialisiert eine neue Instanz von`Point` Klasse. |
| [Point](point/#constructor_4)(double, double, double, double) | Initialisiert eine neue Instanz von`Point` Klasse. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | Liefert die Anzahl der Koordinatendimensionen dafür[`Geometry`](../geometry/) . |
| override [Dimension](../../aspose.gis.geometries/point/dimension/) { get; } | Ruft die topologische Dimension davon ab[`Geometry`](../geometry/) . |
| override [GeometryType](../../aspose.gis.geometries/point/geometrytype/) { get; } | Ruft den Typ der Geometrie ab. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry/) { get; } | Ruft einen Wert ab, der angibt, ob diese Geometrie Kurvengeometrie (nicht linear) ist oder enthält. |
| override [HasM](../../aspose.gis.geometries/point/hasm/) { get; set; } | Ruft einen Wert ab, der angibt, ob diese Instanz eine M-Koordinate hat. |
| override [HasZ](../../aspose.gis.geometries/point/hasz/) { get; set; } | Ruft einen Wert ab, der angibt, ob diese Instanz eine Z-Koordinate hat. |
| virtual [IsEmpty](../../aspose.gis.geometries/geometry/isempty/) { get; } | Ruft einen Wert ab, der angibt, ob diese Instanz leer ist. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | Ruft einen Wert ab, der angibt, ob diese Instanz aus SFA-Sicht einfach ist. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | Ruft einen Wert ab, der angibt, ob diese Instanz gültig ist. |
| [M](../../aspose.gis.geometries/point/m/) { get; set; } | Holt oder setzt einen Wert für die m-Koordinate. |
| override [SpatialReferenceSystem](../../aspose.gis.geometries/point/spatialreferencesystem/) { get; set; } | Ruft SpatialReferenceSystem dieser Instanz ab. Diese Eigenschaft kann sein`null` , ist SpatialReferenceSystem ist unbekannt. Beim Zuweisen eines neuen SpatialReferenceSystem wird keine Koordinatentransformation durchgeführt, nur die Referenz ändert sich. |
| [X](../../aspose.gis.geometries/point/x/) { get; set; } | Liest oder setzt einen Wert für die x-Koordinate. |
| [Y](../../aspose.gis.geometries/point/y/) { get; set; } | Holt oder setzt einen Wert für die y-Koordinate. |
| [Z](../../aspose.gis.geometries/point/z/) { get; set; } | Ruft einen Wert für die Z-Koordinate ab oder legt ihn fest. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | Übersetzt diese Geometrie in ihre bekannte binäre Darstellung. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | Übersetzt diese Geometrie in ihre bekannte binäre Darstellung. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | Exportieren Sie diese Geometrie in eine Bilddarstellung. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportieren Sie diese Geometrie in eine Bilddarstellung. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportieren Sie diese Geometrie in eine Bilddarstellung. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | Übersetzt diese Geometrie in ihre bekannte Textdarstellung. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | Übersetzt diese Geometrie in ihre bekannte Textdarstellung. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | Übersetzt diese Geometrie in ihre bekannte Textdarstellung. |
| override [Clone](../../aspose.gis.geometries/point/clone/)() | Klont diese Instanz. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | Bestimmt, ob diese Geometrie von einer angegebenen Geometrie abgedeckt wird. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | Bestimmt, ob diese Geometrie eine bestimmte Geometrie abdeckt. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | Bestimmt, ob sich diese Geometrie und eine angegebene Geometrie kreuzen. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | Subtrahiert eine angegebene Geometrie von dieser Geometrie. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | Bestimmt, ob diese Geometrie von einer angegebenen Geometrie disjunkt ist. |
| [Equals](../../aspose.gis.geometries/point/equals/#equals)(IPoint) | Gibt an, ob das aktuelle Objekt gleich einem anderen Objekt desselben Typs ist. |
| override [Equals](../../aspose.gis.geometries/point/equals/#equals_1)(object) | Bestimmt, ob das angegebene Objekt gleich dem aktuellen Objekt ist. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | Berechnet die Fläche dieser Geometrie. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | Berechnet einen Pufferbereich um diese Geometrie herum. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | Berechnet den Schwerpunkt dieser Geometrie. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | Berechnet die konvexe Hülle dieser Geometrie. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | Berechnet den Mindestabstand zwischen dieser Geometrie und einer angegebenen Geometrie. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | Berechnet und gibt eine Begrenzungsausdehnung dieser Geometrie zurück. |
| override [GetHashCode](../../aspose.gis.geometries/point/gethashcode/)() | Dient als Standard-Hash-Funktion. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | Berechnet die Länge dieser Geometrie. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | Erstellt einen Schnittpunkt zwischen dieser Geometrie und einer angegebenen Geometrie. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | Bestimmt, ob diese Geometrie eine bestimmte Ausdehnung schneidet. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | Bestimmt, ob sich diese Geometrie und eine angegebene Geometrie schneiden. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | Bestimmt, ob sich diese Geometrie mit einer bestimmten Geometrie überschneidet. |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | Bestimmt, ob die DE-9IM-Schnittpunktmatrix dieser Geometrie und einer bestimmten Geometrie mit dem bereitgestellten Muster übereinstimmt. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | Ruft Polygone ab, die als Linien dieser Geometrie dargestellt werden. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | Rundet die M-Koordinate auf eine angegebene Anzahl von Nachkommastellen. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | Rundet X- und Y-Koordinaten auf eine angegebene Anzahl von Nachkommastellen. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Rundet die Z-Koordinate auf eine angegebene Anzahl von Nachkommastellen. |
| override [SetEmpty](../../aspose.gis.geometries/point/setempty/)() | Macht das[`Geometry`](../geometry/) leer. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | Bestimmt, ob diese Geometrie räumlich eine bestimmte Geometrie enthält. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | Bestimmt, ob diese Geometrie räumlich gleich einer bestimmten Geometrie ist. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | Erstellt eine symmetrische Differenz zwischen dieser Geometrie und einer angegebenen Geometrie. |
| [ToEditable](../../aspose.gis.geometries/point/toeditable/#toeditable_1)() | Ruft eine bearbeitbare Kopie dieser Geometrie ab. (2 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | Ruft eine bearbeitbare Kopie dieser Geometrie ab. |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry/)() | Ruft eine ungefähre oder äquivalente Nicht-Kurven-Version dieser Geometrie unter Verwendung der Vorgabe ab`Toleranz` . |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry/)(double) | Ruft eine ungefähre oder äquivalente Nicht-Kurven-Version dieser Geometrie unter Verwendung der angegebenen ab`Toleranz` . |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | Gibt eine Zeichenfolge zurück, die das aktuelle Objekt darstellt. |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | Bestimmt, ob sich diese Geometrie und eine bestimmte Geometrie berühren. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | Vereint diese Geometrie und eine angegebene Geometrie. |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | Bestimmt, ob sich diese Geometrie innerhalb einer bestimmten Ausdehnung befindet. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | Bestimmt, ob diese Geometrie innerhalb einer angegebenen Geometrie liegt. |
| [operator ==](../../aspose.gis.geometries/point/op_equality/) | Implementiert den Operator ==. |
| [operator !=](../../aspose.gis.geometries/point/op_inequality/) | Implementiert den Operator !=. |

### Siehe auch

* class [Geometry](../geometry/)
* interface [IPoint](../ipoint/)
* namensraum [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* Montage [Aspose.GIS](../../)


