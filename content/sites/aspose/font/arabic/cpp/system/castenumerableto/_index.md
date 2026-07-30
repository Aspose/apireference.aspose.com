---
title: "طريقة System::CastEnumerableTo"
linktitle: "CastEnumerableTo"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::CastEnumerableTo. تقوم بالتحويل الصريح لعناصر الكائن القابل للتعداد المحدد إلى نوع مختلف في C++."
type: docs
weight: 15600
url: /ar/cpp/system/castenumerableto/
---
## System::CastEnumerableTo(const From\&) method


تقوم بالتحويل الصريح لعناصر الكائن القابل للتعداد المحدد إلى نوع مختلف.

```cpp
template<class To,class From> std::enable_if<!System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| معامل | الوصف |
| --- | --- |
| إلى | النوع الذي سيُحوَّل إليه عناصر الكائن القابل للتعداد بشكل ثابت |
| From | نوع الكائن القابل للتعداد |

| معامل | نوع | الوصف |
| --- | --- | --- |
| قابل للتعداد | const From\\& | كائن قابل للتعداد يحتوي على العناصر التي سيتم تحويلها |

### ReturnValue

مؤشر إلى مجموعة جديدة تحتوي على عناصر من النوع **To** مكافئة لعناصر **enumerable**

## انظر أيضًا

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::CastEnumerableTo(const From\&) method


تقوم بالتحويل الصريح لعناصر الكائن القابل للتعداد المحدد إلى نوع مختلف.

```cpp
template<class To,class From> std::enable_if<System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| معامل | الوصف |
| --- | --- |
| إلى | النوع الذي سيُحوَّل إليه عناصر الكائن القابل للتعداد بشكل ثابت |
| From | نوع الكائن القابل للتعداد |

| معامل | نوع | الوصف |
| --- | --- | --- |
| قابل للتعداد | const From\\& | هو وراث لكائن Enumerable مع طريقة get_Count معرفة ويحتوي على العناصر للتحويل |

### ReturnValue

مؤشر إلى مجموعة جديدة تحتوي على عناصر من النوع **To** مكافئة لعناصر **enumerable**

## انظر أيضًا

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
