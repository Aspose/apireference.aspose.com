---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect method"
linktitle: "verbinden"
second_title: "Aspose.Page voor C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect method. Voegt de opgegeven delegate toe aan de collectie in C++."
type: docs
weight: 400
url: /nl/cpp/system/multicastdelegate_returntype(argumenttypes...)_/connect/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(Callback) method


Voegt de opgegeven delegate toe aan de verzameling.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(Callback callback)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| callback | Callback | De delegate om toe te voegen aan de verzameling |

### ReturnValue

Een verwijzing naar zichzelf

## Zie ook

* Typedef [Callback](../callback/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, ClassType *) method


Voegt de opgegeven niet‑statische methode van het opgegeven object toe aan de delegate‑verzameling.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, ClassType *obj)
```


| Parameter | Beschrijving |
| --- | --- |
| MemberType | Het type van de niet-statische methode die aan de delegate-collectie moet worden toegevoegd. |
| ClassType | Het type van de objectmethode die aan de delegate moet worden toegevoegd. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| lid | MemberType ClassType::* | Een pointer naar de niet-statische methode van het opgegeven object |
| obj | ClassType * | Een pointer naar een objectlidmethode die aan de delegate-collectie moet worden toegevoegd. |

### ReturnValue

Een verwijzing naar zichzelf

## Zie ook

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) method


Voegt de opgegeven niet‑statische methode van het opgegeven object toe aan de delegate‑verzameling.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, const SharedPtr<ClassType> &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| MemberType | Het type van de niet-statische methode die aan de delegate-collectie moet worden toegevoegd. |
| ClassType | Het type van de objectmethode die aan de delegate-collectie moet worden toegevoegd. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| lid | MemberType ClassType::* | Een pointer naar de niet-statische methode van het opgegeven object |
| obj | const SharedPtr\<ClassType\>\& | Een gedeelde pointer naar een objectlidmethode die moet worden toegevoegd aan de delegatieverzameling |

### ReturnValue

Een verwijzing naar zichzelf

## Zie ook

* Typedef [SharedPtr](../../sharedptr/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MulticastDelegate\&) method


Voegt het opgegeven MulticastDelegate‑object toe aan de delegate‑verzameling.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MulticastDelegate &other)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| anders | MulticastDelegate\& | Een instantie van de MulticastDelegate-klasse om toe te voegen aan de delegatieverzameling |

### ReturnValue

Een verwijzing naar zichzelf

## Zie ook

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(std::function\<R(Args...)>) method


Voegt het opgegeven functie‑object toe aan de delegatieverzameling. Het functie‑object wordt geconverteerd naar het [Callback](../callback/) delegatietype voordat het wordt toegevoegd aan de verzameling.

```cpp
template<class R,class...> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(std::function<R(Args...)> f)
```


| Parameter | Beschrijving |
| --- | --- |
| R | Het retourtype van het functie‑object dat moet worden toegevoegd aan de verzameling |
| Argumenten | De argumentenlijst van het functie‑object dat moet worden toegevoegd aan de verzameling |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| f | std::function\<R(Args...)> | Het functie‑object om toe te voegen aan de verzameling |

### ReturnValue

Een verwijzing naar zichzelf

## Zie ook

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
