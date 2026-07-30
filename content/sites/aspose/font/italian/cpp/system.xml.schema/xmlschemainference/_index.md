---
title: "Classe System::Xml::Schema::XmlSchemaInference"
linktitle: "XmlSchemaInference"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::Schema::XmlSchemaInference. Inferisce uno schema XML Schema Definition Language (XSD) da un documento XML. La classe XmlSchemaInference non può essere ereditata in C++."
type: docs
weight: 3700
url: /it/cpp/system.xml.schema/xmlschemainference/
---
## XmlSchemaInference class


Inferisce uno schema XML [Schema](../) Definition Language (XSD) da un documento XML. La classe [XmlSchemaInference](./) non può essere ereditata.

```cpp
class XmlSchemaInference : public System::Object
```

## Enums

| Enumerazione | Descrizione |
| --- | --- |
| [InferenceOption](./inferenceoption/) | Influisce sulle informazioni di occorrenza e tipo inferite dalla classe [XmlSchemaInference](./) per gli elementi e gli attributi in un documento XML. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Occurrence](./get_occurrence/)() | Restituisce il valore [XmlSchemaInference::InferenceOption](./inferenceoption/) che influisce sulle dichiarazioni di occorrenza dello schema inferite dal documento XML. |
| [get_TypeInference](./get_typeinference/)() | Restituisce il valore [XmlSchemaInference::InferenceOption](./inferenceoption/) che influisce sui tipi inferiti dal documento XML. |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&) | Inferisce uno schema XML [Schema](../) Definition Language (XSD) dal documento XML contenuto nell'oggetto [XmlReader](../../system.xml/xmlreader/) specificato. |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) | Inferisce uno schema XML [Schema](../) Definition Language (XSD) dal documento XML contenuto nell'oggetto [XmlReader](../../system.xml/xmlreader/) specificato, e perfeziona lo schema inferito utilizzando uno schema esistente nell'oggetto [XmlSchemaSet](../xmlschemaset/) specificato con lo stesso namespace di destinazione. |
| [set_Occurrence](./set_occurrence/)(XmlSchemaInference::InferenceOption) | Imposta il valore [XmlSchemaInference::InferenceOption](./inferenceoption/) che influisce sulle dichiarazioni di occorrenza dello schema inferite dal documento XML. |
| [set_TypeInference](./set_typeinference/)(XmlSchemaInference::InferenceOption) | Imposta il valore [XmlSchemaInference::InferenceOption](./inferenceoption/) che influisce sui tipi inferiti dal documento XML. |
| [XmlSchemaInference](./xmlschemainference/)() | Inizializza una nuova istanza della classe [XmlSchemaInference](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
