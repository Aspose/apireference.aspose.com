---
title: "System::SmartPtr::operator* yöntemi"
linktitle: "operator*"
second_title: "Aspose.Page için C++"
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
* Library [Aspose.Page for C++](../../../)
---
başlık: System::SmartPtr::operator< method
bağlantı başlığı: operator<
second_title: Aspose.Page for C++
açıklama: 'System::SmartPtr::operator< yöntemi. C++'ta SmartPtr sınıfı için daha az karşılaştırma semantiği sağlar.'
type: docs
weight: 2700
url: /cpp/system/smartptr/operator_/
---
## SmartPtr::operator<(SmartPtr\<Y\> const\&) const method


[SmartPtr](../) sınıfı için daha az karşılaştırma semantiği sağlar.

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(SmartPtr<Y> const &x) const
```


| Parameter | Açıklama |
| --- | --- |
| Y | Mevcut işaretçiyle karşılaştırılacak işaretçi türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| x | SmartPtr\<Y\> const\& | Mevcut işaretçiyle karşılaştırılacak işaretçi. |

### ReturnValue

[SmartPtr](../) tarafından referans verilen nesne x'ten 'daha az' ise doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator<(Y *) const method


[SmartPtr](../) sınıfı için daha az karşılaştırma semantiği sağlar.

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(Y *p) const
```


| Parameter | Açıklama |
| --- | --- |
| Y | Mevcut işaretçiyle karşılaştırılacak işaretçi türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| p | Y * | Mevcut işaretçiyle karşılaştırılacak işaretçi. |

### ReturnValue

Eğer [SmartPtr](../) tarafından referans verilen nesne p'den 'küçük' ise doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
