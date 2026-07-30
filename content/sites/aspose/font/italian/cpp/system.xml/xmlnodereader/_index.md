---
title: "Classe System::Xml::XmlNodeReader"
linktitle: "XmlNodeReader"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::XmlNodeReader. Rappresenta un lettore che fornisce un accesso rapido, non memorizzato nella cache e solo in avanti ai dati XML in un XmlNode in C++."
type: docs
weight: 2800
url: /it/cpp/system.xml/xmlnodereader/
---
## XmlNodeReader class


Rappresenta un lettore che fornisce un accesso rapido, non memorizzato nella cache e solo in avanti ai dati XML in un [XmlNode](../xmlnode/).

```cpp
class XmlNodeReader : public System::Xml::XmlReader,
                      public System::Xml::IXmlNamespaceResolver
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Close](./close/)() override | Modifica il [XmlNodeReader::get_ReadState](./get_readstate/) in [ReadState::Closed](../readstate/). |
| [get_AttributeCount](./get_attributecount/)() override | Restituisce il numero di attributi nel nodo corrente. |
| [get_BaseURI](./get_baseuri/)() override | Restituisce l'URI di base del nodo corrente. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | Restituisce un valore che indica se il [XmlNodeReader](./) implementa i metodi di lettura del contenuto binario. |
| [get_CanResolveEntity](./get_canresolveentity/)() override | Restituisce un valore che indica se questo lettore può analizzare e risolvere le entità. |
| [get_Depth](./get_depth/)() override | Restituisce la profondità del nodo corrente nel documento XML. |
| [get_EOF](./get_eof/)() override | Restituisce un valore che indica se il lettore è posizionato alla fine del flusso. |
| [get_HasAttributes](./get_hasattributes/)() override | Restituisce un valore che indica se il nodo corrente ha attributi. |
| [get_HasValue](./get_hasvalue/)() override | Restituisce un valore che indica se il nodo corrente può avere un valore [XmlNodeReader::get_Value](./get_value/). |
| [get_IsDefault](./get_isdefault/)() override | Restituisce un valore che indica se il nodo corrente è un attributo generato dal valore predefinito definito nella definizione del tipo di documento (DTD) o nello schema. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | Restituisce un valore che indica se il nodo corrente è un elemento vuoto (ad esempio, **<MyElement/>**). |
| [get_LocalName](./get_localname/)() override | Restituisce il nome locale del nodo corrente. |
| [get_Name](./get_name/)() override | Restituisce il nome qualificato del nodo corrente. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Restituisce l'URI dello spazio dei nomi (come definito nella specifica W3C Namespace) del nodo su cui è posizionato il lettore. |
| [get_NameTable](./get_nametable/)() override | Restituisce la [XmlNameTable](../xmlnametable/) associata a questa implementazione. |
| [get_NodeType](./get_nodetype/)() override | Restituisce il tipo del nodo corrente. |
| [get_Prefix](./get_prefix/)() override | Restituisce il prefisso dello spazio dei nomi associato al nodo corrente. |
| [get_ReadState](./get_readstate/)() override | Restituisce lo stato del lettore. |
| [get_SchemaInfo](./get_schemainfo/)() override | Restituisce le informazioni di schema che sono state assegnate al nodo corrente. |
| [get_Value](./get_value/)() override | Restituisce il valore di testo del nodo corrente. |
| [get_XmlLang](./get_xmllang/)() override | Restituisce l'ambito **xml:lang** corrente. |
| [get_XmlSpace](./get_xmlspace/)() override | Restituisce l'ambito **xml:space** corrente. |
| [GetAttribute](./getattribute/)(String) override | Restituisce il valore dell'attributo con il nome specificato. |
| [GetAttribute](./getattribute/)(String, String) override | Restituisce il valore dell'attributo con il nome locale e l'URI dello spazio dei nomi specificati. |
| [GetAttribute](./getattribute/)(int32_t) override | Restituisce il valore dell'attributo con l'indice specificato. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Risolvi un prefisso di spazio dei nomi nell'ambito dell'elemento corrente. |
| [MoveToAttribute](./movetoattribute/)(String) override | Si sposta sull'attributo con il nome specificato. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | Si sposta sull'attributo con il nome locale e l'URI dello spazio dei nomi specificati. |
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
| [ResolveEntity](./resolveentity/)() override | Risolvi il riferimento dell'entità per i nodi **EntityReference**. |
| [Skip](./skip/)() override | Salta i figli del nodo corrente. |
| [XmlNodeReader](./xmlnodereader/)(const SharedPtr\<XmlNode\>\&) | Crea un'istanza della classe [XmlNodeReader](./) utilizzando il [XmlNode](../xmlnode/) specificato. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlReader](../xmlreader/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
