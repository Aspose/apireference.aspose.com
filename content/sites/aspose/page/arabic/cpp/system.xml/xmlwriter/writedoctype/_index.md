---
title: "طريقة System::Xml::XmlWriter::WriteDocType"
linktitle: "WriteDocType"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlWriter::WriteDocType. عندما يتم تجاوزها في فئة مشتقة، تكتب إعلان DOCTYPE بالاسم المحدد والسمات الاختيارية في C++."
type: docs
weight: 1700
url: /ar/cpp/system.xml/xmlwriter/writedoctype/
---
## XmlWriter::WriteDocType method


عند تجاوزها في فئة مشتقة، تكتب إعلان DOCTYPE بالاسم المحدد والسمات الاختيارية.

```cpp
virtual void System::Xml::XmlWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | const String\& | اسم DOCTYPE. يجب أن لا يكون فارغًا. |
| pubid | const String\& | إذا لم يكن فارغًا، فإنه يكتب أيضًا PUBLIC "pubid" "sysid" حيث يتم استبدال **pubid** و **sysid** بقيمة الوسائط المعطاة. |
| sysid | const String\& | إذا كان **pubid** هو **nullptr** وكان **sysid** غير فارغ، فإنها تكتب SYSTEM "sysid" حيث يتم استبدال **sysid** بقيمة هذا الوسيط. |
| subset | const String\& | إذا لم يكن فارغًا، فإنه يكتب [subset] حيث يتم استبدال subset بقيمة هذا الوسيط. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
