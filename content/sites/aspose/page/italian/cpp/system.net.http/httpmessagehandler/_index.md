---
title: "System::Net::Http::HttpMessageHandler classe"
linktitle: "HttpMessageHandler"
second_title: "Aspose.Page per C++"
description: "System::Net::Http::HttpMessageHandler classe. Rappresenta un tipo base per i gestori di messaggi HTTP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 500
url: /it/cpp/system.net.http/httpmessagehandler/
---
## HttpMessageHandler class


Rappresenta un tipo base per i gestori di messaggi HTTP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class HttpMessageHandler : public System::IDisposable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Dispose](./dispose/)() override | Non fa nulla. |
| virtual [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) | Informazioni RTTI. |
## Vedi anche

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
