---
title: Aspose::Pub::TextPartDisplayParams class
linktitle: TextPartDisplayParams
second_title: Aspose.PUB for C++
description: 'Aspose::Pub::TextPartDisplayParams class. Designed to hold text which sholud be displayed for end users. Cases like document 383.pub open a situation, when original text from Publisher document can''t be displayed to end users without modifications. At current moment it''s enough to simply hold modified version of original text, which differs from original only in unicode values, but next times could be cases when modified version will differ from original not only in unicodes but also in text length and something like this. If that cases come, this class should be modified to accomodate new requirements for displayed text in C++.'
type: docs
weight: 3600
url: /cpp/aspose.pub/textpartdisplayparams/
---
## TextPartDisplayParams class


Designed to hold text which sholud be displayed for end users. Cases like document 383.pub open a situation, when original text from Publisher document can't be displayed to end users without modifications. At current moment it's enough to simply hold modified version of original text, which differs from original only in unicode values, but next times could be cases when modified version will differ from original not only in unicodes but also in text length and something like this. If that cases come, this class should be modified to accomodate new requirements for displayed text.

```cpp
class TextPartDisplayParams : public System::Object
```

## Methods

| Method | Description |
| --- | --- |
| [get_Font](./get_font/)() const | Font of the text part. |
| [get_FontSize](./get_fontsize/)() const | Font size of the text part. |
| [get_Text](./get_text/)() const | Text. |
| [get_TextStyle](./get_textstyle/)() const | Text style. |
| [SetFontData](./setfontdata/)(System::SharedPtr\<Aspose::Pdf::Text::Font\>, float) |  |
| [TextPartDisplayParams](./textpartdisplayparams/)(System::String, System::SharedPtr\<Aspose::Pub::TextStyle\>) | Constructor. |
| [UpdateText](./updatetext/)(System::String) | Updates text. |
| [UpdateTextStyle](./updatetextstyle/)(System::SharedPtr\<Aspose::Pub::TextStyle\>) |  |
## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::Pub](../)
* Library [Aspose.PUB for C++](../../)
