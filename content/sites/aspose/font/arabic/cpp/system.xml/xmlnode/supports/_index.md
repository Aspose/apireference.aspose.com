---
title: "طريقة System::Xml::XmlNode::Supports"
linktitle: "Supports"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlNode::Supports. تختبر ما إذا كان تنفيذ DOM يدعم ميزة محددة في C++."
type: docs
weight: 4400
url: /ar/cpp/system.xml/xmlnode/supports/
---
## XmlNode::Supports method


يفحص ما إذا كان تنفيذ DOM يدعم ميزة معينة.

```cpp
virtual bool System::Xml::XmlNode::Supports(String feature, String version)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| ميزة | String | اسم الحزمة للميزة التي سيتم اختبارها. هذا الاسم غير حساس لحالة الأحرف. |
| إصدار | String | رقم الإصدار لاسم الحزمة المراد اختباره. إذا لم يُحدد الإصدار (null)، فإن دعم أي إصدار من الميزة يجعل الطريقة تُرجع true. |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## ملاحظات



الجدول التالي يصف التركيبات التي تُعيد **true**. |||
|-|-|
| ميزة | الإصدار |
| XML | 1.0 |
| XML | 2.0 |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
