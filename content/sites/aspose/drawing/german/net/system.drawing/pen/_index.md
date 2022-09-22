---
title: Pen
second_title: Aspose.Drawing für .NET-API-Referenz
description: Definiert ein Objekt zum Zeichnen von Linien und Kurven.
type: docs
weight: 910
url: /de/net/system.drawing/pen/
---
## Pen class

Definiert ein Objekt zum Zeichnen von Linien und Kurven.

```csharp
public class Pen : IDisposable
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [Pen](pen#constructor)(Brush) | Initialisiert eine neue Instanz von[`Pen`](../pen) Klasse mit den angegebenenBrush . |
| [Pen](pen#constructor_2)(Color) | Initialisiert eine neue Instanz von[`Pen`](../pen) Klasse mit den angegebenenColor . |
| [Pen](pen#constructor_1)(Brush, float) | Initialisiert eine neue Instanz der Pen-Klasse mit dem angegebenen Pinsel und der angegebenen Breite. |
| [Pen](pen#constructor_3)(Color, float) | Initialisiert eine neue Instanz der Pen-Klasse mit den angegebenen Color- und Width-Eigenschaften. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Alignment](../../system.drawing/pen/alignment) { get; set; } | Holt oder setzt die Ausrichtung dafürPen . |
| [Brush](../../system.drawing/pen/brush) { get; set; } | Holt oder setzt den Pinsel, der dessen Attribute bestimmtPen . |
| [Color](../../system.drawing/pen/color) { get; set; } | Holt oder setzt die Farbe davonPen . |
| [CompoundArray](../../system.drawing/pen/compoundarray) { get; set; } | Ruft ein Array von Werten ab oder legt es fest, das einen zusammengesetzten Stift angibt. Ein zusammengesetzter Stift zeichnet eine zusammengesetzte Linie, die aus parallelen Linien und Zwischenräumen besteht. |
| [CustomEndCap](../../system.drawing/pen/customendcap) { get; set; } | Ruft eine benutzerdefinierte Obergrenze ab oder legt sie fest, die am Ende der damit gezeichneten Linien verwendet wirdPen . |
| [CustomStartCap](../../system.drawing/pen/customstartcap) { get; set; } | Ruft eine benutzerdefinierte Obergrenze ab oder legt sie fest, die am Anfang der damit gezeichneten Linien verwendet wirdPen . |
| [DashCap](../../system.drawing/pen/dashcap) { get; set; } | Ruft den Verschlussstil ab oder legt ihn fest, der am Ende der Bindestriche verwendet wird, aus denen die mit this gezeichneten gestrichelten Linien bestehen.Pen . |
| [DashOffset](../../system.drawing/pen/dashoffset) { get; set; } | Ruft den Abstand vom Anfang einer Linie zum Anfang eines Strichmusters ab oder legt ihn fest. |
| [DashPattern](../../system.drawing/pen/dashpattern) { get; set; } | Ruft ein Array benutzerdefinierter Bindestriche und Leerzeichen ab oder legt es fest. |
| [DashStyle](../../system.drawing/pen/dashstyle) { get; set; } | Ermittelt oder setzt den Stil, der für damit gezeichnete gestrichelte Linien verwendet wirdPen . |
| [EndCap](../../system.drawing/pen/endcap) { get; set; } | Ruft den am Ende der mit diesem Stift gezeichneten Linien verwendeten Stil ab oder legt ihn fest. |
| [LineJoin](../../system.drawing/pen/linejoin) { get; set; } | Ruft den Verbindungsstil für die Enden von zwei aufeinanderfolgenden Linien ab, die mit diesem Stift gezeichnet wurden, oder legt ihn fest. |
| [MiterLimit](../../system.drawing/pen/miterlimit) { get; set; } | Ruft die Grenze der Dicke der Verbindung an einer Gehrungsecke ab oder legt sie fest. |
| [PenType](../../system.drawing/pen/pentype) { get; } | Ruft den Stil der mit diesem Stift gezeichneten Linien ab. |
| [StartCap](../../system.drawing/pen/startcap) { get; set; } | Ruft den am Anfang von Linien, die mit diesem Stift gezeichnet werden, verwendeten Stil ab oder legt ihn fest. |
| [Transform](../../system.drawing/pen/transform) { get; set; } | Holt oder setzt eine Kopie der geometrischen Transformation dafürPen . |
| [Width](../../system.drawing/pen/width) { get; set; } | Ruft die Breite dieses Stifts ab oder legt sie fest, in Einheiten des Graphics-Objekts, das zum Zeichnen verwendet wird. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Clone](../../system.drawing/pen/clone)() | Erstellt eine exakte Kopie davonPen . |
| [Dispose](../../system.drawing/pen/dispose)() | Gibt alle von diesem Stift verwendeten Ressourcen frei. |
| [MultiplyTransform](../../system.drawing/pen/multiplytransform#multiplytransform)(Matrix) | Multipliziert dazu die TransformationsmatrixPen durch die angegebenenMatrix . |
| [MultiplyTransform](../../system.drawing/pen/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | Multipliziert dazu die TransformationsmatrixPen durch die angegebenenMatrix in der angegebenen Reihenfolge. |
| [ResetTransform](../../system.drawing/pen/resettransform)() | Setzt hierfür die geometrische Transformationsmatrix zurückPen zur Identität. |
| [RotateTransform](../../system.drawing/pen/rotatetransform#rotatetransform)(float) | Dreht die lokale geometrische Transformation um den angegebenen Winkel. Diese Methode stellt die Rotation der Transformation voran. |
| [RotateTransform](../../system.drawing/pen/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Dreht die lokale geometrische Transformation um den angegebenen Winkel in der angegebenen Reihenfolge. |
| [ScaleTransform](../../system.drawing/pen/scaletransform#scaletransform)(float, float) | Skaliert die lokale geometrische Transformation um die angegebenen Faktoren. Diese Methode stellt der Transformation die Skalierungsmatrix voran. |
| [ScaleTransform](../../system.drawing/pen/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Skaliert die lokale geometrische Transformation um die angegebenen Faktoren in der angegebenen Reihenfolge. |
| [SetLineCap](../../system.drawing/pen/setlinecap)(LineCap, LineCap, DashCap) | Legt die Werte fest, die den Stil der Kappe bestimmen, der verwendet wird, um damit gezeichnete Linien zu beenden[`Pen`](../pen) . |
| [TranslateTransform](../../system.drawing/pen/translatetransform#translatetransform)(float, float) | Verschiebt die lokale geometrische Transformation um die angegebenen Maße. Diese Methode stellt die Übersetzung der Transformation voran. |
| [TranslateTransform](../../system.drawing/pen/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Verschiebt die lokale geometrische Transformation um die angegebenen Dimensionen in der angegebenen Reihenfolge. |

### Siehe auch

* namensraum [System.Drawing](../../system.drawing)
* Montage [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
