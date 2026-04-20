---
title: "System::Xml::ValidationType enum"
linktitle: "ValidationType"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::ValidationType enum. يحدد نوع التحقق الذي يجب إجراؤه في C++."
type: docs
weight: 5500
url: /ar/cpp/system.xml/validationtype/
---
## ValidationType enum


يحدد نوع التحقق الذي سيتم إجراؤه.

```cpp
enum class ValidationType
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| None | 0 | لا يتم إجراء أي تحقق، ولا يتم إلقاء أي أخطاء تحقق. هذا الإعداد ينشئ محللًا غير متحقق متوافقًا مع XML 1.0. |
| Auto | 1 | يتحقق إذا تم العثور على معلومات DTD أو المخطط. |
| DTD | 2 | يتحقق وفقًا لـ DTD. |
| XDR | 3 | تحقق وفقًا لمخططات XML-Data Reduced (XDR)، بما في ذلك مخططات XDR المضمنة. يتم التعرف على مخططات XDR باستخدام بادئة مساحة الاسم **x-schema** أو قيمة [XmlValidatingReader::get_Schemas](../xmlvalidatingreader/get_schemas/). |
| Schema | 4 | تحقق وفقًا لمخططات لغة تعريف XML [Schema](../../system.xml.schema/) (XSD)، بما في ذلك مخططات XML المضمنة. يتم ربط مخططات XML بعناوين URI لمساحات الاسم إما باستخدام السمة **schemaLocation** أو **Schemas** المقدمة. |

## انظر أيضًا

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
