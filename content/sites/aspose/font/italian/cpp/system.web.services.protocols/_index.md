---
title: "Spazio dei nomi System::Web::Services::Protocols"
linktitle: "System::Web::Services::Protocols"
second_title: "Aspose.Font per C++"
description: "Come utilizzare lo spazio dei nomi System::Web::Services::Protocols in C++."
type: docs
weight: 7500
url: /it/cpp/system.web.services.protocols/
---



## Classi

| Classe | Descrizione |
| --- | --- |
| [HttpWebClientProtocol](./httpwebclientprotocol/) | Questa classe base è utilizzata in tutti i proxy client di servizio XML [Web](../system.web/) che usano HTTP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento. |
| [InvokeCompletedEventArgs](./invokecompletedeventargs/) | Un'istanza di questa classe viene passata come argomento al delegato InvokeCompletedEventHandler. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento. |
| [SoapClientMessage](./soapclientmessage/) | Rappresenta i dati in una richiesta SOAP inviata o in una risposta SOAP ricevuta. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento. |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/) | Specifica che tutti i messaggi SOAP passati o restituiti dal metodo utilizzano la formattazione Document. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/) | Imposta il formato predefinito per le richieste e le risposte SOAP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento. |
| [SoapHeader](./soapheader/) | Rappresenta il contenuto dell'intestazione SOAP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento. |
| [SoapHeaderAttribute](./soapheaderattribute/) | Specifica l'intestazione SOAP che il metodo del servizio XML [Web](../system.web/) o il client del servizio XML [Web](../system.web/) può elaborare. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento. |
| [SoapHeaderCollection](./soapheadercollection/) | Contiene una collezione di istanze della classe [SoapHeader](./soapheader/). |
| [SoapHttpClientProtocol](./soaphttpclientprotocol/) | I servizi proxy client devono ereditare questa classe quando si utilizza SOAP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento. |
| [SoapMessage](./soapmessage/) | Rappresenta il messaggio SOAP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento. |
| [WebClientProtocol](./webclientprotocol/) | Questa classe base è utilizzata in tutti i proxy client di servizio XML [Web](../system.web/) che sono stati creati usando ASP.NET. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento. |
## Enums

| Enumerazione | Descrizione |
| --- | --- |
| [SoapHeaderDirection](./soapheaderdirection/) | Enumera le direzioni dell'intestazione SOAP. |
| [SoapMessageStage](./soapmessagestage/) | Enumera le fasi di elaborazione dei messaggi SOAP. |
| [SoapParameterStyle](./soapparameterstyle/) | Enumera i formati dei parametri in un messaggio SOAP. |
| [SoapProtocolVersion](./soapprotocolversion/) | Enumera le versioni di SOAP. |
| [SoapServiceRoutingStyle](./soapserviceroutingstyle/) | Enumera le opzioni su come un messaggio SOAP viene instradato al servizio XML [Web](../system.web/). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [SoapException](./soapexception/) |  |
