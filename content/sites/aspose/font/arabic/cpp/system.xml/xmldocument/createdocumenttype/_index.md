---
title: "طريقة System::Xml::XmlDocument::CreateDocumentType"
linktitle: "CreateDocumentType"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlDocument::CreateDocumentType. تُرجع كائن XmlDocumentType جديد في C++."
type: docs
weight: 700
url: /ar/cpp/system.xml/xmldocument/createdocumenttype/
---
## XmlDocument::CreateDocumentType method


تُرجع كائنًا جديدًا من نوع [XmlDocumentType](../../xmldocumenttype/).

```cpp
virtual SharedPtr<XmlDocumentType> System::Xml::XmlDocument::CreateDocumentType(const String &name, const String &publicId, const String &systemId, const String &internalSubset)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| name | const String\& | اسم نوع المستند. |
| publicId | const String\& | المعرّف العام لنوع المستند أو **nullptr**. يمكنك تحديد URI عام وأيضًا معرف نظام لتحديد موقع مجموعة DTD الخارجية. |
| systemId | const String\& | معرّف النظام لنوع المستند أو **nullptr**. يحدد عنوان URL لموقع الملف لمجموعة DTD الخارجية. |
| internalSubset | const String\& | المجموعة الداخلية لـ DTD لنوع المستند أو **nullptr**. |

### ReturnValue

الكائن الجديد [XmlDocumentType](../../xmldocumenttype/).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlDocumentType](../../xmldocumenttype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
