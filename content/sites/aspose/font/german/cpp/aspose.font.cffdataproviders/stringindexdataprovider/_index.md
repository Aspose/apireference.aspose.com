---
title: "Aspose::Font::CffDataProviders::StringIndexDataProvider class"
linktitle: "StringIndexDataProvider"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::CffDataProviders::StringIndexDataProvider class. Deklariert die Funktionalität zum Zugriff auf die CFF String INDEX-Struktur in C++."
type: docs
weight: 700
url: /de/cpp/aspose.font.cffdataproviders/stringindexdataprovider/
---
## StringIndexDataProvider class


Deklariert Funktionalität zum Zugriff auf die CFF String INDEX-Struktur.

```cpp
class StringIndexDataProvider : public Aspose::Font::CffDataProviders::ICffIndexDataProvider
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [AddString](./addstring/)(System::String) | Fügt eine Zeichenkette in die CFF String INDEX-Struktur ein. |
| virtual [get_Count](./get_count/)() | Die Anzahl der Objekte in der CFF INDEX-Struktur. |
| virtual [GetRawBytes](./getrawbytes/)() | Ermittelt alle Bytes der CFF INDEX-Struktur. |
| virtual [GetString](./getstring/)(int32_t) | Liest die Zeichenkette am angegebenen Index aus der CFF String INDEX-Struktur. |
| virtual [idx_get](./idx_get/)(int32_t) | Liest/setzt die Zeichenkette am angegebenen Index. |
| virtual [idx_set](./idx_set/)(int32_t, System::String) | Liest/setzt die Zeichenkette am angegebenen Index. |
| virtual [RemoveString](./removestring/)(int32_t) | Entfernt die Zeichenkette aus der CFF String Index-Struktur am angegebenen Index. |
| virtual [SetString](./setstring/)(System::String, int32_t) | Setzt die Zeichenkette in der CFF String Index-Struktur am angegebenen Index. |
## Siehe auch

* Class [ICffIndexDataProvider](../icffindexdataprovider/)
* Namespace [Aspose::Font::CffDataProviders](../)
* Library [Aspose.Font for C++](../../)
