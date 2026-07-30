---
title: "System::IO::Path 类"
linktitle: "路径"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::Path 类。提供用于操作路径的方法。这是一个没有实例服务的静态类型。您绝不应以任何方式在 C++ 中创建其实例。"
type: docs
weight: 1900
url: /zh/cpp/system.io/path/
---
## Path class


提供用于操作路径的方法。这是一个没有实例服务的静态类型。绝不应以任何方式创建其实例。

```cpp
class Path
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [ChangeExtension](./changeextension/)(const String\&, const String\&) | 更改指定文件路径中的扩展名。 |
| static [CheckPath](./checkpath/)(const String\&, const String\&, bool) | 通过检查指定路径是否包含无效字符来确定其是否有效。如果路径包含无效字符，将抛出异常。 |
| static [Combine](./combine/)(const ArrayPtr\<String\>\&) | 将指定的路径段组合成单一路径，如有必要在段之间插入目录分隔符字符。 |
| static [Combine](./combine/)(const String\&, const String\&) | 将两个指定的路径段组合成单一路径，如有必要在段之间插入目录分隔符字符。 |
| static [Combine](./combine/)(const String\&, const String\&, const String\&) | 将三个指定的路径段组合成单一路径，如有必要在段之间插入目录分隔符字符。 |
| static [Combine](./combine/)(const String\&, const String\&, const String\&, const String\&) | 将四个指定的路径段组合成单一路径，如有必要在段之间插入目录分隔符字符。 |
| static [GetDirectoryName](./getdirectoryname/)(const String\&) | 返回由指定路径引用的目录名称。 |
| static [GetExtension](./getextension/)(const String\&) | 返回由指定路径引用的文件的扩展名。 |
| static [GetFileName](./getfilename/)(const String\&) | 返回由指定路径引用的文件名称。 |
| static [GetFileNameWithoutExtension](./getfilenamewithoutextension/)(const String\&) | 返回由指定路径引用的文件的无扩展名名称。 |
| static [GetFullPath](./getfullpath/)(const String\&) | 将指定路径转换为绝对路径。 |
| static [GetInvalidFileNameChars](./getinvalidfilenamechars/)() | 返回一个包含文件名中不允许使用的字符的数组。 |
| static [GetInvalidPathChars](./getinvalidpathchars/)() | 返回一个包含路径名中不允许使用的字符的数组。 |
| static [GetPathRoot](./getpathroot/)(const String\&) | 返回指定路径的根目录。 |
| static [GetRandomFileName](./getrandomfilename/)() | 返回随机生成的文件名。 |
| static [GetTempFileName_](./gettempfilename_/)() | 创建一个具有唯一名称的新文件并返回其完整路径。 |
| static [GetTempFileNameSafe](./gettempfilenamesafe/)() | 创建一个具有唯一名称的新文件并返回其完整路径。是 [GetTempFileName_()](./gettempfilename_/) 方法的同义词。 |
| static [GetTempPath](./gettemppath/)() | 返回当前用户临时目录的路径。 |
| static [HasExtension](./hasextension/)(const String\&) | 确定指定的路径是否引用了带有扩展名的文件。 |
| static [IsPathRooted](./ispathrooted/)(const String\&) | 确定指定的路径是否包含根目录。 |
| static [NormalizePath](./normalizepath/)(const String\&) | 规范化指定的路径。 |
| static [ToBoost](./toboost/)(const String\&) | 返回一个 boost::filesystem::path 类的实例，表示指定的路径。 |
| static [ToString](./tostring/)(const boost::filesystem::path\&) | 返回指定 Boost 路径对象的字符串表示。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [AltDirectorySeparatorChar](./altdirectoryseparatorchar/) | 用于在路径中分隔目录层级的备用字符。 |
| static [DirectorySeparatorChar](./directoryseparatorchar/) | 用于在路径中分隔目录层级的字符。 |
| static [PathSeparator](./pathseparator/) | 用于在环境变量中分隔路径字符串的分隔符字符。 |
| static [VolumeSeparatorChar](./volumeseparatorchar/) | 卷分隔符字符。 |
## 备注



```cpp
#include "system/io/path.h"
#include <iostream>

int main()
{
  using namespace System::IO;

  // 生成随机文件名。
  auto filename = Path::GetRandomFileName();

  // 打印文件名信息。
  std::cout <<
    "Filename: " << Path::GetFileName(filename) << std::endl <<
    "Filename w/o an extension: " << Path::GetFileNameWithoutExtension(filename) << std::endl <<
    "Extension: " << Path::GetExtension(filename) << std::endl;

  return 0;
}
/*
This code example produces the following output:
Filename: qhuzkyqv.y6p
Filename w/o an extension: qhuzkyqv
Extension: .y6p
*/
```

## 另见

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
