---
title: "طريقة System::Xml::Schema::XmlSchemaValidator::ValidateElement"
linktitle: "ValidateElement"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::Schema::XmlSchemaValidator::ValidateElement. تتحقق من صحة العنصر في السياق الحالي في C++."
type: docs
weight: 1700
url: /ar/cpp/system.xml.schema/xmlschemavalidator/validateelement/
---
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


يتحقق من العنصر في السياق الحالي.

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| localName | const String\& | الاسم المحلي للعنصر المراد التحقق منه. |
| namespaceUri | const String\& | معرّف URI للمساحة الاسمية للعنصر المراد التحقق منه. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | كائن [XmlSchemaInfo](../../xmlschemainfo/) تُضبط خصائصه عند نجاح التحقق من اسم العنصر. يمكن أن تكون هذه المعلمة **nullptr**. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) method


يتحقق من العنصر في السياق الحالي مع قيم السمات **xsi:Type**، **xsi:Nil**، **xsi:SchemaLocation**، و**xsi:NoNamespaceSchemaLocation** المحددة.

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo, const String &xsiType, const String &xsiNil, const String &xsiSchemaLocation, const String &xsiNoNamespaceSchemaLocation)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| localName | const String\& | الاسم المحلي للعنصر المراد التحقق منه. |
| namespaceUri | const String\& | معرّف URI للمساحة الاسمية للعنصر المراد التحقق منه. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | كائن [XmlSchemaInfo](../../xmlschemainfo/) تُضبط خصائصه عند نجاح التحقق من اسم العنصر. يمكن أن تكون هذه المعلمة **nullptr**. |
| xsiType | const String\& | قيمة السمة **xsi:Type** للعنصر. يمكن أن تكون هذه المعلمة **nullptr**. |
| xsiNil | const String\& | قيمة السمة **xsi:Nil** للعنصر. يمكن أن تكون هذه المعلمة **nullptr**. |
| xsiSchemaLocation | const String\& | قيمة سمة **xsi:SchemaLocation** للعنصر. يمكن أن تكون هذه المعلمة **nullptr**. |
| xsiNoNamespaceSchemaLocation | const String\& | قيمة سمة **xsi:NoNamespaceSchemaLocation** للعنصر. يمكن أن تكون هذه المعلمة **nullptr**. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
