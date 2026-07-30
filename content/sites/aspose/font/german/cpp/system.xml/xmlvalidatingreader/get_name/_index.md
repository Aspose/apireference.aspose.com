---
title: "System::Xml::XmlValidatingReader::get_Name Methode"
linktitle: "get_Name"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlValidatingReader::get_Name Methode. Gibt den qualifizierten Namen des aktuellen Knotens in C++ zurück."
type: docs
weight: 1700
url: /de/cpp/system.xml/xmlvalidatingreader/get_name/
---
## XmlValidatingReader::get_Name method


Gibt den qualifizierten Namen des aktuellen Knotens zurück.

```cpp
String System::Xml::XmlValidatingReader::get_Name() override
```


### ReturnValue

Der qualifizierte Name des aktuellen Knotens. Zum Beispiel ist **Name** **bk:book** für das Element **<bk:book>**.
## Hinweise



Der zurückgegebene Name hängt vom XmlValidatingReader::NodeType des Knotens ab. Die folgenden Knotentypen geben die aufgeführten Werte zurück. Alle anderen Knotentypen geben eine leere Zeichenfolge zurück. |||
|-|-|
| Knotentyp | Name |
| Attribute | Der Name des Attributs. |
| DocumentType | Der Dokumenttypname. |
| Element | Der Tag-Name. |
| EntityReference | Der Name der referenzierten Entität. |
| ProcessingInstruction | Das Ziel der Verarbeitungsanweisung. |
| XmlDeclaration | Die wörtliche Zeichenkette xml. |

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
