---
title: "System::Xml::Schema::XmlSchemaGroupRef class"
linktitle: "XmlSchemaGroupRef"
second_title: "Aspose.Page für C++"
description: "System::Xml::Schema::XmlSchemaGroupRef class. Stellt das group‑Element mit ref‑Attribut aus dem XML‑Schema dar, wie vom World Wide Web Consortium (W3C) spezifiziert. Diese Klasse wird innerhalb komplexer Typen verwendet, die auf ein im Schemaniveau definiertes group verweisen, in C++."
type: docs
weight: 3300
url: /de/cpp/system.xml.schema/xmlschemagroupref/
---
## XmlSchemaGroupRef class


Stellt das **group**‑Element mit **ref**‑Attribut aus dem XML [Schema](../) dar, wie vom World Wide [Web](../../system.web/) Consortium (W3C) spezifiziert. Diese Klasse wird innerhalb komplexer Typen verwendet, die ein **group** auf **schema**‑Ebene referenzieren.

```cpp
class XmlSchemaGroupRef : public System::Xml::Schema::XmlSchemaParticle
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Particle](./get_particle/)() | Gibt eine der Klassen [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) oder [XmlSchemaSequence](../xmlschemasequence/) zurück, die die nach der Kompilierung interpretierte **Particle**‑Wert enthält. |
| [get_RefName](./get_refname/)() | Gibt den Namen einer in diesem Schema definierten Gruppe zurück (oder eines anderen Schemas, das durch den angegebenen Namensraum angegeben ist). |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Legt den Namen einer in diesem Schema definierten Gruppe fest (oder eines anderen Schemas, das durch den angegebenen Namensraum angegeben ist). |
| [XmlSchemaGroupRef](./xmlschemagroupref/)() | Initialisiert eine neue Instanz der [XmlSchemaGroupRef](./)-Klasse. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared-Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
