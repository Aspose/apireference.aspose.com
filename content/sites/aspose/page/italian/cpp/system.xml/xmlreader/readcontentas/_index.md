---
title: "Metodo System::Xml::XmlReader::ReadContentAs"
linktitle: "ReadContentAs"
second_title: "Aspose.Page per C++"
description: "Metodo System::Xml::XmlReader::ReadContentAs. Legge il contenuto come un oggetto del tipo specificato in C++."
type: docs
weight: 3900
url: /it/cpp/system.xml/xmlreader/readcontentas/
---
## XmlReader::ReadContentAs method


Legge il contenuto come un oggetto del tipo specificato.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| returnType | const TypeInfo\& | Il tipo del valore da restituire. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Un oggetto [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) utilizzato per risolvere eventuali prefissi di namespace relativi alla conversione di tipo. Ad esempio, può essere usato quando si converte un oggetto [XmlQualifiedName](../../xmlqualifiedname/) in una **xs:string**. Questo valore può essere **nullptr**. |

### ReturnValue

Il contenuto di testo concatenato o il valore dell'attributo convertito al tipo richiesto.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
