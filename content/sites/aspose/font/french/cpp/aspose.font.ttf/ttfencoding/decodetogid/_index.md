---
title: "Aspose::Font::Ttf::TtfEncoding::DecodeToGid méthode"
linktitle: "DecodeToGid"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::Ttf::TtfEncoding::DecodeToGid méthode. L'implémentation DecodeToGlyphId de la police TTF trouve la table Unicode et renvoie l'identifiant du glyphe pour le caractère Unicode. L'identifiant du glyphe est un nombre unique pour un glyphe, qui dépend du type de police. Par exemple : l'identifiant de Type1 est un nom de glyphe, instance de la classe (GlyphStringId). L'identifiant de TTF est un indice entier, instance de la classe (GlyphUInt32Id) en C++."
type: docs
weight: 100
url: /fr/cpp/aspose.font.ttf/ttfencoding/decodetogid/
---
## TtfEncoding::DecodeToGid method


TTF [Font](../../../aspose.font/font/) implémentation de DecodeToGlyphId trouve la table Unicode et renvoie l'identifiant du glyphe pour le caractère Unicode. L'identifiant du glyphe est un nombre unique pour un glyphe, qui dépend du type de police. Par exemple : l'identifiant de [Type1](../../../aspose.font.type1/) est un nom de glyphe, instance de la classe ([GlyphStringId](../)). L'identifiant de TTF est un indice entier, instance de la classe ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Ttf::TtfEncoding::DecodeToGid(uint32_t unicode) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| unicode | uint32_t | Code de caractère pour obtenir l'identifiant du glyphe. |

### ReturnValue

Identifiant du glyphe lié au code de caractère fourni.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfEncoding](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
