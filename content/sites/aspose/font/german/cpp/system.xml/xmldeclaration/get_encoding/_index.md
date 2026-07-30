---
title: "System::Xml::XmlDeclaration::get_Encoding Methode"
linktitle: "get_Encoding"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlDeclaration::get_Encoding Methode. Gibt die Kodierungsebene des XML-Dokuments in C++ zurück."
type: docs
weight: 200
url: /de/cpp/system.xml/xmldeclaration/get_encoding/
---
## XmlDeclaration::get_Encoding method


Gibt die Kodierungsebene des XML‑Dokuments zurück.

```cpp
String System::Xml::XmlDeclaration::get_Encoding()
```


### ReturnValue

Der gültige Zeichencodierungsname.
## Hinweise



Die am häufigsten unterstützten Zeichencodierungsnamen für XML sind die folgenden: |||
|-|-|
| Kategorie | Kodierungsnamen |
| Unicode | UTF-8, UTF-16 |
| ISO 10646 | ISO-10646-UCS-2, ISO-10646-UCS-4 |
| ISO 8859 | ISO-8859-n (wobei "n" eine Ziffer von 1 bis 9 ist) |
| JIS X-0208-1997 | ISO-2022-JP, Shift_JIS, EUC-JP |

Dieser Wert ist optional. Wenn kein Wert gesetzt ist, gibt diese Methode [String::Empty](../../../system/string/empty/) zurück. Wenn kein Encoding-Attribut angegeben ist, wird beim Schreiben oder Speichern des Dokuments UTF-8-Encoding angenommen.
## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlDeclaration](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
