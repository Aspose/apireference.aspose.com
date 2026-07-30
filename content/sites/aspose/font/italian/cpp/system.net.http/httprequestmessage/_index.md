---
title: "classe System::Net::Http::HttpRequestMessage"
linktitle: "HttpRequestMessage"
second_title: "Aspose.Font per C++"
description: "classe System::Net::Http::HttpRequestMessage. Rappresenta un messaggio di richiesta HTTP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 800
url: /it/cpp/system.net.http/httprequestmessage/
---
## HttpRequestMessage class


Rappresenta un messaggio di richiesta HTTP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarla alle funzioni come argomento.

```cpp
class HttpRequestMessage : public System::IDisposable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Dispose](./dispose/)() override | Rilascia l'istanza corrente. Questo metodo rilascia anche il contenuto della richiesta HTTP. |
| [get_Content](./get_content/)() | Ottiene il contenuto della richiesta HTTP. |
| [get_Headers](./get_headers/)() | Restituisce le intestazioni del contenuto HTTP. |
| [get_Method](./get_method/)() | Ottiene il metodo della richiesta HTTP. |
| [get_Properties](./get_properties/)() | Restituisce la raccolta delle proprietà della richiesta HTTP. |
| [get_RequestUri](./get_requesturi/)() | Ottiene l'URI della risorsa richiesta. |
| [get_Version](./get_version/)() | Informazioni RTTI. |
| [HttpRequestMessage](./httprequestmessage/)() | Crea una nuova istanza. |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, System::SharedPtr\<Uri\>) | Crea una nuova istanza. |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, String) | Crea una nuova istanza. |
| [MarkAsSent](./markassent/)() | Segna la richiesta corrente come inviata. |
| [set_Content](./set_content/)(System::SharedPtr\<HttpContent\>) | Imposta il contenuto della richiesta HTTP. |
| [set_Method](./set_method/)(System::SharedPtr\<HttpMethod\>) | Imposta il metodo della richiesta HTTP. |
| [set_RequestUri](./set_requesturi/)(System::SharedPtr\<Uri\>) | Imposta l'URI della risorsa richiesta. |
| [set_Version](./set_version/)(System::Version) | Imposta la versione HTTP. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
## Vedi anche

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
