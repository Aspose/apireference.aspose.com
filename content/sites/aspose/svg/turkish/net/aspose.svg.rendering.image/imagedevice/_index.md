---
title: Class ImageDevice
second_title: Aspose.SVG for .NET API Referansı
description: Aspose.Svg.Rendering.Image.ImageDevice sınıf. Tarama biçimlerine dönüştürmeyi temsil eder jpeg png bmp gif tiff.
type: docs
weight: 2830
url: /tr/net/aspose.svg.rendering.image/imagedevice/
---
## ImageDevice class

Tarama biçimlerine dönüştürmeyi temsil eder: jpeg, png, bmp, gif, tiff.

```csharp
public class ImageDevice : Device<ImageGraphicContext, ImageRenderingOptions>
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [ImageDevice](imagedevice/#constructor)(ICreateStreamProvider) | Yeni bir örneğini başlatır.`ImageDevice` sınıf. |
| [ImageDevice](imagedevice/#constructor_4)(Stream) | Yeni bir örneğini başlatır.`ImageDevice` sınıf. |
| [ImageDevice](imagedevice/#constructor_5)(string) | Yeni bir örneğini başlatır.`ImageDevice` sınıf. |
| [ImageDevice](imagedevice/#constructor_1)(ImageRenderingOptions, ICreateStreamProvider) | Yeni bir örneğini başlatır.`ImageDevice` oluşturma seçeneklerine ve akış sağlayıcısına göre sınıf. |
| [ImageDevice](imagedevice/#constructor_2)(ImageRenderingOptions, Stream) | Yeni bir örneğini başlatır.`ImageDevice` işleme seçeneklerine ve çıktı akışına göre sınıf. |
| [ImageDevice](imagedevice/#constructor_3)(ImageRenderingOptions, string) | Yeni bir örneğini başlatır.`ImageDevice` işleme seçeneklerine ve çıktı dosyası adına göre sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/device-2/graphiccontext/) { get; } |  |
| virtual [Graphics](../../aspose.svg.rendering.image/imagedevice/graphics/) { get; } | Graphics. örneğini alır |
| [Options](../../aspose.svg.rendering/device-2/options/) { get; } |  |

## yöntemler

| İsim | Tanım |
| --- | --- |
| override [AddRect](../../aspose.svg.rendering.image/imagedevice/addrect/)(RectangleF) | Geçerli yola eksiksiz bir alt yol olarak bir dikdörtgen ekler. |
| override [BeginDocument](../../aspose.svg.rendering.image/imagedevice/begindocument/)(Document) | Belgenin işlenmesine başlar. |
| override [BeginElement](../../aspose.svg.rendering.image/imagedevice/beginelement/)(Element, RectangleF) | Öğenin işlenmesine başlar. |
| override [BeginPage](../../aspose.svg.rendering.image/imagedevice/beginpage/)(SizeF) | Yeni sayfanın oluşturulmasına başlar. |
| override [Clip](../../aspose.svg.rendering.image/imagedevice/clip/)(FillMode) | Doldurulacak bölgeyi belirlemek için FillMode kuralını kullanarak geçerli kırpma yolunu geçerli yolla kesiştirerek değiştirir. Bu yöntem geçerli yolu sonlandırır. |
| override [ClosePath](../../aspose.svg.rendering.image/imagedevice/closepath/)() | Mevcut noktadan alt yolun başlangıç noktasına düz bir çizgi parçası ekleyerek mevcut alt yolu kapatır. Mevcut alt yol zaten kapalıysa, "ClosePath" hiçbir şey yapmaz. Bu işleç mevcut alt yolu sonlandırır. Geçerli yola başka bir parça eklemek yeni bir alt yol başlatır, yeni bölüm "ClosePath" yöntemiyle ulaşılan bitiş noktasında başlasa bile . |
| override [CubicBezierTo](../../aspose.svg.rendering.image/imagedevice/cubicbezierto/)(PointF, PointF, PointF) | Geçerli yola kübik bir Bézier eğrisi ekler. Eğri, pt1 ve pt2'yi Bézier kontrol noktaları olarak kullanarak mevcut noktadan pt2, noktasına kadar uzanır. Yeni geçerli nokta pt3. |
| [Dispose](../../aspose.svg.rendering/device-2/dispose/)() |  |
| override [DrawImage](../../aspose.svg.rendering.image/imagedevice/drawimage/)(byte[], ImageType, RectangleF) | Belirtilen görüntüyü çizer. |
| override [EndDocument](../../aspose.svg.rendering.image/imagedevice/enddocument/)() | Belgenin işlenmesini sonlandırır. |
| override [EndElement](../../aspose.svg.rendering.image/imagedevice/endelement/)(Element) | Öğenin işlenmesini sonlandırır. |
| override [EndPage](../../aspose.svg.rendering.image/imagedevice/endpage/)() | Geçerli sayfanın görüntülenmesini sonlandırır. |
| override [Fill](../../aspose.svg.rendering.image/imagedevice/fill/)(FillMode) | Geçerli yolun çevrelediği tüm bölgeyi doldurur. Yol birkaç bağlantısız alt yoldan oluşuyorsa, birlikte ele alınan tüm alt yolların içini doldurur. Bu yöntem geçerli yolu sonlandırır. |
| override [FillText](../../aspose.svg.rendering.image/imagedevice/filltext/)(string, PointF) | Belirtilen metin dizesini belirtilen konumda doldurur. |
| override [Flush](../../aspose.svg.rendering.image/imagedevice/flush/)() | Tüm verileri çıkış akışına boşaltır. |
| override [LineTo](../../aspose.svg.rendering.image/imagedevice/lineto/)(PointF) | Geçerli noktadan noktaya (pt) bir düz çizgi parçası ekler. Yeni geçerli nokta pt. |
| override [MoveTo](../../aspose.svg.rendering.image/imagedevice/moveto/)(PointF) | Geçerli noktayı pt parametresinin koordinatlarına taşıyarak yeni bir alt yol başlatır, herhangi bir bağlantı çizgisi parçasını atlar. Geçerli yoldaki önceki yol oluşturma yöntemi de "MoveTo" ise, yeni "MoveTo" onu geçersiz kılar; yolda önceki "MoveTo" işleminin hiçbir izi kalmaz. |
| override [RestoreGraphicContext](../../aspose.svg.rendering.image/imagedevice/restoregraphiccontext/)() | Tüm grafik bağlamını yığından çıkararak önceki değerine geri yükler. |
| override [SaveGraphicContext](../../aspose.svg.rendering.image/imagedevice/savegraphiccontext/)() | Tüm grafik içeriğinin bir kopyasını yığına iter. |
| override [Stroke](../../aspose.svg.rendering.image/imagedevice/stroke/)() | Geçerli yol boyunca bir çizgi çizer. Konturlu çizgi, yoldaki her bir düz veya kavisli parçayı takip eder, , kenarları ona paralel olan parçanın üzerinde ortalanır. Yolun alt yollarının her biri ayrı ayrı ele alınır. Bu yöntem geçerli yolu sonlandırır. |
| override [StrokeAndFill](../../aspose.svg.rendering.image/imagedevice/strokeandfill/)(FillMode) | Mevcut yolu konturlar ve doldurur. Bu yöntem mevcut yolu sonlandırır. |
| override [StrokeText](../../aspose.svg.rendering.image/imagedevice/stroketext/)(string, PointF) | Belirtilen metin dizesini belirtilen konumda okşar. |

## Diğer_Üyeler

| İsim | Tanım |
| --- | --- |
| class [ImageGraphicContext](imagedevice.imagegraphiccontext/) | için geçerli grafik kontrol parametrelerini tutar.`ImageDevice`. Bu parametreler, grafik işleçlerinin yürüttüğü genel çerçeveyi tanımlar. |

### Ayrıca bakınız

* class [ImageGraphicContext](../imagedevice.imagegraphiccontext/)
* class [Device&lt;TGraphicContext,TRenderingOptions&gt;](../../aspose.svg.rendering/device-2/)
* class [ImageRenderingOptions](../imagerenderingoptions/)
* ad alanı [Aspose.Svg.Rendering.Image](../../aspose.svg.rendering.image/)
* toplantı [Aspose.SVG](../../)


