---
title: "Classe System::Xml::Schema::ValidationEventArgs"
linktitle: "ValidationEventArgs"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::Schema::ValidationEventArgs. Restituisce informazioni dettagliate relative al ValidationEventHandler in C++."
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
| [get_Exception](./get_exception/)() | Restituisce la [XmlSchemaException](../xmlschemaexception/) associata all'evento di validazione. |
| [get_Message](./get_message/)() | Restituisce la descrizione testuale corrispondente all'evento di validazione. |
| [get_Severity](./get_severity/)() | Restituisce la gravità dell'evento di validazione. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Un membro statico che rappresenta un puntatore condiviso "empty" [EventArgs](../../system/eventargs/) (null-pointer). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
