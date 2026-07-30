---
title: "System::Xml::Schema::XmlSchemaElement Klasse"
linktitle: "XmlSchemaElement"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaElement Klasse. Stellt das element element aus XML Schema dar, wie vom World Wide Web Consortium (W3C) festgelegt. Diese Klasse ist die Basisklasse für alle Partikeltypen und wird verwendet, um ein Element in einem XML-Dokument in C++ zu beschreiben."
type: docs
weight: 2600
url: /de/cpp/system.xml.schema/xmlschemaelement/
---
## XmlSchemaElement class


Stellt das **element**-Element aus XML [Schema](../) dar, wie vom World Wide [Web](../../system.web/) Consortium (W3C) festgelegt. Diese Klasse ist die Basisklasse für alle Partikeltypen und wird verwendet, um ein Element in einem XML-Dokument zu beschreiben.

```cpp
class XmlSchemaElement : public System::Xml::Schema::XmlSchemaParticle
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Block](./get_block/)() | Gibt eine **Block**-Ableitung zurück. |
| [get_BlockResolved](./get_blockresolved/)() | Gibt die nach der Kompilierung erfolgte Interpretation des **Block**-Werts zurück. |
| [get_Constraints](./get_constraints/)() | Gibt die Sammlung von Einschränkungen für das Element zurück. |
| [get_DefaultValue](./get_defaultvalue/)() | Gibt den Standardwert des Elements zurück, wenn sein Inhalt ein einfacher Typ ist oder der Inhalt des Elements **textOnly** ist. |
| [get_ElementSchemaType](./get_elementschematype/)() | Gibt ein [XmlSchemaType](../xmlschematype/) Objekt zurück, das den Typ des Elements basierend auf den Werten von [XmlSchemaElement::get_SchemaType](./get_schematype/) oder [XmlSchemaElement::get_SchemaTypeName](./get_schematypename/) des Elements darstellt. |
| [get_ElementType](./get_elementtype/)() | Gibt ein Objekt zurück, das auf dem [XmlSchemaElement](./) oder [XmlSchemaElement](./) des Elements basiert und die nach der Kompilierung erfolgte Interpretation des **ElementType**‑Werts enthält. |
| [get_Final](./get_final/)() | Gibt den **Final**‑Wert zurück, um anzuzeigen, dass keine weiteren Ableitungen erlaubt sind. |
| [get_FinalResolved](./get_finalresolved/)() | Gibt die nach der Kompilierung erfolgte Interpretation des **Final**‑Werts zurück. |
| [get_FixedValue](./get_fixedvalue/)() | Gibt den festen Wert zurück. |
| [get_Form](./get_form/)() | Gibt die Form für das Element zurück. |
| [get_IsAbstract](./get_isabstract/)() | Gibt Informationen zurück, um anzuzeigen, ob das Element in einem Instanzdokument verwendet werden kann. |
| [get_IsNillable](./get_isnillable/)() | Gibt Informationen zurück, die anzeigen, ob **xsi:nil** in den Instanzdaten auftreten kann. Gibt an, ob dem Element ein expliziter Nil‑Wert zugewiesen werden kann. |
| [get_Name](./get_name/)() | Gibt den Namen des Elements zurück. |
| [get_QualifiedName](./get_qualifiedname/)() | Gibt den tatsächlichen qualifizierten Namen für das angegebene Element zurück. |
| [get_RefName](./get_refname/)() | Gibt den Referenznamen eines in diesem Schema (oder einem anderen durch den angegebenen Namespace bezeichneten Schema) deklarierten Elements zurück. |
| [get_SchemaType](./get_schematype/)() | Gibt den Typ des Elements zurück. Dies kann entweder ein komplexer Typ oder ein einfacher Typ sein. |
| [get_SchemaTypeName](./get_schematypename/)() | Gibt den Namen eines im Schema (oder einem anderen durch den angegebenen Namespace bezeichneten Schema) definierten eingebauten Datentyps zurück. |
| [get_SubstitutionGroup](./get_substitutiongroup/)() | Gibt den Namen eines Elements zurück, das durch dieses Element ersetzt wird. |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | Setzt eine **Block**‑Ableitung. |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | Setzt den Standardwert des Elements, wenn sein Inhalt ein einfacher Typ ist oder der Inhalt des Elements **textOnly** ist. |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | Setzt den **Final**‑Wert, um anzuzeigen, dass keine weiteren Ableitungen erlaubt sind. |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | Setzt den festen Wert. |
| [set_Form](./set_form/)(XmlSchemaForm) | Setzt die Form für das Element. |
| [set_IsAbstract](./set_isabstract/)(bool) | Setzt Informationen, um anzuzeigen, ob das Element in einem Instanzdokument verwendet werden kann. |
| [set_IsNillable](./set_isnillable/)(bool) | Setzt Informationen, die anzeigen, ob **xsi:nil** in den Instanzdaten auftreten kann. Gibt an, ob dem Element ein expliziter Nil‑Wert zugewiesen werden kann. |
| [set_Name](./set_name/)(const String\&) | Setzt den Namen des Elements. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Setzt den Referenznamen eines in diesem Schema (oder einem anderen durch den angegebenen Namespace bezeichneten Schema) deklarierten Elements. |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | Legt den Typ des Elements fest. Dies kann entweder ein komplexer Typ oder ein einfacher Typ sein. |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Legt den Namen eines integrierten Datentyps fest, der in diesem Schema oder einem anderen durch den angegebenen Namespace angegebenen Schema definiert ist. |
| [set_SubstitutionGroup](./set_substitutiongroup/)(const SharedPtr\<XmlQualifiedName\>\&) | Legt den Namen eines Elements fest, das durch dieses Element ersetzt wird. |
| [XmlSchemaElement](./xmlschemaelement/)() | Initialisiert eine neue Instanz der Klasse [XmlSchemaElement](./). |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
