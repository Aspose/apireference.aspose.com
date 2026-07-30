---
title: "classe System::Web::Services::WebServiceBindingAttribute"
linktitle: "WebServiceBindingAttribute"
second_title: "Aspose.Font per C++"
description: "Classe System::Web::Services::WebServiceBindingAttribute. Utilizzata per dichiarare un binding che definisce uno o più metodi del servizio Web XML. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e usare questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 400
url: /it/cpp/system.web.services/webservicebindingattribute/
---
## WebServiceBindingAttribute class


Utilizzato per dichiarare un binding che definisce uno o più metodi del servizio XML [Web](../../system.web/) . Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usare questo puntatore per passarla alle funzioni come argomento.

```cpp
class WebServiceBindingAttribute : public System::Attribute
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_ConformsTo](./get_conformsto/)() | Restituisce la specifica WSI. |
| [get_EmitConformanceClaims](./get_emitconformanceclaims/)() | Restituisce un valore che indica se il binding emette dichiarazioni di conformità. |
| [get_Location](./get_location/)() | Informazioni RTTI. |
| [get_Name](./get_name/)() | Restituisce il nome del binding. |
| [get_Namespace](./get_namespace/)() | Restituisce lo spazio dei nomi associato al binding. |
| [set_ConformsTo](./set_conformsto/)(System::SharedPtr\<WsiProfiles\>) | Imposta la specifica WSI. |
| [set_EmitConformanceClaims](./set_emitconformanceclaims/)(bool) | Imposta un valore che indica se il binding emette dichiarazioni di conformità. |
| [set_Location](./set_location/)(String) | Imposta la posizione in cui è definito il binding. |
| [set_Name](./set_name/)(String) | Imposta il nome del binding. |
| [set_Namespace](./set_namespace/)(String) | Imposta lo spazio dei nomi associato al binding. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)() | Crea una nuova istanza. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String) | Crea una nuova istanza. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String, String) | Crea una nuova istanza. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String, String, String) | Crea una nuova istanza. |
## Vedi anche

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services](../)
* Library [Aspose.Font for C++](../../)
