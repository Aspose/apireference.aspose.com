---
title: TextureBrush
second_title: Aspose.Drawing for .NET API Referansı
description: TextureBrush sınıfının her özelliği bir şeklin içini doldurmak için bir görüntü kullanan bir Brush nesnesidir. Bu sınıf devralınamaz.
type: docs
weight: 1260
url: /tr/net/system.drawing/texturebrush/
---
## TextureBrush class

TextureBrush sınıfının her özelliği, bir şeklin içini doldurmak için bir görüntü kullanan bir Brush nesnesidir. Bu sınıf devralınamaz.

```csharp
public sealed class TextureBrush : Brush
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [TextureBrush](texturebrush#constructor)(Image) | Yeni bir örneğini başlatır[`TextureBrush`](../texturebrush) belirtilen görüntüyü kullanan sınıf. |
| [TextureBrush](texturebrush#constructor_3)(Image, RectangleF) | Yeni bir örneğini başlatır[`TextureBrush`](../texturebrush) belirtilen görüntüyü ve sınırlayıcı dikdörtgeni kullanan sınıf. |
| [TextureBrush](texturebrush#constructor_1)(Image, WrapMode) | Yeni bir örneğini başlatır[`TextureBrush`](../texturebrush) belirtilen görüntüyü ve sarma modunu kullanan sınıf. |
| [TextureBrush](texturebrush#constructor_4)(Image, RectangleF, ImageAttributes) | Yeni bir örneğini başlatır[`TextureBrush`](../texturebrush) belirtilen görüntüyü, sınırlayıcı dikdörtgeni ve görüntü özniteliklerini kullanan sınıf. |
| [TextureBrush](texturebrush#constructor_2)(Image, WrapMode, RectangleF) | Yeni bir örneğini başlatır[`TextureBrush`](../texturebrush) belirtilen görüntüyü, sarma modunu ve sınırlayıcı dikdörtgeni kullanan sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Image](../../system.drawing/texturebrush/image) { get; } | Bu TextureBrush nesnesiyle ilişkili Image nesnesini alır. |
| [Transform](../../system.drawing/texturebrush/transform) { get; set; } | Bu TextureBrush nesnesiyle ilişkili image için yerel bir geometrik dönüşüm tanımlayan Matrix nesnesinin bir kopyasını alır veya ayarlar. |
| [WrapMode](../../system.drawing/texturebrush/wrapmode) { get; set; } | Bu TextureBrush nesnesi için sarma modunu gösteren bir WrapMode numaralandırması alır veya ayarlar. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| override [Clone](../../system.drawing/texturebrush/clone)() | Bunun tam bir kopyasını oluştururTextureBrush nesne. |
| [Dispose](../../system.drawing/brush/dispose)() | Bu Brush nesnesi tarafından kullanılan tüm kaynakları serbest bırakır. |
| [MultiplyTransform](../../system.drawing/texturebrush/multiplytransform#multiplytransform)(Matrix) | Matrix bunun yerel geometrik dönüşümünü temsil eden nesneTextureBrush belirtilen nesneMatrix belirtilen nesnenin başına ekleyerek nesneMatrix nesne. |
| [MultiplyTransform](../../system.drawing/texturebrush/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | Matrix bunun yerel geometrik dönüşümünü temsil eden nesneTextureBrush belirtilen nesneMatrix belirtilen sırada nesne. |
| [ResetTransform](../../system.drawing/texturebrush/resettransform)() | Bunun Dönüştür özelliğini sıfırlarTextureBrush kimliğe nesne. |
| [RotateTransform](../../system.drawing/texturebrush/rotatetransform#rotatetransform)(float) | Bunun yerel geometrik dönüşümünü döndürürTextureBrush belirtilen miktarda nesne. Bu yöntem, dönüşümün başına dönüşü ekler. |
| [RotateTransform](../../system.drawing/texturebrush/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Bunun yerel geometrik dönüşümünü döndürürTextureBrush belirtilen sırada belirtilen miktar ile nesne. |
| [ScaleTransform](../../system.drawing/texturebrush/scaletransform#scaletransform)(float, float) | Bunun yerel geometrik dönüşümünü ölçeklerTextureBrush belirtilen miktarlarda nesne. Bu yöntem, ölçeklendirme matrisini dönüştürmenin başına ekler. |
| [ScaleTransform](../../system.drawing/texturebrush/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Bunun yerel geometrik dönüşümünü ölçeklerTextureBrush object belirtilen sırada belirtilen miktarlarda. |
| [TranslateTransform](../../system.drawing/texturebrush/translatetransform#translatetransform)(float, float) | Bunun yerel geometrik dönüşümünü çevirirTextureBrushbelirtilen boyutlara göre nesne. Bu yöntem, dönüşüme çeviriyi hazırlar. |
| [TranslateTransform](../../system.drawing/texturebrush/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Bunun yerel geometrik dönüşümünü çevirirTextureBrush belirtilen sırayla belirtilen boyutlara göre nesne . |

### Ayrıca bakınız

* class [Brush](../brush)
* ad alanı [System.Drawing](../../system.drawing)
* toplantı [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
