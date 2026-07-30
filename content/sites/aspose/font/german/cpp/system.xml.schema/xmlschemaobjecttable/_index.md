---
title: "System::Xml::Schema::XmlSchemaObjectTable Klasse"
linktitle: "XmlSchemaObjectTable"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaObjectTable Klasse. Stellt die Sammlungen für enthaltene Elemente in der XmlSchema Klasse bereit (zum Beispiel Attribute, AttributeGroups, Elemente und so weiter) in C++."
type: docs
weight: 5300
url: /de/cpp/system.xml.schema/xmlschemaobjecttable/
---
## XmlSchemaObjectTable class


Stellt die Sammlungen für enthaltene Elemente in der [XmlSchema](../xmlschema/) Klasse bereit (zum Beispiel Attribute, AttributeGroups, Elemente und so weiter).

```cpp
class XmlSchemaObjectTable : public System::Collections::Generic::IEnumerable<System::Collections::Generic::KeyValuePair<SharedPtr<System::Xml::XmlQualifiedName>, SharedPtr<System::Xml::Schema::XmlSchemaObject>>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Contains](./contains/)(const SharedPtr\<XmlQualifiedName\>\&) | Bestimmt, ob der angegebene qualifizierte Name in der Sammlung existiert. |
| [get_Count](./get_count/)() | Gibt die Anzahl der im [XmlSchemaObjectTable](./) enthaltenen Elemente zurück. |
| [get_Names](./get_names/)() | Gibt eine Sammlung aller benannten Elemente im [XmlSchemaObjectTable](./) zurück. |
| [get_Values](./get_values/)() | Gibt eine Sammlung aller Werte für alle Elemente im [XmlSchemaObjectTable](./) zurück. |
| [GetEnumerator](./getenumerator/)() override | Gibt einen Enumerator zurück, der das [XmlSchemaObjectTable](./) durchlaufen kann. |
| [idx_get](./idx_get/)(const SharedPtr\<XmlQualifiedName\>\&) | Gibt das Element im [XmlSchemaObjectTable](./) zurück, das durch den qualifizierten Namen angegeben ist. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
