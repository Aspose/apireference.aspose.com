---
title: "System::Text::EncodingDecoder 类"
linktitle: "EncodingDecoder"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::EncodingDecoder 类。使用编码对象进行解码的解码器。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1700
url: /zh/cpp/system.text/encodingdecoder/
---
## EncodingDecoder class


[Decoder](../decoder/) that uses encoding object for decoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncodingDecoder : public System::Text::Decoder
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) override | 将字节转换为字符。 |
| [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) override | 将字节转换为字符。 |
## 另见

* Class [Decoder](../decoder/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
