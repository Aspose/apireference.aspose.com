---
title: "System::Xml::ValidationType enum"
linktitle: "ValidationType"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::ValidationType enum. يحدد نوع التحقق الذي يجب إجراؤه في C++."
type: docs
weight: 5500
url: /ar/cpp/system.xml/validationtype/
---
## ValidationType enum


يحدد نوع التحقق الذي يجب إجراؤه.

```cpp
enum class ValidationType
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| لا شيء | 0 | لا يتم إجراء أي تحقق، ولا يتم إلقاء أخطاء التحقق. هذا الإعداد ينشئ محلل غير متحقق يتوافق مع XML 1.0. |
| Auto | 1 | يتحقق إذا تم العثور على معلومات DTD أو مخطط. |
| DTD | 2 | يتحقق وفقًا لـ DTD. |
| XDR | 3 | تحقق وفقًا لمخططات XML-Data Reduced (XDR)، بما في ذلك مخططات XDR المضمنة. يتم التعرف على مخططات XDR باستخدام بادئة مساحة الاسم **x-schema** أو قيمة [XmlValidatingReader::get_Schemas](../xmlvalidatingreader/get_schemas/). |
| Schema | 4 | تحقق وفقًا للغة تعريف مخططات XML [Schema](../../system.xml.schema/) (XSD)، بما في ذلك مخططات XML المضمنة. يتم ربط مخططات XML بعناوين URI لمساحات الاسم إما باستخدام السمة **schemaLocation** أو **Schemas** المقدمة. |

## انظر أيضًا

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
