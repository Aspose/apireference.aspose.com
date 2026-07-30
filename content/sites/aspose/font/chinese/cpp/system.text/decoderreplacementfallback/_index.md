---
title: "System::Text::DecoderReplacementFallback 类"
linktitle: "DecoderReplacementFallback"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::DecoderReplacementFallback 类。提供将错误符号替换为占位符的回退策略。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 700
url: /zh/cpp/system.text/decoderreplacementfallback/
---
## DecoderReplacementFallback class


提供将错误符号替换为占位符的回退策略。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class DecoderReplacementFallback : public System::Text::DecoderFallback
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | 创建回退缓冲区。 |
| [DecoderReplacementFallback](./decoderreplacementfallback/)() | 使用默认的 "?" 替换字符串的构造函数。 |
| [DecoderReplacementFallback](./decoderreplacementfallback/)(const String\&) | 构造函数。 |
| [get_DefaultString](./get_defaultstring/)() const | 获取替换字符串。 |
| [get_MaxCharCount](./get_maxcharcount/)() const override | 获取实例可以返回的最大字符数。 |
## 另见

* Class [DecoderFallback](../decoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
