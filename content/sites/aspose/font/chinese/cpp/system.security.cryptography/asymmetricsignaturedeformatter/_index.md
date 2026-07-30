---
title: "System::Security::Cryptography::AsymmetricSignatureDeformatter 类"
linktitle: "AsymmetricSignatureDeformatter"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::AsymmetricSignatureDeformatter 类。非对称签名解格式化器的基类。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并在 C++ 中使用该指针将其作为参数传递给函数。"
type: docs
weight: 300
url: /zh/cpp/system.security.cryptography/asymmetricsignaturedeformatter/
---
## AsymmetricSignatureDeformatter class


非对称签名解格式化器的基类。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class AsymmetricSignatureDeformatter : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [SetHashAlgorithm](./sethashalgorithm/)(System::String) | RTTI 信息。 |
| virtual [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) | 设置用于算法的密钥。 |
| virtual [VerifySignature](./verifysignature/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | 验证数据上的签名。 |
| virtual [VerifySignature](./verifysignature/)(System::SharedPtr\<HashAlgorithm\>, System::ArrayPtr\<uint8_t\>) | 验证数据上的签名。未实现。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
