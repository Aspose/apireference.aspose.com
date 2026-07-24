---
title: "System::Span class"
linktitle: "Span"
second_title: "Aspose.Page لـ C++"
description: "System::Span class. تمثّل منطقة متصلة من الذاكرة العشوائية مشابهة لـ std::span في C++20 في C++."
type: docs
weight: 5700
url: /ar/cpp/system/span/
---
## Span class


يمثل منطقة متصلة من الذاكرة العشوائية مماثلة لـ std::span في C++20.

```cpp
template<typename T>class Span : public System::Details::SpanCore<T, Span<T>, Span<T>>
```


| Parameter | الوصف |
| --- | --- |
| T | نوع العناصر في الـ span. توفر هذه الفئة طريقة آمنة من حيث النوع للعمل مع سلاسل متصلة من الكائنات. يمكن استخدامها لتغليف المصفوفات، مصفوفات المكدس، أو المؤشرات الخام مع الحفاظ على فحص الحدود. الـ [Span](./) لا يمتلك الذاكرة التي يشير إليها - إنه مجرد عرض للذاكرة الموجودة. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clear](./clear/)() const | يمسح محتويات الـ span عن طريق ضبط جميع العناصر على القيمة الافتراضية. |
| [Fill](./fill/)(const T\&) const | يملأ الـ span بالقيمة المحددة. |
| static [to_Span](./to_span/)(const typename BaseType::ArrayPtrT\&) | يحوّل مصفوفة إلى [Span](./). |

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
