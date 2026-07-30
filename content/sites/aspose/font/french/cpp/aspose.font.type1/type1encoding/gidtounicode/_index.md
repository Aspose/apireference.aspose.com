---
title: "Aspose::Font::Type1::Type1Encoding::GidToUnicode méthode"
linktitle: "GidVersUnicode"
second_title: "Aspose.Font pour C++"
description: "Méthode Aspose::Font::Type1::Type1Encoding::GidToUnicode. Décode le Gid en Unicode. L'identifiant du glyphe est un nombre unique pour un glyphe, dépendant du type de police. Par exemple : l'identifiant de Type1 est un nom de glyphe, instance de la classe (GlyphStringId). L'identifiant de TTF est un indice entier, instance de la classe (GlyphUInt32Id) en C++."
type: docs
weight: 500
url: /fr/cpp/aspose.font.type1/type1encoding/gidtounicode/
---
## Type1Encoding::GidToUnicode method


Décode le Gid en Unicode. L'identifiant du glyphe est un nombre unique pour un glyphe, dépendant du type de police. Par exemple : l'identifiant de [Type1](../../) est un nom de glyphe, instance de la classe ([GlyphStringId](../)). L'identifiant de TTF est un indice entier, instance de la classe ([GlyphUInt32Id](../)).

```cpp
uint32_t Aspose::Font::Type1::Type1Encoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> gid) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| gid | System::SharedPtr\<Glyphs::GlyphId\> | Identifiant du glyphe du symbole à décoder. |

### ReturnValue

Valeur Unicode liée à l'identifiant du glyphe fourni.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Type1Encoding](../)
* Namespace [Aspose::Font::Type1](../../)
* Library [Aspose.Font for C++](../../../)
