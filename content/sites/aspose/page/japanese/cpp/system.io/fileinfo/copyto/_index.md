---
title: "System::IO::FileInfo::CopyTo メソッド"
linktitle: "CopyTo"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::FileInfo::CopyTo メソッド。現在のオブジェクトが表すファイルを指定された場所へコピーします。宛先ファイルが既に存在する場合、コピーは C++ で失敗します。"
type: docs
weight: 300
url: /ja/cpp/system.io/fileinfo/copyto/
---
## FileInfo::CopyTo(const String\&) method


現在のオブジェクトが表すファイルを指定された場所へコピーします。宛先ファイルが既に存在する場合、コピーは失敗します。

```cpp
FileInfoPtr System::IO::FileInfo::CopyTo(const String &destFileName)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| destFileName | const String\& | 宛先ファイル名 |

### ReturnValue

コピーを表す [FileInfo](../) オブジェクト

## 参照

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileInfo::CopyTo(const String\&, bool) method


現在のオブジェクトが表すファイルを指定された場所へコピーします。パラメータで既存の宛先ファイルを上書きするかどうかを指定します。

```cpp
FileInfoPtr System::IO::FileInfo::CopyTo(const String &destFileName, bool overwrite)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| destFileName | const String\& | 宛先ファイル名 |
| 上書き | bool | 既存の宛先ファイルを上書きすべき場合は true、宛先ファイルが既に存在する場合にコピーを失敗させるべき場合は false |

### ReturnValue

コピーを表す [FileInfo](../) オブジェクト

## 参照

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
