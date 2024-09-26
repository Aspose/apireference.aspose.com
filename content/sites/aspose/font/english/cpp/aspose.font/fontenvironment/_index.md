---
title: Aspose::Font::FontEnvironment class
linktitle: FontEnvironment
second_title: Aspose.Font for C++
description: 'Aspose::Font::FontEnvironment class. Provides information about the current environment and platform in C++.'
type: docs
weight: 500
url: /cpp/aspose.font/fontenvironment/
---
## FontEnvironment class


Provides information about the current environment and platform.

```cpp
class FontEnvironment : public System::Object
```

## Enums

| Enum | Description |
| --- | --- |
| [ParsingStrictness](./parsingstrictness/) | Parsing strictness types. |
## Methods

| Method | Description |
| --- | --- |
| static [get_Current](./get_current/)() | Gets current environment. |
| [get_CurrentPlatformId](./get_currentplatformid/)() | Gets current platform id. |
| [get_FontSpecificEncodings](./get_fontspecificencodings/)() const | Stores specific encodings for consumer-aware Fonts. For example, PDF documents uses Adobe Symbol and ZapfDingbats specific encodings. |
| [get_Strictness](./get_strictness/)() const | Some Fonts may contain unexpected data, non-specified features, or may be roughly cropped. |
| [set_Strictness](./set_strictness/)(FontEnvironment::ParsingStrictness) | Some Fonts may contain unexpected data, non-specified features, or may be roughly cropped. |
## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
