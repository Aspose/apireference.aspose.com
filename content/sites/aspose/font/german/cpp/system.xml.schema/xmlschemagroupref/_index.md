---
title: "System::Xml::Schema::XmlSchemaGroupRef Klasse"
linktitle: "XmlSchemaGroupRef"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaGroupRef Klasse. Stellt das Gruppenelement mit dem ref-Attribut aus dem XML Schema dar, wie vom World Wide Web Consortium (W3C) festgelegt. Diese Klasse wird innerhalb komplexer Typen verwendet, die eine auf Schemaebene definierte Gruppe in C++ referenzieren."
type: docs
weight: 3300
url: /de/cpp/system.xml.schema/xmlschemagroupref/
---
## XmlSchemaGroupRef class


Stellt das **group**-Element mit dem **ref**-Attribut aus dem XML [Schema](../) dar, wie vom World Wide [Web](../../system.web/) Consortium (W3C) festgelegt. Diese Klasse wird innerhalb komplexer Typen verwendet, die eine **group** auf **schema**-Ebene referenzieren.

```cpp
class XmlSchemaGroupRef : public System::Xml::Schema::XmlSchemaParticle
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Particle](./get_particle/)() | Gibt eine der Klassen [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) oder [XmlSchemaSequence](../xmlschemasequence/) zurück, die die nach der Kompilierung interpretierte **Particle**-Wert enthält. |
| [get_RefName](./get_refname/)() | Gibt den Namen einer in diesem Schema definierten Gruppe zurück (oder einer anderen durch den angegebenen Namespace angegebenen Schema). |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Legt den Namen einer Gruppe fest, die in diesem Schema definiert ist (oder in einem anderen Schema, das durch den angegebenen Namespace angegeben wird). |
| [XmlSchemaGroupRef](./xmlschemagroupref/)() | Initialisiert eine neue Instanz der Klasse [XmlSchemaGroupRef](./). |
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
