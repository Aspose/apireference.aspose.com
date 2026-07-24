---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect‑metod"
linktitle: "anslut"
second_title: "Aspose.Page för C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect‑metod. Lägger till den angivna delegaten i kollektionen i C++."
type: docs
weight: 400
url: /sv/cpp/system/multicastdelegate_returntype(argumenttypes...)_/connect/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(Callback) method


Lägger till den angivna delegaten i samlingen.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(Callback callback)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| återanrop | Callback | Delegaten att lägga till i samlingen |

### ReturnValue

En referens till sig själv

## Se även

* Typedef [Callback](../callback/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, ClassType *) method


Lägger till den angivna icke-statiska metoden för det angivna objektet i delegatsamlingen.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, ClassType *obj)
```


| Parameter | Beskrivning |
| --- | --- |
| MemberType | Typen av den icke‑statiska metoden som ska läggas till i delegatkollektionen |
| ClassType | Typen av objektmetoden som ska läggas till i delegaten |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| medlem | MemberType ClassType::* | En pekare till den icke-statiska metoden för det angivna objektet |
| obj | ClassType * | En pekare till en objektmedlemsmetod som ska läggas till i delegatkollektionen |

### ReturnValue

En referens till sig själv

## Se även

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) method


Lägger till den angivna icke-statiska metoden för det angivna objektet i delegatsamlingen.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, const SharedPtr<ClassType> &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| MemberType | Typen av den icke‑statiska metoden som ska läggas till i delegatkollektionen |
| ClassType | Typen av objektmetoden som ska läggas till i delegatkollektionen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| medlem | MemberType ClassType::* | En pekare till den icke-statiska metoden för det angivna objektet |
| obj | const SharedPtr\<ClassType\>\& | En delad pekare till en objektmedlemsmetod som ska läggas till i delegatkollektionen |

### ReturnValue

En referens till sig själv

## Se även

* Typedef [SharedPtr](../../sharedptr/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MulticastDelegate\&) method


Lägger till det angivna MulticastDelegate-objektet i delegatsamlingen.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MulticastDelegate &other)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| annat | MulticastDelegate\& | En instans av MulticastDelegate‑klassen att lägga till i delegatkollektionen |

### ReturnValue

En referens till sig själv

## Se även

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(std::function\<R(Args...)>) method


Lägger till det angivna funktionsobjektet i delegatkollektionen. Funktionsobjektet konverteras till delegattypen [Callback](../callback/) innan det läggs till i kollektionen.

```cpp
template<class R,class...> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(std::function<R(Args...)> f)
```


| Parameter | Beskrivning |
| --- | --- |
| R | Returtypen för funktionsobjektet som ska läggas till i kollektionen |
| Argument | Argumentlistan för funktionsobjektet som ska läggas till i kollektionen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| f | std::function\<R(Args...)\> | Funktionsobjektet som ska läggas till i kollektionen |

### ReturnValue

En referens till sig själv

## Se även

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
