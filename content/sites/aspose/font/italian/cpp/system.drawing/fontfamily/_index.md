---
title: "Classe System::Drawing::FontFamily"
linktitle: "FontFamily"
second_title: "Aspose.Font per C++"
description: "Classe System::Drawing::FontFamily. Rappresenta un gruppo di caratteri tipografici che condividono un design di base simile. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 900
url: /it/cpp/system.drawing/fontfamily/
---
## FontFamily class


Rappresenta un gruppo di caratteri tipografici che condividono un design di base simile. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarla alle funzioni come argomento.

```cpp
class FontFamily : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() | Restituisce una copia dell'oggetto [FontFamily](./) corrente. |
| [Dispose](./dispose/)() | Rilascia tutte le risorse del sistema operativo acquisite dall'oggetto corrente. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Determina se l'oggetto corrente e quello specificato sono identici. |
| [FontFamily](./fontfamily/)(const String\&) | Crea una nuova istanza della classe [FontFamily](./) che rappresenta una famiglia di caratteri con il nome specificato. |
| [FontFamily](./fontfamily/)(const String\&, const SharedPtr\<Text::FontCollection\>\&) | Crea una nuova istanza di [FontFamily](./) nella FontCollection specificata con il nome specificato. |
| [FontFamily](./fontfamily/)(Text::GenericFontFamilies) | Crea una nuova istanza di [FontFamily](./) dalla famiglia di caratteri generica specificata. |
| static [get_Families](./get_families/)() | Restituisce un array contenente tutti gli oggetti [FontFamily](./) associati al contesto grafico corrente. |
| static [get_GenericMonospace](./get_genericmonospace/)() | Restituisce un oggetto [FontFamily](./) che rappresenta una famiglia di caratteri Monospace generica. |
| static [get_GenericSansSerif](./get_genericsansserif/)() | Restituisce un oggetto [FontFamily](./) che rappresenta una famiglia di caratteri Sans Serif generica. |
| static [get_GenericSerif](./get_genericserif/)() | Restituisce un oggetto [FontFamily](./) che rappresenta una famiglia di caratteri Serif generica. |
| [get_Name](./get_name/)() const | Restituisce il nome della famiglia di caratteri rappresentata dall'oggetto corrente. |
| [GetCellAscent](./getcellascent/)(FontStyle) | Restituisce l'altezza di cella della famiglia di caratteri rappresentata dall'oggetto corrente per lo stile di carattere specificato. |
| [GetCellDescent](./getcelldescent/)(FontStyle) | Restituisce la discesa di cella della famiglia di caratteri rappresentata dall'oggetto corrente per lo stile di carattere specificato. |
| [GetEmHeight](./getemheight/)(FontStyle) | Restituisce l'altezza del quadrato em in unità di progettazione del carattere per lo stile specificato. |
| [GetLineSpacing](./getlinespacing/)(FontStyle) | Restituisce l'interlinea della famiglia di caratteri rappresentata dall'oggetto corrente per lo stile di carattere specificato. |
| [GetName](./getname/)(int) const | Restituisce il nome della famiglia di caratteri rappresentata dall'oggetto corrente. |
| [IsStyleAvailable](./isstyleavailable/)(FontStyle) | Determina se lo stile di carattere specificato è disponibile. |
| virtual [~FontFamily](./~fontfamily/)() | Distruttore. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
