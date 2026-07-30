---
title: "طريقة System::Xml::XmlImplementation::HasFeature"
linktitle: "HasFeature"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlImplementation::HasFeature طريقة. يختبر ما إذا كان تنفيذ نموذج كائن المستند (DOM) يدعم ميزة محددة في C++."
type: docs
weight: 300
url: /ar/cpp/system.xml/xmlimplementation/hasfeature/
---
## XmlImplementation::HasFeature method


يختبر ما إذا كان تنفيذ نموذج المستند [Object](../../../system/object/) (DOM) يدعم ميزة محددة.

```cpp
bool System::Xml::XmlImplementation::HasFeature(const String &strFeature, const String &strVersion)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| strFeature | const String\& | اسم الحزمة للميزة التي سيتم اختبارها. هذا الاسم غير حساس لحالة الأحرف. |
| strVersion | const String\& | هذا هو رقم الإصدار لاسم الحزمة الذي سيتم اختباره. إذا لم يتم تحديد الإصدار (**nullptr**)، فإن دعم أي إصدار من الميزة يجعل الطريقة تُعيد **true**. |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## ملاحظات



الجدول التالي يوضح التركيبات التي تجعل **HasFeature** تُعيد **true**. |||
|-|-|
| strFeature | strVersion |
| XML | 1.0 |
| XML | 2.0 |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlImplementation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
