---
title: "System::Delegate< ReturnType(ArgumentTypes...)>::Delegate-Methode"
linktitle: "Delegate"
second_title: "Aspose.Font für C++"
description: "System::Delegate< ReturnType(ArgumentTypes...)>::Delegate-Methode. Standardkonstruktor. Erstellt das Delegate-Objekt, das in C++ auf nichts zeigt."
type: docs
weight: 100
url: /de/cpp/system/delegate_returntype(argumenttypes...)_/delegate/
---
## Delegate< ReturnType(ArgumentTypes...)>::Delegate() method


Standardkonstruktor. Erstellt das Delegatenobjekt, das auf nichts zeigt.

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate()=default
```

## Siehe auch

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(const Delegate\&) method




```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(const Delegate &)=default
```

## Siehe auch

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(Delegate\&&) method


Move-Kopierkonstruktor. Übernimmt das Eigentum einer Entität, auf die der angegebene Delegat zeigt.

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(Delegate &&o) noexcept
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| o | Delegate\\&& | Das Delegate-Objekt, von dem die referenzierte Entität verschoben werden soll |

## Siehe auch

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(int, T\&) method


Konstruktor. Erstellt einen Delegaten aus dem angegebenen Funktionsobjekt.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(int functor_tag, T &functor)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ des Funktionsobjekts, das vom Konstruktor als Argument akzeptiert wird |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| functor_tag | int | Ein Dummy-Ganzzahlwert; dieses Argument wird verwendet, um Mehrdeutigkeiten zu lösen |
| functor | T\& | Ein Funktionsobjekt, auf das der neu erstellte Delegat zeigen wird |

## Siehe auch

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(long, T\&&) method


Move-Konstruktor. Erstellt einen Delegaten aus dem angegebenen Funktionsobjekt.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(long functor_tag, T &&functor)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ des Funktionsobjekts, das vom Konstruktor als Argument akzeptiert wird |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| functor_tag | long | Ein Dummy-Ganzzahlwert; dieses Argument wird verwendet, um Mehrdeutigkeiten zu lösen |
| functor | T\&& | Ein Funktionsobjekt, auf das der neu erstellte Delegat zeigen wird |

## Siehe auch

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*, ClassType *) method


Konstruktor. Erstellt einen Delegaten, der auf die angegebene nicht-statische Methode des angegebenen Objekts zeigt.

```cpp
template<class MemberType,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*member, ClassType *obj)
```


| Parameter | Beschreibung |
| --- | --- |
| MemberType | Der Typ der nicht-statischen Methode, die der Konstruktor als Argument akzeptiert |
| ClassType | Der Typ des Objekts, das der Konstruktor als Argument akzeptiert |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Mitglied | MemberType ClassType::* | Ein Zeiger auf die nicht-statische Methode, auf die der neu erstellte Delegat zeigen wird |
| obj | ClassType * | Ein Zeiger auf eine Objekt-Mitgliedsmethode, auf die der neu erstellte Delegat zeigen wird |

## Siehe auch

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) method


Konstruktor. Erstellt einen Delegaten, der auf die angegebene nicht-statische Methode des angegebenen Objekts zeigt.

```cpp
template<class MemberType,class MemberClass,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*member, const SharedPtr<ClassType> &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| MemberType | Der Typ der nicht-statischen Methode, die der Konstruktor als Argument akzeptiert |
| ClassType | Der Typ des Objekts, das der Konstruktor als Argument akzeptiert |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Mitglied | MemberType MemberClass::* | Ein Zeiger auf die nicht-statische Methode, auf die der neu erstellte Delegat zeigen wird |
| obj | const SharedPtr\<ClassType\>\& | Ein SharedPtr\<ClassType\>&-Pointer auf eine Objekt-Mitgliedsmethode, auf die der neu erstellte Delegat zeigen wird |

## Siehe auch

* Typedef [SharedPtr](../../sharedptr/)
* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(std::function\<R(Args...)>) method


Erstellt ein Delegatenobjekt, das auf ein std::function-Funktionsobjekt zeigt.

```cpp
template<class R,class...> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(std::function<R(Args...)> f)
```


| Parameter | Beschreibung |
| --- | --- |
| R | Der Rückgabetyp des Funktionsobjekts, das der Konstruktor als Argument akzeptiert |
| Argumente | Die Argumentliste des Funktionsobjekts, das der Konstruktor als Argument akzeptiert |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| f | std::function\<R(Args...)> | Ein Funktionsobjekt, auf das das neu erstellte Delegatobjekt zeigen soll |

## Siehe auch

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) method


Konstruktor. Erstellt einen Delegaten aus dem angegebenen Zeiger auf das Funktionsobjekt, das von std::bind() erzeugt wurde.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<std::is_bind_expression<T>::value>::type *=0)
```


| Parameter | Beschreibung |
| --- | --- |
| Der | Typ des Funktionsobjekts, das von std::bind() erzeugt und vom Konstruktor als Argument akzeptiert wird |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Funktion | T | Zeiger auf einen „bind‑Ausdruck“ – einen Funktionszeiger, der von std::bind() erzeugt wird – auf den die neu erstellte Delegate‑Instanz zeigen wird |

## Siehe auch

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) method


Konstruktor. Erstellt ein Delegatenobjekt aus dem angegebenen Zeiger auf eine freie Funktion oder statische Methode.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<!std::is_bind_expression<T>::value &&std::is_pointer<T>::value &&std::is_function<typename std::remove_pointer<T>::type>::value>::type *=0)
```


| Parameter | Beschreibung |
| --- | --- |
| Der | Typ des Funktions‑ oder statischen Methodenzeigers, der vom Konstruktor als Argument akzeptiert wird |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Funktion | T | Zeiger auf eine Funktion oder eine statische Methode, auf die die neu erstellte Delegate‑Instanz zeigen wird |

## Siehe auch

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
