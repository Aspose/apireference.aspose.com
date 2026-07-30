---
title: "Classe System::Xml::Schema::XmlSchemaValidator"
linktitle: "XmlSchemaValidator"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::Schema::XmlSchemaValidator. Rappresenta un motore di convalida di schema per il Linguaggio di Definizione di Schema XML (XSD). La classe XmlSchemaValidator non può essere ereditata in C++."
type: docs
weight: 7000
url: /it/cpp/system.xml.schema/xmlschemavalidator/
---
## XmlSchemaValidator class


Rappresenta un motore di convalida del Linguaggio di Definizione XML (XSD) [Schema](../) [Schema](../). La classe [XmlSchemaValidator](./) non può essere ereditata.

```cpp
class XmlSchemaValidator : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AddSchema](./addschema/)(const SharedPtr\<XmlSchema\>\&) | Aggiunge uno schema XML [Schema](../) Definition Language (XSD) al set di schemi usati per la convalida. |
| [EndValidation](./endvalidation/)() | Termina la convalida e verifica i vincoli di identità per l'intero documento XML. |
| [get_LineInfoProvider](./get_lineinfoprovider/)() | Restituisce le informazioni sul numero di riga per il nodo XML in fase di convalida. |
| [get_SourceUri](./get_sourceuri/)() | Restituisce l'URI di origine per il nodo XML in fase di convalida. |
| [get_ValidationEventSender](./get_validationeventsender/)() | Restituisce l'oggetto inviato come oggetto mittente di un evento di convalida. |
| [GetExpectedAttributes](./getexpectedattributes/)() | Restituisce gli attributi attesi per il contesto dell'elemento corrente. |
| [GetExpectedParticles](./getexpectedparticles/)() | Restituisce le particelle attese nel contesto dell'elemento corrente. |
| [GetUnspecifiedDefaultAttributes](./getunspecifieddefaultattributes/)(const SharedPtr\<Collections::Generic::List\<SharedPtr\<Object\>\>\>\&) | Convalida i vincoli di identità sugli attributi predefiniti e popola la List specificata con oggetti [XmlSchemaAttribute](../xmlschemaattribute/) per tutti gli attributi con valori predefiniti che non sono stati precedentemente convalidati utilizzando il metodo [XmlSchemaValidator::ValidateAttribute](./validateattribute/) nel contesto dell'elemento. |
| [Initialize](./initialize/)() | Inizializza lo stato dell'oggetto [XmlSchemaValidator](./). |
| [Initialize](./initialize/)(const SharedPtr\<XmlSchemaObject\>\&) | Inizializza lo stato dell'oggetto [XmlSchemaValidator](./) utilizzando il [XmlSchemaObject](../xmlschemaobject/) specificato per la convalida parziale. |
| [set_LineInfoProvider](./set_lineinfoprovider/)(const SharedPtr\<IXmlLineInfo\>\&) | Imposta le informazioni sul numero di riga per il nodo XML in fase di convalida. |
| [set_SourceUri](./set_sourceuri/)(const SharedPtr\<Uri\>\&) | Imposta l'URI di origine per il nodo XML in fase di convalida. |
| [set_ValidationEventSender](./set_validationeventsender/)(const SharedPtr\<Object\>\&) | Imposta l'oggetto inviato come oggetto mittente di un evento di convalida. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Imposta l'oggetto [XmlResolver](../../system.xml/xmlresolver/) utilizzato per risolvere gli elementi **xs:import** e **xs:include** così come gli attributi **xsi:schemaLocation** e **xsi:noNamespaceSchemaLocation**. |
| [SkipToEndElement](./skiptoendelement/)(const SharedPtr\<XmlSchemaInfo\>\&) | Salta la convalida del contenuto dell'elemento corrente e prepara l'oggetto [XmlSchemaValidator](./) per convalidare il contenuto nel contesto dell'elemento padre. |
| [ValidateAttribute](./validateattribute/)(const String\&, const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) | Convalida il nome dell'attributo, l'URI dello spazio dei nomi e il valore nel contesto dell'elemento corrente. |
| [ValidateAttribute](./validateattribute/)(const String\&, const String\&, XmlValueGetter, const SharedPtr\<XmlSchemaInfo\>\&) | Convalida il nome dell'attributo, l'URI dello spazio dei nomi e il valore nel contesto dell'elemento corrente. |
| [ValidateElement](./validateelement/)(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) | Convalida l'elemento nel contesto corrente. |
| [ValidateElement](./validateelement/)(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) | Convalida l'elemento nel contesto corrente con i valori degli attributi **xsi:Type**, **xsi:Nil**, **xsi:SchemaLocation** e **xsi:NoNamespaceSchemaLocation** specificati. |
| [ValidateEndElement](./validateendelement/)(const SharedPtr\<XmlSchemaInfo\>\&) | Verifica se il contenuto testuale dell'elemento è valido in base al suo tipo di dati per gli elementi con contenuto semplice, e verifica se il contenuto dell'elemento corrente è completo per gli elementi con contenuto complesso. |
| [ValidateEndElement](./validateendelement/)(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) | Verifica se il contenuto testuale dell'elemento specificato è valido in base al suo tipo di dati. |
| [ValidateEndOfAttributes](./validateendofattributes/)(const SharedPtr\<XmlSchemaInfo\>\&) | Verifica se tutti gli attributi richiesti nel contesto dell'elemento sono presenti e prepara l'oggetto [XmlSchemaValidator](./) per convalidare il contenuto figlio dell'elemento. |
| [ValidateText](./validatetext/)(const String\&) | Convalida se la **string** di testo specificata è consentita nel contesto dell'elemento corrente e accumula il testo per la convalida se l'elemento corrente ha contenuto semplice. |
| [ValidateText](./validatetext/)(XmlValueGetter) | Convalida se il testo restituito dall'oggetto [XmlValueGetter](../xmlvaluegetter/) specificato è consentito nel contesto dell'elemento corrente e accumula il testo per la convalida se l'elemento corrente ha contenuto semplice. |
| [ValidateWhitespace](./validatewhitespace/)(const String\&) | Convalida se lo spazio bianco nella **string** specificata è consentito nel contesto dell'elemento corrente e accumula lo spazio bianco per la convalida se l'elemento corrente ha contenuto semplice. |
| [ValidateWhitespace](./validatewhitespace/)(XmlValueGetter) | Convalida se lo spazio bianco restituito dall'oggetto [XmlValueGetter](../xmlvaluegetter/) specificato è consentito nel contesto dell'elemento corrente e accumula lo spazio bianco per la convalida se l'elemento corrente ha contenuto semplice. |
| [XmlSchemaValidator](./xmlschemavalidator/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlSchemaSet\>\&, const SharedPtr\<IXmlNamespaceResolver\>\&, XmlSchemaValidationFlags) | Inizializza una nuova istanza della classe [XmlSchemaValidator](./). |
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
