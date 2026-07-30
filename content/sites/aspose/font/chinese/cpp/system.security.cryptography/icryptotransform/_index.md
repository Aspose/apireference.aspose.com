---
title: "System::Security::Cryptography::ICryptoTransform 类"
linktitle: "ICryptoTransform"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::ICryptoTransform 类。加密转换器的基类。此类的对象只能通过 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 2000
url: /zh/cpp/system.security.cryptography/icryptotransform/
---
## ICryptoTransform class


加密转换器的基类。此类的对象只能通过 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class ICryptoTransform : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | 输入块大小。 |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | 输出块大小。 |
| virtual [TransformBlock](./transformblock/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<uint8_t\>, int) | RTTI 信息。 |
| virtual [TransformFinalBlock](./transformfinalblock/)(ArrayPtr\<uint8_t\>, int, int) | 处理最后一个数据块并计算输出值。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
