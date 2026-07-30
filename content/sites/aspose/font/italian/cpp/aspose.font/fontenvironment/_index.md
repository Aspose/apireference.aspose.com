---
title: "Aspose::Font::FontEnvironment class"
linktitle: "FontEnvironment"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::FontEnvironment class. Fornisce informazioni sull'ambiente e sulla piattaforma corrente in C++."
type: docs
weight: 600
url: /it/cpp/aspose.font/fontenvironment/
---
## FontEnvironment class


Fornisce informazioni sull'ambiente e sulla piattaforma correnti.

```cpp
class FontEnvironment : public System::Object
```

## Enums

| Enumerazione | Descrizione |
| --- | --- |
| [ParsingStrictness](./parsingstrictness/) | Tipi di rigore di parsing. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [get_CffCommonFontsSettings](./get_cffcommonfontssettings/)() | Impostazioni comuni ai font CFF. |
| static [get_Current](./get_current/)() | Ottiene l'ambiente corrente. |
| [get_CurrentPlatformId](./get_currentplatformid/)() | Ottiene l'ID della piattaforma corrente. |
| [get_FontSpecificEncodings](./get_fontspecificencodings/)() const | Memorizza codifiche specifiche per i Font orientati al consumatore. Ad esempio, i documenti PDF utilizzano codifiche specifiche Adobe Symbol e ZapfDingbats. |
| [get_Strictness](./get_strictness/)() const | Alcuni Font possono contenere dati inattesi, funzionalità non specificate o potrebbero essere tagliati in modo approssimativo. |
| [set_Strictness](./set_strictness/)(FontEnvironment::ParsingStrictness) | Alcuni Font possono contenere dati inattesi, funzionalità non specificate o potrebbero essere tagliati in modo approssimativo. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
