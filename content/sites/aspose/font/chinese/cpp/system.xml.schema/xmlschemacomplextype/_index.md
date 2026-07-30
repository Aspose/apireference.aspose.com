---
title: "System::Xml::Schema::XmlSchemaComplexType 类"
linktitle: "XmlSchemaComplexType"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaComplexType 类。表示由万维网联盟 (W3C) 指定的 XML Schema 中的 complexType 元素。此类在 C++ 中定义了一种复杂类型，用于确定元素的属性集合和内容。"
type: docs
weight: 2100
url: /zh/cpp/system.xml.schema/xmlschemacomplextype/
---
## XmlSchemaComplexType class


表示来自 XML [Schema](../) 的 **complexType** 元素，依据万维网 [Web](../../system.web/) 联盟 (W3C) 的规范。此类定义了一种复杂类型，用于确定元素的属性集合和内容。

```cpp
class XmlSchemaComplexType : public System::Xml::Schema::XmlSchemaType
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | 返回复杂类型的 [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) 组件的值。 |
| [get_Attributes](./get_attributes/)() | 返回复杂类型的属性集合。 |
| [get_AttributeUses](./get_attributeuses/)() | 返回此复杂类型及其基类型的所有已编译属性的集合。 |
| [get_AttributeWildcard](./get_attributewildcard/)() | 返回此复杂类型及其基类型的 **anyAttribute** 编译后值。 |
| [get_Block](./get_block/)() | 返回 **block** 属性。 |
| [get_BlockResolved](./get_blockresolved/)() | 返回在类型已编译为后模式验证信息集（infoset）后的值。该值指示在实例文档中使用 **xsi:type** 时类型的强制方式。 |
| [get_ContentModel](./get_contentmodel/)() | 返回此复合类型的后编译 [XmlSchemaContentModel](../xmlschemacontentmodel/)。 |
| [get_ContentType](./get_contenttype/)() | 返回持有后编译值的复合类型的内容模型。 |
| [get_ContentTypeParticle](./get_contenttypeparticle/)() | 返回持有后编译值的 [XmlSchemaComplexType::get_ContentType](./get_contenttype/) 粒子。 |
| [get_IsAbstract](./get_isabstract/)() | 返回决定 **complexType** 元素是否可以在实例文档中使用的信息。 |
| [get_IsMixed](./get_ismixed/)() override | 返回决定复合类型是否具有混合内容模型（内容中的标记）的信息。 |
| [get_Particle](./get_particle/)() | 返回组合器类型，可能是以下类之一：[XmlSchemaGroupRef](../xmlschemagroupref/)、[XmlSchemaChoice](../xmlschemachoice/)、[XmlSchemaAll](../xmlschemaall/) 或 [XmlSchemaSequence](../xmlschemasequence/)。 |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | 设置复合类型的 [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) 组件的值。 |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | 设置 **block** 属性。 |
| [set_ContentModel](./set_contentmodel/)(const SharedPtr\<XmlSchemaContentModel\>\&) | 设置此复合类型的后编译 [XmlSchemaContentModel](../xmlschemacontentmodel/)。 |
| [set_IsAbstract](./set_isabstract/)(bool) | 设置决定 **complexType** 元素是否可以在实例文档中使用的信息。 |
| [set_IsMixed](./set_ismixed/)(bool) override | 设置信息，以确定复合类型是否具有混合内容模型（内容中的标记）。 |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | 设置组合器类型，可能是以下类之一：[XmlSchemaGroupRef](../xmlschemagroupref/)、[XmlSchemaChoice](../xmlschemachoice/)、[XmlSchemaAll](../xmlschemaall/) 或 [XmlSchemaSequence](../xmlschemasequence/)。 |
| [XmlSchemaComplexType](./xmlschemacomplextype/)() | 初始化 [XmlSchemaComplexType](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
