---
title: "System::IO::File::Open メソッド"
linktitle: "Open"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::File::Open メソッド。指定されたモードで指定されたファイルを読み書き用に開き、共有なしで使用します（C++）。"
type: docs
weight: 1900
url: /ja/cpp/system.io/file/open/
---
## File::Open(const String\&, FileMode) method


指定されたモードで指定されたファイルを読み書き用に開き、共有しません。

```cpp
static FileStreamPtr System::IO::File::Open(const String &path, FileMode mode)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const String\& | 開くファイルのパス |
| mode | FileMode | ファイルを開くモードを指定します |

### ReturnValue

開かれたファイルに関連付けられた [FileStream](../../filestream/) オブジェクト

## 参照

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## File::Open(const String\&, FileMode, FileAccess, FileShare) method


指定されたモードで、指定されたアクセス種別と共有オプションを使用して指定されたファイルを開きます。

```cpp
static FileStreamPtr System::IO::File::Open(const String &path, FileMode mode, FileAccess access, FileShare share=FileShare::None)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const String\& | 開くファイルのパス |
| mode | FileMode | ファイルを開くモードを指定します |
| アクセス | FileAccess | 要求されたアクセス種別 |
| share | FileShare | 他の [FileStream](../../filestream/) オブジェクトが開かれたファイルに対して持つアクセスの種類 |

### ReturnValue

開かれたファイルに関連付けられた [FileStream](../../filestream/) オブジェクト

## 参照

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
