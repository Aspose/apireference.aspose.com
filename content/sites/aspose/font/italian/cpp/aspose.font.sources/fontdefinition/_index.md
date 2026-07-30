---
title: "Aspose::Font::Sources::FontDefinition classe"
linktitle: "FontDefinition"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Sources::FontDefinition classe. Rappresenta la definizione del set di file Font. Questa classe contiene campi che non sono correlati ai dati interni del font. Questi campi descrivono il posizionamento del font e altri dati necessari per caricare il font da una certa sorgente di font (file, memoria, ecc.) in C++."
type: docs
weight: 300
url: /it/cpp/aspose.font.sources/fontdefinition/
---
## FontDefinition class


Rappresenta la definizione del set di file [Font](../../aspose.font/font/). Questa classe contiene campi che non sono correlati ai dati interni del font. Questi campi descrivono il posizionamento del font e altri dati necessari per caricare il font da una certa sorgente di font (file, memoria, ecc.).

```cpp
class FontDefinition : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::String, System::SharedPtr\<StreamSource\>) | Crea una definizione [Font](../../aspose.font/font/) a file singolo. |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::SharedPtr\<StreamSource\>) | Crea una definizione [Font](../../aspose.font/font/) a file singolo. |
| [FontDefinition](./fontdefinition/)(System::String, Aspose::Font::FontType, System::String, System::SharedPtr\<StreamSource\>) | Crea una definizione [Font](../../aspose.font/font/) a file singolo. |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | Crea una definizione [Font](../../aspose.font/font/) a file singolo. |
| [FontDefinition](./fontdefinition/)(System::String, Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | Crea una definizione [Font](../../aspose.font/font/) a file singolo. |
| [FontDefinition](./fontdefinition/)(System::String, System::String, Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | Crea una definizione [Font](../../aspose.font/font/) a file singolo. |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::ArrayPtr\<System::SharedPtr\<FontFileDefinition\>\>) | Crea una definizione [Font](../../aspose.font/font/) a più file. |
| [FontDefinition](./fontdefinition/)(System::String, System::String, Aspose::Font::FontType, System::ArrayPtr\<System::SharedPtr\<FontFileDefinition\>\>) | Crea una definizione [Font](../../aspose.font/font/) a più file. |
| [FontDefinition](./fontdefinition/)(System::SharedPtr\<MultiLanguageString\>, System::SharedPtr\<MultiLanguageString\>, Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | Crea una definizione [Font](../../aspose.font/font/) a più file. |
| [FontDefinition](./fontdefinition/)(System::SharedPtr\<MultiLanguageString\>, System::SharedPtr\<MultiLanguageString\>, Aspose::Font::FontType, System::ArrayPtr\<System::SharedPtr\<FontFileDefinition\>\>) | Crea una definizione [Font](../../aspose.font/font/) a più file. |
| [get_FileDefinitions](./get_filedefinitions/)() const | Ottiene la collezione delle definizioni dei file. |
| virtual [get_FontName](./get_fontname/)() | Restituisce il nome del [Font](../../aspose.font/font/). |
| virtual [get_FontNames](./get_fontnames/)() | Ottiene i nomi del [Font](../../aspose.font/font/) come una [MultiLanguageString](../../aspose.font/multilanguagestring/). |
| [get_FontType](./get_fonttype/)() const | Ottiene il tipo del [Font](../../aspose.font/font/). |
| virtual [get_PostscriptName](./get_postscriptname/)() | Ottiene il nome PostScript del [Font](../../aspose.font/font/). |
| [get_PostscriptNames](./get_postscriptnames/)() const | Ottiene i nomi PostScript del [Font](../../aspose.font/font/) come una [MultiLanguageString](../../aspose.font/multilanguagestring/). |
| static [Open](./open/)(System::String, Aspose::Font::FontType) | Restituisce [FontDefinition](./) per il file del font e il tipo di font. |
| static [Open](./open/)(System::SharedPtr\<StreamSource\>, Aspose::Font::FontType) | Restituisce [FontDefinition](./) per la sorgente di flusso del font e il tipo di font. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Sources](../)
* Library [Aspose.Font for C++](../../)
