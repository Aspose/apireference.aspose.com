---
title: "Méthode Aspose::Font::Cff::CffEncoding::DecodeToGid"
linktitle: "DecodeToGid"
second_title: "Aspose.Font pour C++"
description: "Méthode Aspose::Font::Cff::CffEncoding::DecodeToGid. Obtient le Gid pour le charCode fourni. Cette méthode est conçue pour les CIDFonts CFF, où le charCode doit être une valeur CID valide. L’identifiant du glyphe est un numéro unique pour un glyphe, dépendant du type de police. L’identifiant du glyphe d’une police CFF peut être une instance de la classe (GlyphStringId) ou de la classe (GlyphUInt32Id) en C++."
type: docs
weight: 100
url: /fr/cpp/aspose.font.cff/cffencoding/decodetogid/
---
## CffEncoding::DecodeToGid method


Obtient le Gid pour le charCode fourni. Cette méthode est conçue pour les CIDFonts CFF, où le charCode doit être une valeur CID valide. L’identifiant du glyphe est un numéro unique pour un glyphe, dépendant du type de police. L’identifiant du glyphe CFF [Font](../../../aspose.font/font/) peut être une instance de la classe ([GlyphStringId](../)) ou de la classe ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Cff::CffEncoding::DecodeToGid(uint32_t charCode) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| charCode | uint32_t | Code de caractère (CID) pour obtenir l’identifiant du glyphe. |

### ReturnValue

Identifiant de glyphe lié au CID fourni.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
