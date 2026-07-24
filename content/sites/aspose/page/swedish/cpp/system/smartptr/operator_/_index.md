---
title: "System::SmartPtr::operator* metod"
linktitle: "operator*"
second_title: "Aspose.Page för C++"
description: "System::SmartPtr::operator* metod. Hämtar referens till det pekade objektet. Assertar att pekaren inte är null i C++."
type: docs
weight: 2500
url: /sv/cpp/system/smartptr/operator_/
---
## SmartPtr::operator* method


Hämtar en referens till det pekade objektet. Påstår att pekaren inte är null.

```cpp
Pointee_ & System::SmartPtr<T>::operator*() const
```


### ReturnValue

Referens till det pekade objektet.

## Se även

* Typedef [Pointee_](../pointee_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
title: System::SmartPtr::operator< metod
länktitel: operator<
andra_titel: Aspose.Page för C++
description: 'System::SmartPtr::operator< metod. Tillhandahåller mindre-jämförelse semantik för SmartPtr-klassen i C++.'
typ: docs
weight: 2700
url: /cpp/system/smartptr/operator_/
---
## SmartPtr::operator<(SmartPtr\<Y\> const\&) const method


Tillhandahåller mindre-jämförelse semantik för [SmartPtr](../) klass.

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(SmartPtr<Y> const &x) const
```


| Parameter | Beskrivning |
| --- | --- |
| Y | Typ av pekare att jämföra den aktuella med. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| x | SmartPtr\<Y\> const\& | Pekare att jämföra den aktuella med. |

### ReturnValue

Sant om objektet som refereras av [SmartPtr](../) är 'mindre' än x och falskt annars.

## Se även

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator<(Y *) const method


Tillhandahåller mindre-jämförelse semantik för [SmartPtr](../) klass.

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(Y *p) const
```


| Parameter | Beskrivning |
| --- | --- |
| Y | Typ av pekare att jämföra den aktuella med. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| p | Y * | Pekare att jämföra den aktuella med. |

### ReturnValue

Sant om objektet som refereras av [SmartPtr](../) är 'mindre' än p och falskt annars.

## Se även

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
