---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateEndElement 方法"
linktitle: "ValidateEndElement"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateEndElement 方法。验证对于具有简单内容的元素，其文本内容是否符合其数据类型；并验证对于具有复杂内容的元素，当前元素的内容是否完整（C++）。"
type: docs
weight: 1800
url: /zh/cpp/system.xml.schema/xmlschemavalidator/validateendelement/
---
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&) method


对于具有简单内容的元素，验证该元素的文本内容是否符合其数据类型；对于具有复杂内容的元素，验证当前元素的内容是否完整。

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | 一个 [XmlSchemaInfo](../../xmlschemainfo/) 对象，其属性在元素成功验证后被设置。此参数可以为 **nullptr**。 |

### ReturnValue

如果元素具有简单内容，则该元素的已解析、已类型化的文本值。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) method


验证指定元素的文本内容是否符合其数据类型。

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo, const SharedPtr<Object> &typedValue)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | 一个 [XmlSchemaInfo](../../xmlschemainfo/) 对象，其属性在元素文本内容成功验证后被设置。此参数可以为 **nullptr**。 |
| typedValue | const SharedPtr\<Object\>\& | 元素的已类型化文本内容。 |

### ReturnValue

元素的已解析、已类型化的简单内容。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
