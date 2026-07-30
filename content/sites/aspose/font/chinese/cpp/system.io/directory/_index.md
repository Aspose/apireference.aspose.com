---
title: "System::IO::Directory 类"
linktitle: "目录"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::Directory 类。包含用于操作目录的方法。这是一个没有实例服务的静态类型。您绝不应以任何方式在 C++ 中创建其实例。"
type: docs
weight: 1100
url: /zh/cpp/system.io/directory/
---
## Directory class


包含用于操作目录的方法。这是一个没有实例服务的静态类型。绝不应以任何方式创建其实例。

```cpp
class Directory
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [CreateDirectory_](./createdirectory_/)(const String\&) | 如果指定路径中的目录不存在，则创建所有目录。 |
| static [Delete](./delete/)(const String\&, bool) | 删除指定的文件或目录。不会抛出异常。 |
| static [EnumerateDirectories](./enumeratedirectories/)(const String\&, const String\&, SearchOption) | 在指定目录或以指定目录为根的整个目录树中搜索满足指定搜索条件的目录。 |
| static [EnumerateFiles](./enumeratefiles/)(const String\&, const String\&, SearchOption) | 在指定目录或以指定目录为根的整个目录树中搜索满足指定搜索条件的文件。 |
| static [EnumerateFileSystemEntries](./enumeratefilesystementries/)(const String\&, const String\&, SearchOption) | 在指定目录或以指定目录为根的整个目录树中搜索满足指定搜索条件的文件和目录。 |
| static [Exists](./exists/)(const String\&) | 确定指定路径是否指向现有目录。 |
| static [GetCreationTime](./getcreationtime/)(const String\&) | 以本地时间返回指定实体的创建时间。 |
| static [GetCreationTimeUtc](./getcreationtimeutc/)(const String\&) | 以 UTC 时间返回指定实体的创建时间。 |
| static [GetCurrentDirectory](./getcurrentdirectory/)() | 返回当前目录的完整名称（包括路径）。 |
| static [GetDirectories](./getdirectories/)(const String\&, const String\&, SearchOption) | 在指定目录或以指定目录为根的整个目录树中搜索满足指定搜索条件的目录。 |
| static [GetDirectoryRoot](./getdirectoryroot/)(const String\&) | 返回指定路径的根目录。 |
| static [GetFiles](./getfiles/)(const String\&, const String\&, SearchOption) | 在指定目录或以指定目录为根的整个目录树中搜索满足指定搜索条件的文件。 |
| static [GetFileSystemEntries](./getfilesystementries/)(const String\&, const String\&, SearchOption) | 在指定目录或以指定目录为根的整个目录树中搜索满足指定搜索条件的文件和目录。 |
| static [GetLastAccessTime](./getlastaccesstime/)(const String\&) | 以本地时间返回指定实体的最后访问时间。 |
| static [GetLastAccessTimeUtc](./getlastaccesstimeutc/)(const String\&) | 以 UTC 时间返回指定实体的最后访问时间。 |
| static [GetLastWriteTime](./getlastwritetime/)(const String\&) | 返回指定实体的最后写入时间（本地时间）。 |
| static [GetLastWriteTimeUtc](./getlastwritetimeutc/)(const String\&) | 返回指定实体的最后写入时间（UTC 时间）。 |
| static [GetLogicalDrives](./getlogicaldrives/)() | 未实现。 |
| static [GetParent](./getparent/)(const String\&) | 返回指向表示指定实体父目录的 [DirectoryInfo](../directoryinfo/) 对象的共享指针。 |
| static [Move](./move/)(const String\&, const String\&) | 将指定实体移动到新位置。如果要移动的实体是目录，则连同其所有内容一起移动。 |
| static [SetCreationTime](./setcreationtime/)(const String\&, DateTime) | 将指定实体的创建时间设置为本地时间。 |
| static [SetCreationTimeUtc](./setcreationtimeutc/)(const String\&, DateTime) | 将指定实体的创建时间设置为 UTC 时间。 |
| static [SetCurrentDirectory](./setcurrentdirectory/)(const String\&) | 设置当前目录。 |
| static [SetLastAccessTime](./setlastaccesstime/)(const String\&, DateTime) | 将指定实体的最后访问时间设置为本地时间。 |
| static [SetLastAccessTimeUtc](./setlastaccesstimeutc/)(const String\&, DateTime) | 将指定实体的最后访问时间设置为 UTC 时间。 |
| static [SetLastWriteTime](./setlastwritetime/)(const String\&, DateTime) | 将指定实体的最后写入时间设置为本地时间。 |
| static [SetLastWriteTimeUtc](./setlastwritetimeutc/)(const String\&, DateTime) | 将指定实体的最后写入时间设置为 UTC 时间。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [StringEnumerablePtr](./stringenumerableptr/) | 一个指向 IEnumerable 对象的共享指针别名，该对象枚举一组 [String](../../system/string/) 对象。 |
## 备注



```cpp
#include "system/io/directory.h"
#include "system/io/path.h"
#include "system/string.h"
#include <iostream>

void PrintMessage(const System::String &path)
{
  std::cout << "Directory '" << path << (System::IO::Directory::Exists(path) ? "' exists." : "' doesn't exist.") << std::endl;
}

int main()
{
  // 创建包含目录路径的字符串。
  System::String discPath(u"C:\\");
  System::String directoryPath(u"C:\\Some directory");
  auto tempPath = System::IO::Path::GetTempPath();

  // 检查目录是否存在。
  PrintMessage(discPath);
  PrintMessage(directoryPath);
  PrintMessage(tempPath);

  // 打印临时目录信息。
  std::cout <<
    "Creation Time: " << System::IO::Directory::GetCreationTime(tempPath) << std::endl <<
    "Last Access Time: " << System::IO::Directory::GetLastAccessTime(tempPath) << std::endl <<
    "Last Write Time: " << System::IO::Directory::GetLastWriteTime(tempPath) << std::endl;

  return 0;
}
/*
This code example produces the following output:
Directory 'C:\' exists.
Directory 'C:\Some directory' doesn't exist.
Directory 'C:\Users\lanor\AppData\Local\Temp\' exists.
Creation Time: 27.08.2021 14:21:42
Last Access Time: 07.10.2021 12:16:41
Last Write Time: 07.10.2021 12:16:41
*/
```

## 另见

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
