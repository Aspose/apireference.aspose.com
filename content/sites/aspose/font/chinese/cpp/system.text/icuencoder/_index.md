---
title: "System::Text::ICUEncoder 类"
linktitle: "ICUEncoder"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::ICUEncoder 类。使用 ICU 进行编码的编码器。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2100
url: /zh/cpp/system.text/icuencoder/
---
## ICUEncoder class


[Encoder](../encoder/) that uses ICU for encoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ICUEncoder : public System::Text::Encoder
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | 将字符转换为字节。 |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | 将字符转换为字节。 |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | 获取编码缓冲区所需的字节数。 |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | 获取编码缓冲区所需的字节数。 |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | 获取编码缓冲区后得到的字节。 |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | 获取编码缓冲区后得到的字节。 |
| [ICUEncoder](./icuencoder/)(ICUEncoding *) | 构造函数。 |
| virtual [Reset](./reset/)() | 将内部变量设置为初始状态。 |
| [~ICUEncoder](./~icuencoder/)() | 析构函数。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Base](./base/) | [Base](./base/) 类型。 |
## 另见

* Class [Encoder](../encoder/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
