---
title: "System::Globalization::NumberFormatInfo classe"
linktitle: "NumberFormatInfo"
second_title: "Aspose.Font per C++"
description: "System::Globalization::NumberFormatInfo classe. Contiene informazioni su come formattare i numeri. Le operazioni di impostazione sono abilitate solo su oggetti non di sola lettura. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1900
url: /it/cpp/system.globalization/numberformatinfo/
---
## NumberFormatInfo class


Contiene informazioni su come formattare i numeri. Le operazioni di impostazione sono abilitate solo su oggetti non di sola lettura. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché proverà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class NumberFormatInfo : public virtual System::Object,
                         public System::IFormatProvider,
                         public System::ICloneable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() override | Clona le informazioni di formattazione. |
| [get_CurrencyDecimalDigits](./get_currencydecimaldigits/)() const | Restituisce il numero di cifre decimali della valuta. |
| [get_CurrencyDecimalSeparator](./get_currencydecimalseparator/)() const | Restituisce il separatore decimale della valuta. |
| [get_CurrencyGroupSeparator](./get_currencygroupseparator/)() const | Restituisce il separatore di gruppo della valuta. |
| [get_CurrencyGroupSizes](./get_currencygroupsizes/)() const | Restituisce il numero di cifre decimali della valuta per gruppo. |
| [get_CurrencyNegativePattern](./get_currencynegativepattern/)() const | Ottiene il modello negativo della valuta. |
| [get_CurrencyPositivePattern](./get_currencypositivepattern/)() const | Ottiene il modello positivo della valuta. |
| [get_CurrencySymbol](./get_currencysymbol/)() const | Ottiene il simbolo della valuta. |
| static [get_CurrentInfo](./get_currentinfo/)() | Ottiene le informazioni sul formato numerico definite dalla cultura del thread corrente. |
| [get_DigitSubstitution](./get_digitsubstitution/)() const | Ottiene un valore che specifica come visualizzare la forma di una cifra. |
| static [get_InvariantInfo](./get_invariantinfo/)() | Ottiene le informazioni sul formato numerico definite dalla cultura invariata. |
| [get_IsReadOnly](./get_isreadonly/)() const | Verifica se il formato è di sola lettura. |
| [get_NaNSymbol](./get_nansymbol/)() const | Ottiene il simbolo Not-a-Number. |
| [get_NativeDigits](./get_nativedigits/)() const | Ottiene i simboli delle cifre (da 0 a 9). |
| [get_NegativeInfinitySymbol](./get_negativeinfinitysymbol/)() const | Ottiene il simbolo dell'infinito negativo. |
| [get_NegativeSign](./get_negativesign/)() const | Ottiene il segno negativo. |
| [get_NumberDecimalDigits](./get_numberdecimaldigits/)() const | Ottiene il numero di cifre decimali. |
| [get_NumberDecimalSeparator](./get_numberdecimalseparator/)() const | Ottiene il separatore decimale. |
| [get_NumberGroupSeparator](./get_numbergroupseparator/)() const | Ottiene il separatore di raggruppamento dei numeri. |
| [get_NumberGroupSizes](./get_numbergroupsizes/)() const | Ottiene il numero di cifre per gruppo. |
| [get_NumberNegativePattern](./get_numbernegativepattern/)() const | Ottiene il modello negativo del numero. |
| [get_PercentDecimalDigits](./get_percentdecimaldigits/)() const | Ottiene il numero di posizioni decimali nei valori percentuali. |
| [get_PercentDecimalSeparator](./get_percentdecimalseparator/)() const | Ottiene il separatore decimale nei valori percentuali. |
| [get_PercentGroupSeparator](./get_percentgroupseparator/)() const | Ottiene il separatore di raggruppamento nei valori percentuali. |
| [get_PercentGroupSizes](./get_percentgroupsizes/)() const | Ottiene il numero di cifre per gruppo di valori percentuali. |
| [get_PercentNegativePattern](./get_percentnegativepattern/)() const | Ottiene il modello negativo della percentuale. |
| [get_PercentPositivePattern](./get_percentpositivepattern/)() const | Ottiene il modello positivo della percentuale. |
| [get_PercentSymbol](./get_percentsymbol/)() const | Ottiene il simbolo della percentuale. |
| [get_PerMilleSymbol](./get_permillesymbol/)() const | Ottiene il simbolo del per mille. |
| [get_PositiveInfinitySymbol](./get_positiveinfinitysymbol/)() const | Ottiene il simbolo dell'infinito positivo. |
| [get_PositiveSign](./get_positivesign/)() const | Restituisce il segno positivo. |
| [GetFormat](./getformat/)(const TypeInfo\&) override | Restituisce il formattatore di tipo specifico. |
| static [GetInstance](./getinstance/)(const IFormatProviderPtr\&) | Restituisce il formattatore associato al provider di formattazione. |
| [NumberFormatInfo](./numberformatinfo/)() | Costruttore predefinito (invariante [NumberFormatInfo](./)). |
| [operator=](./operator=/)(const NumberFormatInfo\&) |  |
| static [ReadOnly](./readonly/)(NumberFormatInfoPtr) | Restituisce la versione di sola lettura del formattatore. |
| [set_CurrencyDecimalDigits](./set_currencydecimaldigits/)(int) | Imposta il numero di cifre decimali della valuta. |
| [set_CurrencyDecimalSeparator](./set_currencydecimalseparator/)(const String\&) | Imposta il separatore decimale della valuta. |
| [set_CurrencyGroupSeparator](./set_currencygroupseparator/)(const String\&) | Imposta il separatore di gruppo della valuta. |
| [set_CurrencyGroupSizes](./set_currencygroupsizes/)(const ArrayPtr\<int\>\&) | Imposta il numero di cifre decimali della valuta per gruppo. |
| [set_CurrencyNegativePattern](./set_currencynegativepattern/)(int) | Imposta il modello negativo della valuta. |
| [set_CurrencyPositivePattern](./set_currencypositivepattern/)(int) | Imposta il modello positivo della valuta. |
| [set_CurrencySymbol](./set_currencysymbol/)(const String\&) | Imposta il simbolo della valuta. |
| [set_DigitSubstitution](./set_digitsubstitution/)(DigitShapes) | Imposta un valore che specifica come visualizzare la forma di una cifra. |
| [set_NaNSymbol](./set_nansymbol/)(const String\&) | Imposta il simbolo Not-a-Number. |
| [set_NativeDigits](./set_nativedigits/)(const ArrayPtr\<String\>\&) | Imposta i simboli delle cifre (da 0 a 9). |
| [set_NegativeInfinitySymbol](./set_negativeinfinitysymbol/)(const String\&) | Imposta il simbolo di infinito negativo. |
| [set_NegativeSign](./set_negativesign/)(const String\&) | Imposta il segno negativo. |
| [set_NumberDecimalDigits](./set_numberdecimaldigits/)(int) | Imposta il numero di cifre decimali. |
| [set_NumberDecimalSeparator](./set_numberdecimalseparator/)(const String\&) | Imposta il separatore decimale. |
| [set_NumberGroupSeparator](./set_numbergroupseparator/)(const String\&) | Imposta il separatore di gruppo dei numeri. |
| [set_NumberGroupSizes](./set_numbergroupsizes/)(const ArrayPtr\<int\>\&) | Imposta il numero di cifre per gruppo. |
| [set_NumberNegativePattern](./set_numbernegativepattern/)(int) | Imposta il modello negativo del numero. |
| [set_PercentDecimalDigits](./set_percentdecimaldigits/)(int) | Imposta il numero di posizioni decimali nei valori percentuali. |
| [set_PercentDecimalSeparator](./set_percentdecimalseparator/)(const String\&) | Imposta il separatore decimale nei valori percentuali. |
| [set_PercentGroupSeparator](./set_percentgroupseparator/)(const String\&) | Imposta il separatore di gruppo nei valori percentuali. |
| [set_PercentGroupSizes](./set_percentgroupsizes/)(const ArrayPtr\<int\>\&) | Imposta il numero di cifre per gruppo di valori percentuali. |
| [set_PercentNegativePattern](./set_percentnegativepattern/)(int) | Imposta il modello negativo di percentuale. |
| [set_PercentPositivePattern](./set_percentpositivepattern/)(int) | Imposta il modello positivo di percentuale. |
| [set_PercentSymbol](./set_percentsymbol/)(const String\&) | Imposta il simbolo percentuale. |
| [set_PerMilleSymbol](./set_permillesymbol/)(const String\&) | Imposta il simbolo per mille. |
| [set_PositiveInfinitySymbol](./set_positiveinfinitysymbol/)(const String\&) | Imposta il simbolo di infinito positivo. |
| [set_PositiveSign](./set_positivesign/)(const String\&) | Imposta il segno positivo. |
## Vedi anche

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
