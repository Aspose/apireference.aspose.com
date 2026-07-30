---
title: "Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById Methode"
linktitle: "GetGlyphComponentsById"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById Methode. Gibt ein Glyph anhand der übergebenen Glyph-ID zurück und füllt die übergebene Liste von Glyph-IDs mit den Komponenten dieses Glyphs. Eine Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Font-Typ abhängt. Die Glyph-ID eines TTF Font kann eine Instanz der Klasse (GlyphStringId) oder der Klasse (GlyphUInt32Id) sein. Die Glyph-Adressierung per Name (string) wird für TTF-Fonts über die Post-Tabellen-Zuordnung unterstützt. Im Falle eines CFF Fonts werden die CFF-Strukturen verwendet, um Glyphs per Name anzusprechen in C++."
type: docs
weight: 1900
url: /de/cpp/aspose.font.ttf/ttffont/getglyphcomponentsbyid/
---
## TtfFont::GetGlyphComponentsById(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphIdList\>) method


Gibt ein Glyph anhand der übergebenen Glyph-ID zurück und füllt die übergebene Liste von Glyph-IDs mit den Komponenten dieses Glyphs. Eine Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Font-Typ abhängt. Die Glyph-ID des TTF [Font](../../../aspose.font/font/) kann eine Instanz der Klasse ([GlyphStringId](../)) oder der Klasse ([GlyphUInt32Id](../)) sein. Die Glyph-Adressierung per Name (string) wird für TTF-Fonts über die Post-Tabellen-Zuordnung unterstützt. Im Falle eines CFF [Font](../../../aspose.font/font/) werden die CFF-Strukturen verwendet, um Glyphs per Name anzusprechen.

```cpp
virtual void Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById(System::SharedPtr<Glyphs::GlyphId> id, System::SharedPtr<Glyphs::GlyphIdList> componentsToPopulate)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| id | System::SharedPtr\<Glyphs::GlyphId\> | Glyph-ID. |
| componentsToPopulate | System::SharedPtr\<Glyphs::GlyphIdList\> | Liste von Glyph-IDs zum Befüllen. |
## Hinweise


Eine leere Sammlung componentsToPopulate sollte übergeben werden, die die Liste der Glyph-Komponenten-IDs enthält.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphComponentsById(System::String, System::SharedPtr\<Glyphs::GlyphIdList\>) method


Liest eine Glyphe anhand des übergebenen Namens und füllt die übergebene Liste von Glyphen‑IDs mit den Komponenten dieser Glyphe.

```cpp
void Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById(System::String glyphName, System::SharedPtr<Glyphs::GlyphIdList> componentsToPopulate)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| glyphName | System::String | Glyph-Name. |
| componentsToPopulate | System::SharedPtr\<Glyphs::GlyphIdList\> | Liste von Glyph-IDs zum Befüllen. |
## Hinweise


Eine leere Sammlung componentsToPopulate sollte übergeben werden, die die Liste der Glyph-Komponenten-IDs enthält.

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphComponentsById(uint32_t, System::SharedPtr\<Glyphs::GlyphIdList\>) method


Liest eine Glyphe anhand des übergebenen Indexes und füllt die übergebene Liste von Glyphen‑IDs mit den Komponenten dieser Glyphe.

```cpp
void Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById(uint32_t id, System::SharedPtr<Glyphs::GlyphIdList> componentsToPopulate)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| id | uint32_t | Glyph-Index. |
| componentsToPopulate | System::SharedPtr\<Glyphs::GlyphIdList\> | Liste von Glyph-IDs zum Befüllen. |
## Hinweise


Eine leere Sammlung componentsToPopulate sollte übergeben werden, die die Liste der Glyph-Komponenten-IDs enthält.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
