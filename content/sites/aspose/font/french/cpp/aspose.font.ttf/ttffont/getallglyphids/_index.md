---
title: "Aspose::Font::Ttf::TtfFont::GetAllGlyphIds méthode"
linktitle: "ObtenirTousLesIdsGlyphes"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::Ttf::TtfFont::GetAllGlyphIds méthode. Retourne un tableau de tous les identifiants de glyphes, disponibles dans la police. L'identifiant de glyphe est un nombre unique pour un glyphe, qui dépend du type de police. L'identifiant de glyphe d'une police TTF peut être une instance de la classe (GlyphStringId) ou de la classe (GlyphUInt32Id). L'adressage des glyphes par nom (chaîne) est pris en charge pour les polices TTF via le mappage de la table Post. Dans le cas d'une police CFF, les structures CFF sont utilisées pour adresser les glyphes par nom en C++."
type: docs
weight: 1700
url: /fr/cpp/aspose.font.ttf/ttffont/getallglyphids/
---
## TtfFont::GetAllGlyphIds method


Retourne un tableau de tous les identifiants de glyphes, disponibles dans la [Police](../../../aspose.font/font/). L'identifiant de glyphe est un nombre unique pour un glyphe, qui dépend du type de police. L'identifiant de glyphe d'une [Police](../../../aspose.font/font/) TTF peut être une instance de la classe ([GlyphStringId](../)) ou de la classe ([GlyphUInt32Id](../)). L'adressage des glyphes par nom (chaîne) est pris en charge pour les polices TTF via le mappage de la table Post. Dans le cas d'une [Police](../../../aspose.font/font/) CFF, les structures CFF sont utilisées pour adresser les glyphes par nom.

```cpp
System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::Ttf::TtfFont::GetAllGlyphIds() override
```


### ReturnValue

Identifiants de glyphes.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
