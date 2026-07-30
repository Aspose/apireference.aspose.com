---
title: "Méthode Aspose::Font::Type1::Type1Encoding::UnicodeToGid"
linktitle: "UnicodeToGid"
second_title: "Aspose.Font pour C++"
description: "Méthode Aspose::Font::Type1::Type1Encoding::UnicodeToGid. Retourne le GlyphId pour l'Unicode. Ou notdef si la police ne contient pas de glyphe pour cet Unicode. L'identifiant du glyphe est un nombre unique pour un glyphe, dépendant du type de police. Par exemple : l'identifiant de Type1 est un nom de glyphe, instance de la classe (GlyphStringId). L'identifiant de TTF est un indice entier, instance de la classe (GlyphUInt32Id) en C++."
type: docs
weight: 600
url: /fr/cpp/aspose.font.type1/type1encoding/unicodetogid/
---
## Type1Encoding::UnicodeToGid method


Retourne le GlyphId pour l'Unicode. Ou notdef si la police ne contient pas de glyphe pour cet Unicode. L'identifiant du glyphe est un nombre unique pour un glyphe, dépendant du type de police. Par exemple : l'identifiant de [Type1](../../) est un nom de glyphe, instance de la classe ([GlyphStringId](../)). L'identifiant de TTF est un indice entier, instance de la classe ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Type1::Type1Encoding::UnicodeToGid(uint32_t unicode) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| unicode | uint32_t | Unicode pour obtenir l'identifiant du glyphe. |

### ReturnValue

Identifiant du glyphe lié à l'Unicode fourni.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Type1Encoding](../)
* Namespace [Aspose::Font::Type1](../../)
* Library [Aspose.Font for C++](../../../)
