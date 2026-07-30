---
title: "System::SmartPtr::operator* Methode"
linktitle: "operator*"
second_title: "Aspose.Font für C++"
description: "System::SmartPtr::operator* Methode. Gibt eine Referenz auf das referenzierte Objekt zurück. Assertiert, dass der Zeiger nicht null ist in C++."
type: docs
weight: 2500
url: /de/cpp/system/smartptr/operator_/
---
## SmartPtr::operator* method


Gibt eine Referenz auf das referenzierte Objekt zurück. Prüft, dass der Zeiger nicht null ist.

```cpp
Pointee_ & System::SmartPtr<T>::operator*() const
```


### ReturnValue

Referenz auf das referenzierte Objekt.

## Siehe auch

* Typedef [Pointee_](../pointee_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
---
Titel: System::SmartPtr::operator< Methode
Linktitel: operator<
second_title: Aspose.Font für C++
description: 'System::SmartPtr::operator< Methode. Bietet weniger-Vergleichssemantik für die SmartPtr-Klasse in C++.'
type: docs
weight: 2700
url: /cpp/system/smartptr/operator_/
---
## SmartPtr::operator<(SmartPtr\<Y\> const\&) const method


Bietet eine weniger-Vergleichssemantik für die Klasse [SmartPtr](../).

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(SmartPtr<Y> const &x) const
```


| Parameter | Beschreibung |
| --- | --- |
| Y | Typ des Zeigers, mit dem der aktuelle verglichen wird. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | SmartPtr\<Y\> const\& | Zeiger, mit dem der aktuelle verglichen wird. |

### ReturnValue

Wahr, wenn das von [SmartPtr](../) referenzierte Objekt kleiner als x ist, andernfalls falsch.

## Siehe auch

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::operator<(Y *) const method


Bietet eine weniger-Vergleichssemantik für die Klasse [SmartPtr](../).

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(Y *p) const
```


| Parameter | Beschreibung |
| --- | --- |
| Y | Typ des Zeigers, mit dem der aktuelle verglichen wird. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| p | Y * | Zeiger, mit dem der aktuelle verglichen wird. |

### ReturnValue

Wahr, wenn das von [SmartPtr](../) referenzierte Objekt kleiner als p ist, andernfalls falsch.

## Siehe auch

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
