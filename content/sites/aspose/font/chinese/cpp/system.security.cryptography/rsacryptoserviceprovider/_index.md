---
title: "System::Security::Cryptography::RSACryptoServiceProvider 类"
linktitle: "RSACryptoServiceProvider"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider 类。CSP 形式的 RSA 算法。该类的对象应仅通过 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 3500
url: /zh/cpp/system.security.cryptography/rsacryptoserviceprovider/
---
## RSACryptoServiceProvider class


[RSA](../rsa/) algorithm in CSP form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class RSACryptoServiceProvider : public System::Security::Cryptography::RSA,
                                 public System::Security::Cryptography::ICspAsymmetricAlgorithm
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Decrypt](./decrypt/)(const ByteArrayPtr\&, bool) | 解密消息。未实现。 |
| [Decrypt](./decrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) override | 使用指定的填充模式解密输入数据。 |
| [Dispose](./dispose/)() override | 释放与对象关联的数据。 |
| [Encrypt](./encrypt/)(const ByteArrayPtr\&, bool) | 加密消息。未实现。 |
| [Encrypt](./encrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) override | 使用指定的填充模式加密输入数据。 |
| [ExportCspBlob](./exportcspblob/)(bool) override | 导出包含密钥信息的 blob。未实现。 |
| [ExportParameters](./exportparameters/)(bool) override | 导出 CSP 参数。 |
| [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() override | 获取一个 [CspKeyContainerInfo](../cspkeycontainerinfo/) 对象。 |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | 检查与对象关联的密钥交换算法。 |
| [get_KeySize](./get_keysize/)() override | 获取算法使用的密钥大小。 |
| [get_PersistKeyInCsp](./get_persistkeyincsp/)() const | 检查密钥是否持久化在 CSP 对象中。 |
| [get_PublicOnly](./get_publiconly/)() const | 检查 CSP 对象中是否仅存在公钥。 |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | 获取与 CSP 对象关联的签名算法。 |
| static [get_UseMachineKeyStore](./get_usemachinekeystore/)() | 检查密钥是否持久化在机器存储区而非用户存储区。 |
| [ImportCspBlob](./importcspblob/)(ByteArrayPtr) override | 导入包含密钥信息的 blob。未实现。 |
| [ImportParameters](./importparameters/)(RSAParameters) override | 导入 CSP 参数。 |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)() | RTTI 信息。 |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(const SharedPtr\<CspParameters\>\&) | 构造函数。未实现。 |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(const RSAParameters\&) | 构造函数。 |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(int32_t) | 构造函数。 |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(int32_t, const SharedPtr\<CspParameters\>\&) | 构造函数。未实现。 |
| [set_PersistKeyInCsp](./set_persistkeyincsp/)(bool) | 定义密钥是否持久化在 CSP 对象中。 |
| static [set_UseMachineKeyStore](./set_usemachinekeystore/)(bool) | 定义密钥是否持久化在机器存储区而非用户存储区。 |
| [SignData](./signdata/)(const ByteArrayPtr\&, const SharedPtr\<Object\>\&) | 计算指定输入值的签名。 |
| [SignData](./signdata/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Object\>\&) | 计算指定输入值的签名。 |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const SharedPtr\<Object\>\&) | 计算指定输入值的签名。 |
| [SignHash](./signhash/)(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) override | 为指定的哈希值计算签名。 |
| [SignHash](./signhash/)(const ByteArrayPtr\&, const String\&) | 计算指定输入值的签名。未实现。 |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const SharedPtr\<Object\>\&, const ByteArrayPtr\&) | 检查数据签名。 |
| [VerifyHash](./verifyhash/)(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) | 检查数据签名。 |
| [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) override | 验证指定哈希的签名是否有效。 |
## 另见

* Class [RSA](../rsa/)
* Class [ICspAsymmetricAlgorithm](../icspasymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
