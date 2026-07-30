---
title: "System::Xml::Schema::XmlSchemaSimpleTypeUnion class"
linktitle: "XmlSchemaSimpleTypeUnion"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeUnion 类。表示来自 XML Schema 的简单类型的 union 元素，符合万维网联盟（W3C）的规定。union 数据类型可用于指定 simpleType 的内容。simpleType 元素的值必须是 union 中指定的一组备选数据类型中的任意一个。union 类型始终是派生类型，并且在 C++ 中必须至少包含两种备选数据类型。"
type: docs
weight: 6600
url: /zh/cpp/system.xml.schema/xmlschemasimpletypeunion/
---
## XmlSchemaSimpleTypeUnion class


表示来自 XML [Schema](../) 的简单类型的 **union** 元素，符合万维网 [Web](../../system.web/) 联盟（W3C）的规定。**union** 数据类型可用于指定 **simpleType** 的内容。**simpleType** 元素的值必须是 union 中指定的一组备选数据类型中的任意一个。union 类型始终是派生类型，并且必须至少包含两种备选数据类型。

```cpp
class XmlSchemaSimpleTypeUnion : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_BaseMemberTypes](./get_basemembertypes/)() | 返回一个 [XmlSchemaSimpleType](../xmlschemasimpletype/) 对象数组，表示 **simpleType** 元素的类型，基于 [XmlSchemaSimpleTypeUnion::get_BaseTypes](./get_basetypes/) 和 [XmlSchemaSimpleTypeUnion::get_MemberTypes](./get_membertypes/) 的 simple type 值。 |
| [get_BaseTypes](./get_basetypes/)() | 返回基类型的集合。 |
| [get_MemberTypes](./get_membertypes/)() | 返回在此模式中定义的内置数据类型或 **simpleType** 元素的合格成员名称数组（或由指定命名空间指示的其他模式）。 |
| [set_MemberTypes](./set_membertypes/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | 设置在此模式中定义的内置数据类型或 **simpleType** 元素的合格成员名称数组（或由指定命名空间指示的其他模式）。 |
| [XmlSchemaSimpleTypeUnion](./xmlschemasimpletypeunion/)() | 初始化 [XmlSchemaSimpleTypeUnion](./) 类的新实例。 |
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
