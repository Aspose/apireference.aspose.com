---
title: "System::Text::UTF32Encoding Klasse"
linktitle: "UTF32Encoding"
second_title: "Aspose.Page für C++"
description: "System::Text::UTF32Encoding Klasse. UTF-32 Kodierung. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2600
url: /de/cpp/system.text/utf32encoding/
---
## UTF32Encoding class


UTF-32 Kodierung. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class UTF32Encoding : public System::Text::ICUEncoding
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() override | Klonen des Kodierungsobjekts. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Vergleicht mit Objekt. |
| [GetHashCode](./gethashcode/)() const override | Liefert den Hashcode der Kodierung. |
| [GetPreamble](./getpreamble/)() override | Gibt das Codepage-Präambel zurück. |
| [operator==](./operator==/)(const UTF32Encoding\&) const | Vergleicht die Parameter von Kodierungen. |
| [UTF32Encoding](./utf32encoding/)() | Konstruktor. |
| [UTF32Encoding](./utf32encoding/)(bool, bool) | Konstruktor. |
| [UTF32Encoding](./utf32encoding/)(bool, bool, bool) | Konstruktor. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static constexpr [BIG_UTF32_CODE_PAGE](./big_utf32_code_page/) | Magische Zahl, die von [Windows](../../system.windows/) für die Big‑Endian‑UTF-32-Codepage‑ID verwendet wird. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Standardwert der Codepage. |
| static constexpr [UTF32_CODE_PAGE](./utf32_code_page/) | Magische Zahl, die von [Windows](../../system.windows/) für die Little‑Endian‑UTF-32-Codepage‑ID verwendet wird. |
## Siehe auch

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
