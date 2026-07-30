---
title: "classe Aspose::Font::Glyphs::GlyphId"
linktitle: "GlyphId"
second_title: "Aspose.Font pour C++"
description: "classe Aspose::Font::Glyphs::GlyphId. Représente les identifiants de glyphes, disponibles dans la police. L'identifiant de glyphe est un numéro unique pour un glyphe, dépendant du type de police. Par exemple : l'identifiant de Type1 est un nom de glyphe, instance de la classe (GlyphStringId). L'identifiant de TTF est un indice entier, instance de la classe (GlyphUInt32Id) en C++."
type: docs
weight: 500
url: /fr/cpp/aspose.font.glyphs/glyphid/
---
## GlyphId class


Représente les identifiants de glyphes, disponibles dans la [Font](../../aspose.font/font/). L'identifiant du [Glyph](../glyph/) est un numéro unique pour un glyphe, dépendant du type de police. Par exemple : l'identifiant de [Type1](../../aspose.font.type1/) est un nom de glyphe, instance de la classe ([GlyphStringId](../glyphstringid/)). L'identifiant de TTF est un indice entier, instance de la classe ([GlyphUInt32Id](../glyphuint32id/)).

```cpp
class GlyphId : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [CompareTo](./compareto/)(System::SharedPtr\<GlyphId\>) |  |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Retourne true si deux identifiants de glyphe ne sont pas égaux. |
| virtual [GetHashCode](./gethashcode/)() const | Renvoie le code de hachage de l'objet. |
| virtual [ToGlyphStringId](./toglyphstringid/)() | Conversion virtuelle en [GlyphUInt32Id](../glyphuint32id/). [GlyphUInt32Id](../glyphuint32id/) surcharge pour renvoyer une instance. |
| virtual [ToGlyphUInt32Id](./toglyphuint32id/)() | Conversion virtuelle en [GlyphUInt32Id](../glyphuint32id/). [GlyphUInt32Id](../glyphuint32id/) surcharge pour renvoyer une instance. |
| virtual [ToString](./tostring/)() const | Renvoie la représentation sous forme de chaîne de l'identifiant du glyphe. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Glyphs](../)
* Library [Aspose.Font for C++](../../)
