---
title: "Aspose::Page::Metered Klasse"
linktitle: "Messbasiert"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::Metered Klasse. Stellt Methoden zum Setzen des Messschlüssels in C++ bereit."
type: docs
weight: 1400
url: /de/cpp/aspose.page/metered/
---
## Metered class


Stellt Methoden zum Festlegen des gemessenen Schlüssels bereit.

```cpp
class Metered : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [GetConsumptionCredit](./getconsumptioncredit/)() | Liefert den Verbrauchsguthaben. |
| static [GetConsumptionQuantity](./getconsumptionquantity/)() | Liefert die Verbrauchsdateigröße. |
| [Metered](./metered/)() | Initialisiert eine neue Instanz dieser Klasse. |
| [SetMeteredKey](./setmeteredkey/)(System::String, System::String) | Setzt den öffentlichen und privaten Messschlüssel. Wenn Sie eine Messlizenz erwerben, sollte diese API beim Start der Anwendung aufgerufen werden; normalerweise reicht das aus. Wenn jedoch das Hochladen der Verbrauchsdaten ständig fehlschlägt und 24 Stunden überschreitet, wird die Lizenz auf den Evaluierungsstatus gesetzt. Um einen solchen Fall zu vermeiden, sollten Sie den Lizenzstatus regelmäßig prüfen und bei Evaluierungsstatus diese API erneut aufrufen. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
