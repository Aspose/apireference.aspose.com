---
title: "classe System::Web::Services::Protocols::SoapHeaderAttribute"
linktitle: "SoapHeaderAttribute"
second_title: "Aspose.Font per C++"
description: "Classe System::Web::Services::Protocols::SoapHeaderAttribute. Specifica l'intestazione SOAP che il metodo del servizio Web XML o il client del servizio Web XML può elaborare. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 700
url: /it/cpp/system.web.services.protocols/soapheaderattribute/
---
## SoapHeaderAttribute class


Specifica l'intestazione SOAP che il metodo del servizio [Web](../../system.web/) XML o il client del servizio [Web](../../system.web/) XML può elaborare. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class SoapHeaderAttribute : public System::Attribute
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Direction](./get_direction/)() | Informazioni RTTI. |
| [get_MemberName](./get_membername/)() | Ottiene il nome della variabile membro del servizio SOAP XML utilizzato per ricevere il contenuto dell'intestazione SOAP. |
| [get_Required](./get_required/)() | Ottiene un valore che indica se l'intestazione SOAP deve essere compresa ed elaborata dal servizio XML [Web](../../system.web/) destinatario o dal client del servizio XML [Web](../../system.web/). |
| [set_Direction](./set_direction/)(SoapHeaderDirection) | Imposta la direzione dell'intestazione SOAP. |
| [set_MemberName](./set_membername/)(String) | Imposta il nome della variabile membro del servizio SOAP XML utilizzato per ricevere il contenuto dell'intestazione SOAP. |
| [set_Required](./set_required/)(bool) | Imposta un valore che indica se l'intestazione SOAP deve essere compresa ed elaborata dal servizio XML [Web](../../system.web/) destinatario o dal client del servizio XML [Web](../../system.web/). |
| [SoapHeaderAttribute](./soapheaderattribute/)(String) | Crea una nuova istanza. |
## Vedi anche

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
