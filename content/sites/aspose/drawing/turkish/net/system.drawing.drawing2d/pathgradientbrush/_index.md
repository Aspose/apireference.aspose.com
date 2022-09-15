---
title: PathGradientBrush
second_title: Aspose.Drawing for .NET API Referansı
description: BirBrush bir cismin içini dolduran nesneGraphicsPath gradyanlı nesne. Bu sınıf devralınamaz.
type: docs
weight: 400
url: /tr/net/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class

BirBrush bir cismin içini dolduran nesneGraphicsPath gradyanlı nesne. Bu sınıf devralınamaz.

```csharp
public sealed class PathGradientBrush : Brush
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [PathGradientBrush](pathgradientbrush#constructor)(GraphicsPath) | Yeni bir örneğini başlatır[`PathGradientBrush`](../pathgradientbrush) belirtilen yola sahip sınıf. |
| [PathGradientBrush](pathgradientbrush#constructor_1)(PointF[]) | Yeni bir örneğini başlatır[`PathGradientBrush`](../pathgradientbrush) belirtilen noktalara sahip sınıf. |
| [PathGradientBrush](pathgradientbrush#constructor_3)(Point[]) | Yeni bir örneğini başlatır[`PathGradientBrush`](../pathgradientbrush) belirtilen noktalara sahip sınıf. |
| [PathGradientBrush](pathgradientbrush#constructor_2)(PointF[], WrapMode) | Yeni bir örneğini başlatır[`PathGradientBrush`](../pathgradientbrush) belirtilen noktalara ve kaydırma moduna sahip sınıf. |
| [PathGradientBrush](pathgradientbrush#constructor_4)(Point[], WrapMode) | Yeni bir örneğini başlatır[`PathGradientBrush`](../pathgradientbrush) belirtilen noktalara ve kaydırma moduna sahip sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/pathgradientbrush/blend) { get; set; } | Alır veya ayarlarBlend bu, degrade için özel bir düşüş tanımlayan konumları ve faktörleri belirtir. |
| [CenterColor](../../system.drawing.drawing2d/pathgradientbrush/centercolor) { get; set; } | Yolun gradyanının merkezindeki rengi alır veya ayarlar. |
| [CenterPoint](../../system.drawing.drawing2d/pathgradientbrush/centerpoint) { get; set; } | Yol gradyanının merkez noktasını alır veya ayarlar. |
| [FocusScales](../../system.drawing.drawing2d/pathgradientbrush/focusscales) { get; set; } | Degrade düşüşü için odak noktasını alır veya ayarlar. |
| [InterpolationColors](../../system.drawing.drawing2d/pathgradientbrush/interpolationcolors) { get; set; } | Alır veya ayarlarColorBlendbu, çok renkli bir doğrusal gradyanı tanımlar. |
| [Rectangle](../../system.drawing.drawing2d/pathgradientbrush/rectangle) { get; } | Bunun için sınırlayıcı bir dikdörtgen alırPathGradientBrush . |
| [SurroundColors](../../system.drawing.drawing2d/pathgradientbrush/surroundcolors) { get; set; } | path içindeki noktalara karşılık gelen bir dizi renk alır veya ayarlar buPathGradientBrush doldurur. |
| [Transform](../../system.drawing.drawing2d/pathgradientbrush/transform) { get; set; } | Bir kopyasını alır veya ayarlarMatrix bunun için yerel bir geometrik transform tanımlayanPathGradientBrush . |
| [WrapMode](../../system.drawing.drawing2d/pathgradientbrush/wrapmode) { get; set; } | Alır veya ayarlarWrapMode bu, bunun için sarma mode öğesini gösterirPathGradientBrush . |

## yöntemler

| İsim | Tanım |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/pathgradientbrush/clone)() | Bunun tam bir kopyasını oluştururPathGradientBrush . |
| [Dispose](../../system.drawing/brush/dispose)() | Bu Brush nesnesi tarafından kullanılan tüm kaynakları serbest bırakır. |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform#multiplytransform)(Matrix) | Fırçanın dönüşüm matrisini, fırçanın dönüşüm matrisi çarpımı ile başka bir matrisle çarpılarak günceller. |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | Fırçanın dönüşüm matrisini, fırçanın dönüşüm matrisi çarpımı ile başka bir matrisle çarpılarak günceller. |
| [ResetTransform](../../system.drawing.drawing2d/pathgradientbrush/resettransform)() | Transform kimlik özelliği. |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform#rotatetransform)(float) | Yerel geometrik dönüşümü belirtilen miktarda döndürür. Bu yöntem, dönüşümün başına dönüşü ekler. |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Yerel geometrik dönüşümü belirtilen sırada belirtilen miktarda döndürür. |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform#scaletransform)(float, float) | Yerel geometrik dönüşümü belirtilen miktarlara göre ölçekler. Bu yöntem, ölçeklendirme matrisini dönüşüme ekler. |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Yerel geometrik dönüşümü belirtilen sırada belirtilen miktarlara göre ölçeklendirir. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape#setblendtriangularshape)(float) | Merkez rengi olan bir degrade ve çevreleyen bir renge doğrusal bir düşüş oluşturur. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape#setblendtriangularshape_1)(float, float) | Merkez rengi ve çevreleyen her renge doğrusal bir düşüşle bir degrade oluşturur. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape#setsigmabellshape)(float) | Yolun ortasından başlayarak yolun sınırına doğru rengi değiştiren bir degrade fırçası oluşturur. Bir renkten diğerine geçiş, çan şeklindeki bir eğriye dayanır. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape#setsigmabellshape_1)(float, float) | Yolun ortasından başlayarak yolun sınırına doğru rengi değiştiren bir degrade fırçası oluşturur. Bir renkten diğerine geçiş, çan şeklindeki bir eğriye dayanır. |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform#translatetransform)(float, float) | Belirtilen çeviriyi yerel geometrik dönüşüme uygular. Bu yöntem, dönüşümün başına çeviriyi ekler. |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Belirtilen çeviriyi belirtilen sırayla yerel geometrik dönüşüme uygular. |

### Ayrıca bakınız

* class [Brush](../../system.drawing/brush)
* ad alanı [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* toplantı [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
