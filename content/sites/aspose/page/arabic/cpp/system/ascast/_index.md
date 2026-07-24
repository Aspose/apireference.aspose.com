---
title: "طريقة System::AsCast"
linktitle: "AsCast"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::AsCast. تحول النوع المصدر إلى نوع النتيجة باستخدام عملية التحويل ''as''. تُستخدم عندما يكون التحويل الشبه بنائي بسيط مطلوبًا في C++."
type: docs
weight: 13500
url: /ar/cpp/system/ascast/
---
## System::AsCast(const Source\&) method


تحول النوع المصدر إلى نوع النتيجة باستخدام عملية التحويل 'as'. تُستخدم عندما يكون التحويل الشبه بنائي بسيط مطلوبًا.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


يحوِّل نوع المصدر إلى نوع النتيجة باستخدام تحويل العامل 'as'. يُستخدم عندما يكون نوع المصدر والنتيجة متماثلين.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


يحوِّل نوع المصدر إلى نوع النتيجة باستخدام تحويل العامل 'as'. يُستخدم لأغلفة الاستثناءات.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::AsCast(const Source &value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل. تُرجع nullptr إذا لم يتوفر تحويل.

## انظر أيضًا

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


يحوِّل نوع المصدر إلى نوع النتيجة باستخدام تحويل العامل 'as'. يُستخدم لتحويل الكائن إلى استثناء.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::AsCast(const Source &value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل. تُرجع nullptr إذا لم يتوفر تحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


يحوِّل نوع المصدر إلى نوع النتيجة باستخدام تحويل العامل 'as'. يُستخدم عندما يكون كل من المصدر والنتيجة مؤشرات ذكية.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل. تُرجع nullptr إذا لم يتوفر تحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


يحوِّل نوع المصدر إلى نوع النتيجة باستخدام تحويل العامل 'as'. يُستخدم عندما يكون كل من المصدر والنتيجة مؤشرات ذكية (مع [SmartPtr<...>](../smartptr/) صريحة في نوع النتيجة).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::AsCast(const Source &value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل. تُرجع nullptr إذا لم يتوفر تحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


يحوِّل نوع المصدر إلى نوع النتيجة باستخدام تحويل العامل 'as'. يُستخدم لإلغاء تغليف الكائن إلى قابل للفراغ.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::AsCast(const Source &value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل. تُرجع قابل للفراغ فارغ إذا لم يتوفر تحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


يحوِّل نوع المصدر إلى نوع النتيجة باستخدام تحويل العامل 'as'. إلغاء تغليف غير صالح إلى نوع غير كائن.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxingToNullable, Result> System::AsCast(const Source &value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

دائمًا تُرجع null.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


إلغاء تغليف غير صالح إلى نوع غير كائن.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InvalidUnboxing, Result> System::AsCast(const Source &value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

دائمًا تُرجع null.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


يحوِّل نوع المصدر إلى نوع النتيجة باستخدام تحويل العامل 'as'. يُستخدم لتغليف كائن قابل للفراغ.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


يحوِّل نوع المصدر إلى نوع النتيجة باستخدام تحويل العامل 'as'. يُستخدم لتغليف كائن شائع.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


يحوِّل نوع المصدر إلى نوع النتيجة باستخدام تحويل العامل 'as'. يُستخدم لتغليف كائن شائع.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


يحوِّل نوع المصدر إلى نوع النتيجة باستخدام تحويل العامل 'as'. يُستخدم لإلغاء تغليف السلسلة.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToString, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


يحوِّل نوع المصدر إلى نوع النتيجة باستخدام تحويل العامل 'as'. يُستخدم لتحويل nullptr.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


يحوِّل نوع المصدر إلى نوع النتيجة باستخدام تحويل العامل 'as'. يُستخدم للتحويل بين المصفوفات.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Parameter | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل. تُرجع nullptr إذا لم يتوفر تحويل لأي عنصر في المصفوفة.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
