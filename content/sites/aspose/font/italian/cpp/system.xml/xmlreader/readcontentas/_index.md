---
title: "System::Xml::XmlReader::ReadContentAs metodo"
linktitle: "ReadContentAs"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlReader::ReadContentAs metodo. Legge il contenuto come un oggetto del tipo specificato in C++."
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
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Un oggetto [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) che viene usato per risolvere eventuali prefissi di namespace relativi alla conversione di tipo. Per esempio, questo può essere usato quando si converte un oggetto [XmlQualifiedName](../../xmlqualifiedname/) in un **xs:string**. Questo valore può essere **nullptr**. |

### ReturnValue

Il contenuto di testo concatenato o il valore dell'attributo convertito al tipo richiesto.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
