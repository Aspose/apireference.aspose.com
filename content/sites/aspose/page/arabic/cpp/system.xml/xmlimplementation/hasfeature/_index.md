---
title: "System::Xml::XmlImplementation::HasFeature طريقة"
linktitle: "HasFeature"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlImplementation::HasFeature طريقة. يختبر ما إذا كان تنفيذ Document Object Model (DOM) يدعم ميزة معينة في C++."
type: docs
weight: 300
url: /ar/cpp/system.xml/xmlimplementation/hasfeature/
---
## XmlImplementation::HasFeature method


يختبر ما إذا كان تنفيذ Document [Object](../../../system/object/) Model (DOM) يدعم ميزة معينة.

```cpp
bool System::Xml::XmlImplementation::HasFeature(const String &strFeature, const String &strVersion)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| strFeature | const String\& | اسم الحزمة للميزة التي سيتم اختبارها. هذا الاسم غير حساس لحالة الأحرف. |
| strVersion | const String\& | هذا هو رقم الإصدار لاسم الحزمة للاختبار. إذا لم يتم تحديد الإصدار (**nullptr**)، فإن دعم أي إصدار من الميزة يتسبب في أن تُعيد الطريقة **true**. |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## ملاحظات



الجدول التالي يُظهر التركيبات التي تجعل **HasFeature** تُعيد **true**. |||
|-|-|
| strFeature | strVersion |
| XML | 1.0 |
| XML | 2.0 |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlImplementation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
