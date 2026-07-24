---
title: "System::Xml::Schema::ValidationEventArgs classe"
linktitle: "ValidationEventArgs"
second_title: "Aspose.Page per C++"
description: "System::Xml::Schema::ValidationEventArgs classe. Restituisce informazioni dettagliate relative al ValidationEventHandler in C++."
type: docs
weight: 200
url: /it/cpp/system.xml.schema/validationeventargs/
---
## ValidationEventArgs class


Restituisce informazioni dettagliate relative al [ValidationEventHandler](../validationeventhandler/).

```cpp
class ValidationEventArgs : public System::EventArgs
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Exception](./get_exception/)() | Restituisce l'[XmlSchemaException](../xmlschemaexception/) associata all'evento di convalida. |
| [get_Message](./get_message/)() | Restituisce la descrizione testuale corrispondente all'evento di convalida. |
| [get_Severity](./get_severity/)() | Restituisce la gravità dell'evento di convalida. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Un membro statico che rappresenta un puntatore condiviso "vuoto" [EventArgs](../../system/eventargs/) (null-pointer). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o errori di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
