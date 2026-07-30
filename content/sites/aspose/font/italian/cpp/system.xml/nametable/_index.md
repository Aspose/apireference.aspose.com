---
title: "classe System::Xml::NameTable"
linktitle: "NameTable"
second_title: "Aspose.Font per C++"
description: "classe System::Xml::NameTable. Implementa un XmlNameTable a thread singolo in C++."
type: docs
weight: 500
url: /it/cpp/system.xml/nametable/
---
## NameTable class


Implementa un [XmlNameTable](../xmlnametable/) a thread singolo.

```cpp
class NameTable : public System::Xml::XmlNameTable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(const String\&) override | Atomizza la stringa specificata e la aggiunge al [NameTable](./). |
| [Add](./add/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) override | Atomizza la stringa specificata e la aggiunge al [NameTable](./). |
| [Get](./get/)(const String\&) override | Restituisce la stringa atomizzata con il valore specificato. |
| [Get](./get/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) override | Restituisce la stringa atomizzata contenente gli stessi caratteri dell'intervallo specificato di caratteri nell'array fornito. |
| [NameTable](./nametable/)() | Inizializza una nuova istanza della classe [NameTable](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlNameTable](../xmlnametable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
