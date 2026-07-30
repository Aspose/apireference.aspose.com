---
title: "Metodo Aspose::Font::Factories::TextUtilsFactory::GetFontCharactersMerger"
linktitle: "GetFontCharactersMerger"
second_title: "Aspose.Font per C++"
description: "Metodo Aspose::Font::Factories::TextUtilsFactory::GetFontCharactersMerger. Ottiene un'istanza della classe FontCharactersMerger in C++."
type: docs
weight: 200
url: /it/cpp/aspose.font.factories/textutilsfactory/getfontcharactersmerger/
---
## TextUtilsFactory::GetFontCharactersMerger method


Ottiene un'istanza della classe [FontCharactersMerger](../).

```cpp
System::SharedPtr<Common_FontMerger::FontCharactersMerger> Aspose::Font::Factories::TextUtilsFactory::GetFontCharactersMerger(System::SharedPtr<Font> primaryFont, System::SharedPtr<Font> secondaryFont, FontType outType)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| primaryFont | System::SharedPtr\<Font\> | Font principale da cui prendere i glifi |
| secondaryFont | System::SharedPtr\<Font\> | Font secondario da cui prendere i glifi |
| outType | FontType | Il formato del font unito in output. |

### ReturnValue

Interfaccia di fusione dei font o null se non è stato trovato un fuso appropriato per il formato del font di input.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontCharactersMerger](../../../aspose.font.common_fontmerger/fontcharactersmerger/)
* Class [Font](../../../aspose.font/font/)
* Enum [FontType](../../../aspose.font/fonttype/)
* Class [TextUtilsFactory](../)
* Namespace [Aspose::Font::Factories](../../)
* Library [Aspose.Font for C++](../../../)
