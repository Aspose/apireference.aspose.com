---
title: "System::Xml::Schema::XmlSchemaComplexContent 类"
linktitle: "XmlSchemaComplexContent"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaComplexContent 类。表示由万维网联盟 (W3C) 指定的 XML Schema 中的 complexContent 元素。此类表示复杂类型的复杂内容模型。它包含对仅包含元素或混合内容的复杂类型的扩展或限制，在 C++ 中。"
type: docs
weight: 1800
url: /zh/cpp/system.xml.schema/xmlschemacomplexcontent/
---
## XmlSchemaComplexContent class


表示来自 XML [Schema](../) 的 **complexContent** 元素，由万维网 [Web](../../system.web/) 联盟 (W3C) 指定。此类表示复杂类型的复杂内容模型。它包含对仅包含元素或混合内容的复杂类型的扩展或限制。

```cpp
class XmlSchemaComplexContent : public System::Xml::Schema::XmlSchemaContentModel
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Content](./get_content/)() override | 返回内容。 |
| [get_IsMixed](./get_ismixed/)() | 返回用于确定该类型是否具有混合内容模型的信息。 |
| [set_Content](./set_content/)(SharedPtr\<XmlSchemaContent\>) override | 设置内容。 |
| [set_IsMixed](./set_ismixed/)(bool) | 设置用于确定该类型是否具有混合内容模型的信息。 |
| [XmlSchemaComplexContent](./xmlschemacomplexcontent/)() | 初始化 [XmlSchemaComplexContent](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlSchemaContentModel](../xmlschemacontentmodel/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
