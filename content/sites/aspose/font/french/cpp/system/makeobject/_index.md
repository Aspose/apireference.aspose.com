---
title: "System::MakeObject method"
linktitle: "CréerObjet"
second_title: "Aspose.Font pour C++"
description: "System::MakeObject method. Crée un objet sur le tas et renvoie un pointeur partagé vers celui-ci en C++."
type: docs
weight: 24600
url: /fr/cpp/system/makeobject/
---
## System::MakeObject(Args\&&...) method


Crée un objet sur le tas et renvoie un pointeur partagé vers celui-ci.

```cpp
template<class T,class ...> std::enable_if<!IsSmartPtr<T>::value, SmartPtr<T>>::type System::MakeObject(Args &&... args)
```


| Paramètre | Description |
| --- | --- |
| T | Classe à instancier. |
| Args | Types des arguments du constructeur. |

| Paramètre | Type | Description |
| --- | --- | --- |
| args | Args\&&... | Arguments du constructeur. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## Voir aussi

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::MakeObject(Args\&&...) method


Crée un objet sur le tas et renvoie un pointeur partagé vers celui-ci.

```cpp
template<class T,class ...> std::enable_if<IsSmartPtr<T>::value, T>::type System::MakeObject(Args &&... args)
```


| Paramètre | Description |
| --- | --- |
| T | [SmartPtr](../smartptr/) vers la classe à instancier. |
| Args | Types des arguments du constructeur. |

| Paramètre | Type | Description |
| --- | --- | --- |
| args | Args\&&... | Arguments du constructeur. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
