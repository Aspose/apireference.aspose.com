---
title: "طريقة System::SmartPtr::Cast"
linktitle: "Cast"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::SmartPtr::Cast. تحول المؤشر إلى نوعه نفسه في C++."
type: docs
weight: 400
url: /ar/cpp/system/smartptr/cast/
---
## SmartPtr::Cast() const method


يحوّل المؤشر إلى نوعه نفسه.

```cpp
template<class Y,typename Check> std::enable_if_t<std::is_same<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| معامل | الوصف |
| --- | --- |
| Y | نوع الهدف للكائن المشار إليه. |
| Check | علامات لإلقاء استثناء إذا لم يتوفر تحويل. |

### ReturnValue

مؤشر من نوع متغيّر يكون دائمًا في وضع المشاركة.

## انظر أيضًا

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::Cast() const method


يحوّل المؤشر إلى النوع الأساسي باستخدام static_cast.

```cpp
template<class Y,typename Check> std::enable_if_t<!std::is_same<Y, T>::value &&std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| معامل | الوصف |
| --- | --- |
| Y | نوع الهدف للكائن المشار إليه. |
| Check | علامات لإلقاء استثناء إذا لم يتوفر تحويل. |

### ReturnValue

مؤشر من نوع متغيّر يكون دائمًا في وضع المشاركة.

## انظر أيضًا

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::Cast() const method


يحوّل المؤشر إلى النوع المشتق باستخدام dynamic_cast.

```cpp
template<class Y,typename Check> std::enable_if_t<Check::value &&!std::is_same<Y, T>::value &&!std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| معامل | الوصف |
| --- | --- |
| Y | نوع الهدف للكائن المشار إليه. |
| Check | علامات لإلقاء استثناء إذا لم يتوفر تحويل. |

### ReturnValue

مؤشر من نوع متغيّر يكون دائمًا في الوضع المشترك. يرمي InvalidCastException إذا لم يتوفر تحويل.

## انظر أيضًا

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::Cast() const method


يحوّل المؤشر إلى النوع المشتق باستخدام dynamic_cast.

```cpp
template<class Y,typename Check> std::enable_if_t<!Check::value &&!std::is_same<Y, T>::value &&!std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| معامل | الوصف |
| --- | --- |
| Y | نوع الهدف للكائن المشار إليه. |
| Check | علامات لإلقاء استثناء إذا لم يتوفر تحويل. |

### ReturnValue

مؤشر من نوع متغيّر يكون دائمًا في الوضع المشترك. يُعيد nullptr إذا لم يتوفر تحويل.

## انظر أيضًا

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
