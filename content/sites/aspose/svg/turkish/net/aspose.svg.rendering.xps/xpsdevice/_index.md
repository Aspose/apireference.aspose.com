---
title: XpsDevice
second_title: Aspose.SVG for .NET API Referansı
description: Bir xps belgesine işlemeyi temsil eder.
type: docs
weight: 3000
url: /tr/net/aspose.svg.rendering.xps/xpsdevice/
---
## XpsDevice class

Bir xps belgesine işlemeyi temsil eder.

```csharp
public class XpsDevice : Device<XpsGraphicContext, XpsRenderingOptions>
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [XpsDevice](xpsdevice#constructor)(ICreateStreamProvider) | Yeni bir örneğini başlatır[`XpsDevice`](../xpsdevice) sınıf. |
| [XpsDevice](xpsdevice#constructor_4)(Stream) | Yeni bir örneğini başlatır[`XpsDevice`](../xpsdevice) sınıf. |
| [XpsDevice](xpsdevice#constructor_5)(string) | Yeni bir örneğini başlatır[`XpsDevice`](../xpsdevice) sınıf. |
| [XpsDevice](xpsdevice#constructor_1)(XpsRenderingOptions, ICreateStreamProvider) | Yeni bir örneğini başlatır[`XpsDevice`](../xpsdevice) seçenekleri ve akış sağlayıcısını oluşturarak sınıf. |
| [XpsDevice](xpsdevice#constructor_2)(XpsRenderingOptions, Stream) | Yeni bir örneğini başlatır[`XpsDevice`](../xpsdevice) seçenekleri ve çıktı akışını oluşturarak sınıflandırın. |
| [XpsDevice](xpsdevice#constructor_3)(XpsRenderingOptions, string) | Yeni bir örneğini başlatır[`XpsDevice`](../xpsdevice) seçenekleri ve çıktı dosyası adını oluşturarak sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/device`2/graphiccontext) { get; } |  |
| [Options](../../aspose.svg.rendering/device`2/options) { get; } |  |

## yöntemler

| İsim | Tanım |
| --- | --- |
| override [AddRect](../../aspose.svg.rendering.xps/xpsdevice/addrect)(RectangleF) | Geçerli yola tam bir alt yol olarak bir dikdörtgen ekler. |
| override [BeginDocument](../../aspose.svg.rendering.xps/xpsdevice/begindocument)(Document) | Belgeyi oluşturmaya başlar. |
| override [BeginElement](../../aspose.svg.rendering.xps/xpsdevice/beginelement)(Element, RectangleF) | Öğeyi oluşturmaya başlar. |
| override [BeginPage](../../aspose.svg.rendering.xps/xpsdevice/beginpage)(SizeF) | Yeni sayfanın oluşturulmasına başlar. |
| override [Clip](../../aspose.svg.rendering.xps/xpsdevice/clip)(FillMode) | Doldurulacak bölgeyi belirlemek için FillMode kuralını kullanarak, geçerli kırpma yolunu geçerli yolla kesiştirerek değiştirir. Bu yöntem, geçerli yolu sonlandırır. |
| override [ClosePath](../../aspose.svg.rendering.xps/xpsdevice/closepath)() | Geçerli noktadan alt yolun başlangıç noktasına düz bir çizgi parçası ekleyerek mevcut alt yolu kapatır. Geçerli alt yol zaten kapalıysa, "ClosePath" hiçbir şey yapmaz. Bu operatör geçerli alt yolu sonlandırır. Geçerli yola başka bir segment eklenmesi yeni bir alt yolu başlatır, yeni segment "ClosePath" yöntemiyle ulaşılan uç noktada başlasa bile. |
| override [CubicBezierTo](../../aspose.svg.rendering.xps/xpsdevice/cubicbezierto)(PointF, PointF, PointF) | Geçerli yola kübik bir Bézier eğrisi ekler. Eğri, Bézier kontrol noktaları olarak pt1 ve pt2 kullanılarak mevcut noktadan pt2, noktasına kadar uzanır. Yeni geçerli nokta pt3. |
| [Dispose](../../aspose.svg.rendering/device`2/dispose)() |  |
| override [DrawImage](../../aspose.svg.rendering.xps/xpsdevice/drawimage)(byte[], ImageType, RectangleF) | Belirtilen resmi çizer. |
| virtual [EndDocument](../../aspose.svg.rendering/device`2/enddocument)() |  |
| override [EndElement](../../aspose.svg.rendering.xps/xpsdevice/endelement)(Element) | Öğenin oluşturulmasını sona erdirir. |
| override [EndPage](../../aspose.svg.rendering.xps/xpsdevice/endpage)() | Geçerli sayfanın oluşturulmasını sona erdirir. |
| override [Fill](../../aspose.svg.rendering.xps/xpsdevice/fill)(FillMode) | Geçerli yol tarafından çevrelenen tüm bölgeyi doldurur. Yol, birbiriyle bağlantısız birkaç alt yoldan oluşuyorsa, birlikte düşünüldüğünde tüm alt yolların içini doldurur. Bu yöntem, geçerli yolu sonlandırır. |
| override [FillText](../../aspose.svg.rendering.xps/xpsdevice/filltext)(string, PointF) | Belirtilen metin dizesini belirtilen konumda doldurur. |
| override [Flush](../../aspose.svg.rendering.xps/xpsdevice/flush)() | Çıkış akışına tüm verileri temizler. |
| override [LineTo](../../aspose.svg.rendering.xps/xpsdevice/lineto)(PointF) | Geçerli noktadan noktaya (pt) düz bir çizgi parçası ekler. Yeni geçerli nokta pt. |
| override [MoveTo](../../aspose.svg.rendering.xps/xpsdevice/moveto)(PointF) | Geçerli noktayı pt parametresinin koordinatlarına taşıyarak ve herhangi bir bağlantı çizgisi parçasını atlayarak yeni bir alt yolu başlatır. Geçerli yoldaki önceki yol oluşturma yöntemi de "MoveTo" ise, yeni "MoveTo" bunu geçersiz kılar; yolda önceki "Taşı" işleminden hiçbir iz kalmıyor. |
| override [RestoreGraphicContext](../../aspose.svg.rendering.xps/xpsdevice/restoregraphiccontext)() | Yığından çıkararak tüm grafik bağlamını eski değerine geri yükler. |
| virtual [SaveGraphicContext](../../aspose.svg.rendering/device`2/savegraphiccontext)() |  |
| override [Stroke](../../aspose.svg.rendering.xps/xpsdevice/stroke)() | Geçerli yol boyunca bir çizgi çizer. Konturlu çizgi, yoldaki her bir düz veya eğri parçayı takip eder, kenarları ona paralel olacak şekilde parça üzerinde ortalanır. Yolun alt yollarının her biri ayrı ayrı ele alınır. Bu yöntem, geçerli yolu sonlandırır. |
| override [StrokeAndFill](../../aspose.svg.rendering.xps/xpsdevice/strokeandfill)(FillMode) | Geçerli yolu konturlar ve doldurur. Bu yöntem, geçerli yolu sonlandırır. |
| override [StrokeText](../../aspose.svg.rendering.xps/xpsdevice/stroketext)(string, PointF) | Belirtilen metin dizesini belirtilen konumda konturlar. |

## Diğer_Üyeler

| İsim | Tanım |
| --- | --- |
| class [XpsGraphicContext](xpsdevice.xpsgraphiccontext) | XpsDevice için geçerli grafik kontrol parametrelerini tutar. Bu parametreler, grafik operatörlerinin yürüttüğü global çerçeveyi tanımlar. |

### Ayrıca bakınız

* class [Device&lt;TGraphicContext,TRenderingOptions&gt;](../../aspose.svg.rendering/device-2)
* class [XpsGraphicContext](../xpsdevice.xpsgraphiccontext)
* class [XpsRenderingOptions](../xpsrenderingoptions)
* ad alanı [Aspose.Svg.Rendering.Xps](../../aspose.svg.rendering.xps)
* toplantı [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
