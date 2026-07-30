---
title: "Metodo System::Xml::XmlDocument::CreateAttribute"
linktitle: "CreateAttribute"
second_title: "Aspose.Font per C++"
description: "Metodo System::Xml::XmlDocument::CreateAttribute. Crea un XmlAttribute con il nome specificato in C++."
type: docs
weight: 300
url: /it/cpp/system.xml/xmldocument/createattribute/
---
## XmlDocument::CreateAttribute(const String\&) method


Crea un [XmlAttribute](../../xmlattribute/) con il nome specificato.

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &name)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| name | const String\& | Il nome qualificato dell'attributo. Se il nome contiene due punti, il valore di [XmlNode::get_Prefix](../../xmlnode/get_prefix/) riflette la parte del nome precedente il primo due punti e il valore di [XmlDocument::get_LocalName](../get_localname/) riflette la parte del nome successiva al primo due punti. Il valore di [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) rimane vuoto a meno che il prefisso non sia un prefisso incorporato riconosciuto, come **xmlns**. In questo caso get_NamespaceURI ha il valore [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/). |

### ReturnValue

Il nuovo [XmlAttribute](../../xmlattribute/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&, const String\&) method


Crea un [XmlAttribute](../../xmlattribute/) con il [XmlNode::get_Prefix](../../xmlnode/get_prefix/) specificato, il [XmlDocument::get_LocalName](../get_localname/) specificato e il [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) specificato.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &prefix, const String &localName, const String &namespaceURI)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| prefix | const String\& | Il prefisso dell'attributo (se presente). [String::Empty](../../../system/string/empty/) e **nullptr** sono equivalenti. |
| localName | const String\& | Il nome locale dell'attributo. |
| namespaceURI | const String\& | L'URI dello spazio dei nomi dell'attributo (se presente). [String::Empty](../../../system/string/empty/) e **nullptr** sono equivalenti. Se **prefix** è **xmlns**, questo parametro deve essere [http://www.w3.org/2000/xmlns/;](http://www.w3.org/2000/xmlns/;) altrimenti viene generata un'eccezione. |

### ReturnValue

Il nuovo [XmlAttribute](../../xmlattribute/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&) method


Crea un [XmlAttribute](../../xmlattribute/) con il nome qualificato specificato e [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &qualifiedName, const String &namespaceURI)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| qualifiedName | const String\& | Il nome qualificato dell'attributo. Se il nome contiene due punti, il valore di [XmlNode::get_Prefix](../../xmlnode/get_prefix/) rifletterà la parte del nome precedente i due punti e il valore di [XmlDocument::get_LocalName](../get_localname/) rifletterà la parte del nome successiva ai due punti. |
| namespaceURI | const String\& | L'namespaceURI dell'attributo. Se il nome qualificato include un prefisso **xmlns**, questo parametro deve essere [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/). |

### ReturnValue

Il nuovo [XmlAttribute](../../xmlattribute/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
