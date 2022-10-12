---
title: PdfDevice
second_title: Aspose.SVG for .NET API Referansı
description: Bir pdf belgesine dönüştürmeyi temsil eder.
type: docs
weight: 2900
url: /tr/net/aspose.svg.rendering.pdf/pdfdevice/
---
## PdfDevice class

Bir pdf belgesine dönüştürmeyi temsil eder.

```csharp
public class PdfDevice : Device<PdfGraphicContext, PdfRenderingOptions>
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [PdfDevice](pdfdevice#constructor)(ICreateStreamProvider) | Yeni bir örneğini başlatır[`PdfDevice`](../pdfdevice) sınıf. |
| [PdfDevice](pdfdevice#constructor_4)(Stream) | Yeni bir örneğini başlatır[`PdfDevice`](../pdfdevice) sınıf. |
| [PdfDevice](pdfdevice#constructor_5)(string) | Yeni bir örneğini başlatır[`PdfDevice`](../pdfdevice) sınıf. |
| [PdfDevice](pdfdevice#constructor_1)(PdfRenderingOptions, ICreateStreamProvider) | Yeni bir örneğini başlatır[`PdfDevice`](../pdfdevice) seçenekleri ve akış sağlayıcısını oluşturarak sınıf. |
| [PdfDevice](pdfdevice#constructor_2)(PdfRenderingOptions, Stream) | Yeni bir örneğini başlatır[`PdfDevice`](../pdfdevice) seçenekleri ve çıktı akışını oluşturarak sınıflandırın. |
| [PdfDevice](pdfdevice#constructor_3)(PdfRenderingOptions, string) | Yeni bir örneğini başlatır[`PdfDevice`](../pdfdevice) seçenekleri ve çıktı dosyası adını oluşturarak sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/device`2/graphiccontext) { get; } |  |
| [Options](../../aspose.svg.rendering/device`2/options) { get; } |  |

## yöntemler

| İsim | Tanım |
| --- | --- |
| override [AddRect](../../aspose.svg.rendering.pdf/pdfdevice/addrect)(RectangleF) | Geçerli yola tam bir alt yol olarak bir dikdörtgen ekler. |
| override [BeginDocument](../../aspose.svg.rendering.pdf/pdfdevice/begindocument)(Document) | Belgeyi oluşturmaya başlar. |
| override [BeginElement](../../aspose.svg.rendering.pdf/pdfdevice/beginelement)(Element, RectangleF) | Öğeyi oluşturmaya başlar. |
| override [BeginPage](../../aspose.svg.rendering.pdf/pdfdevice/beginpage)(SizeF) | Yeni sayfanın oluşturulmasına başlar. |
| override [Clip](../../aspose.svg.rendering.pdf/pdfdevice/clip)(FillMode) | Doldurulacak bölgeyi belirlemek için FillMode kuralını kullanarak, geçerli kırpma yolunu geçerli yolla kesiştirerek değiştirir. Bu yöntem, geçerli yolu sonlandırır. |
| override [ClosePath](../../aspose.svg.rendering.pdf/pdfdevice/closepath)() | Geçerli noktadan alt yolun başlangıç noktasına düz bir çizgi parçası ekleyerek mevcut alt yolu kapatır. Geçerli alt yol zaten kapalıysa, "ClosePath" hiçbir şey yapmaz. Bu operatör geçerli alt yolu sonlandırır. Geçerli yola başka bir segment eklenmesi yeni bir alt yolu başlatır, yeni segment "ClosePath" yöntemiyle ulaşılan uç noktada başlasa bile. |
| override [CubicBezierTo](../../aspose.svg.rendering.pdf/pdfdevice/cubicbezierto)(PointF, PointF, PointF) | Geçerli yola kübik bir Bézier eğrisi ekler. Eğri, Bézier kontrol noktaları olarak pt1 ve pt2 kullanılarak mevcut noktadan pt2, noktasına kadar uzanır. Yeni geçerli nokta pt3. |
| [Dispose](../../aspose.svg.rendering/device`2/dispose)() |  |
| override [DrawImage](../../aspose.svg.rendering.pdf/pdfdevice/drawimage)(byte[], ImageType, RectangleF) | Belirtilen resmi çizer. |
| override [EndDocument](../../aspose.svg.rendering.pdf/pdfdevice/enddocument)() | Belgenin oluşturulmasını bitirir. |
| override [EndElement](../../aspose.svg.rendering.pdf/pdfdevice/endelement)(Element) | Öğenin oluşturulmasını sona erdirir. |
| override [EndPage](../../aspose.svg.rendering.pdf/pdfdevice/endpage)() | Geçerli sayfanın oluşturulmasını sona erdirir. |
| override [Fill](../../aspose.svg.rendering.pdf/pdfdevice/fill)(FillMode) | Geçerli yol tarafından çevrelenen tüm bölgeyi doldurur. Yol, birbiriyle bağlantısız birkaç alt yoldan oluşuyorsa, birlikte düşünüldüğünde tüm alt yolların içini doldurur. Bu yöntem, geçerli yolu sonlandırır. |
| override [FillText](../../aspose.svg.rendering.pdf/pdfdevice/filltext)(string, PointF) | Belirtilen metin dizesini belirtilen konumda doldurur. |
| override [Flush](../../aspose.svg.rendering.pdf/pdfdevice/flush)() | Çıkış akışına tüm verileri temizler. |
| override [LineTo](../../aspose.svg.rendering.pdf/pdfdevice/lineto)(PointF) | Geçerli noktadan noktaya (pt) düz bir çizgi parçası ekler. Yeni geçerli nokta pt. |
| override [MoveTo](../../aspose.svg.rendering.pdf/pdfdevice/moveto)(PointF) | Geçerli noktayı pt parametresinin koordinatlarına taşıyarak ve herhangi bir bağlantı çizgisi parçasını atlayarak yeni bir alt yolu başlatır. Geçerli yoldaki önceki yol oluşturma yöntemi de "MoveTo" ise, yeni "MoveTo" bunu geçersiz kılar; yolda önceki "Taşı" işleminden hiçbir iz kalmıyor. |
| override [RestoreGraphicContext](../../aspose.svg.rendering.pdf/pdfdevice/restoregraphiccontext)() | Yığından çıkararak tüm grafik bağlamını eski değerine geri yükler. |
| override [SaveGraphicContext](../../aspose.svg.rendering.pdf/pdfdevice/savegraphiccontext)() | Tüm grafik içeriğinin bir kopyasını yığına gönderir. |
| override [Stroke](../../aspose.svg.rendering.pdf/pdfdevice/stroke)() | Geçerli yol boyunca bir çizgi çizer. Konturlu çizgi, yoldaki her bir düz veya eğri parçayı takip eder, kenarları ona paralel olacak şekilde parça üzerinde ortalanır. Yolun alt yollarının her biri ayrı ayrı ele alınır. Bu yöntem, geçerli yolu sonlandırır. |
| override [StrokeAndFill](../../aspose.svg.rendering.pdf/pdfdevice/strokeandfill)(FillMode) | Geçerli yolu konturlar ve doldurur. Bu yöntem, geçerli yolu sonlandırır. |
| override [StrokeText](../../aspose.svg.rendering.pdf/pdfdevice/stroketext)(string, PointF) | Belirtilen metin dizesini belirtilen konumda konturlar. |

## Diğer_Üyeler

| İsim | Tanım |
| --- | --- |
| class [PdfGraphicContext](pdfdevice.pdfgraphiccontext) | PdfDevice için geçerli grafik kontrol parametrelerini tutar. Bu parametreler, grafik operatörlerinin içinde yürüttüğü global çerçeveyi tanımlar. |

### Ayrıca bakınız

* class [Device&lt;TGraphicContext,TRenderingOptions&gt;](../../aspose.svg.rendering/device-2)
* class [PdfGraphicContext](../pdfdevice.pdfgraphiccontext)
* class [PdfRenderingOptions](../pdfrenderingoptions)
* ad alanı [Aspose.Svg.Rendering.Pdf](../../aspose.svg.rendering.pdf)
* toplantı [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
