---
title: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction 类"
linktitle: "XmlSchemaSimpleTypeRestriction"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction 类。表示由万维网联盟 (W3C) 指定的 XML Schema 中用于简单类型的 restriction 元素。此类可在 C++ 中用于限制 simpleType 元素。"
type: docs
weight: 6500
url: /zh/cpp/system.xml.schema/xmlschemasimpletyperestriction/
---
## XmlSchemaSimpleTypeRestriction class


表示 **restriction** 元素，用于来自 XML [Schema](../) 的简单类型，由万维网 [Web](../../system.web/) 联盟 (W3C) 指定。此类可用于限制 **simpleType** 元素。

```cpp
class XmlSchemaSimpleTypeRestriction : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_BaseType](./get_basetype/)() | 返回关于基类型的信息。 |
| [get_BaseTypeName](./get_basetypename/)() | 返回限定基类型的名称。 |
| [get_Facets](./get_facets/)() | 返回一个 [Xml](../../system.xml/)[Schema](../) facet。 |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | 设置关于基类型的信息。 |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | 设置限定基类型的名称。 |
| [XmlSchemaSimpleTypeRestriction](./xmlschemasimpletyperestriction/)() | 初始化 [XmlSchemaSimpleTypeRestriction](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
