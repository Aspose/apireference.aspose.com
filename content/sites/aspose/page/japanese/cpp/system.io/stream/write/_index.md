---
title: "System::IO::Stream::Write メソッド"
linktitle: "Write"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::Stream::Write メソッド。指定されたバイト配列から指定されたサブレンジのバイトを書き込み、C++ でストリームに送ります。"
type: docs
weight: 2600
url: /ja/cpp/system.io/stream/write/
---
## Stream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


指定されたバイト配列の指定されたサブレンジを書き込み、ストリームに送ります。

```cpp
virtual void System::IO::Stream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const ArrayPtr\<uint8_t\>\& | 書き込むバイトを含む配列 |
| offset | int32_t | 書き込みサブレンジが開始する **buffer** 内の要素の0ベースインデックス |
| count | int32_t | 書き込むサブレンジ内の要素数 |

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


指定されたバイト配列の指定されたサブレンジを書き込み、ストリームに送ります。

```cpp
virtual void System::IO::Stream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const System::Details::ArrayView\<uint8_t\>\& | 書き込むバイトを含む配列ビュー |
| offset | int32_t | 書き込みサブレンジが開始する **buffer** 内の要素の0ベースインデックス |
| count | int32_t | 書き込むサブレンジ内の要素数 |

## 参照

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Write(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) method


指定されたバイト配列の指定されたサブレンジを書き込み、ストリームに送ります。

```cpp
template<std::size_t> void System::IO::Stream::Write(const System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t count)
```


| パラメーター | 説明 |
| --- | --- |
| N | スタック配列のサイズ |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const System::Details::StackArray\<uint8_t, N\>\& | 書き込むバイトを含むスタック配列 |
| offset | int32_t | 書き込みサブレンジが開始する **buffer** 内の要素の0ベースインデックス |
| count | int32_t | 書き込むサブレンジ内の要素数 |

## 参照

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
