---
title: "System::IO::FileInfo::CopyTo method"
linktitle: "CopyTo"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::FileInfo::CopyTo 方法。将当前对象所表示的文件复制到指定位置。如果目标文件已存在，复制将在 C++ 中失败。"
type: docs
weight: 300
url: /zh/cpp/system.io/fileinfo/copyto/
---
## FileInfo::CopyTo(const String\&) method


将当前对象表示的文件复制到指定位置。如果目标文件已存在，复制将失败。

```cpp
FileInfoPtr System::IO::FileInfo::CopyTo(const String &destFileName)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| destFileName | const String\& | 目标文件名 |

### ReturnValue

表示副本的 [FileInfo](../) 对象

## 另见

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileInfo::CopyTo(const String\&, bool) method


将当前对象表示的文件复制到指定位置。参数指定是否应覆盖已存在的目标文件。

```cpp
FileInfoPtr System::IO::FileInfo::CopyTo(const String &destFileName, bool overwrite)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| destFileName | const String\& | 目标文件名 |
| 覆盖 | bool | 如果应覆盖已存在的目标文件则为 True，若目标文件已存在且复制应失败则为 false |

### ReturnValue

表示副本的 [FileInfo](../) 对象

## 另见

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
