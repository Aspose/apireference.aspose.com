---
title: "System::Xml::XmlReader::ReadElementContentAsObject-Methode"
linktitle: "ReadElementContentAsObject"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlReader::ReadElementContentAsObject-Methode. Liest das aktuelle Element und gibt den Inhalt als Objekt in C++ zurück."
type: docs
weight: 6200
url: /de/cpp/system.xml/xmlreader/readelementcontentasobject/
---
## XmlReader::ReadElementContentAsObject() method


Liest das aktuelle Element und gibt den Inhalt als [Object](../../../system/object/) zurück.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject()
```


### ReturnValue

Ein verpacktes Objekt des am besten geeigneten Typs. Der Wert von [XmlReader::get_ValueType](../get_valuetype/) bestimmt den geeigneten Typ. Wenn der Inhalt als Listentyp typisiert ist, gibt diese Methode ein Array von verpackten Objekten des entsprechenden Typs zurück.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadElementContentAsObject(String, String) method


Prüft, ob der angegebene lokale Name und die Namespace-URI mit denen des aktuellen Elements übereinstimmen, liest dann das aktuelle Element und gibt den Inhalt als [Object](../../../system/object/) zurück.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject(String localName, String namespaceURI)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| localName | String | Der lokale Name des Elements. |
| namespaceURI | String | Die Namespace-URI des Elements. |

### ReturnValue

Ein verpacktes Objekt des am besten geeigneten Typs. Der Wert von [XmlReader::get_ValueType](../get_valuetype/) bestimmt den geeigneten Typ. Wenn der Inhalt als Listentyp typisiert ist, gibt diese Methode ein Array von verpackten Objekten des entsprechenden Typs zurück.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
