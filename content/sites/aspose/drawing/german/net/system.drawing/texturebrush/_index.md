---
title: TextureBrush
second_title: Aspose.Drawing für .NET-API-Referenz
description: Jede Eigenschaft der TextureBrushKlasse ist ein BrushObjekt das ein Bild verwendet um das Innere einer Form zu füllen. Diese Klasse kann nicht vererbt werden.
type: docs
weight: 1260
url: /de/net/system.drawing/texturebrush/
---
## TextureBrush class

Jede Eigenschaft der TextureBrush-Klasse ist ein Brush-Objekt, das ein Bild verwendet, um das Innere einer Form zu füllen. Diese Klasse kann nicht vererbt werden.

```csharp
public sealed class TextureBrush : Brush
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [TextureBrush](texturebrush#constructor)(Image) | Initialisiert eine neue Instanz von[`TextureBrush`](../texturebrush) Klasse, die das angegebene Bild verwendet. |
| [TextureBrush](texturebrush#constructor_3)(Image, RectangleF) | Initialisiert eine neue Instanz von[`TextureBrush`](../texturebrush) Klasse, die das angegebene Bild und das Begrenzungsrechteck verwendet. |
| [TextureBrush](texturebrush#constructor_1)(Image, WrapMode) | Initialisiert eine neue Instanz von[`TextureBrush`](../texturebrush) Klasse, die das angegebene Bild und den Umbruchmodus verwendet. |
| [TextureBrush](texturebrush#constructor_4)(Image, RectangleF, ImageAttributes) | Initialisiert eine neue Instanz von[`TextureBrush`](../texturebrush) Klasse, die das angegebene Bild, das Begrenzungsrechteck und die Bildattribute verwendet. |
| [TextureBrush](texturebrush#constructor_2)(Image, WrapMode, RectangleF) | Initialisiert eine neue Instanz von[`TextureBrush`](../texturebrush) Klasse, die das angegebene Bild, den Umbruchmodus und das Begrenzungsrechteck verwendet. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Image](../../system.drawing/texturebrush/image) { get; } | Ruft das Image-Objekt ab, das diesem TextureBrush-Objekt zugeordnet ist. |
| [Transform](../../system.drawing/texturebrush/transform) { get; set; } | Ruft eine Kopie des Matrix-Objekts ab oder legt eine Kopie fest, die eine lokale geometrische Transformation für das Bild definiert, das diesem TextureBrush-Objekt zugeordnet ist. |
| [WrapMode](../../system.drawing/texturebrush/wrapmode) { get; set; } | Ruft eine WrapMode-Enumeration ab oder legt sie fest, die den Umbruchmodus für dieses TextureBrush-Objekt angibt. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| override [Clone](../../system.drawing/texturebrush/clone)() | Erstellt eine exakte Kopie davonTextureBrush Objekt. |
| [Dispose](../../system.drawing/brush/dispose)() | Gibt alle von diesem Brush-Objekt verwendeten Ressourcen frei. |
| [MultiplyTransform](../../system.drawing/texturebrush/multiplytransform#multiplytransform)(Matrix) | Multipliziert dieMatrix Objekt, das die lokale geometrische Transformation davon darstelltTextureBrush Objekt durch die angegebenenMatrix Objekt durch voranstellen der angegebenenMatrix Objekt. |
| [MultiplyTransform](../../system.drawing/texturebrush/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | Multipliziert dieMatrix Objekt, das die lokale geometrische Transformation davon darstelltTextureBrush Objekt durch die angegebenenMatrix Objekt in der angegebenen Reihenfolge. |
| [ResetTransform](../../system.drawing/texturebrush/resettransform)() | Setzt die Transform-Eigenschaft davon zurückTextureBrush Widerspruch gegen Identität. |
| [RotateTransform](../../system.drawing/texturebrush/rotatetransform#rotatetransform)(float) | Dreht die lokale geometrische Transformation davonTextureBrush Objekt um den angegebenen Betrag. Diese Methode stellt die Drehung der Transformation voran. |
| [RotateTransform](../../system.drawing/texturebrush/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Dreht die lokale geometrische Transformation davonTextureBrush Objekt um den angegebenen Betrag in der angegebenen Reihenfolge. |
| [ScaleTransform](../../system.drawing/texturebrush/scaletransform#scaletransform)(float, float) | Skaliert die lokale geometrische Transformation davonTextureBrush Objekt um die angegebenen Beträge. Diese Methode stellt die Skalierungsmatrix der Transformation voran. |
| [ScaleTransform](../../system.drawing/texturebrush/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Skaliert die lokale geometrische Transformation davonTextureBrush object um die angegebenen Beträge in der angegebenen Reihenfolge. |
| [TranslateTransform](../../system.drawing/texturebrush/translatetransform#translatetransform)(float, float) | Übersetzt die lokale geometrische Transformation davonTextureBrushObjekt um die angegebenen Abmessungen. Diese Methode stellt die Übersetzung der Transformation voran. |
| [TranslateTransform](../../system.drawing/texturebrush/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Übersetzt die lokale geometrische Transformation davonTextureBrush Objekt durch die angegebenen Abmessungen in der angegebenen Reihenfolge. |

### Siehe auch

* class [Brush](../brush)
* namensraum [System.Drawing](../../system.drawing)
* Montage [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
