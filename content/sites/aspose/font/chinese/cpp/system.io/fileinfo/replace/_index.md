---
title: "System::IO::FileInfo::Replace method"
linktitle: "替换"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::FileInfo::Replace 方法。用当前 FileInfo 对象所表示的文件替换指定目标文件的内容，并在 C++ 中创建被替换文件的备份。"
type: docs
weight: 2000
url: /zh/cpp/system.io/fileinfo/replace/
---
## FileInfo::Replace(const String\&, const String\&) method


用当前 [FileInfo](../) 对象表示的文件替换指定目标文件的内容，并创建被替换文件的备份。

```cpp
FileInfoPtr System::IO::FileInfo::Replace(const String &destinationFileName, const String &destinationBackupFileName)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| destinationFileName | const String\& | 要替换的文件名 |
| destinationBackupFileName | const String\& | 备份文件的名称 |

### ReturnValue

一个表示由 **destinationFileName** 指向的文件的 FileInfor 对象

## 另见

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileInfo::Replace(const String\&, const String\&, bool) method


用当前 [FileInfo](../) 对象表示的文件替换指定目标文件的内容，并创建被替换文件的备份。

```cpp
FileInfoPtr System::IO::FileInfo::Replace(const String &destinationFileName, const String &destinationBackupFileName, bool ignoreMetadataErrors)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| destinationFileName | const String\& | 要替换的文件名 |
| destinationBackupFileName | const String\& | 备份文件的名称 |
| ignoreMetadataErrors | bool | 指定是否应忽略从被替换文件合并到替换文件的错误 (true) 或不忽略 (false) |

### ReturnValue

一个表示由 **destinationFileName** 指向的文件的 FileInfor 对象

## 另见

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
