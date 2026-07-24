---
title: "System::SmartPtr::SmartPtr constructor"
linktitle: "SmartPtr"
second_title: "Aspose.Page voor C++"
description: "System::SmartPtr::SmartPtr constructor. Converteert het type van de gerefereerde array door een nieuwe array van een ander type te maken. Handig als er in C# een arraytypecast is die niet wordt ondersteund in C++."
type: docs
weight: 100
url: /nl/cpp/system/smartptr/smartptr/
---
## SmartPtr::SmartPtr(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) constructor


Converteert het type van de gerefereerde array door een nieuwe array van een ander type te maken. Handig als er in C# een array‑typecast bestaat die niet wordt ondersteund in C++.

```cpp
template<typename Y> System::SmartPtr<T>::SmartPtr(const SmartPtr<Array<Y>> &src, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Beschrijving |
| --- | --- |
| Y | Type van bronarray. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| src | const SmartPtr\<Array\<Y\>\>\& | Pointer naar array om een kopie van te maken, maar met een ander type elementen. |
| mode | SmartPtrMode | Pointer-modus. |

## Zie ook

* Class [SmartPtr](../)
* Class [Array](../../array/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) constructor


Construeert een [SmartPtr](../) die eigendomsinformatie deelt met de initiële waarde van ptr, maar een niet-gerelateerde en onbeheerde pointer p bevat.

```cpp
template<typename P> System::SmartPtr<T>::SmartPtr(const SmartPtr<P> &ptr, Pointee_ *p, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| ptr | const SmartPtr\<P\>\& | Een andere smart pointer om het eigendom te delen met het eigendom van. |
| p | Pointee_ * | Pointer naar een object om te beheren. |
| mode | SmartPtrMode | Pointer-modus. |

## Zie ook

* Class [SmartPtr](../)
* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<Q\>\&, SmartPtrMode) constructor


Kopieert [SmartPtr](../) object. Beide pointers wijzen daarna naar hetzelfde object. Voert typeconversie uit indien toegestaan.

```cpp
template<class Q,typename> System::SmartPtr<T>::SmartPtr(const SmartPtr<Q> &x, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Beschrijving |
| --- | --- |
| Q | Type van het object waar x naar wijst. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | const SmartPtr\<Q\>\& | Pointer naar kopie. |
| mode | SmartPtrMode | Pointer-modus. |

## Zie ook

* Class [SmartPtr](../)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr_\&, SmartPtrMode) constructor


Kopieert [SmartPtr](../) object. Beide pointers wijzen daarna naar hetzelfde object.

```cpp
System::SmartPtr<T>::SmartPtr(const SmartPtr_ &ptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| ptr | const SmartPtr_\& | Pointer naar kopie. |
| mode | SmartPtrMode | Pointer-modus. |

## Zie ook

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const Y\&) constructor


Initialiseert een lege array. Wordt gebruikt om sommige C#‑codeconstructies te vertalen.

```cpp
template<typename Y,typename> System::SmartPtr<T>::SmartPtr(const Y &)
```


| Parameter | Beschrijving |
| --- | --- |
| Y | Plaatsvervanger van type EmptyArrayInitializer. |

## Zie ook

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(Pointee_ *, SmartPtrMode) constructor


Maakt [SmartPtr](../) aan die wijst naar het opgegeven object, of converteert een ruwe pointer naar [SmartPtr](../).

```cpp
System::SmartPtr<T>::SmartPtr(Pointee_ *object, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| object | Pointee_ * | Pointee. |
| mode | SmartPtrMode | Pointer-modus. |

## Zie ook

* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(SmartPtr_\&&, SmartPtrMode) constructor


Verplaatst [SmartPtr](../) object. Effectief verwisselt het twee pointers, als ze beide dezelfde modus hebben. x kan na de aanroep onbruikbaar zijn.

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtr_ &&x, SmartPtrMode mode=SmartPtrMode::Shared) noexcept
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | SmartPtr_\&& | Pointer om te verplaatsen. |
| mode | SmartPtrMode | Pointer-modus. |

## Zie ook

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(SmartPtrMode) constructor


Maakt [SmartPtr](../) object van de vereiste modus.

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtrMode mode)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| mode | SmartPtrMode | Pointer-modus. |

## Zie ook

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(std::nullptr_t, SmartPtrMode) constructor


Maakt een null-pointer [SmartPtr](../) object van de vereiste modus.

```cpp
System::SmartPtr<T>::SmartPtr(std::nullptr_t=nullptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| mode | std::nullptr_t | Pointer-modus. |

## Zie ook

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
