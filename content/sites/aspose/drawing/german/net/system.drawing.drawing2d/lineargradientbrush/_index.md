---
title: LinearGradientBrush
second_title: Aspose.Drawing für .NET-API-Referenz
description: Kapselt aBrush mit linearem Verlauf. Diese Klasse kann nicht vererbt werden.
type: docs
weight: 340
url: /de/net/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class

Kapselt aBrush mit linearem Verlauf. Diese Klasse kann nicht vererbt werden.

```csharp
public sealed class LinearGradientBrush : Brush
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [LinearGradientBrush](lineargradientbrush#constructor)(Point, Point, Color, Color) | Initialisiert eine neue Instanz von[`LinearGradientBrush`](../lineargradientbrush) Klasse mit den angegebenen Punkten und Farben. |
| [LinearGradientBrush](lineargradientbrush#constructor_1)(PointF, PointF, Color, Color) | Initialisiert eine neue Instanz von[`LinearGradientBrush`](../lineargradientbrush) Klasse mit den angegebenen Punkten und Farben. |
| [LinearGradientBrush](lineargradientbrush#constructor_2)(Rectangle, Color, Color, float) | Initialisiert eine neue Instanz von[`LinearGradientBrush`](../lineargradientbrush)Klasse basierend auf einem Rechteck, Anfangs- und Endfarben und einem Ausrichtungswinkel. |
| [LinearGradientBrush](lineargradientbrush#constructor_4)(Rectangle, Color, Color, LinearGradientMode) | Initialisiert eine neue Instanz von[`LinearGradientBrush`](../lineargradientbrush) Klasse basierend auf einem Rechteck, Anfangs- und Endfarbe und Ausrichtung. |
| [LinearGradientBrush](lineargradientbrush#constructor_5)(RectangleF, Color, Color, float) | Initialisiert eine neue Instanz von[`LinearGradientBrush`](../lineargradientbrush)Klasse basierend auf einem Rechteck, Anfangs- und Endfarben und einem Ausrichtungswinkel. |
| [LinearGradientBrush](lineargradientbrush#constructor_7)(RectangleF, Color, Color, LinearGradientMode) | Initialisiert eine neue Instanz von[`LinearGradientBrush`](../lineargradientbrush) Klasse basierend auf einem Rechteck, Anfangs- und Endfarben und einem Ausrichtungsmodus. |
| [LinearGradientBrush](lineargradientbrush#constructor_3)(Rectangle, Color, Color, float, bool) | Initialisiert eine neue Instanz von[`LinearGradientBrush`](../lineargradientbrush)Klasse basierend auf einem Rechteck, Anfangs- und Endfarben und einem Ausrichtungswinkel. |
| [LinearGradientBrush](lineargradientbrush#constructor_6)(RectangleF, Color, Color, float, bool) | Initialisiert eine neue Instanz von[`LinearGradientBrush`](../lineargradientbrush)Klasse basierend auf einem Rechteck, Anfangs- und Endfarben und einem Ausrichtungswinkel. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/lineargradientbrush/blend) { get; set; } | Holt oder setzt aBlend die Positionen und Faktoren angibt, die einen benutzerdefinierten -Falloff für den Farbverlauf definieren. |
| [GammaCorrection](../../system.drawing.drawing2d/lineargradientbrush/gammacorrection) { get; set; } | Erhält oder setzt einen Wert, der angibt, ob die Gammakorrektur dafür aktiviert istLinearGradientBrush . |
| [InterpolationColors](../../system.drawing.drawing2d/lineargradientbrush/interpolationcolors) { get; set; } | Holt oder setzt aColorBlenddas einen mehrfarbigen linearen Farbverlauf definiert. |
| [LinearColors](../../system.drawing.drawing2d/lineargradientbrush/linearcolors) { get; set; } | Ruft die Anfangs- und Endfarbe des Farbverlaufs ab oder legt sie fest. |
| [Rectangle](../../system.drawing.drawing2d/lineargradientbrush/rectangle) { get; } | Ruft einen rechteckigen Bereich ab, der die Start- und Endpunkte des Farbverlaufs definiert. |
| [Transform](../../system.drawing.drawing2d/lineargradientbrush/transform) { get; set; } | Ruft eine Kopie ab oder legt sie festMatrix das definiert eine lokale geometrische transform dafürLinearGradientBrush . |
| [WrapMode](../../system.drawing.drawing2d/lineargradientbrush/wrapmode) { get; set; } | Holt oder setzt aWrapMode Enumeration, die den Umbruchmodus dafür angibtLinearGradientBrush . |

## Methoden

| Name | Beschreibung |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/lineargradientbrush/clone)() | Erstellt eine exakte Kopie davonLinearGradientBrush . |
| [Dispose](../../system.drawing/brush/dispose)() | Gibt alle von diesem Brush-Objekt verwendeten Ressourcen frei. |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform#multiplytransform)(Matrix) | Multipliziert dieMatrix das repräsentiert die lokale geometrische transform davonLinearGradientBrush durch die angegebenenMatrix durch voranstellen der angegebenenMatrix . |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | Multipliziert dieMatrix das repräsentiert die lokale geometrische transform davonLinearGradientBrush durch die angegebenenMatrix in der angegebenen Reihenfolge. |
| [ResetTransform](../../system.drawing.drawing2d/lineargradientbrush/resettransform)() | Setzt die zurückTransform Eigentum an Identität. |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform#rotatetransform)(float) | Dreht die lokale geometrische Transformation um den angegebenen Betrag. Diese Methode stellt die Drehung der Transformation voran. |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Dreht die lokale geometrische Transformation um den angegebenen Betrag in der angegebenen Reihenfolge. |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform#scaletransform)(float, float) | Skaliert die lokale geometrische Transformation um die angegebenen Beträge. Diese Methode stellt die Skalierungsmatrix der Transformation voran. |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Skaliert die lokale geometrische Transformation um die angegebenen Beträge in der angegebenen Reihenfolge. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape#setblendtriangularshape)(float) | Erstellt einen linearen Farbverlauf mit einer Mittelfarbe und einem linearen Abfall zu einer einzigen Farbe an beiden Enden. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape#setblendtriangularshape_1)(float, float) | Erstellt einen linearen Farbverlauf mit einer Mittelfarbe und einem linearen Abfall zu einer einzigen Farbe an beiden Enden. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape#setsigmabellshape)(float) | Erstellt einen Verlaufsabfall basierend auf einer glockenförmigen Kurve. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape#setsigmabellshape_1)(float, float) | Erstellt einen Verlaufsabfall basierend auf einer glockenförmigen Kurve. |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform#translatetransform)(float, float) | Verschiebt die lokale geometrische Transformation um die angegebenen Abmessungen. Diese Methode stellt die Übersetzung der Transformation voran. |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Verschiebt die lokale geometrische Transformation um die angegebenen Dimensionen in der angegebenen Reihenfolge. |

### Siehe auch

* class [Brush](../../system.drawing/brush)
* namensraum [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* Montage [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
