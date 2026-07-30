---
title: "System::Text::DecoderFallbackBuffer 类"
linktitle: "DecoderFallbackBuffer"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::DecoderFallbackBuffer 类。提供用于回退实现的缓冲区。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 600
url: /zh/cpp/system.text/decoderfallbackbuffer/
---
## DecoderFallbackBuffer class


提供用于回退实现的缓冲区。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数调用时作为参数传递。

```cpp
class DecoderFallbackBuffer : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) | 实现实际的回退过程。 |
| virtual [get_Remaining](./get_remaining/)() const | 获取剩余待处理字符的计数。 |
| virtual [GetNextChar](./getnextchar/)() | 提取回退缓冲区中的下一个字符。 |
| virtual [MovePrevious](./moveprevious/)() | 如果可能，将缓冲区位置向后移动一步。 |
| virtual [Reset](./reset/)() | 将缓冲区重置为初始状态。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
