---
title: "System::Xml::Schema::XmlSchemaInference 类"
linktitle: "XmlSchemaInference"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaInference 类。推断来自 XML 文档的 XML 架构定义语言 (XSD) 架构。XmlSchemaInference 类在 C++ 中不可继承。"
type: docs
weight: 3700
url: /zh/cpp/system.xml.schema/xmlschemainference/
---
## XmlSchemaInference class


从 XML 文档推断 XML [Schema](../) 定义语言 (XSD) 架构。[XmlSchemaInference](./) 类不可继承。

```cpp
class XmlSchemaInference : public System::Object
```

## Enums

| 枚举 | 描述 |
| --- | --- |
| [InferenceOption](./inferenceoption/) | 影响由 [XmlSchemaInference](./) 类对 XML 文档中元素和属性推断的出现次数和类型信息。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Occurrence](./get_occurrence/)() | 返回影响从 XML 文档推断的架构出现声明的 [XmlSchemaInference::InferenceOption](./inferenceoption/) 值。 |
| [get_TypeInference](./get_typeinference/)() | 返回影响从 XML 文档推断的类型的 [XmlSchemaInference::InferenceOption](./inferenceoption/) 值。 |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&) | 从指定的 [XmlReader](../../system.xml/xmlreader/) 对象中包含的 XML 文档推断 XML [Schema](../) 定义语言 (XSD) 架构。 |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) | 从指定的 [XmlReader](../../system.xml/xmlreader/) 对象中包含的 XML 文档推断 XML [Schema](../) 定义语言 (XSD) 架构，并使用在具有相同目标命名空间的指定 [XmlSchemaSet](../xmlschemaset/) 对象中的现有架构来细化推断的架构。 |
| [set_Occurrence](./set_occurrence/)(XmlSchemaInference::InferenceOption) | 设置影响从 XML 文档推断的架构出现声明的 [XmlSchemaInference::InferenceOption](./inferenceoption/) 值。 |
| [set_TypeInference](./set_typeinference/)(XmlSchemaInference::InferenceOption) | 设置影响从 XML 文档推断的类型的 [XmlSchemaInference::InferenceOption](./inferenceoption/) 值。 |
| [XmlSchemaInference](./xmlschemainference/)() | 初始化 [XmlSchemaInference](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
