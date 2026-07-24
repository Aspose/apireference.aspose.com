---
title: "System::IO::File::Replace 方法"
linktitle: "替换"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::File::Replace 方法。在 C++ 中将一个文件的内容替换为另一个文件，并创建被替换文件的备份。"
type: docs
weight: 2700
url: /zh/cpp/system.io/file/replace/
---
## File::Replace method


用另一个文件替换一个文件的内容，并为被替换的文件创建备份。

```cpp
static void System::IO::File::Replace(const String &sourceFileName, const String &destinationFileName, const String &destinationBackupFileName, bool ignoreMetadataErrors=true)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| sourceFileName | const String\& | 要替换的文件名 |
| destinationFileName | const String\& | 要替换的文件名 |
| destinationBackupFileName | const String\& | 备份文件的名称 |
| ignoreMetadataErrors | bool | 指定是否应忽略从被替换文件合并到替换文件的错误（true）或不忽略（false） |

## 另见

* Class [String](../../../system/string/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
