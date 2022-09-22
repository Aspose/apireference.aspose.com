---
title: RectangleF
second_title: Aspose.Drawing für .NET-API-Referenz
description: Speichert einen Satz von vier Fließkommazahlen die die Position und Größe eines Rechtecks darstellen. Verwenden Sie für erweiterte Regionsfunktionen ein RegionObjekt.
type: docs
weight: 1050
url: /de/net/system.drawing/rectanglef/
---
## RectangleF structure

Speichert einen Satz von vier Fließkommazahlen, die die Position und Größe eines Rechtecks darstellen. Verwenden Sie für erweiterte Regionsfunktionen ein Region-Objekt.

```csharp
public struct RectangleF : IEquatable<RectangleF>
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [RectangleF](rectanglef#constructor_1)(PointF, SizeF) | Initialisiert eine neue Instanz der RectangleF-Struktur mit der angegebenen Position und Größe. |
| [RectangleF](rectanglef#constructor)(float, float, float, float) | Initialisiert eine neue Instanz der RectangleF-Struktur mit der angegebenen Position und Größe. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Bottom](../../system.drawing/rectanglef/bottom) { get; } | Ruft die y-Koordinate ab, die die Summe von Y und Height dieser RectangleF-Struktur ist. |
| [Height](../../system.drawing/rectanglef/height) { get; set; } | Ruft die Höhe dieser RectangleF-Struktur ab oder legt sie fest. |
| [IsEmpty](../../system.drawing/rectanglef/isempty) { get; } | Ruft einen Wert ab, der angibt, ob dieWidth oderHeight property davonRectangleFhat den Wert null. |
| [Left](../../system.drawing/rectanglef/left) { get; } | Ruft die x-Koordinate der linken Kante dieser RectangleF-Struktur ab. |
| [Location](../../system.drawing/rectanglef/location) { get; set; } | Holt oder setzt die Koordinaten der oberen linken Ecke davonRectangleF Struktur. |
| [Right](../../system.drawing/rectanglef/right) { get; } | Ruft die x-Koordinate ab, die die Summe von X und Breite dieser RectangleF-Struktur ist. |
| [Size](../../system.drawing/rectanglef/size) { get; set; } | Holt oder setzt die Größe davonRectangleF . |
| [Top](../../system.drawing/rectanglef/top) { get; } | Ruft die y-Koordinate der Oberkante dieser RectangleF-Struktur ab. |
| [Width](../../system.drawing/rectanglef/width) { get; set; } | Ruft die Breite dieser RectangleF-Struktur ab oder legt sie fest. |
| [X](../../system.drawing/rectanglef/x) { get; set; } | Ruft die x-Koordinate der oberen linken Ecke dieser RectangleF-Struktur ab oder legt sie fest. |
| [Y](../../system.drawing/rectanglef/y) { get; set; } | Ruft die x-Koordinate der oberen linken Ecke dieser RectangleF-Struktur ab oder legt sie fest. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| static [FromLTRB](../../system.drawing/rectanglef/fromltrb)(float, float, float, float) | Erstellt eine RectangleF-Struktur mit einer oberen linken Ecke und einer unteren rechten Ecke an den angegebenen Positionen. |
| static [Inflate](../../system.drawing/rectanglef/inflate)(RectangleF, float, float) | Erstellt und gibt eine vergrößerte Kopie der angegebenen zurückRectangleF Struktur. Die Kopie wird um den angegebenen Betrag aufgeblasen. Das ursprüngliche Rechteck bleibt unverändert. |
| static [Intersect](../../system.drawing/rectanglef/intersect)(RectangleF, RectangleF) | Gibt a zurückRectangleF Struktur, die den Schnittpunkt zweier Rechtecke darstellt. Wenn es keinen Schnittpunkt gibt, und leerRectangleF wird zurückgegeben. |
| static [Union](../../system.drawing/rectanglef/union)(RectangleF, RectangleF) | Erstellt das kleinstmögliche dritte Rechteck, das beide von zwei Rechtecken enthalten kann, die eine Vereinigung bilden. |
| [Contains](../../system.drawing/rectanglef/contains#contains_1)(PointF) | Bestimmt, ob der angegebene Punkt darin enthalten istRectangleF Struktur. |
| [Contains](../../system.drawing/rectanglef/contains#contains_2)(RectangleF) | Bestimmt, ob der rechteckige Bereich dargestellt wird durch*rect* ist ganz darin enthaltenRectangleF Struktur. |
| [Contains](../../system.drawing/rectanglef/contains#contains)(float, float) | Bestimmt, ob der angegebene Punkt darin enthalten istRectangleF Struktur. |
| override [Equals](../../system.drawing/rectanglef/equals#equals_1)(object) | Bestimmt, ob die angegebeneObject , entspricht dieser Instanz. |
| [Equals](../../system.drawing/rectanglef/equals#equals)(RectangleF) | Testet ob andere[`RectangleF`](../rectanglef) Struktur hat die gleiche Lage und Größe von diesem[`RectangleF`](../rectanglef) Struktur. |
| override [GetHashCode](../../system.drawing/rectanglef/gethashcode)() | Gibt einen Hash-Code für diese Instanz zurück. |
| [Inflate](../../system.drawing/rectanglef/inflate#inflate_1)(SizeF) | bläst dies aufRectangleF um den angegebenen Betrag. |
| [Inflate](../../system.drawing/rectanglef/inflate#inflate)(float, float) | bläst dies aufRectangleF Struktur um den angegebenen Betrag. |
| [Intersect](../../system.drawing/rectanglef/intersect)(RectangleF) | Ersetzt diesRectangleF Struktur mit dem Schnittpunkt von sich selbst und dem angegebenen RectangleF Struktur. |
| [IntersectsWith](../../system.drawing/rectanglef/intersectswith)(RectangleF) | Bestimmt, ob sich dieses Rechteck mit schneidet*rect* . |
| [Offset](../../system.drawing/rectanglef/offset#offset_1)(PointF) | Passt die Position dieses Rechtecks um den angegebenen Betrag an. |
| [Offset](../../system.drawing/rectanglef/offset#offset)(float, float) | Passt die Position dieses Rechtecks um den angegebenen Betrag an. |
| override [ToString](../../system.drawing/rectanglef/tostring)() | Wandelt die Attribute davon um[`Rectangle`](../rectangle) zu einer für Menschen lesbaren Zeichenfolge. |
| [operator ==](../../system.drawing/rectanglef/op_equality) | Testet ob zweiRectangleF Strukturen haben dieselbe Position und Größe. |
| [implicit operator](../../system.drawing/rectanglef/op_implicit) | Konvertiert die angegebene Rectangle-Struktur in eine RectangleF-Struktur. |
| [operator !=](../../system.drawing/rectanglef/op_inequality) | Testet ob zweiRectangleF Strukturen unterscheiden sich in Lage oder Größe. |

## Felder

| Name | Beschreibung |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectanglef/empty) | Repräsentiert eine Instanz vonRectangleF Klasse mit nicht initialisierten Membern. |

### Siehe auch

* namensraum [System.Drawing](../../system.drawing)
* Montage [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
