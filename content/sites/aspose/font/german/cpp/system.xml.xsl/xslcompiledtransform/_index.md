---
title: "System::Xml::Xsl::XslCompiledTransform class"
linktitle: "XslCompiledTransform"
second_title: "Aspose.Font für C++"
description: "System::Xml::Xsl::XslCompiledTransform class. Transformiert XML‑Daten mithilfe eines XSLT‑Stylesheets in C++."
type: docs
weight: 300
url: /de/cpp/system.xml.xsl/xslcompiledtransform/
---
## XslCompiledTransform class


Transformiert XML-Daten mithilfe eines XSLT-Stylesheets.

```cpp
class XslCompiledTransform : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_OutputSettings](./get_outputsettings/)() | Gibt ein [XmlWriterSettings](../../system.xml/xmlwritersettings/)-Objekt zurück, das die Ausgabedaten enthält, die aus dem **xsl:output**‑Element des Stylesheets abgeleitet wurden. |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&) | Kompiliert das Stylesheet, das im [XmlReader](../../system.xml/xmlreader/) enthalten ist. |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) | Kompiliert das XSLT-Stylesheet, das im [XmlReader](../../system.xml/xmlreader/) enthalten ist. Der [XmlResolver](../../system.xml/xmlresolver/) löst alle XSLT **import**- oder **include**-Elemente auf und die XSLT-Einstellungen bestimmen die Berechtigungen für das Stylesheet. |
| [Load](./load/)(const String\&) | Lädt und kompiliert das Stylesheet, das sich an der angegebenen URI befindet. |
| [Load](./load/)(const String\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) | Lädt und kompiliert das XSLT-Stylesheet, das durch die URI angegeben ist. Der [XmlResolver](../../system.xml/xmlresolver/) löst alle XSLT **import**- oder **include**-Elemente auf und die XSLT-Einstellungen bestimmen die Berechtigungen für das Stylesheet. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) | Kompiliert das Stylesheet, das im IXPathNavigable-Objekt enthalten ist. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, SharedPtr\<XsltSettings\>, SharedPtr\<XmlResolver\>) | Kompiliert das XSLT-Stylesheet, das im IXPathNavigable enthalten ist. Der [XmlResolver](../../system.xml/xmlresolver/) löst alle XSLT **import**- oder **include**-Elemente auf und die XSLT-Einstellungen bestimmen die Berechtigungen für das Stylesheet. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XmlWriter\>\&) | Führt die Transformation mit dem durch das IXPathNavigable-Objekt angegebenen Eingabedokument aus und gibt die Ergebnisse an einen [XmlWriter](../../system.xml/xmlwriter/) aus. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Führt die Transformation mit dem durch das IXPathNavigable-Objekt angegebenen Eingabedokument aus und gibt die Ergebnisse an einen [XmlWriter](../../system.xml/xmlwriter/) aus. Die [XsltArgumentList](../xsltargumentlist/) liefert zusätzliche Laufzeitargumente. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Führt die Transformation mit dem durch das IXPathNavigable-Objekt angegebenen Eingabedokument aus und gibt die Ergebnisse an einen TextWriter aus. Die [XsltArgumentList](../xsltargumentlist/) liefert zusätzliche Laufzeitargumente. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Führt die Transformation mit dem durch das IXPathNavigable-Objekt angegebenen Eingabedokument aus und gibt die Ergebnisse an einen Stream aus. Die [XsltArgumentList](../xsltargumentlist/) liefert zusätzliche Laufzeitargumente. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XmlWriter\>\&) | Führt die Transformation mit dem durch das [XmlReader](../../system.xml/xmlreader/)-Objekt angegebenen Eingabedokument aus und gibt die Ergebnisse an einen [XmlWriter](../../system.xml/xmlwriter/) aus. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Führt die Transformation mit dem durch das [XmlReader](../../system.xml/xmlreader/)-Objekt angegebenen Eingabedokument aus und gibt die Ergebnisse an einen [XmlWriter](../../system.xml/xmlwriter/) aus. Die [XsltArgumentList](../xsltargumentlist/) liefert zusätzliche Laufzeitargumente. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Führt die Transformation mit dem durch das [XmlReader](../../system.xml/xmlreader/)-Objekt angegebenen Eingabedokument aus und gibt die Ergebnisse an einen TextWriter aus. Die [XsltArgumentList](../xsltargumentlist/) liefert zusätzliche Laufzeitargumente. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Führt die Transformation mit dem durch das [XmlReader](../../system.xml/xmlreader/)-Objekt angegebenen Eingabedokument aus und gibt die Ergebnisse an einen Stream aus. Die [XsltArgumentList](../xsltargumentlist/) liefert zusätzliche Laufzeitargumente. |
| [Transform](./transform/)(const String\&, const SharedPtr\<XmlWriter\>\&) | Führt die Transformation mit dem durch die URI angegebenen Eingabedokument aus und gibt die Ergebnisse an einen [XmlWriter](../../system.xml/xmlwriter/) aus. |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Führt die Transformation mit dem durch die URI angegebenen Eingabedokument aus und gibt die Ergebnisse an einen [XmlWriter](../../system.xml/xmlwriter/) aus. Die [XsltArgumentList](../xsltargumentlist/) liefert zusätzliche Laufzeitargumente. |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Führt die Transformation mit dem durch die URI angegebenen Eingabedokument aus und gibt die Ergebnisse an einen TextWriter aus. |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Führt die Transformation mit dem durch die URI angegebenen Eingabedokument aus und gibt die Ergebnisse an einen Stream aus. Die [XsltArgumentList](../xsltargumentlist/) liefert zusätzliche Laufzeitargumente. |
| [Transform](./transform/)(const String\&, const String\&) | Führt die Transformation mit dem durch die URI angegebenen Eingabedokument aus und gibt die Ergebnisse in einer Datei aus. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) | Führt die Transformation mit dem durch das [XmlReader](../../system.xml/xmlreader/)-Objekt angegebenen Eingabedokument aus und gibt die Ergebnisse an einen [XmlWriter](../../system.xml/xmlwriter/) aus. Die [XsltArgumentList](../xsltargumentlist/) liefert zusätzliche Laufzeitargumente und der [XmlResolver](../../system.xml/xmlresolver/) löst die XSLT **document()**-Funktion auf. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) | Führt die Transformation unter Verwendung des durch das IXPathNavigable-Objekt angegebenen Eingabedokuments aus und gibt die Ergebnisse an einen [XmlWriter](../../system.xml/xmlwriter/) aus. Die [XsltArgumentList](../xsltargumentlist/) liefert zusätzliche Laufzeitargumente und der [XmlResolver](../../system.xml/xmlresolver/) löst die XSLT **document()**-Funktion auf. |
| [XslCompiledTransform](./xslcompiledtransform/)() | Initialisiert eine neue Instanz der Klasse [XslCompiledTransform](./). |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
