---
title: "System::Xml::XmlNodeType Enum"
linktitle: "XmlNodeType"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlNodeType Enum. Gibt den Knotentyp in C++ an."
type: docs
weight: 6200
url: /de/cpp/system.xml/xmlnodetype/
---
## XmlNodeType enum


Gibt den Typ des Knotens an.

```cpp
enum class XmlNodeType
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| None | 0 | Dies wird vom [XmlReader](../xmlreader/) zurückgegeben, wenn die **Read**-Methode nicht aufgerufen wurde. |
| Element | 1 | Ein Element (zum Beispiel **<item>**). |
| Attribute | 2 | Ein Attribut (zum Beispiel **id='123'**). |
| Text | 3 | Der Textinhalt eines Knotens. Ein [XmlNodeType::Text](./)-Knoten kann keine Kindknoten haben. Er kann als Kindknoten der [XmlNodeType::Attribute](./)-, [XmlNodeType::DocumentFragment](./)-, [XmlNodeType::Element](./)- und [XmlNodeType::EntityReference](./)-Knoten auftreten. |
| CDATA | 4 | Ein CDATA-Abschnitt (zum Beispiel **my escaped text**). |
| EntityReference | 5 | Ein Verweis auf eine Entität (zum Beispiel, **&num;**). |
| Entity | 6 | Eine Entitätsdeklaration (zum Beispiel, **<!ENTITY...>**). |
| ProcessingInstruction | 7 | Eine Verarbeitungsanweisung (zum Beispiel, **<?pi test?>**). |
| Comment | 8 | Ein Kommentar (zum Beispiel, ****). |
| Document | 9 | Ein Dokumentobjekt, das als Wurzel des Dokumentbaums Zugriff auf das gesamte XML-Dokument bietet. |
| DocumentType | 10 | Die Dokumenttypdeklaration, angegeben durch das folgende Tag (zum Beispiel, **<!DOCTYPE...>**). |
| DocumentFragment | 11 | Ein Dokumentfragment. |
| Notation | 12 | Eine Notation in der Dokumenttypdeklaration (zum Beispiel, **<!NOTATION...>**). |
| Whitespace | 13 | Leerzeichen zwischen Markup. |
| SignificantWhitespace | 14 | Leerzeichen zwischen Markup in einem gemischten Inhaltsmodell oder Leerzeichen innerhalb des **xml:space=\"preserve\"**-Bereichs. |
| EndElement | 15 | Ein End-Element-Tag (zum Beispiel, ****). |
| EndEntity | 16 | Wird zurückgegeben, wenn [XmlReader](../xmlreader/) das Ende des Entitätsersatzes erreicht, als Ergebnis eines Aufrufs von [XmlReader::ResolveEntity](../xmlreader/resolveentity/). |
| XmlDeclaration | 17 | Die XML-Deklaration (zum Beispiel, **<?xml version='1.0'?>**). Der Knoten [XmlNodeType::XmlDeclaration](./) muss der erste Knoten im Dokument sein. Er darf keine Kinder haben. Er ist ein Kind des Knotens [XmlNodeType::Document](./). Er kann Attribute besitzen, die Versions- und Kodierungsinformationen bereitstellen. |

## Siehe auch

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
