---
title: "System::Object::Equals method"
linktitle: "يساوي"
second_title: "Aspose.Font لـ C++"
description: "System::Object::Equals method. يقارن الكائنات باستخدام دلالات C# Object.Equals في C++."
type: docs
weight: 300
url: /ar/cpp/system/object/equals/
---
## Object::Equals(ptr) method


يقارن الكائنات باستخدام دلالات C# [Object.Equals](./).

```cpp
virtual bool System::Object::Equals(ptr obj)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | ptr | [Object](../) للمقارنة مع الكائن الحالي. |

### ReturnValue

صحيح إذا اعتُبر الكائنان متساويين وخطأ إذا لم يكن كذلك.

## انظر أيضًا

* Typedef [ptr](../ptr/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::Equals(double const\&, double const\&) method


يحاكي مقارنة النقطة العائمة بأسلوب C# حيث يُعتبر NaNانان متساويين رغم أنه وفقًا للمعيار IEC 60559:1989 لا يُعتبر NaN مساويًا لأي قيمة، بما في ذلك NaN.

```cpp
bool System::Object::Equals(double const &objA, double const &objB)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| objA | double const\& | قيمة النقطة العائمة للجانب الأيسر. |
| objB | double const\& | قيمة النقطة العائمة للجانب الأيمن. |

### ReturnValue

صحيح إذا كان **objA** و **objB** كلاهما NaN أو متساويين، وإلا خطأ.

## انظر أيضًا

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::Equals(float const\&, float const\&) method


يحاكي مقارنة النقطة العائمة بأسلوب C# حيث يُعتبر NaNانان متساويين رغم أنه وفقًا للمعيار IEC 60559:1989 لا يُعتبر NaN مساويًا لأي قيمة، بما في ذلك NaN.

```cpp
bool System::Object::Equals(float const &objA, float const &objB)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| objA | float const\& | قيمة النقطة العائمة للجانب الأيسر. |
| objB | float const\& | قيمة النقطة العائمة للجانب الأيمن. |

### ReturnValue

صحيح إذا كان **objA** و **objB** كلاهما NaN أو متساويين، وإلا خطأ.

## انظر أيضًا

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::Equals(T1 const\&, T2 const\&) method


يقارن كائنات النوع المرجعي بأسلوب C#.

```cpp
template<typename T1,typename T2> static std::enable_if<IsSmartPtr<T1>::value &&IsSmartPtr<T2>::value, bool>::type System::Object::Equals(T1 const &objA, T2 const &objB)
```


| معامل | الوصف |
| --- | --- |
| T1 | نوع الكائن الأول للمقارنة. |
| T2 | نوع الكائن الثاني للمقارنة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| objA | T1 const\& | الكائن الأول للمقارنة. |
| objB | T2 const\& | الكائن الثاني للمقارنة. |

### ReturnValue

صحيح إذا كانت الكائنات تتطابق إما بالمرجع أو دلاليًا (بمقارنة مشابهة لـ [Object.Equals](./))، خطأ غير ذلك.

## انظر أيضًا

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::Equals(T1 const\&, T2 const\&) method


يقارن كائنات النوع القيمي بأسلوب C#.

```cpp
template<typename T1,typename T2> static std::enable_if<!IsSmartPtr<T1>::value &&!IsSmartPtr<T2>::value, bool>::type System::Object::Equals(T1 const &objA, T2 const &objB)
```


| معامل | الوصف |
| --- | --- |
| T1 | نوع الكائن الأول للمقارنة. |
| T2 | نوع الكائن الثاني للمقارنة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| objA | T1 const\& | الكائن الأول للمقارنة. |
| objB | T2 const\& | الكائن الثاني للمقارنة. |

### ReturnValue

صحيح إذا تم اعتبار الكائنات متساوية بواسطة عامل المساواة المتاح، خطأ غير ذلك.

## انظر أيضًا

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
