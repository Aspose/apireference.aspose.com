---
title: "طريقة System::AsCast"
linktitle: "AsCast"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::AsCast. تُحوِّل نوع المصدر إلى نوع النتيجة باستخدام عملية التحويل ''as''. تُستخدم عندما يكون التحويل الشبيه بالمُنشئ البسيط مطلوبًا في C++."
type: docs
weight: 13600
url: /ar/cpp/system/ascast/
---
## System::AsCast(const Source\&) method


يُحوِّل نوع المصدر إلى نوع النتيجة باستخدام عملية التحويل 'as'. تُستخدم عندما يكون التحويل الشبيه بالمُنشئ البسيط مطلوبًا.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


يُحوِّل نوع المصدر إلى نوع النتيجة باستخدام عملية التحويل 'as'. تُستخدم عندما يكون نوع المصدر ونوع النتيجة متماثلين.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


يُحوِّل نوع المصدر إلى نوع النتيجة باستخدام عملية التحويل 'as'. تُستخدم لأغلفة الاستثناءات.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::AsCast(const Source &value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل. تُعيد nullptr إذا لم يتوفر تحويل.

## انظر أيضًا

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام عملية التحويل 'as'. يُستخدم لتحويل الكائن إلى استثناء.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::AsCast(const Source &value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل. تُعيد nullptr إذا لم يتوفر تحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام عملية التحويل 'as'. يُستخدم عندما يكون المصدر والنتيجة كلاهما مؤشرات ذكية.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل. تُعيد nullptr إذا لم يتوفر تحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام عملية التحويل 'as'. يُستخدم عندما يكون المصدر والنتيجة كلاهما مؤشرات ذكية (مع [SmartPtr<...>](../smartptr/) صريحة في نوع النتيجة).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::AsCast(const Source &value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل. تُعيد nullptr إذا لم يتوفر تحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام عملية التحويل 'as'. يُستخدم لإلغاء تغليف الكائن إلى قيمة قابلة للـnull.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::AsCast(const Source &value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل. تُعيد قيمة قابلة للـnull فارغة إذا لم تتوفر أي تحويل.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام عملية التحويل 'as'. إلغاء تغليف غير صالح إلى نوع غير كائن.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxingToNullable, Result> System::AsCast(const Source &value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

دائمًا يُعيد null.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


إلغاء تغليف غير صالح إلى نوع غير كائن.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InvalidUnboxing, Result> System::AsCast(const Source &value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

دائمًا يُعيد null.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام عملية التحويل 'as'. يُستخدم لتغليف كائن قابل للـnull.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام عملية التحويل 'as'. يُستخدم لتغليف كائن عادي.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام عملية التحويل 'as'. يُستخدم لتغليف كائن عادي.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام عملية التحويل 'as'. يُستخدم لإلغاء تغليف السلسلة.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToString, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام عملية التحويل 'as'. يُستخدم لتحويل nullptr.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


يقوم بتحويل نوع المصدر إلى نوع النتيجة باستخدام عملية التحويل 'as'. يُستخدم للتحويل بين المصفوفات.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| معامل | الوصف |
| --- | --- |
| المصدر | نوع المصدر. |
| Result | نوع النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) للتحويل. |

### ReturnValue

نتيجة التحويل. تُعيد nullptr إذا لم يتوفر أي تحويل لأي عنصر في المصفوفة.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
