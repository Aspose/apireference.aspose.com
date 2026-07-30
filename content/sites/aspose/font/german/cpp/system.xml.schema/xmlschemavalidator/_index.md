---
title: "System::Xml::Schema::XmlSchemaValidator Klasse"
linktitle: "XmlSchemaValidator"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaValidator Klasse. Stellt eine XML Schema Definition Language (XSD) Schema‑Validierungs‑Engine dar. Die XmlSchemaValidator‑Klasse kann in C++ nicht abgeleitet werden."
type: docs
weight: 7000
url: /de/cpp/system.xml.schema/xmlschemavalidator/
---
## XmlSchemaValidator class


Stellt eine XML [Schema](../) Definition Language (XSD) [Schema](../) Validierungs‑Engine dar. Die [XmlSchemaValidator](./) Klasse kann nicht abgeleitet werden.

```cpp
class XmlSchemaValidator : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AddSchema](./addschema/)(const SharedPtr\<XmlSchema\>\&) | Fügt ein XML [Schema](../) Definition Language (XSD) Schema zum Satz von Schemas hinzu, die für die Validierung verwendet werden. |
| [EndValidation](./endvalidation/)() | Beendet die Validierung und prüft Identitätsbeschränkungen für das gesamte XML‑Dokument. |
| [get_LineInfoProvider](./get_lineinfoprovider/)() | Gibt die Zeilennummer‑Information für den zu validierenden XML‑Knoten zurück. |
| [get_SourceUri](./get_sourceuri/)() | Gibt die Quell‑URI für den zu validierenden XML‑Knoten zurück. |
| [get_ValidationEventSender](./get_validationeventsender/)() | Gibt das Objekt zurück, das als Senderobjekt eines Validierungsereignisses gesendet wird. |
| [GetExpectedAttributes](./getexpectedattributes/)() | Gibt die erwarteten Attribute für den aktuellen Elementkontext zurück. |
| [GetExpectedParticles](./getexpectedparticles/)() | Gibt die erwarteten Partikel im aktuellen Elementkontext zurück. |
| [GetUnspecifiedDefaultAttributes](./getunspecifieddefaultattributes/)(const SharedPtr\<Collections::Generic::List\<SharedPtr\<Object\>\>\>\&) | Validiert Identitätsbeschränkungen für die Standardattribute und füllt die angegebene List mit [XmlSchemaAttribute](../xmlschemaattribute/) Objekten für alle Attribute mit Standardwerten, die im Elementkontext noch nicht zuvor mit der Methode [XmlSchemaValidator::ValidateAttribute](./validateattribute/) validiert wurden. |
| [Initialize](./initialize/)() | Initialisiert den Zustand des [XmlSchemaValidator](./) Objekts. |
| [Initialize](./initialize/)(const SharedPtr\<XmlSchemaObject\>\&) | Initialisiert den Zustand des [XmlSchemaValidator](./) Objekts unter Verwendung des angegebenen [XmlSchemaObject](../xmlschemaobject/) für die partielle Validierung. |
| [set_LineInfoProvider](./set_lineinfoprovider/)(const SharedPtr\<IXmlLineInfo\>\&) | Setzt die Zeilennummer‑Information für den zu validierenden XML‑Knoten. |
| [set_SourceUri](./set_sourceuri/)(const SharedPtr\<Uri\>\&) | Setzt die Quell‑URI für den zu validierenden XML‑Knoten. |
| [set_ValidationEventSender](./set_validationeventsender/)(const SharedPtr\<Object\>\&) | Setzt das Objekt, das als Senderobjekt eines Validierungsereignisses gesendet wird. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Setzt das [XmlResolver](../../system.xml/xmlresolver/) Objekt, das zum Auflösen von **xs:import**- und **xs:include**-Elementen sowie **xsi:schemaLocation**- und **xsi:noNamespaceSchemaLocation**-Attributen verwendet wird. |
| [SkipToEndElement](./skiptoendelement/)(const SharedPtr\<XmlSchemaInfo\>\&) | Überspringt die Validierung des aktuellen Elementinhalts und bereitet das [XmlSchemaValidator](./)-Objekt vor, um Inhalte im Kontext des übergeordneten Elements zu validieren. |
| [ValidateAttribute](./validateattribute/)(const String\&, const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) | Validiert den Attributnamen, den Namespace-URI und den Wert im Kontext des aktuellen Elements. |
| [ValidateAttribute](./validateattribute/)(const String\&, const String\&, XmlValueGetter, const SharedPtr\<XmlSchemaInfo\>\&) | Validiert den Attributnamen, den Namespace-URI und den Wert im Kontext des aktuellen Elements. |
| [ValidateElement](./validateelement/)(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) | Validiert das Element im aktuellen Kontext. |
| [ValidateElement](./validateelement/)(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) | Validiert das Element im aktuellen Kontext mit den angegebenen Attributwerten **xsi:Type**, **xsi:Nil**, **xsi:SchemaLocation** und **xsi:NoNamespaceSchemaLocation**. |
| [ValidateEndElement](./validateendelement/)(const SharedPtr\<XmlSchemaInfo\>\&) | Überprüft, ob der Textinhalt des Elements gemäß seinem Datentyp für Elemente mit einfachem Inhalt gültig ist, und prüft, ob der Inhalt des aktuellen Elements für Elemente mit komplexem Inhalt vollständig ist. |
| [ValidateEndElement](./validateendelement/)(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) | Überprüft, ob der angegebene Textinhalt des Elements gemäß seinem Datentyp gültig ist. |
| [ValidateEndOfAttributes](./validateendofattributes/)(const SharedPtr\<XmlSchemaInfo\>\&) | Überprüft, ob alle erforderlichen Attribute im Kontext des Elements vorhanden sind, und bereitet das [XmlSchemaValidator](./)-Objekt vor, um den Kindinhalt des Elements zu validieren. |
| [ValidateText](./validatetext/)(const String\&) | Validiert, ob die angegebene Text-**string** im Kontext des aktuellen Elements zulässig ist, und sammelt den Text zur Validierung, wenn das aktuelle Element einfachen Inhalt hat. |
| [ValidateText](./validatetext/)(XmlValueGetter) | Validiert, ob der vom angegebenen [XmlValueGetter](../xmlvaluegetter/)-Objekt zurückgegebene Text im Kontext des aktuellen Elements zulässig ist, und sammelt den Text zur Validierung, wenn das aktuelle Element einfachen Inhalt hat. |
| [ValidateWhitespace](./validatewhitespace/)(const String\&) | Validiert, ob der im angegebenen **string** enthaltene Whitespace im Kontext des aktuellen Elements zulässig ist, und sammelt den Whitespace zur Validierung, wenn das aktuelle Element einfachen Inhalt hat. |
| [ValidateWhitespace](./validatewhitespace/)(XmlValueGetter) | Validiert, ob der vom angegebenen [XmlValueGetter](../xmlvaluegetter/)-Objekt zurückgegebene Whitespace im Kontext des aktuellen Elements zulässig ist, und sammelt den Whitespace zur Validierung, wenn das aktuelle Element einfachen Inhalt hat. |
| [XmlSchemaValidator](./xmlschemavalidator/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlSchemaSet\>\&, const SharedPtr\<IXmlNamespaceResolver\>\&, XmlSchemaValidationFlags) | Initialisiert eine neue Instanz der Klasse [XmlSchemaValidator](./). |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
