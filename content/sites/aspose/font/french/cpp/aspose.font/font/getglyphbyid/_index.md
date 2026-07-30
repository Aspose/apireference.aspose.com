---
title: "Aspose::Font::Font::GetGlyphById méthode"
linktitle: "ObtenirGlyphParId"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::Font::GetGlyphById méthode. Renvoie le glyphe par identifiant de glyphe. L'identifiant de glyphe est un nombre unique pour un glyphe, qui dépend du type de police. GlyphId - objet dérivé. Par exemple : l'identifiant de Type1 est un nom de glyphe, instance de la classe (GlyphStringId). L'identifiant de TTF est un indice entier, instance de la classe (GlyphUInt32Id) en C++."
type: docs
weight: 1700
url: /fr/cpp/aspose.font/font/getglyphbyid/
---
## Font::GetGlyphById method


Renvoie le glyphe par identifiant de glyphe. L'identifiant de glyphe est un nombre unique pour un glyphe, qui dépend du type de police. GlyphId - objet dérivé. Par exemple : l'identifiant de [Type1](../../../aspose.font.type1/) est un nom de glyphe, instance de la classe ([GlyphStringId](../)). L'identifiant de TTF est un indice entier, instance de la classe ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Font::GetGlyphById(System::SharedPtr<Glyphs::GlyphId> id) override=0
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
* Class [Font](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
