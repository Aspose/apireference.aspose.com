---
title: "méthode System::String::operator+"
linktitle: "opérateur+"
second_title: "Aspose.Font pour C++"
description: "Méthode System::String::operator+. Ajoute un caractère à la fin de la chaîne en C++."
type: docs
weight: 2800
url: /fr/cpp/system/string/operator+/
---
## String::operator+(char_t) const method


Ajoute un caractère à la fin de la chaîne.

```cpp
String System::String::operator+(char_t x) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| x | char_t | Caractère à ajouter. |

### ReturnValue

[String](../) concatenation result.

## Voir aussi

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(const String\&) const method


[String](../) concatenation operator.

```cpp
String System::String::operator+(const String &str) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str | const String\& | [String](../) à ajouter à la fin de l’actuelle. |

### ReturnValue

Chaîne concaténée.

## Voir aussi

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(const T\&) const method


[String](../) concatenation with string literal or character string pointer.

```cpp
template<typename T,std::enable_if_t< IsStringLiteral< T, char_t >::value > *> String System::String::operator+(const T &arg) const
```


| Paramètre | Description |
| --- | --- |
| T | L’une des formes littérale de chaîne ou pointeur de chaîne de caractères. |

| Paramètre | Type | Description |
| --- | --- | --- |
| arg | const T\& | Entité à concaténer avec la chaîne actuelle. |

### ReturnValue

Chaîne concaténée.

## Voir aussi

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(const T\&) const method


Ajoute la représentation sous forme de chaîne d'un objet de type référence à la fin de la chaîne.

```cpp
template<typename T,std::enable_if_t< IsSmartPtr< T >::value > *> String System::String::operator+(const T &value) const
```


| Paramètre | Description |
| --- | --- |
| T | type pointeur. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) à convertir en chaîne en appelant [ToString()](../tostring/) et à ajouter à la chaîne actuelle. |

### ReturnValue

[String](../) concatenation result.

## Voir aussi

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(const T\&) const method


Ajoute la représentation sous forme de chaîne d’un objet de type valeur à la fin de la chaîne.

```cpp
template<typename T,std::enable_if_t<!IsSmartPtr< T >::value &&!std::is_scalar< T >::value &&!std::is_array< T >::value > *> String System::String::operator+(const T &value) const
```


| Paramètre | Description |
| --- | --- |
| T | Type valeur sur lequel appeler [ToString()](../tostring/). |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) à convertir en chaîne en appelant [ToString()](../tostring/) et à ajouter à la chaîne actuelle. |

### ReturnValue

[String](../) concatenation result.

## Voir aussi

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(double) const method


Ajoute la représentation sous forme de chaîne d'une valeur à virgule flottante à la fin de la chaîne.

```cpp
String System::String::operator+(double d) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| d | double | Valeur à convertir en chaîne et à ajouter. |

### ReturnValue

[String](../) concatenation result.

## Voir aussi

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(int) const method


Ajoute la représentation sous forme de chaîne d'une valeur entière à la fin de la chaîne.

```cpp
String System::String::operator+(int i) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| i | int | Valeur entière à convertir en chaîne et à ajouter. |

### ReturnValue

[String](../) concatenation result.

## Voir aussi

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(int64_t) const method


Ajoute la représentation sous forme de chaîne d'une valeur entière à la fin de la chaîne.

```cpp
String System::String::operator+(int64_t v) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| v | int64_t | Valeur à convertir en chaîne et à ajouter à ajouter. |

### ReturnValue

[String](../) concatenation result.

## Voir aussi

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(T) const method


Ajoute la représentation sous forme de chaîne d'une valeur booléenne à la fin de la chaîne.

```cpp
template<typename T,std::enable_if_t< std::is_same< T, bool >::value > *> String System::String::operator+(T arg) const
```


| Paramètre | Description |
| --- | --- |
| T | Type de valeur à concaténer avec la chaîne. Doit être bool |

| Paramètre | Type | Description |
| --- | --- | --- |
| arg | T | [Boolean](../../boolean/) valeur à convertir en chaîne et à ajouter. |

### ReturnValue

[String](../) concatenation result.

## Voir aussi

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(uint32_t) const method


Ajoute la représentation sous forme de chaîne d'une valeur entière non signée à la fin de la chaîne.

```cpp
String System::String::operator+(uint32_t i) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| i | uint32_t | Valeur à convertir en chaîne et à ajouter. |

### ReturnValue

[String](../) concatenation result.

## Voir aussi

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
