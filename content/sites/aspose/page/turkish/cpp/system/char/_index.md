---
title: "System::Char sınıfı"
linktitle: "Char"
second_title: "Aspose.Page için C++"
description: "System::Char sınıfı. UTF-16 kod birimleri olarak temsil edilen karakterlerin işlenmesi için yöntemler sağlar. Bu, örnek hizmeti olmayan statik bir tiptir. C++'da hiçbir şekilde onun örneklerini oluşturmamalısınız."
type: docs
weight: 1200
url: /tr/cpp/system/char/
---
## Char class


UTF-16 kod birimleri olarak temsil edilen karakterlerin işlenmesi için yöntemler sağlar. Bu, örnek hizmeti olmayan statik bir türdür. Onun örneklerini hiçbir şekilde oluşturmayın.

```cpp
class Char
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [ConvertFromUtf32](./convertfromutf32/)(uint32_t) | UTF-32 kod birimini [System::String](../string/) sınıfının bir örneğine dönüştürür. |
| static [ConvertToUtf32](./converttoutf32/)(char_t, char_t) | Belirtilen UTF-16 yedek çiftini UTF-32 kod birimine dönüştürür. |
| static [ConvertToUtf32](./converttoutf32/)(const String\&, int) | Belirtilen bir konumdaki bir dizede UTF-16 kodlu karakterin veya yedek çiftinin değerini UTF-32 kod birimine dönüştürür. |
| static [GetNumericValue](./getnumericvalue/)(char_t) | Belirtilen UTF-16 karakterini çift duyarlıklı kayan nokta sayısal değerine dönüştürür. |
| static [GetUnicodeCategory](./getunicodecategory/)(char_t) | Belirtilen karakterin bir Unicode kategorisini temsil eden bir değer döndürür. |
| static [IsAsciiWhiteSpace](./isasciiwhitespace/)(char_t) | Belirtilen karakterin ASCII boşluk karakteri olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsControl](./iscontrol/)(const char_t *, int) | Belirtilen karakter tamponundaki belirtilen indeksteki karakterin Unicode kontrol karakteri olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsControl](./iscontrol/)(char_t) | Belirtilen karakterin Unicode kontrol karakteri olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsDigit](./isdigit/)(const char_t *, int) | Belirtilen karakter tamponundaki belirtilen indeksteki karakterin ondalık rakam olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsDigit](./isdigit/)(const String\&, const int32_t) | Belirtilen dizedeki belirtilen indeksteki karakterin ondalık rakam olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsDigit](./isdigit/)(char_t) | Belirtilen karakterin ondalık rakam olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsHighSurrogate](./ishighsurrogate/)(const String\&, int) | Belirtilen dizedeki belirtilen indeksteki karakterin UTF-16 yüksek yedek kod birimi olup olmadığını belirler. |
| static [IsHighSurrogate](./ishighsurrogate/)(const char_t *, int) | Belirtilen karakter tamponundaki belirtilen indeksteki karakterin yüksek yedek olup olmadığını belirler. |
| static [IsHighSurrogate](./ishighsurrogate/)(char_t) | Belirtilen karakterin yüksek yedek olup olmadığını belirler. |
| static [IsLetter](./isletter/)(const char_t *, int) | Belirtilen karakter tamponundaki belirtilen indeksteki karakterin Unicode harfi olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsLetter](./isletter/)(char_t) | Belirtilen karakterin Unicode harfi olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsLetterOrDigit](./isletterordigit/)(const char_t *, int) | Belirtilen karakter tamponundaki belirtilen indeksteki karakterin Unicode harfi veya ondalık rakam olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsLetterOrDigit](./isletterordigit/)(char_t) | Belirtilen karakterin Unicode harfi veya ondalık rakam olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsLower](./islower/)(const char_t *, int) | Belirtilen karakter tamponundaki belirtilen indeksteki karakterin küçük harf olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsLower](./islower/)(char_t) | Belirtilen karakterin küçük harf olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsLower](./islower/)(const String\&, int) | Belirtilen dizedeki belirtilen indeksteki karakterin küçük harf olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsLowSurrogate](./islowsurrogate/)(const char_t *, int) | Belirtilen karakter tamponundaki belirtilen indeksteki karakterin düşük yedek olup olmadığını belirler. |
| static [IsLowSurrogate](./islowsurrogate/)(char_t) | Belirtilen karakterin düşük yedek olup olmadığını belirler. |
| static [IsNumber](./isnumber/)(const char_t *, int) | Belirtilen karakter tamponundaki belirtilen indeksteki karakterin sayı olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsNumber](./isnumber/)(char_t) | Belirtilen karakterin sayı olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsPunctuation](./ispunctuation/)(const char_t *, int) | Belirtilen karakter tamponundaki belirtilen indeksteki karakterin noktalama işareti olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsPunctuation](./ispunctuation/)(char_t) | Belirtilen karakterin noktalama işareti olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsSeparator](./isseparator/)(const char_t *, int) | Belirtilen karakter tamponundaki belirtilen dizindeki karakterin ayırıcı karakter olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsSeparator](./isseparator/)(char_t) | Belirtilen karakterin ayırıcı karakter olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsSurrogate](./issurrogate/)(char_t) | Belirtilen karakterin UTF-16 yedek kod birimi olup olmadığını belirler. |
| static [IsSurrogate](./issurrogate/)(const String\&, int) | Belirtilen dizedeki belirtilen dizindeki karakterin UTF-16 yedek kod birimi olup olmadığını belirler. |
| static [IsSurrogatePair](./issurrogatepair/)(char_t, char_t) | Belirtilen iki karakterin bir UTF-16 yedek çiftini oluşturup oluşturmadığını belirler. |
| static [IsSurrogatePair](./issurrogatepair/)(const String\&, int) | Belirtilen karakter tamponundaki ardışık iki karakterin yedek çift olup olmadığını belirler. |
| static [IsSymbol](./issymbol/)(const char_t *, int) | Belirtilen karakter tamponundaki belirtilen dizindeki karakterin sembol karakter olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsSymbol](./issymbol/)(char_t) | Belirtilen karakterin sembol karakter olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsUpper](./isupper/)(const String\&, int) | Belirtilen dizedeki belirtilen dizindeki karakterin büyük harf olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsUpper](./isupper/)(const char_t *, int) | Belirtilen karakter tamponundaki belirtilen dizindeki karakterin büyük harf olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsUpper](./isupper/)(char_t) | Belirtilen karakterin büyük harf olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsWhiteSpace](./iswhitespace/)(const char_t *, int) | Belirtilen karakter tamponundaki belirtilen dizindeki karakterin boşluk karakteri olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsWhiteSpace](./iswhitespace/)(char_t) | Belirtilen karakterin boşluk karakteri olarak sınıflandırılıp sınıflandırılmadığını belirler. |
| static [IsWhiteSpace](./iswhitespace/)(const String\&, int) | Belirtilen dizedeki belirtilen dizindeki karakterin boşluk karakteri olarak sınıflandırılıp sınıflandırılmadığını belirler. |
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
* Library [Aspose.Page for C++](../../)
