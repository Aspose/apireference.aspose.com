---
title: "System::Xml::XmlValidatingReader::XmlValidatingReader costruttore"
linktitle: "XmlValidatingReader"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlValidatingReader::XmlValidatingReader costruttore. Inizializza una nuova istanza della classe XmlValidatingReader con i valori specificati in C++."
type: docs
weight: 100
url: /it/cpp/system.xml/xmlvalidatingreader/xmlvalidatingreader/
---
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Inizializza una nuova istanza della classe [XmlValidatingReader](../) con i valori specificati.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<IO::Stream> &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| xmlFragment | const SharedPtr\<IO::Stream\>\& | Lo stream contenente il frammento XML da analizzare. |
| fragType | XmlNodeType | Il [XmlNodeType](../../xmlnodetype/) del frammento XML. Questo determina cosa può contenere il frammento (vedi tabella sotto). |
| context | const SharedPtr\<XmlParserContext\>\& | Il [XmlParserContext](../../xmlparsercontext/) in cui il frammento XML deve essere analizzato. Include la [XmlNameTable](../../xmlnametable/) da utilizzare, la codifica, l'ambito del namespace, l'attuale **xml:lang** e l'ambito **xml:space**. |
## Osservazioni



La tabella seguente elenca i valori validi per **fragType** e come il lettore analizza ciascuno dei diversi tipi di nodo. |||
|-|-|
| XmlNodeType | Il frammento può contenere |
| Element | Qualsiasi contenuto di elemento valido (ad esempio, qualsiasi combinazione di elementi, commenti, istruzioni di elaborazione, cdata, testo e riferimenti a entità). |
| Attribute | Il valore di un attributo (la parte all'interno delle virgolette). |
| Document | Il contenuto di un intero documento XML; questo impone le regole a livello di documento. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<XmlReader\>\&) constructor


Inizializza una nuova istanza della classe [XmlValidatingReader](../) che convalida il contenuto restituito dal [XmlReader](../../xmlreader/) fornito.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<XmlReader> &reader)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| reader | const SharedPtr\<XmlReader\>\& | Il [XmlReader](../../xmlreader/) da cui leggere durante la convalida. L'implementazione corrente supporta solo [XmlTextReader](../../xmltextreader/). |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Inizializza una nuova istanza della classe [XmlValidatingReader](../) con i valori specificati.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const String &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| xmlFragment | const String\& | La stringa contenente il frammento XML da analizzare. |
| fragType | XmlNodeType | Il [XmlNodeType](../../xmlnodetype/) del frammento XML. Questo determina anche cosa può contenere la stringa del frammento (vedi tabella sotto). |
| context | const SharedPtr\<XmlParserContext\>\& | Il [XmlParserContext](../../xmlparsercontext/) in cui il frammento XML deve essere analizzato. Include la [NameTable](../../nametable/) da utilizzare, la codifica, l'ambito dei namespace, l'**xml:lang** corrente e l'ambito **xml:space**. |
## Osservazioni



La tabella seguente elenca i valori validi per **fragType** e come il lettore analizza ciascuno dei diversi tipi di nodo. |||
|-|-|
| XmlNodeType | Il frammento può contenere |
| Element | Qualsiasi contenuto di elemento valido (ad esempio, qualsiasi combinazione di elementi, commenti, istruzioni di elaborazione, cdata, testo e riferimenti a entità). |
| Attribute | Il valore di un attributo (la parte all'interno delle virgolette). |
| Document | Il contenuto di un intero documento XML; questo impone le regole a livello di documento. |

## Vedi anche

* Class [String](../../../system/string/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
