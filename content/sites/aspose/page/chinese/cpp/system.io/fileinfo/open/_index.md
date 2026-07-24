---
title: "System::IO::FileInfo::Open 方法"
linktitle: "Open"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::FileInfo::Open 方法。打开当前对象所表示的文件，以指定模式进行读写，并且在 C++ 中不共享。"
type: docs
weight: 1600
url: /zh/cpp/system.io/fileinfo/open/
---
## FileInfo::Open(FileMode) method


以指定模式打开当前对象表示的文件进行读写，并且不共享。

```cpp
FileStreamPtr System::IO::FileInfo::Open(FileMode mode)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| mode | FileMode | 指定打开文件的模式 |

### ReturnValue

一个与当前对象所表示的文件关联的 [FileStream](../../filestream/) 对象

## 另见

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Enum [FileMode](../../filemode/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileInfo::Open(FileMode, FileAccess) method


以指定模式和指定访问类型打开当前对象表示的文件，并且不共享。

```cpp
FileStreamPtr System::IO::FileInfo::Open(FileMode mode, FileAccess access)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| mode | FileMode | 指定打开文件的模式 |
| 访问 | FileAccess | 请求的访问类型 |

### ReturnValue

一个与当前对象所表示的文件关联的 [FileStream](../../filestream/) 对象

## 另见

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileInfo::Open(FileMode, FileAccess, FileShare) method


以指定模式、指定访问类型和共享选项打开当前对象表示的文件。

```cpp
FileStreamPtr System::IO::FileInfo::Open(FileMode mode, FileAccess access, FileShare share)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| mode | FileMode | 指定打开文件的模式 |
| 访问 | FileAccess | 请求的访问类型 |
| share | FileShare | 其他 [FileStream](../../filestream/) 对象对已打开文件的访问类型 |

### ReturnValue

一个与当前对象所表示的文件关联的 [FileStream](../../filestream/) 对象

## 另见

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
