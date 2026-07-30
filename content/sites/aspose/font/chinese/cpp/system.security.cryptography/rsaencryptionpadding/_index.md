---
title: "System::Security::Cryptography::RSAEncryptionPadding 类"
linktitle: "RSAEncryptionPadding"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::RSAEncryptionPadding 类。用于 C++ 中 RSA 加密或解密操作的填充模式和参数。"
type: docs
weight: 3600
url: /zh/cpp/system.security.cryptography/rsaencryptionpadding/
---
## RSAEncryptionPadding class


用于[RSA](../rsa/)加密或解密操作的填充模式和参数。

```cpp
class RSAEncryptionPadding : public System::IEquatable<SharedPtr<RSAEncryptionPadding>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [CreateOaep](./createoaep/)(const HashAlgorithmName\&) | 创建具有 OAEP 模式和指定哈希算法的[RSAEncryptionPadding](./)。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(SharedPtr\<RSAEncryptionPadding\>) override |  |
| [get_Mode](./get_mode/)() const | 获取填充模式。 |
| [get_OaepHashAlgorithm](./get_oaephashalgorithm/)() const | 获取 OAEP 使用的哈希算法。 |
| static [get_OaepSHA1](./get_oaepsha1/)() | 获取使用[SHA1](../sha1/)哈希算法的 OAEP 模式。 |
| static [get_OaepSHA256](./get_oaepsha256/)() | 获取使用[SHA256](../sha256/)哈希算法的 OAEP 模式。 |
| static [get_OaepSHA384](./get_oaepsha384/)() | 获取使用[SHA384](../sha384/)哈希算法的 OAEP 模式。 |
| static [get_OaepSHA512](./get_oaepsha512/)() | 获取使用[SHA512](../sha512/)哈希算法的 OAEP 模式。 |
| static [get_Pkcs1](./get_pkcs1/)() | RTTI 信息。 |
| [GetHashCode](./gethashcode/)() const override | 相当于 C# [Object.GetHashCode()](../../system/object/gethashcode/) 方法。启用自定义对象的哈希计算。 |
| [ToString](./tostring/)() const override | 相当于 C# 的 [Object.ToString()](../../system/object/tostring/) 方法。用于将自定义对象转换为字符串。 |
## 另见

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
