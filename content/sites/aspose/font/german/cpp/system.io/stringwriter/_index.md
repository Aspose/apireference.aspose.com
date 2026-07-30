---
title: "System::IO::StringWriter Klasse"
linktitle: "StringWriter"
second_title: "Aspose.Font für C++"
description: "System::IO::StringWriter Klasse. Implementiert einen TextWriter, der Informationen in einen String schreibt. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2500
url: /de/cpp/system.io/stringwriter/
---
## StringWriter class


Implementiert einen [TextWriter](../textwriter/), der Informationen in einen String schreibt. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

```cpp
class StringWriter : public System::IO::TextWriter
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | Gibt die aktuell verwendete Kodierung zurück. |
| virtual [GetStringBuilder](./getstringbuilder/)() | Gibt den aktuell verwendeten StringBuilder zurück. |
| [StringWriter](./stringwriter/)(const System::SharedPtr\<Text::StringBuilder\>\&, const IFormatProviderPtr\&) | Konstruiert eine neue Instanz von [StringWriter](./) unter Verwendung des angegebenen StringBuilders und des [IFormatProvider](../../system/iformatprovider/). |
| [StringWriter](./stringwriter/)(const System::SharedPtr\<Text::StringBuilder\>\&) | Konstruiert eine neue Instanz von [StringWriter](./) unter Verwendung des angegebenen StringBuilders und des [IFormatProvider](../../system/iformatprovider/) aus der aktuellen Kultur. |
| [StringWriter](./stringwriter/)(const IFormatProviderPtr\&) | Konstruiert eine neue Instanz von [StringWriter](./) unter Verwendung des angegebenen [IFormatProvider](../../system/iformatprovider/). |
| [StringWriter](./stringwriter/)() | Konstruiert eine neue Instanz von [StringWriter](./) unter Verwendung des [IFormatProvider](../../system/iformatprovider/) aus der aktuellen Kultur. |
| [ToString](./tostring/)() const override | Gibt den zugrunde liegenden String zurück. |
| [Write](./write/)(char_t) override | Schreibt das angegebene Zeichen in den Stream. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Schreibt den angegebenen Teilbereich von Zeichen aus dem angegebenen Zeichenarray in den Stream. |
| [Write](./write/)(const String\&) override | Schreibt die angegebene Zeichenkette in den Stream. |
## Siehe auch

* Class [TextWriter](../textwriter/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
