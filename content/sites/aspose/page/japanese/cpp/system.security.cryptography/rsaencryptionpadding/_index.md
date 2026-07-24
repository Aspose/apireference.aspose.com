---
title: "System::Security::Cryptography::RSAEncryptionPadding class"
linktitle: "RSAEncryptionPadding"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::RSAEncryptionPadding クラス。C++ における RSA 暗号化または復号操作のパディングモードとパラメータ。"
type: docs
weight: 3600
url: /ja/cpp/system.security.cryptography/rsaencryptionpadding/
---
## RSAEncryptionPadding class


[RSA](../rsa/) 暗号化または復号操作のパディングモードとパラメータ。

```cpp
class RSAEncryptionPadding : public System::IEquatable<SharedPtr<RSAEncryptionPadding>>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [CreateOaep](./createoaep/)(const HashAlgorithmName\&) | OAEP モードと指定されたハッシュアルゴリズムで [RSAEncryptionPadding](./) を作成します。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(SharedPtr\<RSAEncryptionPadding\>) override |  |
| [get_Mode](./get_mode/)() const | パディングモードを取得します。 |
| [get_OaepHashAlgorithm](./get_oaephashalgorithm/)() const | OAEP で使用されるハッシュアルゴリズムを取得します。 |
| static [get_OaepSHA1](./get_oaepsha1/)() | [SHA1](../sha1/) ハッシュアルゴリズムを使用した OAEP モードを取得します。 |
| static [get_OaepSHA256](./get_oaepsha256/)() | OAEP モードを取得します。ハッシュアルゴリズムは [SHA256](../sha256/) です。 |
| static [get_OaepSHA384](./get_oaepsha384/)() | OAEP モードを取得します。ハッシュアルゴリズムは [SHA384](../sha384/) です。 |
| static [get_OaepSHA512](./get_oaepsha512/)() | OAEP モードを取得します。ハッシュアルゴリズムは [SHA512](../sha512/) です。 |
| static [get_Pkcs1](./get_pkcs1/)() | RTTI 情報。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../../system/object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
## 参照

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
