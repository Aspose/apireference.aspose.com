---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect Methode"
linktitle: "verbinden"
second_title: "Aspose.Font für C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect Methode. Fügt den angegebenen Delegaten zur Sammlung in C++ hinzu."
type: docs
weight: 400
url: /de/cpp/system/multicastdelegate_returntype(argumenttypes...)_/connect/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(Callback) method


Fügt den angegebenen Delegaten zur Sammlung hinzu.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(Callback callback)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Rückruf | Callback | Der Delegat, der zur Sammlung hinzugefügt werden soll |

### ReturnValue

Eine Referenz auf das aktuelle Objekt

## Siehe auch

* Typedef [Callback](../callback/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, ClassType *) method


Fügt die angegebene nicht-statische Methode des angegebenen Objekts zur Delegatensammlung hinzu.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, ClassType *obj)
```


| Parameter | Beschreibung |
| --- | --- |
| MemberType | Der Typ der nicht‑statischen Methode, die zur Delegaten‑Sammlung hinzugefügt werden soll |
| ClassType | Der Typ der Objektmethode, die zum Delegaten hinzugefügt werden soll |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Mitglied | MemberType ClassType::* | Ein Zeiger auf die nicht-statische Methode des angegebenen Objekts |
| obj | ClassType * | Ein Zeiger auf eine Objektmitgliedsmethode, die zur Delegaten‑Sammlung hinzugefügt werden soll |

### ReturnValue

Eine Referenz auf das aktuelle Objekt

## Siehe auch

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) method


Fügt die angegebene nicht-statische Methode des angegebenen Objekts zur Delegatensammlung hinzu.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, const SharedPtr<ClassType> &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| MemberType | Der Typ der nicht‑statischen Methode, die zur Delegaten‑Sammlung hinzugefügt werden soll |
| ClassType | Der Typ der Objektmitgliedsmethode, die zur Delegaten‑Sammlung hinzugefügt werden soll |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Mitglied | MemberType ClassType::* | Ein Zeiger auf die nicht-statische Methode des angegebenen Objekts |
| obj | const SharedPtr\<ClassType\>\& | Ein Shared‑Pointer auf eine Objektmitgliedsmethode, die zur Delegaten‑Sammlung hinzugefügt werden soll |

### ReturnValue

Eine Referenz auf das aktuelle Objekt

## Siehe auch

* Typedef [SharedPtr](../../sharedptr/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MulticastDelegate\&) method


Fügt das angegebene MulticastDelegate-Objekt zur Delegatensammlung hinzu.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MulticastDelegate &other)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| andere | MulticastDelegate\& | Eine Instanz der Klasse MulticastDelegate, die zur Delegaten‑Sammlung hinzugefügt werden soll |

### ReturnValue

Eine Referenz auf das aktuelle Objekt

## Siehe auch

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(std::function\<R(Args...)>) method


Fügt das angegebene Funktionsobjekt zur Delegaten‑Sammlung hinzu. Das Funktionsobjekt wird vor dem Hinzufügen in den Delegatentyp [Callback](../callback/) konvertiert.

```cpp
template<class R,class...> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(std::function<R(Args...)> f)
```


| Parameter | Beschreibung |
| --- | --- |
| R | Der Rückgabetyp des Funktionsobjekts, das zur Sammlung hinzugefügt werden soll |
| Argumente | Die Argumentliste des Funktionsobjekts, das zur Sammlung hinzugefügt werden soll |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| f | std::function\<R(Args...)> | Das Funktionsobjekt, das zur Sammlung hinzugefügt werden soll |

### ReturnValue

Eine Referenz auf das aktuelle Objekt

## Siehe auch

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
