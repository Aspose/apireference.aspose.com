---
title: "System::Xml::XmlTextWriter::WriteDocType طريقة"
linktitle: "WriteDocType"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlTextWriter::WriteDocType طريقة. يكتب إعلان DOCTYPE بالاسم المحدد والسمات الاختيارية في C++."
type: docs
weight: 2500
url: /ar/cpp/system.xml/xmltextwriter/writedoctype/
---
## XmlTextWriter::WriteDocType method


يكتب إعلان DOCTYPE بالاسم المحدد والسمات الاختيارية.

```cpp
void System::Xml::XmlTextWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| name | const String\& | اسم DOCTYPE. يجب أن يكون غير فارغ. |
| pubid | const String\& | إذا لم يكن فارغًا، فإنه يكتب أيضًا PUBLIC \"pubid\" \"sysid\" حيث يتم استبدال **pubid** و **sysid** بقيمة المعاملات المقدمة. |
| sysid | const String\& | إذا كان **pubid** فارغًا وكان **sysid** غير فارغ يكتب SYSTEM \"sysid\" حيث يتم استبدال **sysid** بقيمة هذا الوسيط. |
| subset | const String\& | إذا كان غير فارغ يكتب [subset] حيث يتم استبدال subset بقيمة هذا الوسيط. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
