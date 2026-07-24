---
title: "System::IO::DirectoryInfo::GetDirectories メソッド"
linktitle: "GetDirectories"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::DirectoryInfo::GetDirectories メソッド。C++ において、現在のオブジェクトが表すディレクトリ内にあるすべてのディレクトリを表す DirectoryInfo オブジェクトへの共有ポインタを含む配列を返します。"
type: docs
weight: 1200
url: /ja/cpp/system.io/directoryinfo/getdirectories/
---
## DirectoryInfo::GetDirectories() method


現在のオブジェクトが表すディレクトリ内にあるすべてのディレクトリを表す [DirectoryInfo](../) オブジェクトへの共有ポインタを含む配列を返します。

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories()
```

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&) method


現在のオブジェクトが表すディレクトリ内で、指定された検索条件を満たすディレクトリを検索します。

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| searchPattern | const String\& | 検索対象ディレクトリの名前パターン |

### ReturnValue

名前が **searchPattern** と一致する見つかったディレクトリを表す [DirectoryInfo](../) オブジェクトへの共有ポインタの配列

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&, SearchOption) method


現在のオブジェクトが表すディレクトリ、またはそのディレクトリをルートとするディレクトリツリー全体で、指定された検索条件を満たすディレクトリを検索します。

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern, SearchOption searchOption)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| searchPattern | const String\& | 検索対象ディレクトリの名前パターン |
| searchOption | SearchOption | 検索を現在のオブジェクトが表すディレクトリのみで実行するか、またはそのディレクトリをルートとするディレクトリツリー全体で実行するかを指定します。 |

### ReturnValue

名前が **searchPattern** と一致する見つかったディレクトリを表す [DirectoryInfo](../) オブジェクトへの共有ポインタの配列

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
