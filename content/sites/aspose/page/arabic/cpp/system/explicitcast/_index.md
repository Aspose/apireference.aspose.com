---
title: "طريقة System::ExplicitCast"
linktitle: "تحويل صريح"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::ExplicitCast. تقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام التحويل الصريح. تُستخدم عندما يكون نوع المصدر ونوع النتيجة متماثلين في C++."
type: docs
weight: 18500
url: /ar/cpp/system/explicitcast/
---
## System::ExplicitCast(const Source\&) method


تحول نوع المصدر إلى نوع النتيجة باستخدام التحويل الصريح. تُستخدم عندما يكون نوع المصدر ونوع النتيجة متماثلين.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::ExplicitCast(const Source &value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Enum [Base64FormattingOptions](../base64formattingoptions/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


تحول نوع المصدر إلى نوع النتيجة باستخدام التحويل الصريح. تُستخدم عندما يكون هناك حاجة إلى تحويل بسيط يشبه المُنشئ.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::ExplicitCast(const Source &value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


تحول نوع المصدر إلى نوع النتيجة باستخدام التحويل الصريح. تُستخدم لأغلفة الاستثناءات.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::ExplicitCast(const Source &value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


تحول نوع المصدر إلى نوع النتيجة باستخدام التحويل الصريح. تُستخدم لتحويل الكائن إلى استثناء.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::ExplicitCast(const Source &value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


تحول نوع المصدر إلى نوع النتيجة باستخدام التحويل الصريح. تُستخدم عندما يكون كل من المصدر والنتيجة مؤشرات ذكية (بدون صريح [SmartPtr<...>](../smartptr/) في نوع النتيجة).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


تحول نوع المصدر إلى نوع النتيجة باستخدام التحويل الصريح. تُستخدم عندما يكون كل من المصدر والنتيجة مؤشرات ذكية (مع صريح [SmartPtr<...>](../smartptr/) في نوع النتيجة).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::ExplicitCast(const Source &value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


تحول نوع المصدر إلى نوع النتيجة باستخدام التحويل الصريح. تُستخدم لإلغاء تغليف الكائن إلى قابل للفراغ.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::ExplicitCast(const Source &value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


تحول نوع المصدر إلى نوع النتيجة باستخدام التحويل الصريح. تُستخدم لتغليف القابل للفراغ.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::ExplicitCast(const Source &value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


تحول نوع المصدر إلى نوع النتيجة باستخدام التحويل الصريح. تُستخدم لإلغاء تغليف كائن قابل للفراغ.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableUnboxing, Result> System::ExplicitCast(const Source &value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


تحول نوع المصدر إلى نوع النتيجة باستخدام التحويل الصريح. تُستخدم لتغليف تعداد.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::EnumBoxing, SmartPtr<BoxedValueBase>> System::ExplicitCast(const Source &value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


تحول نوع المصدر إلى نوع النتيجة باستخدام التحويل الصريح. تُستخدم لنسخ الأنواع القيمية إلى الكومة عندما يجب الإشارة إلى النوع القيمي كمؤشر ذكي (في الأنواع العامة المقيدة بنوع واجهة ولكن المتخصصة بهيكل يطبق هذه الواجهة).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::HeapifyBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


تحول نوع المصدر إلى نوع النتيجة باستخدام التحويل الصريح. تُستخدم للحصول على الواجهات من الأنواع القيمية.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


تحول نوع المصدر إلى نوع النتيجة باستخدام التحويل الصريح. تُستخدم لتغليف شائع.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


تحول نوع المصدر إلى نوع النتيجة باستخدام التحويل الصريح. تُستخدم لتغليف [System::String](../string/).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::StringBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


تحول نوع المصدر إلى نوع النتيجة باستخدام التحويل الصريح. تُستخدم لإلغاء تغليف الواجهات.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxing, Result> System::ExplicitCast(const Source &value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


تحول نوع المصدر إلى نوع النتيجة باستخدام التحويل الصريح. تُستخدم لإلغاء تغليف شائع.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Unboxing, Result> System::ExplicitCast(const Source &value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


تحول نوع المصدر إلى نوع النتيجة باستخدام التحويل الصريح. تُستخدم لتحويل nullptr.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


تحول نوع المصدر إلى نوع النتيجة باستخدام التحويل الصريح. تُستخدم للتحويل بين المصفوفات.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(Source) method


تحول نوع المصدر إلى نوع النتيجة باستخدام التحويل الصريح. تُستخدم عند تحويل المؤشر الخام إلى مؤشر ذكي.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::RawPointer, typename CastResult<std::remove_pointer_t<Result>>::type> System::ExplicitCast(Source value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | Source | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
