---
title: "Aspose::Font::Ttf::TtfEncoding::GidToUnicode méthode"
linktitle: "GidVersUnicode"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::Ttf::TtfEncoding::GidToUnicode méthode. Décode l'identifiant du glyphe en Unicode. L'identifiant du glyphe est un nombre unique pour un glyphe, qui dépend du type de police. Par exemple : l'identifiant de Type1 est un nom de glyphe, instance de la classe (GlyphStringId). L'identifiant de TTF est un indice entier, instance de la classe (GlyphUInt32Id) en C++."
type: docs
weight: 400
url: /fr/cpp/aspose.font.ttf/ttfencoding/gidtounicode/
---
## TtfEncoding::GidToUnicode method


Décode l'identifiant du glyphe en Unicode. L'identifiant du glyphe est un nombre unique pour un glyphe, qui dépend du type de police. Par exemple : l'identifiant de [Type1](../../../aspose.font.type1/) est un nom de glyphe, instance de la classe ([GlyphStringId](../)). L'identifiant de TTF est un indice entier, instance de la classe ([GlyphUInt32Id](../)).

```cpp
uint32_t Aspose::Font::Ttf::TtfEncoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> glyphId) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| idGlyph | System::SharedPtr\<Glyphs::GlyphId\> | Identifiant du glyphe du symbole à décoder. |

### ReturnValue

Valeur Unicode liée à l'identifiant du glyphe fourni.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfEncoding](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
