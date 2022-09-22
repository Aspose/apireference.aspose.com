---
title: PathGradientBrush
second_title: Aspose.Drawing für .NET-API-Referenz
description: Kapselt aBrush Objekt das das Innere von a ausfülltGraphicsPath Objekt mit Farbverlauf. Diese Klasse kann nicht vererbt werden.
type: docs
weight: 400
url: /de/net/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class

Kapselt aBrush Objekt, das das Innere von a ausfülltGraphicsPath Objekt mit Farbverlauf. Diese Klasse kann nicht vererbt werden.

```csharp
public sealed class PathGradientBrush : Brush
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [PathGradientBrush](pathgradientbrush#constructor)(GraphicsPath) | Initialisiert eine neue Instanz von[`PathGradientBrush`](../pathgradientbrush) Klasse mit dem angegebenen Pfad. |
| [PathGradientBrush](pathgradientbrush#constructor_1)(PointF[]) | Initialisiert eine neue Instanz von[`PathGradientBrush`](../pathgradientbrush) Klasse mit den angegebenen Punkten. |
| [PathGradientBrush](pathgradientbrush#constructor_3)(Point[]) | Initialisiert eine neue Instanz von[`PathGradientBrush`](../pathgradientbrush) Klasse mit den angegebenen Punkten. |
| [PathGradientBrush](pathgradientbrush#constructor_2)(PointF[], WrapMode) | Initialisiert eine neue Instanz von[`PathGradientBrush`](../pathgradientbrush) Klasse mit den angegebenen Punkten und Wrap-Modus. |
| [PathGradientBrush](pathgradientbrush#constructor_4)(Point[], WrapMode) | Initialisiert eine neue Instanz von[`PathGradientBrush`](../pathgradientbrush) Klasse mit den angegebenen Punkten und Wrap-Modus. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/pathgradientbrush/blend) { get; set; } | Holt oder setzt aBlend die Positionen und Faktoren angibt, die einen benutzerdefinierten Abfall für den Farbverlauf definieren. |
| [CenterColor](../../system.drawing.drawing2d/pathgradientbrush/centercolor) { get; set; } | Ruft die Farbe in der Mitte des Pfadverlaufs ab oder legt sie fest. |
| [CenterPoint](../../system.drawing.drawing2d/pathgradientbrush/centerpoint) { get; set; } | Ruft den Mittelpunkt des Pfadgradienten ab oder legt ihn fest. |
| [FocusScales](../../system.drawing.drawing2d/pathgradientbrush/focusscales) { get; set; } | Ruft den Fokuspunkt für den Verlaufsabfall ab oder legt ihn fest. |
| [InterpolationColors](../../system.drawing.drawing2d/pathgradientbrush/interpolationcolors) { get; set; } | Holt oder setzt aColorBlenddas einen mehrfarbigen linearen Farbverlauf definiert. |
| [Rectangle](../../system.drawing.drawing2d/pathgradientbrush/rectangle) { get; } | Ruft dafür ein Begrenzungsrechteck abPathGradientBrush . |
| [SurroundColors](../../system.drawing.drawing2d/pathgradientbrush/surroundcolors) { get; set; } | Holt oder setzt ein Array von Farben, die den Punkten im Pfad this entsprechenPathGradientBrush füllt. |
| [Transform](../../system.drawing.drawing2d/pathgradientbrush/transform) { get; set; } | Ruft eine Kopie der ab oder legt sie festMatrix das definiert eine lokale geometrische transform dafürPathGradientBrush . |
| [WrapMode](../../system.drawing.drawing2d/pathgradientbrush/wrapmode) { get; set; } | Holt oder setzt aWrapMode das gibt den Umbruchmodus dafür anPathGradientBrush . |

## Methoden

| Name | Beschreibung |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/pathgradientbrush/clone)() | Erstellt eine exakte Kopie davonPathGradientBrush . |
| [Dispose](../../system.drawing/brush/dispose)() | Gibt alle von diesem Brush-Objekt verwendeten Ressourcen frei. |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform#multiplytransform)(Matrix) | Aktualisiert die Transformationsmatrix des Pinsels mit dem Produkt der Transformationsmatrix des Pinsels multipliziert mit einer anderen Matrix. |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | Aktualisiert die Transformationsmatrix des Pinsels mit dem Produkt der Transformationsmatrix des Pinsels multipliziert mit einer anderen Matrix. |
| [ResetTransform](../../system.drawing.drawing2d/pathgradientbrush/resettransform)() | Setzt die zurückTransform Eigentum an Identität. |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform#rotatetransform)(float) | Dreht die lokale geometrische Transformation um den angegebenen Betrag. Diese Methode stellt die Drehung der Transformation voran. |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Dreht die lokale geometrische Transformation um den angegebenen Betrag in der angegebenen Reihenfolge. |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform#scaletransform)(float, float) | Skaliert die lokale geometrische Transformation um die angegebenen Beträge. Diese Methode stellt die Skalierungsmatrix der Transformation voran. |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Skaliert die lokale geometrische Transformation um die angegebenen Beträge in der angegebenen Reihenfolge. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape#setblendtriangularshape)(float) | Erstellt einen Farbverlauf mit einer Mittelfarbe und einem linearen Abfall zu einer umgebenden Farbe. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape#setblendtriangularshape_1)(float, float) | Erstellt einen Verlauf mit einer Mittelfarbe und einem linearen Abfall zu jeder umgebenden Farbe. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape#setsigmabellshape)(float) | Erstellt einen Verlaufspinsel, der die Farbe von der Mitte des Pfads nach außen bis zur Pfadgrenze ändert. Der Übergang von einer Farbe zur anderen basiert auf einer glockenförmigen Kurve. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape#setsigmabellshape_1)(float, float) | Erstellt einen Verlaufspinsel, der die Farbe von der Mitte des Pfads nach außen bis zur Pfadgrenze ändert. Der Übergang von einer Farbe zur anderen basiert auf einer glockenförmigen Kurve. |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform#translatetransform)(float, float) | Wendet die angegebene Übersetzung auf die lokale geometrische Transformation an. Diese Methode stellt die Übersetzung der Transformation voran. |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Wendet die angegebene Übersetzung in der angegebenen Reihenfolge auf die lokale geometrische Transformation an. |

### Siehe auch

* class [Brush](../../system.drawing/brush)
* namensraum [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* Montage [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
