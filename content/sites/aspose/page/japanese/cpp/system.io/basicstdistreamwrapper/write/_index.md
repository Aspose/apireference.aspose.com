---
title: "System::IO::BasicSTDIStreamWrapper::Write メソッド"
linktitle: "Write"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::BasicSTDIStreamWrapper::Write メソッド。ラッピングモードがバイナリの場合、指定されたバイト配列から指定されたサブレンジのバイトを書き込みます。それ以外の場合は、指定されたバイト配列から指定されたサブレンジのバイトを char_type 型に変換し、結果をストリームに書き込みます。C++ ではサポートされていません！"
type: docs
weight: 700
url: /ja/cpp/system.io/basicstdistreamwrapper/write/
---
## BasicSTDIStreamWrapper::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


ラッピングモードがバイナリの場合、指定されたバイト配列から指定されたサブレンジのバイトを書き込みます。それ以外の場合は、指定されたバイト配列から指定されたサブレンジのバイトを [char_type](../char_type/) 型に変換し、結果をストリームに書き込みます。サポートされていません！

```cpp
virtual void System::IO::BasicSTDIStreamWrapper<T, typename>::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const ArrayPtr\<uint8_t\>\& | 書き込むバイトを含む配列。 |
| offset | int32_t | 書き込みサブレンジが開始する **buffer** 内の要素の 0 ベースインデックス。 |
| count | int32_t | 書き込むサブレンジ内の要素数。 |

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BasicSTDIStreamWrapper::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


指定されたバイト配列の指定されたサブレンジを書き込み、ストリームに送ります。

```cpp
virtual void System::IO::BasicSTDIStreamWrapper<T, typename>::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const System::Details::ArrayView\<uint8_t\>\& | 書き込むバイトを含む配列ビュー |
| offset | int32_t | 書き込みサブレンジが開始する **buffer** 内の要素の0ベースインデックス |
| count | int32_t | 書き込むサブレンジ内の要素数 |

## 参照

* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
