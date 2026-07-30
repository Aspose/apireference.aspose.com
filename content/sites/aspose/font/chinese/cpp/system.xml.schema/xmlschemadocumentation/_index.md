---
title: "System::Xml::Schema::XmlSchemaDocumentation 类"
linktitle: "XmlSchemaDocumentation"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaDocumentation 类。表示由万维网联盟（W3C）指定的 XML Schema 中的文档元素。此类指定在 C++ 注释中供人类读取或使用的信息。"
type: docs
weight: 2500
url: /zh/cpp/system.xml.schema/xmlschemadocumentation/
---
## XmlSchemaDocumentation class


表示 XML [Schema](../) 中的 **documentation** 元素，依据万维网 [Web](../../system.web/) 联盟（W3C）的规定。此类指定在 **annotation** 中供人类读取或使用的信息。

```cpp
class XmlSchemaDocumentation : public System::Xml::Schema::XmlSchemaObject
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Language](./get_language/)() | 返回 **xml:lang** 属性。此属性用于指示内容使用的语言。 |
| [get_Markup](./get_markup/)() | 返回一个 [XmlNode](../../system.xml/xmlnode/) 对象数组，表示 documentation 子节点。 |
| [get_Source](./get_source/)() | 返回信息的统一资源标识符（URI）来源。 |
| [set_Language](./set_language/)(const String\&) | 设置 **xml:lang** 属性。此属性用于指示内容使用的语言。 |
| [set_Markup](./set_markup/)(const ArrayPtr\<SharedPtr\<XmlNode\>\>\&) | 设置一个 [XmlNode](../../system.xml/xmlnode/) 对象数组，表示 documentation 子节点。 |
| [set_Source](./set_source/)(const String\&) | 设置信息的统一资源标识符（URI）来源。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
