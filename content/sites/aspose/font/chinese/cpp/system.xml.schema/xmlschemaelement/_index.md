---
title: "System::Xml::Schema::XmlSchemaElement 类"
linktitle: "XmlSchemaElement"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaElement 类。表示 XML Schema 中由万维网联盟 (W3C) 指定的 element 元素。此类是所有粒子类型的基类，用于在 C++ 中描述 XML 文档中的元素。"
type: docs
weight: 2600
url: /zh/cpp/system.xml.schema/xmlschemaelement/
---
## XmlSchemaElement class


表示 XML [Schema](../) 中由万维网 [Web](../../system.web/) 联盟 (W3C) 指定的 **element** 元素。此类是所有粒子类型的基类，用于描述 XML 文档中的元素。

```cpp
class XmlSchemaElement : public System::Xml::Schema::XmlSchemaParticle
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Block](./get_block/)() | 返回一个 **Block** 派生。 |
| [get_BlockResolved](./get_blockresolved/)() | 返回 **Block** 值的后编译解释。 |
| [get_Constraints](./get_constraints/)() | 返回元素的约束集合。 |
| [get_DefaultValue](./get_defaultvalue/)() | 如果元素的内容是简单类型或元素的内容为 **textOnly**，则返回该元素的默认值。 |
| [get_ElementSchemaType](./get_elementschematype/)() | 返回一个 [XmlSchemaType](../xmlschematype/) 对象，表示基于元素的 [XmlSchemaElement::get_SchemaType](./get_schematype/) 或 [XmlSchemaElement::get_SchemaTypeName](./get_schematypename/) 值的元素类型。 |
| [get_ElementType](./get_elementtype/)() | 返回一个基于元素的 [XmlSchemaElement](./) 或 [XmlSchemaElement](./) 的对象，该对象保存 **ElementType** 值的编译后解释。 |
| [get_Final](./get_final/)() | 返回 **Final** 值，以指示不允许进一步派生。 |
| [get_FinalResolved](./get_finalresolved/)() | 返回 **Final** 值的编译后解释。 |
| [get_FixedValue](./get_fixedvalue/)() | 返回固定值。 |
| [get_Form](./get_form/)() | 返回元素的形式。 |
| [get_IsAbstract](./get_isabstract/)() | 返回信息以指示该元素是否可以在实例文档中使用。 |
| [get_IsNillable](./get_isnillable/)() | 返回指示 **xsi:nil** 是否可以出现在实例数据中的信息。指示是否可以为该元素分配显式的 nil 值。 |
| [get_Name](./get_name/)() | 返回元素的名称。 |
| [get_QualifiedName](./get_qualifiedname/)() | 返回给定元素的实际限定名称。 |
| [get_RefName](./get_refname/)() | 返回在此模式中声明的元素（或由指定命名空间指示的其他模式中）的引用名称。 |
| [get_SchemaType](./get_schematype/)() | 返回元素的类型。它可以是复合类型或简单类型。 |
| [get_SchemaTypeName](./get_schematypename/)() | 返回在此模式或由指定命名空间指示的其他模式中定义的内置数据类型的名称。 |
| [get_SubstitutionGroup](./get_substitutiongroup/)() | 返回被此元素替代的元素的名称。 |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | 设置 **Block** 派生。 |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | 如果元素的内容是简单类型或元素的内容为 **textOnly**，则设置该元素的默认值。 |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | 设置 **Final** 值，以指示不允许进一步派生。 |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | 设置固定值。 |
| [set_Form](./set_form/)(XmlSchemaForm) | 设置元素的形式。 |
| [set_IsAbstract](./set_isabstract/)(bool) | 设置信息以指示该元素是否可以在实例文档中使用。 |
| [set_IsNillable](./set_isnillable/)(bool) | 设置信息以指示 **xsi:nil** 是否可以出现在实例数据中。指示是否可以为该元素分配显式的 nil 值。 |
| [set_Name](./set_name/)(const String\&) | 设置元素的名称。 |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | 设置在此模式中声明的元素（或由指定命名空间指示的其他模式中）的引用名称。 |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | 设置元素的类型。它可以是复合类型或简单类型。 |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | 设置在此模式中或由指定命名空间指示的其他模式中定义的内置数据类型的名称。 |
| [set_SubstitutionGroup](./set_substitutiongroup/)(const SharedPtr\<XmlQualifiedName\>\&) | 设置被此元素替代的元素的名称。 |
| [XmlSchemaElement](./xmlschemaelement/)() | 初始化 [XmlSchemaElement](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
