---
title: "System::Xml::Schema::XmlSchemaSimpleContent class"
linktitle: "XmlSchemaSimpleContent"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaSimpleContent 类。表示 XML Schema 中由万维网联盟 (W3C) 指定的 simpleContent 元素。此类用于 C++ 中具有简单内容模型的简单和复杂类型。"
type: docs
weight: 5900
url: /zh/cpp/system.xml.schema/xmlschemasimplecontent/
---
## XmlSchemaSimpleContent class


表示来自 XML [Schema](../) 且由万维网 [Web](../../system.web/) 联盟 (W3C) 指定的 **simpleContent** 元素。此类用于具有简单内容模型的简单和复杂类型。

```cpp
class XmlSchemaSimpleContent : public System::Xml::Schema::XmlSchemaContentModel
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Content](./get_content/)() override | 返回 [XmlSchemaSimpleContentRestriction](../xmlschemasimplecontentrestriction/) 或 [XmlSchemaSimpleContentExtension](../xmlschemasimplecontentextension/) 中的一个。 |
| [set_Content](./set_content/)(SharedPtr\<XmlSchemaContent\>) override | 返回 [XmlSchemaSimpleContentRestriction](../xmlschemasimplecontentrestriction/) 或 [XmlSchemaSimpleContentExtension](../xmlschemasimplecontentextension/) 中的一个。 |
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
