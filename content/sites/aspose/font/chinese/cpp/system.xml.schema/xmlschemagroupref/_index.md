---
title: "System::Xml::Schema::XmlSchemaGroupRef 类"
linktitle: "XmlSchemaGroupRef"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaGroupRef 类。表示由万维网联盟（W3C）指定的 XML Schema 中带有 ref 属性的 group 元素。此类在 C++ 中用于引用在 schema 级别定义的组的复杂类型。"
type: docs
weight: 3300
url: /zh/cpp/system.xml.schema/xmlschemagroupref/
---
## XmlSchemaGroupRef class


表示来自 XML [Schema](../) 且由万维网 [Web](../../system.web/) 联盟（W3C）指定的带有 **ref** 属性的 **group** 元素。此类在引用在 **schema** 级别定义的 **group** 的复杂类型中使用。

```cpp
class XmlSchemaGroupRef : public System::Xml::Schema::XmlSchemaParticle
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Particle](./get_particle/)() | 返回以下类之一：[XmlSchemaChoice](../xmlschemachoice/)、[XmlSchemaAll](../xmlschemaall/) 或 [XmlSchemaSequence](../xmlschemasequence/) 类，这些类保存 **Particle** 值的编译后解释。 |
| [get_RefName](./get_refname/)() | 返回在此模式（或由指定命名空间指示的其他模式）中定义的组的名称。 |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | 设置此模式中定义的组的名称（或由指定命名空间指示的其他模式中的组）。 |
| [XmlSchemaGroupRef](./xmlschemagroupref/)() | 初始化 [XmlSchemaGroupRef](./) 类的新实例。 |
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
