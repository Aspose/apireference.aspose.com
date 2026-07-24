---
title: "System::Security::Cryptography::RSA::VerifyData メソッド"
linktitle: "VerifyData"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::RSA::VerifyData メソッド。C++ で指定されたデータの署名が有効かどうかを検証します。"
type: docs
weight: 1300
url: /ja/cpp/system.security.cryptography/rsa/verifydata/
---
## RSA::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


指定されたデータの署名が有効であることを検証します。

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| データ | const ByteArrayPtr\& | 署名済みデータ。 |
| 署名 | const ByteArrayPtr\& | 署名データ。 |
| hash_algorithm | const HashAlgorithmName\& | ハッシュアルゴリズム。 |
| パディング | const SharedPtr\<RSASignaturePadding\>\& | パディングモード。署名が有効な場合は true を返し、そうでない場合は false を返します。 |

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


指定されたデータの署名が有効であることを検証します。

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| データ | const ByteArrayPtr\& | 署名済みデータ。 |
| offset | int32_t | **data** のオフセット。 |
| count | int32_t | ハッシュ化するバイト数。 |
| 署名 | const ByteArrayPtr\& | 署名データ。 |
| hash_algorithm | const HashAlgorithmName\& | ハッシュアルゴリズム。 |
| パディング | const SharedPtr\<RSASignaturePadding\>\& | パディングモード。署名が有効な場合は true を返し、そうでない場合は false を返します。 |

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


指定されたバイナリストリームの署名が有効であることを検証します。

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ストリーム | const StreamPtr\& | 署名済みデータ。 |
| 署名 | const ByteArrayPtr\& | 署名データ。 |
| hash_algorithm | const HashAlgorithmName\& | ハッシュアルゴリズム。 |
| パディング | const SharedPtr\<RSASignaturePadding\>\& | パディングモード。署名が有効な場合は true を返し、そうでない場合は false を返します。 |

## 参照

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
