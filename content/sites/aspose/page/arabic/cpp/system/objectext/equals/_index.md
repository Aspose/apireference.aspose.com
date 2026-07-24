---
title: "طريقة System::ObjectExt::Equals"
linktitle: "يساوي"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::ObjectExt::Equals. بديل لاستدعاءات C# Object.Equals يعمل مع أي نوع في C++. تحميل للثابت النصي مع مقارنة السلاسل في C++."
type: docs
weight: 700
url: /ar/cpp/system/objectext/equals/
---
## ObjectExt::Equals(const char_t(&), String) method


بديل لاستدعاءات C# [Object.Equals](../../object/equals/) يعمل مع أي نوع في C++. تحميل للثابت النصي مع مقارنة السلاسل.

```cpp
template<size_t> static bool System::ObjectExt::Equals(const char_t(&obj)[N], String another)
```


| Parameter | الوصف |
| --- | --- |
| N | حجم ثابت [String](../../string/). |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const char_t(&) | [String](../../string/) ثابت. |
| another | String | [String](../../string/). |

### ReturnValue

صحيح إذا كانت السلاسل متطابقة، خطأ خلاف ذلك.

## انظر أيضًا

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const double\&, const double\&) method


يحاكي مقارنة النقطة العائمة بأسلوب C# حيث يُعتبر NaNانان متساويين بالرغم من أن معيار IEC 60559:1989 يحدد أن NaN ليس مساويًا لأي قيمة، بما في ذلك NaN.

```cpp
bool System::ObjectExt::Equals(const double &obj, const double &another)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const double\& | قيمة النقطة العائمة للجانب الأيسر. |
| آخر | const double\& | قيمة النقطة العائمة للجانب الأيمن. |

### ReturnValue

صحيح إذا كان **obj** و **another** كلاهما NaN أو متساويين، خطأ خلاف ذلك.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const float\&, const float\&) method


يحاكي مقارنة النقطة العائمة بأسلوب C# حيث يُعتبر NaNانان متساويين بالرغم من أن معيار IEC 60559:1989 يحدد أن NaN ليس مساويًا لأي قيمة، بما في ذلك NaN.

```cpp
bool System::ObjectExt::Equals(const float &obj, const float &another)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const float\& | قيمة النقطة العائمة للجانب الأيسر. |
| آخر | const float\& | قيمة النقطة العائمة للجانب الأيمن. |

### ReturnValue

صحيح إذا كان **obj** و **another** كلاهما NaN أو متساويين، خطأ خلاف ذلك.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method




```cpp
template<typename T,typename T2> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


بديل لاستدعاءات C# [Object.Equals](../../object/equals/) تعمل لأي نوع في C++. تحميل زائد لأنواع المؤشرات الذكية.

```cpp
template<typename T,typename T2> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الكائن الأول. |
| T2 | نوع الكائن الثاني. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const T\& | الكائن الأول. |
| آخر | const T2\& | الكائن الثاني. |

### ReturnValue

صحيح إذا تم اعتبار الكائنات متساوية، خطأ خلاف ذلك.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


بديل لاستدعاءات C# [Object.Equals](../../object/equals/) تعمل لأي نوع في C++. تحميل زائد لأنواع القيم الأساسية.

```cpp
template<typename T,typename T2> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الكائن الأول. |
| T2 | نوع الكائن الثاني. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const T\& | الكائن الأول. |
| آخر | const T2\& | الكائن الثاني. |

### ReturnValue

صحيح إذا تم اعتبار الكائنات متساوية، خطأ خلاف ذلك.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(T, const T2\&) method


بديل لاستدعاءات C# [Object.Equals](../../object/equals/) تعمل لأي نوع في C++. تحميل زائد لأنواع الهياكل.

```cpp
template<typename T,typename T2> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(T obj, const T2 &another)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الكائن الأول. |
| T2 | نوع الكائن الثاني. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | T | الكائن الأول. |
| آخر | const T2\& | الكائن الثاني. |

### ReturnValue

صحيح إذا تم اعتبار الكائنات متساوية، خطأ خلاف ذلك.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
