---
title: "System::Text::EncodingInfo Klasse"
linktitle: "EncodingInfo"
second_title: "Aspose.Font für C++"
description: "System::Text::EncodingInfo Klasse. Kurze Information zur Kodierung. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1900
url: /de/cpp/system.text/encodinginfo/
---
## EncodingInfo class


Kurze Information zur Kodierung. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class EncodingInfo : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [EncodingInfo](./encodinginfo/)(int, const String\&, const String\&) | Konstruktor. |
| [get_CodePage](./get_codepage/)() const | Liefert die Codepage‑ID. |
| [get_DisplayName](./get_displayname/)() const | Liefert den vollständig lokalisierten Kodierungsnamen. |
| [get_Name](./get_name/)() const | Liefert den kurzen Kodierungsnamen. |
| [GetEncoding](./getencoding/)() | Liefert die durch die Information beschriebene Kodierung. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
