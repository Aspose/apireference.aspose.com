---
title: "طريقة System::operator=="
linktitle: "operator=="
second_title: "Aspose.Font لـ C++"
description: "كيفية استخدام طريقة operator== للصف في C++."
type: docs
weight: 32500
url: /ar/cpp/system/operator==/
---
## System::operator==(ArraySegment\<T\>, ArraySegment\<T\>) method




```cpp
template<typename T> bool System::operator==(ArraySegment<T> a, ArraySegment<T> b)
```

## انظر أيضًا

* Class [ArraySegment](../arraysegment/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(Chars\&, const String\&) method


[String](../string/) comparison.

```cpp
template<class Chars,typename std::enable_if< IsStringLiteral< Chars, char_t >::value >::type *> bool System::operator==(Chars &left, const String &right)
```


| معامل | الوصف |
| --- | --- |
| Chars | [String](../string/) نوع حرفي. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| left | Chars\& | [String](../string/) حرفي للمقارنة. |
| right | const String\& | [String](../string/) للمقارنة. |

### ReturnValue

صحيح إذا تطابقت السلاسل، خطأ خلاف ذلك.

## انظر أيضًا

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(const SharedPtr\<Object\>\&, const String\&) method


[Object](../object/) and string comparison.

```cpp
bool System::operator==(const SharedPtr<Object> &left, const String &right)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| left | const SharedPtr\<Object\>\& | [Object](../object/) للتحويل إلى سلسلة ومقارنة. |
| right | const String\& | [String](../string/) للمقارنة. |

### ReturnValue

صحيح إذا كان تمثيل الكائن كسلسلة يساوي السلسلة، خطأ خلاف ذلك.

## انظر أيضًا

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&) method


يحدد ما إذا كانت عناوين URI التي يمثلها الكائن الحالي والكائن المحدد متساوية.

```cpp
bool System::operator==(const SharedPtr<Uri> &uri1, const SharedPtr<Uri> &uri2)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| uri1 | const SharedPtr\<Uri\>\& | الكائن [Uri](../uri/) الأول للمقارنة |
| uri2 | const SharedPtr\<Uri\>\& | الكائن [Uri](../uri/) الثاني للمقارنة |

### ReturnValue

صحيح إذا كانت عناوين URI متساوية، وإلا - خطأ

## انظر أيضًا

* Typedef [SharedPtr](../sharedptr/)
* Class [Uri](../uri/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(const SmartPtr\<X\>\&, const SmartPtr\<Y\>\&) method


يقارن بالتساوي مؤشرين ذكيين.

```cpp
template<class X,class Y> bool System::operator==(const SmartPtr<X> &x, const SmartPtr<Y> &y)
```


| معامل | الوصف |
| --- | --- |
| X | نوع الكائن المشار إليه للمؤشر الأول. |
| Y | نوع الكائن المشار إليه للمؤشر الثاني. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| x | const SmartPtr\<X\>\& | المؤشر الأول للمقارنة. |
| y | const SmartPtr\<Y\>\& | المؤشر الثاني للمقارنة. |

### ReturnValue

صحيح إذا تطابقت المؤشرات، خطأ خلاف ذلك.

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(const SmartPtr\<X\>\&, const Y *) method


مقارنة مساواة للمؤشر الذكي مقابل المؤشر البسيط (C).

```cpp
template<class X,class Y> std::enable_if<std::is_base_of<Object, Y>::value &&detail::has_no_operator_equal<X, Y>::value, bool>::type System::operator==(const SmartPtr<X> &x, const Y *y)
```


| معامل | الوصف |
| --- | --- |
| X | نوع المؤشر الذكي. |
| Y | نوع المؤشر البسيط. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| x | const SmartPtr\<X\>\& | المؤشر الذكي للمقارنة (يسار). |
| y | const Y * | المؤشر للمقارنة (يمين). |

### ReturnValue

صحيح إذا تطابقت المؤشرات، خطأ خلاف ذلك.

## انظر أيضًا

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(const T1\&, const Nullable\<T2\>\&) method


يحدد ما إذا كانت القيمة المحددة مساوية للقيمة التي يمثلها الكائن [Nullable](../nullable/) المحدد عن طريق تطبيق [operator==()](./) على هاتين القيمتين.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator==(const T1 &some, const Nullable<T2> &other)
```


| معامل | الوصف |
| --- | --- |
| T1 | نوع القيمة المقارنة الأولى |
| T2 | النوع الأساسي لكائن [Nullable](../nullable/) الذي يمثل القيمة المقارنة الثانية |

| معامل | نوع | الوصف |
| --- | --- | --- |
| بعض | const T1\& | إشارة ثابتة إلى القيمة التي ستُستخدم كالمقارنة الأولى |
| other | const Nullable\<T2\>\& | إشارة ثابتة إلى كائن [Nullable](../nullable/) التي تُستخدم قيمته الممثلة كالمقارنة الثانية |

### ReturnValue

صحيح إذا كانت القيم المقارنة متساوية، وإلا - خطأ

## انظر أيضًا

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(const X *, const SmartPtr\<Y\>\&) method


مقارنة مساواة للمؤشر الذكي مقابل المؤشر البسيط (C).

```cpp
template<class X,class Y> std::enable_if<std::is_base_of<Object, X>::value &&detail::has_no_operator_equal<X, Y>::value, bool>::type System::operator==(const X *x, const SmartPtr<Y> &y)
```


| معامل | الوصف |
| --- | --- |
| X | نوع المؤشر البسيط. |
| Y | نوع المؤشر الذكي. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| x | const X * | المؤشر للمقارنة (يمين). |
| y | const SmartPtr\<Y\>\& | المؤشر الذكي للمقارنة (يسار). |

### ReturnValue

صحيح إذا تطابقت المؤشرات، خطأ خلاف ذلك.

## انظر أيضًا

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator==(std::nullptr_t, const DateTimeOffset &)
```

## انظر أيضًا

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(std::nullptr_t, const Nullable\<T\>\&) method


يحدد ما إذا كان الكائن [Nullable](../nullable/) المحدد يمثل قيمة مساوية لـ null.

```cpp
template<typename T> bool System::operator==(std::nullptr_t, const Nullable<T> &other)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| other | std::nullptr_t | إشارة ثابتة إلى كائن [Nullable](../nullable/) للاختبار |

### ReturnValue

صحيح إذا كان الكائن المحدد يمثل قيمة null، خطأ خلاف ذلك

## انظر أيضًا

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(std::nullptr_t, const String\&) method


يتحقق مما إذا كانت السلسلة null.

```cpp
bool System::operator==(std::nullptr_t, const String &str)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | std::nullptr_t | [String](../string/) للتحقق. |

### ReturnValue

صحيح إذا كانت السلسلة null، خطأ خلاف ذلك.

## انظر أيضًا

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(std::nullptr_t, DateTime) method




```cpp
bool System::operator==(std::nullptr_t, DateTime)
```

## انظر أيضًا

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(std::nullptr_t, SmartPtr\<X\> const\&) method


يتحقق مما إذا كان المؤشر الذكي null.

```cpp
template<class X> bool System::operator==(std::nullptr_t, SmartPtr<X> const &x)
```


| معامل | الوصف |
| --- | --- |
| X | نوع العنصر المشار إليه للمؤشر. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| x | std::nullptr_t | المؤشر للتحقق. |

### ReturnValue

صحيح إذا كان المؤشر null، خطأ خلاف ذلك.

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(std::nullptr_t, T const\&) method


يتحقق مما إذا كان كائن نوع القيمة (هيكل C# مترجم، إلخ) null.

```cpp
template<class T> std::enable_if<!std::is_scalar<T>::value &&!std::is_pointer<T>::value &&!std::is_array<T>::value &&detail::has_method_is_null<T>::value, bool>::type System::operator==(std::nullptr_t, T const &x)
```


| معامل | الوصف |
| --- | --- |
| T | نوع القيمة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| x | std::nullptr_t | [Object](../object/) للتحقق. |

### ReturnValue

صحيح إذا كان الكائن null، خطأ خلاف ذلك.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator==(std::nullptr_t, TimeSpan)
```

## انظر أيضًا

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(T\&, const String\&) method


[String](../string/) comparison.

```cpp
template<class T,typename std::enable_if< IsStringPointer< T, char_t >::value >::type *> bool System::operator==(T &left, const String &right)
```


| معامل | الوصف |
| --- | --- |
| T | نوع مؤشر [String](../string/). |

| معامل | نوع | الوصف |
| --- | --- | --- |
| left | T\& | مؤشر [String](../string/) للمقارنة. |
| right | const String\& | [String](../string/) للمقارنة. |

### ReturnValue

صحيح إذا تطابقت السلاسل، خطأ خلاف ذلك.

## انظر أيضًا

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(T const\&, std::nullptr_t) method


يتحقق مما إذا كان كائن نوع القيمة (هيكل C# مترجم، إلخ) null.

```cpp
template<class T> std::enable_if<!std::is_scalar<T>::value &&!std::is_pointer<T>::value &&!std::is_array<T>::value &&detail::has_method_is_null<T>::value, bool>::type System::operator==(T const &x, std::nullptr_t)
```


| معامل | الوصف |
| --- | --- |
| T | نوع القيمة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| x | T const\& | [Object](../object/) للتحقق. |

### ReturnValue

صحيح إذا كان الكائن null، خطأ خلاف ذلك.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
