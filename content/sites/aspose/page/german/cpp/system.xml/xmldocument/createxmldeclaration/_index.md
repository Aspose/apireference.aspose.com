---
title: "System::Xml::XmlDocument::CreateXmlDeclaration-Methode"
linktitle: "CreateXmlDeclaration"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlDocument::CreateXmlDeclaration-Methode. Erstellt einen XmlDeclaration-Knoten mit den angegebenen Werten in C++."
type: docs
weight: 1600
url: /de/cpp/system.xml/xmldocument/createxmldeclaration/
---
## XmlDocument::CreateXmlDeclaration method


Erstellt einen [XmlDeclaration](../../xmldeclaration/) Knoten mit den angegebenen Werten.

```cpp
virtual SharedPtr<XmlDeclaration> System::Xml::XmlDocument::CreateXmlDeclaration(const String &version, const String &encoding, const String &standalone)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Version | const String\& | Die Version muss "1.0" sein. |
| encoding | const String\& | Der Wert des Encoding-Attributs. Dies ist das Encoding, das verwendet wird, wenn Sie das [XmlDocument](../) in einer Datei oder einem Stream speichern; daher muss es auf eine von der Klasse [Text::Encoding](../../../system.text/encoding/) unterstützte Zeichenkette gesetzt werden, andernfalls schlägt "XmlDocument::Save(String)" fehl. Wenn dies **nullptr** oder [String::Empty](../../../system/string/empty/) ist, schreibt die [XmlDocument::Save](../save/) Methode kein Encoding-Attribut in die XML-Deklaration und es wird daher das Standard-Encoding UTF-8 verwendet. |
| standalone | const String\& | Der Wert muss entweder "yes" oder "no" sein. Wenn dies **nullptr** oder [String::Empty](../../../system/string/empty/) ist, schreibt die [XmlDocument::Save](../save/) Methode kein standalone-Attribut in die XML-Deklaration. |

### ReturnValue

Der neue [XmlDeclaration](../../xmldeclaration/) Knoten.
## Hinweise



Hinweis: Wenn das [XmlDocument](../) entweder in einen TextWriter oder einen [XmlTextWriter](../../xmltextwriter/) gespeichert wird, wird dieser Encoding-Wert verworfen. Stattdessen wird das Encoding des TextWriter oder des [XmlTextWriter](../../xmltextwriter/) verwendet. Dies stellt sicher, dass das ausgegebene XML mit dem korrekten Encoding wieder eingelesen werden kann.
## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlDeclaration](../../xmldeclaration/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
