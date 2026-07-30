---
title: "System::IO::File::Open 方法"
linktitle: "Open"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::File::Open 方法。以指定模式打开指定文件用于读取和写入，并且在 C++ 中不共享。"
type: docs
weight: 1900
url: /zh/cpp/system.io/file/open/
---
## File::Open(const String\&, FileMode) method


以指定模式打开指定文件进行读写，并且不共享。

```cpp
static FileStreamPtr System::IO::File::Open(const String &path, FileMode mode)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 路径 | const String\& | 要打开的文件路径 |
| mode | FileMode | 指定打开文件的模式 |

### ReturnValue

一个与已打开文件关联的 [FileStream](../../filestream/) 对象

## 另见

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## File::Open(const String\&, FileMode, FileAccess, FileShare) method


以指定模式打开指定文件，使用指定的访问类型和共享选项。

```cpp
static FileStreamPtr System::IO::File::Open(const String &path, FileMode mode, FileAccess access, FileShare share=FileShare::None)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 路径 | const String\& | 要打开的文件路径 |
| mode | FileMode | 指定打开文件的模式 |
| 访问 | FileAccess | 请求的访问类型 |
| share | FileShare | 其他 [FileStream](../../filestream/) 对象对已打开文件的访问类型 |

### ReturnValue

一个与已打开文件关联的 [FileStream](../../filestream/) 对象

## 另见

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
