---
title: "System::Xml::Xsl::XsltArgumentList Klasse"
linktitle: "XsltArgumentList"
second_title: "Aspose.Font für C++"
description: "System::Xml::Xsl::XsltArgumentList Klasse. Enthält eine variable Anzahl von Argumenten, die entweder XSLT-Parameter oder Erweiterungsobjekte in C++ sind."
type: docs
weight: 400
url: /de/cpp/system.xml.xsl/xsltargumentlist/
---
## XsltArgumentList class


Enthält eine variable Anzahl von Argumenten, die entweder XSLT-Parameter oder Erweiterungsobjekte sind.

```cpp
class XsltArgumentList : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AddExtensionObject](./addextensionobject/)(const String\&, const SharedPtr\<Object\>\&) | Fügt ein neues Objekt zur [XsltArgumentList](./) hinzu und verknüpft es mit dem Namespace-URI. |
| [AddParam](./addparam/)(const String\&, const String\&, const SharedPtr\<Object\>\&) | Fügt der [XsltArgumentList](./) einen Parameter hinzu und verknüpft ihn mit dem namespacequalifizierten Namen. |
| [Clear](./clear/)() | Entfernt alle Parameter und Erweiterungsobjekte aus der [XsltArgumentList](./). |
| [GetExtensionObject](./getextensionobject/)(const String\&) | Gibt das mit dem angegebenen Namespace verknüpfte Objekt zurück. |
| [GetParam](./getparam/)(const String\&, const String\&) | Gibt den mit dem namespacequalifizierten Namen verknüpften Parameter zurück. |
| [RemoveExtensionObject](./removeextensionobject/)(const String\&) | Entfernt das Objekt mit der Namespace-URI aus der [XsltArgumentList](./). |
| [RemoveParam](./removeparam/)(const String\&, const String\&) | Entfernt den Parameter aus der [XsltArgumentList](./). |
| [XsltArgumentList](./xsltargumentlist/)() | Implementiert eine neue Instanz der [XsltArgumentList](./). |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
