---
title: "Aspose::Font::Glyphs::IGlyphAccessor classe"
linktitle: "IGlyphAccessor"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::Glyphs::IGlyphAccessor classe. Définit la fonctionnalité permettant de récupérer les identifiants de glyphes spécifiés et les glyphes en C++."
type: docs
weight: 1000
url: /fr/cpp/aspose.font.glyphs/iglyphaccessor/
---
## IGlyphAccessor class


Définit la fonctionnalité permettant de récupérer les identifiants de glyphes spécifiés et les glyphes.

```cpp
class IGlyphAccessor : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [get_GlyphIdType](./get_glyphidtype/)() | Spécification du type d'identifiant [Glyph](../glyph/). |
| virtual [GetAllGlyphIds](./getallglyphids/)() | Renvoie tous les identifiants de glyphes, disponibles dans le [Font](../../aspose.font/font/). L'identifiant [Glyph](../glyph/) est un nombre unique pour un glyphe, dépendant du type de police. Par exemple : l'identifiant de [Type1](../../aspose.font.type1/) est un nom de glyphe, instance de la classe ([GlyphStringId](../glyphstringid/)). L'identifiant TTF est un indice entier, instance de la classe ([GlyphUInt32Id](../glyphuint32id/)). |
| virtual [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<GlyphId\>) | Renvoie le glyphe par son identifiant. L'identifiant [Glyph](../glyph/) est un nombre unique pour un glyphe, dépendant du type de police. [GlyphId](../glyphid/) - objet dérivé. Par exemple : l'identifiant de [Type1](../../aspose.font.type1/) est un nom de glyphe, instance de la classe ([GlyphStringId](../glyphstringid/)). L'identifiant TTF est un indice entier, instance de la classe ([GlyphUInt32Id](../glyphuint32id/)). |
| virtual [GetGlyphsForText](./getglyphsfortext/)(System::String) | Obtenez la représentation des glyphes pour le texte. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Glyphs](../)
* Library [Aspose.Font for C++](../../)
