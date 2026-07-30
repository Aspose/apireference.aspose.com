---
title: "System::Xml::Xsl::IXsltContextFunction Klasse"
linktitle: "IXsltContextFunction"
second_title: "Aspose.Font für C++"
description: "System::Xml::Xsl::IXsltContextFunction Klasse. Bietet eine Schnittstelle zu einer gegebenen Funktion, die im Extensible Stylesheet Language for Transformations (XSLT)-Stylesheet zur Laufzeit in C++ definiert ist."
type: docs
weight: 100
url: /de/cpp/system.xml.xsl/ixsltcontextfunction/
---
## IXsltContextFunction class


Stellt eine Schnittstelle zu einer angegebenen Funktion bereit, die im Extensible Stylesheet Language for Transformations (XSLT)-Stylesheet zur Laufzeit definiert ist.

```cpp
class IXsltContextFunction : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [get_ArgTypes](./get_argtypes/)() | Gibt die bereitgestellten XML Path Language ([XPath](../../system.xml.xpath/))-Typen für die Argumentliste der Funktion zurück. Diese Informationen können verwendet werden, um die Signatur der Funktion zu ermitteln, wodurch Sie zwischen überladenen Funktionen unterscheiden können. |
| virtual [get_Maxargs](./get_maxargs/)() | Gibt die maximale Anzahl von Argumenten für die Funktion zurück. Dies ermöglicht dem Benutzer, zwischen überladenen Funktionen zu unterscheiden. |
| virtual [get_Minargs](./get_minargs/)() | Gibt die minimale Anzahl von Argumenten für die Funktion zurück. Dies ermöglicht dem Benutzer, zwischen überladenen Funktionen zu unterscheiden. |
| virtual [get_ReturnType](./get_returntype/)() | Gibt den XPathResultType zurück, der den von der Funktion zurückgegebenen [XPath](../../system.xml.xpath/) Typ darstellt. |
| virtual [Invoke](./invoke/)(SharedPtr\<XsltContext\>, ArrayPtr\<SharedPtr\<Object\>\>, SharedPtr\<System::Xml::XPath::XPathNavigator\>) | Stellt die Methode bereit, um die Funktion mit den angegebenen Argumenten im angegebenen Kontext aufzurufen. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
