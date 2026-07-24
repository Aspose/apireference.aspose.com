---
title: "طريقة System::SmartPtr::operator="
linktitle: "operator="
second_title: "Aspose.Page لـ C++"
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


| Parameter | الوصف |
| --- | --- |
| Q | نوع الكائن الذي يشير إليه x. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| x | const SmartPtr\<Q\>\& | مؤشر إلى النسخة المعينة. |

### ReturnValue

مرجع إلى هذا الكائن.

## انظر أيضًا

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator=(const SmartPtr_\&) method


تُعيّن نسخة من كائن [SmartPtr](../).

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(const SmartPtr_ &x)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| x | const SmartPtr_\& | مؤشر إلى النسخة المعينة. |

### ReturnValue

مرجع إلى هذا الكائن.

## انظر أيضًا

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator=(Pointee_ *) method


تُعيّن المؤشر الخام إلى كائن [SmartPtr](../).

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(Pointee_ *p)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| p | Pointee_ * | قيمة المؤشر للتعيين. |

### ReturnValue

مرجع إلى هذا الكائن.

## انظر أيضًا

* Typedef [SmartPtr_](../smartptr_/)
* Typedef [Pointee_](../pointee_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator=(SmartPtr_\&&) method


تُعيد تعيين حركة لكائن [SmartPtr](../). يصبح x غير قابل للاستخدام.

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(SmartPtr_ &&x) noexcept
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| x | SmartPtr_\&& | مؤشر إلى تعيين الحركة. |

### ReturnValue

مرجع إلى هذا الكائن.

## انظر أيضًا

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
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
* Library [Aspose.Page for C++](../../../)
