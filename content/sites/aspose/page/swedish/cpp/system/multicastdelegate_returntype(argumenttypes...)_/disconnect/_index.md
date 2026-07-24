---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect metod"
linktitle: "disconnect"
second_title: "Aspose.Page för C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect metod. Tar bort den angivna delegaten från delegatsamlingen i C++."
type: docs
weight: 500
url: /sv/cpp/system/multicastdelegate_returntype(argumenttypes...)_/disconnect/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(Callback) method


Tar bort den angivna delegaten från delegatsamlingen.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(Callback callback)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| återanrop | Callback | Delegaten som ska tas bort från samlingen |

### ReturnValue

En referens till sig själv

## Se även

* Typedef [Callback](../callback/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*, ClassType *) method


Tar bort den angivna icke-statiska metoden för det angivna objektet från delegatsamlingen.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*member, ClassType *obj)
```


| Parameter | Beskrivning |
| --- | --- |
| MemberType | Typen av den icke-statiska metoden som ska tas bort från delegatsamlingen |
| ClassType | Typen av objektmetoden som ska tas bort från delegatsamlingen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| medlem | MemberType ClassType::* | En pekare till den icke-statiska metoden för det angivna objektet |
| obj | ClassType * | En pekare till ett objektmedlemsmetod som ska tas bort från delegatsamlingen |

### ReturnValue

En referens till sig själv

## Se även

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) method


Tar bort den angivna icke-statiska metoden för det angivna objektet från delegatsamlingen.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*member, const SharedPtr<ClassType> &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| MemberType | Typen av den icke-statiska metoden som ska tas bort från delegatsamlingen |
| ClassType | Typen av objektmetoden som ska tas bort från delegatsamlingen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| medlem | MemberType ClassType::* | En pekare till den icke-statiska metoden för det angivna objektet |
| obj | const SharedPtr\<ClassType\>\& | En delad pekare till ett objektmedlemsmetod som ska tas bort från delegatsamlingen |

### ReturnValue

En referens till sig själv

## Se även

* Typedef [SharedPtr](../../sharedptr/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(MulticastDelegate\&) method


Tar bort det angivna MulticastDelegate-objektet från delegatsamlingen.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(MulticastDelegate &other)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| annat | MulticastDelegate\& | En instans av MulticastDelegate-klassen att ta bort från delegatsamlingen |

### ReturnValue

En referens till sig själv

## Se även

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
