---
title: "Méthode Aspose::Font::Cff::CffEncoding::UnicodeToGid"
linktitle: "UnicodeToGid"
second_title: "Aspose.Font pour C++"
description: "Méthode Aspose::Font::Cff::CffEncoding::UnicodeToGid. Décode un unicode et renvoie l’identifiant du glyphe. L’identifiant du glyphe est un numéro unique pour un glyphe, dépendant du type de police. L’identifiant du glyphe d’une police CFF peut être une instance de la classe (GlyphStringId) ou de la classe (GlyphUInt32Id) en C++."
type: docs
weight: 900
url: /fr/cpp/aspose.font.cff/cffencoding/unicodetogid/
---
## CffEncoding::UnicodeToGid method


Décode un unicode et renvoie l’identifiant du glyphe. L’identifiant du glyphe est un numéro unique pour un glyphe, dépendant du type de police. L’identifiant du glyphe CFF [Font](../../../aspose.font/font/) peut être une instance de la classe ([GlyphStringId](../)) ou de la classe ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Cff::CffEncoding::UnicodeToGid(uint32_t unicode) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| unicode | uint32_t | Unicode pour obtenir l'identifiant du glyphe. |

### ReturnValue

Identifiant du glyphe lié à l'Unicode fourni.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
