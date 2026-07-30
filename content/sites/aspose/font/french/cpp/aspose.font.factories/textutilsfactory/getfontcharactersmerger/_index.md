---
title: "Méthode Aspose::Font::Factories::TextUtilsFactory::GetFontCharactersMerger"
linktitle: "ObtenirFusionneurCaractèresPolice"
second_title: "Aspose.Font pour C++"
description: "Méthode Aspose::Font::Factories::TextUtilsFactory::GetFontCharactersMerger. Obtient une instance de la classe FontCharactersMerger en C++."
type: docs
weight: 200
url: /fr/cpp/aspose.font.factories/textutilsfactory/getfontcharactersmerger/
---
## TextUtilsFactory::GetFontCharactersMerger method


Obtient une instance de la classe [FontCharactersMerger](../).

```cpp
System::SharedPtr<Common_FontMerger::FontCharactersMerger> Aspose::Font::Factories::TextUtilsFactory::GetFontCharactersMerger(System::SharedPtr<Font> primaryFont, System::SharedPtr<Font> secondaryFont, FontType outType)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| primaryFont | System::SharedPtr\<Font\> | Police principale dont les glyphes sont extraits |
| secondaryFont | System::SharedPtr\<Font\> | Police secondaire dont les glyphes sont extraits |
| outType | FontType | Le format de la police fusionnée en sortie. |

### ReturnValue

Interface de fusion de polices ou null si aucune fusion appropriée n'est trouvée pour le format de police d'entrée

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontCharactersMerger](../../../aspose.font.common_fontmerger/fontcharactersmerger/)
* Class [Font](../../../aspose.font/font/)
* Enum [FontType](../../../aspose.font/fonttype/)
* Class [TextUtilsFactory](../)
* Namespace [Aspose::Font::Factories](../../)
* Library [Aspose.Font for C++](../../../)
