---
title: "System::Text::EncoderFallback 类"
linktitle: "EncoderFallback"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::EncoderFallback 类。提供用于处理编码错误的回退 API。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 1200
url: /zh/cpp/system.text/encoderfallback/
---
## EncoderFallback class


提供用于处理编码错误的回退 API。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class EncoderFallback : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [CreateFallbackBuffer](./createfallbackbuffer/)() | 获取与回退算法关联的缓冲区。 |
| static [get_ExceptionFallback](./get_exceptionfallback/)() | 获取默认的异常回退实现。 |
| virtual [get_MaxCharCount](./get_maxcharcount/)() const | 获取回退可以返回的最大字符数。 |
| static [get_ReplacementFallback](./get_replacementfallback/)() | 获取默认的替换回退实现。 |
| static [get_StandardSafeFallback](./get_standardsafefallback/)() | 获取默认的标准安全回退实现。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
