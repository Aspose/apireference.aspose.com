---
title: "System::Xml::Schema::XmlSchemaInfo 类"
linktitle: "XmlSchemaInfo"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaInfo 类。表示 C++ 中已验证 XML 节点的模式后验证信息集。"
type: docs
weight: 3800
url: /zh/cpp/system.xml.schema/xmlschemainfo/
---
## XmlSchemaInfo class


表示已验证 XML 节点的模式后验证信息集。

```cpp
class XmlSchemaInfo : public System::Xml::Schema::IXmlSchemaInfo
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_ContentType](./get_contenttype/)() | 返回与此已验证 XML 节点的内容类型对应的 [XmlSchemaContentType](../xmlschemacontenttype/) 对象。 |
| [get_IsDefault](./get_isdefault/)() override | 返回一个值，指示此已验证 XML 节点是否因在 XML [Schema](../) 定义语言 (XSD) 模式验证期间应用默认值而被设置。 |
| [get_IsNil](./get_isnil/)() override | 返回一个值，指示此已验证 XML 节点的值是否为 **nil**。 |
| [get_MemberType](./get_membertype/)() override | 返回此已验证 XML 节点的动态模式类型。 |
| [get_SchemaAttribute](./get_schemaattribute/)() override | 返回与此已验证 XML 节点对应的已编译 [XmlSchemaAttribute](../xmlschemaattribute/) 对象。 |
| [get_SchemaElement](./get_schemaelement/)() override | 返回与此已验证 XML 节点对应的已编译 [XmlSchemaElement](../xmlschemaelement/) 对象。 |
| [get_SchemaType](./get_schematype/)() override | 返回此已验证 XML 节点的静态 XML [Schema](../) 定义语言 (XSD) 模式类型。 |
| [get_Validity](./get_validity/)() override | 返回此已验证 XML 节点的 [XmlSchemaValidity](../xmlschemavalidity/) 值。 |
| [set_ContentType](./set_contenttype/)(XmlSchemaContentType) | 设置与此已验证 XML 节点的内容类型对应的 [XmlSchemaContentType](../xmlschemacontenttype/) 对象。 |
| [set_IsDefault](./set_isdefault/)(bool) | 设置一个值，指示此已验证 XML 节点是否因在 XML [Schema](../) 定义语言 (XSD) 模式验证期间应用默认值而被设置。 |
| [set_IsNil](./set_isnil/)(bool) | 设置一个值，指示此已验证 XML 节点的值是否为 **nil**。 |
| [set_MemberType](./set_membertype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | 设置此已验证 XML 节点的动态模式类型。 |
| [set_SchemaAttribute](./set_schemaattribute/)(const SharedPtr\<XmlSchemaAttribute\>\&) | 设置与此已验证 XML 节点对应的已编译 [XmlSchemaAttribute](../xmlschemaattribute/) 对象。 |
| [set_SchemaElement](./set_schemaelement/)(const SharedPtr\<XmlSchemaElement\>\&) | 设置与此已验证 XML 节点对应的已编译 [XmlSchemaElement](../xmlschemaelement/) 对象。 |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | 设置此已验证 XML 节点的静态 XML [Schema](../) 定义语言 (XSD) 模式类型。 |
| [set_Validity](./set_validity/)(XmlSchemaValidity) | 设置此已验证 XML 节点的 [XmlSchemaValidity](../xmlschemavalidity/) 值。 |
| [XmlSchemaInfo](./xmlschemainfo/)() | 初始化 [XmlSchemaInfo](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [IXmlSchemaInfo](../ixmlschemainfo/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
