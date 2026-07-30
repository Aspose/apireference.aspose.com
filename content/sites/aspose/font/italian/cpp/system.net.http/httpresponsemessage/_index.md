---
title: "classe System::Net::Http::HttpResponseMessage"
linktitle: "HttpResponseMessage"
second_title: "Aspose.Font per C++"
description: "Classe System::Net::Http::HttpResponseMessage. Rappresenta un messaggio di risposta HTTP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 900
url: /it/cpp/system.net.http/httpresponsemessage/
---
## HttpResponseMessage class


Rappresenta un messaggio di risposta HTTP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class HttpResponseMessage : public System::IDisposable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Dispose](./dispose/)() override | Rilascia l'istanza corrente. Questo metodo rilascia anche il contenuto della risposta HTTP. |
| [EnsureSuccessStatusCode](./ensuresuccessstatuscode/)() | Verifica il codice di stato. Verrà generata una [HttpRequestException](../httprequestexception/) quando il codice di stato non appartiene alla fascia 2xx. |
| [get_Content](./get_content/)() const | Ottiene il contenuto della risposta HTTP. |
| [get_Headers](./get_headers/)() const | Restituisce le intestazioni del contenuto HTTP. |
| [get_IsSuccessStatusCode](./get_issuccessstatuscode/)() const | Verifica se il codice di stato indica che l'azione richiesta dal client è stata ricevuta, compresa e accettata. |
| [get_ReasonPhrase](./get_reasonphrase/)() const | Ottiene la Reason-Phrase inviata dai server insieme al codice di stato. |
| [get_RequestMessage](./get_requestmessage/)() const | Ottiene il messaggio di richiesta HTTP. |
| [get_StatusCode](./get_statuscode/)() const | Ottiene il codice di stato HTTP. |
| [get_Version](./get_version/)() const | Informazioni RTTI. |
| [HttpResponseMessage](./httpresponsemessage/)() | Crea una nuova istanza. |
| [HttpResponseMessage](./httpresponsemessage/)(HttpStatusCode) | Crea una nuova istanza. |
| [set_Content](./set_content/)(System::SharedPtr\<HttpContent\>) | Imposta il contenuto della risposta HTTP. |
| [set_ReasonPhrase](./set_reasonphrase/)(String) | Imposta la Reason-Phrase inviata dai server insieme al codice di stato. |
| [set_RequestMessage](./set_requestmessage/)(System::SharedPtr\<HttpRequestMessage\>) | Imposta il messaggio di richiesta HTTP. |
| [set_StatusCode](./set_statuscode/)(HttpStatusCode) | Imposta il codice di stato HTTP. |
| [set_Version](./set_version/)(System::Version) | Imposta la versione HTTP. |
| [ToString](./tostring/)() const override | [System::Object::ToString](../../system/object/tostring/). |
## Vedi anche

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
