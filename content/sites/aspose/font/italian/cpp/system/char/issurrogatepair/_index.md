---
title: "metodo System::Char::IsSurrogatePair"
linktitle: "IsSurrogatePair"
second_title: "Aspose.Font per C++"
description: "metodo System::Char::IsSurrogatePair. Determina se i due caratteri specificati formano una coppia surrogate UTF-16 in C++."
type: docs
weight: 1700
url: /it/cpp/system/char/issurrogatepair/
---
## Char::IsSurrogatePair(char_t, char_t) method


Determina se i due caratteri specificati per una coppia surrogate UTF-16.

```cpp
static bool System::Char::IsSurrogatePair(char_t highSurrogate, char_t lowSurrogate)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| highSurrogate | char_t | Un carattere che viene testato per essere un high surrogate |
| lowSurrogate | char_t | Un carattere che viene testato per essere un low surrogate |

### ReturnValue

Vero se i caratteri specificati formano una coppia surrogata, altrimenti - falso

## Vedi anche

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Char::IsSurrogatePair(const String\&, int) method


Determina se due caratteri consecutivi nel buffer di caratteri specificato formano una coppia surrogate.

```cpp
static bool System::Char::IsSurrogatePair(const String &str, int index)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | const String\& | Una stringa |
| indice | int | Un indice basato su zero nel buffer specificato in cui inizia la sequenza di caratteri da testare |

### ReturnValue

Vero se i caratteri specificati sono una coppia surrogata, altrimenti - falso

## Vedi anche

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
