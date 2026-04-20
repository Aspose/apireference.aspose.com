---
title: "طريقة System::ObjectExt::Is"
linktitle: "هو"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::ObjectExt::Is. تنفذ ترجمة المشغل ''is''. تخصيص للثابت النصي في C++."
type: docs
weight: 1100
url: /ar/cpp/system/objectext/is/
---
## ObjectExt::Is(const char16_t *) method


يُنفّذ ترجمة عامل 'is'. تخصيص للثابت النصي.

```cpp
template<class T> static bool System::ObjectExt::Is(const char16_t *str)
```


| معامل | الوصف |
| --- | --- |
| T | النوع الهدف. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| str | const char16_t * | [String](../../string/) ثابت نصي. |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، وإلا false.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const ExceptionWrapper\<U\>\&) method


ينفّذ ترجمة العامل 'is'. تخصيص لأنواع غلاف الاستثناء.

```cpp
template<class T,class U> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Is(const ExceptionWrapper<U> &obj)
```


| معامل | الوصف |
| --- | --- |
| T | النوع الهدف. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const ExceptionWrapper\<U\>\& | [Object](../../object/) لاختبار المشغل 'is'. |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، وإلا false.

## انظر أيضًا

* Class [ExceptionWrapper](../../exceptionwrapper/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const Nullable\<U\>\&) method


تنفذ ترجمة المشغل 'is'. تخصيص لنوع [Nullable](../../nullable/).

```cpp
template<class T,class U> static bool System::ObjectExt::Is(const Nullable<U> &value)
```


| معامل | الوصف |
| --- | --- |
| T | النوع الهدف. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const Nullable\<U\>\& | نوع [Nullable](../../nullable/). |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، وإلا false.

## انظر أيضًا

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const Object\&) method


ينفّذ ترجمة العامل 'is'. تخصيص للأنواع القيمية.

```cpp
template<class T> static std::enable_if<std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| معامل | الوصف |
| --- | --- |
| T | النوع الهدف. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) لاختبار المشغل 'is'. |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، وإلا false.

## انظر أيضًا

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const Object\&) method


ينفّذ ترجمة العامل 'is'. تخصيص للأنواع غير القابلة للتحويل.

```cpp
template<class T> static std::enable_if<!std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| معامل | الوصف |
| --- | --- |
| T | النوع الهدف. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) لاختبار المشغل 'is'. |

### ReturnValue

دائمًا تُعيد false لأن الأنواع غير قابلة للتحويل.

## انظر أيضًا

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


يُنفّذ ترجمة عامل 'is'. تخصيص للأنواع القابلة للإلغاء.

```cpp
template<class T> static std::enable_if<IsNullable<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| معامل | الوصف |
| --- | --- |
| T | النوع الهدف. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) لاختبار المشغل 'is'. |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، وإلا false.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


يُنفّذ ترجمة عامل 'is'. تخصيص للأنواع القابلة للتعبئة مع تعريف عامل ==.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| معامل | الوصف |
| --- | --- |
| T | النوع الهدف. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) لاختبار المشغل 'is'. |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، وإلا false.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


يُنفّذ ترجمة عامل 'is'. تخصيص للأنواع القابلة للتعبئة بدون تعريف عامل ==.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| معامل | الوصف |
| --- | --- |
| T | النوع الهدف. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) لاختبار المشغل 'is'. |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، وإلا false.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


ينفّذ ترجمة العامل 'is'. تخصيص لأنواع المؤشرات.

```cpp
template<class T,class U> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| معامل | الوصف |
| --- | --- |
| T | النوع الهدف. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) لاختبار المشغل 'is'. |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، وإلا false.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


يُنفّذ ترجمة عامل 'is'. تخصيص لأنواع التعداد.

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| معامل | الوصف |
| --- | --- |
| T | النوع الهدف. |
| U | نوع الكائن المشار إليه. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) لاختبار المشغل 'is'. |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، وإلا false.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<V\>\&) method


يُنفّذ ترجمة عامل 'is'. تخصيص للأنواع القيمية المُعبأة إلى الواجهات.

```cpp
template<class T,class V> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!std::is_same<V, Object>::value, bool>::type System::ObjectExt::Is(const SmartPtr<V> &obj)
```


| معامل | الوصف |
| --- | --- |
| T | النوع الهدف. |
| V | نوع الكائن المشار إليه. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const SmartPtr\<V\>\& | [Object](../../object/) لاختبار المشغل 'is'. |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، وإلا false.

## انظر أيضًا

* Class [Object](../../object/)
* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const T\&) method


ينفّذ ترجمة العامل 'is'. تخصيص للأنواع القابلة للتعبئة (القيمية) التي هي بالضبط ذلك.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value, bool>::type System::ObjectExt::Is(const T &obj)
```


| معامل | الوصف |
| --- | --- |
| T | النوع الهدف. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) لاختبار المشغل 'is'. مُهمل. |

### ReturnValue

دائمًا true

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const U\&) method


ينفّذ ترجمة العامل 'is'. تخصيص لأنواع المؤشرات المُحسّنة للفئات 'final'.

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| معامل | الوصف |
| --- | --- |
| T | النوع الهدف. |
| U | النوع المختبر. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) لاختبار المشغل 'is'. |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، وإلا false.

## انظر أيضًا

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const U\&) method


ينفّذ ترجمة العامل 'is'. تخصيص لأنواع المؤشرات.

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&!std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| معامل | الوصف |
| --- | --- |
| T | النوع الهدف. |
| U | النوع المختبر. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) لاختبار المشغل 'is'. |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، وإلا false.

## انظر أيضًا

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const WeakPtr\<U\>\&) method


يُنفّذ ترجمة عامل 'is'. تخصيص لأنواع التعداد مقابل المؤشرات الضعيفة.

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const WeakPtr<U> &obj)
```


| معامل | الوصف |
| --- | --- |
| T | النوع الهدف. |
| U | نوع الكائن المشار إليه. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const WeakPtr\<U\>\& | [Object](../../object/) لاختبار المشغل 'is'. |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، وإلا false.

## انظر أيضًا

* Class [WeakPtr](../../weakptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(int32_t) method


يُنفّذ ترجمة عامل 'is'. تخصيص للثابت العددي.

```cpp
template<class T> static bool System::ObjectExt::Is(int32_t value)
```


| معامل | الوصف |
| --- | --- |
| T | النوع الهدف. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | int32_t | ثابت عدد صحيح. |

### ReturnValue

صحيح إذا كان 'is' يُعيد true، وإلا false.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
