---
title: "méthode System::operator<="
linktitle: "operator<="
second_title: "Aspose.Font pour C++"
description: "méthode System::operator<=. Détermine si la valeur spécifiée est inférieure ou égale à la valeur représentée par l'objet Nullable spécifié en appliquant operator<=() à ces valeurs en C++."
type: docs
weight: 32000
url: /fr/cpp/system/operator_=/
---
## System::operator<=(const T1\&, const Nullable\<T2\>\&) method


Détermine si la valeur spécifiée est inférieure ou égale à la valeur représentée par l'objet [Nullable](../nullable/) spécifié en appliquant [operator<=()](./) à ces valeurs.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator<=(const T1 &some, const Nullable<T2> &other)
```


| Paramètre | Description |
| --- | --- |
| T1 | Le type de la première valeur comparande |
| T2 | Le type sous-jacent de l'objet [Nullable](../nullable/) qui représente la deuxième valeur comparande |

| Paramètre | Type | Description |
| --- | --- | --- |
| quelques | const T1\& | Une référence constante à la valeur qui doit être utilisée comme première comparande |
| other | const Nullable\<T2\>\& | Une référence constante à l'objet [Nullable](../nullable/) dont la valeur représentée doit être utilisée comme deuxième comparande |

### ReturnValue

Vrai si le premier comparand est inférieur ou égal au second comparand, sinon - faux

## Voir aussi

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator<=(std::nullptr_t, const DateTimeOffset &)
```

## Voir aussi

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<=(std::nullptr_t, const Nullable\<T\>\&) method


Retourne toujours false.

```cpp
template<typename T> bool System::operator<=(std::nullptr_t, const Nullable<T> &)
```

## Voir aussi

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<=(std::nullptr_t, DateTime) method




```cpp
bool System::operator<=(std::nullptr_t, DateTime)
```

## Voir aussi

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator<=(std::nullptr_t, TimeSpan)
```

## Voir aussi

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
---
titre: méthode System::operator>=
titreLien: operator>=
deuxième_titre: Aspose.Font pour C++
description: 'méthode System::operator>=. Détermine si la valeur spécifiée est supérieure ou égale à la valeur représentée par l'objet Nullable spécifié en appliquant operator>=() à ces valeurs en C++.'
type: documentation
poids: 34700
url: /cpp/system/operator_=/
---
## System::operator>=(const T1\&, const Nullable\<T2\>\&) method


Détermine si la valeur spécifiée est supérieure ou égale à la valeur représentée par l'objet [Nullable](../nullable/) spécifié en appliquant [operator>=()](./) à ces valeurs.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator>=(const T1 &some, const Nullable<T2> &other)
```


| Paramètre | Description |
| --- | --- |
| T1 | Le type de la première valeur comparande |
| T2 | Le type sous-jacent de l'objet [Nullable](../nullable/) qui représente la deuxième valeur comparande |

| Paramètre | Type | Description |
| --- | --- | --- |
| quelques | const T1\& | Une référence constante à la valeur qui doit être utilisée comme première comparande |
| other | const Nullable\<T2\>\& | Une référence constante à l'objet [Nullable](../nullable/) dont la valeur représentée doit être utilisée comme deuxième comparande |

### ReturnValue

Vrai si le premier comparand est supérieur ou égal au second comparand, sinon - faux

## Voir aussi

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator>=(std::nullptr_t, const DateTimeOffset &)
```

## Voir aussi

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>=(std::nullptr_t, const Nullable\<T\>\&) method


Retourne toujours false.

```cpp
template<typename T> bool System::operator>=(std::nullptr_t, const Nullable<T> &)
```

## Voir aussi

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>=(std::nullptr_t, DateTime) method




```cpp
bool System::operator>=(std::nullptr_t, DateTime)
```

## Voir aussi

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator>=(std::nullptr_t, TimeSpan)
```

## Voir aussi

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
