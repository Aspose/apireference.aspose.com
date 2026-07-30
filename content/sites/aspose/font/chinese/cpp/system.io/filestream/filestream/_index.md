---
title: "System::IO::FileStream::FileStream 构造函数"
linktitle: "FileStream"
second_title: "Aspose.Font 适用于 C++"
description: "如何在 C++ 中使用 System::IO::FileStream 类的 FileStream 构造函数。"
type: docs
weight: 100
url: /zh/cpp/system.io/filestream/filestream/
---
## FileStream::FileStream(const FileStream\&) constructor




```cpp
System::IO::FileStream::FileStream(const FileStream &)=delete
```

## 另见

* Class [FileStream](../)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileStream::FileStream(const String\&, FileMode) constructor


构造一个新的 [FileStream](../) 类实例，并使用指定的参数进行初始化。

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 路径 | const String\& | 要打开的文件路径。 |
| mode | FileMode | 指定打开文件的模式。 |

## 另见

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileStream::FileStream(const String\&, FileMode, FileAccess, FileShare, int32_t, bool) constructor


构造一个新的 [FileStream](../) 类实例，并使用指定的参数进行初始化。

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode, FileAccess access, FileShare share, int32_t buffer_size, bool useAsync)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 路径 | const String\& | 要打开的文件路径。 |
| mode | FileMode | 指定打开文件的模式。 |
| 访问 | FileAccess | 请求的访问类型。 |
| share | FileShare | 其他 [FileStream](../) 对象对已打开文件的访问类型。 |
| buffer_size | int32_t | 读取和写入操作期间缓冲的字节数。 |
| useAsync | bool | 指定是使用异步 I/O 还是同步 I/O。 |
## 备注



底层操作系统可能不支持异步 I/O。

## 另见

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileStream::FileStream(const String\&, FileMode, FileAccess, FileShare, int32_t, FileOptions) constructor


构造一个新的 [FileStream](../) 类实例，并使用指定的参数进行初始化。

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode, FileAccess access, FileShare share=FileShare::Read, int32_t buffer_size=DefaultBufferSize, FileOptions options=FileOptions::SequentialScan)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 路径 | const String\& | 要打开的文件路径。 |
| mode | FileMode | 指定打开文件的模式。 |
| 访问 | FileAccess | 请求的访问类型。 |
| share | FileShare | 其他 [FileStream](../) 对象对已打开文件的访问类型。 |
| buffer_size | int32_t | 读取和写入操作期间缓冲的字节数。 |
| 选项 | FileOptions | 其他选项。 |

## 另见

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Enum [FileOptions](../../fileoptions/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
