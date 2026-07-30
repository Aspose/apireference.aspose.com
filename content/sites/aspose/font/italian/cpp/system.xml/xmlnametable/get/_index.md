---
title: "System::Xml::XmlNameTable::Get metodo"
linktitle: "Ottieni"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlNameTable::Get metodo. Quando sovrascritto in una classe derivata, restituisce la stringa atomizzata contenente gli stessi caratteri dell'intervallo specificato di caratteri nell'array fornito in C++."
type: docs
weight: 200
url: /it/cpp/system.xml/xmlnametable/get/
---
## XmlNameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Quando sovrascritto in una classe derivata, ottiene la stringa atomizzata contenente gli stessi caratteri dell'intervallo di caratteri specificato nell'array fornito.

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| array | const ArrayPtr\<char16_t\>\& | L'array di caratteri contenente il nome da cercare. |
| offset | int32_t | L'indice basato su zero nell'array che specifica il primo carattere del nome. |
| lunghezza | int32_t | Il numero di caratteri nel nome. |

### ReturnValue

La stringa atomizzata o **nullptr** se la stringa non è già stata atomizzata. Se **length** è zero, viene restituito [String::Empty](../../../system/string/empty/).

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNameTable::Get(const String\&) method


Quando sovrascritto in una classe derivata, ottiene la stringa atomizzata contenente lo stesso valore della stringa specificata.

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const String &array)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| array | const String\& | Il nome da cercare. |

### ReturnValue

La stringa atomizzata o **nullptr** se la stringa non è già stata atomizzata.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
