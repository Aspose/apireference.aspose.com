---
title: "System::Xml::Schema::XmlSchemaType 类"
linktitle: "XmlSchemaType"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::Schema::XmlSchemaType 类。C++ 中所有简单类型和复合类型的基类。"
type: docs
weight: 6800
url: /zh/cpp/system.xml.schema/xmlschematype/
---
## XmlSchemaType class


所有简单类型和复杂类型的基类。

```cpp
class XmlSchemaType : public System::Xml::Schema::XmlSchemaAnnotated
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_BaseSchemaType](./get_baseschematype/)() | 返回后编译的对象类型或内置 XML [Schema](../) 定义语言（XSD）数据类型、simpleType 元素或 complexType 元素。这是后模式编译的 infoset 值。 |
| [get_BaseXmlSchemaType](./get_basexmlschematype/)() | 返回此模式类型的基类型的后编译值。 |
| [get_Datatype](./get_datatype/)() | 返回复合类型的数据类型的后编译值。 |
| [get_DerivedBy](./get_derivedby/)() | 返回关于此元素如何从其基类型派生的后编译信息。 |
| [get_Final](./get_final/)() | 返回类型派生的 final 属性，以指示是否允许进一步的派生。 |
| [get_FinalResolved](./get_finalresolved/)() | 返回对 [XmlSchemaType::get_Final](./get_final/) 值的后编译解释。 |
| virtual [get_IsMixed](./get_ismixed/)() | 返回一个值，指示此类型是否具有混合内容模型。此调用仅在复合类型中有效。 |
| [get_Name](./get_name/)() | 返回类型的名称。 |
| [get_QualifiedName](./get_qualifiedname/)() | 返回从此类型的 **Name** 属性构建的类型的限定名称。这是模式编译后得到的值。 |
| [get_TypeCode](./get_typecode/)() | 返回该类型的 [XmlTypeCode](../xmltypecode/)。 |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(XmlTypeCode) | 返回一个 [XmlSchemaComplexType](../xmlschemacomplextype/)，它表示指定的复合类型的内置复合类型。 |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(const SharedPtr\<XmlQualifiedName\>\&) | 返回一个 [XmlSchemaComplexType](../xmlschemacomplextype/)，它表示通过限定名称指定的复合类型的内置复合类型。 |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(const SharedPtr\<XmlQualifiedName\>\&) | 返回一个 [XmlSchemaSimpleType](../xmlschemasimpletype/)，它表示通过限定名称指定的简单类型的内置简单类型。 |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(XmlTypeCode) | 返回一个 [XmlSchemaSimpleType](../xmlschemasimpletype/)，它表示指定的简单类型的内置简单类型。 |
| static [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaType\>, const SharedPtr\<XmlSchemaType\>\&, XmlSchemaDerivationMethod) | 返回一个值，指示指定的派生模式类型是否派生自指定的基模式类型。 |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | 设置类型派生的 final 属性，以指示是否允许进一步的派生。 |
| virtual [set_IsMixed](./set_ismixed/)(bool) | 设置一个值，指示此类型是否具有混合内容模型。此调用仅在复合类型中有效。 |
| [set_Name](./set_name/)(const String\&) | 设置类型的名称。 |
| [XmlSchemaType](./xmlschematype/)() | 初始化一个新的 [XmlSchemaType](./) 类实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
