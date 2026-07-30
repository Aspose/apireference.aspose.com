---
title: "System::Xml::Schema::XmlSchemaSimpleTypeList 类"
linktitle: "XmlSchemaSimpleTypeList"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeList 类。表示由万维网联盟 (W3C) 指定的 XML Schema 中的 list 元素。此类可用于在 C++ 中将 simpleType 元素定义为指定数据类型的值列表。"
type: docs
weight: 6400
url: /zh/cpp/system.xml.schema/xmlschemasimpletypelist/
---
## XmlSchemaSimpleTypeList class


表示 XML [Schema](../) 中的 **list** 元素，符合万维网 [Web](../../system.web/) 联盟 (W3C) 的规范。此类可用于将 **simpleType** 元素定义为指定数据类型的值列表。

```cpp
class XmlSchemaSimpleTypeList : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_BaseItemType](./get_baseitemtype/)() | 返回表示 **simpleType** 元素类型的 [XmlSchemaSimpleType](../xmlschemasimpletype/)，该类型基于 [XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) 和 [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) 的简单类型值。 |
| [get_ItemType](./get_itemtype/)() | 返回从基值指定的类型派生的 **simpleType** 元素。 |
| [get_ItemTypeName](./get_itemtypename/)() | 返回在此模式（或由指定命名空间指示的其他模式）中定义的内置数据类型或 **simpleType** 元素的名称。 |
| [set_BaseItemType](./set_baseitemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | 设置表示 **simpleType** 元素类型的 [XmlSchemaSimpleType](../xmlschemasimpletype/)，该类型基于 [XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) 和 [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) 的简单类型值。 |
| [set_ItemType](./set_itemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | 设置从基值指定的类型派生的 **simpleType** 元素。 |
| [set_ItemTypeName](./set_itemtypename/)(const SharedPtr\<XmlQualifiedName\>\&) | 设置在此模式（或由指定命名空间指示的其他模式）中定义的内置数据类型或 **simpleType** 元素的名称。 |
| [XmlSchemaSimpleTypeList](./xmlschemasimpletypelist/)() | 初始化 [XmlSchemaSimpleTypeList](./) 类的新实例。 |
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
