---
title: "System::Web::Services::Protocols::SoapDocumentMethodAttribute class"
linktitle: "SoapDocumentMethodAttribute"
second_title: "Aspose.Font per C++"
description: "System::Web::Services::Protocols::SoapDocumentMethodAttribute class. Specifica che tutti i messaggi SOAP passati o restituiti dal metodo utilizzano la formattazione Document. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e usare questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 400
url: /it/cpp/system.web.services.protocols/soapdocumentmethodattribute/
---
## SoapDocumentMethodAttribute class


Specifica che tutti i messaggi SOAP passati o restituiti dal metodo utilizzano la formattazione Document. Gli oggetti di questa classe devono essere allocati solo usando la [System::MakeObject()](../../system/makeobject/) funzione. Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usare questo puntatore per passarla alle funzioni come argomento.

```cpp
class SoapDocumentMethodAttribute : public System::Attribute
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Action](./get_action/)() | Informazioni RTTI. |
| [get_Binding](./get_binding/)() | Ottiene il binding per il quale un metodo di servizio web XML implementa un'operazione. |
| [get_OneWay](./get_oneway/)() | Ottiene un valore che indica se un client non attende che il server termini l'elaborazione di un metodo. |
| [get_ParameterStyle](./get_parameterstyle/)() | Ottiene un valore che indica se i parametri sono incapsulati all'interno di un unico elemento XML sotto l'elemento 'Body'. |
| [get_RequestElementName](./get_requestelementname/)() | Ottiene il nome dell'elemento XML associato alla richiesta SOAP, definito in una descrizione del servizio come un'operazione. |
| [get_RequestNamespace](./get_requestnamespace/)() | Ottiene lo spazio dei nomi associato alla richiesta SOAP. |
| [get_ResponseElementName](./get_responseelementname/)() | Ottiene il nome dell'elemento XML associato alla risposta SOAP. |
| [get_ResponseNamespace](./get_responsenamespace/)() | Ottiene lo spazio dei nomi associato alla risposta SOAP. |
| [get_Use](./get_use/)() | Ottiene un valore che determina il metodo di codifica del messaggio. |
| [set_Action](./set_action/)(String) | Imposta un valore dell'attributo 'SOAPAction'. |
| [set_Binding](./set_binding/)(String) | Imposta il binding per il quale un metodo del servizio web XML sta implementando un'operazione. |
| [set_OneWay](./set_oneway/)(bool) | Imposta un valore che indica se il client non attende che il server termini l'elaborazione di un metodo. |
| [set_ParameterStyle](./set_parameterstyle/)(SoapParameterStyle) | Imposta un valore che indica se i parametri sono incapsulati all'interno di un unico elemento XML sotto l'elemento 'Body'. |
| [set_RequestElementName](./set_requestelementname/)(String) | Imposta il nome dell'elemento XML associato alla richiesta SOAP, definito in una descrizione del servizio come un'operazione. |
| [set_RequestNamespace](./set_requestnamespace/)(String) | Imposta lo spazio dei nomi associato alla richiesta SOAP. |
| [set_ResponseElementName](./set_responseelementname/)(String) | Imposta il nome dell'elemento XML associato alla risposta SOAP. |
| [set_ResponseNamespace](./set_responsenamespace/)(String) | Imposta lo spazio dei nomi associato alla risposta SOAP. |
| [set_Use](./set_use/)(Description::SoapBindingUse) | Imposta un valore che determina il metodo di codifica del messaggio. |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/)() | Crea una nuova istanza. |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/)(String) | Crea una nuova istanza. |
## Vedi anche

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
