---
title: "System::IO::DirectoryInfo::GetFileSystemInfos メソッド"
linktitle: "GetFileSystemInfos"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::DirectoryInfo::GetFileSystemInfos メソッド。現在のオブジェクトが表すディレクトリ内にあるすべてのファイルとディレクトリを表す FileSystemInfo オブジェクトへの共有ポインタを含む配列を返します（C++）。"
type: docs
weight: 1400
url: /ja/cpp/system.io/directoryinfo/getfilesysteminfos/
---
## DirectoryInfo::GetFileSystemInfos() method


現在のオブジェクトが表すディレクトリ内にあるすべてのファイルとディレクトリを表す [FileSystemInfo](../../filesysteminfo/) オブジェクトへの共有ポインタを含む配列を返します。

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos()
```

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetFileSystemInfos(const String\&) method


現在のオブジェクトが表すディレクトリ内で、指定された検索条件を満たすファイルとディレクトリを検索します。

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos(const String &searchPattern)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| searchPattern | const String\& | 検索対象となるファイルおよびディレクトリの名前パターン |

### ReturnValue

名前が **searchPattern** と一致する見つかったファイルとディレクトリを表す [FileSystemInfo](../../filesysteminfo/) オブジェクトへの共有ポインタの配列

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetFileSystemInfos(const String\&, SearchOption) method


現在のオブジェクトが表すディレクトリ、またはそのディレクトリをルートとするディレクトリツリー全体の中で、指定された検索条件を満たすファイルとディレクトリを検索します。

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos(const String &searchPattern, SearchOption searchOption)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| searchPattern | const String\& | 検索対象となるファイルおよびディレクトリの名前パターン |
| searchOption | SearchOption | 検索を現在のオブジェクトが表すディレクトリのみで実行するか、またはそのディレクトリをルートとするディレクトリツリー全体で実行するかを指定します。 |

### ReturnValue

名前が **searchPattern** と一致する見つかったファイルとディレクトリを表す [FileSystemInfo](../../filesysteminfo/) オブジェクトへの共有ポインタの配列

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
