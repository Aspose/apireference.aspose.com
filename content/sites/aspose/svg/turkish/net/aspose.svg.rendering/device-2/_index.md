---
title: DeviceTGraphicContextTRenderingOptions
second_title: Aspose.SVG for .NET API Referansı
description: Uygulamaya özel işleme cihazları için temel sınıfı temsil eder.
type: docs
weight: 2700
url: /tr/net/aspose.svg.rendering/device-2/
---
## Device&lt;TGraphicContext,TRenderingOptions&gt; class

Uygulamaya özel işleme cihazları için temel sınıfı temsil eder.

```csharp
public abstract class Device<TGraphicContext, TRenderingOptions> : IDevice
    where TGraphicContext : GraphicContext, new()
    where TRenderingOptions : RenderingOptions
```

| Parametre | Tanım |
| --- | --- |
| TGraphicContext | Mevcut grafik kontrol parametrelerini tutan grafik bağlamı |
| TRenderingOptions | İşleme seçenekleri |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/device`2/graphiccontext) { get; } | Grafik bağlamını alır |
| [Options](../../aspose.svg.rendering/device`2/options) { get; } | Oluşturma seçeneklerini alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| abstract [AddRect](../../aspose.svg.rendering/device`2/addrect)(RectangleF) | Geçerli yola tam bir alt yol olarak bir dikdörtgen ekler. |
| virtual [BeginDocument](../../aspose.svg.rendering/device`2/begindocument)(Document) | Belgeyi oluşturmaya başlar. |
| abstract [BeginElement](../../aspose.svg.rendering/device`2/beginelement)(Element, RectangleF) | Düğümün oluşturulmasına başlar. |
| virtual [BeginPage](../../aspose.svg.rendering/device`2/beginpage)(SizeF) | Yeni sayfanın oluşturulmasına başlar. |
| abstract [Clip](../../aspose.svg.rendering/device`2/clip)(FillMode) | Doldurulacak bölgeyi belirlemek için FillMode kuralını kullanarak, geçerli kırpma yolunu geçerli yolla kesiştirerek değiştirir. Bu yöntem, geçerli yolu sonlandırır. |
| abstract [ClosePath](../../aspose.svg.rendering/device`2/closepath)() | Geçerli noktadan alt yolun başlangıç noktasına düz bir çizgi parçası ekleyerek mevcut alt yolu kapatır. Geçerli alt yol zaten kapalıysa, "ClosePath" hiçbir şey yapmaz. Bu operatör geçerli alt yolu sonlandırır. Geçerli yola başka bir segment eklenmesi yeni bir alt yolu başlatır, yeni segment "ClosePath" yöntemiyle ulaşılan uç noktada başlasa bile. |
| abstract [CubicBezierTo](../../aspose.svg.rendering/device`2/cubicbezierto)(PointF, PointF, PointF) | Geçerli yola kübik bir Bézier eğrisi ekler. Eğri, Bézier kontrol noktaları olarak pt1 ve pt2 kullanılarak mevcut noktadan pt2, noktasına kadar uzanır. Yeni geçerli nokta pt3. |
| [Dispose](../../aspose.svg.rendering/device`2/dispose)() | Yönetilmeyen kaynakları serbest bırakma, serbest bırakma veya sıfırlama ile ilişkili uygulama tanımlı görevleri gerçekleştirir. |
| abstract [DrawImage](../../aspose.svg.rendering/device`2/drawimage)(byte[], ImageType, RectangleF) | Belirtilen resmi çizer. |
| virtual [EndDocument](../../aspose.svg.rendering/device`2/enddocument)() | Belgenin oluşturulmasını bitirir. |
| abstract [EndElement](../../aspose.svg.rendering/device`2/endelement)(Element) | Düğümün oluşturulmasını sonlandırır. |
| virtual [EndPage](../../aspose.svg.rendering/device`2/endpage)() | Geçerli sayfanın oluşturulmasını sona erdirir. |
| abstract [Fill](../../aspose.svg.rendering/device`2/fill)(FillMode) | Geçerli yol tarafından çevrelenen tüm bölgeyi doldurur. Yol, birbiriyle bağlantısız birkaç alt yoldan oluşuyorsa, birlikte düşünüldüğünde tüm alt yolların içini doldurur. Bu yöntem, geçerli yolu sonlandırır. |
| abstract [FillText](../../aspose.svg.rendering/device`2/filltext)(string, PointF) | Belirtilen metin dizesini belirtilen konumda doldurur. |
| virtual [Flush](../../aspose.svg.rendering/device`2/flush)() | Çıkış akışına tüm verileri temizler. |
| abstract [LineTo](../../aspose.svg.rendering/device`2/lineto)(PointF) | Geçerli noktadan noktaya (pt) düz bir çizgi parçası ekler. Yeni geçerli nokta pt. |
| abstract [MoveTo](../../aspose.svg.rendering/device`2/moveto)(PointF) | Geçerli noktayı pt parametresinin koordinatlarına taşıyarak ve herhangi bir bağlantı çizgisi parçasını atlayarak yeni bir alt yolu başlatır. Geçerli yoldaki önceki yol oluşturma yöntemi de "MoveTo" ise, yeni "MoveTo" bunu geçersiz kılar; yolda önceki "Taşı" işleminden hiçbir iz kalmıyor. |
| virtual [RestoreGraphicContext](../../aspose.svg.rendering/device`2/restoregraphiccontext)() | Yığından çıkararak tüm grafik bağlamını eski değerine geri yükler. |
| virtual [SaveGraphicContext](../../aspose.svg.rendering/device`2/savegraphiccontext)() | Tüm grafik içeriğinin bir kopyasını yığına gönderir. |
| abstract [Stroke](../../aspose.svg.rendering/device`2/stroke)() | Geçerli yol boyunca bir çizgi çizer. Konturlu çizgi, yoldaki her bir düz veya eğri parçayı takip eder, kenarları ona paralel olacak şekilde parça üzerinde ortalanır. Yolun alt yollarının her biri ayrı ayrı ele alınır. Bu yöntem, geçerli yolu sonlandırır. |
| abstract [StrokeAndFill](../../aspose.svg.rendering/device`2/strokeandfill)(FillMode) | Geçerli yolu konturlar ve doldurur. Bu yöntem, geçerli yolu sonlandırır. |
| abstract [StrokeText](../../aspose.svg.rendering/device`2/stroketext)(string, PointF) | Belirtilen metin dizesini belirtilen konumda konturlar. |

## Diğer_Üyeler

| İsim | Tanım |
| --- | --- |
| class [DeviceConfiguration&lt;TGraphicContext,TRenderingOptions&gt;](device-2.deviceconfiguration-2) | Aygıtlar için yapılandırma nesnesini temsil eder. |
| enum [PageWritingStrategy&lt;TGraphicContext,TRenderingOptions&gt;](device-2.pagewritingstrategy-2) | Sayfaları çıktı akışı\akışlarına yazmak için strateji türlerini belirtir. |

### Ayrıca bakınız

* interface [IDevice](../idevice)
* class [GraphicContext](../graphiccontext)
* class [RenderingOptions](../renderingoptions)
* ad alanı [Aspose.Svg.Rendering](../../aspose.svg.rendering)
* toplantı [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
