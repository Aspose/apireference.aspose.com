---
title: "System::Security::Cryptography::AsymmetricSignatureFormatter 类"
linktitle: "AsymmetricSignatureFormatter"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::AsymmetricSignatureFormatter 类。非对称签名格式化器的基类。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 400
url: /zh/cpp/system.security.cryptography/asymmetricsignatureformatter/
---
## AsymmetricSignatureFormatter class


非对称签名格式化器的基类。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class AsymmetricSignatureFormatter : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [CreateSignature](./createsignature/)(System::ArrayPtr\<uint8_t\>) | RTTI 信息。 |
| virtual [CreateSignature](./createsignature/)(System::SharedPtr\<HashAlgorithm\>) | 为指定的哈希值创建签名。 |
| virtual [SetHashAlgorithm](./sethashalgorithm/)(System::String) | 设置要使用的哈希算法。 |
| virtual [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) | 设置在计算签名时使用的非对称算法。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
