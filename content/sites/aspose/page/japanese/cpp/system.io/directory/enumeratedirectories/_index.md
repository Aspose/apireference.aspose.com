---
title: "System::IO::Directory::EnumerateDirectories メソッド"
linktitle: "EnumerateDirectories"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::Directory::EnumerateDirectories メソッド。C++ で、指定されたディレクトリまたはそのディレクトリをルートとするディレクトリツリー全体から、指定された検索条件を満たすディレクトリを検索します。"
type: docs
weight: 300
url: /ja/cpp/system.io/directory/enumeratedirectories/
---
## Directory::EnumerateDirectories method


指定されたディレクトリ、またはそのディレクトリをルートとする全ディレクトリツリー内で、指定された検索条件を満たすディレクトリを検索します。

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateDirectories(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const String\& | 検索対象ディレクトリへのフルパスまたは相対パス |
| searchPattern | const String\& | 検索対象ディレクトリの名前パターン |
| searchOption | SearchOption | 検索を指定ディレクトリのみで実行するか、指定ディレクトリをルートとする全ディレクトリツリーで実行するかを指定します。 |

### ReturnValue

**searchPattern** に一致する名前を持つ見つかったディレクトリのフルパスの列挙可能なコレクション

## 参照

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
