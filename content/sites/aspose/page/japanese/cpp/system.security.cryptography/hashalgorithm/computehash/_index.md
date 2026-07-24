---
title: "System::Security::Cryptography::HashAlgorithm::ComputeHash method"
linktitle: "ComputeHash"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::HashAlgorithm::ComputeHash method. C++ でバッファのハッシュを計算します。"
type: docs
weight: 200
url: /ja/cpp/system.security.cryptography/hashalgorithm/computehash/
---
## HashAlgorithm::ComputeHash(const ArrayPtr\<uint8_t\>\&) method


バッファのハッシュを計算します。

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(const ArrayPtr<uint8_t> &buffer)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const ArrayPtr\<uint8_t\>\& | ソースバッファ。 |

### ReturnValue

計算されたハッシュ値。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## HashAlgorithm::ComputeHash(const ArrayPtr\<uint8_t\>\&, int, int) method


バッファスライスのハッシュを計算します。

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(const ArrayPtr<uint8_t> &buffer, int offset, int count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const ArrayPtr\<uint8_t\>\& | ソースバッファ。 |
| offset | int | ソースバッファ内のオフセット。 |
| count | int | ソースバッファから使用するバイト数。 |

### ReturnValue

計算されたハッシュ値。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## HashAlgorithm::ComputeHash(SharedPtr\<IO::Stream\> const\&) method


ストリームを最後まで読み取り、読み取ったデータのハッシュを計算します。

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(SharedPtr<IO::Stream> const &inputStream)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| inputStream | SharedPtr\<IO::Stream\> const\& | データを読み取るストリーム。 |

### ReturnValue

ストリーム全体データの計算されたハッシュ値。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
