---
title: "System::IO::MemoryStream::Write メソッド"
linktitle: "Write"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::MemoryStream::Write メソッド。C++ で指定されたバイト配列から指定されたバイト範囲をストリームに書き込みます。"
type: docs
weight: 1900
url: /ja/cpp/system.io/memorystream/write/
---
## MemoryStream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


指定されたバイト配列の指定されたサブレンジを書き込み、ストリームに送ります。

```cpp
void System::IO::MemoryStream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const ArrayPtr\<uint8_t\>\& | 書き込むバイトを含む配列 |
| offset | int32_t | 書き込むサブレンジが開始する **buffer** 内の要素の 0 ベースインデックス |
| count | int32_t | 書き込むサブレンジ内の要素数 |

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


指定されたバイト配列の指定されたサブレンジを書き込み、ストリームに送ります。

```cpp
void System::IO::MemoryStream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const System::Details::ArrayView\<uint8_t\>\& | 書き込むバイトを含む配列ビュー |
| offset | int32_t | 書き込むサブレンジが開始する **buffer** 内の要素の 0 ベースインデックス |
| count | int32_t | 書き込むサブレンジ内の要素数 |

## 参照

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
