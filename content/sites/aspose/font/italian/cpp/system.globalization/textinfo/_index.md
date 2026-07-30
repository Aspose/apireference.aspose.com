---
title: "System::Globalization::TextInfo class"
linktitle: "TextInfo"
second_title: "Aspose.Font per C++"
description: "System::Globalization::TextInfo class. Definisce le proprietà di testo specifiche per la locale. Le operazioni di impostazione sono abilitate solo su oggetti non di sola lettura. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e usare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2800
url: /it/cpp/system.globalization/textinfo/
---
## TextInfo class


Definisce le proprietà di testo specifiche della locale. Le operazioni di impostazione sono abilitate solo su oggetti non di sola lettura. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class TextInfo : public System::ICloneable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() override | Informazioni RTTI. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| virtual [get_ANSICodePage](./get_ansicodepage/)() const | Ottiene la codepage ANSI. |
| [get_CultureName](./get_culturename/)() const | Ottiene il nome della cultura. |
| virtual [get_EBCDICCodePage](./get_ebcdiccodepage/)() const | Ottiene la codepage EBCDIC. |
| [get_IsReadOnly](./get_isreadonly/)() const | Verifica se il formato è di sola lettura. |
| [get_IsRightToLeft](./get_isrighttoleft/)() const | Verifica se il testo è scritto da sinistra a destra. |
| [get_LCID](./get_lcid/)() const | Ottiene l'ID della locale. |
| virtual [get_ListSeparator](./get_listseparator/)() const | Ottiene il separatore di elenco. |
| virtual [get_MacCodePage](./get_maccodepage/)() const | Ottiene la codepage Macintosh. |
| virtual [get_OEMCodePage](./get_oemcodepage/)() const | Ottiene la codepage OEM. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| [operator=](./operator=/)(const TextInfo\&) |  |
| static [ReadOnly](./readonly/)(const TextInfoPtr\&) | Ottiene una versione di sola lettura della cultura. |
| virtual [set_ListSeparator](./set_listseparator/)(String) | Imposta il separatore di elenco. |
| [TextInfo](./textinfo/)(const TextInfo\&) | Informazioni RTTI. |
| virtual [ToLower](./tolower/)(char_t) const | Converte il carattere in minuscolo. |
| virtual [ToLower](./tolower/)(String) const | Converte la stringa in minuscolo. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
| [ToTitleCase](./totitlecase/)(String) const | Converte la stringa in formato titolo (eccetto per gli acronimi già in maiuscolo). |
| virtual [ToUpper](./toupper/)(char_t) const | Converte il carattere in maiuscolo. |
| virtual [ToUpper](./toupper/)(String) const | Converte la stringa in maiuscolo. |
## Vedi anche

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
