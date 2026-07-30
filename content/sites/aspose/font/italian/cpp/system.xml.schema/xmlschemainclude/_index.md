---
title: "System::Xml::Schema::XmlSchemaInclude classe"
linktitle: "XmlSchemaInclude"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaInclude classe. Rappresenta l'elemento include da XML Schema come specificato dal World Wide Web Consortium (W3C). Questa classe è usata per includere dichiarazioni e definizioni da uno schema esterno. Le dichiarazioni e le definizioni incluse sono quindi disponibili per l'elaborazione nello schema contenitore in C++."
type: docs
weight: 3600
url: /it/cpp/system.xml.schema/xmlschemainclude/
---
## XmlSchemaInclude class


Rappresenta l'elemento **include** da XML [Schema](../) come specificato dal World Wide [Web](../../system.web/) Consortium (W3C). Questa classe è usata per includere dichiarazioni e definizioni da uno schema esterno. Le dichiarazioni e le definizioni incluse sono quindi disponibili per l'elaborazione nello schema contenitore.

```cpp
class XmlSchemaInclude : public System::Xml::Schema::XmlSchemaExternal
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Annotation](./get_annotation/)() | Restituisce il valore **annotation**. |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | Imposta il valore **annotation**. |
| [XmlSchemaInclude](./xmlschemainclude/)() | Inizializza una nuova istanza della classe [XmlSchemaInclude](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
