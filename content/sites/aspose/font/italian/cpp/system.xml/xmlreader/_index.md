---
title: "Classe System::Xml::XmlReader"
linktitle: "XmlReader"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::XmlReader. Rappresenta un lettore che fornisce un accesso rapido, non memorizzato nella cache e solo in avanti ai dati XML in C++."
type: docs
weight: 3300
url: /it/cpp/system.xml/xmlreader/
---
## XmlReader class


Rappresenta un lettore che fornisce un accesso rapido, non memorizzato nella cache e solo in avanti ai dati XML.

```cpp
class XmlReader : public System::IDisposable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Close](./close/)() | Quando sovrascritto in una classe derivata, modifica il [XmlReader::get_ReadState](./get_readstate/) in [ReadState::Closed](../readstate/). |
| static [Create](./create/)(const String\&) | Crea una nuova istanza di [XmlReader](./) con l'URI specificato. |
| static [Create](./create/)(const String\&, const SharedPtr\<XmlReaderSettings\>\&) | Crea una nuova istanza di [XmlReader](./) utilizzando l'URI e le impostazioni specificati. |
| static [Create](./create/)(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Crea una nuova istanza di [XmlReader](./) utilizzando l'URI, le impostazioni e le informazioni di contesto specificate per l'analisi. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | Crea una nuova istanza di [XmlReader](./) usando lo stream specificato con le impostazioni predefinite. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) | Crea una nuova istanza di [XmlReader](./) con lo stream e le impostazioni specificati. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | Crea una nuova istanza di [XmlReader](./) usando lo stream specificato, l'URI di base e le impostazioni. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Crea una nuova istanza di [XmlReader](./) usando lo stream, le impostazioni e le informazioni di contesto specificate per l'analisi. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&) | Crea una nuova istanza di [XmlReader](./) utilizzando il lettore di testo specificato. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) | Crea una nuova istanza di [XmlReader](./) utilizzando il lettore di testo e le impostazioni specificati. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | Crea una nuova istanza di [XmlReader](./) utilizzando il lettore di testo, le impostazioni e l'URI di base specificati. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Crea una nuova istanza di [XmlReader](./) utilizzando il lettore di testo, le impostazioni e le informazioni di contesto specificate per l'analisi. |
| static [Create](./create/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) | Crea una nuova istanza di [XmlReader](./) utilizzando il lettore XML e le impostazioni specificati. |
| [Dispose](./dispose/)() override | Rilascia tutte le risorse utilizzate dall'istanza corrente della classe [XmlReader](./). |
| virtual [get_AttributeCount](./get_attributecount/)() | Quando sovrascritto in una classe derivata, restituisce il numero di attributi nel nodo corrente. |
| virtual [get_BaseURI](./get_baseuri/)() | Quando sovrascritto in una classe derivata, ottiene l'URI di base del nodo corrente. |
| virtual [get_CanReadBinaryContent](./get_canreadbinarycontent/)() | Restituisce un valore che indica se il [XmlReader](./) implementa i metodi di lettura del contenuto binario. |
| virtual [get_CanReadValueChunk](./get_canreadvaluechunk/)() | Restituisce un valore che indica se il [XmlReader](./) implementa il metodo [XmlReader::ReadValueChunk](./readvaluechunk/). |
| virtual [get_CanResolveEntity](./get_canresolveentity/)() | Restituisce un valore che indica se questo lettore può analizzare e risolvere le entità. |
| virtual [get_Depth](./get_depth/)() | Quando sovrascritto in una classe derivata, ottiene la profondità del nodo corrente nel documento XML. |
| virtual [get_EOF](./get_eof/)() | Quando sovrascritto in una classe derivata, ottiene un valore che indica se il lettore è posizionato alla fine del flusso. |
| virtual [get_HasAttributes](./get_hasattributes/)() | Restituisce un valore che indica se il nodo corrente ha attributi. |
| virtual [get_HasValue](./get_hasvalue/)() | Quando sovrascritto in una classe derivata, ottiene un valore che indica se il nodo corrente può avere un valore [XmlReader::get_Value](./get_value/). |
| virtual [get_IsDefault](./get_isdefault/)() | Quando sovrascritto in una classe derivata, ottiene un valore che indica se il nodo corrente è un attributo generato dal valore predefinito definito nel DTD o nello schema. |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | Quando sovrascritto in una classe derivata, ottiene un valore che indica se il nodo corrente è un elemento vuoto (ad esempio, **<MyElement/>**). |
| virtual [get_LocalName](./get_localname/)() | Quando sovrascritto in una classe derivata, ottiene il nome locale del nodo corrente. |
| virtual [get_Name](./get_name/)() | Quando sovrascritto in una classe derivata, ottiene il nome qualificato del nodo corrente. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | Quando sovrascritto in una classe derivata, ottiene l'URI dello spazio dei nomi (come definito nella specifica W3C Namespace) del nodo su cui è posizionato il lettore. |
| virtual [get_NameTable](./get_nametable/)() | Quando sovrascritto in una classe derivata, ottiene il [XmlNameTable](../xmlnametable/) associato a questa implementazione. |
| virtual [get_NodeType](./get_nodetype/)() | Quando sovrascritto in una classe derivata, ottiene il tipo del nodo corrente. |
| virtual [get_Prefix](./get_prefix/)() | Quando sovrascritto in una classe derivata, ottiene il prefisso dello spazio dei nomi associato al nodo corrente. |
| virtual [get_QuoteChar](./get_quotechar/)() | Quando sovrascritto in una classe derivata, ottiene il carattere di virgolette usato per racchiudere il valore di un nodo attributo. |
| virtual [get_ReadState](./get_readstate/)() | Quando sovrascritto in una classe derivata, ottiene lo stato del lettore. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | Restituisce le informazioni dello schema che sono state assegnate al nodo corrente a seguito della convalida dello schema. |
| virtual [get_Settings](./get_settings/)() | Restituisce l'oggetto [XmlReaderSettings](../xmlreadersettings/) utilizzato per creare questa istanza di [XmlReader](./). |
| virtual [get_Value](./get_value/)() | Quando sovrascritto in una classe derivata, ottiene il valore di testo del nodo corrente. |
| virtual [get_ValueType](./get_valuetype/)() | Restituisce il tipo per il nodo corrente. |
| virtual [get_XmlLang](./get_xmllang/)() | Quando sovrascritto in una classe derivata, ottiene l'ambito **xml:lang** corrente. |
| virtual [get_XmlSpace](./get_xmlspace/)() | Quando sovrascritto in una classe derivata, ottiene l'ambito **xml:space** corrente. |
| virtual [GetAttribute](./getattribute/)(String) | Quando sovrascritto in una classe derivata, ottiene il valore dell'attributo con il valore [XmlReader::get_Name](./get_name/) specificato. |
| virtual [GetAttribute](./getattribute/)(String, String) | Quando sovrascritto in una classe derivata, ottiene il valore dell'attributo con i valori [XmlReader::get_LocalName](./get_localname/) e [XmlReader::get_NamespaceURI](./get_namespaceuri/) specificati. |
| virtual [GetAttribute](./getattribute/)(int32_t) | Quando sovrascritto in una classe derivata, ottiene il valore dell'attributo con l'indice specificato. |
| virtual [idx_get](./idx_get/)(int32_t) | Quando sovrascritto in una classe derivata, ottiene il valore dell'attributo con l'indice specificato. |
| virtual [idx_get](./idx_get/)(String) | Quando sovrascritto in una classe derivata, ottiene il valore dell'attributo con il valore [XmlReader::get_Name](./get_name/) specificato. |
| virtual [idx_get](./idx_get/)(String, String) | Quando sovrascritto in una classe derivata, ottiene il valore dell'attributo con i valori [XmlReader::get_LocalName](./get_localname/) e [XmlReader::get_NamespaceURI](./get_namespaceuri/) specificati. |
| static [IsName](./isname/)(const String\&) | Restituisce un valore che indica se l'argomento stringa è un nome XML valido. |
| static [IsNameToken](./isnametoken/)(const String\&) | Restituisce un valore che indica se l'argomento stringa è o meno un token di nome XML valido. |
| virtual [IsStartElement](./isstartelement/)() | Chiama [XmlReader::MoveToContent](./movetocontent/) e verifica se il nodo di contenuto corrente è un tag di apertura o un tag di elemento vuoto. |
| virtual [IsStartElement](./isstartelement/)(String) | Chiama [XmlReader::MoveToContent](./movetocontent/) e verifica se il nodo di contenuto corrente è un tag di apertura o un tag di elemento vuoto e se il valore [XmlReader::get_Name](./get_name/) dell'elemento trovato corrisponde all'argomento fornito. |
| virtual [IsStartElement](./isstartelement/)(String, String) | Chiama [XmlReader::MoveToContent](./movetocontent/) e verifica se il nodo di contenuto corrente è un tag di apertura o un tag di elemento vuoto e se i valori [XmlReader::get_LocalName](./get_localname/) e [XmlReader::get_NamespaceURI](./get_namespaceuri/) dell'elemento trovato corrispondono alle stringhe fornite. |
| virtual [LookupNamespace](./lookupnamespace/)(const String\&) | Quando sovrascritto in una classe derivata, risolve un prefisso di spazio dei nomi nell'ambito dell'elemento corrente. |
| virtual [MoveToAttribute](./movetoattribute/)(String) | Quando sovrascritto in una classe derivata, si sposta sull'attributo con il valore [XmlReader::get_Name](./get_name/) specificato. |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | Quando sovrascritto in una classe derivata, si sposta sull'attributo con i valori [XmlReader::get_LocalName](./get_localname/) e [XmlReader::get_NamespaceURI](./get_namespaceuri/) specificati. |
| virtual [MoveToAttribute](./movetoattribute/)(int32_t) | Quando sovrascritto in una classe derivata, si sposta sull'attributo con l'indice specificato. |
| virtual [MoveToContent](./movetocontent/)() | Verifica se il nodo corrente è un nodo di contenuto (testo non bianco, **CDATA**, **Element**, **EndElement**, **EntityReference** o **EndEntity**). Se il nodo non è un nodo di contenuto, il lettore salta al nodo di contenuto successivo o alla fine del file. Salta i nodi dei seguenti tipi: **ProcessingInstruction**, **DocumentType**, **Comment**, **Whitespace** o **SignificantWhitespace**. |
| virtual [MoveToElement](./movetoelement/)() | Quando sovrascritto in una classe derivata, si sposta sull'elemento che contiene il nodo attributo corrente. |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | Quando sovrascritto in una classe derivata, si sposta sul primo attributo. |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | Quando sovrascritto in una classe derivata, si sposta sull'attributo successivo. |
| virtual [Read](./read/)() | Quando sovrascritto in una classe derivata, legge il nodo successivo dallo stream. |
| virtual [ReadAttributeValue](./readattributevalue/)() | Quando sovrascritto in una classe derivata, analizza il valore dell'attributo in uno o più nodi **[Text](../../system.text/)**, **EntityReference** o **EndEntity**. |
| virtual [ReadContentAs](./readcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Legge il contenuto come un oggetto del tipo specificato. |
| virtual [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Legge il contenuto e restituisce i byte binari decodificati in Base64. |
| virtual [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Legge il contenuto e restituisce i byte binari decodificati **BinHex**. |
| virtual [ReadContentAsBoolean](./readcontentasboolean/)() | Legge il contenuto testuale nella posizione corrente come un [Boolean](../../system/boolean/). |
| virtual [ReadContentAsDateTime](./readcontentasdatetime/)() | Legge il contenuto testuale nella posizione corrente come un oggetto [DateTime](../../system/datetime/). |
| virtual [ReadContentAsDateTimeOffset](./readcontentasdatetimeoffset/)() | Legge il contenuto testuale nella posizione corrente come un oggetto [DateTimeOffset](../../system/datetimeoffset/). |
| virtual [ReadContentAsDecimal](./readcontentasdecimal/)() | Legge il contenuto testuale nella posizione corrente come un oggetto [Decimal](../../system/decimal/). |
| virtual [ReadContentAsDouble](./readcontentasdouble/)() | Legge il contenuto testuale nella posizione corrente come un numero a virgola mobile a doppia precisione. |
| virtual [ReadContentAsFloat](./readcontentasfloat/)() | Legge il contenuto testuale nella posizione corrente come un numero a virgola mobile a precisione singola. |
| virtual [ReadContentAsInt](./readcontentasint/)() | Legge il contenuto testuale nella posizione corrente come un intero con segno a 32 bit. |
| virtual [ReadContentAsLong](./readcontentaslong/)() | Legge il contenuto testuale nella posizione corrente come un intero con segno a 64 bit. |
| virtual [ReadContentAsObject](./readcontentasobject/)() | Legge il contenuto testuale nella posizione corrente come un [Object](../../system/object/). |
| virtual [ReadContentAsString](./readcontentasstring/)() | Legge il contenuto di testo nella posizione corrente come un oggetto [String](../../system/string/). |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Legge il contenuto dell'elemento come il tipo richiesto. |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) | Verifica che il nome locale e l'URI dello spazio dei nomi specificati corrispondano a quelli dell'elemento corrente, quindi legge il contenuto dell'elemento come il tipo richiesto. |
| virtual [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Legge l'elemento e decodifica il contenuto **Base64**. |
| virtual [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Legge l'elemento e decodifica il contenuto **BinHex**. |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)() | Legge l'elemento corrente e restituisce il contenuto come un oggetto [Boolean](../../system/boolean/). |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)(String, String) | Verifica che il nome locale e l'URI dello spazio dei nomi specificati corrispondano a quelli dell'elemento corrente, quindi legge l'elemento corrente e restituisce il contenuto come un oggetto [Boolean](../../system/boolean/). |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)() | Legge l'elemento corrente e restituisce il contenuto come un oggetto [DateTime](../../system/datetime/). |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)(String, String) | Verifica che il nome locale e l'URI dello spazio dei nomi specificati corrispondano a quelli dell'elemento corrente, quindi legge l'elemento corrente e restituisce il contenuto come un oggetto [DateTime](../../system/datetime/). |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)() | Legge l'elemento corrente e restituisce il contenuto come un oggetto [Decimal](../../system/decimal/). |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)(String, String) | Verifica che il nome locale e l'URI dello spazio dei nomi specificati corrispondano a quelli dell'elemento corrente, quindi legge l'elemento corrente e restituisce il contenuto come un oggetto [Decimal](../../system/decimal/). |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)() | Legge l'elemento corrente e restituisce il contenuto come un numero a virgola mobile a doppia precisione. |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)(String, String) | Verifica che il nome locale e l'URI dello spazio dei nomi specificati corrispondano a quelli dell'elemento corrente, quindi legge l'elemento corrente e restituisce il contenuto come un numero a virgola mobile a doppia precisione. |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)() | Legge l'elemento corrente e restituisce il contenuto come un numero a virgola mobile a precisione singola. |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)(String, String) | Verifica che il nome locale e l'URI dello spazio dei nomi specificati corrispondano a quelli dell'elemento corrente, quindi legge l'elemento corrente e restituisce il contenuto come un numero a virgola mobile a precisione singola. |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)() | Legge l'elemento corrente e restituisce il contenuto come un intero con segno a 32 bit. |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)(String, String) | Verifica che il nome locale e l'URI dello spazio dei nomi specificati corrispondano a quelli dell'elemento corrente, quindi legge l'elemento corrente e restituisce il contenuto come un intero con segno a 32 bit. |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)() | Legge l'elemento corrente e restituisce il contenuto come un intero con segno a 64 bit. |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)(String, String) | Verifica che il nome locale e l'URI dello spazio dei nomi specificati corrispondano a quelli dell'elemento corrente, quindi legge l'elemento corrente e restituisce il contenuto come un intero con segno a 64 bit. |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)() | Legge l'elemento corrente e restituisce il contenuto come un [Object](../../system/object/). |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)(String, String) | Verifica che il nome locale e l'URI dello spazio dei nomi specificati corrispondano a quelli dell'elemento corrente, quindi legge l'elemento corrente e restituisce il contenuto come un [Object](../../system/object/). |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)() | Legge l'elemento corrente e restituisce il contenuto come un oggetto [String](../../system/string/). |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)(String, String) | Verifica che il nome locale e l'URI dello spazio dei nomi specificati corrispondano a quelli dell'elemento corrente, quindi legge l'elemento corrente e restituisce il contenuto come un oggetto [String](../../system/string/). |
| virtual [ReadElementString](./readelementstring/)() | Legge un elemento solo di testo. Tuttavia, è consigliato utilizzare il metodo [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) invece, poiché offre un modo più semplice per gestire questa operazione. |
| virtual [ReadElementString](./readelementstring/)(String) | Verifica che il valore [XmlReader::get_Name](./get_name/) dell'elemento trovato corrisponda alla stringa fornita prima di leggere un elemento solo di testo. Tuttavia, è consigliato utilizzare il metodo [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) invece, poiché offre un modo più semplice per gestire questa operazione. |
| virtual [ReadElementString](./readelementstring/)(String, String) | Verifica che i valori [XmlReader::get_LocalName](./get_localname/) e [XmlReader::get_NamespaceURI](./get_namespaceuri/) dell'elemento trovato corrispondano alle stringhe fornite prima di leggere un elemento solo di testo. Tuttavia, è consigliato utilizzare il metodo [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) invece, poiché offre un modo più semplice per gestire questa operazione. |
| virtual [ReadEndElement](./readendelement/)() | Verifica che il nodo di contenuto corrente sia un tag di chiusura e avanza il lettore al nodo successivo. |
| virtual [ReadInnerXml](./readinnerxml/)() | Quando sovrascritto in una classe derivata, legge tutto il contenuto, inclusi i markup, come una stringa. |
| virtual [ReadOuterXml](./readouterxml/)() | Quando sovrascritto in una classe derivata, legge il contenuto, inclusi i markup, che rappresenta questo nodo e tutti i suoi figli. |
| virtual [ReadStartElement](./readstartelement/)() | Verifica che il nodo corrente sia un elemento e avanza il lettore al nodo successivo. |
| virtual [ReadStartElement](./readstartelement/)(String) | Verifica che il nodo di contenuto corrente sia un elemento con il valore [XmlReader::get_Name](./get_name/) fornito e avanza il lettore al nodo successivo. |
| virtual [ReadStartElement](./readstartelement/)(String, String) | Verifica che il nodo di contenuto corrente sia un elemento con i valori [XmlReader::get_LocalName](./get_localname/) e [XmlReader::get_NamespaceURI](./get_namespaceuri/) forniti e avanza il lettore al nodo successivo. |
| virtual [ReadString](./readstring/)() | Quando sovrascritto in una classe derivata, legge il contenuto di un elemento o di un nodo di testo come una stringa. Tuttavia, è consigliato utilizzare il metodo [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) invece, poiché offre un modo più semplice per gestire questa operazione. |
| virtual [ReadSubtree](./readsubtree/)() | Restituisce una nuova istanza di [XmlReader](./) che può essere usata per leggere il nodo corrente e tutti i suoi discendenti. |
| virtual [ReadToDescendant](./readtodescendant/)(String) | Avanza il [XmlReader](./) al prossimo elemento discendente con il nome qualificato specificato. |
| virtual [ReadToDescendant](./readtodescendant/)(String, String) | Avanza il [XmlReader](./) al prossimo elemento discendente con il nome locale e l'URI dello spazio dei nomi specificati. |
| virtual [ReadToFollowing](./readtofollowing/)(String) | Legge fino a quando non viene trovato un elemento con il nome qualificato specificato. |
| virtual [ReadToFollowing](./readtofollowing/)(String, String) | Legge fino a quando non viene trovato un elemento con il nome locale e l'URI dello spazio dei nomi specificati. |
| virtual [ReadToNextSibling](./readtonextsibling/)(String) | Avanza il [XmlReader](./) al prossimo elemento fratello con il nome qualificato specificato. |
| virtual [ReadToNextSibling](./readtonextsibling/)(String, String) | Avanza il [XmlReader](./) al prossimo elemento fratello con il nome locale e l'URI dello spazio dei nomi specificati. |
| virtual [ReadValueChunk](./readvaluechunk/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | Legge grandi flussi di testo incorporati in un documento XML. |
| virtual [ResolveEntity](./resolveentity/)() | Quando sovrascritto in una classe derivata, risolve il riferimento all'entità per i nodi **EntityReference**. |
| virtual [Skip](./skip/)() | Salta i figli del nodo corrente. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Vedi anche

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
