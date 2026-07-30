---
title: "System::Xml::XPath::XPathDocument Klasse"
linktitle: "XPathDocument"
second_title: "Aspose.Font für C++"
description: "System::Xml::XPath::XPathDocument Klasse. Stellt eine schnelle, schreibgeschützte, im Speicher befindliche Darstellung eines XML‑Dokuments bereit, indem das XPath‑Datenmodell in C++ verwendet wird."
type: docs
weight: 200
url: /de/cpp/system.xml.xpath/xpathdocument/
---
## XPathDocument class


Stellt eine schnelle, schreibgeschützte, im Speicher befindliche Darstellung eines XML‑Dokuments bereit, indem das [XPath](../)‑Datenmodell verwendet wird.

```cpp
class XPathDocument : public System::Xml::XPath::IXPathNavigable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CreateNavigator](./createnavigator/)() override | Initialisiert ein schreibgeschütztes [XPathNavigator](../xpathnavigator/)‑Objekt zum Navigieren durch Knoten in diesem [XPathDocument](./). |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&) | Initialisiert eine neue Instanz der [XPathDocument](./)‑Klasse aus den XML‑Daten, die im angegebenen [XmlReader](../../system.xml/xmlreader/)‑Objekt enthalten sind. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&, XmlSpace) | Initialisiert eine neue Instanz der Klasse [XPathDocument](./) aus den XML-Daten, die im angegebenen [XmlReader](../../system.xml/xmlreader/)-Objekt enthalten sind, mit der angegebenen Leerzeichenbehandlung. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::TextReader\>\&) | Initialisiert eine neue Instanz der Klasse [XPathDocument](./) aus den XML-Daten, die im angegebenen TextReader-Objekt enthalten sind. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::Stream\>\&) | Initialisiert eine neue Instanz der Klasse [XPathDocument](./) aus den XML-Daten im angegebenen Stream-Objekt. |
| [XPathDocument](./xpathdocument/)(const String\&) | Initialisiert eine neue Instanz der Klasse [XPathDocument](./) aus den XML-Daten in der angegebenen Datei. |
| [XPathDocument](./xpathdocument/)(const String\&, XmlSpace) | Initialisiert eine neue Instanz der Klasse [XPathDocument](./) aus den XML-Daten in der mit der angegebenen Leerzeichenbehandlung spezifizierten Datei. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [IXPathNavigable](../ixpathnavigable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
