---
title: "System::IO::File::ReadAllText メソッド"
linktitle: "ReadAllText"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::File::ReadAllText メソッド。C++ で、指定された文字エンコーディングを使用して、指定されたテキストファイルの内容を単一の String オブジェクトに読み取ります。"
type: docs
weight: 2500
url: /ja/cpp/system.io/file/readalltext/
---
## File::ReadAllText method


指定された文字エンコーディングを使用して、指定されたテキストファイルの内容を単一の [String](../../../system/string/) オブジェクトに読み取ります。

```cpp
static String System::IO::File::ReadAllText(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8())
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const String\& | 読み取るファイルのパス |
| エンコーディング | const EncodingPtr\& | 使用する文字エンコーディング |

### ReturnValue

指定されたファイルの内容を含む文字列

## 参照

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
