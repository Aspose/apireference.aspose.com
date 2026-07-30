---
title: "Aspose::Font::Factories::TextUtilsFactory::GetFontCharactersMerger 方法"
linktitle: "GetFontCharactersMerger"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Factories::TextUtilsFactory::GetFontCharactersMerger 方法。获取 C++ 中 FontCharactersMerger 类的实例。"
type: docs
weight: 200
url: /zh/cpp/aspose.font.factories/textutilsfactory/getfontcharactersmerger/
---
## TextUtilsFactory::GetFontCharactersMerger method


获取 [FontCharactersMerger](../) 类的实例。

```cpp
System::SharedPtr<Common_FontMerger::FontCharactersMerger> Aspose::Font::Factories::TextUtilsFactory::GetFontCharactersMerger(System::SharedPtr<Font> primaryFont, System::SharedPtr<Font> secondaryFont, FontType outType)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| primaryFont | System::SharedPtr\<Font\> | 用于获取字形的主字体 |
| secondaryFont | System::SharedPtr\<Font\> | 用于获取字形的次要字体 |
| outType | FontType | 输出合并字体的格式。 |

### ReturnValue

字体合并器接口，如果未找到适用于输入字体格式的合适合并器则为 null

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontCharactersMerger](../../../aspose.font.common_fontmerger/fontcharactersmerger/)
* Class [Font](../../../aspose.font/font/)
* Enum [FontType](../../../aspose.font/fonttype/)
* Class [TextUtilsFactory](../)
* Namespace [Aspose::Font::Factories](../../)
* Library [Aspose.Font for C++](../../../)
