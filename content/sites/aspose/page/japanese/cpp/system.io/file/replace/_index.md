---
title: "System::IO::File::Replace メソッド"
linktitle: "置換"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::File::Replace メソッド。C++ で、あるファイルの内容を別のファイルに置き換え、置き換えられたファイルのバックアップを作成します。"
type: docs
weight: 2700
url: /ja/cpp/system.io/file/replace/
---
## File::Replace method


あるファイルの内容を別のファイルで置き換え、置き換えられたファイルのバックアップを作成します。

```cpp
static void System::IO::File::Replace(const String &sourceFileName, const String &destinationFileName, const String &destinationBackupFileName, bool ignoreMetadataErrors=true)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| sourceFileName | const String\& | 置き換える先のファイル名 |
| destinationFileName | const String\& | 置き換えるファイルの名前 |
| destinationBackupFileName | const String\& | バックアップファイルの名前 |
| ignoreMetadataErrors | bool | 置き換えられたファイルから置換ファイルへのマージエラーを無視するかどうかを指定します（true で無視、false で無視しません）。 |

## 参照

* Class [String](../../../system/string/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
