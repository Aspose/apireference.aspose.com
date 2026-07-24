---
title: "طريقة System::Xml::Schema::XmlSchemaValidator::ValidateEndElement"
linktitle: "ValidateEndElement"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::Schema::XmlSchemaValidator::ValidateEndElement. تتحقق مما إذا كان محتوى النص للعنصر صالحًا وفقًا لنوع البيانات الخاص به للعناصر ذات المحتوى البسيط، وتتحقق مما إذا كان محتوى العنصر الحالي مكتملًا للعناصر ذات المحتوى المعقد في C++."
type: docs
weight: 1800
url: /ar/cpp/system.xml.schema/xmlschemavalidator/validateendelement/
---
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&) method


يتحقق مما إذا كان محتوى النص للعنصر صالحًا وفقًا لنوع بياناته للعناصر ذات المحتوى البسيط، ويتحقق مما إذا كان محتوى العنصر الحالي مكتملًا للعناصر ذات المحتوى المعقد.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | كائن [XmlSchemaInfo](../../xmlschemainfo/) يتم تعيين خصائصه عند نجاح التحقق من صحة العنصر. يمكن أن يكون هذا المعامل **nullptr**. |

### ReturnValue

قيمة النص المُعالجة والمُحددة للعنصر إذا كان العنصر يحتوي على محتوى بسيط.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) method


يتحقق مما إذا كان محتوى النص للعنصر المحدد صالحًا وفقًا لنوع بياناته.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo, const SharedPtr<Object> &typedValue)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | كائن [XmlSchemaInfo](../../xmlschemainfo/) يتم تعيين خصائصه عند نجاح التحقق من صحة محتوى النص للعنصر. يمكن أن يكون هذا المعامل **nullptr**. |
| typedValue | const SharedPtr\<Object\>\& | محتوى النص المُحدد للعنصر. |

### ReturnValue

المحتوى البسيط المُعالج والمُحدد للعنصر.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
