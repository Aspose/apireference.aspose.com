---
title: "classe System::Web::Services::Protocols::SoapMessage"
linktitle: "SoapMessage"
second_title: "Aspose.Font per C++"
description: "Classe System::Web::Services::Protocols::SoapMessage. Rappresenta il messaggio SOAP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1000
url: /it/cpp/system.web.services.protocols/soapmessage/
---
## SoapMessage class


Rappresenta il messaggio SOAP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class SoapMessage : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CollectHeaders](./collectheaders/)(System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>, SoapHeaderDirection) | Imposta la collezione interna delle intestazioni SOAP. |
| [FindHeader](./findheader/)(System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>, const TypeInfo\&) | Trova la mappatura dell'intestazione per il tipo di intestazione specificato. |
| virtual [get_Action](./get_action/)() | Restituisce un valore dell'attributo 'SOAPAction'. |
| [get_ContentEncoding](./get_contentencoding/)() | Ottiene un valore dell'intestazione 'Content-Encoding'. |
| [get_ContentType](./get_contenttype/)() | Ottiene un valore dell'intestazione 'Content-Type'. |
| [get_Exception](./get_exception/)() | Ottiene l'eccezione generata dal metodo del servizio XML [Web](../../system.web/). |
| [get_Headers](./get_headers/)() | Restituisce la collezione delle intestazioni SOAP. |
| [get_InParameters](./get_inparameters/)() | Ottiene i parametri passati al metodo del servizio XML [Web](../../system.web/). |
| [get_IsSoap12](./get_issoap12/)() | Restituisce un valore che indica se è utilizzata la versione SOAP 1.2. |
| [get_OutParameters](./get_outparameters/)() | Ottiene i parametri di output passati al metodo del servizio XML [Web](../../system.web/). |
| virtual [get_SoapVersion](./get_soapversion/)() | Restituisce la versione SOAP utilizzata. |
| [get_Stage](./get_stage/)() | Ottiene lo stadio di elaborazione di un messaggio SOAP. |
| [get_Stream](./get_stream/)() | Ottiene lo stream che contiene i dati del messaggio SOAP. |
| virtual [get_Url](./get_url/)() | Restituisce l'URL del servizio XML [Web](../../system.web/). |
| [GetInParameterValue](./getinparametervalue/)(int32_t) | Ottiene il valore del parametro di input all'indice specificato. |
| [GetOutParameterValue](./getoutparametervalue/)(int32_t) | Ottiene il valore del parametro di output all'indice specificato. |
| [GetReturnValue](./getreturnvalue/)() | Ottiene il valore di ritorno del metodo del servizio XML [Web](../../system.web/). |
| [set_ContentEncoding](./set_contentencoding/)(String) | Imposta un valore dell'intestazione 'Content-Encoding'. |
| [set_ContentType](./set_contenttype/)(String) | Imposta un valore dell'intestazione 'Content-Type'. |
| [set_InParameters](./set_inparameters/)(System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Imposta i parametri che vengono passati al metodo del servizio XML [Web](../../system.web/). |
| [set_InternalStream](./set_internalstream/)(System::SharedPtr\<System::IO::Stream\>) | Imposta lo stream che contiene i dati del messaggio SOAP. |
| [set_OutParameters](./set_outparameters/)(System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Imposta i parametri di output passati al metodo del servizio XML [Web](../../system.web/). |
| [SetException](./setexception/)(SoapException) | Imposta l'eccezione generata dal metodo del servizio XML [Web](../../system.web/). |
| [SetHeaders](./setheaders/)(System::SharedPtr\<SoapHeaderCollection\>) | Imposta la raccolta delle intestazioni SOAP. |
| [SetStage](./setstage/)(SoapMessageStage) | Imposta lo stadio di elaborazione del messaggio SOAP. |
| [SetStream](./setstream/)(System::SharedPtr\<System::IO::Stream\>) | Imposta lo stream che contiene i dati del messaggio SOAP. |
| [SoapMessage](./soapmessage/)() | Crea una nuova istanza. |
| [UpdateHeaderValues](./updateheadervalues/)(System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>) | Aggiorna la raccolta interna delle intestazioni SOAP. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
