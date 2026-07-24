---
title: "System::Security::Cryptography::ECDsaBotan::HashData メソッド"
linktitle: "HashData"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::ECDsaBotan::HashData メソッド。C++ で指定されたハッシュアルゴリズムを使用して、指定されたデータ配列のハッシュ値を計算します。"
type: docs
weight: 700
url: /ja/cpp/system.security.cryptography/ecdsabotan/hashdata/
---
## ECDsaBotan::HashData(ByteArrayPtr, int32_t, int32_t, HashAlgorithmName) method


指定されたハッシュアルゴリズムを使用して、指定されたデータ配列のハッシュ値を計算します。

```cpp
ByteArrayPtr System::Security::Cryptography::ECDsaBotan::HashData(ByteArrayPtr data, int32_t offset, int32_t count, HashAlgorithmName hash_algorithm) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| data | ByteArrayPtr | ハッシュする [Data](../../../system.data/) 。 |
| offset | int32_t | **data** のオフセット。 |
| count | int32_t | ハッシュ化するバイト数。 |
| hash_algorithm | HashAlgorithmName | ハッシュアルゴリズム。 |

### ReturnValue

ハッシュされたデータです。

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsaBotan::HashData(StreamPtr, HashAlgorithmName) method


指定されたハッシュアルゴリズムを使用して、指定されたバイナリストリームのハッシュ値を計算します。

```cpp
ByteArrayPtr System::Security::Cryptography::ECDsaBotan::HashData(StreamPtr stream, HashAlgorithmName hash_algorithm) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ストリーム | StreamPtr | ハッシュ対象のバイナリストリームです。 |
| hash_algorithm | HashAlgorithmName | ハッシュアルゴリズム。 |

### ReturnValue

ハッシュされたデータです。

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
