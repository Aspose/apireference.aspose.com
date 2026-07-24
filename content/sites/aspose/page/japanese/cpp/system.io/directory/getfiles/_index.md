---
title: "System::IO::Directory::GetFiles メソッド"
linktitle: "GetFiles"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::Directory::GetFiles メソッド。C++ で、指定されたディレクトリまたはそのディレクトリをルートとするディレクトリツリー全体から、指定された検索条件を満たすファイルを検索します。"
type: docs
weight: 1200
url: /ja/cpp/system.io/directory/getfiles/
---
## Directory::GetFiles method


指定されたディレクトリ、またはそのディレクトリをルートとする全ディレクトリツリー内で、指定された検索条件を満たすファイルを検索します。

```cpp
static ArrayPtr<String> System::IO::Directory::GetFiles(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const String\& | 検索対象ディレクトリへのフルパスまたは相対パス |
| searchPattern | const String\& | 検索対象ファイルの名前パターン |
| searchOption | SearchOption | 検索を指定ディレクトリのみで実行するか、指定ディレクトリをルートとする全ディレクトリツリーで実行するかを指定します。 |

### ReturnValue

**searchPattern** に一致する名前を持つ見つかったファイルのフルパスの配列

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
