---
title: "Aspose::Font::MultiLanguageString 类"
linktitle: "MultiLanguageString"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::MultiLanguageString 类。表示 C++ 中的多语言字符串。"
type: docs
weight: 2800
url: /zh/cpp/aspose.font/multilanguagestring/
---
## MultiLanguageString class


表示多语言字符串。

```cpp
class MultiLanguageString : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AddLanguageString](./addlanguagestring/)(System::String, int32_t) | 添加特定语言的字符串。 |
| [ContainsString](./containsstring/)(System::String) | 如果该字符串出现在所有语言的字符串中，则返回 true。 |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | 如果对象被视为相等，则返回 true。 |
| [get_IsEmpty](./get_isempty/)() | 如果 [MultiLanguageString](./) 没有任何语言的字符串，则返回 True。 |
| [GetAllLanguageIds](./getalllanguageids/)() | 获取所有字符串的语言标识符，如果没有字符串则返回空数组。 |
| [GetAllStrings](./getallstrings/)() | 返回所有语言的所有字符串。 |
| [GetEnglishString](./getenglishstring/)() | 如果找到英文字符串则返回；否则返回第一个非英文字符串。 |
| [GetHashCode](./gethashcode/)() const override | GetHashCode 实现。 |
| [GetStringForLanguageId](./getstringforlanguageid/)(int32_t) | 返回与传入的语言标识符对应的字符串（如果找到），否则返回空字符串。 |
| [MultiLanguageString](./multilanguagestring/)() | 创建空的多语言字符串。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
