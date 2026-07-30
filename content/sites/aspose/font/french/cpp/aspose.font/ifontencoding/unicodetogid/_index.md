---
title: "Méthode Aspose::Font::IFontEncoding::UnicodeToGid"
linktitle: "UnicodeToGid"
second_title: "Aspose.Font pour C++"
description: "Méthode Aspose::Font::IFontEncoding::UnicodeToGid. Décode un unicode et renvoie l'identifiant de glyphe. L'identifiant de glyphe est un numéro unique pour un glyphe, qui dépend du type de police. Par exemple : l'identifiant de Type1 est un nom de glyphe, instance de la classe (GlyphStringId). L'identifiant de TTF est un indice entier, instance de la classe (GlyphUInt32Id) en C++."
type: docs
weight: 500
url: /fr/cpp/aspose.font/ifontencoding/unicodetogid/
---
## IFontEncoding::UnicodeToGid method


Décode un unicode et renvoie l'identifiant de glyphe. L'identifiant de glyphe est un numéro unique pour un glyphe, qui dépend du type de police. Par exemple : l'identifiant de [Type1](../../../aspose.font.type1/) est un nom de glyphe, instance de la classe ([GlyphStringId](../)). L'identifiant de TTF est un indice entier, instance de la classe ([GlyphUInt32Id](../)).

```cpp
virtual System::SharedPtr<Glyphs::GlyphId> Aspose::Font::IFontEncoding::UnicodeToGid(uint32_t unicode)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| unicode | uint32_t | Unicode pour obtenir l'identifiant du glyphe. |

### ReturnValue

Identifiant du glyphe lié à l'Unicode fourni.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
