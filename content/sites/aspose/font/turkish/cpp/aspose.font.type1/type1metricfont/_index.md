---
title: "Aspose::Font::Type1::Type1MetricFont sınıfı"
linktitle: "Type1MetricFont"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Type1::Type1MetricFont sınıfı. Type1 ölçüm yazı tipi uygulaması. Bu type1 yazı tipi yalnızca ölçümler kullanılarak oluşturulur. Glif alma işlevleri ve gerçek yazı tipi gerektiren diğer bazı işlevler izin verilmez, izin verilmeyen işlevler Type1NotSupportedException istisnasını fırlatır. Diğer özellikler (FontName, Weight, Metrics ve Encoding) C++'ta ölçüm dosyasından kullanılır."
type: docs
weight: 500
url: /tr/cpp/aspose.font.type1/type1metricfont/
---
## Type1MetricFont class


[Type1](../) metric font implementation. This type1 font is created using metrics only. [Glyphs](../../aspose.font.glyphs/) retrieval functions and some other that require real font are not allowed, not allowed functions throw exception [Type1NotSupportedException](../). Other properties (FontName, Weight, Metrics and Encoding) are used from metrics file.

```cpp
class Type1MetricFont : public Aspose::Font::Type1::Type1Font
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | Kodlama ölçüm dosyasında tanımlanır. StandardAdobeEncoding: kodlama otomatik olarak doldurulur. |
| [get_FontFamily](./get_fontfamily/)() override | [Font](../../aspose.font/font/) ailesini alır. |
| [get_FontName](./get_fontname/)() override | [Font](../../aspose.font/font/) adını alır. |
| [get_FontStyle](./get_fontstyle/)() override | [Font](../../aspose.font/font/) stilini alır. Bu, genelleştirilmiş bir türde hesaplanan ve temsil edilen bir değerdir. |
| [get_NumGlyphs](./get_numglyphs/)() override | Belirtilen [Font](../../aspose.font/font/) içindeki glif sayısını alır. |
| [get_Style](./get_style/)() override | [Font](../../aspose.font/font/) stilini alır. |
| [GetAllGlyphIds](./getallglyphids/)() override | [Font](../../aspose.font/font/) içinde mevcut olan tüm glif kimliklerini döndürür. [Type1MetricFont](./) türü için desteklenmez. |
| [GetGlyphById](./getglyphbyid/)(System::String) override | Glif kimliğine göre glifi döndürür. [Type1MetricFont](./) türü için desteklenmez. |
| [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Glif kimliğine göre glifi döndürür. [Type1MetricFont](./) türü için desteklenmez. |
## Ayrıca Bakınız

* Class [Type1Font](../type1font/)
* Namespace [Aspose::Font::Type1](../)
* Library [Aspose.Font for C++](../../)
