---
title: "Classe System::UriBuilder"
linktitle: "UriBuilder"
second_title: "Aspose.Page per C++"
description: "Classe System::UriBuilder. Fornisce metodi per costruire e modificare identificatori di risorse universali (URI). Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 6800
url: /it/cpp/system/uribuilder/
---
## UriBuilder class


Fornisce metodi per costruire e modificare identificatori di risorse universali (URI). Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class UriBuilder : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Scheme](./get_scheme/)() const | Restituisce lo schema dell'URI costruito dall'oggetto corrente. |
| [get_Uri](./get_uri/)() const | Restituisce l'oggetto [Uri](../uri/) costruito dall'oggetto corrente. |
| [set_Port](./set_port/)(int) | Imposta il numero di porta dell'URI. |
| [set_Scheme](./set_scheme/)(const String\&) | Imposta lo schema dell'URI costruito dall'oggetto corrente al valore specificato. |
| [ToString](./tostring/)() const override | Restituisce la rappresentazione stringa dell'URI costruito dall'oggetto corrente. |
| [UriBuilder](./uribuilder/)(const String\&) | Costruisce un oggetto [UriBuilder](./) che rappresenta l'URI specificato. |
| [UriBuilder](./uribuilder/)(const SharedPtr\<Uri\>\&) | Costruisce un oggetto [UriBuilder](./) che rappresenta l'URI specificato. |
## Vedi anche

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
