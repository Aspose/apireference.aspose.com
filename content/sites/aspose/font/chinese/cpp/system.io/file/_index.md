---
title: "System::IO::File 类"
linktitle: "File"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::File 类。提供用于操作文件的方法。这是一个没有实例服务的静态类型。您绝不应以任何方式在 C++ 中创建其实例。"
type: docs
weight: 1300
url: /zh/cpp/system.io/file/
---
## File class


提供用于操作文件的方法。这是一个没有实例服务的静态类型。绝不应以任何方式创建其实例。

```cpp
class File
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [AppendAllLines](./appendalllines/)(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) | 使用指定的编码，将指定字符串集合中的字符串逐行追加到指定文件中，每个字符串写入新的一行。如果指定的文件不存在，则会创建该文件。写入所有字符串后关闭文件。 |
| static [AppendAllText](./appendalltext/)(const String\&, const String\&, const EncodingPtr\&) | 使用指定的编码，将指定字符串追加到指定文件。 |
| static [AppendText](./appendtext/)(const String\&) | 创建一个 [StreamWriter](../streamwriter/) 对象，以 UTF-8 编码将文本追加到指定文件。如果指定的文件不存在，则会创建它。 |
| static [Copy](./copy/)(const String\&, const String\&, bool) | 将指定文件复制到指定位置。如果目标文件已存在，则通过参数指定是否覆盖。 |
| static [Create](./create/)(const String\&, int32_t, FileOptions) | 创建一个新文件（或覆盖已有文件），并使用指定的缓冲区大小和选项以读写方式打开它。 |
| static [CreateText](./createtext/)(const String\&) | 创建一个新文件或打开已有文件，以写入 UTF-8 编码的文本。 |
| static [Decrypt](./decrypt/)(const String\&) | 未实现。 |
| static [Delete](./delete/)(const String\&) | 删除指定的文件或目录。 |
| static [Encrypt](./encrypt/)(const String\&) | 未实现。 |
| static [Exists](./exists/)(const String\&) | 确定指定路径是否引用了已存在的文件。 |
| static [GetAttributes](./getattributes/)(const String\&) | 返回指定实体的属性。 |
| static [GetCreationTime](./getcreationtime/)(const String\&) | 以本地时间返回指定实体的创建时间。 |
| static [GetCreationTimeUtc](./getcreationtimeutc/)(const String\&) | 以 UTC 时间返回指定实体的创建时间。 |
| static [GetLastAccessTime](./getlastaccesstime/)(const String\&) | 以本地时间返回指定实体的最后访问时间。 |
| static [GetLastAccessTimeUtc](./getlastaccesstimeutc/)(const String\&) | 以 UTC 时间返回指定实体的最后访问时间。 |
| static [GetLastWriteTime](./getlastwritetime/)(const String\&) | 返回指定实体的最后写入时间（本地时间）。 |
| static [GetLastWriteTimeUtc](./getlastwritetimeutc/)(const String\&) | 返回指定实体的最后写入时间（UTC 时间）。 |
| static [Move](./move/)(const String\&, const String\&) | 将指定文件移动到新位置。 |
| static [Open](./open/)(const String\&, FileMode) | 以指定模式打开指定文件进行读写，并且不共享。 |
| static [Open](./open/)(const String\&, FileMode, FileAccess, FileShare) | 以指定模式打开指定文件，使用指定的访问类型和共享选项。 |
| static [OpenRead](./openread/)(const String\&) | 以 'Open' 模式以只读方式打开指定文件，并共享读取访问。 |
| static [OpenText](./opentext/)(const String\&, const EncodingPtr\&) | 使用 UTF-8 编码打开指定的现有文件进行文本读取，且不共享。 |
| static [OpenWrite](./openwrite/)(const String\&) | 以 'OpenOrCreate' 模式以仅写入方式打开指定文件，且不共享。 |
| static [ReadAllBytes](./readallbytes/)(const String\&) | 将指定二进制文件的内容读取到字节数组中。 |
| static [ReadAllLines](./readalllines/)(const String\&, const EncodingPtr\&) | 使用指定的字符编码逐行读取指定文本文件的内容到字符串数组中。 |
| static [ReadAllText](./readalltext/)(const String\&, const EncodingPtr\&) | 使用指定的字符编码将指定文本文件的内容读取到单个 [String](../../system/string/) 对象中。 |
| static [ReadLines](./readlines/)(const String\&, const EncodingPtr\&) | 使用指定的字符编码逐行读取指定文本文件的内容，并返回可枚举的字符串集合，每个字符串代表文件内容中的一行。 |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, bool) | 用另一个文件替换一个文件的内容，并创建被替换文件的备份。 |
| static [SetAttributes](./setattributes/)(const String\&, FileAttributes) | 为指定文件设置指定的属性。 |
| static [SetCreationTime](./setcreationtime/)(const String\&, DateTime) | 未实现。 |
| static [SetCreationTimeUtc](./setcreationtimeutc/)(const String\&, DateTime) | 未实现。 |
| static [SetLastAccessTime](./setlastaccesstime/)(const String\&, DateTime) | 未实现。 |
| static [SetLastAccessTimeUtc](./setlastaccesstimeutc/)(const String\&, DateTime) | 未实现。 |
| static [SetLastWriteTime](./setlastwritetime/)(const String\&, DateTime) | 将指定实体的最后写入时间设置为本地时间。 |
| static [SetLastWriteTimeUtc](./setlastwritetimeutc/)(const String\&, DateTime) | 将指定实体的最后写入时间设置为 UTC 时间。 |
| static [WriteAllBytes](./writeallbytes/)(const String\&, const ArrayPtr\<uint8_t\>\&) | 覆盖指定的二进制文件并写入指定的字节。 |
| static [WriteAllLines](./writealllines/)(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) | 创建新文本文件或覆盖已有文件，并使用指定的编码将指定可枚举字符串集合中的所有字符串写入文件，每个字符串占一行。 |
| static [WriteAllLines](./writealllines/)(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) | 创建新文本文件或覆盖已有文件，并使用指定的编码将指定字符串数组中的所有字符串写入文件，每个字符串占一行。 |
| static [WriteAllText](./writealltext/)(const String\&, const String\&, const EncodingPtr\&) | 创建新文本文件或覆盖已有文件，并使用指定的编码将指定字符串的内容写入文件。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [DefaultBufferSize](./defaultbuffersize/) | 从文件读取和写入时缓冲的字节数的默认值。 |
## 另见

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
