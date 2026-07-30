---
title: "Méthode System::GetHashCode"
linktitle: "GetHashCode"
second_title: "Aspose.Font pour C++"
description: "Méthode System::GetHashCode. Spécialisation pour std::thread::id ; renvoie le code de hachage pour l'objet thread spécifié en C++."
type: docs
weight: 21300
url: /fr/cpp/system/gethashcode/
---
## System::GetHashCode(const std::thread::id\&) method


Spécialisation pour std::thread::id ; renvoie le code de hachage pour l'objet thread spécifié.

```cpp
int System::GetHashCode(const std::thread::id &id)
```

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::GetHashCode(const T\&) method


Renvoie un code de hachage pour la valeur scalaire spécifiée.

```cpp
template<typename T> std::enable_if<std::is_scalar<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Le type de la valeur pour laquelle la fonction génère le code de hachage |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const T\& | La valeur pour laquelle générer le code de hachage |

### ReturnValue

Le code de hachage généré pour la valeur spécifiée

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::GetHashCode(const T\&) method


Renvoie un code de hachage pour l'objet spécifié.

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&System::IsSmartPtr<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Le type de l'objet pour lequel la fonction génère le code de hachage |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const T\& | Le [SmartPtr](../smartptr/) pointant vers l'objet pour lequel générer le code de hachage |

### ReturnValue

Le code de hachage généré pour l'objet spécifié

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::GetHashCode(const T\&) method


Renvoie un code de hachage pour l'objet spécifié qui est une exception.

```cpp
template<typename T> std::enable_if<System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Le type de l'objet pour lequel la fonction génère le code de hachage |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const T\& | L'enveloppe [Exception](../exception/) qui contient l'objet pour lequel générer le code de hachage |

### ReturnValue

Le code de hachage généré pour l'objet spécifié

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::GetHashCode(const T\&) method


Renvoie un code de hachage pour l'objet spécifié qui n'est ni un pointeur intelligent ni une exception.

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&!System::IsSmartPtr<T>::value &&!System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Le type de l'objet pour lequel la fonction génère le code de hachage |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const T\& | Une référence const à l'objet pour lequel générer le code de hachage |

### ReturnValue

Le code de hachage généré pour l'objet spécifié

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
