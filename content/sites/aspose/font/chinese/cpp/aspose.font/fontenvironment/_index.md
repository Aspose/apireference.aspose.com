---
title: "Aspose::Font::FontEnvironment 类"
linktitle: "FontEnvironment"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::FontEnvironment 类。提供有关 C++ 中当前环境和平台的信息。"
type: docs
weight: 600
url: /zh/cpp/aspose.font/fontenvironment/
---
## FontEnvironment class


提供有关当前环境和平台的信息。

```cpp
class FontEnvironment : public System::Object
```

## Enums

| 枚举 | 描述 |
| --- | --- |
| [ParsingStrictness](./parsingstrictness/) | 解析严格性类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| static [get_CffCommonFontsSettings](./get_cffcommonfontssettings/)() | CFF 字体通用设置。 |
| static [get_Current](./get_current/)() | 获取当前环境。 |
| [get_CurrentPlatformId](./get_currentplatformid/)() | 获取当前平台 ID。 |
| [get_FontSpecificEncodings](./get_fontspecificencodings/)() const | 为面向消费者的字体存储特定编码。例如，PDF 文档使用 Adobe Symbol 和 ZapfDingbats 的特定编码。 |
| [get_Strictness](./get_strictness/)() const | 某些字体可能包含意外数据、未指定的特性，或可能被粗略裁剪。 |
| [set_Strictness](./set_strictness/)(FontEnvironment::ParsingStrictness) | 某些字体可能包含意外数据、未指定的特性，或可能被粗略裁剪。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
