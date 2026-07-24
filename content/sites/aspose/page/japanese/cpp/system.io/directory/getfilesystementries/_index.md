---
title: "System::IO::Directory::GetFileSystemEntries メソッド"
linktitle: "GetFileSystemEntries"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::Directory::GetFileSystemEntries メソッド。指定された検索条件を満たすファイルとディレクトリを、指定ディレクトリ内またはそのディレクトリをルートとする全ディレクトリツリー内で検索します（C++）。"
type: docs
weight: 1300
url: /ja/cpp/system.io/directory/getfilesystementries/
---
## Directory::GetFileSystemEntries method


指定されたディレクトリ、またはそのディレクトリをルートとする全ディレクトリツリー内で、指定された検索条件を満たすファイルおよびディレクトリを検索します。

```cpp
static ArrayPtr<String> System::IO::Directory::GetFileSystemEntries(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const String\& | 検索対象ディレクトリへのフルパスまたは相対パス |
| searchPattern | const String\& | 検索対象となるファイルおよびディレクトリの名前パターン |
| searchOption | SearchOption | 検索を指定ディレクトリのみで実行するか、指定ディレクトリをルートとする全ディレクトリツリーで実行するかを指定します。 |

### ReturnValue

名前が **searchPattern** と一致する、見つかったファイルとディレクトリのフルパスの配列

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
