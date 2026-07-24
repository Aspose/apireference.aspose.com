---
title: "System::IO::DirectoryInfo::EnumerateFileSystemInfos メソッド"
linktitle: "EnumerateFileSystemInfos"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::DirectoryInfo::EnumerateFileSystemInfos メソッド。現在のオブジェクトが表すディレクトリ内にあるすべてのファイルとディレクトリを含む列挙可能なコレクションを返します（C++）。"
type: docs
weight: 700
url: /ja/cpp/system.io/directoryinfo/enumeratefilesysteminfos/
---
## DirectoryInfo::EnumerateFileSystemInfos() method


現在のオブジェクトが表すディレクトリ内にあるすべてのファイルとディレクトリを含む列挙可能なコレクションを返します。

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos()
```

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateFileSystemInfos(const String\&) method


現在のオブジェクトが表すディレクトリ内で、指定された検索条件を満たすファイルとディレクトリを検索します。

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos(const String &searchPattern)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| searchPattern | const String\& | 検索対象となるファイルおよびディレクトリの名前パターン |

### ReturnValue

[FileSystemInfo](../../filesysteminfo/) オブジェクトへの共有ポインタの列挙可能なコレクションで、名前が **searchPattern** と一致する見つかったファイルとディレクトリを表します。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateFileSystemInfos(const String\&, SearchOption) method


現在のオブジェクトが表すディレクトリ、またはそのディレクトリをルートとするディレクトリツリー全体の中で、指定された検索条件を満たすファイルとディレクトリを検索します。

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos(const String &searchPattern, SearchOption searchOption)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| searchPattern | const String\& | 検索対象となるファイルおよびディレクトリの名前パターン |
| searchOption | SearchOption | 検索を現在のオブジェクトが表すディレクトリのみで実行するか、またはそのディレクトリをルートとするディレクトリツリー全体で実行するかを指定します。 |

### ReturnValue

[FileSystemInfo](../../filesysteminfo/) オブジェクトへの共有ポインタの列挙可能なコレクションで、名前が **searchPattern** と一致する見つかったファイルとディレクトリを表します。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
