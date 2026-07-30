---
title: "System::Xml::XmlReaderSettings Klasse"
linktitle: "XmlReaderSettings"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlReaderSettings Klasse. Gibt einen Satz von Funktionen an, die für das XmlReader-Objekt unterstützt werden, das durch die XmlReader::Create-Methode in C++ erstellt wird."
type: docs
weight: 3400
url: /de/cpp/system.xml/xmlreadersettings/
---
## XmlReaderSettings class


Gibt einen Satz von Funktionen an, die für das [XmlReader](../xmlreader/) Objekt unterstützt werden, das durch die [XmlReader::Create](../xmlreader/create/) Methode erstellt wird.

```cpp
class XmlReaderSettings : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CheckReadOnly](./checkreadonly/)(const String\&) |  |
| [Clone](./clone/)() | Erstellt eine Kopie der [XmlReaderSettings](./)-Instanz. |
| [get_CheckCharacters](./get_checkcharacters/)() | Gibt einen Wert zurück, der angibt, ob eine Zeichenprüfung durchgeführt werden soll. |
| [get_CloseInput](./get_closeinput/)() | Gibt einen Wert zurück, der angibt, ob der zugrunde liegende Stream oder TextReader geschlossen werden soll, wenn der Reader geschlossen wird. |
| [get_ConformanceLevel](./get_conformancelevel/)() | Gibt das Konformitätsniveau zurück, dem der [XmlReader](../xmlreader/) entsprechen wird. |
| [get_DtdProcessing](./get_dtdprocessing/)() | Gibt einen Wert zurück, der die Verarbeitung von DTDs bestimmt. |
| [get_IgnoreComments](./get_ignorecomments/)() | Gibt einen Wert zurück, der angibt, ob Kommentare ignoriert werden sollen. |
| [get_IgnoreProcessingInstructions](./get_ignoreprocessinginstructions/)() | Gibt einen Wert zurück, der angibt, ob Verarbeitungsanweisungen ignoriert werden sollen. |
| [get_IgnoreWhitespace](./get_ignorewhitespace/)() | Gibt einen Wert zurück, der angibt, ob unbedeutende Leerzeichen ignoriert werden sollen. |
| [get_LineNumberOffset](./get_linenumberoffset/)() | Gibt den Zeilennummer-Offset des [XmlReader](../xmlreader/)-Objekts zurück. |
| [get_LinePositionOffset](./get_linepositionoffset/)() | Gibt den Zeilenpositions-Offset des [XmlReader](../xmlreader/)-Objekts zurück. |
| [get_MaxCharactersFromEntities](./get_maxcharactersfromentities/)() | Gibt einen Wert zurück, der die maximal zulässige Anzahl von Zeichen in einem Dokument angibt, die durch das Erweitern von Entitäten entstehen. |
| [get_MaxCharactersInDocument](./get_maxcharactersindocument/)() | Gibt einen Wert zurück, der die maximal zulässige Anzahl von Zeichen in einem XML-Dokument angibt. Ein Wert von null (0) bedeutet, dass es keine Begrenzung der Größe des XML-Dokuments gibt. Ein von null verschiedener Wert gibt die maximale Größe in Zeichen an. |
| [get_NameTable](./get_nametable/)() | Gibt die [XmlNameTable](../xmlnametable/) zurück, die für atomisierte Zeichenkettenvergleiche verwendet wird. |
| [get_ProhibitDtd](./get_prohibitdtd/)() | Gibt einen Wert zurück, der angibt, ob die Verarbeitung von Document Type Definition (DTD) verboten werden soll. |
| [get_Schemas](./get_schemas/)() | Gibt das XmlSchemaSet zurück, das bei der Durchführung einer Schema‑Validierung verwendet wird. |
| [get_ValidationFlags](./get_validationflags/)() | Gibt einen Wert zurück, der die Einstellungen zur Schema‑Validierung angibt. Diese Einstellung gilt für [XmlReader](../xmlreader/)-Objekte, die Schemata validieren ([XmlReaderSettings::get_ValidationType](./get_validationtype/)-Wert ist [ValidationType::Schema](../validationtype/)). |
| [get_ValidationType](./get_validationtype/)() | Gibt einen Wert zurück, der angibt, ob der [XmlReader](../xmlreader/) beim Lesen eine Validierung oder Typzuweisung durchführt. |
| [Reset](./reset/)() | Setzt die Mitglieder der Einstellungs‑Klasse auf ihre Standardwerte zurück. |
| [set_CheckCharacters](./set_checkcharacters/)(bool) | Setzt einen Wert, der angibt, ob eine Zeichenprüfung durchgeführt werden soll. |
| [set_CloseInput](./set_closeinput/)(bool) | Setzt einen Wert, der angibt, ob der zugrunde liegende Stream oder TextReader geschlossen werden soll, wenn der Reader geschlossen wird. |
| [set_ConformanceLevel](./set_conformancelevel/)(System::Xml::ConformanceLevel) | Setzt das Konformitätsniveau, dem der [XmlReader](../xmlreader/) entsprechen wird. |
| [set_DtdProcessing](./set_dtdprocessing/)(System::Xml::DtdProcessing) | Setzt einen Wert, der die Verarbeitung von DTDs bestimmt. |
| [set_IgnoreComments](./set_ignorecomments/)(bool) | Setzt einen Wert, der angibt, ob Kommentare ignoriert werden sollen. |
| [set_IgnoreProcessingInstructions](./set_ignoreprocessinginstructions/)(bool) | Setzt einen Wert, der angibt, ob Verarbeitungsanweisungen ignoriert werden sollen. |
| [set_IgnoreWhitespace](./set_ignorewhitespace/)(bool) | Setzt einen Wert, der angibt, ob unbedeutende Leerzeichen ignoriert werden sollen. |
| [set_LineNumberOffset](./set_linenumberoffset/)(int32_t) | Setzt den Zeilennummer-Offset des [XmlReader](../xmlreader/)-Objekts. |
| [set_LinePositionOffset](./set_linepositionoffset/)(int32_t) | Legt den Zeilenpositionsversatz des [XmlReader](../xmlreader/)-Objekts fest. |
| [set_MaxCharactersFromEntities](./set_maxcharactersfromentities/)(int64_t) | Legt einen Wert fest, der die maximal zulässige Anzahl von Zeichen in einem Dokument angibt, die durch das Erweitern von Entitäten entstehen. |
| [set_MaxCharactersInDocument](./set_maxcharactersindocument/)(int64_t) | Legt einen Wert fest, der die maximal zulässige Anzahl von Zeichen in einem XML-Dokument angibt. Ein Wert von Null (0) bedeutet keine Begrenzung der Größe des XML-Dokuments. Ein von Null verschiedener Wert gibt die maximale Größe in Zeichen an. |
| [set_NameTable](./set_nametable/)(const SharedPtr\<XmlNameTable\>\&) | Legt die für atomisierte Zeichenkettenvergleiche verwendete [XmlNameTable](../xmlnametable/) fest. |
| [set_ProhibitDtd](./set_prohibitdtd/)(bool) | Legt einen Wert fest, der angibt, ob die Verarbeitung von Document Type Definition (DTD) verboten werden soll. |
| [set_Schemas](./set_schemas/)(const SharedPtr\<Schema::XmlSchemaSet\>\&) | Legt das XmlSchemaSet fest, das bei der Durchführung der Schema‑Validierung verwendet werden soll. |
| [set_ValidationFlags](./set_validationflags/)(Schema::XmlSchemaValidationFlags) | Legt einen Wert fest, der die Schema‑Validierungseinstellungen angibt. Diese Einstellung gilt für [XmlReader](../xmlreader/)-Objekte, die Schemata validieren ([XmlReaderSettings::get_ValidationType](./get_validationtype/)-Wert ist [ValidationType::Schema](../validationtype/)). |
| [set_ValidationType](./set_validationtype/)(System::Xml::ValidationType) | Legt einen Wert fest, der angibt, ob der [XmlReader](../xmlreader/) beim Lesen eine Validierung oder Typzuweisung durchführen soll. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Legt den zum Zugriff auf externe Dokumente verwendeten [XmlResolver](../xmlresolver/) fest. |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | Fügt einen Ereignishandler hinzu, der ausgelöst wird, wenn der Leser Validierungsfehler feststellt. |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | Entfernt einen Ereignishandler, der ausgelöst wird, wenn der Leser Validierungsfehler feststellt. |
| [XmlReaderSettings](./xmlreadersettings/)() | Initialisiert eine neue Instanz der Klasse [XmlReaderSettings](./). |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
