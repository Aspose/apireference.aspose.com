---
title: "System::IO::File::OpenText メソッド"
linktitle: "OpenText"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::File::OpenText メソッド。指定された既存ファイルを UTF-8 エンコーディングでテキストとして読み取るために、共有なしで C++ で開きます。"
type: docs
weight: 2100
url: /ja/cpp/system.io/file/opentext/
---
## File::OpenText method


UTF-8 エンコーディングを使用し、共有せずに、指定された既存ファイルをテキスト読み取り用に開きます。

```cpp
static StreamReaderPtr System::IO::File::OpenText(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const String\& | 開くファイルのパス |
| エンコーディング | const EncodingPtr\& | 使用する文字エンコーディング |

### ReturnValue

開かれたファイルに関連付けられた [StreamWriter](../../streamwriter/) オブジェクトへの shared pointer

## 参照

* Typedef [StreamReaderPtr](../../../system/streamreaderptr/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
