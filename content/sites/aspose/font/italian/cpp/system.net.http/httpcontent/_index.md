---
title: "System::Net::Http::HttpContent classe"
linktitle: "HttpContent"
second_title: "Aspose.Font per C++"
description: "System::Net::Http::HttpContent class. Rappresenta il contenuto di un'entità HTTP. Object of this class should only be allocated using System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 400
url: /it/cpp/system.net.http/httpcontent/
---
## HttpContent class


Rappresenta il contenuto di un'entità HTTP. [Object](../../system/object/) di questa classe deve essere allocato solo usando la funzione [System::MakeObject()](../../system/makeobject/). Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

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
* Library [Aspose.Font for C++](../../)
