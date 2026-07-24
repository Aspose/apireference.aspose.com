---
title: "System::IO::Path::CheckPath メソッド"
linktitle: "CheckPath"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::Path::CheckPath メソッド。指定されたパスに無効な文字が含まれているかをチェックして、パスが有効かどうかを判定します。C++ でパスに無効な文字が含まれている場合は例外がスローされます。"
type: docs
weight: 200
url: /ja/cpp/system.io/path/checkpath/
---
## Path::CheckPath method


指定されたパスに無効な文字が含まれていないか確認することで、パスが有効かどうかを判定します。パスに無効な文字が含まれている場合は例外がスローされます。

```cpp
static void System::IO::Path::CheckPath(const String &path, const String &msg=s_msg_path, bool allow_empty=true)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const String\& | チェックするパス |
| msg | const String\& | 例外オブジェクトのコンストラクタに渡すメッセージ |
| allow_empty | bool | 空または null の文字列を正しいパスとみなすかどうかを指定します（true の場合は正しい、false の場合は正しくない）。このパラメータが false で **path** が空の場合は ArgumentException がスローされます。パラメータが false で **path** が null の場合は ArgumentNullException がスローされます。 |

## 参照

* Class [String](../../../system/string/)
* Class [Path](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
