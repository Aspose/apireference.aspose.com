---
title: "System::Xml::Schema::XmlSchemaAny 类"
linktitle: "XmlSchemaAny"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaAny 类。表示万维网联盟 (W3C) 在 C++ 中的 any 元素。"
type: docs
weight: 800
url: /zh/cpp/system.xml.schema/xmlschemaany/
---
## XmlSchemaAny class


表示万维网 [Web](../../system.web/) 联盟 (W3C) **any** 元素。

```cpp
class XmlSchemaAny : public System::Xml::Schema::XmlSchemaParticle
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Namespace](./get_namespace/)() | 返回包含可使用元素的命名空间。 |
| [get_ProcessContents](./get_processcontents/)() | 返回有关应用程序或 XML 处理器应如何处理针对 **any** 元素指定的 XML 文档验证的信息。 |
| [set_Namespace](./set_namespace/)(const String\&) | 设置包含可使用元素的命名空间。 |
| [set_ProcessContents](./set_processcontents/)(XmlSchemaContentProcessing) | 设置有关应用程序或 XML 处理器应如何处理针对 **any** 元素指定的 XML 文档验证的信息。 |
| [XmlSchemaAny](./xmlschemaany/)() | 初始化 [XmlSchemaAny](./) 类的新实例。 |
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
