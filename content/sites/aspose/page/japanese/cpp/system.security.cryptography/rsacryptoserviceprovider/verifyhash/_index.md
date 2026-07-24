---
title: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash メソッド"
linktitle: "VerifyHash"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash メソッド。指定されたハッシュの署名が有効かどうかを検証します（C++）。"
type: docs
weight: 1900
url: /ja/cpp/system.security.cryptography/rsacryptoserviceprovider/verifyhash/
---
## RSACryptoServiceProvider::VerifyHash(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) method


指定されたハッシュの署名が有効であることを検証します。

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ハッシュ | ByteArrayPtr | 署名されたデータのハッシュ値。 |
| 署名 | ByteArrayPtr | 署名データ。 |
| hash_algorithm | const HashAlgorithmName\& | ハッシュアルゴリズム。 |
| パディング | SharedPtr\<RSASignaturePadding\> | パディングモード。署名が有効な場合は true を返し、そうでない場合は false を返します。 |

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) method


データ署名をチェックします。

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr &rgb_hash, const String &str, const ByteArrayPtr &rgb_signature)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | 受信データのハッシュが計算されます。 |
| str | const String\& | 使用されているハッシュアルゴリズムの名前。 |
| rgb_signature | const ByteArrayPtr\& | 受信した署名。 |

### ReturnValue

署名が有効な場合は true、そうでない場合は false。

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
