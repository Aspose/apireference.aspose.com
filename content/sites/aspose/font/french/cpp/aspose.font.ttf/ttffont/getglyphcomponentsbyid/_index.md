---
title: "Méthode Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById"
linktitle: "GetGlyphComponentsById"
second_title: "Aspose.Font pour C++"
description: "Méthode Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById. Obtient un glyphe à partir de l'identifiant de glyphe fourni et remplit la liste d'identifiants de glyphes fournie avec les composants de ce glyphe. L'identifiant de glyphe est un numéro unique pour un glyphe, qui dépend du type de police. L'identifiant de glyphe TTF Font peut être une instance de la classe (GlyphStringId) ou de la classe (GlyphUInt32Id). L'adressage de glyphe par nom (string) est pris en charge pour les polices TTF via le mappage de la table Post. Dans le cas d'une police CFF, les structures CFF sont utilisées pour adresser les glyphes par nom en C++."
type: docs
weight: 1900
url: /fr/cpp/aspose.font.ttf/ttffont/getglyphcomponentsbyid/
---
## TtfFont::GetGlyphComponentsById(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphIdList\>) method


Obtient un glyphe à partir de l'identifiant de glyphe fourni et remplit la liste d'identifiants de glyphes fournie avec les composants de ce glyphe. L'identifiant de glyphe est un numéro unique pour un glyphe, qui dépend du type de police. L'identifiant de glyphe TTF [Font](../../../aspose.font/font/) peut être une instance de la classe ([GlyphStringId](../)) ou de la classe ([GlyphUInt32Id](../)). L'adressage de glyphe par nom (string) est pris en charge pour les polices TTF via le mappage de la table Post. Dans le cas d'une [Font](../../../aspose.font/font/) CFF, les structures CFF sont utilisées pour adresser les glyphes par nom.

```cpp
virtual void Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById(System::SharedPtr<Glyphs::GlyphId> id, System::SharedPtr<Glyphs::GlyphIdList> componentsToPopulate)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| id | System::SharedPtr\<Glyphs::GlyphId\> | Identifiant du glyphe. |
| componentsToPopulate | System::SharedPtr\<Glyphs::GlyphIdList\> | Liste des identifiants de glyphes à remplir. |
## Remarques


Une collection vide componentsToPopulate doit être passée, qui contiendra la liste des identifiants des composants du glyphe.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphComponentsById(System::String, System::SharedPtr\<Glyphs::GlyphIdList\>) method


Obtient un glyphe par le nom de glyphe fourni et remplit la liste d'identifiants de glyphes passée avec les composants de ce glyphe.

```cpp
void Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById(System::String glyphName, System::SharedPtr<Glyphs::GlyphIdList> componentsToPopulate)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| glyphName | System::String | Nom du glyphe. |
| componentsToPopulate | System::SharedPtr\<Glyphs::GlyphIdList\> | Liste des identifiants de glyphes à remplir. |
## Remarques


Une collection vide componentsToPopulate doit être passée, qui contiendra la liste des identifiants des composants du glyphe.

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphComponentsById(uint32_t, System::SharedPtr\<Glyphs::GlyphIdList\>) method


Obtient un glyphe par l'index de glyphe fourni et remplit la liste d'identifiants de glyphes passée avec les composants de ce glyphe.

```cpp
void Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById(uint32_t id, System::SharedPtr<Glyphs::GlyphIdList> componentsToPopulate)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| id | uint32_t | Index du glyphe. |
| componentsToPopulate | System::SharedPtr\<Glyphs::GlyphIdList\> | Liste des identifiants de glyphes à remplir. |
## Remarques


Une collection vide componentsToPopulate doit être passée, qui contiendra la liste des identifiants des composants du glyphe.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
