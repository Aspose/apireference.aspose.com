---
title: "Classe System::Xml::Schema::XmlSchemaComplexType"
linktitle: "XmlSchemaComplexType"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::Schema::XmlSchemaComplexType. Rappresenta l'elemento complexType dallo XML Schema come specificato dal World Wide Web Consortium (W3C). Questa classe definisce un tipo complesso che determina l'insieme di attributi e il contenuto di un elemento in C++."
type: docs
weight: 2100
url: /it/cpp/system.xml.schema/xmlschemacomplextype/
---
## XmlSchemaComplexType class


Rappresenta l'elemento **complexType** dallo XML [Schema](../) come specificato dal World Wide [Web](../../system.web/) Consortium (W3C). Questa classe definisce un tipo complesso che determina l'insieme di attributi e il contenuto di un elemento.

```cpp
class XmlSchemaComplexType : public System::Xml::Schema::XmlSchemaType
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Restituisce il valore per il componente [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) del tipo complesso. |
| [get_Attributes](./get_attributes/)() | Restituisce la raccolta di attributi per il tipo complesso. |
| [get_AttributeUses](./get_attributeuses/)() | Restituisce la raccolta di tutti gli attributi compilati di questo tipo complesso e dei suoi tipi base. |
| [get_AttributeWildcard](./get_attributewildcard/)() | Restituisce il valore post-compilazione per **anyAttribute** di questo tipo complesso e dei suoi tipi base. |
| [get_Block](./get_block/)() | Restituisce l'attributo **block**. |
| [get_BlockResolved](./get_blockresolved/)() | Restituisce il valore dopo che il tipo è stato compilato nel set di informazioni post-validazione dello schema (infoset). Questo valore indica come il tipo viene applicato quando **xsi:type** è usato nel documento di istanza. |
| [get_ContentModel](./get_contentmodel/)() | Restituisce il [XmlSchemaContentModel](../xmlschemacontentmodel/) post-compilazione di questo tipo complesso. |
| [get_ContentType](./get_contenttype/)() | Restituisce il modello di contenuto del tipo complesso che contiene il valore post-compilazione. |
| [get_ContentTypeParticle](./get_contenttypeparticle/)() | Restituisce la particella che contiene il valore post-compilazione della particella [XmlSchemaComplexType::get_ContentType](./get_contenttype/). |
| [get_IsAbstract](./get_isabstract/)() | Restituisce le informazioni che determinano se l'elemento **complexType** può essere usato nel documento di istanza. |
| [get_IsMixed](./get_ismixed/)() override | Restituisce le informazioni che determinano se il tipo complesso ha un modello di contenuto misto (markup all'interno del contenuto). |
| [get_Particle](./get_particle/)() | Restituisce il tipo di compositore come una delle classi [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), o [XmlSchemaSequence](../xmlschemasequence/). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Imposta il valore per il componente [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) del tipo complesso. |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | Imposta l'attributo **block**. |
| [set_ContentModel](./set_contentmodel/)(const SharedPtr\<XmlSchemaContentModel\>\&) | Imposta il [XmlSchemaContentModel](../xmlschemacontentmodel/) post-compilazione di questo tipo complesso. |
| [set_IsAbstract](./set_isabstract/)(bool) | Imposta le informazioni che determinano se l'elemento **complexType** può essere usato nel documento di istanza. |
| [set_IsMixed](./set_ismixed/)(bool) override | Imposta le informazioni che determinano se il tipo complesso ha un modello di contenuto misto (markup all'interno del contenuto). |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | Imposta il tipo di compositore come una delle classi [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), o [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaComplexType](./xmlschemacomplextype/)() | Inizializza una nuova istanza della classe [XmlSchemaComplexType](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
