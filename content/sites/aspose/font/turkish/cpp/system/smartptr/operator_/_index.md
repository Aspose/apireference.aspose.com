---
title: "System::SmartPtr::operator* method"
linktitle: "operator*"
second_title: "Aspose.Font için C++"
description: "System::SmartPtr::operator* yöntemi. İşaret edilen nesneye referans alır. C++'ta işaretçinin null olmadığını doğrular."
type: docs
weight: 2500
url: /tr/cpp/system/smartptr/operator_/
---
## SmartPtr::operator* method


İşaret edilen nesneye referansı alır. İşaretçinin null olmadığını doğrular.

```cpp
Pointee_ & System::SmartPtr<T>::operator*() const
```


### ReturnValue

İşaret edilen nesneye referans.

## Ayrıca Bakınız

* Typedef [Pointee_](../pointee_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
---
başlık: System::SmartPtr::operator< method
linktitle: operator<
ikinci başlık: Aspose.Font for C++
description: 'System::SmartPtr::operator< yöntemi. C++'da SmartPtr sınıfı için daha az karşılaştırma semantiği sağlar.'
tür: docs
ağırlık: 2700
url: /cpp/system/smartptr/operator_/
---
## SmartPtr::operator<(SmartPtr\<Y\> const\&) const method


Sağlar [SmartPtr](../) sınıfı için daha az karşılaştırma semantiği.

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(SmartPtr<Y> const &x) const
```


| Parametre | Açıklama |
| --- | --- |
| Y | Mevcut işaretçiye karşılaştırılacak işaretçi türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| x | SmartPtr\<Y\> const\& | Mevcut işaretçiye karşılaştırılacak işaretçi. |

### ReturnValue

Eğer [SmartPtr](../) tarafından referans verilen nesne x'ten 'daha az' ise doğru, aksi takdirde yanlıştır.

## Ayrıca Bakınız

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::operator<(Y *) const method


Sağlar [SmartPtr](../) sınıfı için daha az karşılaştırma semantiği.

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(Y *p) const
```


| Parametre | Açıklama |
| --- | --- |
| Y | Mevcut işaretçiye karşılaştırılacak işaretçi türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| p | Y * | Mevcut işaretçiye karşılaştırılacak işaretçi. |

### ReturnValue

Eğer [SmartPtr](../) tarafından referans verilen nesne p'ten 'daha az' ise doğru, aksi takdirde yanlıştır.

## Ayrıca Bakınız

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
