---
title: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter 类"
linktitle: "RSAPKCS1SignatureDeformatter"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter 类。用于验证 RSA PKCS #1 v1.5 签名的类。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 3700
url: /zh/cpp/system.security.cryptography/rsapkcs1signaturedeformatter/
---
## RSAPKCS1SignatureDeformatter class


用于验证 [RSA](../rsa/) PKCS #1 v1.5 签名的类。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class RSAPKCS1SignatureDeformatter : public System::Security::Cryptography::AsymmetricSignatureDeformatter
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [RSAPKCS1SignatureDeformatter](./rsapkcs1signaturedeformatter/)() | RTTI 信息。 |
| [RSAPKCS1SignatureDeformatter](./rsapkcs1signaturedeformatter/)(const System::SharedPtr\<AsymmetricAlgorithm\>\&) | 构造函数。 |
| [SetHashAlgorithm](./sethashalgorithm/)(System::String) override | 设置要使用的哈希算法。 |
| [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) override | 设置密钥值。未实现。 |
| [VerifySignature](./verifysignature/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | 验证数据哈希的签名。 |
## 另见

* Class [AsymmetricSignatureDeformatter](../asymmetricsignaturedeformatter/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
