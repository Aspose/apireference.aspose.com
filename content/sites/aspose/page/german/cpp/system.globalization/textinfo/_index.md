---
title: "System::Globalization::TextInfo Klasse"
linktitle: "TextInfo"
second_title: "Aspose.Page für C++"
description: "System::Globalization::TextInfo Klasse. Definiert lokalspezifische Texteigenschaften. Setzoperationen sind nur bei nicht schreibgeschützten Objekten aktiviert. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2800
url: /de/cpp/system.globalization/textinfo/
---
## TextInfo class


Definiert lokalspezifische Texteigenschaften. Setzoperationen sind nur bei nicht schreibgeschützten Objekten aktiviert. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class TextInfo : public System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() override | RTTI-Informationen. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| virtual [get_ANSICodePage](./get_ansicodepage/)() const | Liefert die ANSI-Codepage. |
| [get_CultureName](./get_culturename/)() const | Liefert den Kulturnamen. |
| virtual [get_EBCDICCodePage](./get_ebcdiccodepage/)() const | Liefert die EBCDIC-Codepage. |
| [get_IsReadOnly](./get_isreadonly/)() const | Prüft, ob das Format schreibgeschützt ist. |
| [get_IsRightToLeft](./get_isrighttoleft/)() const | Überprüft, ob der Text von links nach rechts geschrieben ist. |
| [get_LCID](./get_lcid/)() const | Liefert die Locale-ID. |
| virtual [get_ListSeparator](./get_listseparator/)() const | Liefert das Listentrennzeichen. |
| virtual [get_MacCodePage](./get_maccodepage/)() const | Liefert die Macintosh-Codepage. |
| virtual [get_OEMCodePage](./get_oemcodepage/)() const | Liefert die OEM-Codepage. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| [operator=](./operator=/)(const TextInfo\&) |  |
| static [ReadOnly](./readonly/)(const TextInfoPtr\&) | Liefert eine schreibgeschützte Version der Kultur. |
| virtual [set_ListSeparator](./set_listseparator/)(String) | Setzt das Listentrennzeichen. |
| [TextInfo](./textinfo/)(const TextInfo\&) | RTTI-Informationen. |
| virtual [ToLower](./tolower/)(char_t) const | Konvertiert ein Zeichen in Kleinbuchstaben. |
| virtual [ToLower](./tolower/)(String) const | Konvertiert eine Zeichenkette in Kleinbuchstaben. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Konvertierung benutzerdefinierter Objekte in einen String. |
| [ToTitleCase](./totitlecase/)(String) const | Konvertiert eine Zeichenkette in Titel‑Fall (außer für Akronyme, die bereits in Großbuchstaben vorliegen). |
| virtual [ToUpper](./toupper/)(char_t) const | Konvertiert ein Zeichen in Großbuchstaben. |
| virtual [ToUpper](./toupper/)(String) const | Konvertiert eine Zeichenkette in Großbuchstaben. |
## Siehe auch

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
