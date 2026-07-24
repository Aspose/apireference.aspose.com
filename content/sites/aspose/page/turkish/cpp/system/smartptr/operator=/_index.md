---
title: "System::SmartPtr::operator= yöntemi"
linktitle: "operator="
second_title: "Aspose.Page için C++"
description: "System::SmartPtr::operator= yöntemi. SmartPtr nesnesini kopya ataması yapar. Gerekli tür dönüşümlerini C++'da gerçekleştirir."
type: docs
weight: 2800
url: /tr/cpp/system/smartptr/operator=/
---
## SmartPtr::operator=(const SmartPtr\<Q\>\&) method


[SmartPtr](../) nesnesine kopya ataması yapar. Gerekli tür dönüşümlerini gerçekleştirir.

```cpp
template<typename Q> SmartPtr_ & System::SmartPtr<T>::operator=(const SmartPtr<Q> &x)
```


| Parameter | Açıklama |
| --- | --- |
| Q | x tarafından işaret edilen nesnenin türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| x | const SmartPtr\<Q\>\& | Kopya ataması için işaretçi. |

### ReturnValue

Bu nesneye referans.

## Ayrıca Bakınız

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator=(const SmartPtr_\&) method


[SmartPtr](../) nesnesine kopya ataması yapar.

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(const SmartPtr_ &x)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| x | const SmartPtr_\& | Kopya ataması için işaretçi. |

### ReturnValue

Bu nesneye referans.

## Ayrıca Bakınız

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator=(Pointee_ *) method


Ham işaretçiyi [SmartPtr](../) nesnesine atar.

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(Pointee_ *p)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| p | Pointee_ * | Atanacak işaretçi değeri. |

### ReturnValue

Bu nesneye referans.

## Ayrıca Bakınız

* Typedef [SmartPtr_](../smartptr_/)
* Typedef [Pointee_](../pointee_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator=(SmartPtr_\&&) method


[SmartPtr](../) nesnesine taşıma ataması yapar. x kullanılamaz hâle gelir.

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(SmartPtr_ &&x) noexcept
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| x | SmartPtr_\&& | Taşıma ataması için işaretçi. |

### ReturnValue

Bu nesneye referans.

## Ayrıca Bakınız

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator=(std::nullptr_t) method


İşaretçi değerini nullptr olarak ayarlar.

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(std::nullptr_t)
```


### ReturnValue

Bu nesneye referans.

## Ayrıca Bakınız

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
