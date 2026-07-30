---
title: "System::Text::EncoderExceptionFallbackBuffer 类"
linktitle: "EncoderExceptionFallbackBuffer"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::EncoderExceptionFallbackBuffer 类。用于抛出异常的编码回退策略的缓冲区。实际上不存储任何内容，而是直接抛出异常。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 1100
url: /zh/cpp/system.text/encoderexceptionfallbackbuffer/
---
## EncoderExceptionFallbackBuffer class


[Buffer](../../system/buffer/) for exception-throwing encoding fallback strategy. Doesn't store anything actually, but throws instead. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncoderExceptionFallbackBuffer : public System::Text::EncoderFallbackBuffer
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [EncoderExceptionFallbackBuffer](./encoderexceptionfallbackbuffer/)() | 构造函数。 |
| [Fallback](./fallback/)(char_t, int) override | 处理编码失败。 |
| [Fallback](./fallback/)(char_t, char_t, int) override | 处理编码失败。 |
| [get_Remaining](./get_remaining/)() const override | 获取剩余字符的数量。 |
| [GetNextChar](./getnextchar/)() override | 获取下一个可用字符。 |
| [MovePrevious](./moveprevious/)() override | 移动到上一个字符。 |
## 另见

* Class [EncoderFallbackBuffer](../encoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
