---
title: "System::Security::Cryptography::RSA 类"
linktitle: "RSA"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::RSA 类。RSA 算法实现的基类。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 3400
url: /zh/cpp/system.security.cryptography/rsa/
---
## RSA class


用于实现 [RSA](./) 算法的基类。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class RSA : public System::Security::Cryptography::AsymmetricAlgorithm
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [Create](./create/)() | 创建默认的 [RSA](./) 算法实现。 |
| static [Create](./create/)(const String\&) | 创建默认的 [RSA](./) 算法实现。 |
| static [Create](./create/)(int32_t) | 创建默认的 [RSA](./) 算法实现，使用指定的密钥大小。 |
| static [Create](./create/)(const RSAParameters\&) | 创建默认的 [RSA](./) 算法实现，使用指定的参数。 |
| static [CreateFromXmlString](./createfromxmlstring/)(const String\&) | 创建默认的 [RSA](./) 算法实现，使用指定的 XML 编码参数。 |
| virtual [Decrypt](./decrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) | 使用指定的填充模式解密输入数据。 |
| virtual [DecryptValue](./decryptvalue/)(ByteArrayPtr) | 使用私钥解密值。 |
| virtual [Encrypt](./encrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) | 使用指定的填充模式加密输入数据。 |
| virtual [EncryptValue](./encryptvalue/)(ByteArrayPtr) | 使用私钥加密值。 |
| virtual [ExportParameters](./exportparameters/)(bool) | 导出所有参数。 |
| [FromXmlString](./fromxmlstring/)(String) override | 使用 XML 编码参数初始化对象。 |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | RTTI 信息。 |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | 获取与 CSP 对象关联的签名算法。 |
| virtual [ImportParameters](./importparameters/)(RSAParameters) | 从数据结构导入所有参数。 |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | 使用指定的哈希算法和填充方式计算指定数据数组的哈希值，并对结果进行签名。 |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | 使用指定的哈希算法和填充方式计算指定数据数组的哈希值，并对结果进行签名。 |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | 使用指定的哈希算法和填充，对指定的二进制流计算哈希值并对结果进行签名。 |
| virtual [SignHash](./signhash/)(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) | 为指定的哈希值计算签名。 |
| [ToXmlString](./toxmlstring/)(bool) override | 以 XML 格式导出所有参数。 |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | 验证指定数据的签名是否有效。 |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | 验证指定数据的签名是否有效。 |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | 验证指定二进制流的签名是否有效。 |
| virtual [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) | 验证指定哈希的签名是否有效。 |
## 另见

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
