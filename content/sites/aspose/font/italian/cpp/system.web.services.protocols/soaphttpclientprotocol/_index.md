---
title: "Classe System::Web::Services::Protocols::SoapHttpClientProtocol"
linktitle: "SoapHttpClientProtocol"
second_title: "Aspose.Font per C++"
description: "Classe System::Web::Services::Protocols::SoapHttpClientProtocol. I servizi proxy client devono ereditare questa classe quando si utilizza SOAP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 900
url: /it/cpp/system.web.services.protocols/soaphttpclientprotocol/
---
## SoapHttpClientProtocol class


I servizi proxy client devono ereditare questa classe quando si utilizza SOAP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarla alle funzioni come argomento.

```cpp
class SoapHttpClientProtocol : public System::Web::Services::Protocols::HttpWebClientProtocol
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Discover](./discover/)() | Associa l'istanza corrente al servizio XML [Web](../../system.web/). |
| [get_SoapVersion](./get_soapversion/)() | Ottiene la versione SOAP. |
| [InitializeSerializers](./initializeserializers/)(const System::TypeInfo\&, System::SharedPtr\<System::Xml::Serialization::XmlSerializerImplementation\>, String) | Inizializza i campi interni. |
| [set_SoapVersion](./set_soapversion/)(SoapProtocolVersion) | Imposta la versione SOAP. |
| [SoapHttpClientProtocol](./soaphttpclientprotocol/)() | Crea una nuova istanza. |
## Vedi anche

* Class [HttpWebClientProtocol](../httpwebclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
