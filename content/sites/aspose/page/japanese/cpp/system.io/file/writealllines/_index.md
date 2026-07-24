---
title: "System::IO::File::WriteAllLines メソッド"
linktitle: "WriteAllLines"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::File::WriteAllLines メソッド。新しいテキストファイルを作成するか既存のファイルを上書きし、指定された文字列配列のすべての文字列をそれぞれ新しい行に書き込みます（C++）。指定されたエンコーディングを使用します。"
type: docs
weight: 3600
url: /ja/cpp/system.io/file/writealllines/
---
## File::WriteAllLines(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) method


指定されたエンコーディングを使用して、新しいテキストファイルを作成するか既存のファイルを上書きし、指定された文字列配列のすべての文字列を各行に1つずつ書き込みます。

```cpp
static void System::IO::File::WriteAllLines(const String &path, const ArrayPtr<String> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const String\& | 作成または上書きするファイル |
| 内容 | const ArrayPtr\<String\>\& | 文字列配列 |
| エンコーディング | const EncodingPtr\& | 使用する文字エンコーディング |

## 参照

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## File::WriteAllLines(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) method


指定されたエンコーディングを使用して、新しいテキストファイルを作成するか既存のファイルを上書きし、指定された列挙可能な文字列コレクションのすべての文字列を各行に1つずつ書き込みます。

```cpp
static void System::IO::File::WriteAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const String\& | 作成または上書きするファイル |
| 内容 | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | 文字列の列挙可能なコレクション |
| エンコーディング | const EncodingPtr\& | 使用する文字エンコーディング |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
