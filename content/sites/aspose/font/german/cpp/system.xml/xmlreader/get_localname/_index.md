---
title: "System::Xml::XmlReader::get_LocalName-Methode"
linktitle: "get_LocalName"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlReader::get_LocalName-Methode. Wenn sie in einer abgeleiteten Klasse überschrieben wird, liefert sie den lokalen Namen des aktuellen Knotens in C++."
type: docs
weight: 1400
url: /de/cpp/system.xml/xmlreader/get_localname/
---
## XmlReader::get_LocalName method


Wenn in einer abgeleiteten Klasse überschrieben, gibt den lokalen Namen des aktuellen Knotens zurück.

```cpp
virtual String System::Xml::XmlReader::get_LocalName()=0
```


### ReturnValue

Der Name des aktuellen Knotens ohne das Präfix. Zum Beispiel ist **LocalName** **book** für das Element **<bk:book>**. Für Knotentypen, die keinen Namen haben (wie **[Text](../../../system.text/)**, **Comment** usw.), gibt diese Methode [String::Empty](../../../system/string/empty/) zurück.

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
