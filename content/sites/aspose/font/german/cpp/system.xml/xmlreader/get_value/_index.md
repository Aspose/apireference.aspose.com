---
title: "System::Xml::XmlReader::get_Value Methode"
linktitle: "get_Value"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlReader::get_Value Methode. Wenn sie in einer abgeleiteten Klasse überschrieben wird, erhält sie den Textwert des aktuellen Knotens in C++."
type: docs
weight: 2400
url: /de/cpp/system.xml/xmlreader/get_value/
---
## XmlReader::get_Value method


Wenn in einer abgeleiteten Klasse überschrieben, gibt den Textwert des aktuellen Knotens zurück.

```cpp
virtual String System::Xml::XmlReader::get_Value()=0
```


### ReturnValue

Der zurückgegebene Wert hängt vom [XmlReader::get_NodeType](../get_nodetype/)‑Wert des Knotens ab.
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
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
