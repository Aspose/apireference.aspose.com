---
title: "Aspose::Font::Cff::CffEncoding::GidToUnicode méthode"
linktitle: "GidVersUnicode"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::Cff::CffEncoding::GidToUnicode méthode. Décode le Gid en Unicode. L'identifiant du glyphe est un numéro unique pour un glyphe, qui dépend du type de police. L'identifiant de glyphe CFF Font peut être une instance de la classe (GlyphStringId) ou de la classe (GlyphUInt32Id) en C++."
type: docs
weight: 800
url: /fr/cpp/aspose.font.cff/cffencoding/gidtounicode/
---
## CffEncoding::GidToUnicode method


Décode le Gid en Unicode. L'identifiant du glyphe est un numéro unique pour un glyphe, qui dépend du type de police. L'identifiant de glyphe CFF [Font](../../../aspose.font/font/) peut être une instance de la classe ([GlyphStringId](../)) ou de la classe ([GlyphUInt32Id](../)).

```cpp
uint32_t Aspose::Font::Cff::CffEncoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> gid) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| gid | System::SharedPtr\<Glyphs::GlyphId\> | Identifiant du glyphe du symbole à décoder. |

### ReturnValue

Valeur Unicode liée à l'identifiant du glyphe fourni.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
