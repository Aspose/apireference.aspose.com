---
title: "System::Xml::Schema::XmlSchemaParticle classe"
linktitle: "XmlSchemaParticle"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::Schema::XmlSchemaParticle. Una classe base per quello è la classe base per tutti i tipi di particella (ad esempio XmlSchemaAny) in C++."
type: docs
weight: 5400
url: /it/cpp/system.xml.schema/xmlschemaparticle/
---
## XmlSchemaParticle class


Una classe base per quello è la classe base per tutti i tipi di particella (ad esempio [XmlSchemaAny](../xmlschemaany/)).

```cpp
class XmlSchemaParticle : public System::Xml::Schema::XmlSchemaAnnotated
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_MaxOccurs](./get_maxoccurs/)() | Restituisce il numero massimo di volte in cui la particella può verificarsi. |
| [get_MaxOccursString](./get_maxoccursstring/)() | Restituisce il numero come valore stringa. Numero massimo di volte in cui la particella può verificarsi. |
| [get_MinOccurs](./get_minoccurs/)() | Restituisce il numero minimo di volte in cui la particella può verificarsi. |
| [get_MinOccursString](./get_minoccursstring/)() | Restituisce il numero come valore stringa. Il numero minimo di volte in cui la particella può verificarsi. |
| [set_MaxOccurs](./set_maxoccurs/)(Decimal) | Imposta il numero massimo di volte in cui la particella può verificarsi. |
| [set_MaxOccursString](./set_maxoccursstring/)(const String\&) | Imposta il numero come valore stringa. Numero massimo di volte in cui la particella può verificarsi. |
| [set_MinOccurs](./set_minoccurs/)(Decimal) | Imposta il numero minimo di volte in cui la particella può verificarsi. |
| [set_MinOccursString](./set_minoccursstring/)(const String\&) | Imposta il numero come valore stringa. Il numero minimo di volte in cui la particella può verificarsi. |
| [XmlSchemaParticle](./xmlschemaparticle/)() | Inizializza una nuova istanza della classe [XmlSchemaParticle](./). |
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
