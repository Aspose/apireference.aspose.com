---
title: "System::IO::DirectoryInfo::EnumerateFiles メソッド"
linktitle: "EnumerateFiles"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::DirectoryInfo::EnumerateFiles メソッド。C++ において、現在のオブジェクトが表すディレクトリ内にあるすべてのファイルを含む列挙可能なコレクションを返します。"
type: docs
weight: 600
url: /ja/cpp/system.io/directoryinfo/enumeratefiles/
---
## DirectoryInfo::EnumerateFiles() method


現在のオブジェクトが表すディレクトリ内にあるすべてのファイルを含む列挙可能なコレクションを返します。

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles()
```

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateFiles(const String\&) method


現在のオブジェクトが表すディレクトリ内で、指定された検索条件を満たすファイルを検索します。

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles(const String &searchPattern)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| searchPattern | const String\& | 検索対象ファイルの名前パターン |

### ReturnValue

名前が **searchPattern** と一致する見つかったファイルを表す [FileInfo](../../fileinfo/) オブジェクトへの共有ポインタの列挙可能なコレクション

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateFiles(const String\&, SearchOption) method


現在のオブジェクトが表すディレクトリ、またはそのディレクトリをルートとするディレクトリツリー全体の中で、指定された検索条件を満たすファイルを検索します。

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles(const String &searchPattern, SearchOption searchOption)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| searchPattern | const String\& | 検索対象ファイルの名前パターン |
| searchOption | SearchOption | 検索を現在のオブジェクトが表すディレクトリのみで実行するか、またはそのディレクトリをルートとするディレクトリツリー全体で実行するかを指定します。 |

### ReturnValue

名前が **searchPattern** と一致する見つかったファイルを表す [FileInfo](../../fileinfo/) オブジェクトへの共有ポインタの列挙可能なコレクション

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
