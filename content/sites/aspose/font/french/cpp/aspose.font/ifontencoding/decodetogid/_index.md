---
title: "Méthode Aspose::Font::IFontEncoding::DecodeToGid"
linktitle: "DecodeToGid"
second_title: "Aspose.Font pour C++"
description: "Méthode Aspose::Font::IFontEncoding::DecodeToGid. Décode un code caractère et renvoie l'identifiant de glyphe. L'identifiant de glyphe est un numéro unique pour un glyphe, qui dépend du type de police. Par exemple : l'identifiant de Type1 est un nom de glyphe, instance de la classe (GlyphStringId). L'identifiant de TTF est un indice entier, instance de la classe (GlyphUInt32Id). Remarque : le code caractère n'est pas nécessairement un unicode. Le code caractère est un indice de caractère dans la « table » d'encodage de la police en C++."
type: docs
weight: 100
url: /fr/cpp/aspose.font/ifontencoding/decodetogid/
---
## IFontEncoding::DecodeToGid method


Décode un code caractère et renvoie l'identifiant de glyphe. L'identifiant de glyphe est un numéro unique pour un glyphe, qui dépend du type de police. Par exemple : l'identifiant de [Type1](../../../aspose.font.type1/) est un nom de glyphe, instance de la classe ([GlyphStringId](../)). L'identifiant de TTF est un indice entier, instance de la classe ([GlyphUInt32Id](../)). Remarque : le code caractère n'est pas nécessairement un unicode. Le code caractère est un indice de caractère dans la « table » d'encodage de [Font](../../font/).

```cpp
virtual System::SharedPtr<Glyphs::GlyphId> Aspose::Font::IFontEncoding::DecodeToGid(uint32_t charCode)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| charCode | uint32_t | Code de caractère pour obtenir l'identifiant du glyphe. |

### ReturnValue

Identifiant de glyphe lié au charCode fourni.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
