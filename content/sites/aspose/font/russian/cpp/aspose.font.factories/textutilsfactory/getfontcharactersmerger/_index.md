---
title: "Метод Aspose::Font::Factories::TextUtilsFactory::GetFontCharactersMerger"
linktitle: "GetFontCharactersMerger"
second_title: "Aspose.Font для C++"
description: "Метод Aspose::Font::Factories::TextUtilsFactory::GetFontCharactersMerger. Получает экземпляр класса FontCharactersMerger в C++."
type: docs
weight: 200
url: /ru/cpp/aspose.font.factories/textutilsfactory/getfontcharactersmerger/
---
## TextUtilsFactory::GetFontCharactersMerger method


Получает экземпляр класса [FontCharactersMerger](../).

```cpp
System::SharedPtr<Common_FontMerger::FontCharactersMerger> Aspose::Font::Factories::TextUtilsFactory::GetFontCharactersMerger(System::SharedPtr<Font> primaryFont, System::SharedPtr<Font> secondaryFont, FontType outType)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| primaryFont | System::SharedPtr\<Font\> | Основной шрифт, из которого берутся глифы |
| secondaryFont | System::SharedPtr\<Font\> | Вторичный шрифт, из которого берутся глифы |
| outType | FontType | Формат объединённого выходного шрифта. |

### ReturnValue

Интерфейс объединения шрифтов или null, если не найден подходящий объединитель для формата входного шрифта

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontCharactersMerger](../../../aspose.font.common_fontmerger/fontcharactersmerger/)
* Class [Font](../../../aspose.font/font/)
* Enum [FontType](../../../aspose.font/fonttype/)
* Class [TextUtilsFactory](../)
* Namespace [Aspose::Font::Factories](../../)
* Library [Aspose.Font for C++](../../../)
