---
title: "System::Net::WebClient Klasse"
linktitle: "WebClient"
second_title: "Aspose.Font für C++"
description: "System::Net::WebClient Klasse. WebClient bietet gängige Methoden zum Senden und Empfangen von Daten. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 3500
url: /de/cpp/system.net/webclient/
---
## WebClient class


[WebClient](./) provides common methods for sending and receiving data. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class WebClient : public System::ComponentModel::Component
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [DownloadData](./downloaddata/)(const String\&) const | Lädt die angegebene Ressource als Byte‑Array herunter. |
| [DownloadData](./downloaddata/)(const SharedPtr\<Uri\>\&) const | Lädt die angegebene Ressource als Byte‑Array herunter. |
| [DownloadString](./downloadstring/)(const String\&) const | Lädt die angegebene Ressource als Zeichenkette herunter. |
| [DownloadString](./downloadstring/)(const SharedPtr\<Uri\>\&) const | Lädt die angegebene Ressource als Zeichenkette herunter. |
| [get_Encoding](./get_encoding/)() const | Ermittelt die Codierung, die zum Herunterladen oder Hochladen von Zeichenketten verwendet wird. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<Text::Encoding\>\&) | Legt die Codierung fest, die zum Herunterladen oder Hochladen von Zeichenketten verwendet wird. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | NICHT IMPLEMENTIERT. |
| [WebClient](./webclient/)() | RTTI-Informationen. |
| [~WebClient](./~webclient/)() | Zerstört die aktuelle Instanz. |
## Siehe auch

* Class [Component](../../system.componentmodel/component/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
