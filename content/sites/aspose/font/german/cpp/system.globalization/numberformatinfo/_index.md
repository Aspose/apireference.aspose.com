---
title: "System::Globalization::NumberFormatInfo Klasse"
linktitle: "NumberFormatInfo"
second_title: "Aspose.Font für C++"
description: "System::Globalization::NumberFormatInfo Klasse. Enthält Informationen darüber, wie Zahlen formatiert werden. Setter-Operationen sind nur bei nicht schreibgeschützten Objekten aktiviert. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1900
url: /de/cpp/system.globalization/numberformatinfo/
---
## NumberFormatInfo class


Enthält Informationen darüber, wie Zahlen formatiert werden. Setter-Operationen sind nur bei nicht schreibgeschützten Objekten aktiviert. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class NumberFormatInfo : public virtual System::Object,
                         public System::IFormatProvider,
                         public System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() override | Kopiert Formatinformationen. |
| [get_CurrencyDecimalDigits](./get_currencydecimaldigits/)() const | Gibt die Anzahl der Dezimalstellen der Währung zurück. |
| [get_CurrencyDecimalSeparator](./get_currencydecimalseparator/)() const | Gibt das Dezimaltrennzeichen der Währung zurück. |
| [get_CurrencyGroupSeparator](./get_currencygroupseparator/)() const | Gibt das Tausendertrennzeichen der Währung zurück. |
| [get_CurrencyGroupSizes](./get_currencygroupsizes/)() const | Gibt die Anzahl der Dezimalstellen pro Gruppe für die Währung zurück. |
| [get_CurrencyNegativePattern](./get_currencynegativepattern/)() const | Gibt das negative Währungsmuster zurück. |
| [get_CurrencyPositivePattern](./get_currencypositivepattern/)() const | Gibt das positive Währungsmuster zurück. |
| [get_CurrencySymbol](./get_currencysymbol/)() const | Gibt das Währungssymbol zurück. |
| static [get_CurrentInfo](./get_currentinfo/)() | Gibt die vom aktuellen Thread‑Kultur definierten Zahlenformatinformationen zurück. |
| [get_DigitSubstitution](./get_digitsubstitution/)() const | Gibt einen Wert zurück, der angibt, wie die Form einer Ziffer angezeigt wird. |
| static [get_InvariantInfo](./get_invariantinfo/)() | Gibt die von der invarianten Kultur definierten Zahlenformatinformationen zurück. |
| [get_IsReadOnly](./get_isreadonly/)() const | Überprüft, ob das Format schreibgeschützt ist. |
| [get_NaNSymbol](./get_nansymbol/)() const | Gibt das Nicht‑eine‑Zahl‑Symbol zurück. |
| [get_NativeDigits](./get_nativedigits/)() const | Gibt die Ziffernsymbole (0 bis 9) zurück. |
| [get_NegativeInfinitySymbol](./get_negativeinfinitysymbol/)() const | Gibt das Symbol für negative Unendlichkeit zurück. |
| [get_NegativeSign](./get_negativesign/)() const | Gibt das Minuszeichen zurück. |
| [get_NumberDecimalDigits](./get_numberdecimaldigits/)() const | Gibt die Anzahl der Dezimalstellen zurück. |
| [get_NumberDecimalSeparator](./get_numberdecimalseparator/)() const | Gibt das Dezimaltrennzeichen zurück. |
| [get_NumberGroupSeparator](./get_numbergroupseparator/)() const | Gibt das Tausendertrennzeichen zurück. |
| [get_NumberGroupSizes](./get_numbergroupsizes/)() const | Gibt die Anzahl der Ziffern pro Gruppe zurück. |
| [get_NumberNegativePattern](./get_numbernegativepattern/)() const | Gibt das negative Zahlenmuster zurück. |
| [get_PercentDecimalDigits](./get_percentdecimaldigits/)() const | Gibt die Anzahl der Dezimalstellen in Prozentwerten zurück. |
| [get_PercentDecimalSeparator](./get_percentdecimalseparator/)() const | Gibt das Dezimaltrennzeichen in Prozentwerten zurück. |
| [get_PercentGroupSeparator](./get_percentgroupseparator/)() const | Gibt das Gruppentrennzeichen in Prozentwerten zurück. |
| [get_PercentGroupSizes](./get_percentgroupsizes/)() const | Gibt die Anzahl der Ziffern pro Prozentwertgruppe zurück. |
| [get_PercentNegativePattern](./get_percentnegativepattern/)() const | Gibt das negative Prozentmuster zurück. |
| [get_PercentPositivePattern](./get_percentpositivepattern/)() const | Gibt das positive Prozentmuster zurück. |
| [get_PercentSymbol](./get_percentsymbol/)() const | Gibt das Prozentzeichen zurück. |
| [get_PerMilleSymbol](./get_permillesymbol/)() const | Gibt das Promillezeichen zurück. |
| [get_PositiveInfinitySymbol](./get_positiveinfinitysymbol/)() const | Gibt das Symbol für positive Unendlichkeit zurück. |
| [get_PositiveSign](./get_positivesign/)() const | Gibt das positive Vorzeichen zurück. |
| [GetFormat](./getformat/)(const TypeInfo\&) override | Gibt den Formatter des angegebenen Typs zurück. |
| static [GetInstance](./getinstance/)(const IFormatProviderPtr\&) | Gibt den mit dem Formatprovider verknüpften Formatter zurück. |
| [NumberFormatInfo](./numberformatinfo/)() | Standardkonstruktor (invariant [NumberFormatInfo](./)). |
| [operator=](./operator=/)(const NumberFormatInfo\&) |  |
| static [ReadOnly](./readonly/)(NumberFormatInfoPtr) | Gibt die schreibgeschützte Version des Formatters zurück. |
| [set_CurrencyDecimalDigits](./set_currencydecimaldigits/)(int) | Legt die Anzahl der Dezimalstellen für die Währung fest. |
| [set_CurrencyDecimalSeparator](./set_currencydecimalseparator/)(const String\&) | Legt das Dezimaltrennzeichen für die Währung fest. |
| [set_CurrencyGroupSeparator](./set_currencygroupseparator/)(const String\&) | Legt das Tausendertrennzeichen für die Währung fest. |
| [set_CurrencyGroupSizes](./set_currencygroupsizes/)(const ArrayPtr\<int\>\&) | Legt die Anzahl der Dezimalstellen pro Gruppe für die Währung fest. |
| [set_CurrencyNegativePattern](./set_currencynegativepattern/)(int) | Legt das negative Währungsformat fest. |
| [set_CurrencyPositivePattern](./set_currencypositivepattern/)(int) | Legt das positive Währungsformat fest. |
| [set_CurrencySymbol](./set_currencysymbol/)(const String\&) | Legt das Währungssymbol fest. |
| [set_DigitSubstitution](./set_digitsubstitution/)(DigitShapes) | Legt einen Wert fest, der angibt, wie die Form einer Ziffer angezeigt wird. |
| [set_NaNSymbol](./set_nansymbol/)(const String\&) | Legt das Symbol für Nicht‑eine‑Zahl fest. |
| [set_NativeDigits](./set_nativedigits/)(const ArrayPtr\<String\>\&) | Legt die Ziffernsymbole (0 bis 9) fest. |
| [set_NegativeInfinitySymbol](./set_negativeinfinitysymbol/)(const String\&) | Legt das Symbol für negative Unendlichkeit fest. |
| [set_NegativeSign](./set_negativesign/)(const String\&) | Legt das negative Vorzeichen fest. |
| [set_NumberDecimalDigits](./set_numberdecimaldigits/)(int) | Legt die Anzahl der Dezimalstellen fest. |
| [set_NumberDecimalSeparator](./set_numberdecimalseparator/)(const String\&) | Legt das Dezimaltrennzeichen fest. |
| [set_NumberGroupSeparator](./set_numbergroupseparator/)(const String\&) | Legt das Tausendertrennzeichen für Zahlen fest. |
| [set_NumberGroupSizes](./set_numbergroupsizes/)(const ArrayPtr\<int\>\&) | Legt die Anzahl der Ziffern pro Gruppe fest. |
| [set_NumberNegativePattern](./set_numbernegativepattern/)(int) | Legt das negative Zahlenformat fest. |
| [set_PercentDecimalDigits](./set_percentdecimaldigits/)(int) | Legt die Anzahl der Dezimalstellen für Prozentwerte fest. |
| [set_PercentDecimalSeparator](./set_percentdecimalseparator/)(const String\&) | Legt das Dezimaltrennzeichen für Prozentwerte fest. |
| [set_PercentGroupSeparator](./set_percentgroupseparator/)(const String\&) | Legt das Gruppentrennzeichen für Prozentwerte fest. |
| [set_PercentGroupSizes](./set_percentgroupsizes/)(const ArrayPtr\<int\>\&) | Legt die Anzahl der Ziffern pro Prozentwertgruppe fest. |
| [set_PercentNegativePattern](./set_percentnegativepattern/)(int) | Legt das negative Prozentmuster fest. |
| [set_PercentPositivePattern](./set_percentpositivepattern/)(int) | Legt das positive Prozentmuster fest. |
| [set_PercentSymbol](./set_percentsymbol/)(const String\&) | Legt das Prozentzeichen fest. |
| [set_PerMilleSymbol](./set_permillesymbol/)(const String\&) | Legt das Promillezeichen fest. |
| [set_PositiveInfinitySymbol](./set_positiveinfinitysymbol/)(const String\&) | Legt das Symbol für positive Unendlichkeit fest. |
| [set_PositiveSign](./set_positivesign/)(const String\&) | Legt das positive Vorzeichen fest. |
## Siehe auch

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
