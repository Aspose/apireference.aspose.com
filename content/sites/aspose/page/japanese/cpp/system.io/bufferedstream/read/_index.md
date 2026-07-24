---
title: "System::IO::BufferedStream::Read メソッド"
linktitle: "読み取り"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::BufferedStream::Read メソッド。基礎となるストリームから指定されたバイト数を読み取り、指定されたバイト配列へ C++ で書き込みます。"
type: docs
weight: 900
url: /ja/cpp/system.io/bufferedstream/read/
---
## BufferedStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


基底ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。

```cpp
virtual int32_t System::IO::BufferedStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
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
* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BufferedStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


基底ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。

```cpp
virtual int32_t System::IO::BufferedStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const System::Details::ArrayView\<uint8_t\>\& | 読み取ったバイトを書き込むバイト配列 |
| offset | int32_t | 書き込みを開始する **buffer** 内の0ベース位置 |
| count | int32_t | 読み取るバイト数 |

### ReturnValue

読み取られたバイト数

## 参照

* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
