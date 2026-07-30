---
title: "Aspose::Font::CffDataProviders::NameIndexDataProvider-Klasse"
linktitle: "NameIndexDataProvider"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::CffDataProviders::NameIndexDataProvider-Klasse. Deklariert die Funktionalität zum Zugriff auf die CFF Name INDEX-Struktur in C++."
type: docs
weight: 500
url: /de/cpp/aspose.font.cffdataproviders/nameindexdataprovider/
---
## NameIndexDataProvider class


Deklariert Funktionalität zum Zugriff auf die CFF Name INDEX-Struktur.

```cpp
class NameIndexDataProvider : public Aspose::Font::CffDataProviders::ICffIndexDataProvider
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [AddName](./addname/)(System::String) | Fügt einen Schriftartnamen zur Name INDEX-Struktur hinzu. Verwenden Sie diese Methode mit Vorsicht, da jeder Schriftartname in der CFF Name INDEX-Struktur gemäß der CFF-Spezifikation eine entsprechende DICT-Struktur im Top DICT-Index besitzen muss. |
| virtual [get_Count](./get_count/)() | Die Anzahl der Objekte in der CFF INDEX-Struktur. |
| virtual [GetName](./getname/)(int32_t) | Ermittelt den Namen der Schriftart am angegebenen Index. |
| virtual [GetRawBytes](./getrawbytes/)() | Ermittelt alle Bytes der CFF INDEX-Struktur. |
| virtual [idx_get](./idx_get/)(int32_t) | Ermittelt/legt den Schriftartnamen am angegebenen Index fest. |
| virtual [idx_set](./idx_set/)(int32_t, System::String) | Ermittelt/legt den Schriftartnamen am angegebenen Index fest. |
| virtual [RemoveName](./removename/)(int32_t) | Entfernt den Namen am angegebenen Index. Verwenden Sie diese Methode mit Vorsicht, da jeder Schriftartname in der CFF Name INDEX-Struktur gemäß der CFF-Spezifikation eine entsprechende DICT-Struktur im Top DICT-Index besitzen muss. |
| virtual [SetName](./setname/)(System::String, int32_t) | Setzt den Schriftartnamen am angegebenen Index. |
## Siehe auch

* Class [ICffIndexDataProvider](../icffindexdataprovider/)
* Namespace [Aspose::Font::CffDataProviders](../)
* Library [Aspose.Font for C++](../../)
