---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect metodo"
linktitle: "collega"
second_title: "Aspose.Font per C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect metodo. Aggiunge il delegato specificato alla collezione in C++."
type: docs
weight: 400
url: /it/cpp/system/multicastdelegate_returntype(argumenttypes...)_/connect/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(Callback) method


Aggiunge il delegato specificato alla collezione.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(Callback callback)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| callback | Callback | Il delegato da aggiungere alla collezione |

### ReturnValue

Un riferimento a se stesso

## Vedi anche

* Typedef [Callback](../callback/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, ClassType *) method


Aggiunge il metodo non statico specificato dell'oggetto specificato alla collezione di delegati.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, ClassType *obj)
```


| Parametro | Descrizione |
| --- | --- |
| MemberType | Il tipo del metodo non statico da aggiungere alla collezione di delegati |
| ClassType | Il tipo del metodo dell'oggetto da aggiungere al delegato |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| membro | MemberType ClassType::* | Un puntatore al metodo non statico dell'oggetto specificato |
| obj | ClassType * | Un puntatore a un metodo membro di un oggetto da aggiungere alla collezione di delegati |

### ReturnValue

Un riferimento a se stesso

## Vedi anche

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) method


Aggiunge il metodo non statico specificato dell'oggetto specificato alla collezione di delegati.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, const SharedPtr<ClassType> &obj)
```


| Parametro | Descrizione |
| --- | --- |
| MemberType | Il tipo del metodo non statico da aggiungere alla collezione di delegati |
| ClassType | Il tipo del metodo dell'oggetto da aggiungere alla collezione di delegati |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| membro | MemberType ClassType::* | Un puntatore al metodo non statico dell'oggetto specificato |
| obj | const SharedPtr\<ClassType\>\& | Un puntatore condiviso a un metodo membro di un oggetto da aggiungere alla collezione di delegati |

### ReturnValue

Un riferimento a se stesso

## Vedi anche

* Typedef [SharedPtr](../../sharedptr/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MulticastDelegate\&) method


Aggiunge l'oggetto MulticastDelegate specificato alla collezione di delegati.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MulticastDelegate &other)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| altro | MulticastDelegate\& | Un'istanza della classe MulticastDelegate da aggiungere alla collezione di delegati |

### ReturnValue

Un riferimento a se stesso

## Vedi anche

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(std::function\<R(Args...)>) method


Aggiunge l'oggetto funzione specificato alla collezione di delegati. L'oggetto funzione viene convertito al tipo delegato [Callback](../callback/) prima di essere aggiunto alla collezione.

```cpp
template<class R,class...> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(std::function<R(Args...)> f)
```


| Parametro | Descrizione |
| --- | --- |
| R | Il tipo di ritorno dell'oggetto funzione da aggiungere alla collezione |
| Argomenti | L'elenco degli argomenti dell'oggetto funzione da aggiungere alla collezione |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| f | std::function\<R(Args...)> | L'oggetto funzione da aggiungere alla collezione |

### ReturnValue

Un riferimento a se stesso

## Vedi anche

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
