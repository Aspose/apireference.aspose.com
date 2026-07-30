---
title: "System::IO::FileSystemInfo 类"
linktitle: "FileSystemInfo"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::FileSystemInfo 类。FileInfo 和 DirectoryInfo 的基类。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1600
url: /zh/cpp/system.io/filesysteminfo/
---
## FileSystemInfo class


用于 [FileInfo](../fileinfo/) 和 [DirectoryInfo](../directoryinfo/) 的基类。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class FileSystemInfo : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Delete](./delete/)() | 删除当前对象所表示的实体。 |
| virtual [Finalize](./finalize/)() | 不执行任何操作。 |
| [get_Attributes](./get_attributes/)() | 返回当前对象所表示实体的属性。 |
| [get_CreationTime](./get_creationtime/)() | 返回当前对象所表示实体的创建时间（本地时间）。 |
| [get_CreationTimeUtc](./get_creationtimeutc/)() | 返回当前对象所表示实体的创建时间（UTC 时间）。 |
| virtual [get_Exists](./get_exists/)() | 确定当前对象所表示路径引用的实体是否存在。 |
| [get_Extension](./get_extension/)() | 返回当前对象所表示文件的扩展名。 |
| virtual [get_FullName](./get_fullname/)() | 返回当前对象所表示实体的完整名称（包括路径）。 |
| [get_LastAccessTime](./get_lastaccesstime/)() | 返回当前对象所表示实体的最后访问时间（本地时间）。 |
| [get_LastAccessTimeUtc](./get_lastaccesstimeutc/)() | 返回当前对象所表示实体的最后访问时间（UTC 时间）。 |
| [get_LastWriteTime](./get_lastwritetime/)() | 返回当前对象表示的实体的最后写入时间（本地时间）。 |
| [get_LastWriteTimeUtc](./get_lastwritetimeutc/)() | 返回当前对象表示的实体的最后写入时间（UTC 时间）。 |
| virtual [get_Name](./get_name/)() | 返回当前对象表示的实体的名称。 |
| [Refresh](./refresh/)() | 刷新当前对象的状态。 |
| [set_Attributes](./set_attributes/)(FileAttributes) | 在当前对象表示的实体上设置指定的属性。 |
| [set_CreationTime](./set_creationtime/)(DateTime) | 将当前对象表示的实体的创建时间设置为本地时间。 |
| [set_CreationTimeUtc](./set_creationtimeutc/)(DateTime) | 将当前对象表示的实体的创建时间设置为 UTC 时间。 |
| [set_LastAccessTime](./set_lastaccesstime/)(DateTime) | 将当前对象表示的实体的最后访问时间设置为本地时间。 |
| [set_LastAccessTimeUtc](./set_lastaccesstimeutc/)(DateTime) | 将当前对象表示的实体的最后访问时间设置为 UTC 时间。 |
| [set_LastWriteTime](./set_lastwritetime/)(DateTime) | 将当前对象表示的实体的最后写入时间设置为本地时间。 |
| [set_LastWriteTimeUtc](./set_lastwritetimeutc/)(DateTime) | 将当前对象表示的实体的最后写入时间设置为 UTC 时间。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
