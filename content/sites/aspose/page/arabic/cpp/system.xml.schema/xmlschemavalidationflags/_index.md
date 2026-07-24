---
title: "System::Xml::Schema::XmlSchemaValidationFlags تعداد"
linktitle: "XmlSchemaValidationFlags"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlSchemaValidationFlags تعداد. يحدد خيارات التحقق من صحة المخطط المستخدمة بواسطة فئات XmlSchemaValidator و XmlReader في C++."
type: docs
weight: 7900
url: /ar/cpp/system.xml.schema/xmlschemavalidationflags/
---
## XmlSchemaValidationFlags enum


يحدد خيارات التحقق من صحة المخطط المستخدمة بواسطة فئات [XmlSchemaValidator](../xmlschemavalidator/) و [XmlReader](../../system.xml/xmlreader/).

```cpp
enum class XmlSchemaValidationFlags
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| لا شيء | 0 | لا تقم بمعالجة قيود الهوية، المخططات المضمنة، تلميحات موقع المخطط، أو الإبلاغ عن تحذيرات التحقق من صحة المخطط. |
| ProcessInlineSchema | 1 | معالجة المخططات المضمنة التي تم العثور عليها أثناء التحقق. |
| ProcessSchemaLocation | 2 | معالجة تلميحات موقع المخطط (**xsi:schemaLocation**, **xsi:noNamespaceSchemaLocation**) التي تم العثور عليها أثناء التحقق. |
| ReportValidationWarnings | 4 | الإبلاغ عن تحذيرات التحقق من صحة المخطط التي تم العثور عليها أثناء التحقق. |
| ProcessIdentityConstraints | 8 | معالجة قيود الهوية (**xs:ID**, **xs:IDREF**, **xs:key**, **xs:keyref**, **xs:unique**) التي تم العثور عليها أثناء التحقق. |
| AllowXmlAttributes | 16 | السماح بسمات xml:* حتى وإن لم تكن معرفة في المخطط. سيتم التحقق من صحة السمات بناءً على نوع البيانات الخاص بها. |

## انظر أيضًا

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
