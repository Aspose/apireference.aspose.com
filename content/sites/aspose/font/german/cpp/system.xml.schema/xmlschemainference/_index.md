---
title: "System::Xml::Schema::XmlSchemaInference Klasse"
linktitle: "XmlSchemaInference"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaInference Klasse. Leitet ein XML Schema Definition Language (XSD)-Schema aus einem XML-Dokument ab. Die XmlSchemaInference Klasse kann in C++ nicht vererbt werden."
type: docs
weight: 3700
url: /de/cpp/system.xml.schema/xmlschemainference/
---
## XmlSchemaInference class


Leitet ein XML [Schema](../) Definition Language (XSD)-Schema aus einem XML-Dokuments ab. Die [XmlSchemaInference](./) Klasse kann nicht vererbt werden.

```cpp
class XmlSchemaInference : public System::Object
```

## Enums

| Aufzählung | Beschreibung |
| --- | --- |
| [InferenceOption](./inferenceoption/) | Beeinflusst das Auftreten und die Typinformationen, die von der [XmlSchemaInference](./) Klasse für Elemente und Attribute in einem XML-Dokument abgeleitet werden. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Occurrence](./get_occurrence/)() | Gibt den Wert von [XmlSchemaInference::InferenceOption](./inferenceoption/) zurück, der die aus dem XML-Dokument abgeleiteten Vorkommensdeklarationen des Schemas beeinflusst. |
| [get_TypeInference](./get_typeinference/)() | Gibt den Wert von [XmlSchemaInference::InferenceOption](./inferenceoption/) zurück, der die aus dem XML-Dokument abgeleiteten Typen beeinflusst. |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&) | Leitet ein XML [Schema](../) Definition Language (XSD)-Schema aus dem XML-Dokument ab, das im angegebenen [XmlReader](../../system.xml/xmlreader/) Objekt enthalten ist. |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) | Leitet ein XML [Schema](../) Definition Language (XSD)-Schema aus dem im angegebenen [XmlReader](../../system.xml/xmlreader/) Objekt enthaltenen XML-Dokument ab und verfeinert das abgeleitete Schema mithilfe eines vorhandenen Schemas im angegebenen [XmlSchemaSet](../xmlschemaset/) Objekt mit demselben Zielnamensraum. |
| [set_Occurrence](./set_occurrence/)(XmlSchemaInference::InferenceOption) | Setzt den Wert von [XmlSchemaInference::InferenceOption](./inferenceoption/), der die aus dem XML-Dokument abgeleiteten Vorkommensdeklarationen des Schemas beeinflusst. |
| [set_TypeInference](./set_typeinference/)(XmlSchemaInference::InferenceOption) | Setzt den Wert von [XmlSchemaInference::InferenceOption](./inferenceoption/), der die aus dem XML-Dokument abgeleiteten Typen beeinflusst. |
| [XmlSchemaInference](./xmlschemainference/)() | Initialisiert eine neue Instanz der [XmlSchemaInference](./) Klasse. |
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
