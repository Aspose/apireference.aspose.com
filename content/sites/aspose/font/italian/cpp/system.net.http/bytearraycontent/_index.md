---
title: "classe System::Net::Http::ByteArrayContent"
linktitle: "ByteArrayContent"
second_title: "Aspose.Font per C++"
description: "classe System::Net::Http::ByteArrayContent. Rappresenta il contenuto HTTP come un array di byte. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.net.http/bytearraycontent/
---
## ByteArrayContent class


Rappresenta il contenuto HTTP come un array di byte. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class ByteArrayContent : public System::Net::Http::HttpContent
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ByteArrayContent](./bytearraycontent/)(System::ArrayPtr\<uint8_t\>) | Informazioni RTTI. |
| [ByteArrayContent](./bytearraycontent/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) | Crea una nuova istanza. |
| [TryComputeLength](./trycomputelength/)(int64_t\&) override | Prova a calcolare la lunghezza dell'array di byte. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [DefaultStringEncoding](../httpcontent/defaultstringencoding/) | La codifica predefinita. |
| static [MaxBufferSize](../httpcontent/maxbuffersize/) | Il numero massimo di byte. |
## Vedi anche

* Class [HttpContent](../httpcontent/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
