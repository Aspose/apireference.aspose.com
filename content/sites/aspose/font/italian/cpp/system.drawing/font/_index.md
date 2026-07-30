---
title: "Classe System::Drawing::Font"
linktitle: "Font"
second_title: "Aspose.Font per C++"
description: "Classe System::Drawing::Font. Rappresenta un formato specifico per il testo, includendo il tipo di carattere, la dimensione e lo stile. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 700
url: /it/cpp/system.drawing/font/
---
## Font class


Rappresenta un formato specifico per il testo, includendo il tipo di carattere, la dimensione e lo stile. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class Font : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() | Restituisce una copia del font corrente. |
| [Dispose](./dispose/)() | Rilascia tutte le risorse del sistema operativo acquisite dall'oggetto corrente. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Determina se l'oggetto corrente e quello specificato sono identici. |
| [Font](./font/)(const SharedPtr\<Font\>\&, FontStyle) | Crea una nuova istanza della classe [Font](./) che rappresenta il font esistente specificato con lo stile di font specificato. |
| [Font](./font/)(const SharedPtr\<FontFamily\>\&, float, FontStyle, GraphicsUnit, uint8_t, bool) | Crea una nuova istanza della classe [Font](./). |
| [Font](./font/)(const SharedPtr\<FontFamily\>\&, float, GraphicsUnit) | Crea una nuova istanza della classe [Font](./). |
| [Font](./font/)(const String\&, float, FontStyle, GraphicsUnit, uint8_t, bool) | Crea una nuova istanza della classe [Font](./). |
| [Font](./font/)(const String\&, float, GraphicsUnit) | Crea una nuova istanza della classe [Font](./). |
| static [FromLogFont](./fromlogfont/)(const SharedPtr\<Object\>\&) | NON IMPLEMENTATO. |
| [get_Bold](./get_bold/)() | Determina se il font rappresentato dall'oggetto corrente ha lo stile grassetto applicato. |
| [get_FontFamily](./get_fontfamily/)() | Restituisce la famiglia di caratteri del font rappresentato dall'oggetto corrente. |
| [get_FontStyle](./get_fontstyle/)() | Restituisce lo stile del font rappresentato dall'oggetto corrente. |
| [get_GdiCharSet](./get_gdicharset/)() | Restituisce un valore che indica il set di caratteri GDI utilizzato dal font rappresentato dall'oggetto corrente. |
| [get_Height](./get_height/)() | Restituisce l'interlinea del font rappresentato dall'oggetto corrente in pixel. |
| [get_Italic](./get_italic/)() | Determina se il font rappresentato dall'oggetto corrente ha lo stile corsivo applicato. |
| [get_Name](./get_name/)() | Restituisce il nome del tipo di carattere del font rappresentato dall'oggetto corrente. |
| [get_OriginalFontName](./get_originalfontname/)() | Restituisce il nome originariamente specificato del font. |
| [get_Size](./get_size/)() | Restituisce la dimensione em del font rappresentato dall'oggetto corrente, misurata nelle unità specificate dalla proprietà Unit. |
| [get_SizeInPoints](./get_sizeinpoints/)() | Restituisce la dimensione em del carattere rappresentato dall'oggetto corrente in punti. |
| [get_Strikeout](./get_strikeout/)() | Determina se il carattere rappresentato dall'oggetto corrente ha lo stile barrato applicato. |
| [get_Style](./get_style/)() | Restituisce lo stile del carattere rappresentato dall'oggetto corrente. |
| [get_Underline](./get_underline/)() | Determina se il carattere rappresentato dall'oggetto corrente ha lo stile sottolineato applicato. |
| [get_Unit](./get_unit/)() | Restituisce l'unità di misura per il carattere rappresentato dall'oggetto corrente. |
| [GetHeight](./getheight/)(const SharedPtr\<Graphics\>\&) | Restituisce l'interlinea del carattere rappresentato dall'oggetto corrente, nell'unità corrente di un oggetto [Graphics](../graphics/) specificato. |
| [GetHeight](./getheight/)(float) | Restituisce l'altezza del carattere rappresentato dall'oggetto corrente quando disegnato su un dispositivo di visualizzazione con la risoluzione verticale specificata. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
