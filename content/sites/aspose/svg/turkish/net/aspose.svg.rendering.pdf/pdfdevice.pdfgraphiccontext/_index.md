---
title: Class PdfDevice.PdfGraphicContext
second_title: Aspose.SVG for .NET API Referansı
description: Aspose.Svg.Rendering.Pdf.PdfDevicePdfGraphicContext sınıf. PdfDevice için geçerli grafik kontrol parametrelerini tutar. Bu parametreler grafik işleçlerinin yürüttüğü genel çerçeveyi tanımlar.
type: docs
weight: 2960
url: /tr/net/aspose.svg.rendering.pdf/pdfdevice.pdfgraphiccontext/
---
## PdfDevice.PdfGraphicContext class

PdfDevice için geçerli grafik kontrol parametrelerini tutar. Bu parametreler, grafik işleçlerinin yürüttüğü genel çerçeveyi tanımlar.

```csharp
public class PdfGraphicContext : GraphicContext
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [PdfGraphicContext](pdfgraphiccontext/)() | Default_Constructor |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| virtual [CharacterSpacing](../../aspose.svg.rendering/graphiccontext/characterspacing/) { get; set; } | Karakter aralığını ayarlar veya alır. |
| override [FillBrush](../../aspose.svg.rendering.pdf/pdfgraphiccontext/fillbrush/) { get; set; } | Yolların içini doldurmak için kullanılan fırça nesnesini ayarlar veya alır. |
| virtual [Font](../../aspose.svg.rendering/graphiccontext/font/) { get; set; } | Metin oluşturmak için kullanılan gerçek tip yazı tipi nesnesini ayarlar veya alır. |
| virtual [FontSize](../../aspose.svg.rendering/graphiccontext/fontsize/) { get; set; } | Metin yazı tipi boyutunu ayarlar veya alır. |
| virtual [FontStyle](../../aspose.svg.rendering/graphiccontext/fontstyle/) { get; set; } | Metin yazı tipi stilini ayarlar veya alır. |
| override [LineCap](../../aspose.svg.rendering.pdf/pdfgraphiccontext/linecap/) { get; set; } | Vurgulanan herhangi bir açık yol için uç noktaların şeklini belirten kodu ayarlar veya alır. |
| virtual [LineDashOffset](../../aspose.svg.rendering/graphiccontext/linedashoffset/) { get; set; } | Geçerli çizgi çizgi deseninin faz ofsetini ayarlar veya alır. |
| virtual [LineDashPattern](../../aspose.svg.rendering/graphiccontext/linedashpattern/) { get; set; } | Yollar konturlandığında kullanılacak kısa çizgi deseninin açıklamasını ayarlar veya alır. |
| virtual [LineDashStyle](../../aspose.svg.rendering/graphiccontext/linedashstyle/) { get; set; } | Setleri, konturlu bir yolun kesikli çizgilerinin stilini alır. |
| override [LineJoin](../../aspose.svg.rendering.pdf/pdfgraphiccontext/linejoin/) { get; set; } | Konturlu bir yolun bağlı parçaları arasındaki eklemlerin şeklini belirleyen kodu ayarlar veya alır. |
| override [LineWidth](../../aspose.svg.rendering.pdf/pdfgraphiccontext/linewidth/) { get; set; } | Vurulacak yolların kalınlığını ayarlar veya alır. |
| override [MiterLimit](../../aspose.svg.rendering.pdf/pdfgraphiccontext/miterlimit/) { get; set; } | Konturlu yollar için azaltılmış çizgi birleştirmelerinin maksimum uzunluğunu ayarlar veya alır. Bu parametre, çizgi parçaları keskin açılarda birleştiğinde üretilen "çivilerin" uzunluğunu sınırlar. |
| override [StrokeBrush](../../aspose.svg.rendering.pdf/pdfgraphiccontext/strokebrush/) { get; set; } | Konturlu yollar için kullanılan fırça nesnesini ayarlar veya alır. |
| virtual [TextInfo](../../aspose.svg.rendering/graphiccontext/textinfo/) { get; } | Bir alır[`TextInfo`](../../aspose.svg.rendering/textinfo/) işlenmiş metin hakkında bilgi içeren nesne. |
| override [TransformationMatrix](../../aspose.svg.rendering.pdf/pdfgraphiccontext/transformationmatrix/) { get; set; } | Dönüşüm matrisini ayarlar veya alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| override [Clone](../../aspose.svg.rendering.pdf/pdfgraphiccontext/clone/)() | Mevcut bir örnekle aynı özellik değerlerine sahip yeni bir sınıf örneği oluşturur. |
| override [Transform](../../aspose.svg.rendering.pdf/pdfgraphiccontext/transform/)(Matrix) | Geçerli dönüşüm matrisini, belirtilen matrisi çarparak değiştirin. |

### Ayrıca bakınız

* class [GraphicContext](../../aspose.svg.rendering/graphiccontext/)
* class [PdfDevice](../pdfdevice/)
* ad alanı [Aspose.Svg.Rendering.Pdf](../../aspose.svg.rendering.pdf/)
* toplantı [Aspose.SVG](../../)


