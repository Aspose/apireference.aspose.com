---
title: "System::IO::FileInfo::Replace メソッド"
linktitle: "置換"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::FileInfo::Replace メソッド。現在の FileInfo オブジェクトが表すファイルで、指定された宛先ファイルの内容を置き換え、置き換えられたファイルのバックアップを作成します（C++）。"
type: docs
weight: 2000
url: /ja/cpp/system.io/fileinfo/replace/
---
## FileInfo::Replace(const String\&, const String\&) method


指定された宛先ファイルの内容を、現在の [FileInfo](../) オブジェクトが表すファイルで置き換え、置き換えられたファイルのバックアップを作成します。

```cpp
FileInfoPtr System::IO::FileInfo::Replace(const String &destinationFileName, const String &destinationBackupFileName)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| destinationFileName | const String\& | 置き換えるファイルの名前 |
| destinationBackupFileName | const String\& | バックアップファイルの名前 |

### ReturnValue

**destinationFileName** が指すファイルを表す FileInfor オブジェクト

## 参照

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileInfo::Replace(const String\&, const String\&, bool) method


指定された宛先ファイルの内容を、現在の [FileInfo](../) オブジェクトが表すファイルで置き換え、置き換えられたファイルのバックアップを作成します。

```cpp
FileInfoPtr System::IO::FileInfo::Replace(const String &destinationFileName, const String &destinationBackupFileName, bool ignoreMetadataErrors)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| destinationFileName | const String\& | 置き換えるファイルの名前 |
| destinationBackupFileName | const String\& | バックアップファイルの名前 |
| ignoreMetadataErrors | bool | 置き換えられたファイルから置換ファイルへのマージエラーを無視するかどうかを指定します（true で無視、false で無視しません）。 |

### ReturnValue

**destinationFileName** が指すファイルを表す FileInfor オブジェクト

## 参照

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
