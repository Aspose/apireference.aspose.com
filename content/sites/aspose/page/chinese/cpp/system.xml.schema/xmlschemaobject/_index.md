---
title: "System::Xml::Schema::XmlSchemaObject class"
linktitle: "XmlSchemaObject"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::Schema::XmlSchemaObject 类。表示 Xml 架构对象模型层次结构的根类，并作为诸如 XmlSchema 类等类的基类，在 C++ 中使用。"
type: docs
weight: 5000
url: /zh/cpp/system.xml.schema/xmlschemaobject/
---
## XmlSchemaObject class


表示 [Xml](../../system.xml/) 架构对象模型层次结构的根类，并作为诸如 [XmlSchema](../xmlschema/) 类等类的基类。

```cpp
class XmlSchemaObject : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_LineNumber](./get_linenumber/)() | 返回 **schema** 元素所引用的文件中的行号。 |
| [get_LinePosition](./get_lineposition/)() | 返回 **schema** 元素所引用的文件中的行位置。 |
| [get_Namespaces](./get_namespaces/)() | 返回用于此模式对象的 XmlSerializerNamespaces。 |
| [get_Parent](./get_parent/)() | 返回此 [XmlSchemaObject](./) 的父对象。 |
| [get_SourceUri](./get_sourceuri/)() | 返回加载该模式的文件的源位置。 |
| [set_LineNumber](./set_linenumber/)(int32_t) | 设置 **schema** 元素所引用的文件中的行号。 |
| [set_LinePosition](./set_lineposition/)(int32_t) | 设置 **schema** 元素所引用的文件中的行位置。 |
| [set_Namespaces](./set_namespaces/)(const SharedPtr\<System::Xml::Serialization::XmlSerializerNamespaces\>\&) | 设置要与此模式对象一起使用的 XmlSerializerNamespaces。 |
| [set_Parent](./set_parent/)(const SharedPtr\<XmlSchemaObject\>\&) | 设置此 [XmlSchemaObject](./) 的父对象。 |
| [set_SourceUri](./set_sourceuri/)(const String\&) | 设置加载模式的文件的源位置。 |
| [XmlSchemaObject](./xmlschemaobject/)() | 初始化一个新的 [XmlSchemaObject](./) 类实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
