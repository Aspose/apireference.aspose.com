---
title: "System::Xml::Schema::XmlSchemaSimpleType 类"
linktitle: "XmlSchemaSimpleType"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::Schema::XmlSchemaSimpleType 类。表示由万维网联盟 (W3C) 指定的 XML Schema 中用于简单内容的 simpleType 元素。此类定义了一个简单类型。简单类型可以为 C++ 中仅含文本内容的属性或元素的值指定信息和约束。"
type: docs
weight: 6200
url: /zh/cpp/system.xml.schema/xmlschemasimpletype/
---
## XmlSchemaSimpleType class


表示 XML [Schema](../) 中用于简单内容的 **simpleType** 元素，依据万维网 [Web](../../system.web/) 联盟 (W3C) 的规定。此类定义了一个简单类型。简单类型可以为属性或仅含文本内容的元素的值指定信息和约束。

```cpp
class XmlSchemaSimpleType : public System::Xml::Schema::XmlSchemaType
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Content](./get_content/)() | 返回以下之一：[XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/)、[XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/) 或 [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/)。 |
| [set_Content](./set_content/)(const SharedPtr\<XmlSchemaSimpleTypeContent\>\&) | 设置以下之一：[XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/)、[XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/) 或 [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/)。 |
| [XmlSchemaSimpleType](./xmlschemasimpletype/)() | 初始化 [XmlSchemaSimpleType](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
