---
title: "طريقة System::Xml::XmlNameTable::Add"
linktitle: "Add"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlNameTable::Add. عند تجاوزها في فئة مشتقة، تقوم بتجزيء السلسلة المحددة وتضيفها إلى XmlNameTable في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml/xmlnametable/add/
---
## XmlNameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


عند تجاوزها في فئة مشتقة، تقوم بتجزيء السلسلة المحددة وتضيفها إلى [XmlNameTable](../).

```cpp
virtual const String & System::Xml::XmlNameTable::Add(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| مصفوفة | const ArrayPtr\<char16_t\>\& | مصفوفة الأحرف التي تحتوي على الاسم المراد إضافته. |
| الإزاحة | int32_t | فهرس يبدأ من الصفر في المصفوفة يحدد الحرف الأول من الاسم. |
| الطول | int32_t | عدد الأحرف في الاسم. |

### ReturnValue

السلسلة المجزأة الجديدة أو الموجودة إذا كانت موجودة بالفعل. إذا كان الطول صفرًا، يتم إرجاع [String::Empty](../../../system/string/empty/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNameTable::Add(const String\&) method


عند تجاوزها في فئة مشتقة، تقوم بتجزيء السلسلة المحددة وتضيفها إلى [XmlNameTable](../).

```cpp
virtual const String & System::Xml::XmlNameTable::Add(const String &array)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| مصفوفة | const String\& | الاسم المراد إضافته. |

### ReturnValue

السلسلة المجزأة الجديدة أو الموجودة إذا كانت موجودة بالفعل.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
