---
title: "classe System::Net::FileWebRequest"
linktitle: "FileWebRequest"
second_title: "Aspose.Font per C++"
description: "Classe System::Net::FileWebRequest. Fornisce l'implementazione della classe astratta WebRequest per lavorare con il file system. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 1000
url: /it/cpp/system.net/filewebrequest/
---
## FileWebRequest class


Fornisce l'implementazione della classe astratta [WebRequest](../webrequest/) per lavorare con il file system. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class FileWebRequest : public System::Net::WebRequest
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Abort](./abort/)() override | Interrompe la richiesta corrente. |
| [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) override | Avvia un'operazione asincrona per ottenere un flusso per scrivere dati nella risorsa. |
| [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) override | Avvia una richiesta asincrona per la risorsa. |
| [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) override | Attende finché l'operazione asincrona specificata per ottenere un flusso non termina. |
| [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) override | Attende finché la richiesta asincrona specificata per la risorsa non termina. |
| [FileWebRequest](./filewebrequest/)(System::SharedPtr\<Uri\>) | Crea una nuova istanza. |
| [get_ContentType](./get_contenttype/)() override | Ottiene il tipo MIME della richiesta. |
| [get_Headers](./get_headers/)() override | Ottiene la raccolta delle intestazioni HTTP. |
| [get_Method](./get_method/)() override | Ottiene il metodo HTTP. |
| [get_RequestUri](./get_requesturi/)() override | Restituisce l'URI della richiesta. |
| [GetResponse](./getresponse/)() override | Restituisce la risposta web associata alla richiesta web corrente. |
| [set_ContentType](./set_contenttype/)(String) override | Imposta il tipo MIME della richiesta. |
| [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) override | Imposta la raccolta delle intestazioni HTTP. |
| [set_Method](./set_method/)(String) override | Imposta il metodo HTTP. |
| [set_Timeout](./set_timeout/)(int) override | Informazioni RTTI. |
## Vedi anche

* Class [WebRequest](../webrequest/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
