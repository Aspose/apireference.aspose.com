---
title: "تعداد System::Xml::DtdProcessing"
linktitle: "DtdProcessing"
second_title: "Aspose.Font لـ C++"
description: "تعداد System::Xml::DtdProcessing. يحدد الخيارات لمعالجة DTDs. يُستخدم تعداد DtdProcessing بواسطة فئة XmlReaderSettings في C++."
type: docs
weight: 4700
url: /ar/cpp/system.xml/dtdprocessing/
---
## DtdProcessing enum


يحدد الخيارات لمعالجة DTDs. يُستخدم تعداد [DtdProcessing](./) بواسطة فئة [XmlReaderSettings](../xmlreadersettings/).

```cpp
enum class DtdProcessing
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| Prohibit | 0 | يحدد أنه عند مواجهة DTD، يتم إلقاء [XmlException](../xmlexception/) برسالة تفيد بأن DTDs محظورة. هذا هو السلوك الافتراضي. |
| تجاهل | 1 | يتسبب في تجاهل عنصر DOCTYPE. لا يحدث أي معالجة لـ DTD، ويتم فقدان DTD/DOCTYPE في المخرجات. |
| تحليل | 2 | يُستخدم لتحليل ملفات DTD. |

## انظر أيضًا

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
