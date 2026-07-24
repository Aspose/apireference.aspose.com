---
title: "System::IO::DirectoryInfo::GetFiles メソッド"
linktitle: "GetFiles"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::DirectoryInfo::GetFiles メソッド。現在のオブジェクトが表すディレクトリ内にあるすべてのディレクトリを表す FileInfo オブジェクトへの共有ポインタを含む配列を返します（C++）。"
type: docs
weight: 1300
url: /ja/cpp/system.io/directoryinfo/getfiles/
---
## DirectoryInfo::GetFiles() method


現在のオブジェクトが表すディレクトリ内にあるすべてのディレクトリを表す [FileInfo](../../fileinfo/) オブジェクトへの共有ポインタを含む配列を返します。

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles()
```

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetFiles(const String\&) method


現在のオブジェクトが表すディレクトリ内で、指定された検索条件を満たすファイルを検索します。

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles(const String &searchPattern)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| searchPattern | const String\& | 検索対象ファイルの名前パターン |

### ReturnValue

名前が **searchPattern** と一致する見つかったファイルを表す [FileInfo](../../fileinfo/) オブジェクトへの共有ポインタの配列

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetFiles(const String\&, SearchOption) method


現在のオブジェクトが表すディレクトリ、またはそのディレクトリをルートとするディレクトリツリー全体の中で、指定された検索条件を満たすファイルを検索します。

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles(const String &searchPattern, SearchOption searchOption)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| searchPattern | const String\& | 検索対象ファイルの名前パターン |
| searchOption | SearchOption | 検索を現在のオブジェクトが表すディレクトリのみで実行するか、またはそのディレクトリをルートとするディレクトリツリー全体で実行するかを指定します。 |

### ReturnValue

名前が **searchPattern** と一致する見つかったファイルを表す [FileInfo](../../fileinfo/) オブジェクトへの共有ポインタの配列

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
