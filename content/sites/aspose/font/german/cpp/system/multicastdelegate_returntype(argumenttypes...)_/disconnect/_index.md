---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect-Methode"
linktitle: "disconnect"
second_title: "Aspose.Font für C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect-Methode. Entfernt den angegebenen Delegaten aus der Delegatensammlung in C++."
type: docs
weight: 500
url: /de/cpp/system/multicastdelegate_returntype(argumenttypes...)_/disconnect/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(Callback) method


Entfernt den angegebenen Delegaten aus der Delegatensammlung.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(Callback callback)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Rückruf | Callback | Der Delegat, der aus der Sammlung entfernt werden soll |

### ReturnValue

Eine Referenz auf das aktuelle Objekt

## Siehe auch

* Typedef [Callback](../callback/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*, ClassType *) method


Entfernt die angegebene nicht-statische Methode des angegebenen Objekts aus der Delegatensammlung.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*member, ClassType *obj)
```


| Parameter | Beschreibung |
| --- | --- |
| MemberType | Der Typ der nicht-statischen Methode, die aus der Delegatensammlung entfernt werden soll |
| ClassType | Der Typ der Objektmethode, die aus der Delegatensammlung entfernt werden soll |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Mitglied | MemberType ClassType::* | Ein Zeiger auf die nicht-statische Methode des angegebenen Objekts |
| obj | ClassType * | Ein Zeiger auf eine Objektmitgliedsmethode, die aus der Delegatensammlung entfernt werden soll |

### ReturnValue

Eine Referenz auf das aktuelle Objekt

## Siehe auch

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) method


Entfernt die angegebene nicht-statische Methode des angegebenen Objekts aus der Delegatensammlung.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*member, const SharedPtr<ClassType> &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| MemberType | Der Typ der nicht-statischen Methode, die aus der Delegatensammlung entfernt werden soll |
| ClassType | Der Typ der Objektmethode, die aus der Delegatensammlung entfernt werden soll |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Mitglied | MemberType ClassType::* | Ein Zeiger auf die nicht-statische Methode des angegebenen Objekts |
| obj | const SharedPtr\<ClassType\>\& | Ein Shared-Pointer auf eine Objektmitgliedsmethode, die aus der Delegatensammlung entfernt werden soll |

### ReturnValue

Eine Referenz auf das aktuelle Objekt

## Siehe auch

* Typedef [SharedPtr](../../sharedptr/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(MulticastDelegate\&) method


Entfernt das angegebene MulticastDelegate-Objekt aus der Delegatensammlung.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(MulticastDelegate &other)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| andere | MulticastDelegate\& | Eine Instanz der MulticastDelegate-Klasse, die aus der Delegatensammlung entfernt werden soll |

### ReturnValue

Eine Referenz auf das aktuelle Objekt

## Siehe auch

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
