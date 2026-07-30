---
title: "System::Xml::XmlValidatingReader class"
linktitle: "XmlValidatingReader"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlValidatingReader class. Rappresenta un lettore che fornisce la validazione della definizione del tipo di documento (DTD), dello schema XML-Data Reduced (XDR) e del linguaggio di definizione dello schema XML (XSD) in C++."
type: docs
weight: 4200
url: /it/cpp/system.xml/xmlvalidatingreader/
---
## XmlValidatingReader class


Rappresenta un lettore che fornisce la validazione della definizione del tipo di documento (DTD), dello schema XML-Data Reduced (XDR) e del linguaggio di definizione dello [Schema](../../system.xml.schema/) XML (XSD).

```cpp
class XmlValidatingReader : public System::Xml::XmlReader,
                            public System::Xml::IXmlLineInfo,
                            public System::Xml::IXmlNamespaceResolver
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Close](./close/)() override | Modifica il [XmlReader::get_ReadState](../xmlreader/get_readstate/) in Closed. |
| [get_AttributeCount](./get_attributecount/)() override | Restituisce il numero di attributi nel nodo corrente. |
| [get_BaseURI](./get_baseuri/)() override | Restituisce l'URI di base del nodo corrente. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | Restituisce un valore che indica se il [XmlValidatingReader](./) implementa i metodi di lettura del contenuto binario. |
| [get_CanResolveEntity](./get_canresolveentity/)() override | Restituisce un valore che indica se questo lettore può analizzare e risolvere le entità. |
| [get_Depth](./get_depth/)() override | Restituisce la profondità del nodo corrente nel documento XML. |
| [get_Encoding](./get_encoding/)() | Restituisce l'attributo di codifica per il documento. |
| [get_EntityHandling](./get_entityhandling/)() | Restituisce un valore che specifica come il lettore gestisce le entità. |
| [get_EOF](./get_eof/)() override | Restituisce un valore che indica se il lettore è posizionato alla fine del flusso. |
| [get_HasValue](./get_hasvalue/)() override | Restituisce un valore che indica se il nodo corrente può avere un [XmlValidatingReader::get_Value](./get_value/) diverso da [String::Empty](../../system/string/empty/). |
| [get_IsDefault](./get_isdefault/)() override | Restituisce un valore che indica se il nodo corrente è un attributo generato dal valore predefinito definito nella definizione del tipo di documento (DTD) o nello schema. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | Restituisce un valore che indica se il nodo corrente è un elemento vuoto (ad esempio, **<MyElement/>**). |
| [get_LineNumber](./get_linenumber/)() override | Restituisce il numero di riga corrente. |
| [get_LinePosition](./get_lineposition/)() override | Restituisce la posizione di riga corrente. |
| [get_LocalName](./get_localname/)() override | Restituisce il nome locale del nodo corrente. |
| [get_Name](./get_name/)() override | Restituisce il nome qualificato del nodo corrente. |
| [get_Namespaces](./get_namespaces/)() | Restituisce un valore che indica se abilitare il supporto dei namespace. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Restituisce l'Uniform Resource Identifier (URI) dello spazio dei nomi (come definito nella specifica del World Wide [Web](../../system.web/) Consortium (W3C) Namespace) del nodo su cui è posizionato il lettore. |
| [get_NameTable](./get_nametable/)() override | Restituisce la [XmlNameTable](../xmlnametable/) associata a questa implementazione. |
| [get_NodeType](./get_nodetype/)() override | Restituisce il tipo del nodo corrente. |
| [get_Prefix](./get_prefix/)() override | Restituisce il prefisso dello spazio dei nomi associato al nodo corrente. |
| [get_QuoteChar](./get_quotechar/)() override | Restituisce il carattere di virgolette usato per racchiudere il valore di un nodo attributo. |
| [get_Reader](./get_reader/)() | Restituisce il [XmlReader](../xmlreader/) usato per costruire questo [XmlValidatingReader](./). |
| [get_ReadState](./get_readstate/)() override | Restituisce lo stato del lettore. |
| [get_Schemas](./get_schemas/)() | Restituisce una XmlSchemaCollection da utilizzare per la convalida. |
| [get_SchemaType](./get_schematype/)() | Restituisce un oggetto di tipo schema. |
| [get_ValidationType](./get_validationtype/)() | Restituisce un valore che indica il tipo di convalida da eseguire. |
| [get_Value](./get_value/)() override | Restituisce il valore di testo del nodo corrente. |
| [get_XmlLang](./get_xmllang/)() override | Restituisce l'ambito **xml:lang** corrente. |
| [get_XmlSpace](./get_xmlspace/)() override | Restituisce l'ambito **xml:space** corrente. |
| [GetAttribute](./getattribute/)(String) override | Restituisce il valore dell'attributo con il nome specificato. |
| [GetAttribute](./getattribute/)(String, String) override | Restituisce il valore dell'attributo con il nome locale e l'Uniform Resource Identifier (URI) dello spazio dei nomi specificati. |
| [GetAttribute](./getattribute/)(int32_t) override | Restituisce il valore dell'attributo con l'indice specificato. |
| [HasLineInfo](./haslineinfo/)() override | Restituisce un valore che indica se la classe può restituire informazioni sulla riga. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Risolvi un prefisso di spazio dei nomi nell'ambito dell'elemento corrente. |
| [MoveToAttribute](./movetoattribute/)(String) override | Si sposta sull'attributo con il nome specificato. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | Si sposta sull'attributo con il nome locale e l'Uniform Resource Identifier (URI) dello spazio dei nomi specificati. |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | Si sposta sull'attributo con l'indice specificato. |
| [MoveToElement](./movetoelement/)() override | Si sposta sull'elemento che contiene il nodo attributo corrente. |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | Si sposta sul primo attributo. |
| [MoveToNextAttribute](./movetonextattribute/)() override | Si sposta sul prossimo attributo. |
| [Read](./read/)() override | Legge il nodo successivo dallo stream. |
| [ReadAttributeValue](./readattributevalue/)() override | Analizza il valore dell'attributo in uno o più nodi **[Text](../../system.text/)**, **EntityReference** o **EndEntity**. |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Legge il contenuto e restituisce i byte binari decodificati in Base64. |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Legge il contenuto e restituisce i byte binari decodificati in BinHex. |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Legge l'elemento e decodifica il contenuto Base64. |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Legge l'elemento e decodifica il contenuto BinHex. |
| [ReadString](./readstring/)() override | Legge il contenuto di un elemento o di un nodo di testo come stringa. |
| [ReadTypedValue](./readtypedvalue/)() | Restituisce il tipo di runtime per il tipo di linguaggio di definizione XML [Schema](../../system.xml.schema/) (XSD) specificato. |
| [ResolveEntity](./resolveentity/)() override | Risolvi il riferimento dell'entità per i nodi **EntityReference**. |
| [set_EntityHandling](./set_entityhandling/)(System::Xml::EntityHandling) | Imposta un valore che specifica come il lettore gestisce le entità. |
| [set_Namespaces](./set_namespaces/)(bool) | Imposta un valore che indica se abilitare il supporto dei namespace. |
| [set_ValidationType](./set_validationtype/)(System::Xml::ValidationType) | Imposta un valore che indica il tipo di convalida da eseguire. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Imposta il [XmlResolver](../xmlresolver/) usato per risolvere le definizioni di tipo di documento esterne (DTD) e i riferimenti di posizione dello schema. Il [XmlResolver](../xmlresolver/) è anche utilizzato per gestire eventuali elementi import o include presenti negli schemi XML [Schema](../../system.xml.schema/) (XSD). |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | Aggiunge un gestore di eventi per ricevere informazioni sugli errori di convalida dei documenti di tipo (DTD), degli schemi XML-Data Reduced (XDR) e degli schemi XML [Schema](../../system.xml.schema/) (XSD). |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | Rimuove un gestore di eventi per ricevere informazioni sugli errori di convalida dei documenti di tipo (DTD), degli schemi XML-Data Reduced (XDR) e degli schemi XML [Schema](../../system.xml.schema/) (XSD). |
| [XmlValidatingReader](./xmlvalidatingreader/)(const SharedPtr\<XmlReader\>\&) | Inizializza una nuova istanza della classe [XmlValidatingReader](./) che convalida il contenuto restituito dal [XmlReader](../xmlreader/) fornito. |
| [XmlValidatingReader](./xmlvalidatingreader/)(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Inizializza una nuova istanza della classe [XmlValidatingReader](./) con i valori specificati. |
| [XmlValidatingReader](./xmlvalidatingreader/)(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Inizializza una nuova istanza della classe [XmlValidatingReader](./) con i valori specificati. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni


## Deprecated
Questa classe è obsoleta. Si consiglia di utilizzare la classe XmlReaderSettings e il metodo XmlReader::Create per creare un lettore XML di convalida.

Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlReader](../xmlreader/)
* Class [IXmlLineInfo](../ixmllineinfo/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
