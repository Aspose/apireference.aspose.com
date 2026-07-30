---
title: "System::SmartPtr::Cast méthode"
linktitle: "Cast"
second_title: "Aspose.Font pour C++"
description: "System::SmartPtr::Cast méthode. Convertit le pointeur vers son propre type en C++."
type: docs
weight: 400
url: /fr/cpp/system/smartptr/cast/
---
## SmartPtr::Cast() const method


Convertit le pointeur en son propre type.

```cpp
template<class Y,typename Check> std::enable_if_t<std::is_same<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Paramètre | Description |
| --- | --- |
| Y | Type cible de l'objet pointé. |
| Check | Indicateurs pour lancer une exception si aucune conversion n'est disponible. |

### ReturnValue

Pointeur de type modifié qui est toujours en mode partagé.

## Voir aussi

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::Cast() const method


Convertit le pointeur en type de base en utilisant static_cast.

```cpp
template<class Y,typename Check> std::enable_if_t<!std::is_same<Y, T>::value &&std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Paramètre | Description |
| --- | --- |
| Y | Type cible de l'objet pointé. |
| Check | Indicateurs pour lancer une exception si aucune conversion n'est disponible. |

### ReturnValue

Pointeur de type modifié qui est toujours en mode partagé.

## Voir aussi

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::Cast() const method


Convertit le pointeur en type dérivé en utilisant dynamic_cast.

```cpp
template<class Y,typename Check> std::enable_if_t<Check::value &&!std::is_same<Y, T>::value &&!std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Paramètre | Description |
| --- | --- |
| Y | Type cible de l'objet pointé. |
| Check | Indicateurs pour lancer une exception si aucune conversion n'est disponible. |

### ReturnValue

Pointeur de type modifié qui est toujours en mode partagé. Lance InvalidCastException si aucune conversion n'est disponible.

## Voir aussi

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::Cast() const method


Convertit le pointeur en type dérivé en utilisant dynamic_cast.

```cpp
template<class Y,typename Check> std::enable_if_t<!Check::value &&!std::is_same<Y, T>::value &&!std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Paramètre | Description |
| --- | --- |
| Y | Type cible de l'objet pointé. |
| Check | Indicateurs pour lancer une exception si aucune conversion n'est disponible. |

### ReturnValue

Pointeur de type modifié qui est toujours en mode partagé. Renvoie nullptr si aucune conversion n'est disponible.

## Voir aussi

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
