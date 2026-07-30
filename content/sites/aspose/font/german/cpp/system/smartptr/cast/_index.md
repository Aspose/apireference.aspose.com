---
title: "System::SmartPtr::Cast Methode"
linktitle: "Cast"
second_title: "Aspose.Font für C++"
description: "System::SmartPtr::Cast Methode. Castet den Zeiger zu seinem eigenen Typ in C++."
type: docs
weight: 400
url: /de/cpp/system/smartptr/cast/
---
## SmartPtr::Cast() const method


Wandelt den Pointer in seinen eigenen Typ um.

```cpp
template<class Y,typename Check> std::enable_if_t<std::is_same<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parameter | Beschreibung |
| --- | --- |
| Y | Zieltyp des referenzierten Objekts. |
| Prüfen | Flags, um eine Ausnahme zu werfen, wenn keine Umwandlung verfügbar ist. |

### ReturnValue

Zeiger des geänderten Typs, der immer im Shared-Modus ist.

## Siehe auch

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::Cast() const method


Wandelt den Pointer mittels static_cast in den Basistyp um.

```cpp
template<class Y,typename Check> std::enable_if_t<!std::is_same<Y, T>::value &&std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parameter | Beschreibung |
| --- | --- |
| Y | Zieltyp des referenzierten Objekts. |
| Prüfen | Flags, um eine Ausnahme zu werfen, wenn keine Umwandlung verfügbar ist. |

### ReturnValue

Zeiger des geänderten Typs, der immer im Shared-Modus ist.

## Siehe auch

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::Cast() const method


Wandelt den Pointer mittels dynamic_cast in den abgeleiteten Typ um.

```cpp
template<class Y,typename Check> std::enable_if_t<Check::value &&!std::is_same<Y, T>::value &&!std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parameter | Beschreibung |
| --- | --- |
| Y | Zieltyp des referenzierten Objekts. |
| Prüfen | Flags, um eine Ausnahme zu werfen, wenn keine Umwandlung verfügbar ist. |

### ReturnValue

Zeiger des geänderten Typs, der immer im Shared-Modus ist. Wirft InvalidCastException, wenn keine Konvertierung verfügbar ist.

## Siehe auch

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::Cast() const method


Wandelt den Pointer mittels dynamic_cast in den abgeleiteten Typ um.

```cpp
template<class Y,typename Check> std::enable_if_t<!Check::value &&!std::is_same<Y, T>::value &&!std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parameter | Beschreibung |
| --- | --- |
| Y | Zieltyp des referenzierten Objekts. |
| Prüfen | Flags, um eine Ausnahme zu werfen, wenn keine Umwandlung verfügbar ist. |

### ReturnValue

Zeiger des geänderten Typs, der immer im Shared-Modus ist. Gibt nullptr zurück, wenn keine Konvertierung verfügbar ist.

## Siehe auch

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
