---
title: "Metodo System::Char::ConvertToUtf32"
linktitle: "ConvertToUtf32"
second_title: "Aspose.Font per C++"
description: "Metodo System::Char::ConvertToUtf32. Converte la coppia surrogata UTF-16 specificata in un'unità di codice UTF-32 in C++."
type: docs
weight: 200
url: /it/cpp/system/char/converttoutf32/
---
## Char::ConvertToUtf32(char_t, char_t) method


Converte la coppia surrogata UTF-16 specificata in un'unità di codice UTF-32.

```cpp
static int System::Char::ConvertToUtf32(char_t highSurrogate, char_t lowSurrogate)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| highSurrogate | char_t | Il surrogato alto della coppia surrogata UTF-16 da convertire |
| lowSurrogate | char_t | Il surrogato basso della coppia surrogata UTF-16 da convertire |

### ReturnValue

Un'unità di codice UTF-32 risultante dalla conversione

## Vedi anche

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Char::ConvertToUtf32(const String\&, int) method


Converte il valore di un carattere codificato UTF-16 o di una coppia surrogata in una posizione specificata di una stringa in un'unità di codice UTF-32.

```cpp
static int System::Char::ConvertToUtf32(const String &s, int index)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| s | const String\& | Una stringa che contiene un carattere o una coppia surrogata |
| indice | int | La posizione indice del carattere o della coppia surrogata nella stringa specificata |

### ReturnValue

Un'unità di codice UTF-32 risultante dalla conversione

## Vedi anche

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
