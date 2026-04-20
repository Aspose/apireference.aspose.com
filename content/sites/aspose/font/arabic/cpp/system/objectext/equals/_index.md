---
title: "طريقة System::ObjectExt::Equals"
linktitle: "يساوي"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::ObjectExt::Equals. بديل لاستدعاءات C# Object.Equals يعمل مع أي نوع في C++. تحميل زائد للثابت النصي مع مقارنة النصوص في C++."
type: docs
weight: 800
url: /ar/cpp/system/objectext/equals/
---
## ObjectExt::Equals(const char_t(&), String) method


بديل لاستدعاءات C# [Object.Equals](../../object/equals/) يعمل مع أي نوع في C++. تحميل زائد للثابت النصي مع مقارنة النصوص.

```cpp
template<size_t> static bool System::ObjectExt::Equals(const char_t(&obj)[N], String another)
```


| معامل | الوصف |
| --- | --- |
| N | [String](../../string/) حجم النص الحرفي. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const char_t(&) | [String](../../string/) ثابت نصي. |
| another | String | [String](../../string/). |

### ReturnValue

صحيح إذا تطابقت السلاسل، خطأ خلاف ذلك.

## انظر أيضًا

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(const double\&, const double\&) method


يحاكي مقارنة النقطة العائمة بأسلوب C# حيث يُعتبر NaNانان متساويين رغم أنه وفقًا للمعيار IEC 60559:1989 لا يُعتبر NaN مساويًا لأي قيمة، بما في ذلك NaN.

```cpp
bool System::ObjectExt::Equals(const double &obj, const double &another)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const double\& | قيمة النقطة العائمة للجانب الأيسر. |
| آخر | const double\& | قيمة النقطة العائمة للجانب الأيمن. |

### ReturnValue

صحيح إذا كان **obj** و **another** كلاهما NaN أو متساويين، خطأ خلاف ذلك.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(const float\&, const float\&) method


يحاكي مقارنة النقطة العائمة بأسلوب C# حيث يُعتبر NaNانان متساويين رغم أنه وفقًا للمعيار IEC 60559:1989 لا يُعتبر NaN مساويًا لأي قيمة، بما في ذلك NaN.

```cpp
bool System::ObjectExt::Equals(const float &obj, const float &another)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const float\& | قيمة النقطة العائمة للجانب الأيسر. |
| آخر | const float\& | قيمة النقطة العائمة للجانب الأيمن. |

### ReturnValue

صحيح إذا كان **obj** و **another** كلاهما NaN أو متساويين، خطأ خلاف ذلك.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method




```cpp
template<typename T,typename T2> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


بديل لاستدعاءات C# [Object.Equals](../../object/equals/) التي تعمل مع أي نوع في C++. إصدار زائد لأنواع المؤشرات الذكية.

```cpp
template<typename T,typename T2> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| معامل | الوصف |
| --- | --- |
| T | نوع الكائن الأول. |
| T2 | نوع الكائن الثاني. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const T\& | الكائن الأول. |
| آخر | const T2\& | الكائن الثاني. |

### ReturnValue

صحيح إذا اعتُبرت الكائنات متساوية، خطأ خلاف ذلك.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


بديل لاستدعاءات C# [Object.Equals](../../object/equals/) التي تعمل مع أي نوع في C++. إصدار زائد لأنواع القيم الأساسية.

```cpp
template<typename T,typename T2> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| معامل | الوصف |
| --- | --- |
| T | نوع الكائن الأول. |
| T2 | نوع الكائن الثاني. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const T\& | الكائن الأول. |
| آخر | const T2\& | الكائن الثاني. |

### ReturnValue

صحيح إذا اعتُبرت الكائنات متساوية، خطأ خلاف ذلك.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(T, const T2\&) method


بديل لاستدعاءات C# [Object.Equals](../../object/equals/) التي تعمل مع أي نوع في C++. إصدار زائد لأنواع البنى.

```cpp
template<typename T,typename T2> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(T obj, const T2 &another)
```


| معامل | الوصف |
| --- | --- |
| T | نوع الكائن الأول. |
| T2 | نوع الكائن الثاني. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | T | الكائن الأول. |
| آخر | const T2\& | الكائن الثاني. |

### ReturnValue

صحيح إذا اعتُبرت الكائنات متساوية، خطأ خلاف ذلك.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
