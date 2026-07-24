---
title: "System::IO::Directory::Delete メソッド"
linktitle: "削除"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::Directory::Delete メソッド。指定されたファイルまたはディレクトリを削除します。C++ では例外をスローしません。"
type: docs
weight: 200
url: /ja/cpp/system.io/directory/delete/
---
## Directory::Delete method


指定されたファイルまたはディレクトリを削除します。例外はスローされません。

```cpp
static void System::IO::Directory::Delete(const String &path, bool recursive=false)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const String\& | 削除するディレクトリまたはファイルへのパス |
| 再帰的 | bool | **path** が空でないディレクトリを指定している場合、**recursive** はディレクトリの内容すべてを再帰的に削除するかどうかを指定します。**path** で指定されたディレクトリが空でなく、**recursive** が 'false' の場合、操作は失敗します。 |

## 参照

* Class [String](../../../system/string/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
