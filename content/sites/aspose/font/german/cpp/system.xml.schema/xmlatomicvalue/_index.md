---
title: "System::Xml::Schema::XmlAtomicValue Klasse"
linktitle: "XmlAtomicValue"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlAtomicValue Klasse. Stellt den typisierten Wert eines validierten XML-Elements oder -Attributs dar. Die XmlAtomicValue Klasse kann in C++ nicht geerbt werden."
type: docs
weight: 300
url: /de/cpp/system.xml.schema/xmlatomicvalue/
---
## XmlAtomicValue class


Stellt den typisierten Wert eines validierten XML-Elements oder -Attributs dar. Die Klasse [XmlAtomicValue](./) kann nicht geerbt werden.

```cpp
class XmlAtomicValue : public System::Xml::XPath::XPathItem
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() | Gibt eine Kopie dieses [XmlAtomicValue](./)-Objekts zurück. |
| [get_IsNode](./get_isnode/)() override | Gibt einen Wert zurück, der angibt, ob das validierte XML-Element oder -Attribut ein [XPath](../../system.xml.xpath/)-Knoten oder ein atomarer Wert ist. |
| [get_TypedValue](./get_typedvalue/)() override | Gibt das aktuelle validierte XML-Element oder -Attribut als ein verpacktes Objekt des am besten geeigneten Typs gemäß seinem Schemata-Typ zurück. |
| [get_Value](./get_value/)() override | Gibt den [String](../../system/string/) Wert des validierten XML-Elements oder -Attributs zurück. |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | Gibt den Wert des validierten XML-Elements oder -Attributs als [Boolean](../../system/boolean/) zurück. |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | Gibt den Wert des validierten XML-Elements oder -Attributs als [DateTime](../../system/datetime/) zurück. |
| [get_ValueAsDouble](./get_valueasdouble/)() override | Gibt den Wert des validierten XML-Elements oder -Attributs als [Double](../../system/double/) zurück. |
| [get_ValueAsInt](./get_valueasint/)() override | Gibt den Wert des validierten XML-Elements oder -Attributs als [Int32](../../system/int32/) zurück. |
| [get_ValueAsLong](./get_valueaslong/)() override | Gibt den Wert des validierten XML-Elements oder -Attributs als [Int64](../../system/int64/) zurück. |
| [get_ValueType](./get_valuetype/)() override | Gibt den Typ des validierten XML-Elements oder -Attributs zurück. |
| [get_XmlType](./get_xmltype/)() override | Gibt den [XmlSchemaType](../xmlschematype/) für das validierte XML-Element oder -Attribut zurück. |
| [ToString](./tostring/)() const override | Gibt den [String](../../system/string/) Wert des validierten XML-Elements oder -Attributs zurück. |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | Gibt den Wert des validierten XML-Elements oder -Attributs als den mit dem [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) Objekt angegebenen Typ zurück, das zur Auflösung von Namespace-Präfixen verwendet wird. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XPathItem](../../system.xml.xpath/xpathitem/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
