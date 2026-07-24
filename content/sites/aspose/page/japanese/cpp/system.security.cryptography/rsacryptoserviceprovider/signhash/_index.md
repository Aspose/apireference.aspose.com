---
title: "System::Security::Cryptography::RSACryptoServiceProvider::SignHash メソッド"
linktitle: "SignHash"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::RSACryptoServiceProvider::SignHash メソッド。C++ で指定されたハッシュ値の署名を計算します。"
type: docs
weight: 1700
url: /ja/cpp/system.security.cryptography/rsacryptoserviceprovider/signhash/
---
## RSACryptoServiceProvider::SignHash(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) method


指定されたハッシュ値の署名を計算します。

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignHash(ByteArrayPtr hash, HashAlgorithmName hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ハッシュ | ByteArrayPtr | ハッシュ値。 |
| hash_algorithm | HashAlgorithmName | ハッシュアルゴリズム。 |
| padding | SharedPtr\<RSASignaturePadding\> | パディングモード。指定されたハッシュに対する [RSA](../../rsa/) 署名を返します。 |

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::SignHash(const ByteArrayPtr\&, const String\&) method


指定された入力値の署名を計算します。未実装です。

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignHash(const ByteArrayPtr &rgb_hash, const String &str)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | 署名対象データのハッシュ値。 |
| str | const String\& | ハッシュ作成に使用されるハッシュアルゴリズム識別子。 |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
