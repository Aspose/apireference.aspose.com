---
title: "System::IO::FileInfo::Open メソッド"
linktitle: "Open"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::FileInfo::Open メソッド。現在のオブジェクトが表すファイルを、指定されたモードで読み取りおよび書き込み用に、共有なしで C++ で開きます。"
type: docs
weight: 1600
url: /ja/cpp/system.io/fileinfo/open/
---
## FileInfo::Open(FileMode) method


現在のオブジェクトが表すファイルを、指定されたモードで読み書き用に、共有なしで開きます。

```cpp
FileStreamPtr System::IO::FileInfo::Open(FileMode mode)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| mode | FileMode | ファイルを開くモードを指定します |

### ReturnValue

現在のオブジェクトが表すファイルに関連付けられた [FileStream](../../filestream/) オブジェクト

## 参照

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Enum [FileMode](../../filemode/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileInfo::Open(FileMode, FileAccess) method


現在のオブジェクトが表すファイルを、指定されたモードとアクセス種別で、共有なしで開きます。

```cpp
FileStreamPtr System::IO::FileInfo::Open(FileMode mode, FileAccess access)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| mode | FileMode | ファイルを開くモードを指定します |
| アクセス | FileAccess | 要求されたアクセス種別 |

### ReturnValue

現在のオブジェクトが表すファイルに関連付けられた [FileStream](../../filestream/) オブジェクト

## 参照

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileInfo::Open(FileMode, FileAccess, FileShare) method


現在のオブジェクトが表すファイルを、指定されたモード、アクセス種別、共有オプションで開きます。

```cpp
FileStreamPtr System::IO::FileInfo::Open(FileMode mode, FileAccess access, FileShare share)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| mode | FileMode | ファイルを開くモードを指定します |
| アクセス | FileAccess | 要求されたアクセス種別 |
| share | FileShare | 他の [FileStream](../../filestream/) オブジェクトが開かれたファイルに対して持つアクセスの種類 |

### ReturnValue

現在のオブジェクトが表すファイルに関連付けられた [FileStream](../../filestream/) オブジェクト

## 参照

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
