---
title: "System::Text::ASCIIEncoding Klasse"
linktitle: "ASCIIEncoding"
second_title: "Aspose.Font für C++"
description: "System::Text::ASCIIEncoding Klasse. Stellt ASCII‑Kodierung dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.text/asciiencoding/
---
## ASCIIEncoding class


Stellt ASCII‑Kodierung dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ASCIIEncoding : public System::Text::ICUEncoding
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ASCIIEncoding](./asciiencoding/)() | Konstruktor. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Ermittelt die maximale Byte‑Anzahl, die einen String mit bekannter Zeichenanzahl aufnehmen kann. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Ermittelt die maximale Anzahl von Zeichen, die zum Dekodieren einer angegebenen Anzahl von Bytes benötigt werden. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static constexpr [ASCII_CODE_PAGE](./ascii_code_page/) | RTTI. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Standardwert der Codepage. |
## Siehe auch

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
