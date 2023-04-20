---
title: Class ImageDevice.ImageGraphicContext
second_title: Aspose.SVG for .NET API Referansı
description: Aspose.Svg.Rendering.Image.ImageDeviceImageGraphicContext sınıf. için geçerli grafik kontrol parametrelerini tutar.ImageDevice. Bu parametreler grafik işleçlerinin yürüttüğü genel çerçeveyi tanımlar.
type: docs
weight: 2840
url: /tr/net/aspose.svg.rendering.image/imagedevice.imagegraphiccontext/
---
## ImageDevice.ImageGraphicContext class

için geçerli grafik kontrol parametrelerini tutar.[`ImageDevice`](../imagedevice/). Bu parametreler, grafik işleçlerinin yürüttüğü genel çerçeveyi tanımlar.

```csharp
public class ImageGraphicContext : GraphicContext
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [ImageGraphicContext](imagegraphiccontext/)() | Default_Constructor |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| virtual [CharacterSpacing](../../aspose.svg.rendering/graphiccontext/characterspacing/) { get; set; } | Karakter aralığını ayarlar veya alır. |
| virtual [FillBrush](../../aspose.svg.rendering/graphiccontext/fillbrush/) { get; set; } | Yolların içini doldurmak için kullanılan fırça nesnesini ayarlar veya alır. |
| virtual [Font](../../aspose.svg.rendering/graphiccontext/font/) { get; set; } | Metin oluşturmak için kullanılan gerçek tip yazı tipi nesnesini ayarlar veya alır. |
| virtual [FontSize](../../aspose.svg.rendering/graphiccontext/fontsize/) { get; set; } | Metin yazı tipi boyutunu ayarlar veya alır. |
| virtual [FontStyle](../../aspose.svg.rendering/graphiccontext/fontstyle/) { get; set; } | Metin yazı tipi stilini ayarlar veya alır. |
| virtual [LineCap](../../aspose.svg.rendering/graphiccontext/linecap/) { get; set; } | Vurgulanan herhangi bir açık yol için uç noktaların şeklini belirten kodu ayarlar veya alır. |
| virtual [LineDashOffset](../../aspose.svg.rendering/graphiccontext/linedashoffset/) { get; set; } | Geçerli çizgi çizgi deseninin faz ofsetini ayarlar veya alır. |
| virtual [LineDashPattern](../../aspose.svg.rendering/graphiccontext/linedashpattern/) { get; set; } | Yollar konturlandığında kullanılacak kısa çizgi deseninin açıklamasını ayarlar veya alır. |
| virtual [LineDashStyle](../../aspose.svg.rendering/graphiccontext/linedashstyle/) { get; set; } | Setleri, konturlu bir yolun kesikli çizgilerinin stilini alır. |
| virtual [LineJoin](../../aspose.svg.rendering/graphiccontext/linejoin/) { get; set; } | Konturlu bir yolun bağlı parçaları arasındaki eklemlerin şeklini belirleyen kodu ayarlar veya alır. |
| virtual [LineWidth](../../aspose.svg.rendering/graphiccontext/linewidth/) { get; set; } | Vurulacak yolların kalınlığını ayarlar veya alır. |
| virtual [MiterLimit](../../aspose.svg.rendering/graphiccontext/miterlimit/) { get; set; } | Konturlu yollar için azaltılmış çizgi birleştirmelerinin maksimum uzunluğunu ayarlar veya alır. Bu parametre, çizgi parçaları keskin açılarda birleştiğinde üretilen "çivilerin" uzunluğunu sınırlar. |
| virtual [StrokeBrush](../../aspose.svg.rendering/graphiccontext/strokebrush/) { get; set; } | Konturlu yollar için kullanılan fırça nesnesini ayarlar veya alır. |
| virtual [TextInfo](../../aspose.svg.rendering/graphiccontext/textinfo/) { get; } | Bir alır[`TextInfo`](../../aspose.svg.rendering/textinfo/) işlenmiş metin hakkında bilgi içeren nesne. |
| override [TransformationMatrix](../../aspose.svg.rendering.image/imagegraphiccontext/transformationmatrix/) { get; set; } | Dönüşüm matrisini ayarlar veya alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| override [Clone](../../aspose.svg.rendering.image/imagegraphiccontext/clone/)() | Mevcut bir örnekle aynı özellik değerlerine sahip yeni bir GdiGraphicContext sınıfı örneği oluşturur. |
| override [Transform](../../aspose.svg.rendering.image/imagegraphiccontext/transform/)(Matrix) | Geçerli dönüşüm matrisini, belirtilen matrisi çarparak değiştirin. |

### Ayrıca bakınız

* class [GraphicContext](../../aspose.svg.rendering/graphiccontext/)
* class [ImageDevice](../imagedevice/)
* ad alanı [Aspose.Svg.Rendering.Image](../../aspose.svg.rendering.image/)
* toplantı [Aspose.SVG](../../)


