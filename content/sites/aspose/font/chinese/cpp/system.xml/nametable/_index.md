---
title: "System::Xml::NameTable 类"
linktitle: "NameTable"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::NameTable 类。在 C++ 中实现单线程的 XmlNameTable。"
type: docs
weight: 500
url: /zh/cpp/system.xml/nametable/
---
## NameTable class


实现单线程的 [XmlNameTable](../xmlnametable/)。

```cpp
class NameTable : public System::Xml::XmlNameTable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const String\&) override | 将指定的字符串原子化并将其添加到 [NameTable](./)。 |
| [Add](./add/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) override | 将指定的字符串原子化并将其添加到 [NameTable](./)。 |
| [Get](./get/)(const String\&) override | 返回具有指定值的原子化字符串。 |
| [Get](./get/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) override | 返回包含给定数组中指定字符范围相同字符的原子化字符串。 |
| [NameTable](./nametable/)() | 初始化一个新的 [NameTable](./) 类实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlNameTable](../xmlnametable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
