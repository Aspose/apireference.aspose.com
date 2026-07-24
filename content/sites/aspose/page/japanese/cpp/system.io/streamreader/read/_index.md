---
title: "System::IO::StreamReader::Read メソッド"
linktitle: "読み取り"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::StreamReader::Read メソッド。C++ でストリームから単一文字を読み取ります。"
type: docs
weight: 900
url: /ja/cpp/system.io/streamreader/read/
---
## StreamReader::Read() method


ストリームから単一の文字を読み取ります。

```cpp
virtual int System::IO::StreamReader::Read() override
```


### ReturnValue

UTF-16 エンコーディングでエンコードされた文字を読み取ります；読み取った文字が UTF-16 で 2 つのコードポイントで表される場合は、上位サロゲートのみが返されます。

## 参照

* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::Read(ArrayPtr\<char_t\>, int, int) method


ストリームから指定された文字数を読み取り、UTF-16 エンコーディングに変換し、指定された位置から始まる指定された文字配列に結果の UTF-16 文字を書き込みます。

```cpp
virtual int System::IO::StreamReader::Read(ArrayPtr<char_t> buffer, int index, int count) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | ArrayPtr\<char_t\> | ストリームから読み取った文字を書き込むための UTF-16 文字配列 |
| インデックス | int | **buffer** の 0 ベースインデックスで、書き込みを開始する位置 |
| count | int | ストリームから読み取る文字数 |

### ReturnValue

ストリームから読み取られた文字数

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
