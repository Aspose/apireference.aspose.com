---
title: "System::IO::TextReader::ReadBlock メソッド"
linktitle: "ReadBlock"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::TextReader::ReadBlock メソッド。C++ で現在のテキストリーダーから指定された最大文字数を読み取り、指定されたインデックスからバッファにデータを書き込みます。"
type: docs
weight: 500
url: /ja/cpp/system.io/textreader/readblock/
---
## TextReader::ReadBlock method


現在の TextReader から指定された最大文字数を読み取り、指定されたインデックスから始まるバッファにデータを書き込みます。

```cpp
virtual int System::IO::TextReader::ReadBlock(ArrayPtr<char_t> buffer, int index, int count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | ArrayPtr\<char_t\> | 読み取ったデータを書き込むための文字バッファ |
| インデックス | int | **buffer** 内の 0 ベースインデックスで、書き込みを開始する位置 |
| count | int | 読み取る最大文字数 |

### ReturnValue

実際に読み取られた文字数

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
