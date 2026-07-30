---
title: "System::Xml::XmlNameTable::Add metodo"
linktitle: "Add"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlNameTable::Add metodo. Quando sovrascritto in una classe derivata, atomizza la stringa specificata e la aggiunge all'XmlNameTable in C++."
type: docs
weight: 100
url: /it/cpp/system.xml/xmlnametable/add/
---
## XmlNameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Quando sovrascritto in una classe derivata, atomizza la stringa specificata e la aggiunge al [XmlNameTable](../).

```cpp
virtual const String & System::Xml::XmlNameTable::Add(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| array | const ArrayPtr\<char16_t\>\& | L'array di caratteri contenente il nome da aggiungere. |
| offset | int32_t | Indice basato su zero nell'array che specifica il primo carattere del nome. |
| lunghezza | int32_t | Il numero di caratteri nel nome. |

### ReturnValue

La nuova stringa atomizzata o quella esistente se è già presente. Se la lunghezza è zero, viene restituito [String::Empty](../../../system/string/empty/).

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNameTable::Add(const String\&) method


Quando sovrascritto in una classe derivata, atomizza la stringa specificata e la aggiunge al [XmlNameTable](../).

```cpp
virtual const String & System::Xml::XmlNameTable::Add(const String &array)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| array | const String\& | Il nome da aggiungere. |

### ReturnValue

La nuova stringa atomizzata o quella esistente se è già presente.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
