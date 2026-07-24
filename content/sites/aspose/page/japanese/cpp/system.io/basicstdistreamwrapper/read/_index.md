---
title: "System::IO::BasicSTDIStreamWrapper::Read メソッド"
linktitle: "読み取り"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::BasicSTDIStreamWrapper::Read メソッド。ラッピングモードがバイナリの場合、ストリームから指定されたバイト数を読み取り、そうでない場合は指定された文字数を読み取り、uint8_t 型に変換します。読み取り結果を C++ の指定されたバイト配列に書き込みます。"
type: docs
weight: 400
url: /ja/cpp/system.io/basicstdistreamwrapper/read/
---
## BasicSTDIStreamWrapper::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


ラッピングモードがバイナリの場合、ストリームから指定されたバイト数を読み取り、そうでない場合は指定された文字数を読み取り、uint8_t 型に変換します。読み取り結果を指定されたバイト配列に書き込みます。

```cpp
virtual int32_t System::IO::BasicSTDIStreamWrapper<T, typename>::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const ArrayPtr\<uint8_t\>\& | 読み取ったバイトを書き込むバイト配列 |
| offset | int32_t | 書き込みを開始する **buffer** 内の0ベース位置 |
| count | int32_t | 読み取るバイト数 |

### ReturnValue

読み取られたバイト数または文字数

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BasicSTDIStreamWrapper::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。

```cpp
virtual int32_t System::IO::BasicSTDIStreamWrapper<T, typename>::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const System::Details::ArrayView\<uint8_t\>\& | 読み取ったバイトを書き込むバイト配列ビュー |
| offset | int32_t | 書き込みを開始する **buffer** 内の0ベース位置 |
| count | int32_t | 読み取るバイト数 |

### ReturnValue

読み取られたバイト数

## 参照

* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
