---
title: "System::IO::DirectoryInfo::EnumerateDirectories メソッド"
linktitle: "EnumerateDirectories"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::DirectoryInfo::EnumerateDirectories メソッド。現在のオブジェクトが表すディレクトリ内にあるすべてのディレクトリを含む列挙可能なコレクションを返します（C++）。"
type: docs
weight: 500
url: /ja/cpp/system.io/directoryinfo/enumeratedirectories/
---
## DirectoryInfo::EnumerateDirectories() method


現在のオブジェクトが表すディレクトリ内にあるすべてのディレクトリを含む列挙可能なコレクションを返します。

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories()
```

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&) method


現在のオブジェクトが表すディレクトリ内で、指定された検索条件を満たすディレクトリを検索します。

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| searchPattern | const String\& | 検索対象ディレクトリの名前パターン |

### ReturnValue

**searchPattern** に一致する名前を持つ見つかったディレクトリを表す [DirectoryInfo](../) オブジェクトへの共有ポインタの列挙可能なコレクション

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&, SearchOption) method


現在のオブジェクトが表すディレクトリ、またはそのディレクトリをルートとするディレクトリツリー全体で、指定された検索条件を満たすディレクトリを検索します。

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern, SearchOption searchOption)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| searchPattern | const String\& | 検索対象ディレクトリの名前パターン |
| searchOption | SearchOption | 検索を現在のオブジェクトが表すディレクトリのみで実行するか、またはそのディレクトリをルートとするディレクトリツリー全体で実行するかを指定します。 |

### ReturnValue

**searchPattern** に一致する名前を持つ見つかったディレクトリを表す [DirectoryInfo](../) オブジェクトへの共有ポインタの列挙可能なコレクション

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
