---
title: "Méthode Aspose::Font::Type1::Type1Encoding::DecodeToGid"
linktitle: "DecodeToGid"
second_title: "Aspose.Font pour C++"
description: "Méthode Aspose::Font::Type1::Type1Encoding::DecodeToGid. Décode le Gid en Unicode. L'identifiant du glyphe est un nombre unique pour un glyphe, dépendant du type de police. Par exemple : l'identifiant de Type1 est un nom de glyphe, instance de la classe (GlyphStringId). L'identifiant de TTF est un indice entier, instance de la classe (GlyphUInt32Id) en C++."
type: docs
weight: 100
url: /fr/cpp/aspose.font.type1/type1encoding/decodetogid/
---
## Type1Encoding::DecodeToGid method


Décode le Gid en Unicode. L'identifiant du glyphe est un nombre unique pour un glyphe, dépendant du type de police. Par exemple : l'identifiant de [Type1](../../) est un nom de glyphe, instance de la classe ([GlyphStringId](../)). L'identifiant de TTF est un indice entier, instance de la classe ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Type1::Type1Encoding::DecodeToGid(uint32_t charCode) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| charCode | uint32_t | Code de caractère pour obtenir l'identifiant du glyphe. |

### ReturnValue

Identifiant du glyphe lié au code de caractère fourni.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Type1Encoding](../)
* Namespace [Aspose::Font::Type1](../../)
* Library [Aspose.Font for C++](../../../)
