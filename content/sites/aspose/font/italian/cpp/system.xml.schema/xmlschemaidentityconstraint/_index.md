---
title: "System::Xml::Schema::XmlSchemaIdentityConstraint classe"
linktitle: "XmlSchemaIdentityConstraint"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaIdentityConstraint class. Classe per i vincoli di identità: elementi key, keyref e unique in C++."
type: docs
weight: 3400
url: /it/cpp/system.xml.schema/xmlschemaidentityconstraint/
---
## XmlSchemaIdentityConstraint class


Classe per i vincoli di identità: elementi **key**, **keyref** e **unique**.

```cpp
class XmlSchemaIdentityConstraint : public System::Xml::Schema::XmlSchemaAnnotated
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Fields](./get_fields/)() | Restituisce la raccolta di campi che si applicano come figli per il selettore di espressione del Linguaggio di Percorso XML ([XPath](../../system.xml.xpath/)). |
| [get_Name](./get_name/)() | Restituisce il nome del vincolo di identità. |
| [get_QualifiedName](./get_qualifiedname/)() | Restituisce il nome qualificato del vincolo di identità, che contiene l'interpretazione post-compilazione del valore **QualifiedName**. |
| [get_Selector](./get_selector/)() | Restituisce l'elemento **selector** dell'espressione [XPath](../../system.xml.xpath/). |
| [set_Name](./set_name/)(const String\&) | Imposta il nome del vincolo di identità. |
| [set_Selector](./set_selector/)(const SharedPtr\<XmlSchemaXPath\>\&) | Imposta l'elemento **selector** dell'espressione [XPath](../../system.xml.xpath/). |
| [XmlSchemaIdentityConstraint](./xmlschemaidentityconstraint/)() | Inizializza una nuova istanza della classe [XmlSchemaIdentityConstraint](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
