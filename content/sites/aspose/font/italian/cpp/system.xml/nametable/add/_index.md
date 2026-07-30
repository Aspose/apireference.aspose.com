---
title: "System::Xml::NameTable::Add method"
linktitle: "Add"
second_title: "Aspose.Font per C++"
description: "System::Xml::NameTable::Add method. Atomizza la stringa specificata e la aggiunge alla NameTable in C++."
type: docs
weight: 200
url: /it/cpp/system.xml/nametable/add/
---
## NameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Atomizza la stringa specificata e la aggiunge alla [NameTable](../).

```cpp
const String & System::Xml::NameTable::Add(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| chiave | const ArrayPtr\<char16_t\>\& | L'array di caratteri contenente la stringa da aggiungere. |
| start | int32_t | L'indice basato su zero nell'array che specifica il primo carattere della stringa. |
| len | int32_t | Il numero di caratteri nella stringa. |

### ReturnValue

La stringa atomizzata o la stringa esistente se ne esiste già una nella [NameTable](../). Se **len** è zero, viene restituito [String::Empty](../../../system/string/empty/).

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## NameTable::Add(const String\&) method


Atomizza la stringa specificata e la aggiunge alla [NameTable](../).

```cpp
const String & System::Xml::NameTable::Add(const String &key) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| chiave | const String\& | La stringa da aggiungere. |

### ReturnValue

La stringa atomizzata o la stringa esistente se è già presente nella [NameTable](../).

## Vedi anche

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
