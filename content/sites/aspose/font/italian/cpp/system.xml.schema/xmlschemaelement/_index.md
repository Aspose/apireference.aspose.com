---
title: "System::Xml::Schema::XmlSchemaElement classe"
linktitle: "XmlSchemaElement"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaElement classe. Rappresenta l'elemento element dello XML Schema come specificato dal World Wide Web Consortium (W3C). Questa classe è la classe base per tutti i tipi di particella ed è usata per descrivere un elemento in un documento XML in C++."
type: docs
weight: 2600
url: /it/cpp/system.xml.schema/xmlschemaelement/
---
## XmlSchemaElement class


Rappresenta l'elemento **element** dello XML [Schema](../) come specificato dal World Wide [Web](../../system.web/) Consortium (W3C). Questa classe è la classe base per tutti i tipi di particella ed è usata per descrivere un elemento in un documento XML.

```cpp
class XmlSchemaElement : public System::Xml::Schema::XmlSchemaParticle
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Block](./get_block/)() | Restituisce una derivazione **Block**. |
| [get_BlockResolved](./get_blockresolved/)() | Restituisce l'interpretazione post-compilazione del valore **Block**. |
| [get_Constraints](./get_constraints/)() | Restituisce la raccolta di vincoli sull'elemento. |
| [get_DefaultValue](./get_defaultvalue/)() | Restituisce il valore predefinito dell'elemento se il suo contenuto è un tipo semplice o il contenuto dell'elemento è **textOnly**. |
| [get_ElementSchemaType](./get_elementschematype/)() | Restituisce un oggetto [XmlSchemaType](../xmlschematype/) che rappresenta il tipo dell'elemento basato sui valori [XmlSchemaElement::get_SchemaType](./get_schematype/) o [XmlSchemaElement::get_SchemaTypeName](./get_schematypename/) dell'elemento. |
| [get_ElementType](./get_elementtype/)() | Restituisce un oggetto basato su [XmlSchemaElement](./) o [XmlSchemaElement](./) dell'elemento, che contiene l'interpretazione post-compilazione del valore **ElementType**. |
| [get_Final](./get_final/)() | Restituisce il valore **Final** per indicare che non sono consentite ulteriori derivazioni. |
| [get_FinalResolved](./get_finalresolved/)() | Restituisce l'interpretazione post-compilazione del valore **Final**. |
| [get_FixedValue](./get_fixedvalue/)() | Restituisce il valore fisso. |
| [get_Form](./get_form/)() | Restituisce la forma dell'elemento. |
| [get_IsAbstract](./get_isabstract/)() | Restituisce informazioni per indicare se l'elemento può essere usato in un documento di istanza. |
| [get_IsNillable](./get_isnillable/)() | Restituisce informazioni che indicano se **xsi:nil** può comparire nei dati di istanza. Indica se è possibile assegnare un valore nil esplicito all'elemento. |
| [get_Name](./get_name/)() | Restituisce il nome dell'elemento. |
| [get_QualifiedName](./get_qualifiedname/)() | Restituisce il nome qualificato effettivo per l'elemento specificato. |
| [get_RefName](./get_refname/)() | Restituisce il nome di riferimento di un elemento dichiarato in questo schema (o in un altro schema indicato dallo spazio dei nomi specificato). |
| [get_SchemaType](./get_schematype/)() | Restituisce il tipo dell'elemento. Può essere un tipo complesso o un tipo semplice. |
| [get_SchemaTypeName](./get_schematypename/)() | Restituisce il nome di un tipo di dato integrato definito in questo schema o in un altro schema indicato dallo spazio dei nomi specificato. |
| [get_SubstitutionGroup](./get_substitutiongroup/)() | Restituisce il nome di un elemento che viene sostituito da questo elemento. |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | Imposta una derivazione **Block**. |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | Imposta il valore predefinito dell'elemento se il suo contenuto è un tipo semplice o il contenuto dell'elemento è **textOnly**. |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | Imposta il valore **Final** per indicare che non sono consentite ulteriori derivazioni. |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | Imposta il valore fisso. |
| [set_Form](./set_form/)(XmlSchemaForm) | Imposta la forma dell'elemento. |
| [set_IsAbstract](./set_isabstract/)(bool) | Imposta informazioni per indicare se l'elemento può essere usato in un documento di istanza. |
| [set_IsNillable](./set_isnillable/)(bool) | Imposta informazioni che indicano se **xsi:nil** può comparire nei dati di istanza. Indica che è possibile assegnare un valore nil esplicito all'elemento. |
| [set_Name](./set_name/)(const String\&) | Imposta il nome dell'elemento. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Imposta il nome di riferimento di un elemento dichiarato in questo schema (o in un altro schema indicato dallo spazio dei nomi specificato). |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | Imposta il tipo dell'elemento. Può essere un tipo complesso o un tipo semplice. |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Imposta il nome di un tipo di dati incorporato definito in questo schema o in un altro schema indicato dallo spazio dei nomi specificato. |
| [set_SubstitutionGroup](./set_substitutiongroup/)(const SharedPtr\<XmlQualifiedName\>\&) | Imposta il nome di un elemento che viene sostituito da questo elemento. |
| [XmlSchemaElement](./xmlschemaelement/)() | Inizializza una nuova istanza della classe [XmlSchemaElement](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
