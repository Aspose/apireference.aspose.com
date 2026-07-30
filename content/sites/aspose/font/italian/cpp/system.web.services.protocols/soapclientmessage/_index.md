---
title: "System::Web::Services::Protocols::SoapClientMessage class"
linktitle: "SoapClientMessage"
second_title: "Aspose.Font per C++"
description: "System::Web::Services::Protocols::SoapClientMessage class. Rappresenta i dati in una richiesta SOAP inviata o in una risposta SOAP ricevuta. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 300
url: /it/cpp/system.web.services.protocols/soapclientmessage/
---
## SoapClientMessage class


Rappresenta i dati in una richiesta SOAP inviata o in una risposta SOAP ricevuta. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class SoapClientMessage : public System::Web::Services::Protocols::SoapMessage
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Action](./get_action/)() override | Restituisce un valore dell'attributo 'SOAPAction'. |
| [get_Client](./get_client/)() | Restituisce un'istanza della classe proxy del client. |
| virtual [get_OneWay](./get_oneway/)() | Restituisce un valore che indica se un client non attende che il server termini l'elaborazione di un metodo. |
| [get_SoapVersion](./get_soapversion/)() override | Restituisce la versione SOAP utilizzata. |
| [get_Url](./get_url/)() override | Restituisce l'URL del servizio XML [Web](../../system.web/). |
| [SoapClientMessage](./soapclientmessage/)(System::SharedPtr\<SoapHttpClientProtocol\>, System::SharedPtr\<SoapMethodStubInfo\>, String, System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Crea una nuova istanza. |
## Vedi anche

* Class [SoapMessage](../soapmessage/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
