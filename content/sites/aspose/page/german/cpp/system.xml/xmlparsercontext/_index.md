---
title: "System::Xml::XmlParserContext Klasse"
linktitle: "XmlParserContext"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlParserContext Klasse. Stellt alle Kontextinformationen bereit, die vom XmlReader zum Parsen eines XML‑Fragments in C++ benötigt werden."
type: docs
weight: 3000
url: /de/cpp/system.xml/xmlparsercontext/
---
## XmlParserContext class


Stellt alle Kontextinformationen bereit, die vom [XmlReader](../xmlreader/) zum Parsen eines XML‑Fragments benötigt werden.

```cpp
class XmlParserContext : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_BaseURI](./get_baseuri/)() | Gibt die Basis‑URI zurück. |
| [get_DocTypeName](./get_doctypename/)() | Gibt den Namen der Dokumenttypdeklaration zurück. |
| [get_Encoding](./get_encoding/)() | Gibt den Kodierungstyp zurück. |
| [get_InternalSubset](./get_internalsubset/)() | Gibt das interne DTD‑Teilschema zurück. |
| [get_NamespaceManager](./get_namespacemanager/)() | Gibt den [XmlNamespaceManager](../xmlnamespacemanager/) zurück. |
| [get_NameTable](./get_nametable/)() | Gibt die [XmlNameTable](../xmlnametable/) zurück, die zum Atomisieren von Zeichenketten verwendet wird. Weitere Informationen zu atomisierten Zeichenketten finden Sie in der [XmlNameTable](../xmlnametable/). |
| [get_PublicId](./get_publicid/)() | Gibt den öffentlichen Bezeichner zurück. |
| [get_SystemId](./get_systemid/)() | Gibt den Systembezeichner zurück. |
| [get_XmlLang](./get_xmllang/)() | Gibt den aktuellen **xml:lang**‑Bereich zurück. |
| [get_XmlSpace](./get_xmlspace/)() | Gibt den aktuellen **xml:space**‑Geltungsbereich zurück. |
| [set_BaseURI](./set_baseuri/)(const String\&) | Setzt die Basis‑URI. |
| [set_DocTypeName](./set_doctypename/)(const String\&) | Setzt den Namen der Dokumenttypdeklaration. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<System::Text::Encoding\>\&) | Setzt den Kodierungstyp. |
| [set_InternalSubset](./set_internalsubset/)(const String\&) | Setzt das interne DTD‑Teilschema. |
| [set_NamespaceManager](./set_namespacemanager/)(const SharedPtr\<XmlNamespaceManager\>\&) | Setzt den [XmlNamespaceManager](../xmlnamespacemanager/). |
| [set_NameTable](./set_nametable/)(const SharedPtr\<XmlNameTable\>\&) | Setzt die [XmlNameTable](../xmlnametable/), die zum Atomisieren von Zeichenketten verwendet wird. Weitere Informationen zu atomisierten Zeichenketten finden Sie in der [XmlNameTable](../xmlnametable/). |
| [set_PublicId](./set_publicid/)(const String\&) | Setzt den öffentlichen Bezeichner. |
| [set_SystemId](./set_systemid/)(const String\&) | Setzt den Systembezeichner. |
| [set_XmlLang](./set_xmllang/)(const String\&) | Setzt den aktuellen **xml:lang**‑Geltungsbereich. |
| [set_XmlSpace](./set_xmlspace/)(System::Xml::XmlSpace) | Setzt den aktuellen **xml:space**‑Geltungsbereich. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace) | Initialisiert eine neue Instanz der [XmlParserContext](./)-Klasse mit den angegebenen [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), **xml:lang**‑ und **xml:space**‑Werten. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) | Initialisiert eine neue Instanz der [XmlParserContext](./)-Klasse mit den angegebenen [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), **xml:lang**, **xml:space** und der Kodierung. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) | Initialisiert eine neue Instanz der [XmlParserContext](./)-Klasse mit den angegebenen [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), Basis‑URI, **xml:lang**, **xml:space** und Dokumenttypwerten. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) | Initialisiert eine neue Instanz der [XmlParserContext](./)-Klasse mit der angegebenen [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), Basis-URI, **xml:lang**, **xml:space**, Kodierung und Dokumenttypwerten. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared-Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
