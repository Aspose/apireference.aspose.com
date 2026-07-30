---
title: "System::Xml::XPath::XPathItem Klasse"
linktitle: "XPathItem"
second_title: "Aspose.Font für C++"
description: "System::Xml::XPath::XPathItem Klasse. Stellt ein Element im XQuery 1.0‑ und XPath 2.0‑Datenmodell in C++ dar."
type: docs
weight: 400
url: /de/cpp/system.xml.xpath/xpathitem/
---
## XPathItem class


Stellt ein Element im XQuery 1.0 und [XPath](../) 2.0‑[Data](../../system.data/)‑Modell dar.

```cpp
class XPathItem : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [get_IsNode](./get_isnode/)() | Wird in einer abgeleiteten Klasse überschrieben, gibt einen Wert zurück, der angibt, ob das Element einen [XPath](../)‑Knoten oder einen atomaren Wert darstellt. |
| virtual [get_TypedValue](./get_typedvalue/)() | Wird in einer abgeleiteten Klasse überschrieben, gibt das aktuelle Element als ein verpacktes Objekt des am besten geeigneten Typs gemäß seinem Schematyp zurück. |
| virtual [get_Value](./get_value/)() | Wird in einer abgeleiteten Klasse überschrieben, gibt den **string**‑Wert des Elements zurück. |
| virtual [get_ValueAsBoolean](./get_valueasboolean/)() | Wird in einer abgeleiteten Klasse überschrieben, gibt den Wert des Elements als [Boolean](../../system/boolean/) zurück. |
| virtual [get_ValueAsDateTime](./get_valueasdatetime/)() | Wird in einer abgeleiteten Klasse überschrieben, gibt den Wert des Elements als [DateTime](../../system/datetime/) zurück. |
| virtual [get_ValueAsDouble](./get_valueasdouble/)() | Wird in einer abgeleiteten Klasse überschrieben, gibt den Wert des Elements als [Double](../../system/double/) zurück. |
| virtual [get_ValueAsInt](./get_valueasint/)() | Wird in einer abgeleiteten Klasse überschrieben, gibt den Wert des Elements als [Int32](../../system/int32/) zurück. |
| virtual [get_ValueAsLong](./get_valueaslong/)() | Wird in einer abgeleiteten Klasse überschrieben, gibt den Wert des Elements als [Int64](../../system/int64/) zurück. |
| virtual [get_ValueType](./get_valuetype/)() | Wird in einer abgeleiteten Klasse überschrieben, gibt den Typ des Elements zurück. |
| virtual [get_XmlType](./get_xmltype/)() | Wird in einer abgeleiteten Klasse überschrieben, gibt den XmlSchemaType für das Element zurück. |
| virtual [ValueAs](./valueas/)(const TypeInfo\&) | Gibt den Wert des Elements als den angegebenen Typ zurück. |
| virtual [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Wird in einer abgeleiteten Klasse überschrieben, gibt den Wert des Elements als den mit dem [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/)‑Objekt angegebenen Typ zurück, das zum Auflösen von Namensraum‑Präfixen verwendet wird. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
