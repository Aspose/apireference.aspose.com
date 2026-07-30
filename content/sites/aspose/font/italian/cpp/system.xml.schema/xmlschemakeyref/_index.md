---
title: "System::Xml::Schema::XmlSchemaKeyref class"
linktitle: "XmlSchemaKeyref"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaKeyref class. Questa classe rappresenta l'elemento keyref dallo XMLSchema come specificato dal World Wide Web Consortium (W3C) in C++."
type: docs
weight: 4000
url: /it/cpp/system.xml.schema/xmlschemakeyref/
---
## XmlSchemaKeyref class


Questa classe rappresenta l'elemento **keyref** dallo XMLSchema come specificato dal World Wide [Web](../../system.web/) Consortium (W3C).

```cpp
class XmlSchemaKeyref : public System::Xml::Schema::XmlSchemaIdentityConstraint
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Refer](./get_refer/)() | Restituisce il nome della chiave a cui questo vincolo fa riferimento in un altro tipo semplice o complesso. |
| [set_Refer](./set_refer/)(const SharedPtr\<XmlQualifiedName\>\&) | Imposta il nome della chiave a cui questo vincolo fa riferimento in un altro tipo semplice o complesso. |
| [XmlSchemaKeyref](./xmlschemakeyref/)() | Inizializza una nuova istanza della classe [XmlSchemaKeyref](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlSchemaIdentityConstraint](../xmlschemaidentityconstraint/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
