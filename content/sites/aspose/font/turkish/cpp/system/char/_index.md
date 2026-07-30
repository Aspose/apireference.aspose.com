---
title: "System::Char sınıfı"
linktitle: "Char"
second_title: "Aspose.Font için C++"
description: "System::Char sınıfı. UTF-16 kod birimleri olarak temsil edilen karakterlerin işlenmesi için yöntemler sağlar. Bu, örnek hizmetleri olmayan statik bir türdür. C++'ta hiçbir şekilde onun örneklerini oluşturmayınız."
type: docs
weight: 1200
url: /tr/cpp/system/char/
---
## Char class


UTF-16 kod birimleri olarak temsil edilen karakterlerin işlenmesi için yöntemler sağlar. Bu, örnek hizmeti olmayan statik bir türdür. Onun örneklerini hiçbir şekilde oluşturmamalısınız.

```cpp
class Char
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [ConvertFromUtf32](./convertfromutf32/)(uint32_t) | UTF-32 kod birimini bir [System::String](../string/) sınıfı örneğine dönüştürür. |
| static [ConvertToUtf32](./converttoutf32/)(char_t, char_t) | Belirtilen UTF-16 surrogate çiftini UTF-32 kod birimine dönüştürür. |
| static [ConvertToUtf32](./converttoutf32/)(const String\&, int) | Bir dizedeki belirtilen konumdaki UTF-16 kodlu karakterin veya surrogate çiftinin değerini UTF-32 kod birimine dönüştürür. |
| static [GetNumericValue](./getnumericvalue/)(char_t) | Belirtilen UTF-16 karakterini çift duyarlıklı kayan nokta sayısal değere dönüştürür. |
| static [GetUnicodeCategory](./getunicodecategory/)(char_t) | Belirtilen karakterin Unicode kategorisini temsil eden bir değer döndürür. |
| static [IsAsciiWhiteSpace](./isasciiwhitespace/)(char_t) | Belirtilen karakterin ASCII boşluk karakteri olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsControl](./iscontrol/)(const char_t *, int) | Belirtilen karakter tamponundaki belirtilen indeksteki karakterin Unicode kontrol karakteri olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsControl](./iscontrol/)(char_t) | Belirtilen karakterin Unicode kontrol karakteri olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsDigit](./isdigit/)(const char_t *, int) | Belirtilen karakter tamponundaki belirtilen indeksdeki karakterin ondalık rakam olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsDigit](./isdigit/)(const String\&, const int32_t) | Belirtilen dizedeki belirtilen indeksdeki karakterin ondalık rakam olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsDigit](./isdigit/)(char_t) | Belirtilen karakterin ondalık rakam olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsHighSurrogate](./ishighsurrogate/)(const String\&, int) | Belirtilen dizedeki belirtilen indeksdeki karakterin UTF-16 yüksek surrogaat kod birimi olup olmadığını belirler. |
| static [IsHighSurrogate](./ishighsurrogate/)(const char_t *, int) | Belirtilen karakter tamponundaki belirtilen indeksdeki karakterin yüksek surrogaat olup olmadığını belirler. |
| static [IsHighSurrogate](./ishighsurrogate/)(char_t) | Belirtilen karakterin yüksek surrogaat olup olmadığını belirler. |
| static [IsLetter](./isletter/)(const char_t *, int) | Belirtilen karakter tamponundaki belirtilen indeksdeki karakterin Unicode harfi olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsLetter](./isletter/)(char_t) | Belirtilen karakterin Unicode harfi olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsLetterOrDigit](./isletterordigit/)(const char_t *, int) | Belirtilen karakter tamponundaki belirtilen indeksdeki karakterin Unicode harfi ya da ondalık rakam olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsLetterOrDigit](./isletterordigit/)(char_t) | Belirtilen karakterin Unicode harfi ya da ondalık rakam olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsLower](./islower/)(const char_t *, int) | Belirtilen karakter tamponundaki belirtilen indeksdeki karakterin küçük harf olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsLower](./islower/)(char_t) | Belirtilen karakterin küçük harf olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsLower](./islower/)(const String\&, int) | Belirtilen dizedeki belirtilen indeksdeki karakterin küçük harf olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsLowSurrogate](./islowsurrogate/)(const char_t *, int) | Belirtilen karakter tamponundaki belirtilen indeksdeki karakterin düşük surrogaat olup olmadığını belirler. |
| static [IsLowSurrogate](./islowsurrogate/)(char_t) | Belirtilen karakterin düşük surrogaat olup olmadığını belirler. |
| static [IsNumber](./isnumber/)(const char_t *, int) | Belirtilen karakter tamponundaki belirtilen indeksdeki karakterin sayı olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsNumber](./isnumber/)(char_t) | Belirtilen karakterin sayı olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsPunctuation](./ispunctuation/)(const char_t *, int) | Belirtilen karakter tamponundaki belirtilen indeksdeki karakterin noktalama işareti olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsPunctuation](./ispunctuation/)(char_t) | Belirtilen karakterin noktalama işareti olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsSeparator](./isseparator/)(const char_t *, int) | Belirtilen karakter tamponundaki belirtilen indeksdeki karakterin ayırıcı karakter olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsSeparator](./isseparator/)(char_t) | Belirtilen karakterin ayırıcı karakter olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsSurrogate](./issurrogate/)(char_t) | Belirtilen karakterin UTF-16 surrogaat kod birimi olup olmadığını belirler. |
| static [IsSurrogate](./issurrogate/)(const String\&, int) | Belirtilen dizedeki belirtilen indeksdeki karakterin UTF-16 surrogaat kod birimi olup olmadığını belirler. |
| static [IsSurrogatePair](./issurrogatepair/)(char_t, char_t) | Belirtilen iki karakterin UTF-16 surrogaat çifti olup olmadığını belirler. |
| static [IsSurrogatePair](./issurrogatepair/)(const String\&, int) | Belirtilen karakter tamponundaki iki ardışık karakterin bir surrogate çifti olup olmadığını belirler. |
| static [IsSymbol](./issymbol/)(const char_t *, int) | Belirtilen karakter tamponundaki belirtilen indeksdeki karakterin bir sembol karakteri olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsSymbol](./issymbol/)(char_t) | Belirtilen karakterin bir sembol karakteri olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsUpper](./isupper/)(const String\&, int) | Belirtilen dizedeki belirtilen indeksdeki karakterin büyük harf olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsUpper](./isupper/)(const char_t *, int) | Belirtilen karakter tamponundaki belirtilen indeksdeki karakterin büyük harf olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsUpper](./isupper/)(char_t) | Belirtilen karakterin büyük harf olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsWhiteSpace](./iswhitespace/)(const char_t *, int) | Belirtilen karakter tamponundaki belirtilen indeksdeki karakterin boşluk karakteri olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsWhiteSpace](./iswhitespace/)(char_t) | Belirtilen karakterin boşluk karakteri olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsWhiteSpace](./iswhitespace/)(const String\&, int) | Belirtilen dizedeki belirtilen indeksdeki karakterin boşluk karakteri olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [Parse](./parse/)(const String\&) | Belirtilen dizedeki ilk ve tek karakteri bir char_t değerine dönüştürür. |
| static [ToLower](./tolower/)(char_t) | Belirtilen karakteri küçük harfe dönüştürür. |
| static [ToLower](./tolower/)(char_t, const SharedPtr\<Globalization::CultureInfo\>\&) | Belirtilen karakteri küçük harfe dönüştürür. |
| static [ToLowerInvariant](./tolowerinvariant/)(char_t) | Belirtilen karakteri küçük harfe dönüştürür. |
| static [ToUpper](./toupper/)(char_t) | Belirtilen karakteri büyük harfe dönüştürür. |
| static [ToUpper](./toupper/)(char_t, const SharedPtr\<Globalization::CultureInfo\>\&) | Belirtilen karakteri büyük harfe dönüştürür. |
| static [ToUpperInvariant](./toupperinvariant/)(char_t) | Belirtilen karakteri büyük harfe dönüştürür. |
| static [TryParse](./tryparse/)(const System::String\&, char_t\&) | Tek bir karakterden oluşan bir dizeyi UTF-16 karakterine dönüştürmeye çalışır. Fonksiyon yalnızca giriş dizesi null olmadığında ve tam olarak bir karakter uzunluğunda olduğunda başarılı olur. |
## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
