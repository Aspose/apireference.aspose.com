---
title: Rectangle
second_title: Aspose.Drawing für .NET-API-Referenz
description: Speichert einen Satz von vier Ganzzahlen die die Position und Größe eines Rechtecks darstellen.
type: docs
weight: 1040
url: /de/net/system.drawing/rectangle/
---
## Rectangle structure

Speichert einen Satz von vier Ganzzahlen, die die Position und Größe eines Rechtecks darstellen.

```csharp
public struct Rectangle : IEquatable<Rectangle>
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [Rectangle](rectangle#constructor_1)(Point, Size) | Initialisiert eine neue Instanz von[`Rectangle`](../rectangle) struct mit der angegebenen Position und Größe. |
| [Rectangle](rectangle#constructor)(int, int, int, int) | Initialisiert eine neue Instanz der Rectangle-Struktur mit der angegebenen Position und Größe. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Bottom](../../system.drawing/rectangle/bottom) { get; } | Ruft die y-Koordinate ab, die die Summe der Y- und Height-Eigenschaftswerte dieser Rectangle-Struktur ist. |
| [Height](../../system.drawing/rectangle/height) { get; set; } | Ruft die Höhe dieser Rectangle-Struktur ab oder legt sie fest. |
| [IsEmpty](../../system.drawing/rectangle/isempty) { get; } | Ruft einen Wert ab, der angibt, ob alle numerischen Eigenschaften von this[`Rectangle`](../rectangle) Werte von Null haben. |
| [Left](../../system.drawing/rectangle/left) { get; } | Ruft die x-Koordinate der linken Kante dieser Rectangle-Struktur ab. |
| [Location](../../system.drawing/rectangle/location) { get; set; } | Holt oder setzt die Koordinaten der oberen linken Ecke davonRectangle Struktur. |
| [Right](../../system.drawing/rectangle/right) { get; } | Ruft die x-Koordinate ab, die die Summe der X- und Width-Eigenschaftswerte dieser Rectangle-Struktur ist. |
| [Size](../../system.drawing/rectangle/size) { get; set; } | Holt oder setzt die Größe davonRectangle . |
| [Top](../../system.drawing/rectangle/top) { get; } | Ruft die y-Koordinate der Oberkante dieser Rectangle-Struktur ab. |
| [Width](../../system.drawing/rectangle/width) { get; set; } | Ruft die Breite dieser Rectangle-Struktur ab oder legt sie fest. |
| [X](../../system.drawing/rectangle/x) { get; set; } | Ruft die x-Koordinate der oberen linken Ecke dieser Rectangle-Struktur ab oder legt sie fest. |
| [Y](../../system.drawing/rectangle/y) { get; set; } | Ruft die y-Koordinate der oberen linken Ecke dieser Rectangle-Struktur ab oder legt sie fest. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| static [Ceiling](../../system.drawing/rectangle/ceiling)(RectangleF) | Konvertiert die angegebeneRectangleF Struktur zu aRectangle Struktur durch Rundung derRectangleF Werte auf die nächsthöheren ganzzahligen Werte. |
| static [FromLTRB](../../system.drawing/rectangle/fromltrb)(int, int, int, int) | Erstellt einRectangle Struktur mit den angegebenen Kantenpositionen. |
| static [Inflate](../../system.drawing/rectangle/inflate)(Rectangle, int, int) | Erstellt ein[`Rectangle`](../rectangle) das um den angegebenen Betrag aufgeblasen wird. |
| static [Intersect](../../system.drawing/rectangle/intersect)(Rectangle, Rectangle) | Gibt ein Drittel zurückRectangle Struktur, die die Schnittmenge von zwei anderen darstelltRectangle Strukturen. Wenn es keine Schnittmenge gibt, ein LeerzeichenRectangle wird zurückgegeben. |
| static [Round](../../system.drawing/rectangle/round)(RectangleF) | Konvertiert die angegebeneRectangleF zu einemRectangle durch Rundung dieRectangleFWerte auf die nächsten ganzzahligen Werte. |
| static [Truncate](../../system.drawing/rectangle/truncate)(RectangleF) | Konvertiert die angegebeneRectangleF zu einemRectangle durch Abschneiden derRectangleF Werte. |
| static [Union](../../system.drawing/rectangle/union)(Rectangle, Rectangle) | erhält aRectangle Struktur, die die Vereinigung von zwei enthältRectangle Strukturen. |
| [Contains](../../system.drawing/rectangle/contains#contains_1)(Point) | Bestimmt, ob der angegebene Punkt darin enthalten istRectangle Struktur. |
| [Contains](../../system.drawing/rectangle/contains#contains_2)(Rectangle) | Bestimmt, ob der rechteckige Bereich dargestellt wird durch*rect* ist vollständig innerhalb des rechteckigen Bereichs enthalten, der dadurch dargestellt wird[`Rectangle`](../rectangle) . |
| [Contains](../../system.drawing/rectangle/contains#contains)(int, int) | Bestimmt, ob der angegebene Punkt darin enthalten istRectangle Struktur. |
| override [Equals](../../system.drawing/rectangle/equals#equals_1)(object) | Testet, ob obj a istRectangle Struktur mit der gleichen Lage und Größe von diesemRectangle Struktur. |
| [Equals](../../system.drawing/rectangle/equals#equals)(Rectangle) | Testet ob andere[`Rectangle`](../rectangle) Struktur hat die gleiche Lage und Größe von diesem[`Rectangle`](../rectangle) Struktur. |
| override [GetHashCode](../../system.drawing/rectangle/gethashcode)() | Gibt den Hash-Code dafür zurückRectangle Struktur. Informationen zur Verwendung von Hashcodes finden Sie unter GetHashCode . |
| [Inflate](../../system.drawing/rectangle/inflate#inflate_1)(Size) | Vergrößert diesRectangle um den angegebenen Betrag. |
| [Inflate](../../system.drawing/rectangle/inflate#inflate)(int, int) | Vergrößert diesRectangle um den angegebenen Betrag. |
| [Intersect](../../system.drawing/rectangle/intersect)(Rectangle) | Ersetzt diesRectanglemit dem Schnittpunkt von sich selbst und dem angegebenenRectangle . |
| [IntersectsWith](../../system.drawing/rectangle/intersectswith)(Rectangle) | Bestimmt, ob sich dieses Rechteck mit schneidet*rect* . |
| [Offset](../../system.drawing/rectangle/offset#offset_1)(Point) | Passt die Position dieses Rechtecks um den angegebenen Betrag an. |
| [Offset](../../system.drawing/rectangle/offset#offset)(int, int) | Passt die Position dieses Rechtecks um den angegebenen Betrag an. |
| override [ToString](../../system.drawing/rectangle/tostring)() | Wandelt die Attribute davon um[`Rectangle`](../rectangle) zu einer für Menschen lesbaren Zeichenfolge. |
| [operator ==](../../system.drawing/rectangle/op_equality) | Testet ob zweiRectangle Strukturen haben dieselbe Position und Größe. |
| [operator !=](../../system.drawing/rectangle/op_inequality) | Testet ob zweiRectangle Strukturen unterscheiden sich in Lage oder Größe. |

## Felder

| Name | Beschreibung |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectangle/empty) | steht für aRectangle Struktur mit nicht initialisierten Eigenschaften. |

### Siehe auch

* namensraum [System.Drawing](../../system.drawing)
* Montage [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
