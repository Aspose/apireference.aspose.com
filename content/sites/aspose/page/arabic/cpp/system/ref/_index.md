---
title: "طريقة System::Ref"
linktitle: "Ref"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Ref. غلاف لضمان عمل Ref(std::ref(DynamicWeakPtr)) في C++."
type: docs
weight: 36600
url: /ar/cpp/system/ref/
---
## System::Ref(const std::reference_wrapper\<T\>\&) method


غلاف لضمان عمل Ref(std::ref(DynamicWeakPtr)).

```cpp
template<typename T> decltype(Ref(std::declval<T &>())) System::Ref(const std::reference_wrapper<T> &wrapper)
```


| Parameter | الوصف |
| --- | --- |
| T | النوع المشار إليه. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| غلاف | const std::reference_wrapper\<T\>\& | غلاف std لفك التغليف. |

### ReturnValue

نوع المرجع معرف في [System](../):: بدلاً من std.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Ref(DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\&) method


ينشئ مرجعًا إلى كائن [DynamicWeakPtr](../dynamicweakptr/). يُستخدم من قبل المترجم عند تمرير معاملات الدالة بالمرجع.

```cpp
template<typename T,SmartPtrMode,unsigned int ...> DynamicWeakPtr<T, trunkMode, weakLeafs...>::Reference System::Ref(DynamicWeakPtr<T, trunkMode, weakLeafs...> &ptr)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع المؤشر إليه. |
| trunkMode | وضع المؤشر الذكي نفسه. |
| weakLeafs | فهارس معاملات القالب التي يجب استدعاء طريقة SetTemplateWeakPtr لها. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| ptr | DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\& | مؤشر ذكي لإنشاء مرجع إلى. |

### ReturnValue

مرجع المؤشر الذكي.

## انظر أيضًا

* Class [DynamicWeakPtr](../dynamicweakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Ref(T\&) method


دالة مساعدة للحصول على مراجع إلى الكائنات. تُستخدم لضمان أن [System::DynamicWeakPtr](../dynamicweakptr/) يحدث الكائن المشار إليه بعد عمليات الإسناد.

```cpp
template<typename T> T & System::Ref(T &value)
```


| Parameter | الوصف |
| --- | --- |
| T | النوع لإنشاء مرجع إليه. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | T\& | القيمة لإنشاء مرجع إليها. |

### ReturnValue

مرجع إلى القيمة التي تم تمريرها إلى هذه الدالة.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
