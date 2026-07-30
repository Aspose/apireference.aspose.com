---
title: "طريقة System::Xml::Schema::XmlSchemaValidator::ValidateEndElement"
linktitle: "ValidateEndElement"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::Schema::XmlSchemaValidator::ValidateEndElement. تتحقق مما إذا كان محتوى النص للعنصر صالحًا وفقًا لنوع بياناته للعناصر ذات المحتوى البسيط، وتتحقق مما إذا كان محتوى العنصر الحالي مكتملًا للعناصر ذات المحتوى المعقد في C++."
type: docs
weight: 1800
url: /ar/cpp/system.xml.schema/xmlschemavalidator/validateendelement/
---
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&) method


يتحقق مما إذا كان محتوى النص للعنصر صالحًا وفقًا لنوع البيانات الخاص به للعناصر ذات المحتوى البسيط، ويتحقق مما إذا كان محتوى العنصر الحالي مكتملًا للعناصر ذات المحتوى المعقد.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | كائن [XmlSchemaInfo](../../xmlschemainfo/) تُضبط خصائصه عند نجاح التحقق من صحة العنصر. يمكن أن تكون هذه المعلمة **nullptr**. |

### ReturnValue

قيمة النص المُحلَّلة والمُعرفة للعنصر إذا كان العنصر يحتوي على محتوى بسيط.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) method


يتحقق مما إذا كان محتوى النص للعنصر المحدد صالحًا وفقًا لنوع البيانات الخاص به.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo, const SharedPtr<Object> &typedValue)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | كائن [XmlSchemaInfo](../../xmlschemainfo/) تُضبط خصائصه عند نجاح التحقق من صحة محتوى النص للعنصر. يمكن أن تكون هذه المعلمة **nullptr**. |
| typedValue | const SharedPtr\<Object\>\& | محتوى النص المُعرف للعنصر. |

### ReturnValue

المحتوى البسيط المُحلَّل والمُعرف للعنصر.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
