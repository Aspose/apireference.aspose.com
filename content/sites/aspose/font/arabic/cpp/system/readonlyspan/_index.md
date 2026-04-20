---
title: "الفئة System::ReadOnlySpan"
linktitle: "ReadOnlySpan"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::ReadOnlySpan. موجه للاستخدام داخل فئة Span في C++."
type: docs
weight: 5300
url: /ar/cpp/system/readonlyspan/
---
## ReadOnlySpan class


موجه للاستخدام داخل فئة [Span](../span/).

```cpp
template<typename T>class ReadOnlySpan : public System::Details::SpanCore<const T, ReadOnlySpan<T>, Span<T>>
```


| معامل | الوصف |
| --- | --- |
| T | نوع العناصر في الـ span. توفر هذه الفئة طريقة آمنة من النوع للعمل مع تسلسلات متصلة من الكائنات بطريقة للقراءة فقط. يمكن استخدامها لتغليف المصفوفات، مصفوفات المكدس، أو المؤشرات الخام مع الحفاظ على فحص الحدود. الـ [ReadOnlySpan](./) لا يمتلك الذاكرة التي يشير إليها - إنه مجرد عرض للذاكرة الموجودة. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [ReadOnlySpan](./readonlyspan/)(const Span\<T\>\&) | يبني span للقراءة فقط من span عادي. |
| static [to_ReadOnlySpan](./to_readonlyspan/)(const typename BaseType::ArrayPtrT\&) | يحوّل مصفوفة إلى [ReadOnlySpan](./). |
## ملاحظات


يمثل منطقة متصلة للقراءة فقط من ذاكرة عشوائية.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
