---
title: "Klasse System::OperatingSystem"
linktitle: "OperatingSystem"
second_title: "Aspose.Font für C++"
description: "Klasse System::OperatingSystem. Stellt ein bestimmtes Betriebssystem dar und liefert Informationen darüber. Objekte dieser Klasse dürfen nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 5100
url: /de/cpp/system/operatingsystem/
---
## OperatingSystem class


Stellt ein bestimmtes Betriebssystem dar und liefert Informationen darüber. Objekte dieser Klasse dürfen nur mit der Funktion [System::MakeObject()](../makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class OperatingSystem
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Platform](./get_platform/)() const | Gibt die Plattform‑Kennung des vom aktuellen Objekt dargestellten Betriebssystems zurück. |
| [get_ServicePack](./get_servicepack/)() const | Gibt den Namen des Service Packs des vom aktuellen Objekt dargestellten Betriebssystems zurück. |
| [get_Version](./get_version/)() const | Gibt eine konstante Referenz auf ein [Version](../version/)-Objekt zurück, das die Version des vom aktuellen Objekt dargestellten Betriebssystems repräsentiert. |
| [get_VersionString](./get_versionstring/)() const | Gibt die Zeichenkettenrepräsentation der Version des vom aktuellen Objekt dargestellten Betriebssystems zurück. |
| [OperatingSystem](./operatingsystem/)(PlatformID, const Version\&) | Erstellt eine Instanz, die ein Betriebssystem darstellt, das durch eine bestimmte Plattform-ID und Version angegeben ist. |
| [OperatingSystem](./operatingsystem/)(PlatformID, const Version\&, const String\&) | Erstellt eine Instanz, die ein Betriebssystem darstellt, das durch eine bestimmte Plattform-ID, Version und Service Pack angegeben ist. |
| [ToString](./tostring/)() const | Gibt die Zeichenkettenrepräsentation der Version des vom aktuellen Objekt dargestellten Betriebssystems zurück. |
## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
