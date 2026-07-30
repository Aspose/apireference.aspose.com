---
title: "System::Xml::XmlDocument::CreateElement metodo"
linktitle: "CreateElement"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlDocument::CreateElement metodo. Crea un elemento con il nome specificato in C++."
type: docs
weight: 800
url: /it/cpp/system.xml/xmldocument/createelement/
---
## XmlDocument::CreateElement(const String\&) method


Crea un elemento con il nome specificato.

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &name)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| name | const String\& | Il nome qualificato dell'elemento. Se il nome contiene due punti, il valore [XmlNode::get_Prefix](../../xmlnode/get_prefix/) riflette la parte del nome precedente i due punti e il valore [XmlDocument::get_LocalName](../get_localname/) riflette la parte del nome successiva ai due punti. Il nome qualificato non può includere un prefisso **xmlns**. |

### ReturnValue

Il nuovo [XmlElement](../../xmlelement/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&, const String\&) method


Crea un elemento con il [XmlNode::get_Prefix](../../xmlnode/get_prefix/) specificato, il [XmlDocument::get_LocalName](../get_localname/) e il [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &prefix, const String &localName, const String &namespaceURI)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| prefix | const String\& | Il prefisso del nuovo elemento (se presente). [String::Empty](../../../system/string/empty/) e **nullptr** sono equivalenti. |
| localName | const String\& | Il nome locale del nuovo elemento. |
| namespaceURI | const String\& | L'URI dello spazio dei nomi del nuovo elemento (se presente). [String::Empty](../../../system/string/empty/) e **nullptr** sono equivalenti. |

### ReturnValue

Il nuovo [XmlElement](../../xmlelement/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&) method


Crea un [XmlElement](../../xmlelement/) con il nome qualificato e il [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &qualifiedName, const String &namespaceURI)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| qualifiedName | const String\& | Il nome qualificato dell'elemento. Se il nome contiene due punti, il valore di [XmlNode::get_Prefix](../../xmlnode/get_prefix/) rifletterà la parte del nome precedente i due punti e il valore di [XmlDocument::get_LocalName](../get_localname/) rifletterà la parte del nome successiva ai due punti. Il nome qualificato non può includere un prefisso **xmlns**. |
| namespaceURI | const String\& | L'URI dello spazio dei nomi dell'elemento. |

### ReturnValue

Il nuovo [XmlElement](../../xmlelement/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
