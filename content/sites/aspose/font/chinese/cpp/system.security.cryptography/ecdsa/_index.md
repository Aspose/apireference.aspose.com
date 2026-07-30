---
title: "System::Security::Cryptography::ECDsa 类"
linktitle: "ECDsa"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::ECDsa 类。ECDsa 算法实现的基类。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1300
url: /zh/cpp/system.security.cryptography/ecdsa/
---
## ECDsa class


用于实现 [ECDsa](./) 算法的基类。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class ECDsa : public System::Security::Cryptography::AsymmetricAlgorithm
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [Create](./create/)() | 创建默认的 ECDSA 算法实现。 |
| static [Create](./create/)(const ECCurve\&) | 在指定曲线上使用新创建的密钥创建默认的 ECDSA 算法实现。 |
| static [Create](./create/)(const ECParameters\&) | 使用指定的参数创建默认的 ECDSA 算法实现。 |
| static [Create](./create/)(const String\&) | 创建指定的 ECDSA 算法实现。 |
| virtual [ExportExplicitParameters](./exportexplicitparameters/)(bool) | 导出显式参数。 |
| virtual [ExportParameters](./exportparameters/)(bool) | 导出命名或显式参数。 |
| virtual [GenerateKey](./generatekey/)(const ECCurve\&) | 为指定的曲线生成新的公/私钥对。 |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | RTTI 信息。 |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | 获取要使用的签名算法。 |
| virtual [ImportParameters](./importparameters/)(const ECParameters\&) | 从数据结构导入所有参数。 |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | 使用指定的哈希算法计算指定数据数组的哈希值，并对结果进行签名。 |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | 使用指定的哈希算法计算指定数据数组的哈希值，并对结果进行签名。 |
| virtual [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | 使用指定的哈希算法计算指定二进制流的哈希值，并对结果进行签名。 |
| virtual [SignHash](./signhash/)(const ByteArrayPtr\&) | 计算指定输入值的签名。 |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | 验证指定数据的签名是否有效。 |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | 验证指定数据的签名是否有效。 |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | 验证指定二进制流的签名是否有效。 |
| virtual [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr) | 检查数据签名。 |
## 另见

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
