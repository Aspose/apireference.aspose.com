---
title: "Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts méthode"
linktitle: "MergeFonts"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts méthode. Fusionne les polices en fonction des listes de glyphes fournies. Recherche un code de caractère pour chaque glyphe fourni et ajoute le code de caractère trouvé avec le glyphe correspondant dans la nouvelle police résultante en C++."
type: docs
weight: 300
url: /fr/cpp/aspose.font.common_fontmerger/fontcharactersmerger/mergefonts/
---
## FontCharactersMerger::MergeFonts(System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::String) method


Fusionne les polices en fonction des listes de glyphes fournies. Recherche un code de caractère pour chaque glyphe fourni et ajoute le code de caractère trouvé avec le glyphe correspondant dans la nouvelle police résultante.

```cpp
virtual System::SharedPtr<Font> Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts(System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> primaryFontGlyphs, System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> secondaryFontGlyphs, System::String newFontName)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| primaryFontGlyphs | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Liste des glyphes à prendre de la police principale |
| secondaryFontGlyphs | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Liste des glyphes à prendre de la police secondaire |
| newFontName | System::String | Nom souhaité pour la police résultante |

### ReturnValue

Police fusionnée

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../aspose.font/font/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [FontCharactersMerger](../)
* Namespace [Aspose::Font::Common_FontMerger](../../)
* Library [Aspose.Font for C++](../../../)
## FontCharactersMerger::MergeFonts(System::ArrayPtr\<uint32_t\>, System::ArrayPtr\<uint32_t\>, System::String) method


Fusionne les polices en fonction des listes de codes de caractères fournies. Pour créer la police résultante souhaitée, il suffit de transmettre les codes de symboles des polices d'origine que vous souhaitez inclure dans la police résultante. [Glyphs](../../../aspose.font.glyphs/) liés aux codes fournis seront trouvés automatiquement. Par exemple, si vous voulez inclure dans la police résultante les glyphes liés aux lettres A et B de la première police et les glyphes liés aux lettres C et D de la seconde police, appelez simplement cette méthode ainsi : **MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, \"NewFont\")**

```cpp
virtual System::SharedPtr<Font> Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts(System::ArrayPtr<uint32_t> primaryFontCharCodes, System::ArrayPtr<uint32_t> secondaryFontCharCodes, System::String newFontName)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| primaryFontCharCodes | System::ArrayPtr\<uint32_t\> | Codes à prendre de la police principale |
| secondaryFontCharCodes | System::ArrayPtr\<uint32_t\> | Codes à prendre de la police secondaire |
| newFontName | System::String | Nom souhaité pour la police résultante |

### ReturnValue

Police fusionnée

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../aspose.font/font/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [FontCharactersMerger](../)
* Namespace [Aspose::Font::Common_FontMerger](../../)
* Library [Aspose.Font for C++](../../../)
## FontCharactersMerger::MergeFonts(System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::String) method


Cette version de méthode est conçue pour les cas où vous souhaitez définir explicitement les codes de caractères pour les glyphes dans la police résultante. Il n'est pas obligatoire que le code du glyphe que vous avez fourni soit présent dans la police d'origine. Le sens du code fourni est qu'il sera associé à l'identifiant de glyphe correspondant dans la police résultante. Ainsi, la règle pour traiter chaque paire transmise via le paramètre dictionnaire [code, identifiant du glyphe] est que seul l'identifiant du glyphe sera pris de la police d'origine, puis il sera lié au code correspondant dans la police résultante. Cela peut être utile lorsque certains codes de la première police entrent en conflit avec les mêmes codes de la seconde police.

```cpp
virtual System::SharedPtr<Font> Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts(System::SharedPtr<System::Collections::Generic::IDictionary<uint32_t, System::SharedPtr<Glyphs::GlyphId>>> primaryFontDict, System::SharedPtr<System::Collections::Generic::IDictionary<uint32_t, System::SharedPtr<Glyphs::GlyphId>>> secondaryFontDict, System::String newFontName)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| primaryFontDict | System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\> | Dictionnaire avec des paires [code du symbole, identifiant du glyphe] de la police principale |
| secondaryFontDict | System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\> | Dictionnaire avec des paires [code du symbole, identifiant du glyphe] de la police secondaire |
| newFontName | System::String | Nom souhaité pour la police résultante |

### ReturnValue

Police fusionnée

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../aspose.font/font/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [FontCharactersMerger](../)
* Namespace [Aspose::Font::Common_FontMerger](../../)
* Library [Aspose.Font for C++](../../../)
