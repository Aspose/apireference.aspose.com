---
title: "System::IO::FileInfo 类"
linktitle: "FileInfo"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::FileInfo 类。表示指向文件的路径以及该路径所指的文件，并提供用于操作它的方法。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 1400
url: /zh/cpp/system.io/fileinfo/
---
## FileInfo class


表示指向文件的路径以及该路径所指的文件，并提供用于操作它的方法。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class FileInfo : public System::IO::FileSystemInfo
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AppendText](./appendtext/)() | 以 UTF-8 编码打开当前对象表示的文件进行文本写入，使用 'Append'（追加）模式且不共享。 |
| [CopyTo](./copyto/)(const String\&) | 将当前对象表示的文件复制到指定位置。如果目标文件已存在，复制将失败。 |
| [CopyTo](./copyto/)(const String\&, bool) | 将当前对象表示的文件复制到指定位置。参数指定是否应覆盖已存在的目标文件。 |
| [Create](./create/)() | 在当前对象表示的路径指定的位置创建文件，并以截断模式打开进行读写，且不共享。 |
| [CreateText](./createtext/)() | 在当前对象表示的路径指定的位置创建文件，并以 UTF-8 编码打开进行文本写入，且不共享。 |
| [Decrypt](./decrypt/)() | 未实现。 |
| [Delete](./delete/)() override | 删除当前对象表示的文件。 |
| [Encrypt](./encrypt/)() | 未实现。 |
| [FileInfo](./fileinfo/)(const String\&) | 构造一个新的 [FileInfo](./) 类实例，表示指定的文件。 |
| [get_Directory](./get_directory/)() | 返回一个 [DirectoryInfo](../directoryinfo/) 对象，表示当前对象所表示的文件所在的目录。 |
| [get_DirectoryName](./get_directoryname/)() | 返回当前对象所表示的文件所在目录的完整名称。 |
| [get_Exists](./get_exists/)() override | 返回指示文件是否存在的值。 |
| [get_IsReadOnly](./get_isreadonly/)() | 返回指示只读属性是否已设置的值。 |
| [get_Length](./get_length/)() | 返回文件的字节大小。 |
| [get_Name](./get_name/)() override | 返回文件的名称。 |
| [MoveTo](./moveto/)(const String\&) | 将当前对象表示的文件移动到指定位置。 |
| [Open](./open/)(FileMode) | 以指定模式打开当前对象表示的文件，进行读写且不共享。 |
| [Open](./open/)(FileMode, FileAccess) | 以指定模式和指定访问类型打开当前对象表示的文件，且不共享。 |
| [Open](./open/)(FileMode, FileAccess, FileShare) | 以指定模式、指定访问类型和共享选项打开当前对象表示的文件。 |
| [OpenRead](./openread/)() | 以“Open”模式以共享读取方式，仅打开当前对象表示的文件进行读取。 |
| [OpenText](./opentext/)() | 以 UTF-8 编码且不共享的方式，打开当前对象表示的路径所指向的现有文件，以读取文本。 |
| [OpenWrite](./openwrite/)() | 以“OpenOrCreate”模式且不共享的方式，仅打开当前对象表示的文件进行写入。 |
| [Replace](./replace/)(const String\&, const String\&) | 用当前 [FileInfo](./) 对象表示的文件替换指定目标文件的内容，并创建被替换文件的备份。 |
| [Replace](./replace/)(const String\&, const String\&, bool) | 用当前 [FileInfo](./) 对象表示的文件替换指定目标文件的内容，并创建被替换文件的备份。 |
| [set_IsReadOnly](./set_isreadonly/)(bool) | 设置或取消文件的只读属性。 |
| [ToString](./tostring/)() const override | 返回当前对象表示的路径。 |
## 另见

* Class [FileSystemInfo](../filesysteminfo/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
