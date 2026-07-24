---
title: "System::IO::File::WriteAllText メソッド"
linktitle: "WriteAllText"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::File::WriteAllText メソッド。新しいテキストファイルを作成するか既存のファイルを上書きし、指定された文字列の内容を指定されたエンコーディングで書き込みます（C++）。"
type: docs
weight: 3700
url: /ja/cpp/system.io/file/writealltext/
---
## File::WriteAllText method


指定されたエンコーディングを使用して、新しいテキストファイルを作成するか既存のファイルを上書きし、指定された文字列の内容を書き込みます。

```cpp
static void System::IO::File::WriteAllText(const String &path, const String &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const String\& | 作成または上書きするファイル |
| 内容 | const String\& | 文字列配列 |
| エンコーディング | const EncodingPtr\& | 使用する文字エンコーディング |

## 参照

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
