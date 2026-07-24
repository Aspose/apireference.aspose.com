---
title: "System::Xml::Schema::XmlSchemaInfo Klasse"
linktitle: "XmlSchemaInfo"
second_title: "Aspose.Page für C++"
description: "System::Xml::Schema::XmlSchemaInfo Klasse. Stellt das Post-Schema-Validierungs-Infoset eines validierten XML-Knotens in C++ dar."
type: docs
weight: 3800
url: /de/cpp/system.xml.schema/xmlschemainfo/
---
## XmlSchemaInfo class


Stellt das Post‑Schema‑Validierungs‑Infoset eines validierten XML‑Knotens dar.

```cpp
class XmlSchemaInfo : public System::Xml::Schema::IXmlSchemaInfo
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_ContentType](./get_contenttype/)() | Gibt das Objekt [XmlSchemaContentType](../xmlschemacontenttype/) zurück, das dem Inhaltstyp dieses validierten XML-Knotens entspricht. |
| [get_IsDefault](./get_isdefault/)() override | Gibt einen Wert zurück, der angibt, ob dieser validierte XML-Knoten als Ergebnis einer während der XML [Schema](../) Definition Language (XSD)-Schema-Validierung angewendeten Vorgabe gesetzt wurde. |
| [get_IsNil](./get_isnil/)() override | Gibt einen Wert zurück, der angibt, ob der Wert dieses validierten XML-Knotens **nil** ist. |
| [get_MemberType](./get_membertype/)() override | Gibt den dynamischen Schematyp für diesen validierten XML-Knoten zurück. |
| [get_SchemaAttribute](./get_schemaattribute/)() override | Gibt das kompilierte Objekt [XmlSchemaAttribute](../xmlschemaattribute/) zurück, das diesem validierten XML-Knoten entspricht. |
| [get_SchemaElement](./get_schemaelement/)() override | Gibt das kompilierte Objekt [XmlSchemaElement](../xmlschemaelement/) zurück, das diesem validierten XML-Knoten entspricht. |
| [get_SchemaType](./get_schematype/)() override | Gibt den statischen XML [Schema](../) Definition Language (XSD)-Schematyp dieses validierten XML-Knotens zurück. |
| [get_Validity](./get_validity/)() override | Gibt den [XmlSchemaValidity](../xmlschemavalidity/) Wert dieses validierten XML-Knotens zurück. |
| [set_ContentType](./set_contenttype/)(XmlSchemaContentType) | Legt das [XmlSchemaContentType](../xmlschemacontenttype/) Objekt fest, das dem Inhaltstyp dieses validierten XML-Knotens entspricht. |
| [set_IsDefault](./set_isdefault/)(bool) | Legt einen Wert fest, der angibt, ob dieser validierte XML-Knoten als Ergebnis einer während der XML [Schema](../) Definition Language (XSD) Schema-Validierung angewendeten Vorgabe gesetzt wurde. |
| [set_IsNil](./set_isnil/)(bool) | Legt einen Wert fest, der angibt, ob der Wert dieses validierten XML-Knotens **nil** ist. |
| [set_MemberType](./set_membertype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Legt den dynamischen Schematyp für diesen validierten XML-Knoten fest. |
| [set_SchemaAttribute](./set_schemaattribute/)(const SharedPtr\<XmlSchemaAttribute\>\&) | Legt das kompilierte [XmlSchemaAttribute](../xmlschemaattribute/) Objekt fest, das diesem validierten XML-Knoten entspricht. |
| [set_SchemaElement](./set_schemaelement/)(const SharedPtr\<XmlSchemaElement\>\&) | Legt das kompilierte [XmlSchemaElement](../xmlschemaelement/) Objekt fest, das diesem validierten XML-Knoten entspricht. |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | Legt den statischen XML [Schema](../) Definition Language (XSD) Schematyp dieses validierten XML-Knotens fest. |
| [set_Validity](./set_validity/)(XmlSchemaValidity) | Legt den [XmlSchemaValidity](../xmlschemavalidity/) Wert dieses validierten XML-Knotens fest. |
| [XmlSchemaInfo](./xmlschemainfo/)() | Initialisiert eine neue Instanz der [XmlSchemaInfo](./) Klasse. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared-Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [IXmlSchemaInfo](../ixmlschemainfo/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
