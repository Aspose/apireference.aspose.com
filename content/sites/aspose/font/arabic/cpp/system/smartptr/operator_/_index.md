---
title: "System::SmartPtr::operator* method"
linktitle: "operator*"
second_title: "Aspose.Font لـ C++"
description: "System::SmartPtr::operator* method. يحصل على مرجع للعنصر المشار إليه. يؤكد أن المؤشر ليس فارغًا في C++."
type: docs
weight: 2500
url: /ar/cpp/system/smartptr/operator_/
---
## SmartPtr::operator* method


يحصل على مرجع للكائن المشار إليه. يؤكد أن المؤشر غير فارغ.

```cpp
Pointee_ & System::SmartPtr<T>::operator*() const
```


### ReturnValue

مرجع للعنصر المشار إليه.

## انظر أيضًا

* Typedef [Pointee_](../pointee_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
---
العنوان: System::SmartPtr::operator< method
عنوان الرابط: operator<
العنوان_الثاني: Aspose.Font for C++
الوصف: 'System::SmartPtr::operator< method. يوفر دلالات مقارنة أصغر لفئة SmartPtr في C++.'
النوع: docs
الوزن: 2700
عنوان URL: /cpp/system/smartptr/operator_/
---
## SmartPtr::operator<(SmartPtr\<Y\> const\&) const method


يوفر دلالات مقارنة أقل لفئة [SmartPtr](../).

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(SmartPtr<Y> const &x) const
```


| معامل | الوصف |
| --- | --- |
| Y | نوع المؤشر للمقارنة مع المؤشر الحالي. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| x | SmartPtr\<Y\> const\& | المؤشر للمقارنة مع المؤشر الحالي. |

### ReturnValue

صحيح إذا كان الكائن المشار إليه بواسطة [SmartPtr](../) 'أقل' من x وخطأ غير ذلك.

## انظر أيضًا

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::operator<(Y *) const method


يوفر دلالات مقارنة أقل لفئة [SmartPtr](../).

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(Y *p) const
```


| معامل | الوصف |
| --- | --- |
| Y | نوع المؤشر للمقارنة مع المؤشر الحالي. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| p | Y * | المؤشر للمقارنة مع المؤشر الحالي. |

### ReturnValue

صحيح إذا كان الكائن المشار إليه بواسطة [SmartPtr](../) 'أقل' من p وخطأ غير ذلك.

## انظر أيضًا

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
