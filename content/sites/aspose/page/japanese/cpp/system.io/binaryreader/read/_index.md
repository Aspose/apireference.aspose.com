---
title: "System::IO::BinaryReader::Read メソッド"
linktitle: "読み取り"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::BinaryReader::Read メソッド。C++ で入力ストリームから単一文字を読み取ります。"
type: docs
weight: 700
url: /ja/cpp/system.io/binaryreader/read/
---
## BinaryReader::Read() method


入力ストリームから単一の文字を読み取ります。

```cpp
virtual int System::IO::BinaryReader::Read()
```


### ReturnValue

UTF-16 エンコーディングでエンコードされた文字を読み取ります；読み取った文字が UTF-16 で 2 つのコードポイントで表される場合は、上位サロゲートのみが返されます。

## 参照

* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryReader::Read(ArrayPtr\<char_t\>, int, int) method


入力ストリームから指定された文字数を読み取り、UTF-16 エンコーディングに変換し、指定された位置から開始して指定された文字配列に結果の UTF-16 文字を書き込みます。

```cpp
virtual int System::IO::BinaryReader::Read(ArrayPtr<char_t> buffer, int index, int count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | ArrayPtr\<char_t\> | 入力ストリームから読み取った文字を書き込むための UTF-16 文字配列 |
| インデックス | int | **buffer** の 0 ベースインデックスで、書き込みを開始する位置 |
| count | int | ストリームから読み取る文字数 |

### ReturnValue

入力ストリームから読み取られた文字数

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryReader::Read(ArrayPtr\<uint8_t\>, int, int) method


入力ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。

```cpp
virtual int System::IO::BinaryReader::Read(ArrayPtr<uint8_t> buffer, int index, int count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | ArrayPtr\<uint8_t\> | 読み取ったバイトを書き込むバイト配列 |
| インデックス | int | 書き込みを開始する **buffer** 内の0ベース位置 |
| count | int | 読み取るバイト数 |

### ReturnValue

読み取られたバイト数

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
