---
title: Interface IDevice
second_title: Aspose.SVG for .NET API Referansı
description: Aspose.Svg.Rendering.IDevice arayüz. Yollar metin ve resimler gibi grafik öğelerinin özel olarak oluşturulmasını destekleyen yöntemleri ve özellikleri tanımlar.
type: docs
weight: 2810
url: /tr/net/aspose.svg.rendering/idevice/
---
## IDevice interface

Yollar, metin ve resimler gibi grafik öğelerinin özel olarak oluşturulmasını destekleyen yöntemleri ve özellikleri tanımlar.

```csharp
public interface IDevice : IDisposable
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/idevice/graphiccontext/) { get; } | Grafik bağlamını alır. |
| [Options](../../aspose.svg.rendering/idevice/options/) { get; } | Oluşturma seçeneklerini alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [AddRect](../../aspose.svg.rendering/idevice/addrect/)(RectangleF) | Geçerli yola eksiksiz bir alt yol olarak bir dikdörtgen ekler. |
| [BeginDocument](../../aspose.svg.rendering/idevice/begindocument/)(Document) | Belgenin işlenmesine başlar. |
| [BeginElement](../../aspose.svg.rendering/idevice/beginelement/)(Element, RectangleF) | Öğenin işlenmesine başlar. |
| [BeginPage](../../aspose.svg.rendering/idevice/beginpage/)(SizeF) | Yeni sayfanın oluşturulmasına başlar. |
| [Clip](../../aspose.svg.rendering/idevice/clip/)(FillMode) | Doldurulacak bölgeyi belirlemek için FillMode kuralını kullanarak geçerli kırpma yolunu geçerli yolla kesiştirerek değiştirir. Bu yöntem geçerli yolu sonlandırır. |
| [ClosePath](../../aspose.svg.rendering/idevice/closepath/)() | Mevcut noktadan alt yolun başlangıç noktasına düz bir çizgi parçası ekleyerek mevcut alt yolu kapatır. Mevcut alt yol zaten kapalıysa, "ClosePath" hiçbir şey yapmaz. Bu işleç mevcut alt yolu sonlandırır. Geçerli yola başka bir parça eklemek yeni bir alt yol başlatır, yeni bölüm "ClosePath" yöntemiyle ulaşılan bitiş noktasında başlasa bile . |
| [CubicBezierTo](../../aspose.svg.rendering/idevice/cubicbezierto/)(PointF, PointF, PointF) | Geçerli yola kübik bir Bézier eğrisi ekler. Eğri, pt1 ve pt2'yi Bézier kontrol noktaları olarak kullanarak mevcut noktadan pt3, noktasına kadar uzanır. Yeni geçerli nokta pt3. |
| [DrawImage](../../aspose.svg.rendering/idevice/drawimage/)(byte[], ImageType, RectangleF) | Belirtilen görüntüyü çizer. |
| [EndDocument](../../aspose.svg.rendering/idevice/enddocument/)() | Belgenin işlenmesini sonlandırır. |
| [EndElement](../../aspose.svg.rendering/idevice/endelement/)(Element) | Öğenin işlenmesini sonlandırır. |
| [EndPage](../../aspose.svg.rendering/idevice/endpage/)() | Geçerli sayfanın görüntülenmesini sonlandırır. |
| [Fill](../../aspose.svg.rendering/idevice/fill/)(FillMode) | Geçerli yolun çevrelediği tüm bölgeyi doldurur. Yol birkaç bağlantısız alt yoldan oluşuyorsa, birlikte ele alınan tüm alt yolların içini doldurur. Bu yöntem geçerli yolu sonlandırır. |
| [FillText](../../aspose.svg.rendering/idevice/filltext/)(string, PointF) | Belirtilen metin dizesini belirtilen konumda doldurur. |
| [Flush](../../aspose.svg.rendering/idevice/flush/)() | Tüm verileri çıkış akışına boşaltır. |
| [LineTo](../../aspose.svg.rendering/idevice/lineto/)(PointF) | Geçerli noktadan noktaya (pt) bir düz çizgi parçası ekler. Yeni geçerli nokta pt. |
| [MoveTo](../../aspose.svg.rendering/idevice/moveto/)(PointF) | Geçerli noktayı pt parametresinin koordinatlarına taşıyarak yeni bir alt yol başlatır, herhangi bir bağlantı çizgisi parçasını atlar. Geçerli yoldaki önceki yol oluşturma yöntemi de "MoveTo" ise, yeni "MoveTo" onu geçersiz kılar; yolda önceki "MoveTo" işleminin hiçbir izi kalmaz. |
| [RestoreGraphicContext](../../aspose.svg.rendering/idevice/restoregraphiccontext/)() | Tüm grafik bağlamını yığından çıkararak önceki değerine geri yükler. |
| [SaveGraphicContext](../../aspose.svg.rendering/idevice/savegraphiccontext/)() | Tüm grafik içeriğinin bir kopyasını yığına iter. |
| [Stroke](../../aspose.svg.rendering/idevice/stroke/)() | Geçerli yol boyunca bir çizgi çizer. Konturlu çizgi, yoldaki her bir düz veya kavisli parçayı takip eder, , kenarları ona paralel olan parçanın üzerinde ortalanır. Yolun alt yollarının her biri ayrı ayrı ele alınır. Bu yöntem geçerli yolu sonlandırır. |
| [StrokeAndFill](../../aspose.svg.rendering/idevice/strokeandfill/)(FillMode) | Mevcut yolu konturlar ve doldurur. Bu yöntem mevcut yolu sonlandırır. |
| [StrokeText](../../aspose.svg.rendering/idevice/stroketext/)(string, PointF) | Belirtilen metin dizesini belirtilen konumda okşar. |

### Ayrıca bakınız

* ad alanı [Aspose.Svg.Rendering](../../aspose.svg.rendering/)
* toplantı [Aspose.SVG](../../)


