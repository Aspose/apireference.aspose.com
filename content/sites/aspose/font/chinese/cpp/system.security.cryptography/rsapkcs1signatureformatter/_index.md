---
title: "System::Security::Cryptography::RSAPKCS1SignatureFormatter 类"
linktitle: "RSAPKCS1SignatureFormatter"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::RSAPKCS1SignatureFormatter 类。使用 RSA PKCS #1 v1.5 签名对数据进行签名。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 3800
url: /zh/cpp/system.security.cryptography/rsapkcs1signatureformatter/
---
## RSAPKCS1SignatureFormatter class


使用 [RSA](../rsa/) PKCS # 1 v1.5 签名对数据进行签名。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class RSAPKCS1SignatureFormatter : public System::Security::Cryptography::AsymmetricSignatureFormatter
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CreateSignature](./createsignature/)(System::ArrayPtr\<uint8_t\>) override | 对数据进行签名。 |
| [RSAPKCS1SignatureFormatter](./rsapkcs1signatureformatter/)() | RTTI 信息。 |
| [RSAPKCS1SignatureFormatter](./rsapkcs1signatureformatter/)(const System::SharedPtr\<AsymmetricAlgorithm\>\&) | 构造函数。 |
| [SetHashAlgorithm](./sethashalgorithm/)(System::String) override | 设置要使用的哈希算法。 |
| [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) override | 设置密钥值。未实现。 |
| [~RSAPKCS1SignatureFormatter](./~rsapkcs1signatureformatter/)() | 析构函数。 |
## 另见

* Class [AsymmetricSignatureFormatter](../asymmetricsignatureformatter/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
