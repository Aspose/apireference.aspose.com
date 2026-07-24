---
title: "System::SmartPtr::operator* طريقة"
linktitle: "operator*"
second_title: "Aspose.Page لـ C++"
description: "System::SmartPtr::operator* طريقة. يحصل على مرجع إلى الكائن المشار إليه. يؤكد أن المؤشر ليس فارغًا في C++."
type: docs
weight: 2500
url: /ar/cpp/system/smartptr/operator_/
---
## SmartPtr::operator* method


يحصل على مرجع للكائن المشار إليه. يؤكد أن المؤشر غير فارغ (ليس null).

```cpp
Pointee_ & System::SmartPtr<T>::operator*() const
```


### ReturnValue

مرجع إلى الكائن المشار إليه.

## انظر أيضًا

* Typedef [Pointee_](../pointee_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
title: System::SmartPtr::operator< طريقة
عنوان الرابط: operator<
العنوان_الثاني: Aspose.Page for C++
description: 'System::SmartPtr::operator< طريقة. يوفر دلالات مقارنة أصغر لفئة SmartPtr في C++.'
النوع: docs
الوزن: 2700
url: /cpp/system/smartptr/operator_/
---
## SmartPtr::operator<(SmartPtr\<Y\> const\&) const method


يوفر دلالات مقارنة أصغر لفئة [SmartPtr](../).

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(SmartPtr<Y> const &x) const
```


| Parameter | الوصف |
| --- | --- |
| Y | نوع المؤشر للمقارنة مع الحالي. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| x | SmartPtr\<Y\> const\& | مؤشر للمقارنة مع الحالي. |

### ReturnValue

صحيح إذا كان الكائن المشار إليه بواسطة [SmartPtr](../) هو 'أصغر' من x وإلا خطأ.

## انظر أيضًا

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator<(Y *) const method


يوفر دلالات مقارنة أصغر لفئة [SmartPtr](../).

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(Y *p) const
```


| Parameter | الوصف |
| --- | --- |
| Y | نوع المؤشر للمقارنة مع الحالي. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| p | Y * | مؤشر للمقارنة مع الحالي. |

### ReturnValue

صحيح إذا كان الكائن المشار إليه بواسطة [SmartPtr](../) 'أقل' من p وإلا خطأ.

## انظر أيضًا

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
