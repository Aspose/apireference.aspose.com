---
title: "Metodo System::Xml::XmlDocument::CreateNode"
linktitle: "CreateNode"
second_title: "Aspose.Font per C++"
description: "Metodo System::Xml::XmlDocument::CreateNode. Crea un XmlNode con il tipo di nodo specificato, XmlDocument::get_Name e XmlNode::get_NamespaceURI in C++."
type: docs
weight: 1100
url: /it/cpp/system.xml/xmldocument/createnode/
---
## XmlDocument::CreateNode(const String\&, const String\&, const String\&) method


Crea un [XmlNode](../../xmlnode/) con il tipo di nodo specificato, [XmlDocument::get_Name](../get_name/) e [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(const String &nodeTypeString, const String &name, const String &namespaceURI)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nodeTypeString | const String\& | Versione [String](../../../system/string/) del [XmlNodeType](../../xmlnodetype/) del nuovo nodo. Questo parametro deve essere uno dei valori elencati nella tabella seguente. |
| name | const String\& | Il nome qualificato del nuovo nodo. Se il nome contiene due punti, viene analizzato in componenti [XmlNode::get_Prefix](../../xmlnode/get_prefix/) e [XmlDocument::get_LocalName](../get_localname/). |
| namespaceURI | const String\& | L'URI dello spazio dei nomi del nuovo nodo. |

### ReturnValue

Il nuovo [XmlNode](../../xmlnode/).
## Osservazioni



Il parametro **nodeTypeString** è sensibile al maiuscolo/minuscolo e deve essere uno dei valori nella tabella seguente: |||
|-|-|
| nodeTypeString | XmlNodeType |
| attribute | Attribute |
| cdatasection | CDATA |
| comment | Comment |
| documento | Document |
| frammentodocumento | DocumentFragment |
| tipodocumento | DocumentType |
| elemento | Element |
| riferimentoentità | EntityReference |
| istruzioneelaborazione | ProcessingInstruction |
| spaziobianco significativo | SignificantWhitespace |
| testo | Text |
| spaziobianco | Whitespace |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&) method


Crea un [XmlNode](../../xmlnode/) con il [XmlNodeType](../../xmlnodetype/) specificato, [XmlDocument::get_Name](../get_name/) e [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &name, const String &namespaceURI)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| type | XmlNodeType | Il [XmlNodeType](../../xmlnodetype/) del nuovo nodo. |
| name | const String\& | Il nome qualificato del nuovo nodo. Se il nome contiene due punti, viene analizzato nei componenti [XmlNode::get_Prefix](../../xmlnode/get_prefix/) e [XmlDocument::get_LocalName](../get_localname/). |
| namespaceURI | const String\& | L'URI dello spazio dei nomi del nuovo nodo. |

### ReturnValue

Il nuovo [XmlNode](../../xmlnode/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&, const String\&) method


Crea un [XmlNode](../../xmlnode/) con il [XmlNodeType](../../xmlnodetype/) specificato, [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_Name](../get_name/) e [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &prefix, const String &name, const String &namespaceURI)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| type | XmlNodeType | Il [XmlNodeType](../../xmlnodetype/) del nuovo nodo. |
| prefisso | const String\& | Il prefisso del nuovo nodo. |
| nome | const String\& | Il nome locale del nuovo nodo. |
| namespaceURI | const String\& | L'URI dello spazio dei nomi del nuovo nodo. |

### ReturnValue

Il nuovo [XmlNode](../../xmlnode/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
