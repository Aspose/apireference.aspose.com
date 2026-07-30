---
title: "Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById metodu"
linktitle: "GetGlyphComponentsById"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById metodu. Verilen glif tanımlayıcısına göre bir glifi alır ve bu glifin bileşenleriyle glif tanımlayıcılarının listesini doldurur. Glif kimliği, glif için benzersiz bir sayıdır ve yazı tipi türüne bağlıdır. TTF Font glif kimliği, (GlyphStringId) sınıfının ya da (GlyphUInt32Id) sınıfının bir örneği olabilir. Ad (string) glif adreslemesi, TTF Fontlar için Post tablosu eşlemesi aracılığıyla desteklenir. CFF Font içinde ise, CFF yapıları C++'ta glifleri ada göre adreslemek için kullanılır."
type: docs
weight: 1900
url: /tr/cpp/aspose.font.ttf/ttffont/getglyphcomponentsbyid/
---
## TtfFont::GetGlyphComponentsById(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphIdList\>) method


Verilen glif tanımlayıcısına göre bir glifi alır ve bu glifin bileşenleriyle glif tanımlayıcılarının listesini doldurur. Glif kimliği, glif için benzersiz bir sayıdır ve yazı tipi türüne bağlıdır. TTF [Font](../../../aspose.font/font/) glif kimliği, ([GlyphStringId](../)) sınıfının ya da ([GlyphUInt32Id](../)) sınıfının bir örneği olabilir. Ad (string) glif adreslemesi, TTF Fontlar için Post tablosu eşlemesi aracılığıyla desteklenir. CFF [Font](../../../aspose.font/font/) içinde ise, CFF yapıları ada göre glifleri adreslemek için kullanılır.

```cpp
virtual void Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById(System::SharedPtr<Glyphs::GlyphId> id, System::SharedPtr<Glyphs::GlyphIdList> componentsToPopulate)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| kimlik | System::SharedPtr\<Glyphs::GlyphId\> | Glif kimliği. |
| componentsToPopulate | System::SharedPtr\<Glyphs::GlyphIdList\> | Doldurulacak glif kimliklerinin listesi. |
## Açıklamalar


Boş bir koleksiyon olan componentsToPopulate, glif bileşenleri kimlik listesini içerecek şekilde geçirilmelidir.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphComponentsById(System::String, System::SharedPtr\<Glyphs::GlyphIdList\>) method


Verilen glif adıyla bir glif alır ve bu glifin bileşenleriyle verilen glif tanımlayıcıları listesini doldurur.

```cpp
void Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById(System::String glyphName, System::SharedPtr<Glyphs::GlyphIdList> componentsToPopulate)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| glyphName | System::String | Glif adı. |
| componentsToPopulate | System::SharedPtr\<Glyphs::GlyphIdList\> | Doldurulacak glif kimliklerinin listesi. |
## Açıklamalar


Boş bir koleksiyon olan componentsToPopulate, glif bileşenleri kimlik listesini içerecek şekilde geçirilmelidir.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphComponentsById(uint32_t, System::SharedPtr\<Glyphs::GlyphIdList\>) method


Verilen glif indeksiyle bir glif alır ve bu glifin bileşenleriyle verilen glif tanımlayıcıları listesini doldurur.

```cpp
void Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById(uint32_t id, System::SharedPtr<Glyphs::GlyphIdList> componentsToPopulate)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| kimlik | uint32_t | Glif indeksi. |
| componentsToPopulate | System::SharedPtr\<Glyphs::GlyphIdList\> | Doldurulacak glif kimliklerinin listesi. |
## Açıklamalar


Boş bir koleksiyon olan componentsToPopulate, glif bileşenleri kimlik listesini içerecek şekilde geçirilmelidir.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
