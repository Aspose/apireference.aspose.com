---
title: "System::SmartPtr::Cast metodo"
linktitle: "Cast"
second_title: "Aspose.Font per C++"
description: "System::SmartPtr::Cast metodo. Converte il puntatore al suo stesso tipo in C++."
type: docs
weight: 400
url: /it/cpp/system/smartptr/cast/
---
## SmartPtr::Cast() const method


Casta il puntatore al suo stesso tipo.

```cpp
template<class Y,typename Check> std::enable_if_t<std::is_same<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parametro | Descrizione |
| --- | --- |
| Y | Tipo di destinazione dell'oggetto puntato. |
| Check | Flag per generare un'eccezione se non è disponibile alcun cast. |

### ReturnValue

Puntatore di tipo modificato che è sempre in modalità condivisa.

## Vedi anche

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::Cast() const method


Casta il puntatore al tipo base usando static_cast.

```cpp
template<class Y,typename Check> std::enable_if_t<!std::is_same<Y, T>::value &&std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parametro | Descrizione |
| --- | --- |
| Y | Tipo di destinazione dell'oggetto puntato. |
| Check | Flag per generare un'eccezione se non è disponibile alcun cast. |

### ReturnValue

Puntatore di tipo modificato che è sempre in modalità condivisa.

## Vedi anche

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::Cast() const method


Casta il puntatore al tipo derivato usando dynamic_cast.

```cpp
template<class Y,typename Check> std::enable_if_t<Check::value &&!std::is_same<Y, T>::value &&!std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parametro | Descrizione |
| --- | --- |
| Y | Tipo di destinazione dell'oggetto puntato. |
| Check | Flag per generare un'eccezione se non è disponibile alcun cast. |

### ReturnValue

Puntatore di tipo modificato che è sempre in modalità condivisa. Lancia InvalidCastException se non è disponibile alcuna conversione.

## Vedi anche

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::Cast() const method


Casta il puntatore al tipo derivato usando dynamic_cast.

```cpp
template<class Y,typename Check> std::enable_if_t<!Check::value &&!std::is_same<Y, T>::value &&!std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parametro | Descrizione |
| --- | --- |
| Y | Tipo di destinazione dell'oggetto puntato. |
| Check | Flag per generare un'eccezione se non è disponibile alcun cast. |

### ReturnValue

Puntatore di tipo modificato che è sempre in modalità condivisa. Restituisce nullptr se non è disponibile alcuna conversione.

## Vedi anche

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
