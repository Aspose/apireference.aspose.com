---
title: "System::IO::File::AppendAllLines メソッド"
linktitle: "AppendAllLines"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::File::AppendAllLines メソッド。指定された文字列コレクションから文字列を取り出し、指定されたエンコーディングで各文字列を新しい行として書き込むことで、指定されたファイルに文字列を追加します。指定されたファイルが存在しない場合は作成されます。すべての文字列を書き込んだ後、ファイルは閉じられます。C++ で。"
type: docs
weight: 100
url: /ja/cpp/system.io/file/appendalllines/
---
## File::AppendAllLines method


指定された文字列コレクションから文字列を取り出し、指定されたエンコーディングで各文字列を新しい行として指定されたファイルに追加します。指定されたファイルが存在しない場合は作成されます。すべての文字列を書き込んだ後、ファイルは閉じられます。

```cpp
static void System::IO::File::AppendAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const String\& | 文字列を追加するファイルのパス |
| 内容 | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | ファイルに書き込む文字列 |
| エンコーディング | const EncodingPtr\& | 使用する文字エンコーディング |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
