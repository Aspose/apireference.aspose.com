---
title: "System::Uri::HexUnescape méthode"
linktitle: "HexUnescape"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Uri::HexUnescape. Convertit la représentation hexadécimale spécifiée d'un caractère en un caractère en C++."
type: docs
weight: 4000
url: /fr/cpp/system/uri/hexunescape/
---
## Uri::HexUnescape method


Convertit la représentation hexadécimale spécifiée d'un caractère en caractère.

```cpp
static char16_t System::Uri::HexUnescape(const String &pattern, int32_t &index)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| motif | const String\& | Une chaîne contenant la représentation hexadécimale d'un caractère |
| indice | int32_t\& | La position dans **pattern** où commence la représentation hexadécimale d'un caractère |

### ReturnValue

Le caractère représenté par le codage hexadécimal à la position **index**. Si le caractère à **index** n'est pas encodé en hexadécimal, le caractère à **index** est renvoyé. La valeur de **index** est incrémentée pour pointer vers le caractère suivant celui renvoyé.

## Voir aussi

* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
