---
title: "System::IO::Directory::EnumerateFiles メソッド"
linktitle: "EnumerateFiles"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::Directory::EnumerateFiles メソッド。指定された検索条件を満たすファイルを、指定ディレクトリ内またはそのディレクトリをルートとする全ディレクトリツリー内で検索します（C++）。"
type: docs
weight: 400
url: /ja/cpp/system.io/directory/enumeratefiles/
---
## Directory::EnumerateFiles method


指定されたディレクトリ、またはそのディレクトリをルートとする全ディレクトリツリー内で、指定された検索条件を満たすファイルを検索します。

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateFiles(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const String\& | 検索対象ディレクトリへのフルパスまたは相対パス |
| searchPattern | const String\& | 検索対象ファイルの名前パターン |
| searchOption | SearchOption | 検索を指定ディレクトリのみで実行するか、指定ディレクトリをルートとする全ディレクトリツリーで実行するかを指定します。 |

### ReturnValue

名前が **searchPattern** と一致する見つかったファイルのフルパスの列挙可能なコレクション

## 参照

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
