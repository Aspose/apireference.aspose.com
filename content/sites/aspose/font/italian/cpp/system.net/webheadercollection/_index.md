---
title: "Classe System::Net::WebHeaderCollection"
linktitle: "WebHeaderCollection"
second_title: "Aspose.Font per C++"
description: "Classe System::Net::WebHeaderCollection. Rappresenta la raccolta delle intestazioni del protocollo. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 3600
url: /it/cpp/system.net/webheadercollection/
---
## WebHeaderCollection class


Rappresenta la raccolta delle intestazioni del protocollo. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
class WebHeaderCollection : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(String, String) | Aggiunge la coppia specificata del nome dell'intestazione e del valore dell'intestazione alla raccolta. |
| [Add](./add/)(HttpResponseHeader, String) | Aggiunge la coppia specificata dell'intestazione e del valore dell'intestazione alla raccolta. |
| [Add](./add/)(HttpRequestHeader, String) | Aggiunge la coppia specificata dell'intestazione e del valore dell'intestazione alla raccolta. |
| [AllKeys](./allkeys/)() | Restituisce una raccolta dei nomi delle intestazioni memorizzati nella raccolta. |
| [get_Count](./get_count/)() const | Restituisce il numero di elementi nella raccolta. |
| [get_Keys](./get_keys/)() | Restituisce una raccolta dei nomi delle intestazioni memorizzati nella raccolta. |
| [GetKey](./getkey/)(int) | Restituisce una chiave all'indice specificato. |
| [GetValues](./getvalues/)(String) | Restituisce la raccolta dei valori delle intestazioni. |
| [idx_get](./idx_get/)(HttpRequestHeader) | Ottiene il valore dell'intestazione usando l'intestazione della richiesta specificata. |
| [idx_get](./idx_get/)(HttpResponseHeader) | Ottiene il valore dell'intestazione usando l'intestazione della risposta specificata. |
| [idx_get](./idx_get/)(String) | Ottiene il valore dell'intestazione usando il nome dell'intestazione specificato. |
| [idx_set](./idx_set/)(HttpRequestHeader, String) | Imposta il valore dell'intestazione specificata. |
| [idx_set](./idx_set/)(HttpResponseHeader, String) | Imposta il valore dell'intestazione utilizzando l'intestazione della risposta specificata. |
| [idx_set](./idx_set/)(String, String) | Imposta il valore dell'intestazione utilizzando il nome dell'intestazione specificato. |
| static [IsRestricted](./isrestricted/)(const String\&) | Verifica se l'intestazione HTTP specificata può essere impostata per la richiesta. |
| [Remove](./remove/)(String) | Rimuove l'intestazione tramite il nome dell'intestazione specificato. |
| [Remove](./remove/)(HttpResponseHeader) | Rimuove l'intestazione della risposta specificata. |
| [Remove](./remove/)(HttpRequestHeader) | Rimuove l'intestazione della richiesta specificata. |
| [Set](./set/)(String, String) | Imposta il valore dell'intestazione specificata. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
| [WebHeaderCollection](./webheadercollection/)() | Crea una nuova istanza. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
