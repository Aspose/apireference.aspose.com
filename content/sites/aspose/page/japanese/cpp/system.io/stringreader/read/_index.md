---
title: "System::IO::StringReader::Read メソッド"
linktitle: "読み取り"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::StringReader::Read メソッド。C++ でストリームから単一の文字を読み取ります。"
type: docs
weight: 500
url: /ja/cpp/system.io/stringreader/read/
---
## StringReader::Read() method


ストリームから単一の文字を読み取ります。

```cpp
virtual int System::IO::StringReader::Read() override
```


### ReturnValue

読み取った文字、または文字が読み取れなかった場合は -1

## 参照

* Class [StringReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StringReader::Read(ArrayPtr\<char_t\>, int, int) method


指定された位置から開始して、ストリームから指定された文字数の文字を指定された文字配列に読み取ります。

```cpp
virtual int System::IO::StringReader::Read(ArrayPtr<char_t> buffer, int index, int count) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | ArrayPtr\<char_t\> | ストリームから読み取った文字を書き込むための文字配列 |
| インデックス | int | **buffer** の 0 ベースインデックスで、書き込みを開始する位置 |
| count | int | ストリームから読み取る文字数 |

### ReturnValue

ストリームから読み取られた文字数

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
