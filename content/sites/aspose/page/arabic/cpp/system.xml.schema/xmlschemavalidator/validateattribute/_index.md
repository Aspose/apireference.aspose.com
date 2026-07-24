---
title: "طريقة System::Xml::Schema::XmlSchemaValidator::ValidateAttribute"
linktitle: "ValidateAttribute"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::Schema::XmlSchemaValidator::ValidateAttribute. يتحقق من اسم السمة، ومعرف مساحة الاسم، والقيمة في سياق العنصر الحالي في C++."
type: docs
weight: 1600
url: /ar/cpp/system.xml.schema/xmlschemavalidator/validateattribute/
---
## XmlSchemaValidator::ValidateAttribute(const String\&, const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


يتحقق من اسم السمة، ومسار URI للمساحة الاسمية، والقيمة في سياق العنصر الحالي.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateAttribute(const String &localName, const String &namespaceUri, const String &attributeValue, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| localName | const String\& | الاسم المحلي للسمة التي يجب التحقق منها. |
| namespaceUri | const String\& | معرّف URI للمساحة الاسمية للسمة التي يجب التحقق منها. |
| attributeValue | const String\& | قيمة السمة التي يجب التحقق منها. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | كائن [XmlSchemaInfo](../../xmlschemainfo/) تكون خصائصه مُعيَّنة عند التحقق الناجح من السمة. يمكن أن يكون هذا المعامل **nullptr**. |

### ReturnValue

قيمة السمة التي تم التحقق منها.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateAttribute(const String\&, const String\&, XmlValueGetter, const SharedPtr\<XmlSchemaInfo\>\&) method


يتحقق من اسم السمة، ومسار URI للمساحة الاسمية، والقيمة في سياق العنصر الحالي.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateAttribute(const String &localName, const String &namespaceUri, XmlValueGetter attributeValue, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| localName | const String\& | الاسم المحلي للسمة التي يجب التحقق منها. |
| namespaceUri | const String\& | معرّف URI للمساحة الاسمية للسمة التي يجب التحقق منها. |
| attributeValue | XmlValueGetter | استدعاء رد نداء [XmlValueGetter](../../xmlvaluegetter/) يُستخدم لتمرير قيمة السمة كنوع متوافق مع نوع لغة تعريف مخطط XML [Schema](../../) (XSD) الخاص بالسمة. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | كائن [XmlSchemaInfo](../../xmlschemainfo/) تكون خصائصه مُعيَّنة عند التحقق الناجح من السمة. هذا المعامل ويمكن أن يكون **nullptr**. |

### ReturnValue

قيمة السمة التي تم التحقق منها.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Typedef [XmlValueGetter](../../xmlvaluegetter/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
