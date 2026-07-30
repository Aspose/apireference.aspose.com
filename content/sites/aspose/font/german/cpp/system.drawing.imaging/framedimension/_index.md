---
title: "System::Drawing::Imaging::FrameDimension Klasse"
linktitle: "FrameDimension"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Imaging::FrameDimension Klasse. Stellt Eigenschaften bereit, die die Frame-Dimensionen eines Bildes ermitteln. Objekte dieser Klasse sollten nur mit der System::MakeObject()-Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 800
url: /de/cpp/system.drawing.imaging/framedimension/
---
## FrameDimension class


Stellt Eigenschaften bereit, die die Frame-Dimensionen eines Bildes ermitteln. Objekte dieser Klasse sollten nur mit der [System::MakeObject()](../../system/makeobject/) Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class FrameDimension : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(FrameDimensionPtr) | Bestimmt, ob das angegebene [FrameDimension](./)-Objekt dem aktuellen Objekt entspricht. |
| [FrameDimension](./framedimension/)(const System::Guid\&) | Erstellt ein neues [FrameDimension](./)-Objekt und initialisiert es mit der angegebenen GUID. |
| [get_Guid](./get_guid/)() const | Gibt die mit dem aktuellen Objekt verknüpfte GUID zurück. |
| static [get_Page](./get_page/)() | Gibt die Seitendimension zurück. |
| static [get_Resolution](./get_resolution/)() | Gibt die Auflösungsdimension zurück. |
| static [get_Time](./get_time/)() | Gibt die Zeitdimension zurück. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
