---
title: "System::Xml::XmlNameTable::Get طريقة"
linktitle: "احصل على"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlNameTable::Get طريقة. عند تجاوزها في فئة مشتقة، تحصل على السلسلة المذرة التي تحتوي على نفس الأحرف كما في النطاق المحدد من الأحرف في المصفوفة المعطاة في C++."
type: docs
weight: 200
url: /ar/cpp/system.xml/xmlnametable/get/
---
## XmlNameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


عند تجاوزها في فئة مشتقة، تسترجع السلسلة المذرة التي تحتوي على نفس الأحرف كما في النطاق المحدد من الأحرف في المصفوفة المعطاة.

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مصفوفة | const ArrayPtr\<char16_t\>\& | مصفوفة الأحرف التي تحتوي على الاسم للبحث عنه. |
| إزاحة | int32_t | الفهرس الصفري في المصفوفة الذي يحدد الحرف الأول من الاسم. |
| الطول | int32_t | عدد الأحرف في الاسم. |

### ReturnValue

السلسلة المذرة أو **nullptr** إذا لم يتم إذابة السلسلة مسبقًا. إذا كان **length** صفرًا، يتم إرجاع [String::Empty](../../../system/string/empty/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNameTable::Get(const String\&) method


عند تجاوزها في فئة مشتقة، تسترجع السلسلة المذرة التي تحتوي على نفس القيمة كالسلـسلة المحددة.

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const String &array)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مصفوفة | const String\& | الاسم للبحث عنه. |

### ReturnValue

السلسلة المذرة أو **nullptr** إذا لم يتم إذابة السلسلة مسبقًا.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
