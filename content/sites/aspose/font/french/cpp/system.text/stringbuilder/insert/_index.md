---
title: "Méthode System::Text::StringBuilder::Insert"
linktitle: "Insérer"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Text::StringBuilder::Insert. Insère des caractères dans la position fixe du builder en C++."
type: docs
weight: 1200
url: /fr/cpp/system.text/stringbuilder/insert/
---
## StringBuilder::Insert(int, const System::ArrayPtr\<char_t\>\&, int, int) method


Insère des caractères à la position fixe du builder.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int index, const System::ArrayPtr<char_t> &chars, int startIndex, int charCount)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| indice | int | Position où insérer les caractères. |
| chars | const System::ArrayPtr\<char_t\>\& | [Array](../../../system/array/) à partir duquel insérer la tranche. |
| startIndex | int | [Array](../../../system/array/) indice de début de la tranche. |
| charCount | int | [Array](../../../system/array/) longueur de la tranche. |

### ReturnValue

Ce pointeur.

## Voir aussi

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Insert(int, char_t) method


Insère un caractère à la position fixe du constructeur.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int startIndex, char_t ch)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| startIndex | int | Position où insérer les caractères. |
| ch | char_t | Caractère à insérer. |

### ReturnValue

Ce pointeur.

## Voir aussi

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Insert(int, const String\&) method


Insère une chaîne à la position fixe du constructeur.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int startIndex, const String &str)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| startIndex | int | Position où insérer les caractères. |
| str | const String\& | [String](../../../system/string/) à insérer. |

### ReturnValue

Ce pointeur.

## Voir aussi

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Insert(int, T) method


Insère une valeur à la position fixe du builder.

```cpp
template<typename T> std::enable_if<std::is_arithmetic<T>::value, StringBuilder *>::type System::Text::StringBuilder::Insert(int startIndex, T value)
```


| Paramètre | Description |
| --- | --- |
| Paramètre | type. |

| Paramètre | Type | Description |
| --- | --- | --- |
| startIndex | int | Position où insérer les caractères. |
| valeur | T | Valeur à formater et insérer. |

### ReturnValue

Ce pointeur.

## Voir aussi

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Insert(int32_t, const String\&, int32_t) method


Insère une chaîne répétée à la position fixe du constructeur.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int32_t index, const String &value, int32_t count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| indice | int32_t | Position où insérer les caractères. |
| value | const String\& | [String](../../../system/string/) à insérer. |
| count | int32_t | Nombre de fois pour répéter la chaîne **value**. |

### ReturnValue

Ce pointeur.

## Voir aussi

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
