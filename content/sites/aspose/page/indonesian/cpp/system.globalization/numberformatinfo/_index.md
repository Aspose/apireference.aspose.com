---
title: "kelas System::Globalization::NumberFormatInfo"
linktitle: "NumberFormatInfo"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Globalization::NumberFormatInfo. Menyimpan informasi tentang cara memformat angka. Operasi setter hanya diaktifkan pada objek yang tidak hanya-baca. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1900
url: /id/cpp/system.globalization/numberformatinfo/
---
## NumberFormatInfo class


Menampung informasi tentang cara memformat angka. Operasi setter hanya diaktifkan pada objek yang tidak hanya-baca. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class NumberFormatInfo : public virtual System::Object,
                         public System::IFormatProvider,
                         public System::ICloneable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() override | Mengkloning informasi format. |
| [get_CurrencyDecimalDigits](./get_currencydecimaldigits/)() const | Mendapatkan jumlah digit desimal mata uang. |
| [get_CurrencyDecimalSeparator](./get_currencydecimalseparator/)() const | Mendapatkan pemisah desimal mata uang. |
| [get_CurrencyGroupSeparator](./get_currencygroupseparator/)() const | Mendapatkan pemisah grup mata uang. |
| [get_CurrencyGroupSizes](./get_currencygroupsizes/)() const | Mendapatkan jumlah digit desimal mata uang per grup. |
| [get_CurrencyNegativePattern](./get_currencynegativepattern/)() const | Mendapatkan pola negatif mata uang. |
| [get_CurrencyPositivePattern](./get_currencypositivepattern/)() const | Mendapatkan pola positif mata uang. |
| [get_CurrencySymbol](./get_currencysymbol/)() const | Mendapatkan simbol mata uang. |
| static [get_CurrentInfo](./get_currentinfo/)() | Mendapatkan informasi format angka yang didefinisikan oleh budaya thread saat ini. |
| [get_DigitSubstitution](./get_digitsubstitution/)() const | Mendapatkan nilai yang menentukan cara menampilkan bentuk digit. |
| static [get_InvariantInfo](./get_invariantinfo/)() | Mendapatkan informasi format angka yang didefinisikan oleh budaya invarian. |
| [get_IsReadOnly](./get_isreadonly/)() const | Memeriksa apakah format bersifat hanya-baca. |
| [get_NaNSymbol](./get_nansymbol/)() const | Mendapatkan simbol Not-a-Number. |
| [get_NativeDigits](./get_nativedigits/)() const | Mendapatkan simbol digit (0 hingga 9). |
| [get_NegativeInfinitySymbol](./get_negativeinfinitysymbol/)() const | Mendapatkan simbol tak terhingga negatif. |
| [get_NegativeSign](./get_negativesign/)() const | Mendapatkan tanda negatif. |
| [get_NumberDecimalDigits](./get_numberdecimaldigits/)() const | Mendapatkan jumlah digit desimal. |
| [get_NumberDecimalSeparator](./get_numberdecimalseparator/)() const | Mendapatkan pemisah desimal. |
| [get_NumberGroupSeparator](./get_numbergroupseparator/)() const | Mendapatkan pemisah grup angka. |
| [get_NumberGroupSizes](./get_numbergroupsizes/)() const | Mendapatkan jumlah digit per grup. |
| [get_NumberNegativePattern](./get_numbernegativepattern/)() const | Mendapatkan pola negatif angka. |
| [get_PercentDecimalDigits](./get_percentdecimaldigits/)() const | Mendapatkan jumlah tempat desimal dalam nilai persentase. |
| [get_PercentDecimalSeparator](./get_percentdecimalseparator/)() const | Mendapatkan pemisah desimal dalam nilai persentase. |
| [get_PercentGroupSeparator](./get_percentgroupseparator/)() const | Mendapatkan pemisah grup dalam nilai persentase. |
| [get_PercentGroupSizes](./get_percentgroupsizes/)() const | Mendapatkan jumlah digit per grup nilai persentase. |
| [get_PercentNegativePattern](./get_percentnegativepattern/)() const | Mendapatkan pola negatif persentase. |
| [get_PercentPositivePattern](./get_percentpositivepattern/)() const | Mendapatkan pola positif persentase. |
| [get_PercentSymbol](./get_percentsymbol/)() const | Mendapatkan simbol persen. |
| [get_PerMilleSymbol](./get_permillesymbol/)() const | Mendapatkan simbol permil. |
| [get_PositiveInfinitySymbol](./get_positiveinfinitysymbol/)() const | Mendapatkan simbol tak terhingga positif. |
| [get_PositiveSign](./get_positivesign/)() const | Mendapatkan tanda positif. |
| [GetFormat](./getformat/)(const TypeInfo\&) override | Mendapatkan formatir dari tipe tertentu. |
| static [GetInstance](./getinstance/)(const IFormatProviderPtr\&) | Mendapatkan formatir yang terkait dengan penyedia format. |
| [NumberFormatInfo](./numberformatinfo/)() | Konstruktor default (invarian [NumberFormatInfo](./)). |
| [operator=](./operator=/)(const NumberFormatInfo\&) |  |
| static [ReadOnly](./readonly/)(NumberFormatInfoPtr) | Mendapatkan versi hanya-baca dari formatir. |
| [set_CurrencyDecimalDigits](./set_currencydecimaldigits/)(int) | Mengatur jumlah digit desimal mata uang. |
| [set_CurrencyDecimalSeparator](./set_currencydecimalseparator/)(const String\&) | Mengatur pemisah desimal mata uang. |
| [set_CurrencyGroupSeparator](./set_currencygroupseparator/)(const String\&) | Mengatur pemisah grup mata uang. |
| [set_CurrencyGroupSizes](./set_currencygroupsizes/)(const ArrayPtr\<int\>\&) | Mengatur jumlah digit desimal mata uang per grup. |
| [set_CurrencyNegativePattern](./set_currencynegativepattern/)(int) | Mengatur pola negatif mata uang. |
| [set_CurrencyPositivePattern](./set_currencypositivepattern/)(int) | Mengatur pola positif mata uang. |
| [set_CurrencySymbol](./set_currencysymbol/)(const String\&) | Mengatur simbol mata uang. |
| [set_DigitSubstitution](./set_digitsubstitution/)(DigitShapes) | Mengatur nilai yang menentukan cara menampilkan bentuk digit. |
| [set_NaNSymbol](./set_nansymbol/)(const String\&) | Mengatur simbol Not-a-Number. |
| [set_NativeDigits](./set_nativedigits/)(const ArrayPtr\<String\>\&) | Mengatur simbol digit (0 hingga 9). |
| [set_NegativeInfinitySymbol](./set_negativeinfinitysymbol/)(const String\&) | Mengatur simbol tak terhingga negatif. |
| [set_NegativeSign](./set_negativesign/)(const String\&) | Mengatur tanda negatif. |
| [set_NumberDecimalDigits](./set_numberdecimaldigits/)(int) | Mengatur jumlah digit desimal. |
| [set_NumberDecimalSeparator](./set_numberdecimalseparator/)(const String\&) | Mengatur pemisah desimal. |
| [set_NumberGroupSeparator](./set_numbergroupseparator/)(const String\&) | Mengatur pemisah grup angka. |
| [set_NumberGroupSizes](./set_numbergroupsizes/)(const ArrayPtr\<int\>\&) | Mengatur jumlah digit per grup. |
| [set_NumberNegativePattern](./set_numbernegativepattern/)(int) | Mengatur pola negatif angka. |
| [set_PercentDecimalDigits](./set_percentdecimaldigits/)(int) | Mengatur jumlah tempat desimal dalam nilai persentase. |
| [set_PercentDecimalSeparator](./set_percentdecimalseparator/)(const String\&) | Mengatur pemisah desimal dalam nilai persentase. |
| [set_PercentGroupSeparator](./set_percentgroupseparator/)(const String\&) | Mengatur pemisah grup dalam nilai persentase. |
| [set_PercentGroupSizes](./set_percentgroupsizes/)(const ArrayPtr\<int\>\&) | Mengatur jumlah digit per grup nilai persentase. |
| [set_PercentNegativePattern](./set_percentnegativepattern/)(int) | Mengatur pola negatif persentase. |
| [set_PercentPositivePattern](./set_percentpositivepattern/)(int) | Mengatur pola positif persentase. |
| [set_PercentSymbol](./set_percentsymbol/)(const String\&) | Mengatur simbol persentase. |
| [set_PerMilleSymbol](./set_permillesymbol/)(const String\&) | Mengatur simbol permil. |
| [set_PositiveInfinitySymbol](./set_positiveinfinitysymbol/)(const String\&) | Mengatur simbol tak terhingga positif. |
| [set_PositiveSign](./set_positivesign/)(const String\&) | Mengatur tanda positif. |
## Lihat Juga

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
