---
title: "System::Web::Services::Protocols::SoapHeader class"
linktitle: "SoapHeader"
second_title: "Aspose.Font per C++"
description: "System::Web::Services::Protocols::SoapHeader class. Rappresenta il contenuto dell'intestazione SOAP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 600
url: /it/cpp/system.web.services.protocols/soapheader/
---
## SoapHeader class


Rappresenta il contenuto dell'intestazione SOAP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class SoapHeader : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Actor](./get_actor/)() | Restituisce l'URI del destinatario dell'intestazione SOAP quando viene utilizzata la versione 1.1 di SOAP. |
| [get_DidUnderstand](./get_didunderstand/)() | Restituisce un valore che indica se l'intestazione SOAP è stata elaborata correttamente. |
| [get_EncodedMustUnderstand](./get_encodedmustunderstand/)() | Restituisce il valore dell'attributo 'mustUnderstand' quando viene utilizzata la versione 1.1 di SOAP. |
| [get_EncodedMustUnderstand12](./get_encodedmustunderstand12/)() | Restituisce il valore dell'attributo 'mustUnderstand' quando viene utilizzata la versione 1.2 di SOAP. |
| [get_EncodedRelay](./get_encodedrelay/)() | Ottiene una rappresentazione stringa del valore dell'attributo 'relay'. |
| [get_MustUnderstand](./get_mustunderstand/)() | Ottiene un valore che indica se l'intestazione SOAP deve essere compresa. |
| [get_Relay](./get_relay/)() | Ottiene il valore dell'attributo 'relay'. |
| [get_Role](./get_role/)() | Ottiene l'URI del destinatario dell'intestazione SOAP quando viene utilizzata la versione 1.2 di SOAP. |
| [set_Actor](./set_actor/)(String) | Imposta l'URI del destinatario dell'intestazione SOAP quando viene utilizzata la versione 1.1 di SOAP. |
| [set_DidUnderstand](./set_didunderstand/)(bool) | Imposta un valore che indica se l'intestazione SOAP è stata elaborata correttamente. |
| [set_EncodedMustUnderstand](./set_encodedmustunderstand/)(String) | Imposta un valore dell'attributo 'mustUnderstand' quando viene utilizzata la versione 1.1 di SOAP. |
| [set_EncodedMustUnderstand12](./set_encodedmustunderstand12/)(String) | Imposta un valore dell'attributo 'mustUnderstand' quando viene utilizzata la versione 1.2 di SOAP. |
| [set_EncodedRelay](./set_encodedrelay/)(String) | Imposta una rappresentazione stringa del valore dell'attributo 'relay'. |
| [set_MustUnderstand](./set_mustunderstand/)(bool) | Imposta un valore che indica se l'intestazione SOAP deve essere compresa. |
| [set_Relay](./set_relay/)(bool) | Imposta il valore dell'attributo 'relay'. |
| [set_Role](./set_role/)(String) | Imposta l'URI del destinatario dell'intestazione SOAP quando viene utilizzata la versione 1.2 di SOAP. |
| [SoapHeader](./soapheader/)(System::SharedPtr\<Xml::XmlElement\>) | Crea una nuova istanza. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
