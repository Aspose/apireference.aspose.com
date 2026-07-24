---
title: "طريقة System::StaticCast"
linktitle: "StaticCast"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::StaticCast. تقوم بإجراء تحويل ثابت على كائنات غير المؤشرات في C++."
type: docs
weight: 38500
url: /ar/cpp/system/staticcast/
---
## System::StaticCast(const TFrom\&) method


يقوم بإجراء تحويل ثابت على كائنات غير المؤشرات.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_same<TFrom, System::String>::value &&!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&!std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(const TFrom &obj)
```


| Parameter | الوصف |
| --- | --- |
| TTo | نوع الهدف. |
| TFrom | نوع المصدر. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const TFrom\& | الكائن المصدر. |

### ReturnValue

نتيجة التحويل إذا كان التحويل مسموحًا.

## Deprecated
متروك للتوافقية مع الإصدارات السابقة. استخدم ExplicitCast بدلاً من ذلك.

## انظر أيضًا

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(const TFrom\&) method


يقوم بإجراء تحويل ثابت على كائنات [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast(const TFrom &obj)
```


| Parameter | الوصف |
| --- | --- |
| TTo | نوع [Exception](../exception/) المستهدف. |
| TFrom | نوع [Exception](../exception/) المصدر. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const TFrom\& | مؤشر المصدر. |

### ReturnValue

نتيجة التحويل إذا كان التحويل مسموحًا.

## Deprecated
متروك للتوافقية مع الإصدارات السابقة. استخدم ExplicitCast بدلاً من ذلك.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(const TFrom *) method


تخصيص للأنواع العددية.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(const TFrom *value)
```

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(SmartPtr\<TFrom\> const\&) method


يقوم بإجراء تحويل ثابت على كائنات [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast(SmartPtr<TFrom> const &obj)
```


| Parameter | الوصف |
| --- | --- |
| TTo | نوع العنصر المستهدف. |
| TFrom | نوع العنصر المصدر. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | مؤشر المصدر. |

### ReturnValue

نتيجة التحويل إذا كان التحويل مسموحًا.

## Deprecated
متروك للتوافقية مع الإصدارات السابقة. استخدم ExplicitCast بدلاً من ذلك.

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(SmartPtr\<TFrom\>) method


يقوم بإجراء تحويل ثابت على كائنات Objects إلى كائنات [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast(SmartPtr<TFrom> obj) noexcept
```


| Parameter | الوصف |
| --- | --- |
| TTo | نوع [Exception](../exception/) المستهدف. |
| TFrom | نوع [Object](../object/). |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | مؤشر المصدر. |

### ReturnValue

نتيجة التحويل إذا كان التحويل مسموحًا.

## Deprecated
متروك للتوافقية مع الإصدارات السابقة. استخدم ExplicitCast بدلاً من ذلك.

## انظر أيضًا

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(std::nullptr_t) method


يقوم بإجراء تحويل ثابت للكائنات الفارغة.

```cpp
template<typename TTo> CastResult<TTo>::type System::StaticCast(std::nullptr_t)
```


| Parameter | الوصف |
| --- | --- |
| TTo | نوع العنصر المستهدف. |

### ReturnValue

nullptr.

## Deprecated
متروك للتوافقية مع الإصدارات السابقة. استخدم ExplicitCast بدلاً من ذلك.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(TFrom) method


تخصيص للأنواع العددية.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(TFrom value)
```

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(TTo) method


معالجة التحويل من [String](../string/) إلى [String](../string/).

```cpp
template<typename TTo> std::enable_if<std::is_same<TTo, System::String>::value, TTo>::type System::StaticCast(TTo value)
```

## انظر أيضًا

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(WeakPtr\<TFrom\> const\&) method


يقوم بإجراء تحويل ثابت على كائنات [WeakPtr](../weakptr/).

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast(WeakPtr<TFrom> const &obj)
```


| Parameter | الوصف |
| --- | --- |
| TTo | نوع العنصر المستهدف. |
| TFrom | نوع العنصر المصدر. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | مؤشر المصدر. |

### ReturnValue

نتيجة التحويل إذا كان التحويل مسموحًا.

## Deprecated
متروك للتوافقية مع الإصدارات السابقة. استخدم ExplicitCast بدلاً من ذلك.

## انظر أيضًا

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
