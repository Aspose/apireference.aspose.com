---
title: "Méthode System::Char::IsSurrogatePair"
linktitle: "IsSurrogatePair"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Char::IsSurrogatePair. Détermine si les deux caractères spécifiés forment une paire de substituts UTF‑16 en C++."
type: docs
weight: 1700
url: /fr/cpp/system/char/issurrogatepair/
---
## Char::IsSurrogatePair(char_t, char_t) method


Détermine si les deux caractères spécifiés forment une paire de surrogats UTF-16.

```cpp
static bool System::Char::IsSurrogatePair(char_t highSurrogate, char_t lowSurrogate)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| highSurrogate | char_t | Un caractère testé pour être un substitut haut |
| lowSurrogate | char_t | Un caractère testé pour être un substitut bas |

### ReturnValue

Vrai si les caractères spécifiés forment une paire de substituts, sinon - faux

## Voir aussi

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Char::IsSurrogatePair(const String\&, int) method


Détermine si deux caractères consécutifs dans le tampon de caractères spécifié forment une paire de surrogats.

```cpp
static bool System::Char::IsSurrogatePair(const String &str, int index)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str | const String\& | Une chaîne |
| indice | int | Un indice basé sur zéro dans le tampon spécifié où commence la séquence de caractères à tester |

### ReturnValue

Vrai si les caractères spécifiés sont une paire de substituts, sinon - faux

## Voir aussi

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
