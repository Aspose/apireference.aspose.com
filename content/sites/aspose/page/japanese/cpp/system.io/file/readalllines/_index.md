---
title: "System::IO::File::ReadAllLines メソッド"
linktitle: "ReadAllLines"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::File::ReadAllLines メソッド。指定されたテキストファイルの内容を、指定された文字エンコーディングを使用して行ごとに読み取り、文字列の配列に格納します（C++）。"
type: docs
weight: 2400
url: /ja/cpp/system.io/file/readalllines/
---
## File::ReadAllLines method


指定された文字エンコーディングを使用し、指定されたテキストファイルの内容を行ごとに文字列配列に読み取ります。

```cpp
static ArrayPtr<String> System::IO::File::ReadAllLines(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8())
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const String\& | 読み取るファイルのパス |
| エンコーディング | const EncodingPtr\& | 使用する文字エンコーディング |

### ReturnValue

各要素が指定されたファイルの単一行を表す文字列配列

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
