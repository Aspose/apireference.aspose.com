---
title: "System::Xml::Xsl::XsltSettings class"
linktitle: "XsltSettings"
second_title: "Aspose.Font für C++"
description: "System::Xml::Xsl::XsltSettings class. Gibt die XSLT‑Funktionen an, die während der Ausführung des XSLT‑Stylesheets in C++ unterstützt werden."
type: docs
weight: 800
url: /de/cpp/system.xml.xsl/xsltsettings/
---
## XsltSettings class


Gibt die XSLT-Funktionen an, die während der Ausführung des XSLT-Stylesheets unterstützt werden sollen.

```cpp
class XsltSettings : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [get_Default](./get_default/)() | Gibt ein [XsltSettings](./)-Objekt mit Standardeinstellungen zurück. Die Unterstützung für die XSLT‑**document()**‑Funktion und eingebettete Skriptblöcke ist deaktiviert. |
| [get_EnableDocumentFunction](./get_enabledocumentfunction/)() | Gibt einen Wert zurück, der angibt, ob die Unterstützung für die XSLT‑**document()**‑Funktion aktiviert werden soll. |
| [get_EnableScript](./get_enablescript/)() | Gibt einen Wert zurück, der angibt, ob die Unterstützung für eingebettete Skriptblöcke aktiviert werden soll. |
| static [get_TrustedXslt](./get_trustedxslt/)() | Gibt ein [XsltSettings](./)-Objekt zurück, das die Unterstützung für die XSLT‑**document()**‑Funktion und eingebettete Skriptblöcke aktiviert. |
| [set_EnableDocumentFunction](./set_enabledocumentfunction/)(bool) | Legt einen Wert fest, der angibt, ob die Unterstützung für die XSLT‑**document()**‑Funktion aktiviert werden soll. |
| [set_EnableScript](./set_enablescript/)(bool) | Legt einen Wert fest, der angibt, ob die Unterstützung für eingebettete Skriptblöcke aktiviert werden soll. |
| [XsltSettings](./xsltsettings/)() | Initialisiert eine neue Instanz der [XsltSettings](./)-Klasse mit Standardeinstellungen. |
| [XsltSettings](./xsltsettings/)(bool, bool) | Initialisiert eine neue Instanz der [XsltSettings](./)-Klasse mit den angegebenen Einstellungen. |
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
