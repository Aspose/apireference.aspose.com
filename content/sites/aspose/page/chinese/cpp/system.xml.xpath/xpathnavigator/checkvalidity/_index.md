---
title: "System::Xml::XPath::XPathNavigator::CheckValidity 方法"
linktitle: "CheckValidity"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XPath::XPathNavigator::CheckValidity 方法。验证 XPathNavigator 中的 XML 数据符合在 C++ 中提供的 XML Schema 定义语言 (XSD) 架构。"
type: docs
weight: 300
url: /zh/cpp/system.xml.xpath/xpathnavigator/checkvalidity/
---
## XPathNavigator::CheckValidity method


验证 XML 数据在 [XPathNavigator](../) 中符合提供的 XML [Schema](../../../system.xml.schema/) 定义语言 (XSD) 架构。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::CheckValidity(SharedPtr<System::Xml::Schema::XmlSchemaSet> schemas, System::Xml::Schema::ValidationEventHandler validationEventHandler)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| schemas | SharedPtr\<System::Xml::Schema::XmlSchemaSet\> | 包含用于验证在 [XPathNavigator](../) 中包含的 XML 数据的模式的 XmlSchemaSet。 |
| validationEventHandler | System::Xml::Schema::ValidationEventHandler | ValidationEventHandler 用于接收有关模式验证警告和错误的信息。 |

### ReturnValue

**true** if no schema validation errors occurred; otherwise, **false**.

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../../system.xml.schema/xmlschemaset/)
* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
