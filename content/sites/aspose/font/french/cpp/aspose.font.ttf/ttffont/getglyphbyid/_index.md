---
title: "Aspose::Font::Ttf::TtfFont::GetGlyphById méthode"
linktitle: "ObtenirGlyphParId"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::Ttf::TtfFont::GetGlyphById méthode. Retourne le glyphe par identifiant de glyphe. L’identifiant de glyphe est un numéro unique pour un glyphe, dépendant du type de police. L’identifiant de glyphe TTF peut être une instance de la classe (GlyphStringId) ou de la classe (GlyphUInt32Id). L’adressage des glyphes par nom (string) est pris en charge pour les polices TTF via le mappage de la table Post. Dans le cas d’une police CFF, les structures CFF sont utilisées pour adresser les glyphes par nom en C++."
type: docs
weight: 1800
url: /fr/cpp/aspose.font.ttf/ttffont/getglyphbyid/
---
## TtfFont::GetGlyphById(System::SharedPtr\<Glyphs::GlyphId\>) method


Retourne le glyphe par identifiant de glyphe. L’identifiant de glyphe est un numéro unique pour un glyphe, dépendant du type de police. L’identifiant de glyphe TTF [Font](../../../aspose.font/font/) peut être une instance de la classe ([GlyphStringId](../)) ou de la classe ([GlyphUInt32Id](../)). L’adressage des glyphes par nom (string) est pris en charge pour les polices TTF via le mappage de la table Post. Dans le cas d’une [Font](../../../aspose.font/font/) CFF, les structures CFF sont utilisées pour adresser les glyphes par nom.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Ttf::TtfFont::GetGlyphById(System::SharedPtr<Glyphs::GlyphId> id) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| id | System::SharedPtr\<Glyphs::GlyphId\> | Identifiant du glyphe. |

### ReturnValue

Glyphe.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphById(System::String) method


Retourne le glyphe par nom de glyphe. L’adressage des glyphes par nom (string) est pris en charge pour les polices TTF via le mappage de la table Post. Dans le cas d’une [Font](../../../aspose.font/font/) CFF, les structures CFF sont utilisées pour adresser les glyphes par nom.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Ttf::TtfFont::GetGlyphById(System::String glyphName)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| glyphName | System::String | Identifiant de chaîne de glyphe. |

### ReturnValue

Glyphe.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [String](../../../system/string/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphById(uint32_t) method


Renvoie le glyphe par identifiant de glyphe.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Ttf::TtfFont::GetGlyphById(uint32_t id)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| id | uint32_t | Index du glyphe. |

### ReturnValue

Glyphe.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
