---
title: LinearGradientBrush
second_title: Aspose.Drawing for .NET API Referansı
description: BirBrush doğrusal bir gradyan ile. Bu sınıf devralınamaz.
type: docs
weight: 340
url: /tr/net/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class

BirBrush doğrusal bir gradyan ile. Bu sınıf devralınamaz.

```csharp
public sealed class LinearGradientBrush : Brush
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [LinearGradientBrush](lineargradientbrush#constructor)(Point, Point, Color, Color) | Yeni bir örneğini başlatır[`LinearGradientBrush`](../lineargradientbrush) belirtilen noktalara ve renklere sahip sınıf. |
| [LinearGradientBrush](lineargradientbrush#constructor_1)(PointF, PointF, Color, Color) | Yeni bir örneğini başlatır[`LinearGradientBrush`](../lineargradientbrush) belirtilen noktalara ve renklere sahip sınıf. |
| [LinearGradientBrush](lineargradientbrush#constructor_2)(Rectangle, Color, Color, float) | Yeni bir örneğini başlatır[`LinearGradientBrush`](../lineargradientbrush)bir dikdörtgene dayalı sınıf, başlangıç ve bitiş renkleri ve bir yönlendirme açısı. |
| [LinearGradientBrush](lineargradientbrush#constructor_4)(Rectangle, Color, Color, LinearGradientMode) | Yeni bir örneğini başlatır[`LinearGradientBrush`](../lineargradientbrush) bir dikdörtgene dayalı sınıf, başlangıç ve bitiş renkleri ve yönlendirme. |
| [LinearGradientBrush](lineargradientbrush#constructor_5)(RectangleF, Color, Color, float) | Yeni bir örneğini başlatır[`LinearGradientBrush`](../lineargradientbrush)bir dikdörtgene dayalı sınıf, başlangıç ve bitiş renkleri ve bir yönlendirme açısı. |
| [LinearGradientBrush](lineargradientbrush#constructor_7)(RectangleF, Color, Color, LinearGradientMode) | Yeni bir örneğini başlatır[`LinearGradientBrush`](../lineargradientbrush) bir dikdörtgene dayalı sınıf, başlangıç ve bitiş renkleri ve bir yönlendirme modu. |
| [LinearGradientBrush](lineargradientbrush#constructor_3)(Rectangle, Color, Color, float, bool) | Yeni bir örneğini başlatır[`LinearGradientBrush`](../lineargradientbrush)bir dikdörtgene dayalı sınıf, başlangıç ve bitiş renkleri ve bir yönlendirme açısı. |
| [LinearGradientBrush](lineargradientbrush#constructor_6)(RectangleF, Color, Color, float, bool) | Yeni bir örneğini başlatır[`LinearGradientBrush`](../lineargradientbrush)bir dikdörtgene dayalı sınıf, başlangıç ve bitiş renkleri ve bir yönlendirme açısı. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/lineargradientbrush/blend) { get; set; } | Alır veya ayarlarBlend degrade için custom düşüşünü tanımlayan konumları ve faktörleri belirtir. |
| [GammaCorrection](../../system.drawing.drawing2d/lineargradientbrush/gammacorrection) { get; set; } | Bunun için gama düzeltmesinin etkinleştirilip etkinleştirilmediğini gösteren bir değer alır veya ayarlarLinearGradientBrush . |
| [InterpolationColors](../../system.drawing.drawing2d/lineargradientbrush/interpolationcolors) { get; set; } | Alır veya ayarlarColorBlendbu, çok renkli bir doğrusal gradyanı tanımlar. |
| [LinearColors](../../system.drawing.drawing2d/lineargradientbrush/linearcolors) { get; set; } | Degradenin başlangıç ve bitiş renklerini alır veya ayarlar. |
| [Rectangle](../../system.drawing.drawing2d/lineargradientbrush/rectangle) { get; } | Degradenin başlangıç ve bitiş noktalarını tanımlayan dikdörtgen bir bölge alır. |
| [Transform](../../system.drawing.drawing2d/lineargradientbrush/transform) { get; set; } | Bir kopya alır veya ayarlarMatrix bunun için yerel bir geometrik transform tanımlayanLinearGradientBrush . |
| [WrapMode](../../system.drawing.drawing2d/lineargradientbrush/wrapmode) { get; set; } | Alır veya ayarlarWrapMode bunun için sarma mode gösteren numaralandırmaLinearGradientBrush . |

## yöntemler

| İsim | Tanım |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/lineargradientbrush/clone)() | Bunun tam bir kopyasını oluştururLinearGradientBrush . |
| [Dispose](../../system.drawing/brush/dispose)() | Bu Brush nesnesi tarafından kullanılan tüm kaynakları serbest bırakır. |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform#multiplytransform)(Matrix) | Matrix bunun yerel geometrik transform değerini temsil edenLinearGradientBrush belirtilen tarafındanMatrix belirtilenleri başına ekleyerekMatrix . |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | Matrix bunun yerel geometrik transform değerini temsil edenLinearGradientBrush belirtilen tarafındanMatrix belirtilen sırada. |
| [ResetTransform](../../system.drawing.drawing2d/lineargradientbrush/resettransform)() | Transform kimlik özelliği. |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform#rotatetransform)(float) | Yerel geometrik dönüşümü belirtilen miktarda döndürür. Bu yöntem, dönüşümün başına dönüşü ekler. |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Yerel geometrik dönüşümü belirtilen sırada belirtilen miktarda döndürür. |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform#scaletransform)(float, float) | Yerel geometrik dönüşümü belirtilen miktarlara göre ölçekler. Bu yöntem, ölçeklendirme matrisini dönüşüme ekler. |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Yerel geometrik dönüşümü belirtilen sırada belirtilen miktarlara göre ölçeklendirir. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape#setblendtriangularshape)(float) | Merkez rengi olan doğrusal bir degrade ve her iki uçta da tek bir renge doğrusal düşüş oluşturur. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape#setblendtriangularshape_1)(float, float) | Merkez rengi olan doğrusal bir degrade ve her iki uçta da tek bir renge doğrusal düşüş oluşturur. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape#setsigmabellshape)(float) | Çan şeklindeki bir eğriye dayalı bir degrade düşüşü oluşturur. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape#setsigmabellshape_1)(float, float) | Çan şeklindeki bir eğriye dayalı bir degrade düşüşü oluşturur. |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform#translatetransform)(float, float) | Belirtilen boyutlara göre yerel geometrik dönüşümü çevirir. Bu yöntem, dönüşümün başına çeviriyi ekler. |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Yerel geometrik dönüşümü belirtilen sırada belirtilen boyutlara göre çevirir. |

### Ayrıca bakınız

* class [Brush](../../system.drawing/brush)
* ad alanı [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* toplantı [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
