---
title: "System::Xml::XmlNodeReader::get_Value Methode"
linktitle: "get_Value"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlNodeReader::get_Value Methode. Gibt den Textwert des aktuellen Knotens in C++ zurück."
type: docs
weight: 2100
url: /de/cpp/system.xml/xmlnodereader/get_value/
---
## XmlNodeReader::get_Value method


Gibt den Textwert des aktuellen Knotens zurück.

```cpp
String System::Xml::XmlNodeReader::get_Value() override
```


### ReturnValue

Der zurückgegebene Wert hängt vom [XmlNodeReader::get_NodeType](../get_nodetype/) des Knotens ab.
## Hinweise



Die folgende Tabelle listet Knotentypen auf, die einen zurückzugebenden Wert haben. Alle anderen Knotentypen geben [String::Empty](../../../system/string/empty/) zurück. |||
|-|-|
| Knotentyp | Wert |
| Attribute | Der Wert des Attributs. |
| CDATA | Der Inhalt des CDATA-Abschnitts. |
| Comment | Der Inhalt des Kommentars. |
| DocumentType | Der interne Teilbereich. |
| ProcessingInstruction | Der gesamte Inhalt, ohne das Ziel. |
| SignificantWhitespace | Der Leerraum zwischen Markup in einem gemischten Inhaltsmodell. |
| Text | Der Inhalt des Textknotens. |
| Whitespace | Der Leerraum zwischen Markup. |
| XmlDeclaration | Der Inhalt der Deklaration. |

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
