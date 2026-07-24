---
title: "System::Security::Cryptography::RSA::SignData メソッド"
linktitle: "SignData"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::RSA::SignData メソッド。指定されたハッシュアルゴリズムとパディングを使用して、指定されたデータ配列のハッシュ値を計算し、C++ で結果に署名します。"
type: docs
weight: 1000
url: /ja/cpp/system.security.cryptography/rsa/signdata/
---
## RSA::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


指定されたハッシュアルゴリズムとパディングを使用して、指定されたデータ配列のハッシュ値を計算し、結果に署名します。

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| データ | const ByteArrayPtr\& | 入力データ配列。 |
| hash_algorithm | const HashAlgorithmName\& | ハッシュアルゴリズム。 |
| padding | const SharedPtr\<RSASignaturePadding\>\& | パディングモード。入力データに対する [RSA](../) 署名を返します。 |

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


指定されたハッシュアルゴリズムとパディングを使用して、指定されたデータ配列のハッシュ値を計算し、結果に署名します。

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| データ | const ByteArrayPtr\& | 入力データ配列。 |
| offset | int32_t | **data** のオフセット。 |
| count | int32_t | 入力データとして使用するバイト数。 |
| hash_algorithm | const HashAlgorithmName\& | ハッシュアルゴリズム。 |
| padding | const SharedPtr\<RSASignaturePadding\>\& | パディングモード。入力データに対する [RSA](../) 署名を返します。 |

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::SignData(const StreamPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


指定されたハッシュアルゴリズムとパディングを使用して、指定されたバイナリストリームのハッシュ値を計算し、結果に署名します。

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ストリーム | const StreamPtr\& | バイナリストリーム。 |
| hash_algorithm | const HashAlgorithmName\& | ハッシュアルゴリズム。 |
| padding | const SharedPtr\<RSASignaturePadding\>\& | パディングモード。入力データに対する [RSA](../) 署名を返します。 |

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
