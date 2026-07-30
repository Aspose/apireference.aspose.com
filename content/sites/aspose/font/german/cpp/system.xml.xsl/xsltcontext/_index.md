---
title: "System::Xml::Xsl::XsltContext Klasse"
linktitle: "XsltContext"
second_title: "Aspose.Font für C++"
description: "System::Xml::Xsl::XsltContext Klasse. Kapselt den aktuellen Ausführungskontext des Extensible Stylesheet Language for Transformations (XSLT)-Processors, der es der XML Path Language (XPath) ermöglicht, Funktionen, Parameter und Namensräume innerhalb von XPath-Ausdrücken in C++ aufzulösen."
type: docs
weight: 500
url: /de/cpp/system.xml.xsl/xsltcontext/
---
## XsltContext class


Kapselt den aktuellen Ausführungskontext des Extensible Stylesheet Language for Transformations (XSLT)-Processors, der es der XML Path Language ([XPath](../../system.xml.xpath/)) ermöglicht, Funktionen, Parameter und Namensräume innerhalb von [XPath](../../system.xml.xpath/)-Ausdrücken aufzulösen.

```cpp
class XsltContext : public System::Xml::XmlNamespaceManager
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [CompareDocument](./comparedocument/)(String, String) | Wenn in einer abgeleiteten Klasse überschrieben, vergleicht sie die Basis-Uniform Resource Identifiers (URIs) zweier Dokumente basierend auf der Reihenfolge, in der die Dokumente vom XSLT-Prozessor geladen wurden (also der [XslTransform](../xsltransform/) Klasse). |
| virtual [get_Whitespace](./get_whitespace/)() | Wenn in einer abgeleiteten Klasse überschrieben, liefert sie einen Wert, der angibt, ob Leerzeichenknoten in die Ausgabe aufgenommen werden sollen. |
| virtual [PreserveWhitespace](./preservewhitespace/)(SharedPtr\<System::Xml::XPath::XPathNavigator\>) | Wenn in einer abgeleiteten Klasse überschrieben, bewertet sie, ob Leerzeichenknoten für den gegebenen Kontext erhalten oder entfernt werden sollen. |
| virtual [ResolveFunction](./resolvefunction/)(String, String, ArrayPtr\<System::Xml::XPath::XPathResultType\>) | Wenn in einer abgeleiteten Klasse überschrieben, löst sie eine Funktionsreferenz auf und gibt ein [IXsltContextFunction](../ixsltcontextfunction/)-Objekt zurück, das die Funktion darstellt. Das [IXsltContextFunction](../ixsltcontextfunction/) wird zur Ausführungszeit verwendet, um den Rückgabewert der Funktion zu erhalten. |
| virtual [ResolveVariable](./resolvevariable/)(String, String) | Wenn in einer abgeleiteten Klasse überschrieben, löst sie eine Variablenreferenz auf und gibt ein [IXsltContextVariable](../ixsltcontextvariable/)-Objekt zurück, das die Variable darstellt. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Siehe auch

* Class [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
