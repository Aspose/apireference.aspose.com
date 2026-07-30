---
title: "Classe System::Xml::XmlTextReader"
linktitle: "XmlTextReader"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::XmlTextReader. Rappresenta un lettore che fornisce un accesso veloce, non memorizzato nella cache e solo in avanti ai dati XML in C++."
type: docs
weight: 3900
url: /it/cpp/system.xml/xmltextreader/
---
## XmlTextReader class


Rappresenta un lettore che fornisce un accesso rapido, non memorizzato nella cache e solo in avanti ai dati XML.

```cpp
class XmlTextReader : public System::Xml::XmlReader,
                      public System::Xml::IXmlLineInfo,
                      public System::Xml::IXmlNamespaceResolver
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Close](./close/)() override | Modifica il [XmlReader::get_ReadState](../xmlreader/get_readstate/) in **Closed**. |
| [get_AttributeCount](./get_attributecount/)() override | Restituisce il numero di attributi nel nodo corrente. |
| [get_BaseURI](./get_baseuri/)() override | Restituisce l'URI di base del nodo corrente. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | Restituisce un valore che indica se il [XmlTextReader](./) implementa i metodi di lettura del contenuto binario. |
| [get_CanReadValueChunk](./get_canreadvaluechunk/)() override | Restituisce un valore che indica se il [XmlTextReader](./) implementa il metodo [XmlReader::ReadValueChunk](../xmlreader/readvaluechunk/). |
| [get_CanResolveEntity](./get_canresolveentity/)() override | Restituisce un valore che indica se questo lettore può analizzare e risolvere le entità. |
| [get_Depth](./get_depth/)() override | Restituisce la profondità del nodo corrente nel documento XML. |
| [get_DtdProcessing](./get_dtdprocessing/)() | Restituisce l'enumerazione [DtdProcessing](../dtdprocessing/). |
| [get_Encoding](./get_encoding/)() | Restituisce la codifica del documento. |
| [get_EntityHandling](./get_entityhandling/)() | Restituisce un valore che specifica come il lettore gestisce le entità. |
| [get_EOF](./get_eof/)() override | Restituisce un valore che indica se il lettore è posizionato alla fine del flusso. |
| [get_HasValue](./get_hasvalue/)() override | Restituisce un valore che indica se il nodo corrente può avere un [XmlTextReader::get_Value](./get_value/) diverso da [String::Empty](../../system/string/empty/). |
| [get_IsDefault](./get_isdefault/)() override | Restituisce un valore che indica se il nodo corrente è un attributo generato dal valore predefinito definito nel DTD o nello schema. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | Restituisce un valore che indica se il nodo corrente è un elemento vuoto (ad esempio, **<MyElement/>**). |
| [get_LineNumber](./get_linenumber/)() override | Restituisce il numero di riga corrente. |
| [get_LinePosition](./get_lineposition/)() override | Restituisce la posizione di riga corrente. |
| [get_LocalName](./get_localname/)() override | Restituisce il nome locale del nodo corrente. |
| [get_Name](./get_name/)() override | Restituisce il nome qualificato del nodo corrente. |
| [get_Namespaces](./get_namespaces/)() | Restituisce un valore che indica se abilitare il supporto dei namespace. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Restituisce l'URI dello spazio dei nomi (come definito nella specifica W3C Namespace) del nodo su cui è posizionato il lettore. |
| [get_NameTable](./get_nametable/)() override | Restituisce la [XmlNameTable](../xmlnametable/) associata a questa implementazione. |
| [get_NodeType](./get_nodetype/)() override | Restituisce il tipo del nodo corrente. |
| [get_Normalization](./get_normalization/)() | Restituisce un valore che indica se normalizzare gli spazi bianchi e i valori degli attributi. |
| [get_Prefix](./get_prefix/)() override | Restituisce il prefisso dello spazio dei nomi associato al nodo corrente. |
| [get_ProhibitDtd](./get_prohibitdtd/)() | Restituisce un valore che indica se consentire l'elaborazione DTD. |
| [get_QuoteChar](./get_quotechar/)() override | Restituisce il carattere di virgolette usato per racchiudere il valore di un nodo attributo. |
| [get_ReadState](./get_readstate/)() override | Restituisce lo stato del lettore. |
| [get_Value](./get_value/)() override | Restituisce il valore di testo del nodo corrente. |
| [get_WhitespaceHandling](./get_whitespacehandling/)() | Restituisce un valore che specifica come vengono gestiti gli spazi bianchi. |
| [get_XmlLang](./get_xmllang/)() override | Restituisce l'ambito **xml:lang** corrente. |
| [get_XmlSpace](./get_xmlspace/)() override | Restituisce l'ambito **xml:space** corrente. |
| [GetAttribute](./getattribute/)(String) override | Restituisce il valore dell'attributo con il nome specificato. |
| [GetAttribute](./getattribute/)(String, String) override | Restituisce il valore dell'attributo con il nome locale e l'URI dello spazio dei nomi specificati. |
| [GetAttribute](./getattribute/)(int32_t) override | Restituisce il valore dell'attributo con l'indice specificato. |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | Restituisce una raccolta che contiene tutti gli spazi dei nomi attualmente in ambito. |
| [GetRemainder](./getremainder/)() | Restituisce il resto dell'XML bufferizzato. |
| [HasLineInfo](./haslineinfo/)() override | Restituisce un valore che indica se la classe può restituire informazioni sulla riga. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Risolvi un prefisso di spazio dei nomi nell'ambito dell'elemento corrente. |
| [MoveToAttribute](./movetoattribute/)(String) override | Si sposta sull'attributo con il nome specificato. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | Si sposta sull'attributo con il nome locale e l'URI dello spazio dei nomi specificati. |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | Si sposta sull'attributo con l'indice specificato. |
| [MoveToElement](./movetoelement/)() override | Si sposta sull'elemento che contiene il nodo attributo corrente. |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | Si sposta sul primo attributo. |
| [MoveToNextAttribute](./movetonextattribute/)() override | Si sposta sul prossimo attributo. |
| [Read](./read/)() override | Legge il nodo successivo dallo stream. |
| [ReadAttributeValue](./readattributevalue/)() override | Analizza il valore dell'attributo in uno o più nodi **[Text](../../system.text/)**, **EntityReference** o **EndEntity**. |
| [ReadBase64](./readbase64/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Decodifica Base64 e restituisce i byte binari decodificati. |
| [ReadBinHex](./readbinhex/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Decodifica **BinHex** e restituisce i byte binari decodificati. |
| [ReadChars](./readchars/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) | Legge il contenuto testuale di un elemento in un buffer di caratteri. Questo metodo è progettato per leggere grandi flussi di testo incorporato chiamandolo successivamente. |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Legge il contenuto e restituisce i byte binari decodificati **Base64**. |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Legge il contenuto e restituisce i byte binari decodificati **BinHex**. |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Legge l'elemento e decodifica il contenuto Base64. |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Legge l'elemento e decodifica il contenuto **BinHex**. |
| [ReadString](./readstring/)() override | Legge il contenuto di un elemento o di un nodo di testo come stringa. |
| [ResetState](./resetstate/)() | Reimposta lo stato del lettore a [ReadState::Initial](../readstate/). |
| [ResolveEntity](./resolveentity/)() override | Risolvi il riferimento dell'entità per i nodi **EntityReference**. |
| [set_DtdProcessing](./set_dtdprocessing/)(System::Xml::DtdProcessing) | Imposta l'enumerazione [DtdProcessing](../dtdprocessing/). |
| [set_EntityHandling](./set_entityhandling/)(System::Xml::EntityHandling) | Imposta un valore che specifica come il lettore gestisce le entità. |
| [set_Namespaces](./set_namespaces/)(bool) | Imposta un valore che indica se abilitare il supporto dei namespace. |
| [set_Normalization](./set_normalization/)(bool) | Imposta un valore che indica se normalizzare gli spazi bianchi e i valori degli attributi. |
| [set_ProhibitDtd](./set_prohibitdtd/)(bool) | Imposta un valore che indica se consentire l'elaborazione DTD. |
| [set_WhitespaceHandling](./set_whitespacehandling/)(System::Xml::WhitespaceHandling) | Imposta un valore che specifica come vengono gestiti gli spazi bianchi. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Imposta il [XmlResolver](../xmlresolver/) usato per risolvere i riferimenti DTD. |
| [Skip](./skip/)() override | Salta i figli del nodo corrente. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&) | Inizializza una nuova istanza della classe [XmlTextReader](./) con lo stream specificato. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::Stream\>\&) | Inizializza una nuova istanza della classe [XmlTextReader](./) con l'URL e lo stream specificati. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) | Inizializza una nuova istanza della classe [XmlTextReader](./) con lo stream specificato e [XmlNameTable](../xmlnametable/). |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) | Inizializza una nuova istanza della classe [XmlTextReader](./) con l'URL, lo stream e [XmlNameTable](../xmlnametable/) specificati. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::TextReader\>\&) | Inizializza una nuova istanza della classe [XmlTextReader](./) con il TextReader specificato. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::TextReader\>\&) | Inizializza una nuova istanza della classe [XmlTextReader](./) con l'URL e il TextReader specificati. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) | Inizializza una nuova istanza della classe [XmlTextReader](./) con il TextReader specificato e [XmlNameTable](../xmlnametable/). |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) | Inizializza una nuova istanza della classe [XmlTextReader](./) con l'URL, il TextReader e [XmlNameTable](../xmlnametable/) specificati. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Inizializza una nuova istanza della classe [XmlTextReader](./) con lo stream specificato, [XmlNodeType](../xmlnodetype/) e [XmlParserContext](../xmlparsercontext/). |
| [XmlTextReader](./xmltextreader/)(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Inizializza una nuova istanza della classe [XmlTextReader](./) con la stringa specificata, [XmlNodeType](../xmlnodetype/) e [XmlParserContext](../xmlparsercontext/). |
| [XmlTextReader](./xmltextreader/)(const String\&) | Inizializza una nuova istanza della classe [XmlTextReader](./) con il file specificato. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<XmlNameTable\>\&) | Inizializza una nuova istanza della classe [XmlTextReader](./) con il file specificato e [XmlNameTable](../xmlnametable/). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Si consiglia di utilizzare la classe [XmlReader](../xmlreader/) invece.

Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlReader](../xmlreader/)
* Class [IXmlLineInfo](../ixmllineinfo/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
