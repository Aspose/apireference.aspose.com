---
title: "Classe System::Drawing::StringFormat"
linktitle: "StringFormat"
second_title: "Aspose.Font per C++"
description: "System::Drawing::StringFormat classe. Incapsula informazioni sul layout del testo, manipolazioni di visualizzazione e funzionalità OpenType. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 2500
url: /it/cpp/system.drawing/stringformat/
---
## StringFormat class


Incapsula informazioni sul layout del testo, manipolazioni di visualizzazione e funzionalità OpenType. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class StringFormat : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() | Restituisce una copia esatta dell'oggetto corrente. |
| [get_Alignment](./get_alignment/)() const | Restituisce un valore che indica l'allineamento orizzontale della stringa. |
| [get_DigitSubstitutionLanguage](./get_digitsubstitutionlanguage/)() const | Restituisce un valore che indica la lingua utilizzata quando le cifre locali vengono sostituite con cifre occidentali. |
| [get_DigitSubstitutionMethod](./get_digitsubstitutionmethod/)() const | Restituisce il metodo di sostituzione delle cifre. |
| [get_FormatFlags](./get_formatflags/)() const | Restituisce una combinazione bitwise di [StringFormatFlags](../stringformatflags/) che specifica il formato della stringa rappresentato dall'oggetto corrente. |
| static [get_GenericDefault](./get_genericdefault/)() | Restituisce un oggetto [StringFormat](./) che rappresenta un formato predefinito generico. |
| static [get_GenericTypographic](./get_generictypographic/)() | Restituisce un oggetto [StringFormat](./) che rappresenta un formato tipografico generico. |
| [get_HotkeyPrefix](./get_hotkeyprefix/)() const | Restituisce il valore che indica come viene visualizzato il prefisso del tasto di scelta rapida. |
| [get_LineAlignment](./get_linealignment/)() const | Restituisce un valore che indica l'allineamento verticale della stringa. |
| [get_Trimming](./get_trimming/)() const | Restituisce un valore che indica come la stringa viene troncata. |
| [GetCharacterRangesCount](./getcharacterrangescount/)() const | Ottiene la dimensione dell'array [CharacterRange](../characterrange/). |
| [GetTabStops](./gettabstops/)(float\&) const | Restituisce le tabulazioni per l'oggetto [StringFormat](./) corrente. |
| [set_Alignment](./set_alignment/)(StringAlignment) | Imposta l'allineamento orizzontale della stringa. |
| [set_FormatFlags](./set_formatflags/)(StringFormatFlags) | Imposta i flag del formato della stringa. |
| [set_HotkeyPrefix](./set_hotkeyprefix/)(Text::HotkeyPrefix) | Imposta il valore che specifica come deve essere visualizzato il prefisso del tasto di scelta rapida. |
| [set_LineAlignment](./set_linealignment/)(StringAlignment) | Imposta l'allineamento verticale della stringa. |
| [set_Trimming](./set_trimming/)(StringTrimming) | Imposta un valore che specifica come la stringa viene troncata. |
| [SetDigitSubstitution](./setdigitsubstitution/)(int32_t, StringDigitSubstitute) | Imposta la lingua e il metodo di sostituzione delle cifre. |
| [SetMeasurableCharacterRanges](./setmeasurablecharacterranges/)(const ArrayPtr\<CharacterRange\>\&) | Imposta un array di oggetti [CharacterRange](../characterrange/) che rappresentano gli intervalli di caratteri misurati mediante una chiamata al metodo MeasureCharacterRanges(). |
| [SetTabStops](./settabstops/)(float, const ArrayPtr\<float\>\&) | Imposta le tabulazioni per l'oggetto [StringFormat](./) corrente. |
| [StringFormat](./stringformat/)() | Costruisce una nuova istanza della classe [StringFormat](./). |
| [StringFormat](./stringformat/)(StringFormatFlags, int32_t) | Costruisce una nuova istanza della classe [StringFormat](./) con i flag di formato e la lingua specificati. |
| [StringFormat](./stringformat/)(const SharedPtr\<StringFormat\>\&) | Costruttore di copia. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
