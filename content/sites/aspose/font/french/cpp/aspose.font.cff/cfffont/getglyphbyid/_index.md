---
title: "Méthode Aspose::Font::Cff::CffFont::GetGlyphById"
linktitle: "ObtenirGlyphParId"
second_title: "Aspose.Font pour C++"
description: "Méthode Aspose::Font::Cff::CffFont::GetGlyphById. Retourne le glyphe par son identifiant. L'identifiant de glyphe est un numéro unique pour un glyphe, dépendant du type de police. L'identifiant de glyphe CFF Font peut être une instance de la classe (GlyphStringId) ou de la classe (GlyphUInt32Id) en C++."
type: docs
weight: 1800
url: /fr/cpp/aspose.font.cff/cfffont/getglyphbyid/
---
## CffFont::GetGlyphById(System::SharedPtr\<Glyphs::GlyphId\>) method


Retourne le glyphe par son identifiant. L'identifiant de glyphe est un numéro unique pour un glyphe, dépendant du type de police. L'identifiant de glyphe CFF [Font](../../../aspose.font/font/) peut être une instance de la classe ([GlyphStringId](../)) ou de la classe ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Cff::CffFont::GetGlyphById(System::SharedPtr<Glyphs::GlyphId> id) override
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
* Class [CffFont](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
## CffFont::GetGlyphById(System::String) method


Retourne le glyphe par nom de glyphe.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Cff::CffFont::GetGlyphById(System::String glyphName)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| glyphName | System::String | Nom du glyphe. |

### ReturnValue

Glyphe.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [String](../../../system/string/)
* Class [CffFont](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
## CffFont::GetGlyphById(uint32_t) method


Renvoie le glyphe par identifiant de glyphe.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Cff::CffFont::GetGlyphById(uint32_t id)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| id | uint32_t | Identifiant du glyphe. |

### ReturnValue

Glyphe.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [CffFont](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
