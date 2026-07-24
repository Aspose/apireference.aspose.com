---
title: "System::IO::File::ReadLines メソッド"
linktitle: "ReadLines"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::File::ReadLines メソッド。指定された文字エンコーディングを使用して、指定されたテキストファイルの内容を行単位で読み取り、各行を表す文字列の列挙可能なコレクションを返します（C++）。"
type: docs
weight: 2600
url: /ja/cpp/system.io/file/readlines/
---
## File::ReadLines method


指定された文字エンコーディングを使用し、指定されたテキストファイルの内容を行ごとに読み取り、各行を表す文字列の列挙可能なコレクションを返します。

```cpp
static SharedPtr<Collections::Generic::IEnumerable<String>> System::IO::File::ReadLines(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8())
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const String\& | 読み取るファイルのパス |
| エンコーディング | const EncodingPtr\& | 使用する文字エンコーディング |

### ReturnValue

指定されたファイルの内容を表す文字列の列挙可能なコレクション

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
