---
title: "System::Net::Http::Headers::ContentDispositionHeaderValue classe"
linktitle: "ContentDispositionHeaderValue"
second_title: "Aspose.Font per C++"
description: "System::Net::Http::Headers::ContentDispositionHeaderValue classe. Rappresenta un valore dell'intestazione ''Content-Disposition''. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 300
url: /it/cpp/system.net.http.headers/contentdispositionheadervalue/
---
## ContentDispositionHeaderValue class


Rappresenta un valore dell'intestazione 'Content-Disposition'. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class ContentDispositionHeaderValue : public System::ICloneable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ContentDispositionHeaderValue](./contentdispositionheadervalue/)() | Crea una nuova istanza. |
| [ContentDispositionHeaderValue](./contentdispositionheadervalue/)(String) | Crea una nuova istanza. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Confronta gli oggetti usando la semantica di C# [Object.Equals](../../system/object/equals/). |
| [get_CreationDate](./get_creationdate/)() | Ottiene la data di creazione del file. |
| [get_DispositionType](./get_dispositiontype/)() | Informazioni RTTI. |
| [get_FileName](./get_filename/)() | Ottiene un valore che determina come costruire un nome file per memorizzare il payload del messaggio. Viene utilizzato quando l'entità è separata e memorizzata in un file separato. |
| [get_FileNameStar](./get_filenamestar/)() | Restituisce un valore che determina come costruire i nomi dei file per memorizzare il payload del messaggio. Viene utilizzato quando le entità sono separate e memorizzate in file distinti. |
| [get_ModificationDate](./get_modificationdate/)() | Restituisce la data di modifica del file. |
| [get_Name](./get_name/)() | Restituisce un nome per una parte del corpo del contenuto. |
| [get_Parameters](./get_parameters/)() | Restituisce una raccolta di parametri dell'intestazione 'Content-Disposition'. |
| [get_ReadDate](./get_readdate/)() | Restituisce la data in cui il file è stato letto l'ultima volta. |
| [get_Size](./get_size/)() | Restituisce una dimensione approssimativa del file. |
| static [GetDispositionTypeLength](./getdispositiontypelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Converte una stringa passata dall'indice specificato in un'istanza della classe [ContentDispositionHeaderValue](./). |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| static [Parse](./parse/)(String) | Converte una stringa passata in un'istanza della classe [ContentDispositionHeaderValue](./). |
| [set_CreationDate](./set_creationdate/)(Nullable\<DateTimeOffset\>) | Imposta la data di creazione del file. |
| [set_DispositionType](./set_dispositiontype/)(String) | Imposta un tipo di disposizione. |
| [set_FileName](./set_filename/)(String) | Imposta un valore che determina come costruire un nome file per memorizzare il payload del messaggio. Viene utilizzato quando l'entità è separata e memorizzata in un file separato. |
| [set_FileNameStar](./set_filenamestar/)(String) | Imposta un valore che determina come costruire i nomi dei file per memorizzare il payload del messaggio. Viene utilizzato quando le entità sono separate e memorizzate in file distinti. |
| [set_ModificationDate](./set_modificationdate/)(Nullable\<DateTimeOffset\>) | Imposta la data di modifica del file. |
| [set_Name](./set_name/)(String) | Imposta un nome per una parte del corpo del contenuto. |
| [set_ReadDate](./set_readdate/)(Nullable\<DateTimeOffset\>) | Imposta la data in cui il file è stato letto l'ultima volta. |
| [set_Size](./set_size/)(Nullable\<int64_t\>) | Imposta una dimensione approssimativa del file. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ContentDispositionHeaderValue\>\&) | Prova a convertire una stringa passata in un'istanza della classe [ContentDispositionHeaderValue](./). |
## Vedi anche

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
