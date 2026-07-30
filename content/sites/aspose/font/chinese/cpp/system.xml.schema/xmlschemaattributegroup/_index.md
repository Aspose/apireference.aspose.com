---
title: "System::Xml::Schema::XmlSchemaAttributeGroup 类"
linktitle: "XmlSchemaAttributeGroup"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaAttributeGroup 类。表示符合 World Wide Web Consortium (W3C) 规范的 XML Schema 中的 attributeGroup 元素。AttributesGroups 提供了一种机制，可将一组属性声明分组，以便在 C++ 中将其作为整体合并到复杂类型定义中。"
type: docs
weight: 1200
url: /zh/cpp/system.xml.schema/xmlschemaattributegroup/
---
## XmlSchemaAttributeGroup class


表示来自 XML [Schema](../) 且符合 World Wide [Web](../../system.web/) Consortium (W3C) 规范的 **attributeGroup** 元素。AttributesGroups 提供了一种机制，可将一组属性声明分组，以便在复杂类型定义中作为整体使用。

```cpp
class XmlSchemaAttributeGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | 返回属性组的 [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) 组件。 |
| [get_Attributes](./get_attributes/)() | 返回属性组的属性集合。包含 [XmlSchemaAttribute](../xmlschemaattribute/) 和 [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) 元素。 |
| [get_Name](./get_name/)() | 返回属性组的名称。 |
| [get_QualifiedName](./get_qualifiedname/)() | 返回属性组的限定名称。 |
| [get_RedefinedAttributeGroup](./get_redefinedattributegroup/)() | 返回来自 XML [Schema](../) 的重新定义的属性组属性。 |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | 设置属性组的 [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) 组件。 |
| [set_Name](./set_name/)(const String\&) | 设置属性组的名称。 |
| [XmlSchemaAttributeGroup](./xmlschemaattributegroup/)() | 初始化 [XmlSchemaAttributeGroup](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
