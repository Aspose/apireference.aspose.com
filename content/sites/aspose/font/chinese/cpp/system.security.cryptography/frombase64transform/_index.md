---
title: "System::Security::Cryptography::FromBase64Transform 类"
linktitle: "FromBase64Transform"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::FromBase64Transform 类。将 CryptoStream 类实例从 base 64 转换。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 1500
url: /zh/cpp/system.security.cryptography/frombase64transform/
---
## FromBase64Transform class


将 [CryptoStream](../cryptostream/) 类实例从 base 64 转换。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class FromBase64Transform : public System::Security::Cryptography::ICryptoTransform
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clear](./clear/)() | 释放所有资源。 |
| [Dispose](./dispose/)() | 释放当前对象获取的操作系统资源。 |
| [FromBase64Transform](./frombase64transform/)() | 构造函数。 |
| [FromBase64Transform](./frombase64transform/)(FromBase64TransformMode) | 构造函数。 |
| virtual [get_CanReuseTransform](./get_canreusetransform/)() | 获取一个值，指示当前转换是否可以重用。 |
| [get_CanTransformMultipleBlocks](./get_cantransformmultipleblocks/)() | 获取一个值，指示是否可以转换多个块。 |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | 输入块大小。 |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | 输出块大小。 |
| [TransformBlock](./transformblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, System::ArrayPtr\<uint8_t\>, int32_t) |  |
| [TransformFinalBlock](./transformfinalblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) |  |
| virtual [~FromBase64Transform](./~frombase64transform/)() | 析构函数。 |
## 另见

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
