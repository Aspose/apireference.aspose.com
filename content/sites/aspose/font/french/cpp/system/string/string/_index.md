---
title: "Constructeur System::String::String"
linktitle: "String"
second_title: "Aspose.Font pour C++"
description: "Constructeur System::String::String. Constructeur par défaut. Crée un objet chaîne considéré comme nul en C++."
type: docs
weight: 100
url: /fr/cpp/system/string/string/
---
## String::String() constructor


Constructeur par défaut. Crée un objet chaîne considéré comme null.

```cpp
System::String::String()
```

## Voir aussi

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(codeporting_icu::UnicodeString\&&) constructor


Constructeur de déplacement.

```cpp
System::String::String(codeporting_icu::UnicodeString &&str) noexcept
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str | codeporting_icu::UnicodeString\&& | UnicodeString à encapsuler dans [String](../). |

## Voir aussi

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const ArrayPtr\<char16_t\>\&) constructor


Convertit tout le tableau de caractères en chaîne.

```cpp
System::String::String(const ArrayPtr<char16_t> &arr)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| arr | const ArrayPtr\<char16_t\>\& | [Array](../../array/) à convertir en chaîne. |

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const ArrayPtr\<char16_t\>\&, int, int) constructor


Convertit une sous-plage d'un tableau de caractères en chaîne. Si les paramètres sont hors des limites du tableau, une chaîne vide est construite.

```cpp
System::String::String(const ArrayPtr<char16_t> &arr, int offset, int len)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| arr | const ArrayPtr\<char16_t\>\& | Tableau de caractères. |
| décalage | int | Indice de début du sous‑tableau. |
| len | int | Longueur du sous‑tableau. |

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const char *, int) constructor


Construit une chaîne à partir d'un pointeur de chaîne de caractères et d'une longueur explicite.

```cpp
System::String::String(const char *str, int length)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str | const char * | Pointeur [String](../) vers les données UTF8, peut être littéral ou tableau. |
| longueur | int | Longueur explicite de la chaîne |

## Voir aussi

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const char16_t *, int) constructor


Construit une chaîne à partir d'un pointeur de chaîne de caractères et d'une longueur explicite.

```cpp
System::String::String(const char16_t *str, int length)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str | const char16_t * | Pointeur [String](../), peut être littéral ou tableau. |
| longueur | int | Longueur explicite de la chaîne |

## Voir aussi

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const char16_t *, int, int) constructor


Construit une chaîne à partir d'un pointeur de chaîne de caractères à partir de la position de départ en utilisant la longueur.

```cpp
System::String::String(const char16_t *str, int start, int length)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str | const char16_t * | Pointeur [String](../), peut être littéral ou tableau. |
| début | int | Position de départ. |
| length | int | Longueur [String](../). |

## Voir aussi

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const char16_t, int) constructor


Constructeur de remplissage.

```cpp
System::String::String(const char16_t ch, int count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| ch | const char16_t | Caractère de remplissage. |
| count | int | Longueur cible. |

## Voir aussi

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const codeporting_icu::UnicodeString\&) constructor


Enveloppe UnicodeString dans [String](../).

```cpp
System::String::String(const codeporting_icu::UnicodeString &str)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str | const codeporting_icu::UnicodeString\& | UnicodeString à encapsuler dans [String](../). |

## Voir aussi

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const std::string\&) constructor


Crée [String](../) à partir d'une chaîne std::string présentée au format UTF-8.

```cpp
System::String::String(const std::string &utf8str)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| utf8str | const std::string\& | Chaîne std::string à convertir en [String](../). |

## Voir aussi

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const std::u16string\&) constructor


Crée [String](../) à partir d'une chaîne utf16.

```cpp
System::String::String(const std::u16string &str)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str | const std::u16string\& | Chaîne utf16 à convertir en [String](../). |

## Voir aussi

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const std::u32string\&) constructor


Crée [String](../) à partir d'une chaîne std::u32string.

```cpp
System::String::String(const std::u32string &u32str)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| u32str | const std::u32string\& | Chaîne std::u32string à convertir en [String](../). |

## Voir aussi

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const std::wstring\&) constructor


Crée [String](../) à partir d'une widestring.

```cpp
System::String::String(const std::wstring &str)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str | const std::wstring\& | Widestring à convertir en [String](../). |

