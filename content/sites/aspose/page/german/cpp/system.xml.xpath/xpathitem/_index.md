---
title: "System::Xml::XPath::XPathItem Klasse"
linktitle: "XPathItem"
second_title: "Aspose.Page für C++"
description: "System::Xml::XPath::XPathItem Klasse. Stellt ein Element im XQuery 1.0 und XPath 2.0 Datenmodell in C++ dar."
type: docs
weight: 400
url: /de/cpp/system.xml.xpath/xpathitem/
---
## XPathItem class


Stellt ein Element im XQuery 1.0 und [XPath](../) 2.0 [Data](../../system.data/) Modell dar.

```cpp
class XPathItem : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [get_IsNode](./get_isnode/)() | Wenn in einer abgeleiteten Klasse überschrieben, liefert einen Wert, der angibt, ob das Element einen [XPath](../) Knoten oder einen atomaren Wert darstellt. |
| virtual [get_TypedValue](./get_typedvalue/)() | Wenn in einer abgeleiteten Klasse überschrieben, liefert das aktuelle Element als ein verpacktes Objekt des am besten geeigneten Typs gemäß seinem Schematyp. |
| virtual [get_Value](./get_value/)() | Wenn in einer abgeleiteten Klasse überschrieben, liefert den **string** Wert des Elements. |
| virtual [get_ValueAsBoolean](./get_valueasboolean/)() | Wenn in einer abgeleiteten Klasse überschrieben, liefert den Wert des Elements als [Boolean](../../system/boolean/). |
| virtual [get_ValueAsDateTime](./get_valueasdatetime/)() | Wenn in einer abgeleiteten Klasse überschrieben, liefert den Wert des Elements als [DateTime](../../system/datetime/). |
| virtual [get_ValueAsDouble](./get_valueasdouble/)() | Wenn in einer abgeleiteten Klasse überschrieben, liefert den Wert des Elements als [Double](../../system/double/). |
| virtual [get_ValueAsInt](./get_valueasint/)() | Wenn in einer abgeleiteten Klasse überschrieben, liefert den Wert des Elements als ein [Int32](../../system/int32/). |
| virtual [get_ValueAsLong](./get_valueaslong/)() | Wenn in einer abgeleiteten Klasse überschrieben, liefert den Wert des Elements als ein [Int64](../../system/int64/). |
| virtual [get_ValueType](./get_valuetype/)() | Wird in einer abgeleiteten Klasse überschrieben, gibt den Typ des Elements zurück. |
| virtual [get_XmlType](./get_xmltype/)() | Wenn in einer abgeleiteten Klasse überschrieben, liefert den XmlSchemaType für das Element. |
| virtual [ValueAs](./valueas/)(const TypeInfo\&) | Gibt den Wert des Elements als den angegebenen Typ zurück. |
| virtual [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Wenn in einer abgeleiteten Klasse überschrieben, gibt es den Wert des Elements als den mit dem [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) Objekt angegebenen Typ zurück, das zum Auflösen von Namespace‑Präfixen verwendet wird. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared-Pointer auf eine Instanz dieser Klasse. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
