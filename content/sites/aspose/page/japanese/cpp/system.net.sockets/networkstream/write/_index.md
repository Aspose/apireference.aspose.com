---
title: "System::Net::Sockets::NetworkStream::Write メソッド"
linktitle: "Write"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::NetworkStream::Write メソッド。指定されたバイト配列の指定されたサブレンジのバイトを書き込み、C++ でストリームに送ります。"
type: docs
weight: 2500
url: /ja/cpp/system.net.sockets/networkstream/write/
---
## NetworkStream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


指定されたバイト配列の指定されたサブレンジを書き込み、ストリームに送ります。

```cpp
void System::Net::Sockets::NetworkStream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const ArrayPtr\<uint8_t\>\& | 書き込むバイトを含む配列。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 書き込むサブレンジ内の要素数。 |

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## NetworkStream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


指定されたバイト配列の指定されたサブレンジを書き込み、ストリームに送ります。

```cpp
void System::Net::Sockets::NetworkStream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const System::Details::ArrayView\<uint8_t\>\& | 書き込むバイトを含む配列ビュー |
| offset | int32_t | 書き込みサブレンジが開始する **buffer** 内の要素の0ベースインデックス |
| size | int32_t | 書き込むサブレンジ内の要素数 |

## 参照

* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
