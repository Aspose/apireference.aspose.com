---
title: "System::Xml::Schema::XmlSeverityType تعداد"
linktitle: "XmlSeverityType"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSeverityType تعداد. يمثل شدة حدث التحقق في C++."
type: docs
weight: 8100
url: /ar/cpp/system.xml.schema/xmlseveritytype/
---
## XmlSeverityType enum


يمثل شدة حدث التحقق.

```cpp
enum class XmlSeverityType
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| Error | 0 | يشير إلى حدوث خطأ في التحقق عند التحقق من مستند الحالة. ينطبق هذا على تعريفات نوع المستند (DTDs) ومخططات لغة تعريف XML [Schema](../) (XSD). تُعتبر قيود الصلاحية الخاصة باتحاد الويب العالمي [Web](../../system.web/) (W3C) أخطاء. إذا لم يتم إنشاء معالج حدث التحقق، فإن الأخطاء تُطلق استثناءً. |
| Warning | 1 | يشير إلى حدوث حدث تحقق ليس خطأ. عادةً ما يتم إصدار تحذير عندما لا يوجد DTD، أو XML [Schema](../) للتحقق من عنصر أو سمة معينة. على عكس الأخطاء، لا تُطلق التحذيرات استثناءً إذا لم يكن هناك معالج حدث تحقق. |

## انظر أيضًا

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
