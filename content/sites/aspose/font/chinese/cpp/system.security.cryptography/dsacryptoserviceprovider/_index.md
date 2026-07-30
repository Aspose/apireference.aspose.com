---
title: "System::Security::Cryptography::DSACryptoServiceProvider 类"
linktitle: "DSACryptoServiceProvider"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider 类。DSA 算法的 CSP 形式。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1000
url: /zh/cpp/system.security.cryptography/dsacryptoserviceprovider/
---
## DSACryptoServiceProvider class


[DSA](../dsa/) algorithm in CSP form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DSACryptoServiceProvider : public System::Security::Cryptography::DSA,
                                 public System::Security::Cryptography::ICspAsymmetricAlgorithm
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CreateSignature](./createsignature/)(ByteArrayPtr) override | 为指定数据创建 [DSA](../dsa/) 签名。 |
| [Dispose](./dispose/)() override | 释放与对象关联的数据。 |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)() | 构造函数。使用默认参数。 |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(const DSAParameters\&) | 构造函数。 |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(const SharedPtr\<CspParameters\>\&) | 构造函数。未实现。 |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(int32_t) | 构造函数。 |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(int32_t, const SharedPtr\<CspParameters\>\&) | 构造函数。未实现。 |
| [ExportCspBlob](./exportcspblob/)(bool) override | 导出包含密钥信息的 blob。未实现。 |
| [ExportParameters](./exportparameters/)(bool) override | 导出 CSP 参数。 |
| [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() override | 获取一个 [CspKeyContainerInfo](../cspkeycontainerinfo/) 对象。 |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | 检查与对象关联的密钥交换算法。 |
| [get_KeySize](./get_keysize/)() override | 获取密钥大小。 |
| [get_PersistKeyInCsp](./get_persistkeyincsp/)() const | 检查密钥是否持久化在 CSP 对象中。 |
| [get_PublicOnly](./get_publiconly/)() const | 检查 CSP 对象中是否仅存在公钥。 |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | 获取要使用的签名算法。 |
| static [get_UseMachineKeyStore](./get_usemachinekeystore/)() | 检查密钥是否持久化在机器存储区而非用户存储区。 |
| [ImportCspBlob](./importcspblob/)(ByteArrayPtr) override | 导入包含密钥信息的 blob。未实现。 |
| [ImportParameters](./importparameters/)(DSAParameters) override | 从数据结构导入所有参数。 |
| [set_PersistKeyInCsp](./set_persistkeyincsp/)(bool) | 定义密钥是否持久化在 CSP 对象中。 |
| static [set_UseMachineKeyStore](./set_usemachinekeystore/)(bool) | 定义密钥是否持久化在机器存储区而非用户存储区。 |
| [SignData](./signdata/)(const ByteArrayPtr\&) | 计算指定输入值的签名。 |
| [SignData](./signdata/)(const SharedPtr\<IO::Stream\>\&) | 计算指定输入值的签名。 |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t) | 计算指定输入值的签名。 |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | RTTI 信息。 |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | RTTI 信息。 |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | RTTI 信息。 |
| [SignHash](./signhash/)(const ByteArrayPtr\&, const String\&) | 计算指定输入值的签名。 |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&) | 检查数据签名。 |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | 验证指定数据的签名是否有效。 |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | 验证指定数据的签名是否有效。 |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | 验证指定二进制流的签名是否有效。 |
| [VerifyHash](./verifyhash/)(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) | 检查数据签名。 |
| [VerifySignature](./verifysignature/)(ByteArrayPtr, ByteArrayPtr) override | 验证指定数据的 [DSA](../dsa/) 签名。 |
## 另见

* Class [DSA](../dsa/)
* Class [ICspAsymmetricAlgorithm](../icspasymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
