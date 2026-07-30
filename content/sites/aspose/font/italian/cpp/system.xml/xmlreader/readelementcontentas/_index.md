---
title: "System::Xml::XmlReader::ReadElementContentAs metodo"
linktitle: "ReadElementContentAs"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlReader::ReadElementContentAs metodo. Legge il contenuto dell'elemento come il tipo richiesto in C++."
type: docs
weight: 5200
url: /it/cpp/system.xml/xmlreader/readelementcontentas/
---
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


Legge il contenuto dell'elemento come il tipo richiesto.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| returnType | const TypeInfo\& | Il tipo del valore da restituire. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Un oggetto [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) che viene utilizzato per risolvere eventuali prefissi di namespace relativi alla conversione di tipo. |

### ReturnValue

Il contenuto dell'elemento convertito nell'oggetto tipizzato richiesto.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) method


Verifica che il nome locale e l'URI dello spazio dei nomi specificati corrispondano a quelli dell'elemento corrente, quindi legge il contenuto dell'elemento come il tipo richiesto.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver, String localName, String namespaceURI)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| returnType | const TypeInfo\& | Il tipo del valore da restituire. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Un oggetto [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) che viene utilizzato per risolvere eventuali prefissi di namespace relativi alla conversione di tipo. |
| localName | Stringa | Il nome locale dell'elemento. |
| namespaceURI | Stringa | L'URI dello spazio dei nomi dell'elemento. |

### ReturnValue

Il contenuto dell'elemento convertito nell'oggetto tipizzato richiesto.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
