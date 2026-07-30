---
title: "Aspose::Font::FontEnvironment Klasse"
linktitle: "FontEnvironment"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::FontEnvironment Klasse. Stellt Informationen über die aktuelle Umgebung und Plattform in C++ bereit."
type: docs
weight: 600
url: /de/cpp/aspose.font/fontenvironment/
---
## FontEnvironment class


Stellt Informationen über die aktuelle Umgebung und Plattform bereit.

```cpp
class FontEnvironment : public System::Object
```

## Enums

| Aufzählung | Beschreibung |
| --- | --- |
| [ParsingStrictness](./parsingstrictness/) | Parsing‑Strengheitsarten. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [get_CffCommonFontsSettings](./get_cffcommonfontssettings/)() | Allgemeine Einstellungen für CFF-Schriften. |
| static [get_Current](./get_current/)() | Ermittelt die aktuelle Umgebung. |
| [get_CurrentPlatformId](./get_currentplatformid/)() | Liefert die aktuelle Plattform-ID. |
| [get_FontSpecificEncodings](./get_fontspecificencodings/)() const | Speichert spezifische Codierungen für verbraucherbewusste Fonts. Zum Beispiel verwenden PDF-Dokumente Adobe Symbol- und ZapfDingbats-spezifische Codierungen. |
| [get_Strictness](./get_strictness/)() const | Einige Fonts können unerwartete Daten, nicht spezifizierte Features enthalten oder grob beschnitten sein. |
| [set_Strictness](./set_strictness/)(FontEnvironment::ParsingStrictness) | Einige Fonts können unerwartete Daten, nicht spezifizierte Features enthalten oder grob beschnitten sein. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
