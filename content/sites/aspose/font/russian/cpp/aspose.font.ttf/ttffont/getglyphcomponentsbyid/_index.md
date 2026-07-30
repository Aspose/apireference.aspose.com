---
title: "Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById метод"
linktitle: "GetGlyphComponentsById"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById метод. Получает глиф по переданному идентификатору глифа и заполняет переданный список идентификаторов глифов компонентами этого глифа. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Идентификатор глифа TTF Font может быть экземпляром класса (GlyphStringId) или класса (GlyphUInt32Id). Адресация глифов по имени (string) поддерживается для шрифтов TTF через сопоставление таблицы Post. В случае наличия шрифта CFF используются структуры CFF для адресации глифов по имени в C++."
type: docs
weight: 1900
url: /ru/cpp/aspose.font.ttf/ttffont/getglyphcomponentsbyid/
---
## TtfFont::GetGlyphComponentsById(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphIdList\>) method


Получает глиф по переданному идентификатору глифа и заполняет переданный список идентификаторов глифов компонентами этого глифа. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Идентификатор глифа TTF [Font](../../../aspose.font/font/) может быть экземпляром класса ([GlyphStringId](../)) или класса ([GlyphUInt32Id](../)). Адресация глифов по имени (string) поддерживается для шрифтов TTF через сопоставление таблицы Post. В случае наличия CFF [Font](../../../aspose.font/font/) используются структуры CFF для адресации глифов по имени.

```cpp
virtual void Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById(System::SharedPtr<Glyphs::GlyphId> id, System::SharedPtr<Glyphs::GlyphIdList> componentsToPopulate)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| id | System::SharedPtr\<Glyphs::GlyphId\> | Идентификатор глифа. |
| componentsToPopulate | System::SharedPtr\<Glyphs::GlyphIdList\> | Список идентификаторов глифов для заполнения. |
## Примечания


Необходимо передать пустую коллекцию componentsToPopulate, которая будет содержать список идентификаторов компонентов глифа.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphComponentsById(System::String, System::SharedPtr\<Glyphs::GlyphIdList\>) method


Получает глиф по переданному имени глифа и заполняет переданный список идентификаторов глифов компонентами этого глифа.

```cpp
void Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById(System::String glyphName, System::SharedPtr<Glyphs::GlyphIdList> componentsToPopulate)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| glyphName | System::String | Имя глифа. |
| componentsToPopulate | System::SharedPtr\<Glyphs::GlyphIdList\> | Список идентификаторов глифов для заполнения. |
## Примечания


Необходимо передать пустую коллекцию componentsToPopulate, которая будет содержать список идентификаторов компонентов глифа.

## См. также

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphComponentsById(uint32_t, System::SharedPtr\<Glyphs::GlyphIdList\>) method


Получает глиф по переданному индексу глифа и заполняет переданный список идентификаторов глифов компонентами этого глифа.

```cpp
void Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById(uint32_t id, System::SharedPtr<Glyphs::GlyphIdList> componentsToPopulate)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| id | uint32_t | Индекс глифа. |
| componentsToPopulate | System::SharedPtr\<Glyphs::GlyphIdList\> | Список идентификаторов глифов для заполнения. |
## Примечания


Необходимо передать пустую коллекцию componentsToPopulate, которая будет содержать список идентификаторов компонентов глифа.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
