---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect metodo"
linktitle: "disconnect"
second_title: "Aspose.Font per C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect metodo. Rimuove il delegato specificato dalla collezione di delegati in C++."
type: docs
weight: 500
url: /it/cpp/system/multicastdelegate_returntype(argumenttypes...)_/disconnect/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(Callback) method


Rimuove il delegato specificato dalla collezione di delegati.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(Callback callback)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| callback | Callback | Il delegato da rimuovere dalla collezione |

### ReturnValue

Un riferimento a se stesso

## Vedi anche

* Typedef [Callback](../callback/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*, ClassType *) method


Rimuove il metodo non statico specificato dell'oggetto specificato dalla collezione di delegati.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*member, ClassType *obj)
```


| Parametro | Descrizione |
| --- | --- |
| MemberType | Il tipo del metodo non statico che deve essere rimosso dalla collezione di delegati |
| ClassType | Il tipo del metodo dell'oggetto che deve essere rimosso dalla collezione di delegati |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| membro | MemberType ClassType::* | Un puntatore al metodo non statico dell'oggetto specificato |
| obj | ClassType * | Un puntatore a un metodo membro di un oggetto che deve essere rimosso dalla collezione di delegati |

### ReturnValue

Un riferimento a se stesso

## Vedi anche

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) method


Rimuove il metodo non statico specificato dell'oggetto specificato dalla collezione di delegati.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*member, const SharedPtr<ClassType> &obj)
```


| Parametro | Descrizione |
| --- | --- |
| MemberType | Il tipo del metodo non statico che deve essere rimosso dalla collezione di delegati |
| ClassType | Il tipo del metodo dell'oggetto che deve essere rimosso dalla collezione di delegati |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| membro | MemberType ClassType::* | Un puntatore al metodo non statico dell'oggetto specificato |
| obj | const SharedPtr\<ClassType\>\& | Un puntatore condiviso a un metodo membro di un oggetto che deve essere rimosso dalla collezione di delegati |

### ReturnValue

Un riferimento a se stesso

## Vedi anche

* Typedef [SharedPtr](../../sharedptr/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(MulticastDelegate\&) method


Rimuove l'oggetto MulticastDelegate specificato dalla collezione di delegati.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(MulticastDelegate &other)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| altro | MulticastDelegate\& | Un'istanza della classe MulticastDelegate da rimuovere dalla collezione di delegati |

### ReturnValue

Un riferimento a se stesso

## Vedi anche

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
