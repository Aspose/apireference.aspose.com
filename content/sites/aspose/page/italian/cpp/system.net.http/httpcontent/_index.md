---
title: "System::Net::Http::HttpContent classe"
linktitle: "HttpContent"
second_title: "Aspose.Page per C++"
description: "System::Net::Http::HttpContent classe. Rappresenta il contenuto di un'entità HTTP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 400
url: /it/cpp/system.net.http/httpcontent/
---
## HttpContent class


Rappresenta il contenuto di un'entità HTTP. [Object](../../system/object/) di questa classe deve essere allocato solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class HttpContent : public System::IDisposable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Dispose](./dispose/)() override | Rilascia l'istanza corrente. Questo metodo rilascia anche lo stream restituito da 'ReadAsStream' e il buffer di memoria se è stato creato. |
| [get_Headers](./get_headers/)() | Restituisce le intestazioni del contenuto HTTP. |
| [LoadIntoBuffer](./loadintobuffer/)() | Serializza il contenuto in un buffer di memoria. |
| [LoadIntoBuffer](./loadintobuffer/)(int64_t) | Serializza il contenuto in un buffer di memoria. |
| [ReadAsByteArray](./readasbytearray/)() | Serializza il contenuto e restituisce un array di byte. |
| [ReadAsStream](./readasstream/)() | Serializza il contenuto e restituisce uno stream. |
| [ReadAsString](./readasstring/)() | Serializza il contenuto e restituisce una stringa. |
| virtual [TryComputeLength](./trycomputelength/)(int64_t\&) | Prova a calcolare la dimensione del contenuto. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [DefaultStringEncoding](./defaultstringencoding/) | La codifica predefinita. |
| static [MaxBufferSize](./maxbuffersize/) | Il numero massimo di byte. |
## Vedi anche

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
