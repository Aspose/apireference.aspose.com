---
title: "System::IO::Stream::Read メソッド"
linktitle: "読み取り"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::Stream::Read メソッド。ストリームから指定されたバイト数を読み取り、C++ で指定されたバイト配列に書き込みます。"
type: docs
weight: 1800
url: /ja/cpp/system.io/stream/read/
---
## Stream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。

```cpp
virtual int32_t System::IO::Stream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const ArrayPtr\<uint8_t\>\& | 読み取ったバイトを書き込むバイト配列 |
| offset | int32_t | 書き込みを開始する **buffer** 内の0ベース位置 |
| count | int32_t | 読み取るバイト数 |

### ReturnValue

読み取られたバイト数

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。

```cpp
virtual int32_t System::IO::Stream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const System::Details::ArrayView\<uint8_t\>\& | 読み取ったバイトを書き込むバイト配列ビュー |
| offset | int32_t | 書き込みを開始する **buffer** 内の0ベース位置 |
| count | int32_t | 読み取るバイト数 |

### ReturnValue

読み取られたバイト数

## 参照

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Read(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) method


ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。

```cpp
template<std::size_t> int32_t System::IO::Stream::Read(const System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t count)
```


| パラメーター | 説明 |
| --- | --- |
| N | スタック配列のサイズ |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const System::Details::StackArray\<uint8_t, N\>\& | 読み取ったバイトを書き込むためのバイトスタック配列 |
| offset | int32_t | 書き込みを開始する **buffer** 内の0ベース位置 |
| count | int32_t | 読み取るバイト数 |

### ReturnValue

読み取られたバイト数

## 参照

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
