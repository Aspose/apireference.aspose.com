---
title: "System::Text::Encoder 类"
linktitle: "Encoder"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::Encoder 类。将字符序列编码为字节序列的封装。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 900
url: /zh/cpp/system.text/encoder/
---
## Encoder class


将字符序列编码为字节序列的封装。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Encoder : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | 将字符转换为字节。 |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | 将字符转换为字节。 |
| [get_Fallback](./get_fallback/)() const | 获取错误处理回退。 |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | 获取回退缓冲区。 |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | 获取编码缓冲区所需的字节数。 |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | 获取编码缓冲区所需的字节数。 |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | 获取编码缓冲区后得到的字节。 |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | 获取编码缓冲区后得到的字节。 |
| virtual [Reset](./reset/)() | 清除编码器内部状态。 |
| [set_Fallback](./set_fallback/)(const EncoderFallbackPtr\&) | 设置错误处理回退。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
