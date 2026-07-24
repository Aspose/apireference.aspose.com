---
title: "طريقة System::StaticCast_noexcept"
linktitle: "StaticCast_noexcept"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::StaticCast_noexcept. تقوم بإجراء تحويل ثابت على كائنات Exception في C++."
type: docs
weight: 39400
url: /ar/cpp/system/staticcast_noexcept/
---
## System::StaticCast_noexcept(const TFrom\&) method


يقوم بإجراء تحويل ثابت على كائنات [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast_noexcept(const TFrom &obj)
```


| Parameter | الوصف |
| --- | --- |
| TTo | نوع [Exception](../exception/) المستهدف. |
| TFrom | نوع [Exception](../exception/) المصدر. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const TFrom\& | مؤشر المصدر. |

### ReturnValue

نتيجة التحويل إذا كان التحويل مسموحًا أو nullptr وإلا.

## Deprecated
متروكة لتوافق الإصدارات السابقة. استخدم AsCast بدلاً من ذلك.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast_noexcept(SmartPtr\<TFrom\> const\&) method


يقوم بإجراء تحويل ثابت على كائنات [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast_noexcept(SmartPtr<TFrom> const &obj)
```


| Parameter | الوصف |
| --- | --- |
| TTo | نوع العنصر المستهدف. |
| TFrom | نوع العنصر المصدر. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | مؤشر المصدر. |

### ReturnValue

نتيجة التحويل إذا كان التحويل مسموحًا أو nullptr وإلا.

## Deprecated
متروكة لتوافق الإصدارات السابقة. استخدم AsCast بدلاً من ذلك.

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast_noexcept(SmartPtr\<TFrom\>) method


يقوم بإجراء تحويل ثابت على كائنات Objects إلى كائنات [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast_noexcept(SmartPtr<TFrom> obj) noexcept
```


| Parameter | الوصف |
| --- | --- |
| TTo | نوع [Exception](../exception/) المستهدف. |
| TFrom | نوع [Object](../object/). |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | مؤشر المصدر. |

### ReturnValue

نتيجة التحويل إذا كان التحويل مسموحًا أو nullptr وإلا.

## Deprecated
متروكة لتوافق الإصدارات السابقة. استخدم AsCast بدلاً من ذلك.

## انظر أيضًا

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast_noexcept(WeakPtr\<TFrom\> const\&) method


يقوم بإجراء تحويل ثابت على كائنات [WeakPtr](../weakptr/).

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast_noexcept(WeakPtr<TFrom> const &obj)
```


| Parameter | الوصف |
| --- | --- |
| TTo | نوع العنصر المستهدف. |
| TFrom | نوع العنصر المصدر. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | مؤشر المصدر. |

### ReturnValue

نتيجة التحويل إذا كان التحويل مسموحًا أو nullptr وإلا.

## Deprecated
متروكة لتوافق الإصدارات السابقة. استخدم AsCast بدلاً من ذلك.

## انظر أيضًا

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
