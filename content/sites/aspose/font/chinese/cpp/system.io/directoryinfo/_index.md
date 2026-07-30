---
title: "System::IO::DirectoryInfo 类"
linktitle: "DirectoryInfo"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::DirectoryInfo 类。表示文件系统路径、该路径所指的目录，并提供用于操作目录的实例方法。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 1200
url: /zh/cpp/system.io/directoryinfo/
---
## DirectoryInfo class


表示文件系统路径、该路径所指的目录，并提供用于操作目录的实例方法。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class DirectoryInfo : public System::IO::FileSystemInfo
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Create](./create/)() | 在当前对象表示的路径上创建目录。 |
| [CreateSubdirectory](./createsubdirectory/)(const String\&) | 在指定路径上创建子目录。 |
| [Delete](./delete/)() override | 如果目录为空，则删除当前对象表示的路径所指的目录。 |
| [Delete](./delete/)(bool) | 删除当前对象表示的路径所指的目录。参数指定当目录非空时是否递归删除其内容。 |
| [DirectoryInfo](./directoryinfo/)(const String\&) | 在指定路径上构造 [DirectoryInfo](./) 类的实例。 |
| [EnumerateDirectories](./enumeratedirectories/)() | 返回一个可枚举集合，包含当前对象表示的目录中所有的子目录。 |
| [EnumerateDirectories](./enumeratedirectories/)(const String\&) | 在当前对象表示的目录中搜索满足指定搜索条件的目录。 |
| [EnumerateDirectories](./enumeratedirectories/)(const String\&, SearchOption) | 在当前对象表示的目录或以该目录为根的整个目录树中搜索满足指定搜索条件的目录。 |
| [EnumerateFiles](./enumeratefiles/)() | 返回一个可枚举集合，包含当前对象表示的目录中所有的文件。 |
| [EnumerateFiles](./enumeratefiles/)(const String\&) | 在当前对象表示的目录中搜索满足指定搜索条件的文件。 |
| [EnumerateFiles](./enumeratefiles/)(const String\&, SearchOption) | 在当前对象表示的目录或以该目录为根的整个目录树中搜索满足指定搜索条件的文件。 |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)() | 返回一个可枚举集合，包含当前对象表示的目录中所有的文件和子目录。 |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)(const String\&) | 在当前对象表示的目录中搜索满足指定搜索条件的文件和目录。 |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)(const String\&, SearchOption) | 在当前对象表示的目录或以该目录为根的整个目录树中搜索满足指定搜索条件的文件和目录。 |
| [get_Exists](./get_exists/)() override | 确定当前对象表示的路径是否指向已存在的目录。 |
| [get_Name](./get_name/)() override | 返回当前对象表示的路径所指代实体的名称。 |
| [get_Parent](./get_parent/)() | 返回一个指向 [DirectoryInfo](./) 对象的共享指针，该对象表示指向当前对象表示的目录的父目录的路径。 |
| [get_Root](./get_root/)() | 返回一个指向 [DirectoryInfo](./) 对象的共享指针，该对象表示指向当前对象表示的目录的根目录的路径。 |
| [GetDirectories](./getdirectories/)() | 返回一个数组，包含指向表示当前对象表示的目录中所有子目录的 [DirectoryInfo](./) 对象的共享指针。 |
| [GetDirectories](./getdirectories/)(const String\&) | 在当前对象表示的目录中搜索满足指定搜索条件的目录。 |
| [GetDirectories](./getdirectories/)(const String\&, SearchOption) | 在当前对象表示的目录或以该目录为根的整个目录树中搜索满足指定搜索条件的目录。 |
| [GetFiles](./getfiles/)() | 返回一个数组，包含指向表示当前对象表示的目录中所有目录的 [FileInfo](../fileinfo/) 对象的共享指针。 |
| [GetFiles](./getfiles/)(const String\&) | 在当前对象表示的目录中搜索满足指定搜索条件的文件。 |
| [GetFiles](./getfiles/)(const String\&, SearchOption) | 在当前对象表示的目录或以该目录为根的整个目录树中搜索满足指定搜索条件的文件。 |
| [GetFileSystemInfos](./getfilesysteminfos/)() | 返回一个数组，包含指向表示当前对象表示的目录中所有文件和目录的 [FileSystemInfo](../filesysteminfo/) 对象的共享指针。 |
| [GetFileSystemInfos](./getfilesysteminfos/)(const String\&) | 在当前对象表示的目录中搜索满足指定搜索条件的文件和目录。 |
| [GetFileSystemInfos](./getfilesysteminfos/)(const String\&, SearchOption) | 在当前对象表示的目录或以该目录为根的整个目录树中搜索满足指定搜索条件的文件和目录。 |
| [MoveTo](./moveto/)(const String\&) | 将当前对象表示的目录及其所有内容移动到指定位置。 |
| [ToString](./tostring/)() const override | 返回一个包含当前对象表示的路径的字符串。 |
## 另见

* Class [FileSystemInfo](../filesysteminfo/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
