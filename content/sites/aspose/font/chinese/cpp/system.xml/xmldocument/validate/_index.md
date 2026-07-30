---
title: "System::Xml::XmlDocument::Validate 方法"
linktitle: "验证"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlDocument::Validate 方法。验证 XmlDocument 是否符合 XmlDocument::get_Schemas 列表中包含的 XML 架构定义语言 (XSD) 架构（在 C++ 中）。"
type: docs
weight: 4300
url: /zh/cpp/system.xml/xmldocument/validate/
---
## XmlDocument::Validate(Schema::ValidationEventHandler) method


验证 [XmlDocument](../) 是否符合位于 [XmlDocument::get_Schemas](../get_schemas/) 列表中的 XML [Schema](../../../system.xml.schema/) 定义语言 (XSD) 架构。

```cpp
void System::Xml::XmlDocument::Validate(Schema::ValidationEventHandler validationEventHandler)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| validationEventHandler | Schema::ValidationEventHandler | 接收关于架构验证警告和错误信息的 [Schema::ValidationEventHandler](../../../system.xml.schema/validationeventhandler/) 对象。 |

## 另见

* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::Validate(Schema::ValidationEventHandler, const SharedPtr\<XmlNode\>\&) method


验证指定的 [XmlNode](../../xmlnode/) 对象是否符合位于 [XmlDocument::get_Schemas](../get_schemas/) 列表中的 XML [Schema](../../../system.xml.schema/) 定义语言 (XSD) 架构。

```cpp
void System::Xml::XmlDocument::Validate(Schema::ValidationEventHandler validationEventHandler, const SharedPtr<XmlNode> &nodeToValidate)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| validationEventHandler | Schema::ValidationEventHandler | 接收关于架构验证警告和错误信息的 [Schema::ValidationEventHandler](../../../system.xml.schema/validationeventhandler/) 对象。 |
| nodeToValidate | const SharedPtr\<XmlNode\>\& | 用于验证的从 [XmlDocument](../) 创建的 [XmlNode](../../xmlnode/) 对象。 |

## 另见

* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
