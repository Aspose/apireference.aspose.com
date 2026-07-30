---
title: "System::Xml::XmlParserContext::XmlParserContext costruttore"
linktitle: "XmlParserContext"
second_title: "Aspose.Font per C++"
description: "Costruttore System::Xml::XmlParserContext::XmlParserContext. Inizializza una nuova istanza della classe XmlParserContext con i valori specificati di XmlNameTable, XmlNamespaceManager, URI di base, xml:lang, xml:space e valori del tipo di documento in C++."
type: docs
weight: 100
url: /it/cpp/system.xml/xmlparsercontext/xmlparsercontext/
---
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) constructor


Inizializza una nuova istanza della classe [XmlParserContext](../) con i [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), URI di base, **xml:lang**, **xml:space** e valori del tipo di documento.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | Il [XmlNameTable](../../xmlnametable/) da utilizzare per atomizzare le stringhe. Se è **nullptr**, viene utilizzata la tabella dei nomi impiegata per costruire il **nsMgr**. Per ulteriori informazioni sulle stringhe atomizzate, vedere [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | Il [XmlNamespaceManager](../../xmlnamespacemanager/) da utilizzare per la ricerca delle informazioni sul namespace, o **nullptr**. |
| docTypeName | const String\& | Il nome della dichiarazione del tipo di documento. |
| pubId | const String\& | L'identificatore pubblico. |
| sysId | const String\& | L'identificatore di sistema. |
| internalSubset | const String\& | Il sottoinsieme DTD interno. Il sottoinsieme DTD è usato per la risoluzione delle entità, non per la convalida del documento. |
| baseURI | const String\& | L'URI di base per il frammento XML (la posizione da cui è stato caricato il frammento). |
| xmlLang | const String\& | L'ambito **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | Un valore [XmlSpace](../../xmlspace/) che indica l'ambito **xml:space**. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


Inizializza una nuova istanza della classe [XmlParserContext](../) con i [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), URI di base, **xml:lang**, **xml:space**, codifica e valori del tipo di documento.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | Il [XmlNameTable](../../xmlnametable/) da utilizzare per atomizzare le stringhe. Se è **nullptr**, viene utilizzata la tabella dei nomi impiegata per costruire il **nsMgr**. Per ulteriori informazioni sulle stringhe atomizzate, vedere [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | Il [XmlNamespaceManager](../../xmlnamespacemanager/) da utilizzare per la ricerca delle informazioni sul namespace, o **nullptr**. |
| docTypeName | const String\& | Il nome della dichiarazione del tipo di documento. |
| pubId | const String\& | L'identificatore pubblico. |
| sysId | const String\& | L'identificatore di sistema. |
| internalSubset | const String\& | Il sottoinsieme DTD interno. Il DTD è usato per la risoluzione delle entità, non per la convalida del documento. |
| baseURI | const String\& | L'URI di base per il frammento XML (la posizione da cui è stato caricato il frammento). |
| xmlLang | const String\& | L'ambito **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | Un valore [XmlSpace](../../xmlspace/) che indica l'ambito **xml:space**. |
| enc | const SharedPtr\<System::Text::Encoding\>\& | Un oggetto Encoding che indica l'impostazione della codifica. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace) constructor


Inizializza una nuova istanza della classe [XmlParserContext](../) con i [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), i valori **xml:lang** e **xml:space**.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | Il [XmlNameTable](../../xmlnametable/) da utilizzare per atomizzare le stringhe. Se è **nullptr**, viene utilizzata la tabella dei nomi impiegata per costruire il **nsMgr**. Per ulteriori informazioni sulle stringhe atomizzate, vedere [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | Il [XmlNamespaceManager](../../xmlnamespacemanager/) da utilizzare per la ricerca delle informazioni sul namespace, o **nullptr**. |
| xmlLang | const String\& | L'ambito **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | Un valore [XmlSpace](../../xmlspace/) che indica l'ambito **xml:space**. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


Inizializza una nuova istanza della classe [XmlParserContext](../) con i [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), **xml:lang**, **xml:space** e la codifica.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | Il [XmlNameTable](../../xmlnametable/) da utilizzare per atomizzare le stringhe. Se è **nullptr**, viene utilizzata la tabella dei nomi impiegata per costruire il **nsMgr**. Per ulteriori informazioni sulle stringhe atomizzate, vedere [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | Il [XmlNamespaceManager](../../xmlnamespacemanager/) da utilizzare per la ricerca delle informazioni sul namespace, o **nullptr**. |
| xmlLang | const String\& | L'ambito **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | Un valore [XmlSpace](../../xmlspace/) che indica l'ambito **xml:space**. |
| enc | const SharedPtr\<System::Text::Encoding\>\& | Un oggetto Encoding che indica l'impostazione della codifica. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
