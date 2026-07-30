---
title: "System::Version 类"
linktitle: "版本"
second_title: "Aspose.Font 适用于 C++"
description: "System::Version 类。表示版本号。此类型应在栈上分配，并通过值或引用传递给函数。切勿在 C++ 中使用 System::SmartPtr 类来管理此类型的对象。"
type: docs
weight: 7300
url: /zh/cpp/system/version/
---
## Version class


表示版本号。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../smartptr/) 类来管理此类型的对象。

```cpp
class Version
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CompareTo](./compareto/)(const Version\&) const | 比较当前对象和指定对象所表示的版本。 |
| [Equals](./equals/)(const Version\&) const | 确定当前对象和指定对象所表示的版本号是否相等。 |
| [get_Build](./get_build/)() const | 返回构建号。 |
| [get_Major](./get_major/)() const | 返回主版本号。 |
| [get_MajorRevision](./get_majorrevision/)() const | 返回修订号的高 16 位值。 |
| [get_Minor](./get_minor/)() const | 返回次版本号。 |
| [get_MinorRevision](./get_minorrevision/)() const | 返回修订号的低 16 位值。 |
| [get_Revision](./get_revision/)() const | 返回修订号。 |
| [GetHashCode](./gethashcode/)() const | 返回当前对象的哈希码。 |
| static [Parse](./parse/)(const String\&) | 将版本号的字符串表示转换为等效的 [Version](./) 类实例。 |
| [ToString](./tostring/)() const | 返回当前对象所表示的版本号的字符串表示。 |
| [ToString](./tostring/)(int) const | 返回当前对象所表示的版本号中指定段数的字符串表示。 |
| [Version](./version/)(int, int, int, int) | 构造一个实例，表示指定的主、次、构建和修订值。 |
| [Version](./version/)(int, int, int) | 构造一个实例，表示指定的主、次和构建值。 |
| [Version](./version/)(int, int) | 构造一个实例，表示指定的主版本及其值。 |
| [Version](./version/)(const String\&) | 构造一个实例，表示以字符串形式表示的版本号。 |
| [Version](./version/)() | 构造一个实例，表示版本号 0.0.-1.-1。 |
## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
