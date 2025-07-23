---
title: Aspose::Font::Factories::TextUtilsFactory::GetFontCharactersMerger method
linktitle: GetFontCharactersMerger
second_title: Aspose.Font for C++
description: 'Aspose::Font::Factories::TextUtilsFactory::GetFontCharactersMerger method. Gets instance of FontCharactersMerger class in C++.'
type: docs
weight: 200
url: /cpp/aspose.font.factories/textutilsfactory/getfontcharactersmerger/
---
## TextUtilsFactory::GetFontCharactersMerger method


Gets instance of [FontCharactersMerger](../) class.

```cpp
System::SharedPtr<Aspose::Font::Common_FontMerger::FontCharactersMerger> Aspose::Font::Factories::TextUtilsFactory::GetFontCharactersMerger(System::SharedPtr<Aspose::Font::Font> primaryFont, System::SharedPtr<Aspose::Font::Font> secondaryFont, FontType outType)
```


| Parameter | Type | Description |
| --- | --- | --- |
| primaryFont | System::SharedPtr\<Aspose::Font::Font\> | Primary font to take glyphs from |
| secondaryFont | System::SharedPtr\<Aspose::Font::Font\> | Secondary font to take glyphs from |
| outType | FontType | The format of the output merged font. |

### ReturnValue

Fonts merger interface or null if no appropriate merger found for input font format



## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontCharactersMerger](../../../aspose.font.common_fontmerger/fontcharactersmerger/)
* Class [Font](../../../aspose.font/font/)
* Enum [FontType](../../../aspose.font/fonttype/)
* Class [TextUtilsFactory](../)
* Namespace [Aspose::Font::Factories](../../)
* Library [Aspose.Font for C++](../../../)
