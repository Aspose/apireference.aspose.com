---
title: "System::Delegate< ReturnType(ArgumentTypes...)>::Delegate methode"
linktitle: "Delegate"
second_title: "Aspose.Page voor C++"
description: "System::Delegate< ReturnType(ArgumentTypes...)>::Delegate methode. Standaardconstructor. Maakt het delegate‑object dat nergens naar wijst in C++."
type: docs
weight: 100
url: /nl/cpp/system/delegate_returntype(argumenttypes...)_/delegate/
---
## Delegate< ReturnType(ArgumentTypes...)>::Delegate() method


Standaardconstructor. Construeert het delegate‑object dat nergens naar wijst.

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate()=default
```

## Zie ook

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(const Delegate\&) method




```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(const Delegate &)=default
```

## Zie ook

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(Delegate\&&) method


Verplaatsende copy‑constructor. Neemt het eigendom over van een entiteit waarnaar de opgegeven delegate wijst.

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(Delegate &&o) noexcept
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| o | Delegate\&& | Het Delegate-object om de aangewezen entiteit van te verplaatsen |

## Zie ook

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(int, T\&) method


Constructor. Construeert een delegate vanuit het opgegeven functie‑object.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(int functor_tag, T &functor)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type van het functie‑object dat door de constructor als argument wordt geaccepteerd |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| functor_tag | int | Een dummy‑integerwaarde; dit argument wordt gebruikt om ambiguïteit op te lossen |
| functor | T\& | Een functie‑object waarnaar het nieuw geconstrueerde delegate zal wijzen |

## Zie ook

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(long, T\&&) method


Verplaatsende constructor. Construeert een delegate vanuit het opgegeven functie‑object.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(long functor_tag, T &&functor)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type van het functie‑object dat door de constructor als argument wordt geaccepteerd |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| functor_tag | long | Een dummy‑integerwaarde; dit argument wordt gebruikt om ambiguïteit op te lossen |
| functor | T\&& | Een functie‑object waarnaar het nieuw geconstrueerde delegate zal wijzen |

## Zie ook

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*, ClassType *) method


Constructor. Construeert een delegate die wijst naar de opgegeven niet‑statische methode van het opgegeven object.

```cpp
template<class MemberType,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*member, ClassType *obj)
```


| Parameter | Beschrijving |
| --- | --- |
| MemberType | Het type van de niet‑statische methode die de constructor als argument accepteert |
| ClassType | Het type van het object dat door de constructor als argument wordt geaccepteerd |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| lid | MemberType ClassType::* | Een pointer naar de niet‑statische methode waarnaar het nieuw aangemaakte delegate zal wijzen |
| obj | ClassType * | Een pointer naar een object‑lidmethode waarnaar het nieuw aangemaakte delegate zal wijzen |

## Zie ook

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) method


Constructor. Construeert een delegate die wijst naar de opgegeven niet‑statische methode van het opgegeven object.

```cpp
template<class MemberType,class MemberClass,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*member, const SharedPtr<ClassType> &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| MemberType | Het type van de niet‑statische methode die de constructor als argument accepteert |
| ClassType | Het type van het object dat door de constructor als argument wordt geaccepteerd |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| lid | MemberType MemberClass::* | Een pointer naar de niet‑statische methode waarnaar het nieuw aangemaakte delegate zal wijzen |
| obj | const SharedPtr\<ClassType\>\& | Een gedeelde pointer naar een object‑lidmethode waarnaar het nieuw aangemaakte delegate zal wijzen |

## Zie ook

* Typedef [SharedPtr](../../sharedptr/)
* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(std::function\<R(Args...)>) method


Construeert een delegate‑object dat wijst naar een std::function functie‑object.

```cpp
template<class R,class...> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(std::function<R(Args...)> f)
```


| Parameter | Beschrijving |
| --- | --- |
| R | Het retourtype van het functie‑object dat door de constructor als argument wordt geaccepteerd |
| Argumenten | De argumentenlijst van het functie‑object dat door de constructor als argument wordt geaccepteerd |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| f | std::function\<R(Args...)> | Een functie‑object waarnaar het nieuw aangemaakte delegate‑object zal wijzen |

## Zie ook

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) method


Constructor. Construeert een delegate vanuit de opgegeven pointer naar het functie‑object gegenereerd door std::bind().

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<std::is_bind_expression<T>::value>::type *=0)
```


| Parameter | Beschrijving |
| --- | --- |
| De | type van het functie‑object gegenereerd door std::bind() dat door de constructor als argument wordt geaccepteerd |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| functie | T | Pointer naar een \"bind‑expressie\" - een functie‑pointer gegenereerd door std::bind() - die zal worden aangewezen door de nieuw aangemaakte Delegate‑instantie |

## Zie ook

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) method


Constructor. Construeert een delegate‑object vanuit de opgegeven pointer naar een vrije functie of statische methode.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<!std::is_bind_expression<T>::value &&std::is_pointer<T>::value &&std::is_function<typename std::remove_pointer<T>::type>::value>::type *=0)
```


| Parameter | Beschrijving |
| --- | --- |
| De | type van de functie- of statische methodpointer die door de constructor als argument wordt geaccepteerd |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| functie | T | Pointer naar een functie of een statische methode waarnaar wordt gepointerd door de nieuw aangemaakte Delegate‑instantie |

## Zie ook

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
