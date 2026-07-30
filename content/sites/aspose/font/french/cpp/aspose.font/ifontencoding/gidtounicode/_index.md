---
title: "Aspose::Font::IFontEncoding::GidToUnicode méthode"
linktitle: "GidVersUnicode"
second_title: "Aspose.Font pour C++"
description: "Méthode Aspose::Font::IFontEncoding::GidToUnicode. Décode Gid en unicode. L'identifiant de glyphe est un numéro unique pour un glyphe, qui dépend du type de police. Par exemple : l'identifiant de Type1 est un nom de glyphe, instance de la classe (GlyphStringId). L'identifiant de TTF est un indice entier, instance de la classe (GlyphUInt32Id) en C++."
type: docs
weight: 400
url: /fr/cpp/aspose.font/ifontencoding/gidtounicode/
---
## IFontEncoding::GidToUnicode method


Décode Gid en unicode. L'identifiant de glyphe est un numéro unique pour un glyphe, qui dépend du type de police. Par exemple : l'identifiant de [Type1](../../../aspose.font.type1/) est un nom de glyphe, instance de la classe ([GlyphStringId](../)). L'identifiant de TTF est un indice entier, instance de la classe ([GlyphUInt32Id](../)).

```cpp
virtual uint32_t Aspose::Font::IFontEncoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> gid)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| gid | System::SharedPtr\<Glyphs::GlyphId\> | Identifiant du glyphe du symbole à décoder. |

### ReturnValue

Valeur Unicode liée à l'identifiant du glyphe fourni.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
