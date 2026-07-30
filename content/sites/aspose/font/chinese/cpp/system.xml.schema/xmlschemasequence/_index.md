---
title: "System::Xml::Schema::XmlSchemaSequence 类"
linktitle: "XmlSchemaSequence"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaSequence 类。表示由万维网联盟 (W3C) 指定的 XML Schema 中的 sequence 元素（组合器）。在 C++ 中，sequence 要求组内的元素在包含元素中按指定顺序出现。"
type: docs
weight: 5700
url: /zh/cpp/system.xml.schema/xmlschemasequence/
---
## XmlSchemaSequence class


表示来自 XML [Schema](../) 且由万维网 [Web](../../system.web/) 联盟 (W3C) 指定的 **sequence** 元素（组合器）。**sequence** 要求组内的元素在包含元素中按指定顺序出现。

```cpp
class XmlSchemaSequence : public System::Xml::Schema::XmlSchemaGroupBase
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Items](./get_items/)() override | 组合器中包含的元素。包括 [XmlSchemaElement](../xmlschemaelement/)、[XmlSchemaGroupRef](../xmlschemagroupref/)、[XmlSchemaChoice](../xmlschemachoice/)、[XmlSchemaSequence](./) 或 [XmlSchemaAny](../xmlschemaany/) 的集合。 |
| [XmlSchemaSequence](./xmlschemasequence/)() | 初始化 [XmlSchemaSequence](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlSchemaGroupBase](../xmlschemagroupbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
