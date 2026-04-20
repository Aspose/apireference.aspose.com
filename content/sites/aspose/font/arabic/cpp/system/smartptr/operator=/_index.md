---
title: "طريقة System::SmartPtr::operator="
linktitle: "operator="
second_title: "Aspose.Font لـ C++"
description: "طريقة System::SmartPtr::operator=. تُعيّن نسخة من كائن SmartPtr. تقوم بالتحويلات النوعية المطلوبة في C++."
type: docs
weight: 2800
url: /ar/cpp/system/smartptr/operator=/
---
## SmartPtr::operator=(const SmartPtr\<Q\>\&) method


تُعيّن نسخة من كائن [SmartPtr](../). تقوم بالتحويلات النوعية المطلوبة.

```cpp
template<typename Q> SmartPtr_ & System::SmartPtr<T>::operator=(const SmartPtr<Q> &x)
```


| معامل | الوصف |
| --- | --- |
| Q | نوع الكائن الذي يشير إليه x. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| x | const SmartPtr\<Q\>\& | مؤشر إلى النسخ-التعيين. |

### ReturnValue

مرجع إلى هذا الكائن.

## انظر أيضًا

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::operator=(const SmartPtr_\&) method


تُعيّن نسخة من كائن [SmartPtr](../).

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(const SmartPtr_ &x)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| x | const SmartPtr_\& | مؤشر إلى النسخ-التعيين. |

### ReturnValue

مرجع إلى هذا الكائن.

## انظر أيضًا

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::operator=(Pointee_ *) method


تُعيّن مؤشرًا خامًا إلى كائن [SmartPtr](../).

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(Pointee_ *p)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| p | Pointee_ * | قيمة المؤشر للتعيين. |

### ReturnValue

مرجع إلى هذا الكائن.

## انظر أيضًا

* Typedef [SmartPtr_](../smartptr_/)
* Typedef [Pointee_](../pointee_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::operator=(SmartPtr_\&&) method


تُعيّن نقلًا لكائن [SmartPtr](../). يصبح x غير قابل للاستخدام.

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(SmartPtr_ &&x) noexcept
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| x | SmartPtr_\&& | مؤشر إلى عملية النقل-التعيين. |

### ReturnValue

مرجع إلى هذا الكائن.

## انظر أيضًا

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::operator=(std::nullptr_t) method


يضبط قيمة المؤشر إلى nullptr.

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(std::nullptr_t)
```


### ReturnValue

مرجع إلى هذا الكائن.

## انظر أيضًا

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
