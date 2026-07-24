---
title: "System::IO::FileStream::Read method"
linktitle: "読み取り"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::FileStream::Read メソッド。C++ でストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。"
type: docs
weight: 1300
url: /ja/cpp/system.io/filestream/read/
---
## FileStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。

```cpp
int32_t System::IO::FileStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const ArrayPtr\<uint8_t\>\& | 読み取ったバイトを書き込むためのバイト配列。 |
| offset | int32_t | **buffer** 内で書き込みを開始する 0 ベースの位置。 |
| count | int32_t | 読み取るバイト数です。 |

### ReturnValue

読み取られたバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。

```cpp
int32_t System::IO::FileStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const System::Details::ArrayView\<uint8_t\>\& | 読み取ったバイトを書き込むバイト配列ビュー。 |
| offset | int32_t | **buffer** 内で書き込みを開始する 0 ベースの位置。 |
| count | int32_t | 読み取るバイト数です。 |

### ReturnValue

読み取られたバイト数。

## 参照

* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
