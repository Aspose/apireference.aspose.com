---
title: "System::IO::BufferedStream::Write メソッド"
linktitle: "Write"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::BufferedStream::Write メソッド。指定されたバイト配列から指定されたバイトのサブレンジを書き込み、基礎となるストリームへ C++ で転送します。"
type: docs
weight: 1400
url: /ja/cpp/system.io/bufferedstream/write/
---
## BufferedStream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


指定されたバイト配列から指定されたバイトのサブレンジを書き込み、基になるストリームに出力します。

```cpp
virtual void System::IO::BufferedStream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const ArrayPtr\<uint8_t\>\& | 書き込むバイトを含む配列 |
| offset | int32_t | 書き込みサブレンジが開始する **buffer** 内の要素の 0 ベースインデックス |
| count | int32_t | 書き込むサブレンジ内の要素数 |

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BufferedStream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


指定されたバイト配列から指定されたバイトのサブレンジを書き込み、基になるストリームに出力します。

```cpp
virtual void System::IO::BufferedStream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const System::Details::ArrayView\<uint8_t\>\& | 書き込むバイトを含む配列 |
| offset | int32_t | 書き込みサブレンジが開始する **buffer** 内の要素の 0 ベースインデックス |
| count | int32_t | 書き込むサブレンジ内の要素数 |

## 参照

* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
