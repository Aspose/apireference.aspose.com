---
title: "طريقة Aspose::Font::Factories::TextUtilsFactory::GetFontCharactersMerger"
linktitle: "GetFontCharactersMerger"
second_title: "Aspose.Font لـ C++"
description: "طريقة Aspose::Font::Factories::TextUtilsFactory::GetFontCharactersMerger. يحصل على نسخة من الفئة FontCharactersMerger في C++."
type: docs
weight: 200
url: /ar/cpp/aspose.font.factories/textutilsfactory/getfontcharactersmerger/
---
## TextUtilsFactory::GetFontCharactersMerger method


يحصل على نسخة من الفئة [FontCharactersMerger](../).

```cpp
System::SharedPtr<Common_FontMerger::FontCharactersMerger> Aspose::Font::Factories::TextUtilsFactory::GetFontCharactersMerger(System::SharedPtr<Font> primaryFont, System::SharedPtr<Font> secondaryFont, FontType outType)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| primaryFont | System::SharedPtr\<Font\> | الخط الأساسي لاستخراج الرموز منه |
| secondaryFont | System::SharedPtr\<Font\> | الخط الثانوي لاستخراج الرموز منه |
| outType | FontType | تنسيق الخط المدمج الناتج. |

### ReturnValue

واجهة دمج الخطوط أو null إذا لم يتم العثور على دمج مناسب لتنسيق الخط المدخل

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontCharactersMerger](../../../aspose.font.common_fontmerger/fontcharactersmerger/)
* Class [Font](../../../aspose.font/font/)
* Enum [FontType](../../../aspose.font/fonttype/)
* Class [TextUtilsFactory](../)
* Namespace [Aspose::Font::Factories](../../)
* Library [Aspose.Font for C++](../../../)
