---
title: "الطريقة System::ExplicitCast"
linktitle: "تحويل صريح"
second_title: "Aspose.Font لـ C++"
description: "الطريقة System::ExplicitCast. تحوّل النوع المصدر إلى النوع الناتج باستخدام التحويل الصريح. تُستخدم عندما يكون النوعان المصدر والنتيجة متماثلين في C++."
type: docs
weight: 18600
url: /ar/cpp/system/explicitcast/
---
## System::ExplicitCast(const Source\&) method


تحوّل النوع المصدر إلى النوع الناتج باستخدام التحويل الصريح. تُستخدم عندما يكون النوعان المصدر والنتيجة متماثلين.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::ExplicitCast(const Source &value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Enum [Base64FormattingOptions](../base64formattingoptions/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام تحويل صريح. يُستخدم عندما يكون التحويل البسيط الشبيه بالمُنشئ مطلوبًا.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::ExplicitCast(const Source &value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام تحويل صريح. يُستخدم لأغلفة الاستثناءات.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::ExplicitCast(const Source &value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام تحويل صريح. يُستخدم لتحويل الكائن إلى استثناء.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::ExplicitCast(const Source &value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام تحويل صريح. يُستخدم عندما يكون المصدر والنتيجة كلاهما مؤشرات ذكية (بدون [SmartPtr<...>](../smartptr/) صريح في نوع النتيجة).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام تحويل صريح. يُستخدم عندما يكون المصدر والنتيجة كلاهما مؤشرات ذكية (مع [SmartPtr<...>](../smartptr/) صريح في نوع النتيجة).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::ExplicitCast(const Source &value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام تحويل صريح. يُستخدم لإلغاء تغليف الكائن إلى nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::ExplicitCast(const Source &value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام تحويل صريح. يُستخدم لتغليف nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::ExplicitCast(const Source &value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام تحويل صريح. يُستخدم لإلغاء تغليف كائن nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableUnboxing, Result> System::ExplicitCast(const Source &value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام تحويل صريح. يُستخدم لتغليف enum.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::EnumBoxing, SmartPtr<BoxedValueBase>> System::ExplicitCast(const Source &value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام تحويل صريح. يُستخدم لنسخ الأنواع القيمة إلى الكومة عندما يجب الإشارة إلى نوع القيمة كمؤشر ذكي (في الأنماط العامة المقيدة بنوع الواجهة ولكن المتخصصة بهيكل ينفذ هذه الواجهة).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::HeapifyBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام تحويل صريح. يُستخدم للحصول على الواجهات من الأنواع القيمة.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام تحويل صريح. يُستخدم لتغليف شائع.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام تحويل صريح. يُستخدم لتغليف [System::String](../string/).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::StringBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام تحويل صريح. يُستخدم لإلغاء تغليف الواجهات.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxing, Result> System::ExplicitCast(const Source &value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام تحويل صريح. يُستخدم لإلغاء تغليف شائع.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Unboxing, Result> System::ExplicitCast(const Source &value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام تحويل صريح. يُستخدم لتحويل nullptr.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام تحويل صريح. يُستخدم للتحويل بين المصفوفات.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(Source) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام تحويل صريح. يُستخدم عند تحويل المؤشر الخام إلى مؤشر ذكي.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::RawPointer, typename CastResult<std::remove_pointer_t<Result>>::type> System::ExplicitCast(Source value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | Source | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
