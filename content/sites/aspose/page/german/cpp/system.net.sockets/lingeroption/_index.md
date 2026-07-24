---
title: "System::Net::Sockets::LingerOption-Klasse"
linktitle: "LingerOption"
second_title: "Aspose.Page für C++"
description: "System::Net::Sockets::LingerOption-Klasse. Gibt an, ob ein Socket nach einem Aufruf der Close()- oder Close()-Methoden verbunden bleibt. Sie gibt außerdem den Zeitraum an, während dem der Socket verbunden bleibt, wenn das Senden der Daten fortgesetzt wird. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 200
url: /de/cpp/system.net.sockets/lingeroption/
---
## LingerOption class


Gibt an, ob ein Socket nach einem Aufruf der Close()- oder Close()-Methoden verbunden bleibt. Sie gibt außerdem den Zeitraum an, während dem der Socket verbunden bleibt, wenn das Senden der Daten fortgesetzt wird. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class LingerOption : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Enabled](./get_enabled/)() | RTTI-Informationen. |
| [get_LingerTime](./get_lingertime/)() | Ermittelt einen Verzögerungs-Timeout in Sekunden. |
| [LingerOption](./lingeroption/)(bool, int32_t) | Konstruiert eine neue Instanz. |
| [set_Enabled](./set_enabled/)(bool) | Setzt einen Wert, der angibt, ob der Socket das Schließen verzögert, um alle ausstehenden Daten zu senden. |
| [set_LingerTime](./set_lingertime/)(int32_t) | Setzt einen Verzögerungs-Timeout in Sekunden. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
