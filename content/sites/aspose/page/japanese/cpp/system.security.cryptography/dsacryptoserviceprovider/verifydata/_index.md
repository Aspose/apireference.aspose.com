---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyData メソッド"
linktitle: "VerifyData"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyData メソッド。C++ でデータの署名を確認します。"
type: docs
weight: 1700
url: /ja/cpp/system.security.cryptography/dsacryptoserviceprovider/verifydata/
---
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&) method


データ署名をチェックします。

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifyData(const ByteArrayPtr &buffer, const ByteArrayPtr &signature)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | 署名を確認する対象の [Data](../../../system.data/)。 |
| 署名 | const ByteArrayPtr\& | 受信した署名。 |

### ReturnValue

署名が有効な場合は true、そうでない場合は false。

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


指定されたデータの署名が有効であることを検証します。

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| データ | const ByteArrayPtr\& | 署名済みデータ。 |
| 署名 | const ByteArrayPtr\& | 署名データ。 |
| hash_algorithm | const HashAlgorithmName\& | ハッシュアルゴリズム。署名が有効な場合は true を返し、そうでない場合は false を返します。 |

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) method


指定されたデータの署名が有効であることを検証します。

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| データ | const ByteArrayPtr\& | 署名済みデータ。 |
| offset | int32_t | **data** のオフセット。 |
| count | int32_t | ハッシュ化するバイト数。 |
| 署名 | const ByteArrayPtr\& | 署名データ。 |
| hash_algorithm | const HashAlgorithmName\& | ハッシュアルゴリズム。署名が有効な場合は true を返し、そうでない場合は false を返します。 |

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


指定されたバイナリストリームの署名が有効であることを検証します。

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ストリーム | const StreamPtr\& | 署名済みデータ。 |
| 署名 | const ByteArrayPtr\& | 署名データ。 |
| hash_algorithm | const HashAlgorithmName\& | ハッシュアルゴリズム。署名が有効な場合は true を返し、そうでない場合は false を返します。 |

## 参照

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
