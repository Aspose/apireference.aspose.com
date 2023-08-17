---
title: Class TextureBrush
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.TextureBrush class. Each property of the TextureBrush class is a Brush object that uses an image to fill the interior of a shape. This class cannot be inherited
type: docs
weight: 1270
url: /net/system.drawing/texturebrush/
---
## TextureBrush class

Each property of the TextureBrush class is a Brush object that uses an image to fill the interior of a shape. This class cannot be inherited.

```csharp
public sealed class TextureBrush : Brush
```

## Constructors

| Name | Description |
| --- | --- |
| [TextureBrush](texturebrush/#constructor)(Image) | Initializes a new instance of the `TextureBrush` class that uses the specified image. |
| [TextureBrush](texturebrush/#constructor_3)(Image, RectangleF) | Initializes a new instance of the `TextureBrush` class that uses the specified image, and bounding rectangle. |
| [TextureBrush](texturebrush/#constructor_1)(Image, WrapMode) | Initializes a new instance of the `TextureBrush` class that uses the specified image and wrap mode. |
| [TextureBrush](texturebrush/#constructor_4)(Image, RectangleF, ImageAttributes) | Initializes a new instance of the `TextureBrush` class that uses the specified image, bounding rectangle, and image attributes. |
| [TextureBrush](texturebrush/#constructor_2)(Image, WrapMode, RectangleF) | Initializes a new instance of the `TextureBrush` class that uses the specified image, wrap mode, and bounding rectangle. |

## Properties

| Name | Description |
| --- | --- |
| [Image](../../system.drawing/texturebrush/image/) { get; } | Gets the Image object associated with this TextureBrush object. |
| [Transform](../../system.drawing/texturebrush/transform/) { get; set; } | Gets or sets a copy of the Matrix object that defines a local geometric transformation for the image associated with this TextureBrush object. |
| [WrapMode](../../system.drawing/texturebrush/wrapmode/) { get; set; } | Gets or sets a WrapMode enumeration that indicates the wrap mode for this TextureBrush object. |

## Methods

| Name | Description |
| --- | --- |
| override [Clone](../../system.drawing/texturebrush/clone/)() | Creates an exact copy of this TextureBrush object. |
| [Dispose](../../system.drawing/brush/dispose/)() | Releases all resources used by this Brush object. |
| [MultiplyTransform](../../system.drawing/texturebrush/multiplytransform/#multiplytransform)(Matrix) | Multiplies the Matrix object that represents the local geometric transformation of this TextureBrush object by the specified Matrix object by prepending the specified Matrix object. |
| [MultiplyTransform](../../system.drawing/texturebrush/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | Multiplies the Matrix object that represents the local geometric transformation of this TextureBrush object by the specified Matrix object in the specified order. |
| [ResetTransform](../../system.drawing/texturebrush/resettransform/)() | Resets the Transform property of this TextureBrush object to identity. |
| [RotateTransform](../../system.drawing/texturebrush/rotatetransform/#rotatetransform)(float) | Rotates the local geometric transformation of this TextureBrush object by the specified amount. This method prepends the rotation to the transformation. |
| [RotateTransform](../../system.drawing/texturebrush/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | Rotates the local geometric transformation of this TextureBrush object by the specified amount in the specified order. |
| [ScaleTransform](../../system.drawing/texturebrush/scaletransform/#scaletransform)(float, float) | Scales the local geometric transformation of this TextureBrush object by the specified amounts. This method prepends the scaling matrix to the transformation. |
| [ScaleTransform](../../system.drawing/texturebrush/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | Scales the local geometric transformation of this TextureBrush object by the specified amounts in the specified order. |
| [TranslateTransform](../../system.drawing/texturebrush/translatetransform/#translatetransform)(float, float) | Translates the local geometric transformation of this TextureBrush object by the specified dimensions. This method prepends the translation to the transformation. |
| [TranslateTransform](../../system.drawing/texturebrush/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | Translates the local geometric transformation of this TextureBrush object by the specified dimensions in the specified order. |

### See Also

* class [Brush](../brush/)
* namespace [System.Drawing](../../system.drawing/)
* assembly [Aspose.Drawing](../../)


