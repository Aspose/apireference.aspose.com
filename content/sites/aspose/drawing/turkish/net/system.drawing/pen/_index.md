---
title: Pen
second_title: Aspose.Drawing for .NET API Referansı
description: Çizgiler ve eğriler çizmek için kullanılan bir nesneyi tanımlar.
type: docs
weight: 910
url: /tr/net/system.drawing/pen/
---
## Pen class

Çizgiler ve eğriler çizmek için kullanılan bir nesneyi tanımlar.

```csharp
public class Pen : IDisposable
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [Pen](pen#constructor)(Brush) | Yeni bir örneğini başlatır[`Pen`](../pen) belirtilen sınıfBrush . |
| [Pen](pen#constructor_2)(Color) | Yeni bir örneğini başlatır[`Pen`](../pen) belirtilen sınıfColor . |
| [Pen](pen#constructor_1)(Brush, float) | Belirtilen Brush ve Width ile Pen sınıfının yeni bir örneğini başlatır. |
| [Pen](pen#constructor_3)(Color, float) | Belirtilen Renk ve Genişlik özellikleriyle Pen sınıfının yeni bir örneğini başlatır. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Alignment](../../system.drawing/pen/alignment) { get; set; } | Bunun için hizalamayı alır veya ayarlarPen . |
| [Brush](../../system.drawing/pen/brush) { get; set; } | Bunun özniteliklerini belirleyen Fırçayı alır veya ayarlar.Pen . |
| [Color](../../system.drawing/pen/color) { get; set; } | Bunun rengini alır veya ayarlarPen . |
| [CompoundArray](../../system.drawing/pen/compoundarray) { get; set; } | Bileşik kalemi belirten bir dizi değer alır veya ayarlar. Bileşik kalem, paralel çizgilerden ve boşluklardan oluşan bir bileşik çizgi çizer . |
| [CustomEndCap](../../system.drawing/pen/customendcap) { get; set; } | Bununla çizilen satırların sonunda kullanılacak özel bir başlık alır veya ayarlarPen . |
| [CustomStartCap](../../system.drawing/pen/customstartcap) { get; set; } | Bununla çizilen satırların başında kullanılacak özel bir başlık alır veya ayarlarPen . |
| [DashCap](../../system.drawing/pen/dashcap) { get; set; } | this ile çizilen kesikli çizgileri oluşturan tirelerin sonunda kullanılan büyük harf stilini alır veya ayarlarPen . |
| [DashOffset](../../system.drawing/pen/dashoffset) { get; set; } | Çizginin başlangıcından kısa çizgi deseninin başlangıcına kadar olan mesafeyi alır veya ayarlar. |
| [DashPattern](../../system.drawing/pen/dashpattern) { get; set; } | Bir dizi özel tire ve boşluk alır veya ayarlar. |
| [DashStyle](../../system.drawing/pen/dashstyle) { get; set; } | Bununla çizilen kesikli çizgiler için kullanılan stili alır veya ayarlarPen . |
| [EndCap](../../system.drawing/pen/endcap) { get; set; } | Bu Kalemle çizilen çizgilerin sonunda kullanılan başlık stilini alır veya ayarlar. |
| [LineJoin](../../system.drawing/pen/linejoin) { get; set; } | Bu Kalemle çizilen iki ardışık çizginin sonları için birleştirme stilini alır veya ayarlar. |
| [MiterLimit](../../system.drawing/pen/miterlimit) { get; set; } | Köşeli bir köşede birleştirmenin kalınlığının sınırını alır veya ayarlar. |
| [PenType](../../system.drawing/pen/pentype) { get; } | Bu Kalemle çizilen çizgilerin stilini alır. |
| [StartCap](../../system.drawing/pen/startcap) { get; set; } | Bu Kalemle çizilen çizgilerin başında kullanılan başlık stilini alır veya ayarlar. |
| [Transform](../../system.drawing/pen/transform) { get; set; } | Bunun için geometrik dönüşümün bir kopyasını alır veya ayarlarPen . |
| [Width](../../system.drawing/pen/width) { get; set; } | Bu Kalemin genişliğini çizim için kullanılan Graphics nesnesinin birimlerinde alır veya ayarlar. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Clone](../../system.drawing/pen/clone)() | Bunun tam bir kopyasını oluştururPen . |
| [Dispose](../../system.drawing/pen/dispose)() | Bu Kalem tarafından kullanılan tüm kaynakları serbest bırakır. |
| [MultiplyTransform](../../system.drawing/pen/multiplytransform#multiplytransform)(Matrix) | Bunun için dönüşüm matrisini çarparPen belirtilen tarafındanMatrix . |
| [MultiplyTransform](../../system.drawing/pen/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | Bunun için dönüşüm matrisini çarparPen belirtilen tarafındanMatrix belirtilen sırada. |
| [ResetTransform](../../system.drawing/pen/resettransform)() | Bunun için geometrik dönüşüm matrisini sıfırlarPen kimliğe. |
| [RotateTransform](../../system.drawing/pen/rotatetransform#rotatetransform)(float) | Yerel geometrik dönüşümü belirtilen açıyla döndürür. Bu yöntem, dönüşü dönüşüme hazırlar. |
| [RotateTransform](../../system.drawing/pen/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Yerel geometrik dönüşümü belirtilen sırada belirtilen açıyla döndürür. |
| [ScaleTransform](../../system.drawing/pen/scaletransform#scaletransform)(float, float) | Yerel geometrik dönüşümü belirtilen faktörlere göre ölçekler. Bu yöntem, ölçeklendirme matrisini dönüşümün başına ekler. |
| [ScaleTransform](../../system.drawing/pen/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Yerel geometrik dönüşümü belirtilen sırada belirtilen faktörlere göre ölçeklendirir. |
| [SetLineCap](../../system.drawing/pen/setlinecap)(LineCap, LineCap, DashCap) | Bunun tarafından çizilen satırları sonlandırmak için kullanılan başlık stilini belirleyen değerleri ayarlar.[`Pen`](../pen) . |
| [TranslateTransform](../../system.drawing/pen/translatetransform#translatetransform)(float, float) | Belirtilen boyutlara göre yerel geometrik dönüşümü öteler. Bu yöntem, dönüşüme çeviriyi hazırlar. |
| [TranslateTransform](../../system.drawing/pen/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Yerel geometrik dönüşümü belirtilen sırada belirtilen boyutlara göre çevirir. |

### Ayrıca bakınız

* ad alanı [System.Drawing](../../system.drawing)
* toplantı [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
