---
title: "Aspose::Font::TtfHelpers::IFontCharactersMerger classe"
linktitle: "IFontCharactersMerger"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::TtfHelpers::IFontCharactersMerger classe. Déclare la fonctionnalité d'aide pour fusionner les polices TrueType. La police transmise par le paramètre font1 est considérée comme principale. Cela signifie que de nombreuses caractéristiques, liées à la police fusionnée finale, telles que les métriques, la structure d'encodage et d'autres, seront prises de cette police principale en C++."
type: docs
weight: 200
url: /fr/cpp/aspose.font.ttfhelpers/ifontcharactersmerger/
---
## IFontCharactersMerger class


Déclare la fonctionnalité d'aide pour fusionner les polices TrueType. [Font](../../aspose.font/font/) qui est transmise par le paramètre font1 est considérée comme principale. Cela signifie que de nombreuses caractéristiques, liées à la police fusionnée finale, telles que les métriques, la structure d'encodage et d'autres, seront prises de cette police principale.

```cpp
class IFontCharactersMerger : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [MergeFonts](./mergefonts/)(System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::String) | Fusionne les polices en fonction des listes de glyphes fournies. Recherche un code de caractère pour chaque glyphe fourni et ajoute le code de caractère trouvé avec le glyphe correspondant dans la nouvelle police résultante. |
| virtual [MergeFonts](./mergefonts/)(System::ArrayPtr\<uint32_t\>, System::ArrayPtr\<uint32_t\>, System::String) | Fusionne les polices en fonction des listes de codes de caractères fournies. Pour créer la police résultante souhaitée, transmettez simplement les codes de symboles des polices d'origine que vous souhaitez inclure dans la police résultante. Les [Glyphs](../../aspose.font.glyphs/) liés aux codes fournis seront trouvés automatiquement. Par exemple, si vous voulez inclure dans la police résultante les glyphes liés aux lettres A et B de la première police et les glyphes liés aux lettres C et D de la seconde police, appelez simplement cette méthode ainsi : **MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, \"NewFont\")** |
| virtual [MergeFonts](./mergefonts/)(System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::String) | Cette version de méthode est conçue pour les cas où vous souhaitez définir explicitement les codes de caractères pour les glyphes dans la police résultante. Il n'est pas obligatoire que le code du glyphe que vous avez fourni soit présent dans la police d'origine. Le sens du code fourni est qu'il sera associé à l'identifiant de glyphe correspondant dans la police résultante. Ainsi, la règle pour traiter chaque paire transmise via le paramètre dictionnaire [code, identifiant du glyphe] est que seul l'identifiant du glyphe sera pris de la police d'origine, puis il sera lié au code correspondant dans la police résultante. Cela peut être utile lorsque certains codes de la première police entrent en conflit avec les mêmes codes de la seconde police. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::TtfHelpers](../)
* Library [Aspose.Font for C++](../../)
