---
title: "System::Security Namespace"
linktitle: "System::Security"
second_title: "Aspose.Page für C++"
description: "Wie man den System::Security‑Namespace in C++ verwendet."
type: docs
weight: 5400
url: /de/cpp/system.security/
---



## Klassen

| Klasse | Beschreibung |
| --- | --- |
| [SecureString](./securestring/) | Secure‑String, stellt Text dar, der vertraulich zu behandeln ist. Diese Klasse verschlüsselt die internen Daten nicht. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mittels operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [SecureStringMarshal](./securestringmarshal/) | Sammlung von Methoden zum Allozieren und Kopieren von nicht verwalteten Speicherblöcken. |
| [SecurityElement](./securityelement/) | XML-Objektmodell für die Kodierung von Sicherheitsobjekten. Nicht implementiert. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mittels operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [SecureStringPtr](./securestringptr/) | [SecureString](./securestring/) Zeigertyp. |
