---
title: "System::Xml::XmlQualifiedName 类"
linktitle: "XmlQualifiedName"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlQualifiedName 类。表示 C++ 中的 XML 合格名称。"
type: docs
weight: 3200
url: /zh/cpp/system.xml/xmlqualifiedname/
---
## XmlQualifiedName class


表示 XML 合格名称。

```cpp
class XmlQualifiedName : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 确定指定的 [XmlQualifiedName](./) 对象是否等于当前的 [XmlQualifiedName](./) 对象。 |
| [get_IsEmpty](./get_isempty/)() const | 返回一个值，指示 [XmlQualifiedName](./) 是否为空。 |
| [get_Name](./get_name/)() const | 返回 [XmlQualifiedName](./) 的合格名称的字符串表示。 |
| [get_Namespace](./get_namespace/)() const | 返回 [XmlQualifiedName](./) 的命名空间的字符串表示。 |
| [GetHashCode](./gethashcode/)() const override | 返回 [XmlQualifiedName](./) 的哈希码。 |
| static [ToString](./tostring/)(const String\&, const String\&) | 返回 [XmlQualifiedName](./) 的字符串值。 |
| [ToString](./tostring/)() const override | 返回 [XmlQualifiedName](./) 的字符串值。 |
| [XmlQualifiedName](./xmlqualifiedname/)() | 初始化一个新的 [XmlQualifiedName](./) 类实例。 |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&) | 使用指定的名称初始化一个新的 [XmlQualifiedName](./) 类实例。 |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&, const String\&) | 使用指定的名称和命名空间初始化一个新的 [XmlQualifiedName](./) 类实例。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Empty](./empty/) | 提供一个空的 [XmlQualifiedName](./)。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
