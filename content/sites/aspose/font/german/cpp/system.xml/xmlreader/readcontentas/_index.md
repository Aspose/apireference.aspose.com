---
title: "System::Xml::XmlReader::ReadContentAs Methode"
linktitle: "ReadContentAs"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlReader::ReadContentAs Methode. Liest den Inhalt als ein Objekt des in C++ angegebenen Typs."
type: docs
weight: 3900
url: /de/cpp/system.xml/xmlreader/readcontentas/
---
## XmlReader::ReadContentAs method


Liest den Inhalt als ein Objekt des angegebenen Typs.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| returnType | const TypeInfo\& | Der Typ des zurückzugebenden Werts. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Ein [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) Objekt, das verwendet wird, um alle Namespace‑Präfixe im Zusammenhang mit Typkonvertierung aufzulösen. Zum Beispiel kann dies verwendet werden, wenn ein [XmlQualifiedName](../../xmlqualifiedname/) Objekt in einen **xs:string** konvertiert wird. Dieser Wert kann **nullptr** sein. |

### ReturnValue

Der zusammengeführte Textinhalt oder Attributwert, der in den angeforderten Typ konvertiert wurde.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
