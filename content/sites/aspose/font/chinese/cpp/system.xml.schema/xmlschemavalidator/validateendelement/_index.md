---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateEndElement 方法"
linktitle: "ValidateEndElement"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateEndElement 方法。对于具有简单内容的元素，验证元素的文本内容是否符合其数据类型；对于具有复杂内容的元素，验证当前元素的内容是否完整（C++）。"
type: docs
weight: 1800
url: /zh/cpp/system.xml.schema/xmlschemavalidator/validateendelement/
---
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&) method


验证具有简单内容的元素的文本内容是否符合其数据类型，并验证具有复杂内容的元素的当前内容是否完整。

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | 一个在成功验证元素后其属性被设置的 [XmlSchemaInfo](../../xmlschemainfo/) 对象。此参数可以为 **nullptr**。 |

### ReturnValue

如果元素具有简单内容，则为该元素解析后的已类型化文本值。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) method


验证指定元素的文本内容是否符合其数据类型。

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo, const SharedPtr<Object> &typedValue)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | 一个在成功验证元素文本内容后其属性被设置的 [XmlSchemaInfo](../../xmlschemainfo/) 对象。此参数可以为 **nullptr**。 |
| typedValue | const SharedPtr\<Object\>\& | 元素的已类型化文本内容。 |

### ReturnValue

元素的已解析、已类型化的简单内容。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
