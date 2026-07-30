---
title: "Méthode System::Char::ConvertToUtf32"
linktitle: "ConvertToUtf32"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Char::ConvertToUtf32. Convertit la paire de substituts UTF‑16 spécifiée en unité de code UTF‑32 en C++."
type: docs
weight: 200
url: /fr/cpp/system/char/converttoutf32/
---
## Char::ConvertToUtf32(char_t, char_t) method


Convertit la paire de substituts UTF-16 spécifiée en unité de code UTF-32.

```cpp
static int System::Char::ConvertToUtf32(char_t highSurrogate, char_t lowSurrogate)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| highSurrogate | char_t | Le substitut haut de la paire de substituts UTF‑16 à convertir |
| lowSurrogate | char_t | Le substitut bas de la paire de substituts UTF‑16 à convertir |

### ReturnValue

Une unité de code UTF‑32 résultant de la conversion

## Voir aussi

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Char::ConvertToUtf32(const String\&, int) method


Convertit la valeur d'un caractère encodé en UTF-16 ou d'une paire de substituts à une position spécifiée dans une chaîne en unité de code UTF-32.

```cpp
static int System::Char::ConvertToUtf32(const String &s, int index)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| s | const String\& | Une chaîne qui contient un caractère ou une paire de substituts |
| indice | int | La position d'index du caractère ou de la paire de substituts dans la chaîne spécifiée |

### ReturnValue

Une unité de code UTF‑32 résultant de la conversion

## Voir aussi

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
