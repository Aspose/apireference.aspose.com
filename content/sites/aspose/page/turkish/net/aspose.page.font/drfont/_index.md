---
title: Class DrFont
second_title: Aspose.Page for .NET API Referansı
description: Aspose.Page.Font.DrFont sınıf. GDI yerine bu sınıfı kullanın Font
type: docs
weight: 220
url: /tr/net/aspose.page.font/drfont/
---
## DrFont class

GDI+ yerine bu sınıfı kullanın Font

```csharp
public class DrFont
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [AscentLis](../../aspose.page.font/drfont/ascentlis/) { get; } | Bu yazı tipinin (lis) hücre yükselişi. Bu, hücre tepesinden hücre taban çizgisine dikey bir mesafedir. |
| [AscentPoints](../../aspose.page.font/drfont/ascentpoints/) { get; } | Nokta cinsinden hücre yükselişini verir. |
| [CellHeightLis](../../aspose.page.font/drfont/cellheightlis/) { get; } | Bu yazı tipinin (lis) hücre yüksekliğini döndürür. Bu,[`AscentLis`](./ascentlis/) +[`DescentLis`](./descentlis/) . |
| [CellHeightPoints](../../aspose.page.font/drfont/cellheightpoints/) { get; } | için kısayol[`AscentPoints`](./ascentpoints/) +[`DescentPoints`](./descentpoints/) . |
| [DescentLis](../../aspose.page.font/drfont/descentlis/) { get; } | Bu yazı tipinin (lis) hücre inişi. Bu, hücre tabanından hücre taban çizgisine olan dikey mesafedir. |
| [DescentPoints](../../aspose.page.font/drfont/descentpoints/) { get; } | Nokta cinsinden hücre inişini verir. |
| [FamilyName](../../aspose.page.font/drfont/familyname/) { get; } | Bu yazı tipinin adını alır. |
| [IsBold](../../aspose.page.font/drfont/isbold/) { get; } | Bu örneğin kalın olup olmadığını gösteren bir değer alır. |
| [IsItalic](../../aspose.page.font/drfont/isitalic/) { get; } | Bu örneğin italik olup olmadığını gösteren bir değer alır. |
| [LeadingLis](../../aspose.page.font/drfont/leadinglis/) { get; } | Bu yazı tipinin (lis) başını döndürür. Bu,[`LineSpacingLis`](./linespacinglis/) -[`CellHeightLis`](./cellheightlis/) . |
| [LeadingPoints](../../aspose.page.font/drfont/leadingpoints/) { get; } | Bu yazı tipinin (lis) başını döndürür. Bu,[`LineSpacingLis`](./linespacinglis/) -[`CellHeightLis`](./cellheightlis/) . |
| [LineSpacingLis](../../aspose.page.font/drfont/linespacinglis/) { get; } | Bu yazı tipinin (lis) hücre aralığını döndürür. Bu, iki glifin taban çizgileri arasındaki dikey mesafedir. |
| [LineSpacingPoints](../../aspose.page.font/drfont/linespacingpoints/) { get; } | Bu yazı tipinin (nokta) hücre aralığını verir. Bu, iki glifin taban çizgileri arasındaki dikey mesafedir. |
| [SizePoints](../../aspose.page.font/drfont/sizepoints/) { get; set; } | Bu yazı tipinin boyutunu alır (puan). |
| [SmallCapsScaleFactor](../../aspose.page.font/drfont/smallcapsscalefactor/) { get; } | SmallCaps ölçek faktörünü alır. |
| [Style](../../aspose.page.font/drfont/style/) { get; } | Bu yazı tipinin stilini alır. |
| [StyleEx](../../aspose.page.font/drfont/styleex/) { get; set; } | Bu özellik, yazı tipi stili hakkında ek bilgi içerir |

## yöntemler

| İsim | Tanım |
| --- | --- |
| override [Equals](../../aspose.page.font/drfont/equals/)(object) | Belirtilenin olup olmadığını belirler.Object , bu örneğe eşittir. |
| [GetCharWidthLis](../../aspose.page.font/drfont/getcharwidthlis/)(char) | Karakter genişliğini alır lis. |
| [GetCharWidthPoints](../../aspose.page.font/drfont/getcharwidthpoints/)(char) | Karakterin (nokta) genişliğini döndürür. |
| override [GetHashCode](../../aspose.page.font/drfont/gethashcode/)() | Bu örnek için bir karma kod döndürür. |
| [GetTextSizePoints](../../aspose.page.font/drfont/gettextsizepoints/)(string) | Metnin ölçüm metin kutusunu punto cinsinden döndürür. |
| [GetTextWidthLis](../../aspose.page.font/drfont/gettextwidthlis/)(string) | lis. metin genişliğini alır |
| [GetTextWidthPoints](../../aspose.page.font/drfont/gettextwidthpoints/#gettextwidthpoints)(string) | Metin genişlik noktalarını alır. |
| [GetTextWidthPoints](../../aspose.page.font/drfont/gettextwidthpoints/#gettextwidthpoints_1)(string, int, int) | Metin genişlik noktalarını alır. |
| [Replace](../../aspose.page.font/drfont/replace/)(DrFont) | Yazı tipi içeriğini değiştir |
| static [IsPoorlyRenderedByGdiPlus](../../aspose.page.font/drfont/ispoorlyrenderedbygdiplus/)(string) | "Microsoft Sans Serif" yazı tipi için True değerini döndürür. Bu, GDI+ tarafından kötü bir şekilde oluşturulmuş. Bkz. Test286 ve Gemini-6959. |

### Ayrıca bakınız

* ad alanı [Aspose.Page.Font](../../aspose.page.font/)
* toplantı [Aspose.Page](../../)


