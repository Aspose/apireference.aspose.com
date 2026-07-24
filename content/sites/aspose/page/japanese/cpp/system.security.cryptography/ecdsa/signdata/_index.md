---
title: "System::Security::Cryptography::ECDsa::SignData メソッド"
linktitle: "SignData"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::ECDsa::SignData メソッド。指定されたハッシュアルゴリズムを使用して指定されたデータ配列のハッシュ値を計算し、C++ で結果に署名します。"
type: docs
weight: 700
url: /ja/cpp/system.security.cryptography/ecdsa/signdata/
---
## ECDsa::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&) method


指定されたハッシュアルゴリズムを使用して、指定されたデータ配列のハッシュ値を計算し、結果に署名します。

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| データ | const ByteArrayPtr\& | 入力データ配列。 |
| hash_algorithm | const HashAlgorithmName\& | ハッシュアルゴリズム。入力データに対する ECDSA 署名を返します。 |

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsa::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) method


指定されたハッシュアルゴリズムを使用して、指定されたデータ配列のハッシュ値を計算し、結果に署名します。

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| データ | const ByteArrayPtr\& | 入力データ配列。 |
| offset | int32_t | **data** のオフセット。 |
| count | int32_t | 入力データとして使用するバイト数。 |
| hash_algorithm | const HashAlgorithmName\& | ハッシュアルゴリズム。入力データに対する ECDSA 署名を返します。 |

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsa::SignData(const StreamPtr\&, const HashAlgorithmName\&) method


指定されたハッシュアルゴリズムを使用して、指定されたバイナリストリームのハッシュ値を計算し、結果に署名します。

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ストリーム | const StreamPtr\& | バイナリストリーム。 |
| hash_algorithm | const HashAlgorithmName\& | ハッシュアルゴリズム。入力データに対する ECDSA 署名を返します。 |

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
