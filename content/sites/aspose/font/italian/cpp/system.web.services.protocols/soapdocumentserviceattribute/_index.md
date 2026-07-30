---
title: "classe System::Web::Services::Protocols::SoapDocumentServiceAttribute"
linktitle: "SoapDocumentServiceAttribute"
second_title: "Aspose.Font per C++"
description: "classe System::Web::Services::Protocols::SoapDocumentServiceAttribute. Imposta il formato predefinito per le richieste e le risposte SOAP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 500
url: /it/cpp/system.web.services.protocols/soapdocumentserviceattribute/
---
## SoapDocumentServiceAttribute class


Imposta il formato predefinito per le richieste e le risposte SOAP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class SoapDocumentServiceAttribute : public System::Attribute
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_ParameterStyle](./get_parameterstyle/)() | Informazioni RTTI. |
| [get_RoutingStyle](./get_routingstyle/)() | Ottiene un valore che indica come i messaggi SOAP vengono instradati al servizio. |
| [get_Use](./get_use/)() | Ottiene la formattazione dei parametri. |
| [set_ParameterStyle](./set_parameterstyle/)(SoapParameterStyle) | Imposta un valore che indica se i parametri sono incapsulati all'interno di un unico elemento XML sotto l'elemento 'Body'. |
| [set_RoutingStyle](./set_routingstyle/)(SoapServiceRoutingStyle) | Imposta un valore che indica come i messaggi SOAP vengono instradati al servizio. |
| [set_Use](./set_use/)(Description::SoapBindingUse) | Imposta la formattazione dei parametri. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)() | Crea una nuova istanza. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)(Description::SoapBindingUse) | Crea una nuova istanza. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)(Description::SoapBindingUse, SoapParameterStyle) | Crea una nuova istanza. |
## Vedi anche

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
