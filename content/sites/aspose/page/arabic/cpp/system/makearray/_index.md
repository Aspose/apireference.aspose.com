---
title: "System::MakeArray طريقة"
linktitle: "إنشاء مصفوفة"
second_title: "Aspose.Page لـ C++"
description: "System::MakeArray طريقة. دالة مصنع تُنشئ كائن Array جديدًا تمرّر الوسائط المحددة إلى مُنشئه في C++."
type: docs
weight: 24000
url: /ar/cpp/system/makearray/
---
## System::MakeArray(Args\&&...) method


دالة مصنع تُنشئ كائنًا جديدًا من [Array](../array/) تمرّر الوسائط المحددة إلى مُنشئه.

```cpp
template<class T,class...> ArrayPtr<T> System::MakeArray(Args &&... args)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع عناصر كائن [Array](../array/) الذي تُنشئه الدالة |

| Parameter | Type | الوصف |
| --- | --- | --- |
| args | Args\&&... | الوسائط التي تُمرَّر إلى مُنشئ كائن [Array](../array/) الجاري إنشاؤه |

### ReturnValue

مؤشر ذكي يشير إلى كائن [Array](../array/) المُنشأ

## انظر أيضًا

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeArray(Integral, Args\&&...) method


دالة مصنع تُنشئ كائنًا جديدًا من [Array](../array/) تمرّر الوسائط المحددة إلى مُنشئه.

```cpp
template<class T,class Integral,class...> std::enable_if<std::is_integral<Integral>::value, ArrayPtr<T>>::type System::MakeArray(Integral size, Args &&... args)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع عناصر كائن [Array](../array/) الذي تُنشئه الدالة |
| Integral | نوع حجم المصفوفة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| size | Integral | حجم المصفوفة التي يتم إنشاؤها. |
| args | Args\&&... | الوسائط التي تُمرَّر إلى مُنشئ كائن [Array](../array/) الجاري إنشاؤه |

### ReturnValue

مؤشر ذكي يشير إلى كائن [Array](../array/) المُنشأ

## انظر أيضًا

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeArray(std::initializer_list\<T\>) method


دالة مصنع تُنشئ كائنًا جديدًا من [Array](../array/)، تُملأه بالعناصر من قائمة التهيئة المحددة وتُعيد مؤشرًا ذكيًا يشير إلى كائن [Array](../array/).

```cpp
template<typename T> ArrayPtr<T> System::MakeArray(std::initializer_list<T> init)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع عناصر كائن [Array](../array/) الذي تُنشئه الدالة |

| Parameter | Type | الوصف |
| --- | --- | --- |
| init | std::initializer_list\<T\> | قائمة التهيئة التي تحتوي على العناصر لملء المصفوفة بها |

### ReturnValue

مؤشر ذكي يشير إلى كائن [Array](../array/) المُنشأ

## انظر أيضًا

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
