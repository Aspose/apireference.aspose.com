---
title: "System::Security::Cryptography::ICspAsymmetricAlgorithm 类"
linktitle: "ICspAsymmetricAlgorithm"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::ICspAsymmetricAlgorithm 类。非对称算法基类。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2100
url: /zh/cpp/system.security.cryptography/icspasymmetricalgorithm/
---
## ICspAsymmetricAlgorithm class


非对称算法基类。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class ICspAsymmetricAlgorithm : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [ExportCspBlob](./exportcspblob/)(bool) | 导出包含密钥信息的 Blob。 |
| virtual [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() | RTTI 信息。 |
| virtual [ImportCspBlob](./importcspblob/)(ByteArrayPtr) | 从数据 Blob 导入密钥信息。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
