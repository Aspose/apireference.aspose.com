---
title: "طريقة System::ObjectExt::Is"
linktitle: "هل"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::ObjectExt::Is. تنفذ ترجمة عامل ''is''. تخصيص للثابت النصي في C++."
type: docs
weight: 1000
url: /ar/cpp/system/objectext/is/
---
## ObjectExt::Is(const char16_t *) method


ينفّذ ترجمة عامل 'is'. تخصيص للثابت النصي.

```cpp
template<class T> static bool System::ObjectExt::Is(const char16_t *str)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الهدف. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| str | const char16_t * | [String](../../string/) ثابت. |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، false خلاف ذلك.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const ExceptionWrapper\<U\>\&) method


ينفّذ ترجمة عامل 'is'. تخصيص لأنواع غلاف الاستثناء.

```cpp
template<class T,class U> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Is(const ExceptionWrapper<U> &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الهدف. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const ExceptionWrapper\<U\>\& | [Object](../../object/) لاختبار عامل 'is'. |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، false خلاف ذلك.

## انظر أيضًا

* Class [ExceptionWrapper](../../exceptionwrapper/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Nullable\<U\>\&) method


تنفذ ترجمة عامل 'is'. تخصيص لنوع [Nullable](../../nullable/).

```cpp
template<class T,class U> static bool System::ObjectExt::Is(const Nullable<U> &value)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الهدف. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Nullable\<U\>\& | نوع [Nullable](../../nullable/). |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، false خلاف ذلك.

## انظر أيضًا

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Object\&) method


يُنفّذ ترجمة العامل 'is'. تخصيص للأنواع القيمية.

```cpp
template<class T> static std::enable_if<std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الهدف. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) لاختبار عامل 'is'. |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، false خلاف ذلك.

## انظر أيضًا

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Object\&) method


ينفّذ ترجمة عامل 'is'. تخصيص للأنواع غير القابلة للتحويل.

```cpp
template<class T> static std::enable_if<!std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الهدف. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) لاختبار عامل 'is'. |

### ReturnValue

دائمًا تُعيد false لأن الأنواع غير قابلة للتحويل.

## انظر أيضًا

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


ينفّذ ترجمة عامل 'is'. تخصيص للأنواع القابلة للإلغاء.

```cpp
template<class T> static std::enable_if<IsNullable<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الهدف. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) لاختبار عامل 'is'. |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، false خلاف ذلك.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


ينفّذ ترجمة عامل 'is'. تخصيص للأنواع القابلة للتعبئة مع تعريف عامل ==.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الهدف. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) لاختبار عامل 'is'. |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، false خلاف ذلك.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


ينفّذ ترجمة عامل 'is'. تخصيص للأنواع القابلة للتعبئة بدون تعريف ==.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الهدف. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) لاختبار عامل 'is'. |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، false خلاف ذلك.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


يُنفّذ ترجمة العامل 'is'. تخصيص لأنواع المؤشرات.

```cpp
template<class T,class U> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الهدف. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) لاختبار عامل 'is'. |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، false خلاف ذلك.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


ينفّذ ترجمة عامل 'is'. تخصيص لأنواع التعداد.

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الهدف. |
| U | نوع الكائن المشار إليه. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) لاختبار عامل 'is'. |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، false خلاف ذلك.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<V\>\&) method


ينفّذ ترجمة عامل 'is'. تخصيص للأنواع القيمة التي تم تعبئتها إلى الواجهات.

```cpp
template<class T,class V> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!std::is_same<V, Object>::value, bool>::type System::ObjectExt::Is(const SmartPtr<V> &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الهدف. |
| V | نوع الكائن المشار إليه. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const SmartPtr\<V\>\& | [Object](../../object/) لاختبار عامل 'is'. |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، false خلاف ذلك.

## انظر أيضًا

* Class [Object](../../object/)
* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const T\&) method


يُنفّذ ترجمة العامل 'is'. تخصيص للأنواع القابلة للتغليف (القيمية) التي هي كذلك بالضبط.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value, bool>::type System::ObjectExt::Is(const T &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الهدف. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) لاختبار عامل 'is'. مُهمل. |

### ReturnValue

دائمًا true

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const U\&) method


يُنفّذ ترجمة العامل 'is'. تخصيص لأنواع المؤشرات المُحسّنة للفئات 'final'.

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الهدف. |
| U | النوع المختبر. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) لاختبار عامل 'is'. |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، false خلاف ذلك.

## انظر أيضًا

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const U\&) method


يُنفّذ ترجمة العامل 'is'. تخصيص لأنواع المؤشرات.

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&!std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الهدف. |
| U | النوع المختبر. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) لاختبار عامل 'is'. |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، false خلاف ذلك.

## انظر أيضًا

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const WeakPtr\<U\>\&) method


ينفّذ ترجمة عامل 'is'. تخصيص لأنواع التعداد مقابل المؤشرات الضعيفة.

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const WeakPtr<U> &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الهدف. |
| U | نوع الكائن المشار إليه. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const WeakPtr\<U\>\& | [Object](../../object/) لاختبار عامل 'is'. |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، false خلاف ذلك.

## انظر أيضًا

* Class [WeakPtr](../../weakptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(int32_t) method


ينفّذ ترجمة عامل 'is'. تخصيص للثابت العددي.

```cpp
template<class T> static bool System::ObjectExt::Is(int32_t value)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الهدف. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | int32_t | ثابت عدد صحيح. |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، false خلاف ذلك.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
