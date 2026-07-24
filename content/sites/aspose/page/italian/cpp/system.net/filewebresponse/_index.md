---
title: "System::Net::FileWebResponse class"
linktitle: "FileWebResponse"
second_title: "Aspose.Page per C++"
description: "System::Net::FileWebResponse class. Fornisce l'implementazione della classe astratta WebResponse per lavorare con il file system. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1100
url: /it/cpp/system.net/filewebresponse/
---
## FileWebResponse class


Fornisce l'implementazione della classe astratta [WebResponse](../webresponse/) per lavorare con il file system. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

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
| [get_Headers](./get_headers/)() override | Restituisce la raccolta delle intestazioni associate alla risposta corrente. |
| [get_ResponseUri](./get_responseuri/)() override | Restituisce l'URI della risorsa. |
| [get_SupportsHeaders](./get_supportsheaders/)() override | Restituisce un valore che indica se la risposta corrente supporta le intestazioni. |
| [GetResponseStream](./getresponsestream/)() override | Restituisce lo stream della risposta. |
## Vedi anche

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
