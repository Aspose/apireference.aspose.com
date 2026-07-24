---
title: "System::IO::Directory::EnumerateFileSystemEntries メソッド"
linktitle: "EnumerateFileSystemEntries"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::Directory::EnumerateFileSystemEntries メソッド。指定された検索条件を満たすファイルとディレクトリを、指定されたディレクトリ内またはそのディレクトリをルートとする全ディレクトリツリー内で検索します（C++）。"
type: docs
weight: 500
url: /ja/cpp/system.io/directory/enumeratefilesystementries/
---
## Directory::EnumerateFileSystemEntries method


指定されたディレクトリ、またはそのディレクトリをルートとする全ディレクトリツリー内で、指定された検索条件を満たすファイルおよびディレクトリを検索します。

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateFileSystemEntries(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const String\& | 検索対象ディレクトリへのフルパスまたは相対パス |
| searchPattern | const String\& | 検索対象となるファイルおよびディレクトリの名前パターン |
| searchOption | SearchOption | 検索を指定ディレクトリのみで実行するか、指定ディレクトリをルートとする全ディレクトリツリーで実行するかを指定します。 |

### ReturnValue

名前が **searchPattern** と一致する、見つかったファイルとディレクトリのフルパスからなる列挙可能なコレクション

## 参照

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
