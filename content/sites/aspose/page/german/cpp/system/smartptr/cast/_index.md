---
title: "Methode System::SmartPtr::Cast"
linktitle: "Cast"
second_title: "Aspose.Page für C++"
description: "Methode System::SmartPtr::Cast. Castet den Zeiger zu seinem eigenen Typ in C++."
type: docs
weight: 400
url: /de/cpp/system/smartptr/cast/
---
## SmartPtr::Cast() const method


Wandelt den Zeiger in seinen eigenen Typ um.

```cpp
template<class Y,typename Check> std::enable_if_t<std::is_same<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parameter | Beschreibung |
| --- | --- |
| Y | Zieltyp des referenzierten Objekts. |
| Check | Flags, um eine Ausnahme zu werfen, wenn kein Cast verfügbar ist. |

### ReturnValue

Zeiger des geänderten Typs, der stets im Shared‑Modus ist.

## Siehe auch

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::Cast() const method


Wandelt den Zeiger mittels static_cast in den Basistyp um.

```cpp
template<class Y,typename Check> std::enable_if_t<!std::is_same<Y, T>::value &&std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parameter | Beschreibung |
| --- | --- |
| Y | Zieltyp des referenzierten Objekts. |
| Check | Flags, um eine Ausnahme zu werfen, wenn kein Cast verfügbar ist. |

### ReturnValue

Zeiger des geänderten Typs, der stets im Shared‑Modus ist.

## Siehe auch

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::Cast() const method


Wandelt den Zeiger mittels dynamic_cast in den abgeleiteten Typ um.

```cpp
template<class Y,typename Check> std::enable_if_t<Check::value &&!std::is_same<Y, T>::value &&!std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parameter | Beschreibung |
| --- | --- |
| Y | Zieltyp des referenzierten Objekts. |
| Check | Flags, um eine Ausnahme zu werfen, wenn kein Cast verfügbar ist. |

### ReturnValue

Zeiger mit geändertem Typ, der immer im Shared-Modus ist. Wirft InvalidCastException, wenn keine Konvertierung verfügbar ist.

## Siehe auch

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::Cast() const method


Wandelt den Zeiger mittels dynamic_cast in den abgeleiteten Typ um.

```cpp
template<class Y,typename Check> std::enable_if_t<!Check::value &&!std::is_same<Y, T>::value &&!std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parameter | Beschreibung |
| --- | --- |
| Y | Zieltyp des referenzierten Objekts. |
| Check | Flags, um eine Ausnahme zu werfen, wenn kein Cast verfügbar ist. |

### ReturnValue

Zeiger mit geändertem Typ, der immer im Shared-Modus ist. Gibt nullptr zurück, wenn keine Konvertierung verfügbar ist.

## Siehe auch

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
