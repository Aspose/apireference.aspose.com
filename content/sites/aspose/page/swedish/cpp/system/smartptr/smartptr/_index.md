---
title: "System::SmartPtr::SmartPtr konstruktor"
linktitle: "SmartPtr"
second_title: "Aspose.Page för C++"
description: "System::SmartPtr::SmartPtr konstruktor. Konverterar typen av den refererade arrayen genom att skapa en ny array av en annan typ. Användbart om det i C# finns en array-typkonvertering som inte stöds i C++."
type: docs
weight: 100
url: /sv/cpp/system/smartptr/smartptr/
---
## SmartPtr::SmartPtr(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) constructor


Konverterar typen på den refererade arrayen genom att skapa en ny array av annan typ. Användbart om det i C# finns en array‑typcast som inte stöds i C++.

```cpp
template<typename Y> System::SmartPtr<T>::SmartPtr(const SmartPtr<Array<Y>> &src, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Beskrivning |
| --- | --- |
| Y | Typ av källarray. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| src | const SmartPtr\<Array\<Y\>\>\& | Pekare till en array att skapa en kopia av, men med en annan typ av element. |
| mode | SmartPtrMode | Pekarläge. |

## Se även

* Class [SmartPtr](../)
* Class [Array](../../array/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) constructor


Skapar en [SmartPtr](../) som delar äganderättsinformation med det ursprungliga värdet av ptr, men håller en orelaterad och ohanterad pekare p.

```cpp
template<typename P> System::SmartPtr<T>::SmartPtr(const SmartPtr<P> &ptr, Pointee_ *p, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| ptr | const SmartPtr\<P\>\& | En annan smart pekare för att dela äganderätten från. |
| p | Pointee_ * | Pekare till ett objekt att hantera. |
| mode | SmartPtrMode | Pekarläge. |

## Se även

* Class [SmartPtr](../)
* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<Q\>\&, SmartPtrMode) constructor


Kopierar och konstruerar ett [SmartPtr](../)-objekt. Båda pekarna pekar på samma objekt efteråt. Utför typkonvertering om tillåtet.

```cpp
template<class Q,typename> System::SmartPtr<T>::SmartPtr(const SmartPtr<Q> &x, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Beskrivning |
| --- | --- |
| Q | Typ av objekt som x pekar på. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| x | const SmartPtr\<Q\>\& | Pekare att kopiera. |
| mode | SmartPtrMode | Pekarläge. |

## Se även

* Class [SmartPtr](../)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr_\&, SmartPtrMode) constructor


Kopierar och konstruerar ett [SmartPtr](../)-objekt. Båda pekarna pekar på samma objekt efteråt.

```cpp
System::SmartPtr<T>::SmartPtr(const SmartPtr_ &ptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| ptr | const SmartPtr_\& | Pekare att kopiera. |
| mode | SmartPtrMode | Pekarläge. |

## Se även

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const Y\&) constructor


Initierar en tom array. Används för att översätta vissa C#‑kodkonstruktioner.

```cpp
template<typename Y,typename> System::SmartPtr<T>::SmartPtr(const Y &)
```


| Parameter | Beskrivning |
| --- | --- |
| Y | Platshållare för typen EmptyArrayInitializer. |

## Se även

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(Pointee_ *, SmartPtrMode) constructor


Skapar ett [SmartPtr](../) som pekar på specificerat objekt, eller konverterar rå pekare till [SmartPtr](../).

```cpp
System::SmartPtr<T>::SmartPtr(Pointee_ *object, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| objekt | Pointee_ * | Pekad. |
| mode | SmartPtrMode | Pekarläge. |

## Se även

* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(SmartPtr_\&&, SmartPtrMode) constructor


Flyttar och konstruerar ett [SmartPtr](../)-objekt. Effektivt byter två pekare plats, om de båda har samma läge. x kan vara oanvändbar efter anropet.

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtr_ &&x, SmartPtrMode mode=SmartPtrMode::Shared) noexcept
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| x | SmartPtr_\&& | Pekare att flytta. |
| mode | SmartPtrMode | Pekarläge. |

## Se även

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(SmartPtrMode) constructor


Skapar ett [SmartPtr](../)-objekt i önskat läge.

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtrMode mode)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| mode | SmartPtrMode | Pekarläge. |

## Se även

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(std::nullptr_t, SmartPtrMode) constructor


Skapar ett null‑pekare [SmartPtr](../)-objekt i önskat läge.

```cpp
System::SmartPtr<T>::SmartPtr(std::nullptr_t=nullptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| mode | std::nullptr_t | Pekarläge. |

## Se även

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
