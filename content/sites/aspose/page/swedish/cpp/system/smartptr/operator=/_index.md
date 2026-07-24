---
title: "System::SmartPtr::operator= metod"
linktitle: "operator="
second_title: "Aspose.Page för C++"
description: "System::SmartPtr::operator= metod. Kopierar och tilldelar SmartPtr‑objekt. Utför nödvändiga typkonverteringar i C++."
type: docs
weight: 2800
url: /sv/cpp/system/smartptr/operator=/
---
## SmartPtr::operator=(const SmartPtr\<Q\>\&) method


Kopierar och tilldelar [SmartPtr](../)‑objekt. Utför nödvändiga typkonverteringar.

```cpp
template<typename Q> SmartPtr_ & System::SmartPtr<T>::operator=(const SmartPtr<Q> &x)
```


| Parameter | Beskrivning |
| --- | --- |
| Q | Typ av objekt som x pekar på. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| x | const SmartPtr\<Q\>\& | Pekare för kopierings‑tilldelning. |

### ReturnValue

Referens till detta objekt.

## Se även

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator=(const SmartPtr_\&) method


Kopierar och tilldelar [SmartPtr](../)‑objekt.

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(const SmartPtr_ &x)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| x | const SmartPtr_\& | Pekare för kopierings‑tilldelning. |

### ReturnValue

Referens till detta objekt.

## Se även

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator=(Pointee_ *) method


Tilldelar rå pekare till [SmartPtr](../)‑objekt.

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(Pointee_ *p)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| p | Pointee_ * | Pekarvärde att tilldela. |

### ReturnValue

Referens till detta objekt.

## Se även

* Typedef [SmartPtr_](../smartptr_/)
* Typedef [Pointee_](../pointee_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator=(SmartPtr_\&&) method


Flyttar och tilldelar [SmartPtr](../)‑objekt. x blir oanvändbar.

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(SmartPtr_ &&x) noexcept
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| x | SmartPtr_\&& | Pekare för flytt‑tilldelning. |

### ReturnValue

Referens till detta objekt.

## Se även

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator=(std::nullptr_t) method


Sätter pekarvärdet till nullptr.

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(std::nullptr_t)
```


### ReturnValue

Referens till detta objekt.

## Se även

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