## Voir aussi

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const String\&) constructor


Constructeur de copie.

```cpp
System::String::String(const String &str)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str | const String\& | [String](../) à copier. |

## Voir aussi

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, char\>::value\>::type *) constructor


Construit une chaîne à partir d'un pointeur de chaîne de caractères. Traite la chaîne pointée comme terminée par null en UTF8, calcule la longueur de la chaîne cible en fonction du caractère null.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, char>::value>::type *=nullptr)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | const T\& | Pointeur de chaîne de caractères. |

## Voir aussi

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, char16_t\>::value\>::type *) constructor


Construit une chaîne à partir d'un pointeur de chaîne de caractères. Traite la chaîne pointée comme terminée par null, calcule la longueur de la chaîne cible en fonction du caractère null.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, char16_t>::value>::type *=nullptr)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | const T\& | Pointeur de chaîne de caractères. |

## Voir aussi

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, wchar_t\>::value\>::type *) constructor


Construit une chaîne à partir d'un pointeur de chaîne de caractères larges. Traite la chaîne pointée comme terminée par un caractère nul, calcule la longueur de la chaîne cible en fonction du caractère nul. La conversion depuis wchar_t est chronophage sur certaines plateformes, aucune conversion implicite n'est autorisée.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, wchar_t>::value>::type *=nullptr)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | const T\& | Pointeur de chaîne de caractères. |

## Voir aussi

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const T\&, typename std::enable_if\<std::is_same\<T, std::nullptr_t\>::value\>::type *) constructor


Constructeur nullptr. Déclaré comme modèle pour résoudre les priorités avec d'autres constructeurs modèles.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<std::is_same<T, std::nullptr_t>::value>::type *=nullptr)
```


| Paramètre | Description |
| --- | --- |
| T | Doit être nullptr_t |

| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | const T\& | nullptr |

## Voir aussi

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const wchar_t *, int) constructor


Construit une chaîne à partir d'un pointeur de chaîne de caractères larges et d'une longueur explicite. La conversion depuis wchar_t est chronophage sur certaines plateformes, aucune conversion implicite n'est autorisée.

```cpp
System::String::String(const wchar_t *str, int length)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str | const wchar_t * | Pointeur [String](../), peut être littéral ou tableau. |
| longueur | int | Longueur explicite de la chaîne |

## Voir aussi

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const wchar_t, int) constructor


Constructeur de remplissage. La conversion depuis wchar_t est chronophage sur certaines plateformes, aucune conversion implicite n'est autorisée.

```cpp
System::String::String(const wchar_t ch, int count=1)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| ch | const wchar_t | Caractère de remplissage. |
| count | int | Longueur cible. |

## Voir aussi

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(String\&&) constructor


Constructeur de déplacement.

```cpp
System::String::String(String &&str) noexcept
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str | String\&& | [String](../) dont les données sont déplacées. |

## Voir aussi

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, char\>::value\>::type *) constructor


Construit une chaîne à partir d'un littéral de chaîne. Considère le littéral comme une chaîne terminée par null en UTF8, calcule la longueur de la chaîne cible en fonction de la taille du littéral.

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, char>::value>::type *=nullptr)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| value | T\& | Pointeur littéral [String](../). |

## Voir aussi

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, char16_t\>::value\>::type *) constructor


Construit une chaîne à partir d'un littéral de chaîne. Considère le littéral comme une chaîne terminée par null, calcule la longueur de la chaîne cible en fonction de la taille du littéral.

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, char16_t>::value>::type *=nullptr)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| value | T\& | Pointeur littéral [String](../). |

## Voir aussi

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, wchar_t\>::value\>::type *) constructor


Construit une chaîne à partir d'un littéral widestring. Considère le littéral comme une chaîne terminée par null, calcule la longueur de la chaîne cible en fonction de la taille du littéral. La conversion depuis wchar_t est chronophage sur certaines plates‑formes, donc aucune conversion implicite n'est autorisée.

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, wchar_t>::value>::type *=nullptr)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| value | T\& | Pointeur littéral [String](../). |

## Voir aussi

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
