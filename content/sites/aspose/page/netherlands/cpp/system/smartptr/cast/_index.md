---
title: "System::SmartPtr::Cast methode"
linktitle: "Cast"
second_title: "Aspose.Page voor C++"
description: "System::SmartPtr::Cast methode. Zet de pointer om naar zijn eigen type in C++."
type: docs
weight: 400
url: /nl/cpp/system/smartptr/cast/
---
## SmartPtr::Cast() const method


Casts pointer naar zijn eigen type.

```cpp
template<class Y,typename Check> std::enable_if_t<std::is_same<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parameter | Beschrijving |
| --- | --- |
| Y | Doeltype van het aangewezen object. |
| Controle | Vlaggen om een uitzondering te werpen als er geen cast beschikbaar is. |

### ReturnValue

Pointer van gewijzigd type die altijd in gedeelde modus is.

## Zie ook

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::Cast() const method


Casts pointer naar basistype met static_cast.

```cpp
template<class Y,typename Check> std::enable_if_t<!std::is_same<Y, T>::value &&std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parameter | Beschrijving |
| --- | --- |
| Y | Doeltype van het aangewezen object. |
| Controle | Vlaggen om een uitzondering te werpen als er geen cast beschikbaar is. |

### ReturnValue

Pointer van gewijzigd type die altijd in gedeelde modus is.

## Zie ook

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::Cast() const method


Casts pointer naar afgeleid type dynamic_cast.

```cpp
template<class Y,typename Check> std::enable_if_t<Check::value &&!std::is_same<Y, T>::value &&!std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parameter | Beschrijving |
| --- | --- |
| Y | Doeltype van het aangewezen object. |
| Controle | Vlaggen om een uitzondering te werpen als er geen cast beschikbaar is. |

### ReturnValue

Pointer van gewijzigd type die altijd in gedeelde modus is. Werpt InvalidCastException als er geen conversie beschikbaar is.

## Zie ook

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::Cast() const method


Casts pointer naar afgeleid type dynamic_cast.

```cpp
template<class Y,typename Check> std::enable_if_t<!Check::value &&!std::is_same<Y, T>::value &&!std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parameter | Beschrijving |
| --- | --- |
| Y | Doeltype van het aangewezen object. |
| Controle | Vlaggen om een uitzondering te werpen als er geen cast beschikbaar is. |

### ReturnValue

Pointer van gewijzigd type die altijd in gedeelde modus is. Retourneert nullptr als er geen conversie beschikbaar is.

## Zie ook

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
