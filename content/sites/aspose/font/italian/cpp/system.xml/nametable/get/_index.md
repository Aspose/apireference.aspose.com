---
title: "System::Xml::NameTable::Get method"
linktitle: "Ottieni"
second_title: "Aspose.Font per C++"
description: "System::Xml::NameTable::Get method. Restituisce la stringa atomizzata contenente gli stessi caratteri dell'intervallo specificato di caratteri nell'array fornito in C++."
type: docs
weight: 300
url: /it/cpp/system.xml/nametable/get/
---
## NameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Restituisce la stringa atomizzata contenente gli stessi caratteri dell'intervallo specificato di caratteri nell'array fornito.

```cpp
const String & System::Xml::NameTable::Get(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| chiave | const ArrayPtr\<char16_t\>\& | L'array di caratteri contenente il nome da trovare. |
| start | int32_t | L'indice basato su zero nell'array che specifica il primo carattere del nome. |
| len | int32_t | Il numero di caratteri nel nome. |

### ReturnValue

La stringa atomizzata o **nullptr** se la stringa non è ancora stata atomizzata. Se **len** è zero, viene restituito [String::Empty](../../../system/string/empty/).

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## NameTable::Get(const String\&) method


Restituisce la stringa atomizzata con il valore specificato.

```cpp
const String & System::Xml::NameTable::Get(const String &value) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | const String\& | Il nome da trovare. |

### ReturnValue

L'oggetto stringa atomizzata o **nullptr** se la stringa non è ancora stata atomizzata.

## Vedi anche

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
