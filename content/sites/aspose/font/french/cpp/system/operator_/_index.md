---
title: "System::operator* méthode"
linktitle: "opérateur*"
second_title: "Aspose.Font pour C++"
description: "System::operator* méthode. Retourne une nouvelle instance de la classe Decimal qui représente une valeur résultant de la multiplication de la valeur spécifiée et de la valeur représentée par l'objet Decimal spécifié en C++."
type: docs
weight: 27500
url: /fr/cpp/system/operator_/
---
## System::operator* method


Retourne une nouvelle instance de la classe [Decimal](../decimal/) qui représente une valeur résultant de la multiplication de la valeur spécifiée et de la valeur représentée par l'objet [Decimal](../decimal/) spécifié.

```cpp
template<typename T,typename _> Decimal System::operator*(const T &x, const Decimal &d)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| x | const T\& | Le premier multiplicateur |
| d | const Decimal\& | L'objet [Decimal](../decimal/) représentant le deuxième multiplicateur |

### ReturnValue

Une nouvelle instance de la classe [Decimal](../decimal/) qui représente une valeur résultant de la multiplication de **x** et de la valeur représentée par **d**.

## Voir aussi

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
---
title: System::operator< méthode
linktitle: operator<
deuxième_titre: Aspose.Font pour C++
description: 'System::operator< méthode. Détermine si la valeur spécifiée est inférieure à la valeur représentée par l'objet Nullable spécifié en appliquant operator<() à ces valeurs en C++.'
type: documentation
weight: 28700
url: /cpp/system/operator_/
---
## System::operator<(const T1\&, const Nullable\<T2\>\&) method


Détermine si la valeur spécifiée est inférieure à la valeur représentée par l'objet [Nullable](../nullable/) spécifié en appliquant [operator<()](./) à ces valeurs.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator<(const T1 &some, const Nullable<T2> &other)
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

Vrai si le premier comparand est inférieur au second comparand, sinon - faux

## Voir aussi

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator<(std::nullptr_t, const DateTimeOffset &)
```

## Voir aussi

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<(std::nullptr_t, const Nullable\<T\>\&) method


Retourne toujours false.

```cpp
template<typename T> bool System::operator<(std::nullptr_t, const Nullable<T> &)
```

## Voir aussi

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<(std::nullptr_t, DateTime) method




```cpp
bool System::operator<(std::nullptr_t, DateTime)
```

## Voir aussi

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator<(std::nullptr_t, TimeSpan)
```

## Voir aussi

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
---
title: System::operator> méthode
titreLien: operator>
deuxième_titre: Aspose.Font pour C++
description: 'System::operator> méthode. Détermine si la valeur spécifiée est supérieure à la valeur représentée par l'objet Nullable spécifié en appliquant operator>() à ces valeurs en C++.'
type: documentation
weight: 34200
url: /cpp/system/operator_/
---
## System::operator>(const T1\&, const Nullable\<T2\>\&) method


Détermine si la valeur spécifiée est supérieure à la valeur représentée par l'objet [Nullable](../nullable/) spécifié en appliquant [operator>()](./) à ces valeurs.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator>(const T1 &some, const Nullable<T2> &other)
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

Vrai si le premier comparand est supérieur au second comparand, sinon - faux

## Voir aussi

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator>(std::nullptr_t, const DateTimeOffset &)
```

## Voir aussi

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>(std::nullptr_t, const Nullable\<T\>\&) method


Retourne toujours false.

```cpp
template<typename T> bool System::operator>(std::nullptr_t, const Nullable<T> &)
```

## Voir aussi

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>(std::nullptr_t, DateTime) method




```cpp
bool System::operator>(std::nullptr_t, DateTime)
```

## Voir aussi

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator>(std::nullptr_t, TimeSpan)
```

## Voir aussi

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
