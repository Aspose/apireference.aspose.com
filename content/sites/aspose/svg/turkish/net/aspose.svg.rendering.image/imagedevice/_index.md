---
title: ImageDevice
second_title: Aspose.SVG for .NET API Referansı
description: Raster biçimlerinde işlemeyi temsil eder jpeg png bmp gif tiff.
type: docs
weight: 2790
url: /tr/net/aspose.svg.rendering.image/imagedevice/
---
## ImageDevice class

Raster biçimlerinde işlemeyi temsil eder: jpeg, png, bmp, gif, tiff.

```csharp
public class ImageDevice : Device<ImageGraphicContext, ImageRenderingOptions>
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [ImageDevice](imagedevice#constructor)(ICreateStreamProvider) | Yeni bir örneğini başlatır[`ImageDevice`](../imagedevice) sınıf. |
| [ImageDevice](imagedevice#constructor_4)(Stream) | Yeni bir örneğini başlatır[`ImageDevice`](../imagedevice) sınıf. |
| [ImageDevice](imagedevice#constructor_5)(string) | Yeni bir örneğini başlatır[`ImageDevice`](../imagedevice) sınıf. |
| [ImageDevice](imagedevice#constructor_1)(ImageRenderingOptions, ICreateStreamProvider) | Yeni bir örneğini başlatır[`ImageDevice`](../imagedevice) seçenekleri ve akış sağlayıcısını oluşturarak sınıf. |
| [ImageDevice](imagedevice#constructor_2)(ImageRenderingOptions, Stream) | Yeni bir örneğini başlatır[`ImageDevice`](../imagedevice) seçenekleri ve çıktı akışını oluşturarak sınıflandırın. |
| [ImageDevice](imagedevice#constructor_3)(ImageRenderingOptions, string) | Yeni bir örneğini başlatır[`ImageDevice`](../imagedevice) seçenekleri ve çıktı dosyası adını oluşturarak sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/device`2/graphiccontext) { get; } |  |
| virtual [Graphics](../../aspose.svg.rendering.image/imagedevice/graphics) { get; } | Graphics. örneğini alır |
| [Options](../../aspose.svg.rendering/device`2/options) { get; } |  |

## yöntemler

| İsim | Tanım |
| --- | --- |
| override [AddRect](../../aspose.svg.rendering.image/imagedevice/addrect)(RectangleF) | Geçerli yola tam bir alt yol olarak bir dikdörtgen ekler. |
| override [BeginDocument](../../aspose.svg.rendering.image/imagedevice/begindocument)(Document) | Belgeyi oluşturmaya başlar. |
| override [BeginElement](../../aspose.svg.rendering.image/imagedevice/beginelement)(Element, RectangleF) | Öğeyi oluşturmaya başlar. |
| override [BeginPage](../../aspose.svg.rendering.image/imagedevice/beginpage)(SizeF) | Yeni sayfanın oluşturulmasına başlar. |
| override [Clip](../../aspose.svg.rendering.image/imagedevice/clip)(FillMode) | Doldurulacak bölgeyi belirlemek için FillMode kuralını kullanarak, geçerli kırpma yolunu geçerli yolla kesiştirerek değiştirir. Bu yöntem, geçerli yolu sonlandırır. |
| override [ClosePath](../../aspose.svg.rendering.image/imagedevice/closepath)() | Geçerli noktadan alt yolun başlangıç noktasına düz bir çizgi parçası ekleyerek mevcut alt yolu kapatır. Geçerli alt yol zaten kapalıysa, "ClosePath" hiçbir şey yapmaz. Bu operatör geçerli alt yolu sonlandırır. Geçerli yola başka bir segment eklenmesi yeni bir alt yolu başlatır, yeni segment "ClosePath" yöntemiyle ulaşılan uç noktada başlasa bile. |
| override [CubicBezierTo](../../aspose.svg.rendering.image/imagedevice/cubicbezierto)(PointF, PointF, PointF) | Geçerli yola kübik bir Bézier eğrisi ekler. Eğri, Bézier kontrol noktaları olarak pt1 ve pt2 kullanılarak mevcut noktadan pt2, noktasına kadar uzanır. Yeni geçerli nokta pt3. |
| [Dispose](../../aspose.svg.rendering/device`2/dispose)() |  |
| override [DrawImage](../../aspose.svg.rendering.image/imagedevice/drawimage)(byte[], ImageType, RectangleF) | Belirtilen resmi çizer. |
| override [EndDocument](../../aspose.svg.rendering.image/imagedevice/enddocument)() | Belgenin oluşturulmasını bitirir. |
| override [EndElement](../../aspose.svg.rendering.image/imagedevice/endelement)(Element) | Öğenin oluşturulmasını sona erdirir. |
| override [EndPage](../../aspose.svg.rendering.image/imagedevice/endpage)() | Geçerli sayfanın oluşturulmasını sona erdirir. |
| override [Fill](../../aspose.svg.rendering.image/imagedevice/fill)(FillMode) | Geçerli yol tarafından çevrelenen tüm bölgeyi doldurur. Yol, birbiriyle bağlantısız birkaç alt yoldan oluşuyorsa, birlikte düşünüldüğünde tüm alt yolların içini doldurur. Bu yöntem, geçerli yolu sonlandırır. |
| override [FillText](../../aspose.svg.rendering.image/imagedevice/filltext)(string, PointF) | Belirtilen metin dizesini belirtilen konumda doldurur. |
| override [Flush](../../aspose.svg.rendering.image/imagedevice/flush)() | Çıkış akışına tüm verileri temizler. |
| override [LineTo](../../aspose.svg.rendering.image/imagedevice/lineto)(PointF) | Geçerli noktadan noktaya (pt) düz bir çizgi parçası ekler. Yeni geçerli nokta pt. |
| override [MoveTo](../../aspose.svg.rendering.image/imagedevice/moveto)(PointF) | Geçerli noktayı pt parametresinin koordinatlarına taşıyarak ve herhangi bir bağlantı çizgisi parçasını atlayarak yeni bir alt yolu başlatır. Geçerli yoldaki önceki yol oluşturma yöntemi de "MoveTo" ise, yeni "MoveTo" bunu geçersiz kılar; yolda önceki "Taşı" işleminden hiçbir iz kalmıyor. |
| override [RestoreGraphicContext](../../aspose.svg.rendering.image/imagedevice/restoregraphiccontext)() | Yığından çıkararak tüm grafik bağlamını eski değerine geri yükler. |
| override [SaveGraphicContext](../../aspose.svg.rendering.image/imagedevice/savegraphiccontext)() | Tüm grafik içeriğinin bir kopyasını yığına gönderir. |
| override [Stroke](../../aspose.svg.rendering.image/imagedevice/stroke)() | Geçerli yol boyunca bir çizgi çizer. Konturlu çizgi, yoldaki her bir düz veya eğri parçayı takip eder, kenarları ona paralel olacak şekilde parça üzerinde ortalanır. Yolun alt yollarının her biri ayrı ayrı ele alınır. Bu yöntem, geçerli yolu sonlandırır. |
| override [StrokeAndFill](../../aspose.svg.rendering.image/imagedevice/strokeandfill)(FillMode) | Geçerli yolu konturlar ve doldurur. Bu yöntem, geçerli yolu sonlandırır. |
| override [StrokeText](../../aspose.svg.rendering.image/imagedevice/stroketext)(string, PointF) | Belirtilen metin dizesini belirtilen konumda konturlar. |

## Diğer_Üyeler

| İsim | Tanım |
| --- | --- |
| class [ImageGraphicContext](imagedevice.imagegraphiccontext) | Şu anki grafik kontrol parametrelerini tutar.[`ImageDevice`](../imagedevice) . Bu parametreler, grafik operatörlerinin yürüttüğü global çerçeveyi tanımlar. |

### Ayrıca bakınız

* class [ImageGraphicContext](../imagedevice.imagegraphiccontext)
* class [Device&lt;TGraphicContext,TRenderingOptions&gt;](../../aspose.svg.rendering/device-2)
* class [ImageRenderingOptions](../imagerenderingoptions)
* ad alanı [Aspose.Svg.Rendering.Image](../../aspose.svg.rendering.image)
* toplantı [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
