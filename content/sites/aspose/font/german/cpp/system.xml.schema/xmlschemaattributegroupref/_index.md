---
title: "System::Xml::Schema::XmlSchemaAttributeGroupRef Klasse"
linktitle: "XmlSchemaAttributeGroupRef"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaAttributeGroupRef Klasse. Stellt das attributeGroup-Element mit dem ref-Attribut aus dem XML‑Schema dar, wie angegeben. AttributesGroupRef ist die Referenz für ein attributeGroup, die Eigenschaft name enthält die referenzierte Attributgruppe in C++."
type: docs
weight: 1300
url: /de/cpp/system.xml.schema/xmlschemaattributegroupref/
---
## XmlSchemaAttributeGroupRef class


Stellt das **attributeGroup**-Element mit dem **ref**-Attribut aus dem XML [Schema](../) dar, wie angegeben vom [World Wide Web Consortium (W3C)](https://go.microsoft.com/fwlink/?LinkId=49454). AttributesGroupRef ist die Referenz für ein attributeGroup, die Eigenschaft name enthält die referenzierte Attributgruppe.

```cpp
class XmlSchemaAttributeGroupRef : public System::Xml::Schema::XmlSchemaAnnotated
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_RefName](./get_refname/)() | Gibt den Namen des referenzierten **attributeGroup**-Elements zurück. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Setzt den Namen des referenzierten **attributeGroup**-Elements. |
| [XmlSchemaAttributeGroupRef](./xmlschemaattributegroupref/)() | Initialisiert eine neue Instanz der [XmlSchemaAttributeGroupRef](./) Klasse. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
