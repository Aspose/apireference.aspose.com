---
title: "System::String::Split méthode"
linktitle: "Diviser"
second_title: "Aspose.Font pour C++"
description: "System::String::Split méthode. Divise la chaîne par caractère en C++."
type: docs
weight: 4300
url: /fr/cpp/system/string/split/
---
## String::Split(char_t, int32_t, StringSplitOptions) const method


Divise la chaîne par caractère.

```cpp
ArrayPtr<String> System::String::Split(char_t separator, int32_t count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| séparateur | char_t | Caractère utilisé pour diviser la chaîne. |
| count | int32_t | Le nombre maximal de sous-chaînes à retourner. |
| opt | StringSplitOptions | Options de division. |

### ReturnValue

[Array](../../array/) of substrings.

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Split(char_t, StringSplitOptions) const method


Divise la chaîne par caractère.

```cpp
ArrayPtr<String> System::String::Split(char_t separator=u' ', StringSplitOptions opt=StringSplitOptions::None) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| séparateur | char_t | Caractère utilisé pour diviser la chaîne. |
| opt | StringSplitOptions | Options de division. |

### ReturnValue

[Array](../../array/) of substrings.

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Split(char_t, char_t, StringSplitOptions) const method


Divise la chaîne par l'un des deux caractères.

```cpp
ArrayPtr<String> System::String::Split(char_t separatorA, char_t separatorB, StringSplitOptions opt=StringSplitOptions::None) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| separatorA | char_t | Premier caractère utilisé pour diviser la chaîne. |
| separatorB | char_t | Deuxième caractère utilisé pour diviser la chaîne. |
| opt | StringSplitOptions | Options de division. |

### ReturnValue

[Array](../../array/) of substrings.

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Split(const ArrayPtr\<char_t\>\&, int32_t, StringSplitOptions) const method


Divise la chaîne par l'un des caractères spécifiés.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<char_t> &separators, int32_t count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| separators | const ArrayPtr\<char_t\>\& | [Array](../../array/) de caractères séparateurs. Si vide, tout caractère d'espace est considéré comme séparateur. |
| count | int32_t | Le nombre maximal de sous-chaînes à retourner. |
| opt | StringSplitOptions | Options de division. |

### ReturnValue

[Array](../../array/) of substrings.

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Split(const ArrayPtr\<char_t\>\&, StringSplitOptions) const method


Divise la chaîne par l'un des caractères spécifiés.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<char_t> &separators, StringSplitOptions opt=StringSplitOptions::None) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| separators | const ArrayPtr\<char_t\>\& | [Array](../../array/) de caractères séparateurs. Si vide, tout caractère d'espace est considéré comme séparateur. |
| opt | StringSplitOptions | Options de division. |

### ReturnValue

[Array](../../array/) of substrings.

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Split(const ArrayPtr\<String\>\&, int, StringSplitOptions) const method


Divise la chaîne par sous-chaîne. Actuellement, ne prend en charge qu'un tableau de séparateurs contenant zéro ou un élément.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<String> &separators, int count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| separators | const ArrayPtr\<String\>\& | [Array](../../array/) de chaînes séparatrices. Si vide, aucune division n'est effectuée. |
| count | int | Nombre maximal d'éléments dans le tableau des divisions. |
| opt | StringSplitOptions | Options de division. |

### ReturnValue

[Array](../../array/) of substrings.

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Split(const ArrayPtr\<String\>\&, StringSplitOptions) const method


Divise la chaîne par sous-chaîne.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<String> &separators, StringSplitOptions opt=StringSplitOptions::None) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| separators | const ArrayPtr\<String\>\& | [Array](../../array/) de chaînes séparatrices. Si vide, aucune division n'est effectuée. |
| opt | StringSplitOptions | Options de division. |

### ReturnValue

[Array](../../array/) of substrings.

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Split(const String\&, int, StringSplitOptions) const method


Divise la chaîne par sous-chaîne.

```cpp
ArrayPtr<String> System::String::Split(const String &separator, int count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| séparateur | const String\& | Sous-chaîne agissant comme séparateur. Si vide, le caractère d'espace agit comme séparateur. |
| count | int | Nombre maximal d'éléments dans le tableau des divisions. |
| opt | StringSplitOptions | Options de division. |

### ReturnValue

[Array](../../array/) of substrings.

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Split(const String\&, StringSplitOptions) const method


Divise la chaîne par sous-chaîne.

```cpp
ArrayPtr<String> System::String::Split(const String &separator, StringSplitOptions opt=StringSplitOptions::None) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| séparateur | const String\& | Sous-chaîne agissant comme séparateur. Si vide, le caractère d'espace agit comme séparateur. |
| opt | StringSplitOptions | Options de division. |

### ReturnValue

[Array](../../array/) of substrings.

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
