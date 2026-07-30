---
title: "Metodo System::Delegate< ReturnType(ArgumentTypes...)>::Delegate"
linktitle: "Delegate"
second_title: "Aspose.Font per C++"
description: "Metodo System::Delegate< ReturnType(ArgumentTypes...)>::Delegate. Costruttore predefinito. Costruisce l'oggetto delegate che non punta a nulla in C++."
type: docs
weight: 100
url: /it/cpp/system/delegate_returntype(argumenttypes...)_/delegate/
---
## Delegate< ReturnType(ArgumentTypes...)>::Delegate() method


Costruttore predefinito. Costruisce l'oggetto delegate che non punta a nulla.

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate()=default
```

## Vedi anche

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(const Delegate\&) method




```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(const Delegate &)=default
```

## Vedi anche

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(Delegate\&&) method


Costruttore di copia con spostamento. Assume la proprietà di un'entità a cui punta il delegate specificato.

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(Delegate &&o) noexcept
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| o | Delegate\&& | L'oggetto Delegate da cui spostare l'entità puntata |

## Vedi anche

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(int, T\&) method


Costruttore. Costruisce un delegate dall'oggetto funzione specificato.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(int functor_tag, T &functor)
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo dell'oggetto funzione accettato dal costruttore come argomento |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| functor_tag | int | Un valore intero fittizio; questo argomento è usato per risolvere l'ambiguità |
| functor | T\& | Un oggetto funzione a cui il delegato appena costruito punterà |

## Vedi anche

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(long, T\&&) method


Costruttore di spostamento. Costruisce un delegate dall'oggetto funzione specificato.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(long functor_tag, T &&functor)
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo dell'oggetto funzione accettato dal costruttore come argomento |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| functor_tag | long | Un valore intero fittizio; questo argomento è usato per risolvere l'ambiguità |
| functor | T\&& | Un oggetto funzione a cui il delegato appena costruito punterà |

## Vedi anche

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*, ClassType *) method


Costruttore. Costruisce un delegate che punta al metodo non statico specificato dell'oggetto specificato.

```cpp
template<class MemberType,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*member, ClassType *obj)
```


| Parametro | Descrizione |
| --- | --- |
| MemberType | Il tipo del metodo non statico che il costruttore accetta come argomento |
| ClassType | Il tipo dell'oggetto accettato dal costruttore come argomento |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| membro | MemberType ClassType::* | Un puntatore al metodo non statico a cui il delegato appena creato punterà |
| obj | ClassType * | Un puntatore a un metodo membro di un oggetto a cui punterà il delegato appena creato |

## Vedi anche

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) method


Costruttore. Costruisce un delegate che punta al metodo non statico specificato dell'oggetto specificato.

```cpp
template<class MemberType,class MemberClass,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*member, const SharedPtr<ClassType> &obj)
```


| Parametro | Descrizione |
| --- | --- |
| MemberType | Il tipo del metodo non statico che il costruttore accetta come argomento |
| ClassType | Il tipo dell'oggetto accettato dal costruttore come argomento |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| membro | MemberType MemberClass::* | Un puntatore al metodo non statico a cui il delegato appena creato punterà |
| obj | const SharedPtr\<ClassType\>\& | Un puntatore condiviso a un metodo membro di un oggetto a cui punterà il delegato appena creato |

## Vedi anche

* Typedef [SharedPtr](../../sharedptr/)
* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(std::function\<R(Args...)>) method


Costruisce un oggetto delegate che punta a un oggetto funzione std::function.

```cpp
template<class R,class...> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(std::function<R(Args...)> f)
```


| Parametro | Descrizione |
| --- | --- |
| R | Il tipo di ritorno dell'oggetto funzione accettato dal costruttore come argomento |
| Argomenti | L'elenco degli argomenti dell'oggetto funzione accettato dal costruttore come argomento |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| f | std::function\<R(Args...)> | Un oggetto funzione a cui l'oggetto delegato appena creato punterà |

## Vedi anche

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) method


Costruttore. Costruisce un delegate dal puntatore specificato all'oggetto funzione generato da std::bind().

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<std::is_bind_expression<T>::value>::type *=0)
```


| Parametro | Descrizione |
| --- | --- |
| Il | Tipo dell'oggetto funzione generato da std::bind() accettato dal costruttore come argomento |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| funzione | T | Puntatore a una "bind expression" - un puntatore a funzione generato da std::bind() - a cui punterà l'istanza Delegate appena creata |

## Vedi anche

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) method


Costruttore. Costruisce un oggetto delegate dal puntatore specificato a una funzione libera o a un metodo statico.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<!std::is_bind_expression<T>::value &&std::is_pointer<T>::value &&std::is_function<typename std::remove_pointer<T>::type>::value>::type *=0)
```


| Parametro | Descrizione |
| --- | --- |
| Il | Tipo del puntatore a funzione o metodo statico accettato dal costruttore come argomento |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| funzione | T | Puntatore a una funzione o a un metodo statico a cui punterà l'istanza Delegate appena creata |

## Vedi anche

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
