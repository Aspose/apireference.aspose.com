---
title: "تعداد System::Xml::Schema::XmlSchemaValidationFlags"
linktitle: "XmlSchemaValidationFlags"
second_title: "Aspose.Font لـ C++"
description: "تعداد System::Xml::Schema::XmlSchemaValidationFlags. يحدد خيارات التحقق من صحة المخطط المستخدمة من قبل فئتي XmlSchemaValidator و XmlReader في C++."
type: docs
weight: 7900
url: /ar/cpp/system.xml.schema/xmlschemavalidationflags/
---
## XmlSchemaValidationFlags enum


يحدد خيارات التحقق من صحة المخطط المستخدمة من قبل الفئات [XmlSchemaValidator](../xmlschemavalidator/) و [XmlReader](../../system.xml/xmlreader/).

```cpp
enum class XmlSchemaValidationFlags
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| None | 0 | لا تقم بمعالجة قيود الهوية، المخططات المضمنة، تلميحات موقع المخطط، أو الإبلاغ عن تحذيرات التحقق من صحة المخطط. |
| ProcessInlineSchema | 1 | معالجة المخططات المضمنة التي تم مواجهتها أثناء التحقق. |
| ProcessSchemaLocation | 2 | معالجة تلميحات موقع المخطط (**xsi:schemaLocation**, **xsi:noNamespaceSchemaLocation**) التي تم مواجهتها أثناء التحقق. |
| ReportValidationWarnings | 4 | الإبلاغ عن تحذيرات التحقق من صحة المخطط التي تم مواجهتها أثناء التحقق. |
| ProcessIdentityConstraints | 8 | معالجة قيود الهوية (**xs:ID**, **xs:IDREF**, **xs:key**, **xs:keyref**, **xs:unique**) التي تم مواجهتها أثناء التحقق. |
| AllowXmlAttributes | 16 | السماح بسمات xml:* حتى إذا لم يتم تعريفها في المخطط. سيتم التحقق من صحة السمات بناءً على نوع البيانات الخاص بها. |

## انظر أيضًا

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
