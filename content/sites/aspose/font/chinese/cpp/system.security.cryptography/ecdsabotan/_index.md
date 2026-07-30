---
title: "System::Security::Cryptography::ECDsaBotan 类"
linktitle: "ECDsaBotan"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::ECDsaBotan 类。Botan 形式的 ECDsa 算法。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1400
url: /zh/cpp/system.security.cryptography/ecdsabotan/
---
## ECDsaBotan class


[ECDsa](../ecdsa/) algorithm in Botan form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ECDsaBotan : public System::Security::Cryptography::ECDsa
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [ECDsaBotan](./ecdsabotan/)() | 构造函数。使用默认参数。 |
| [ECDsaBotan](./ecdsabotan/)(const ECParameters\&) | 构造函数。 |
| [ECDsaBotan](./ecdsabotan/)(const ECCurve\&) | 构造函数。 |
| [ECDsaBotan](./ecdsabotan/)(int32_t) | 构造函数。 |
| [ECDsaBotan](./ecdsabotan/)(const Botan::ECDSA_PublicKey\&) | 构造函数。 |
| [ECDsaBotan](./ecdsabotan/)(const Botan::ECDSA_PrivateKey\&) | 构造函数。 |
| [ExportExplicitParameters](./exportexplicitparameters/)(bool) override | 导出显式参数。 |
| [ExportParameters](./exportparameters/)(bool) override | 导出命名或显式参数。 |
| [FromXmlString](./fromxmlstring/)(String) override | 使用 XML 编码的参数初始化对象。未实现。 |
| [FromXmlString](./fromxmlstring/)(const String\&, ECKeyXmlFormat) | 使用 XML 编码的参数初始化对象。未实现。 |
| [GenerateKey](./generatekey/)(const ECCurve\&) override | 为指定的曲线生成新的公/私钥对。 |
| [get_HashAlgorithm](./get_hashalgorithm/)() const | 获取哈希算法。 |
| [HashData](./hashdata/)(ByteArrayPtr, int32_t, int32_t, HashAlgorithmName) override | 使用指定的哈希算法计算指定数据数组的哈希值。 |
| [HashData](./hashdata/)(StreamPtr, HashAlgorithmName) override | 使用指定的哈希算法计算指定二进制流的哈希值。 |
| [ImportParameters](./importparameters/)(const ECParameters\&) override | 从数据结构导入所有参数。 |
| [set_HashAlgorithm](./set_hashalgorithm/)(const HashAlgorithmName\&) | 设置哈希算法。 |
| [set_KeySize](./set_keysize/)(int32_t) override | 设置密钥大小。 |
| [SignData](./signdata/)(const ByteArrayPtr\&) | 计算指定数据数组的哈希值，并对结果进行签名。 |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t) | 计算指定数据数组的哈希值，并对结果进行签名。 |
| [SignData](./signdata/)(const StreamPtr\&) | 计算指定二进制流的哈希值，并对结果进行签名。 |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | RTTI 信息。 |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | RTTI 信息。 |
| virtual [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | RTTI 信息。 |
| [SignHash](./signhash/)(const ByteArrayPtr\&) override | 计算指定输入值的签名。 |
| [ToXmlString](./toxmlstring/)(bool) override | 以 XML 格式导出所有参数。未实现。 |
| [ToXmlString](./toxmlstring/)(ECKeyXmlFormat) | 以 XML 格式导出所有参数。 |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&) | 验证指定数据的签名是否有效。 |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&) | 验证指定数据的签名是否有效。 |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&) | 验证指定二进制流的签名是否有效。 |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | 验证指定数据的签名是否有效。 |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | 验证指定数据的签名是否有效。 |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | 验证指定二进制流的签名是否有效。 |
| [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr) override | 检查数据签名。 |
## 另见

* Class [ECDsa](../ecdsa/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
