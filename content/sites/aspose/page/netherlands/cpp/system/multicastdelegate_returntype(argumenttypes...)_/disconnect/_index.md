---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect methode"
linktitle: "disconnect"
second_title: "Aspose.Page voor C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect methode. Verwijdert de opgegeven delegate uit de delegatenverzameling in C++."
type: docs
weight: 500
url: /nl/cpp/system/multicastdelegate_returntype(argumenttypes...)_/disconnect/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(Callback) method


Verwijdert de opgegeven delegate uit de delegate‑verzameling.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(Callback callback)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| callback | Callback | De delegate die uit de collectie moet worden verwijderd |

### ReturnValue

Een verwijzing naar zichzelf

## Zie ook

* Typedef [Callback](../callback/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*, ClassType *) method


Verwijdert de opgegeven niet‑statische methode van het opgegeven object uit de delegate‑collectie.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*member, ClassType *obj)
```


| Parameter | Beschrijving |
| --- | --- |
| MemberType | Het type van de niet-statische methode die uit de delegatieverzameling moet worden verwijderd |
| ClassType | Het type van de objectmethode die uit de delegatieverzameling moet worden verwijderd |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| lid | MemberType ClassType::* | Een pointer naar de niet-statische methode van het opgegeven object |
| obj | ClassType * | Een pointer naar een objectlidmethode die uit de delegatieverzameling moet worden verwijderd |

### ReturnValue

Een verwijzing naar zichzelf

## Zie ook

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) method


Verwijdert de opgegeven niet‑statische methode van het opgegeven object uit de delegate‑collectie.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*member, const SharedPtr<ClassType> &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| MemberType | Het type van de niet-statische methode die uit de delegatieverzameling moet worden verwijderd |
| ClassType | Het type van de objectmethode die uit de delegatieverzameling moet worden verwijderd |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| lid | MemberType ClassType::* | Een pointer naar de niet-statische methode van het opgegeven object |
| obj | const SharedPtr\<ClassType\>\& | Een gedeelde pointer naar een objectlidmethode die uit de delegatieverzameling moet worden verwijderd |

### ReturnValue

Een verwijzing naar zichzelf

## Zie ook

* Typedef [SharedPtr](../../sharedptr/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(MulticastDelegate\&) method


Verwijdert het opgegeven MulticastDelegate‑object uit de delegate‑collectie.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(MulticastDelegate &other)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| anders | MulticastDelegate\& | Een instantie van de MulticastDelegate-klasse die uit de delegatieverzameling moet worden verwijderd |

### ReturnValue

Een verwijzing naar zichzelf

## Zie ook

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
