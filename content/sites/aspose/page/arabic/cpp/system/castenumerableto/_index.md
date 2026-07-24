---
title: "طريقة System::CastEnumerableTo"
linktitle: "CastEnumerableTo"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::CastEnumerableTo. تُجري التحويل الصريح لعناصر الكائن القابل للتعداد المحدد إلى نوع مختلف في C++."
type: docs
weight: 15500
url: /ar/cpp/system/castenumerableto/
---
## System::CastEnumerableTo(const From\&) method


تُجري التحويل الصريح لعناصر الكائن القابل للتعداد المحدد إلى نوع مختلف.

```cpp
template<class To,class From> std::enable_if<!System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Parameter | الوصف |
| --- | --- |
| إلى | النوع الذي سيتم تحويل عناصر الكائن القابل للتعداد إليه بشكل ثابت |
| From | نوع الكائن القابل للتعداد |

| Parameter | Type | الوصف |
| --- | --- | --- |
| قابل للتعداد | const From\& | كائن Enumerable يحتوي على العناصر المراد تحويلها |

### ReturnValue

مؤشر إلى مجموعة جديدة تحتوي على عناصر من النوع **To** مكافئة لعناصر **enumerable**

## انظر أيضًا

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::CastEnumerableTo(const From\&) method


تُجري التحويل الصريح لعناصر الكائن القابل للتعداد المحدد إلى نوع مختلف.

```cpp
template<class To,class From> std::enable_if<System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Parameter | الوصف |
| --- | --- |
| إلى | النوع الذي سيتم تحويل عناصر الكائن القابل للتعداد إليه بشكل ثابت |
| From | نوع الكائن القابل للتعداد |

| Parameter | Type | الوصف |
| --- | --- | --- |
| قابل للتعداد | const From\& | هو وراث لكائن Enumerable مع طريقة get_Count معرفة ويحتوي على العناصر المراد تحويلها |

### ReturnValue

مؤشر إلى مجموعة جديدة تحتوي على عناصر من النوع **To** مكافئة لعناصر **enumerable**

## انظر أيضًا

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
