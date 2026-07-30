---
title: "System::Xml::Schema::XmlSchemaKeyref Klasse"
linktitle: "XmlSchemaKeyref"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaKeyref class. Diese Klasse stellt das keyref-Element aus XMLSchema dar, wie vom World Wide Web Consortium (W3C) in C++ spezifiziert."
type: docs
weight: 4000
url: /de/cpp/system.xml.schema/xmlschemakeyref/
---
## XmlSchemaKeyref class


Diese Klasse stellt das **keyref**-Element aus XMLSchema dar, wie vom World Wide [Web](../../system.web/) Consortium (W3C) spezifiziert.

```cpp
class XmlSchemaKeyref : public System::Xml::Schema::XmlSchemaIdentityConstraint
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Refer](./get_refer/)() | Gibt den Namen des Schlüssels zurück, auf den diese Beschränkung in einem anderen einfachen oder komplexen Typ verweist. |
| [set_Refer](./set_refer/)(const SharedPtr\<XmlQualifiedName\>\&) | Legt den Namen des Schlüssels fest, auf den diese Beschränkung in einem anderen einfachen oder komplexen Typ verweist. |
| [XmlSchemaKeyref](./xmlschemakeyref/)() | Initialisiert eine neue Instanz der [XmlSchemaKeyref](./) Klasse. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlSchemaIdentityConstraint](../xmlschemaidentityconstraint/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
