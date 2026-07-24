---
title: "System::Net::Sockets::NetworkStream::Read method"
linktitle: "読み取り"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::NetworkStream::Read method. ストリームから指定されたバイト数を読み取り、C++ の指定されたバイト配列に書き込みます。"
type: docs
weight: 1900
url: /ja/cpp/system.net.sockets/networkstream/read/
---
## NetworkStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。

```cpp
int32_t System::Net::Sockets::NetworkStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const ArrayPtr\<uint8_t\>\& | 読み取ったバイトが書き込まれるバイト配列です。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 読み取るバイト数です。 |

### ReturnValue

読み取られたバイト数

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## NetworkStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。

```cpp
int32_t System::Net::Sockets::NetworkStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const System::Details::ArrayView\<uint8_t\>\& | 読み取ったバイトを書き込むバイト配列ビュー |
| offset | int32_t | 書き込みを開始する **buffer** 内の0ベース位置 |
| size | int32_t | 読み取るバイト数 |

### ReturnValue

読み取られたバイト数

## 参照

* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
