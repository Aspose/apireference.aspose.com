---
title: Class TextureBrush
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.Drawing.TextureBrush class. Each property of the TextureBrush class is a Brush object that uses an image to fill the interior of a shape. This class cannot be inherited
type: docs
weight: 420
url: /net/aspose.page.drawing/texturebrush/
---
## TextureBrush class

Each property of the `TextureBrush` class is a [`Brush`](../brush/) object that uses an image to fill the interior of a shape. This class cannot be inherited.

```csharp
public sealed class TextureBrush : Brush
```

## Constructors

| Name | Description |
| --- | --- |
| [TextureBrush](texturebrush/#constructor)(Bitmap) | Initializes a new `TextureBrush` object that uses the specified image. |
| [TextureBrush](texturebrush/#constructor_1)(Bitmap, WrapMode) | Initializes a new `TextureBrush` object that uses the specified image and wrap mode. |
| [TextureBrush](texturebrush/#constructor_2)(Bitmap, WrapMode, RectangleF) | Initializes a new `TextureBrush` object that uses the specified image, wrap mode, and bounding rectangle. |

## Properties

| Name | Description |
| --- | --- |
| [Image](../../aspose.page.drawing/texturebrush/image/) { get; } | Gets the Image object associated with this `TextureBrush` object. |
| [Transform](../../aspose.page.drawing/texturebrush/transform/) { get; set; } | Gets or sets a copy of the [`Matrix`](../../aspose.page.drawing.drawing2d/matrix/) object that defines a local geometric transformation for the image associated with this `TextureBrush` object. |
| [WrapMode](../../aspose.page.drawing/texturebrush/wrapmode/) { get; set; } | Gets or sets a [`WrapMode`](../../aspose.page.drawing.drawing2d/wrapmode/) enumeration that indicates the wrap mode for this `TextureBrush` object. |

## Methods

| Name | Description |
| --- | --- |
| override [Clone](../../aspose.page.drawing/texturebrush/clone/)() | Creates an exact copy of this `TextureBrush` object. |
| override [Dispose](../../aspose.page.drawing/texturebrush/dispose/)() | Releases all resources used by this `TextureBrush` object. |
| [MultiplyTransform](../../aspose.page.drawing/texturebrush/multiplytransform/#multiplytransform)(Matrix) | Multiplies the [`Matrix`](../../aspose.page.drawing.drawing2d/matrix/) object that represents the local geometric transformation of this `TextureBrush` object by the specified [`Matrix`](../../aspose.page.drawing.drawing2d/matrix/) object by prepending the specified [`Matrix`](../../aspose.page.drawing.drawing2d/matrix/) object. |
| [MultiplyTransform](../../aspose.page.drawing/texturebrush/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | Multiplies the [`Matrix`](../../aspose.page.drawing.drawing2d/matrix/) object that represents the local geometric transformation of this `TextureBrush` object by the specified [`Matrix`](../../aspose.page.drawing.drawing2d/matrix/) object in the specified order. |
| [ResetTransform](../../aspose.page.drawing/texturebrush/resettransform/)() | Resets the Transform property of this `TextureBrush` object to identity. |
| [RotateTransform](../../aspose.page.drawing/texturebrush/rotatetransform/#rotatetransform)(float) | Rotates the local geometric transformation of this `TextureBrush` object by the specified amount. This method prepends the rotation to the transformation. |
| [RotateTransform](../../aspose.page.drawing/texturebrush/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | Rotates the local geometric transformation of this `TextureBrush` object by the specified amount in the specified order. |
| [ScaleTransform](../../aspose.page.drawing/texturebrush/scaletransform/#scaletransform)(float, float) | Scales the local geometric transformation of this `TextureBrush` object by the specified amounts. This method prepends the scaling matrix to the transformation. |
| [ScaleTransform](../../aspose.page.drawing/texturebrush/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | Scales the local geometric transformation of this `TextureBrush` object by the specified amounts in the specified order. |
| [TranslateTransform](../../aspose.page.drawing/texturebrush/translatetransform/#translatetransform)(float, float) | Translates the local geometric transformation of this `TextureBrush` object by the specified dimensions. This method prepends the translation to the transformation. |
| [TranslateTransform](../../aspose.page.drawing/texturebrush/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | Translates the local geometric transformation of this `TextureBrush` object by the specified dimensions in the specified order. |

### See Also

* class [Brush](../brush/)
* namespace [Aspose.Page.Drawing](../../aspose.page.drawing/)
* assembly [Aspose.Page](../../)


