---
title: "System::Xml::XmlDeclaration::get_Encoding methode"
linktitle: "get_Encoding"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlDeclaration::get_Encoding methode. Retourneert het coderingsniveau van het XML-document in C++."
type: docs
weight: 200
url: /nl/cpp/system.xml/xmldeclaration/get_encoding/
---
## XmlDeclaration::get_Encoding method


Retourneert het coderingsniveau van het XML-document.

```cpp
String System::Xml::XmlDeclaration::get_Encoding()
```


### ReturnValue

De geldige naam van de tekencodering.
## Opmerkingen



De meest algemeen ondersteunde namen van tekencoderingen voor XML zijn de volgende: |||
|-|-|
| Categorie | Coderingnamen |
| Unicode | UTF-8, UTF-16 |
| ISO 10646 | ISO-10646-UCS-2, ISO-10646-UCS-4 |
| ISO 8859 | ISO-8859-n (waar "n" een cijfer van 1 tot 9 is) |
| JIS X-0208-1997 | ISO-2022-JP, Shift_JIS, EUC-JP |

Deze waarde is optioneel. Als een waarde niet is ingesteld, retourneert deze methode [String::Empty](../../../system/string/empty/). Als een coderingattribuut niet is opgenomen, wordt UTF-8-codering verondersteld wanneer het document wordt weggeschreven of opgeslagen.
## Zie ook

* Class [String](../../../system/string/)
* Class [XmlDeclaration](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
