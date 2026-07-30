---
title: "System::SmartPtr::SmartPtr Konstruktor"
linktitle: "SmartPtr"
second_title: "Aspose.Font für C++"
description: "System::SmartPtr::SmartPtr Konstruktor. Konvertiert den Typ des referenzierten Arrays, indem ein neues Array eines anderen Typs erstellt wird. Nützlich, wenn es in C# einen Array-Typumwandlung gibt, die in C++ nicht unterstützt wird."
type: docs
weight: 100
url: /de/cpp/system/smartptr/smartptr/
---
## SmartPtr::SmartPtr(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) constructor


Konvertiert den Typ des referenzierten Arrays, indem ein neues Array eines anderen Typs erstellt wird. Nützlich, wenn es in C# einen Array‑Typumwandlungsoperator gibt, der in C++ nicht unterstützt wird.

```cpp
template<typename Y> System::SmartPtr<T>::SmartPtr(const SmartPtr<Array<Y>> &src, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Beschreibung |
| --- | --- |
| Y | Typ des Quellarrays. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| src | const SmartPtr\<Array\<Y\>\>\& | Zeiger auf das Array, von dem eine Kopie erstellt werden soll, jedoch mit einem anderen Elementtyp. |
| mode | SmartPtrMode | Zeigermodus. |

## Siehe auch

* Class [SmartPtr](../)
* Class [Array](../../array/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) constructor


Konstruiert ein [SmartPtr](../), das die Besitzinformationen des ursprünglichen Werts von ptr teilt, aber einen nicht verwandten und nicht verwalteten Zeiger p hält.

```cpp
template<typename P> System::SmartPtr<T>::SmartPtr(const SmartPtr<P> &ptr, Pointee_ *p, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| ptr | const SmartPtr\<P\>\& | Ein weiterer Smart Pointer, um das Eigentum vom Eigentümer zu teilen. |
| p | Pointee_ * | Zeiger auf ein zu verwaltendes Objekt. |
| mode | SmartPtrMode | Zeigermodus. |

## Siehe auch

* Class [SmartPtr](../)
* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<Q\>\&, SmartPtrMode) constructor


Kopiert ein [SmartPtr](../)-Objekt. Beide Zeiger zeigen danach auf dasselbe Objekt. Führt eine Typkonvertierung durch, falls erlaubt.

```cpp
template<class Q,typename> System::SmartPtr<T>::SmartPtr(const SmartPtr<Q> &x, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Beschreibung |
| --- | --- |
| Q | Typ des von x referenzierten Objekts. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | const SmartPtr\\<Q\\>\\& | Zeiger zum Kopieren. |
| mode | SmartPtrMode | Zeigermodus. |

## Siehe auch

* Class [SmartPtr](../)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr_\&, SmartPtrMode) constructor


Kopiert ein [SmartPtr](../)-Objekt. Beide Zeiger zeigen danach auf dasselbe Objekt.

```cpp
System::SmartPtr<T>::SmartPtr(const SmartPtr_ &ptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| ptr | const SmartPtr_\\& | Zeiger zum Kopieren. |
| mode | SmartPtrMode | Zeigermodus. |

## Siehe auch

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(const Y\&) constructor


Initialisiert ein leeres Array. Wird verwendet, um einige C#‑Codekonstrukte zu übersetzen.

```cpp
template<typename Y,typename> System::SmartPtr<T>::SmartPtr(const Y &)
```


| Parameter | Beschreibung |
| --- | --- |
| Y | Platzhalter des Typs EmptyArrayInitializer. |

## Siehe auch

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(Pointee_ *, SmartPtrMode) constructor


Erstellt ein [SmartPtr](../), das auf das angegebene Objekt zeigt, oder konvertiert einen rohen Zeiger zu einem [SmartPtr](../).

```cpp
System::SmartPtr<T>::SmartPtr(Pointee_ *object, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Objekt | Pointee_ * | Pointee. |
| mode | SmartPtrMode | Zeigermodus. |

## Siehe auch

* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(SmartPtr_\&&, SmartPtrMode) constructor


Verschiebt ein [SmartPtr](../)-Objekt. Effektiv werden zwei Zeiger getauscht, wenn sie beide im selben Modus sind. x kann nach dem Aufruf unbrauchbar sein.

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtr_ &&x, SmartPtrMode mode=SmartPtrMode::Shared) noexcept
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | SmartPtr_\&& | Zeiger zum Verschieben. |
| mode | SmartPtrMode | Zeigermodus. |

## Siehe auch

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(SmartPtrMode) constructor


Erstellt ein [SmartPtr](../)-Objekt im erforderlichen Modus.

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtrMode mode)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| mode | SmartPtrMode | Zeigermodus. |

## Siehe auch

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(std::nullptr_t, SmartPtrMode) constructor


Erstellt ein Nullzeiger-[SmartPtr](../)-Objekt im erforderlichen Modus.

```cpp
System::SmartPtr<T>::SmartPtr(std::nullptr_t=nullptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| mode | std::nullptr_t | Zeigermodus. |

## Siehe auch

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
