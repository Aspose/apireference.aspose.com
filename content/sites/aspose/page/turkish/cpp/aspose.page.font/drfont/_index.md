---
title: "Aspose::Page::Font::DrFont sınıfı"
linktitle: "DrFont"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::Font::DrFont sınıfı. Bu sınıfı C++'ta GDI+ Font yerine kullanın."
type: docs
weight: 100
url: /tr/cpp/aspose.page.font/drfont/
---
## DrFont class


Bu sınıfı GDI+ [Font](../) yerine kullanın.

```cpp
class DrFont : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Belirtilen [System::Object](../../system/object/) öğesinin bu örnekle eşit olup olmadığını belirler. |
| [get_AscentLis](./get_ascentlis/)() | Bu yazı tipinin hücre yükselişi (lis). Bu, hücre üstünden hücre taban çizgisine kadar olan dikey mesafedir. |
| [get_AscentPoints](./get_ascentpoints/)() | Hücre yükselişini puan cinsinden döndürür. |
| [get_CellHeightLis](./get_cellheightlis/)() | Bu yazı tipinin hücre yüksekliğini (lis) döndürür. Bu, [AscentLis](../) + [DescentLis](../) için bir kısayoldur. |
| [get_CellHeightPoints](./get_cellheightpoints/)() | [AscentPoints](../) + [DescentPoints](../) için kısayol. |
| [get_DescentLis](./get_descentlis/)() | Bu yazı tipinin hücre alçalması (lis). Bu, hücre altından hücre taban çizgisine dikey mesafedir. |
| [get_DescentPoints](./get_descentpoints/)() | Hücre alçalmasını puan cinsinden döndürür. |
| [get_FamilyName](./get_familyname/)() | Bu yazı tipinin adını alır. |
| [get_IsBold](./get_isbold/)() | Bu örneğin kalın olup olmadığını gösteren bir değeri alır. |
| [get_IsItalic](./get_isitalic/)() | Bu örneğin italik olup olmadığını gösteren bir değeri alır. |
| [get_LeadingLis](./get_leadinglis/)() | Bu yazı tipinin ön boşluğunu (lis) döndürür. Bu, [LineSpacingLis](../) - [CellHeightLis](../) için bir kısayoldur. |
| [get_LeadingPoints](./get_leadingpoints/)() | Bu yazı tipinin ön boşluğunu (lis) döndürür. Bu, [LineSpacingLis](../) - [CellHeightLis](../) için bir kısayoldur. |
| [get_LineSpacingLis](./get_linespacinglis/)() | Bu yazı tipinin hücre aralığını (lis) döndürür. Bu, iki glifin taban çizgileri arasındaki dikey mesafedir. |
| [get_LineSpacingPoints](./get_linespacingpoints/)() | Bu yazı tipinin hücre aralığını (puan) döndürür. Bu, iki glifin taban çizgileri arasındaki dikey mesafedir. |
| [get_SizePoints](./get_sizepoints/)() | Bu yazı tipinin boyutunu (puan) alır. |
| [get_SmallCapsScaleFactor](./get_smallcapsscalefactor/)() | Yazı tipinin büyük harflerini alır. |
| [get_Style](./get_style/)() | TrueType yazı tipini alır. |
| [get_StyleEx](./get_styleex/)() | Bu özellik, yazı tipinin stili hakkında ek bilgi içerir. |
| [GetCharWidthLis](./getcharwidthlis/)(char16_t) | Karakter genişliğini (lis) alır. |
| [GetCharWidthPoints](./getcharwidthpoints/)(char16_t) | Karakterin genişliğini (puan) döndürür. |
| [GetHashCode](./gethashcode/)() const override | Bu örnek için bir karma kod döndürür. |
| [GetTextSizePoints](./gettextsizepoints/)(System::String) | Metnin ölçüm metin kutusunu puan cinsinden döndürür. |
| [GetTextWidthLis](./gettextwidthlis/)(System::String) | Metin genişliğini (lis) alır. |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String) | Metin genişliğini (puan) alır. |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String, int32_t, int32_t) | Metin genişliğini (puan) alır. |
| static [IsPoorlyRenderedByGdiPlus](./ispoorlyrenderedbygdiplus/)(System::String) | "Microsoft Sans Serif" yazı tipi için True döndürür. Bu, GDI+ tarafından kötü render edilir. Test286 ve Gemini-6959'a bakın. |
| [Replace](./replace/)(System::SharedPtr\<DrFont\>) | Yazı tipi içeriğini değiştir. |
| [set_SizePoints](./set_sizepoints/)(float) | Bu yazı tipinin boyutunu (puan) alır. |
| [set_StyleEx](./set_styleex/)(int16_t) | Bu özellik, yazı tipinin stili hakkında ek bilgi içerir. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Font](../)
* Library [Aspose.Page for C++](../../)
