---
title: "System::Xml::Schema::IXmlSchemaInfo Klasse"
linktitle: "IXmlSchemaInfo"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::IXmlSchemaInfo Klasse. Definiert das Infoset nach der Schema‑Validierung eines validierten XML‑Knotens in C++."
type: docs
weight: 100
url: /de/cpp/system.xml.schema/ixmlschemainfo/
---
## IXmlSchemaInfo class


Definiert das Post‑Schema‑Validierungs‑Infoset eines validierten XML‑Knotens.

```cpp
class IXmlSchemaInfo : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [get_IsDefault](./get_isdefault/)() | Gibt einen Wert zurück, der angibt, ob dieser validierte XML‑Knoten als Ergebnis einer während der XML‑[Schema](../) Definition Language (XSD) Schema‑Validierung angewendeten Vorgabe gesetzt wurde. |
| virtual [get_IsNil](./get_isnil/)() | Gibt einen Wert zurück, der angibt, ob der Wert dieses validierten XML‑Knotens **nil** ist. |
| virtual [get_MemberType](./get_membertype/)() | Gibt den dynamischen Schematyp für diesen validierten XML‑Knoten zurück. |
| virtual [get_SchemaAttribute](./get_schemaattribute/)() | Gibt das kompilierte [XmlSchemaAttribute](../xmlschemaattribute/) zurück, das diesem validierten XML‑Knoten entspricht. |
| virtual [get_SchemaElement](./get_schemaelement/)() | Gibt das kompilierte [XmlSchemaElement](../xmlschemaelement/) zurück, das diesem validierten XML‑Knoten entspricht. |
| virtual [get_SchemaType](./get_schematype/)() | Gibt den statischen XML‑[Schema](../) Definition Language (XSD) Schematyp dieses validierten XML‑Knotens zurück. |
| virtual [get_Validity](./get_validity/)() | Gibt den Wert [XmlSchemaValidity](../xmlschemavalidity/) dieses validierten XML‑Knotens zurück. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
