---
title: "classe System::Net::Http::HttpMessageInvoker"
linktitle: "HttpMessageInvoker"
second_title: "Aspose.Font per C++"
description: "classe System::Net::Http::HttpMessageInvoker. Consente alle applicazioni di chiamare il metodo Send su una catena di gestori HTTP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 600
url: /it/cpp/system.net.http/httpmessageinvoker/
---
## HttpMessageInvoker class


Consente alle applicazioni di chiamare il metodo Send su una catena di gestori HTTP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class HttpMessageInvoker : public System::IDisposable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Dispose](./dispose/)() override | Rilascia l'istanza corrente. Questo metodo rilascia anche il gestore se necessario. |
| [HttpMessageInvoker](./httpmessageinvoker/)(System::SharedPtr\<HttpMessageHandler\>) | Informazioni RTTI. |
| [HttpMessageInvoker](./httpmessageinvoker/)(System::SharedPtr\<HttpMessageHandler\>, bool) | Crea una nuova istanza. |
| virtual [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) | Invia la richiesta specificata. |
## Vedi anche

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
