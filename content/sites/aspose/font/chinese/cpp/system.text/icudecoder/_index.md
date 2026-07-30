---
title: "System::Text::ICUDecoder 类"
linktitle: "ICUDecoder"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::ICUDecoder 类。使用 ICU 进行解码的解码器。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 2000
url: /zh/cpp/system.text/icudecoder/
---
## ICUDecoder class


[Decoder](../decoder/) that uses ICU for decoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ICUDecoder : public System::Text::Decoder
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | 将字节转换为字符。 |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | 将字节转换为字符。 |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | 获取解码缓冲区所需的字符数。 |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | 获取解码缓冲区所需的字符数。 |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | 获取解码缓冲区所需的字符数。 |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | 获取解码缓冲区后得到的字符。 |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | 获取解码缓冲区后得到的字符。 |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | 获取解码缓冲区后得到的字符。 |
| [ICUDecoder](./icudecoder/)(ICUEncoding *) | 构造函数。 |
| virtual [Reset](./reset/)() | 将内部变量设置为初始状态。 |
| virtual [~ICUDecoder](./~icudecoder/)() | 析构函数。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Base](./base/) | [Base](./base/) 类型。 |
## 另见

* Class [Decoder](../decoder/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
