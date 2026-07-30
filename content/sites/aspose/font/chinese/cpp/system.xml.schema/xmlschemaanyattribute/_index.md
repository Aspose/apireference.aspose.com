---
title: "System::Xml::Schema::XmlSchemaAnyAttribute 类"
linktitle: "XmlSchemaAnyAttribute"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaAnyAttribute 类。表示在 C++ 中的万维网联盟（W3C）anyAttribute 元素。"
type: docs
weight: 900
url: /zh/cpp/system.xml.schema/xmlschemaanyattribute/
---
## XmlSchemaAnyAttribute class


表示万维网 [Web](../../system.web/) 联盟（W3C）**anyAttribute** 元素。

```cpp
class XmlSchemaAnyAttribute : public System::Xml::Schema::XmlSchemaAnnotated
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Namespace](./get_namespace/)() | 返回可使用的属性所在的命名空间。 |
| [get_ProcessContents](./get_processcontents/)() | 返回有关应用程序或 XML 处理器应如何处理由 **anyAttribute** 元素指定的属性的 XML 文档验证的信息。 |
| [set_Namespace](./set_namespace/)(const String\&) | 设置可使用的属性所在的命名空间。 |
| [set_ProcessContents](./set_processcontents/)(XmlSchemaContentProcessing) | 设置有关应用程序或 XML 处理器应如何处理由 **anyAttribute** 元素指定的属性的 XML 文档验证的信息。 |
| [XmlSchemaAnyAttribute](./xmlschemaanyattribute/)() | 初始化 [XmlSchemaAnyAttribute](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
