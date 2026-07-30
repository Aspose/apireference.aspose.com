---
title: "System::Xml::Schema::XmlSchemaDatatype::ParseValue طريقة"
linktitle: "ParseValue"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaDatatype::ParseValue طريقة. عند تجاوزها في فئة مشتقة، تتحقق من صحة **string** المحدد مقابل نوع بسيط مدمج أو معرف من قبل المستخدم في C++."
type: docs
weight: 700
url: /ar/cpp/system.xml.schema/xmlschemadatatype/parsevalue/
---
## XmlSchemaDatatype::ParseValue method


عند تجاوزها في فئة مشتقة، تتحقق من صحة الـ **string** المحدد مقابل نوع بسيط مدمج أو معرف من قبل المستخدم.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ParseValue(String s, SharedPtr<XmlNameTable> nameTable, SharedPtr<IXmlNamespaceResolver> nsmgr)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| s | String | ‏**string** للتحقق من صحتها مقابل النوع البسيط. |
| nameTable | SharedPtr\<XmlNameTable\> | ‏[XmlNameTable](../../../system.xml/xmlnametable/) لاستخدامه في التجزئة أثناء تحليل **string** إذا كان كائن [XmlSchemaDatatype](../) يمثل النوع **xs:NCName**. |
| nsmgr | SharedPtr\<IXmlNamespaceResolver\> | ‏[IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) كائن لاستخدامه أثناء تحليل **string** إذا كان كائن [XmlSchemaDatatype](../) يمثل النوع **xs:QName**. |

### ReturnValue

‏[Object](../../../system/object/) يمكن تحويله بأمان إلى النوع الذي تُعيده استدعاء [XmlSchemaDatatype::get_ValueType](../get_valuetype/).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlNameTable](../../../system.xml/xmlnametable/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
