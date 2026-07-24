---
title: "System::Delegate< ReturnType(ArgumentTypes...)>::Delegate-metod"
linktitle: "Delegate"
second_title: "Aspose.Page för C++"
description: "System::Delegate< ReturnType(ArgumentTypes...)>::Delegate-metod. Standardkonstruktor. Skapar delegat-objektet som inte pekar på något i C++."
type: docs
weight: 100
url: /sv/cpp/system/delegate_returntype(argumenttypes...)_/delegate/
---
## Delegate< ReturnType(ArgumentTypes...)>::Delegate() method


Standardkonstruktor. Skapar delegatobjektet som inte pekar på någonting.

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate()=default
```

## Se även

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(const Delegate\&) method




```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(const Delegate &)=default
```

## Se även

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(Delegate\&&) method


Flyttkopieringskonstruktor. Tar äganderätten till en entitet som pekas på av den angivna delegaten.

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(Delegate &&o) noexcept
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| o | Delegate\\&& | Delegate-objektet att flytta den pekade enheten från |

## Se även

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(int, T\&) method


Konstruktor. Skapar en delegat från det angivna funktionsobjektet.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(int functor_tag, T &functor)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typen av funktionsobjekt som accepteras av konstruktorn som argument |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| functor_tag | int | Ett dummy-heltal; detta argument används för att lösa tvetydighet |
| functor | T\& | Ett funktionsobjekt som den nykonstruerade delegaten kommer att peka på |

## Se även

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(long, T\&&) method


Flyttkonstruktor. Skapar en delegat från det angivna funktionsobjektet.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(long functor_tag, T &&functor)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typen av funktionsobjekt som accepteras av konstruktorn som argument |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| functor_tag | long | Ett dummy-heltal; detta argument används för att lösa tvetydighet |
| functor | T\&& | Ett funktionsobjekt som den nykonstruerade delegaten kommer att peka på |

## Se även

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*, ClassType *) method


Konstruktor. Skapar en delegat som pekar på den angivna icke-statiska metoden för det angivna objektet.

```cpp
template<class MemberType,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*member, ClassType *obj)
```


| Parameter | Beskrivning |
| --- | --- |
| MemberType | Typen av den icke‑statisk metod som konstruktorn accepterar som argument |
| ClassType | Typen av objektet som konstruktorn accepterar som argument |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| medlem | MemberType ClassType::* | En pekare till den icke‑statisk metod som den nysskapade delegaten kommer att peka på |
| obj | ClassType * | En pekare till en medlemsmetod för ett objekt som den nysskapade delegaten kommer att peka på |

## Se även

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) method


Konstruktor. Skapar en delegat som pekar på den angivna icke-statiska metoden för det angivna objektet.

```cpp
template<class MemberType,class MemberClass,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*member, const SharedPtr<ClassType> &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| MemberType | Typen av den icke‑statisk metod som konstruktorn accepterar som argument |
| ClassType | Typen av objektet som konstruktorn accepterar som argument |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| medlem | MemberType MemberClass::* | En pekare till den icke‑statisk metod som den nysskapade delegaten kommer att peka på |
| obj | const SharedPtr\<ClassType\>\& | En delad pekare till en medlemsmetod för ett objekt som den nysskapade delegaten kommer att peka på |

## Se även

* Typedef [SharedPtr](../../sharedptr/)
* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(std::function\<R(Args...)>) method


Skapar ett delegatobjekt som pekar på ett std::function-funktionsobjekt.

```cpp
template<class R,class...> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(std::function<R(Args...)> f)
```


| Parameter | Beskrivning |
| --- | --- |
| R | Returtypen för funktionsobjektet som konstruktorn accepterar som argument |
| Argument | Argumentlistan för funktionsobjektet som konstruktorn accepterar som argument |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| f | std::function\<R(Args...)\> | Ett funktionsobjekt som det nysskapade delegatobjektet ska peka på |

## Se även

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) method


Konstruktor. Skapar en delegat från den angivna pekaren till funktionsobjektet som genererats av std::bind().

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<std::is_bind_expression<T>::value>::type *=0)
```


| Parameter | Beskrivning |
| --- | --- |
| Den | Typen av funktionsobjektet som genereras av std::bind() och som konstruktorn accepterar som argument |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| funktion | T | Pekare till ett \"bind‑uttryck\" – en funktionspekare genererad av std::bind() – som den nysskapade Delegate‑instansen kommer att peka på |

## Se även

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) method


Konstruktor. Skapar ett delegatobjekt från den angivna pekaren till en fri funktion eller statisk metod.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<!std::is_bind_expression<T>::value &&std::is_pointer<T>::value &&std::is_function<typename std::remove_pointer<T>::type>::value>::type *=0)
```


| Parameter | Beskrivning |
| --- | --- |
| Den | Typen av funktions- eller statisk metodpekare som konstruktorn accepterar som argument |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| funktion | T | Pekare till en funktion eller en statisk metod som den nysskapade Delegate‑instansen kommer att peka på |

## Se även

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
