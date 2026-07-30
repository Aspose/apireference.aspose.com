---
title: "System::Text::EncodingEncoder 类"
linktitle: "EncodingEncoder"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::EncodingEncoder 类。使用编码对象进行编码的编码器。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1800
url: /zh/cpp/system.text/encodingencoder/
---
## EncodingEncoder class


[Encoder](../encoder/) that uses encoding object for encoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncodingEncoder : public System::Text::Encoder
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | 将字符转换为字节。 |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | 将字符转换为字节。 |
## 另见

* Class [Encoder](../encoder/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
