---
title: "System::Xml::Schema::XmlSchemaComplexType Klasse"
linktitle: "XmlSchemaComplexType"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaComplexType Klasse. Stellt das complexType-Element aus XML Schema dar, wie vom World Wide Web Consortium (W3C) festgelegt. Diese Klasse definiert einen komplexen Typ, der die Menge der Attribute und den Inhalt eines Elements in C++ bestimmt."
type: docs
weight: 2100
url: /de/cpp/system.xml.schema/xmlschemacomplextype/
---
## XmlSchemaComplexType class


Stellt das **complexType**-Element aus XML [Schema](../) dar, wie vom World Wide [Web](../../system.web/) Consortium (W3C) festgelegt. Diese Klasse definiert einen komplexen Typ, der die Menge der Attribute und den Inhalt eines Elements bestimmt.

```cpp
class XmlSchemaComplexType : public System::Xml::Schema::XmlSchemaType
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Gibt den Wert für die Komponente [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) des komplexen Typs zurück. |
| [get_Attributes](./get_attributes/)() | Gibt die Auflistung der Attribute für den komplexen Typ zurück. |
| [get_AttributeUses](./get_attributeuses/)() | Gibt die Auflistung aller kompilierten Attribute dieses komplexen Typs und seiner Basistypen zurück. |
| [get_AttributeWildcard](./get_attributewildcard/)() | Gibt den post‑Kompilierungswert für **anyAttribute** dieses komplexen Typs und seiner Basistyp(en) zurück. |
| [get_Block](./get_block/)() | Gibt das **block**‑Attribut zurück. |
| [get_BlockResolved](./get_blockresolved/)() | Gibt den Wert zurück, nachdem der Typ zum post-schema-validation Informationssatz (Infoset) kompiliert wurde. Dieser Wert zeigt an, wie der Typ durchgesetzt wird, wenn **xsi:type** im Instanzdokument verwendet wird. |
| [get_ContentModel](./get_contentmodel/)() | Gibt das post-kompilierte [XmlSchemaContentModel](../xmlschemacontentmodel/) dieses komplexen Typs zurück. |
| [get_ContentType](./get_contenttype/)() | Gibt das Inhaltsmodell des komplexen Typs zurück, das den post-kompilierten Wert enthält. |
| [get_ContentTypeParticle](./get_contenttypeparticle/)() | Gibt das Partikel zurück, das den post-kompilierten Wert des [XmlSchemaComplexType::get_ContentType](./get_contenttype/) Partikels enthält. |
| [get_IsAbstract](./get_isabstract/)() | Gibt die Information zurück, die bestimmt, ob das **complexType**-Element im Instanzdokument verwendet werden kann. |
| [get_IsMixed](./get_ismixed/)() override | Gibt Informationen zurück, die bestimmen, ob der komplexe Typ ein gemischtes Inhaltsmodell (Markup innerhalb des Inhalts) hat. |
| [get_Particle](./get_particle/)() | Gibt den Kompositor‑Typ zurück als einen der Klassen [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) oder [XmlSchemaSequence](../xmlschemasequence/). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Setzt den Wert für die Komponente [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) des komplexen Typs. |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | Setzt das **block**‑Attribut. |
| [set_ContentModel](./set_contentmodel/)(const SharedPtr\<XmlSchemaContentModel\>\&) | Setzt das post-kompilierte [XmlSchemaContentModel](../xmlschemacontentmodel/) dieses komplexen Typs. |
| [set_IsAbstract](./set_isabstract/)(bool) | Setzt die Information, die bestimmt, ob das **complexType**-Element im Instanzdokument verwendet werden kann. |
| [set_IsMixed](./set_ismixed/)(bool) override | Setzt Informationen, die bestimmen, ob der komplexe Typ ein gemischtes Inhaltsmodell (Markup innerhalb des Inhalts) hat. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | Setzt den Kompositor‑Typ als einen der Klassen [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) oder [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaComplexType](./xmlschemacomplextype/)() | Initialisiert eine neue Instanz der Klasse [XmlSchemaComplexType](./). |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
