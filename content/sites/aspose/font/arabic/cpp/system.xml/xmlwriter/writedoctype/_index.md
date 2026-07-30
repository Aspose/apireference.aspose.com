---
title: "طريقة System::Xml::XmlWriter::WriteDocType"
linktitle: "WriteDocType"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlWriter::WriteDocType. عند تجاوزها في فئة مشتقة، تقوم بكتابة إعلان DOCTYPE بالاسم المحدد والسمات الاختيارية في C++."
type: docs
weight: 1700
url: /ar/cpp/system.xml/xmlwriter/writedoctype/
---
## XmlWriter::WriteDocType method


عند تجاوزها في فئة مشتقة، تكتب إعلان DOCTYPE بالاسم المحدد والسمات الاختيارية.

```cpp
virtual void System::Xml::XmlWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| name | const String\& | اسم DOCTYPE. يجب أن يكون غير فارغ. |
| pubid | const String\& | إذا لم يكن فارغًا، فإنه يكتب أيضًا PUBLIC \"pubid\" \"sysid\" حيث يتم استبدال **pubid** و **sysid** بقيمة المعاملات المقدمة. |
| sysid | const String\& | إذا كان **pubid** هو **nullptr** و **sysid** غير فارغ فإنه يكتب SYSTEM \"sysid\" حيث يتم استبدال **sysid** بقيمة هذا الوسيط. |
| subset | const String\& | إذا كان غير فارغ يكتب [subset] حيث يتم استبدال subset بقيمة هذا الوسيط. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
