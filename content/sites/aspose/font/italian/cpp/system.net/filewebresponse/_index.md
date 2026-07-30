---
title: "System::Net::FileWebResponse class"
linktitle: "FileWebResponse"
second_title: "Aspose.Font per C++"
description: "Classe System::Net::FileWebResponse. Fornisce l'implementazione della classe astratta WebResponse per lavorare con il file system. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1100
url: /it/cpp/system.net/filewebresponse/
---
## FileWebResponse class


Fornisce l'implementazione della classe astratta [WebResponse](../webresponse/) per lavorare con il file system. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class FileWebResponse : public System::Net::WebResponse
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Close](./close/)() override | Chiude lo stream di risposta. |
| [FileWebResponse](./filewebresponse/)(System::SharedPtr\<Uri\>) | Crea una nuova istanza. |
| [get_ContentLength](./get_contentlength/)() override | Informazioni RTTI. |
| [get_ContentType](./get_contenttype/)() override | Restituisce il tipo MIME della risorsa. |
| [get_Headers](./get_headers/)() override | Restituisce la collezione delle intestazioni associate alla risposta corrente. |
| [get_ResponseUri](./get_responseuri/)() override | Restituisce l'URI della risorsa. |
| [get_SupportsHeaders](./get_supportsheaders/)() override | Restituisce un valore che indica se la risposta corrente supporta le intestazioni. |
| [GetResponseStream](./getresponsestream/)() override | Restituisce lo stream della risposta. |
## Vedi anche

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
