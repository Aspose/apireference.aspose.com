---
title: "System::Text::UTF8Encoding Klasse"
linktitle: "UTF8Encoding"
second_title: "Aspose.Font für C++"
description: "System::Text::UTF8Encoding Klasse. UTF-8-Kodierung. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2800
url: /de/cpp/system.text/utf8encoding/
---
## UTF8Encoding class


UTF-8-Kodierung. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in den [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class UTF8Encoding : public System::Text::ICUEncoding
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() override | Klont das Kodierungsobjekt. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Vergleicht mit einem Objekt. |
| [GetHashCode](./gethashcode/)() const override | Liefert den Hashcode der Kodierung. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Ermittelt die maximale Anzahl von Bytes, die zum Kodieren einer angegebenen Anzahl von Zeichen benötigt werden. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Ermittelt die maximale Anzahl von Zeichen, die zum Dekodieren einer angegebenen Anzahl von Bytes benötigt werden. |
| [GetPreamble](./getpreamble/)() override | Liefert das Codepage-Präambel. |
| [operator==](./operator==/)(const UTF8Encoding\&) const | Vergleicht die Parameter der Kodierungen. |
| [UTF8Encoding](./utf8encoding/)() | Konstruktor. |
| [UTF8Encoding](./utf8encoding/)(bool) | Konstruktor. |
| [UTF8Encoding](./utf8encoding/)(bool, bool) | Konstruktor. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Standardwert der Codepage. |
| static constexpr [UTF8_CODE_PAGE](./utf8_code_page/) | RTTI-Informationen. |
## Siehe auch

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
