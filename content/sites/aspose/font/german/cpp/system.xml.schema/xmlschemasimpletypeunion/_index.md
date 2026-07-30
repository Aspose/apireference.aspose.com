---
title: "System::Xml::Schema::XmlSchemaSimpleTypeUnion class"
linktitle: "XmlSchemaSimpleTypeUnion"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeUnion class. Stellt das Union-Element für einfache Typen aus dem XML Schema dar, wie vom World Wide Web Consortium (W3C) festgelegt. Ein Union-Datentyp kann verwendet werden, um den Inhalt eines simpleType zu spezifizieren. Der Wert des simpleType-Elements muss einer von einer Menge alternativer Datentypen sein, die im Union angegeben sind. Union-Typen sind stets abgeleitete Typen und müssen in C++ mindestens zwei alternative Datentypen umfassen."
type: docs
weight: 6600
url: /de/cpp/system.xml.schema/xmlschemasimpletypeunion/
---
## XmlSchemaSimpleTypeUnion class


Stellt das **union**-Element für einfache Typen aus dem XML [Schema](../) dar, wie vom World Wide [Web](../../system.web/) Consortium (W3C) festgelegt. Ein **union**-Datentyp kann verwendet werden, um den Inhalt eines **simpleType** zu spezifizieren. Der Wert des **simpleType**-Elements muss einer von einer Menge alternativer Datentypen sein, die im **union** angegeben sind. Union-Typen sind stets abgeleitete Typen und müssen mindestens zwei alternative Datentypen umfassen.

```cpp
class XmlSchemaSimpleTypeUnion : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_BaseMemberTypes](./get_basemembertypes/)() | Gibt ein Array von [XmlSchemaSimpleType](../xmlschemasimpletype/) Objekten zurück, die den Typ des **simpleType**-Elements basierend auf den Werten von [XmlSchemaSimpleTypeUnion::get_BaseTypes](./get_basetypes/) und [XmlSchemaSimpleTypeUnion::get_MemberTypes](./get_membertypes/) des einfachen Typs darstellen. |
| [get_BaseTypes](./get_basetypes/)() | Gibt die Sammlung der Basistypen zurück. |
| [get_MemberTypes](./get_membertypes/)() | Gibt das Array der qualifizierten Mitgliedsnamen von eingebauten Datentypen oder **simpleType**-Elementen zurück, die in diesem Schema (oder einem anderen durch den angegebenen Namespace angegebenen Schema) definiert sind. |
| [set_MemberTypes](./set_membertypes/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | Setzt das Array der qualifizierten Mitgliedsnamen von eingebauten Datentypen oder **simpleType**-Elementen, die in diesem Schema (oder einem anderen durch den angegebenen Namespace angegebenen Schema) definiert sind. |
| [XmlSchemaSimpleTypeUnion](./xmlschemasimpletypeunion/)() | Initialisiert eine neue Instanz der Klasse [XmlSchemaSimpleTypeUnion](./). |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
