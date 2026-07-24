---
title: "System::String klasse"
linktitle: "String"
second_title: "Aspose.Page voor C++"
description: "System::String klasse. String‑klasse die in de hele bibliotheek wordt gebruikt. Is een vervanging voor C# System.String bij het vertalen van code. Om optimalisatieredenen wordt het niet beschouwd als een Object‑subklasse. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de klasse System::SmartPtr om objecten van dit type in C++ te beheren."
type: docs
weight: 5800
url: /nl/cpp/system/string/
---
## String class


[String](./) class used across the library. Is a substitute for C# [System.String](./) when translating code. For optimization reasons, isn't considered an [Object](../object/) subclass. This type should be allocated on stack and passed to functions by value or by reference. Never use [System::SmartPtr](../smartptr/) class to manage objects of this type.

```cpp
class String
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [ASPOSECPP_VALUE_TYPE_IMPLEMENTS_INTERFACES](./asposecpp_value_type_implements_interfaces/)() | [String](./) is een waardetype aan de C++‑kant dat impliciet (zonder overerving) enkele interfaces implementeert. |
| [begin](./begin/)() const | Retourneert een pointer naar het begin van de daadwerkelijke stringbuffer. Realloceert nooit iets. Garandeert niet dat de buffer null‑geëindigd is. |
| [Clone](./clone/)() const | Maakt een kopie van de huidige string. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, bool) | Less-equal-greater vergelijkt twee substrings. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) | Less-equal-greater vergelijkt twee substrings. |
| static [Compare](./compare/)(const String\&, const String\&, System::StringComparison) | Less-equal-greater vergelijkt twee strings. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, System::StringComparison) | Less-equal-greater vergelijkt twee strings. |
| static [Compare](./compare/)(const String\&, const String\&, bool) | Less-equal-greater vergelijkt twee strings. |
| static [Compare](./compare/)(const String\&, const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) | Less-equal-greater vergelijkt twee strings. |
| static [CompareOrdinal](./compareordinal/)(const String\&, const String\&) | Less-equal-greater vergelijkt twee strings met behulp van de ordinale modus. |
| static [CompareOrdinal](./compareordinal/)(const String\&, int, const String\&, int, int) | Less-equal-greater vergelijkt twee strings met behulp van de ordinale modus. |
| [CompareTo](./compareto/)(const String\&) const | Vergelijkt twee strings in 'less-equals-more' stijl. Gebruikt de huidige cultuur. |
| static [Concat](./concat/)(const ArrayPtr\<String\>\&) | Voegt strings samen. |
| static [Concat](./concat/)(const String\&, const String\&) | Voegt strings samen. |
| static [Concat](./concat/)(const String\&, const String\&, const String\&) | Voegt strings samen. |
| static [Concat](./concat/)(const String\&, const String\&, const String\&, const String\&) | Voegt strings samen. |
| [Contains](./contains/)(const String\&) const | Controleert of str een substring is van de huidige string. |
| [Contains](./contains/)(char16_t) const | Controleert of de string het opgegeven teken bevat. |
| static [Copy](./copy/)(const String\&) | Maakt een stringkopie. |
| [CopyTo](./copyto/)(int, const ArrayPtr\<char_t\>\&, int, int) const | Kopieert stringtekens naar bestaande array‑elementen. Er wordt niet herschaald. |
| [end](./end/)() const | Retourneert een pointer naar het einde van de daadwerkelijke stringbuffer. Realloceert nooit iets. Garandeert niet dat de buffer null‑geëindigd is. |
| [EndsWith](./endswith/)(const String\&) const | Controleert of de string eindigt op de opgegeven substring. |
| [EndsWith](./endswith/)(const String\&, System::StringComparison) const | Controleert of de string eindigt op de opgegeven substring. |
| [EndsWith](./endswith/)(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Controleert of de string eindigt op de opgegeven substring. |
| [Equals](./equals/)(const String\&, System::StringComparison) const | [String](./) gelijkheidsvergelijking. Verschillende modi die worden geleverd door de enumeratie [StringComparison](../stringcomparison/) worden ondersteund. |
| [Equals](./equals/)(const String\&) const | [String](./) gelijkheidsvergelijking. Gebruikt de vergelijkingsmodus [System::StringComparison::Ordinal](../stringcomparison/). |
| static [Equals](./equals/)(const String\&, const String\&) | Equal vergelijkt twee strings met de Ordial vergelijkingsmodus. |
| static [Equals](./equals/)(const String\&, const String\&, System::StringComparison) | Equal vergelijkt twee strings. |
| [FastToAscii](./fasttoascii/)(char, int) const | Probeert een [String](./) naar een ASCII‑string te converteren. |
| static [Format](./format/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const Args\&...) | Formatteert string in C#‑stijl. |
| static [Format](./format/)(std::nullptr_t, const String\&, const Args\&...) | Formatteert string in C#‑stijl. |
| static [Format](./format/)(std::nullptr_t, const char16_t(&), const Args\&...) | Formatteert string in C#‑stijl. |
| static [Format](./format/)(const String\&, const Args\&...) | Formatteert string in C#‑stijl. |
| static [Format](./format/)(const String\&, const System::ArrayPtr\<T\>\&) | Formatteert string in C#‑stijl. |
| static [FromAscii](./fromascii/)(const char *) | Maakt een [String](./) aan vanuit een ASCII‑string. |
| static [FromAscii](./fromascii/)(const char *, int) | Maakt een [String](./) aan vanuit een ASCII‑string. |
| static [FromAscii](./fromascii/)(const std::string\&) | Maakt een [String](./) aan vanuit een ASCII‑string. |
| static [FromUtf16](./fromutf16/)(const std::u16string\&) | Maakt een [String](./) aan vanuit een UTF‑16‑string. |
| static [FromUtf32](./fromutf32/)(const uint32_t *, int32_t) | Maakt een [String](./) aan vanuit een UTF‑32‑string. |
| static [FromUtf8](./fromutf8/)(const char *) | Maakt een [String](./) aan vanuit een UTF‑8‑string. |
| static [FromUtf8](./fromutf8/)(const char *, int) | Maakt een [String](./) aan vanuit een UTF‑8‑string. |
| static [FromUtf8](./fromutf8/)(const uint8_t *) | Maakt een [String](./) aan vanuit een UTF‑8‑string. |
| static [FromUtf8](./fromutf8/)(const std::string\&) | Maakt een [String](./) aan vanuit een UTF‑8‑string. |
| static [FromWCS](./fromwcs/)(const std::wstring\&) | Maakt een [String](./) aan vanuit een wide‑string. |
| [get_Length](./get_length/)() const | Haalt de lengte van de string op. |
| [GetHashCode](./gethashcode/)() const | Hasht de aanwezige string. Geïmplementeerd in ICU, komt niet overeen met hashes in C#. |
| [IndexOf](./indexof/)(const String\&, System::StringComparison) const | Voorwaartse zoekopdracht in substring. |
| [IndexOf](./indexof/)(char_t, int) const | Voorwaartse zoekopdracht naar teken. |
| [IndexOf](./indexof/)(char_t, int, int) const | Voorwaartse zoekopdracht naar teken in substring. |
| [IndexOf](./indexof/)(const String\&, int) const | Voorwaartse zoekopdracht in substring. |
| [IndexOf](./indexof/)(const String\&, int, System::StringComparison) const | Voorwaartse zoekopdracht in substring. |
| [IndexOf](./indexof/)(const String\&, int, int, System::StringComparison) const | Voorwaartse zoekopdracht in substring. |
| [IndexOf](./indexof/)(const String\&, int, int) const | Voorwaartse zoekopdracht in substring. |
| [IndexOfAny](./indexofany/)(char_t, int) const | Voorwaartse zoekopdracht naar teken. |
| [IndexOfAny](./indexofany/)(const String\&, int) const | Zoekt vervolgens naar alle tekens van str hierin. Als het eerste teken wordt gevonden, wordt de positie geretourneerd, anders wordt naar het tweede teken gezocht, enzovoort. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&) const | Zoekt naar elk van de opgegeven tekens in de volledige string. Vergelijkt het eerste teken van de string met alle tekens in anyOf, vervolgens het tweede teken, enzovoort. Retourneert de index van het eerste teken dat overeenkomt met een van de doeltekens. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&, int32_t) const | Zoekt naar elk van de opgegeven tekens in een substring. Vergelijkt het eerste teken van de string met alle tekens in anyOf, vervolgens het tweede teken, enzovoort. Retourneert de index van het eerste teken dat overeenkomt met een van de doeltekens. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const | Zoekt naar elk van de opgegeven tekens in een substring. Vergelijkt het eerste teken van de string met alle tekens in anyOf, vervolgens het tweede teken, enzovoort. Retourneert de index van het eerste teken dat overeenkomt met een van de doeltekens. |
| [Insert](./insert/)(int, const String\&) const | Voegt een substring in op de opgegeven positie. |
| [Is](./is/)(const System::TypeInfo\&) const | Controleert of het string‑object van het type is dat is opgegeven door de meegegeven [TypeInfo](../typeinfo/). |
| [IsAsciiString](./isasciistring/)() const | Geeft aan of een [String](./) alleen ASCII‑symbolen bevat. |
| [IsEmpty](./isempty/)() const | Controleert of de string zowel niet‑null als leeg is. |
| [IsNormalized](./isnormalized/)(System::Text::NormalizationForm) const | Controleert of de Unicode‑string genormaliseerd is met de opgegeven normalisatie‑vorm. |
| [IsNull](./isnull/)() const | Controleert of de string als null wordt beschouwd. Een [String](./) is null alleen als deze is geconstrueerd via de [String()](./string/) constructor, verplaatst, gekopieerd of toegewezen van een null‑string, of als de [reset()](./reset/)‑methode is aangeroepen. |
| [IsNullOrEmpty](./isnullorempty/)() const | Controleert of de string leeg is of als null wordt beschouwd. |
| static [IsNullOrEmpty](./isnullorempty/)(const String\&) | Controleert of de meegegeven string null of leeg is. |
| static [IsNullOrWhiteSpace](./isnullorwhitespace/)(const String\&) | Geeft aan of een opgegeven string null, leeg, of uitsluitend uit witruimte‑tekens bestaat. |
| static [Join](./join/)(const String\&, const ArrayPtr\<String\>\&, int, int) | Voegt een array samen met een string als scheidingsteken. |
| static [Join](./join/)(const String\&, const System::Details::ArrayView\<String\>\&, int, int) | Voegt een array samen met een string als scheidingsteken. |
| static [Join](./join/)(const String\&, const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\&) | Voegt een array samen met een string als scheidingsteken. |
| static [Join](./join/)(const String\&, const ArrayPtr\<SharedPtr\<Object\>\>\&) | Voegt een array samen met een string als scheidingsteken. |
| [LastIndexOf](./lastindexof/)(const String\&, int) const | Substring achterwaartse zoekopdracht. |
| [LastIndexOf](./lastindexof/)(const String\&, System::StringComparison) const | Substring achterwaartse zoekopdracht. |
| [LastIndexOf](./lastindexof/)(const String\&, int, System::StringComparison) const | Substring achterwaartse zoekopdracht. |
| [LastIndexOf](./lastindexof/)(const String\&, int, int, StringComparison) const | Substring achterwaartse zoekopdracht. |
| [LastIndexOf](./lastindexof/)(char_t) const | Karakter achterwaartse zoekopdracht. |
| [LastIndexOf](./lastindexof/)(char_t, int32_t) const | Karakter achterwaartse zoekopdracht. |
| [LastIndexOf](./lastindexof/)(char_t, int32_t, int32_t) const | Karakter achterwaartse zoekopdracht. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&) const | Zoekt naar elk van de meegegeven tekens door de hele string achterwaarts. Vergelijkt het laatste teken van de string met alle tekens in anyOf, vervolgens vergelijkt het het vorige teken enzovoort. Retourneert de index van de eerste gevonden overeenkomst. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&, int32_t) const | Zoekt naar elk van de meegegeven tekens door de substring achterwaarts. Vergelijkt het laatste teken van de string met alle tekens in anyOf, vervolgens vergelijkt het het vorige teken enzovoort. Retourneert de index van de eerste gevonden overeenkomst. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const | Zoekt naar elk van de meegegeven tekens door de substring achterwaarts. Vergelijkt het laatste teken van de string met alle tekens in anyOf, vervolgens vergelijkt het het vorige teken enzovoort. Retourneert de index van de eerste gevonden overeenkomst. |
| [Normalize](./normalize/)(System::Text::NormalizationForm) const | Normaliseert unicode-string met behulp van de opgegeven normalisatievorm. |
| [operator!=](./operator!=/)(const String\&) const | Niet-gelijkheidsvergelijkingsoperator. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Controleert of de string niet null is. Past dezelfde logica toe als de aanroep van [IsNull()](./isnull/). |
| [operator+](./operator+/)(const String\&) const | [String](./) concatenatie-operator. |
| [operator+](./operator+/)(const T\&) const | [String](./) concatenatie met stringliteral of karakterreeks-pointer. |
| [operator+](./operator+/)(char_t) const | Voegt een teken toe aan het einde van de string. |
| [operator+](./operator+/)(int) const | Voegt de tekenreeksrepresentatie van een geheel getal toe aan het einde van de string. |
| [operator+](./operator+/)(uint32_t) const | Voegt de tekenreeksrepresentatie van een ongetekend geheel getal toe aan het einde van de string. |
| [operator+](./operator+/)(double) const | Voegt de tekenreeksrepresentatie van een zwevendekommagetal toe aan het einde van de string. |
| [operator+](./operator+/)(int64_t) const | Voegt de tekenreeksrepresentatie van een geheel getal toe aan het einde van de string. |
| [operator+](./operator+/)(const T\&) const | Voegt de tekenreeksrepresentatie van een referentietype-object toe aan het einde van de string. |
| [operator+](./operator+/)(const T\&) const | Voegt de tekenreeksrepresentatie van een referentietype-object toe aan het einde van de string. |
| [operator+](./operator+/)(T) const | Voegt de tekenreeksrepresentatie van een booleaanse waarde toe aan het einde van de string. |
| [operator+=](./operator+=/)(char_t) | Concatenatie-toewijzingsoperator. |
| [operator+=](./operator+=/)(const String\&) | Concatenatie-toewijzingsoperator. |
| [operator+=](./operator+=/)(double) | Concatenatie-toewijzingsoperator. |
| [operator+=](./operator+=/)(uint8_t) | Concatenatie-toewijzingsoperator. |
| [operator+=](./operator+=/)(int16_t) | Concatenatie-toewijzingsoperator. |
| [operator+=](./operator+=/)(uint16_t) | Concatenatie-toewijzingsoperator. |
| [operator+=](./operator+=/)(int32_t) | Concatenatie-toewijzingsoperator. |
| [operator+=](./operator+=/)(uint32_t) | Concatenatie-toewijzingsoperator. |
| [operator+=](./operator+=/)(int64_t) | Concatenatie-toewijzingsoperator. |
| [operator+=](./operator+=/)(uint64_t) | Concatenatie-toewijzingsoperator. |
| [operator+=](./operator+=/)(T) | Concatenatie-toewijzingsoperator. |
| [operator<](./operator_/)(const String\&) const | Vergelijkt strings op volgorde. |
| [operator=](./operator=/)(const String\&) | Toewijzingsoperator. |
| [operator=](./operator=/)(String\&&) | Verplaatsings-toewijzingsoperator. |
| [operator==](./operator==/)(const String\&) const | Gelijkheidsvergelijkingsoperator. |
| [operator==](./operator==/)(std::nullptr_t) const | Controleert of de string null is. Past dezelfde logica toe als de aanroep van [IsNull()](./isnull/). |
| [operator>](./operator_/)(const String\&) const | Vergelijkt strings op volgorde. |
| [operator[]](./operator[]/)(int) const | Haalt het teken op op de opgegeven positie. |
| [PadLeft](./padleft/)(int, char_t) const | Voegt opvulling toe aan de linkerkant van de oorspronkelijke string. |
| [PadRight](./padright/)(int, char_t) const | Voegt opvulling toe aan de rechterkant van de oorspronkelijke string. |
| [rbegin](./rbegin/)() const | Retourneert een reverse-iterator naar het laatste teken (indien aanwezig) van de werkelijke stringbuffer. |
| [Remove](./remove/)(int32_t, int32_t) const | Extraheert alles behalve de subreeks uit de huidige tekenreeks. |
| [rend](./rend/)() const | Retourneert een reverse-iterator naar vóór het eerste teken (indien aanwezig) van de daadwerkelijke tekenreeksbuffer. |
| [Replace](./replace/)(char_t, char_t) const | Vervangt alle voorkomens van het teken in de tekenreeks. |
| [Replace](./replace/)(const String\&, const String\&) const | Vervangt alle voorkomens van lookup in deze tekenreeks. |
| [reset](./reset/)() | Stelt de tekenreeks in op null. Is analoog aan 'string_variable_name = null' in C#. |
| [SetCharAt](./setcharat/)(int, char_t) | Stelt het teken in op de opgegeven positie. |
| [Split](./split/)(char_t, StringSplitOptions) const | Splitst de tekenreeks op teken. |
| [Split](./split/)(char_t, int32_t, StringSplitOptions) const | Splitst de tekenreeks op teken. |
| [Split](./split/)(char_t, char_t, StringSplitOptions) const | Splitst de tekenreeks op een van twee tekens. |
| [Split](./split/)(const ArrayPtr\<char_t\>\&, StringSplitOptions) const | Splitst de tekenreeks op een van de opgegeven tekens. |
| [Split](./split/)(const ArrayPtr\<char_t\>\&, int32_t, StringSplitOptions) const | Splitst de tekenreeks op een van de opgegeven tekens. |
| [Split](./split/)(const String\&, StringSplitOptions) const | Splitst de tekenreeks op subreeks. |
| [Split](./split/)(const String\&, int, StringSplitOptions) const | Splitst de tekenreeks op subreeks. |
| [Split](./split/)(const ArrayPtr\<String\>\&, StringSplitOptions) const | Splitst de tekenreeks op subreeks. |
| [Split](./split/)(const ArrayPtr\<String\>\&, int, StringSplitOptions) const | Splitst de tekenreeks op subreeks. Momenteel ondersteunt het alleen een scheidingstekenarray van nul of één element. |
| [StartsWith](./startswith/)(const String\&) const | Controleert of de tekenreeks begint met de opgegeven subreeks. |
| [StartsWith](./startswith/)(const String\&, System::StringComparison) const | Controleert of de tekenreeks begint met de opgegeven subreeks. |
| [StartsWith](./startswith/)(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Controleert of de tekenreeks begint met de opgegeven subreeks. |
| [String](./string/)() | Standaardconstructor. Maakt een tekenreeksobject dat als null wordt beschouwd. |
| [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, char16_t\>::value\>::type *) | Construeert een tekenreeks op basis van een tekenreeksliteral. Beschouwt de literal als een null-terminerende tekenreeks en berekent de doeltekenreekslengte op basis van de grootte van de literal. |
| [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, char16_t\>::value\>::type *) | Construeert een tekenreeks op basis van een tekenreeks-pointer. Beschouwt de aangewezen tekenreeks als null-terminerend en berekent de doeltekenreekslengte op basis van het null-teken. |
| explicit [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, char\>::value\>::type *) | Construeert een tekenreeks op basis van een tekenreeksliteral. Beschouwt de literal als een null-terminerende tekenreeks in UTF8 en berekent de doeltekenreekslengte op basis van de grootte van de literal. |
| explicit [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, char\>::value\>::type *) | Construeert een tekenreeks op basis van een tekenreeks-pointer. Beschouwt de aangewezen tekenreeks als null-terminerend in UTF8 en berekent de doeltekenreekslengte op basis van het null-teken. |
| [String](./string/)(const char16_t *, int) | Construeert een tekenreeks vanuit een tekenreeks-pointer en een expliciete lengte. |
| [String](./string/)(const char *, int) | Construeert een tekenreeks vanuit een tekenreeks-pointer en een expliciete lengte. |
| [String](./string/)(const char16_t *, int, int) | Construeert een tekenreeks vanuit een tekenreeks-pointer vanaf de startpositie met behulp van een lengte. |
| explicit [String](./string/)(const char16_t, int) | Vulconstructor. |
| [String](./string/)(const T\&, typename std::enable_if\<std::is_same\<T, std::nullptr_t\>::value\>::type *) | Nullptr-constructor. Gedefinieerd als sjabloon om prioriteiten met andere sjabloonconstructors op te lossen. |
| explicit [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, wchar_t\>::value\>::type *) | Construeert een tekenreeks op basis van een widestring-literal. Beschouwt de literal als een null-terminerende tekenreeks en berekent de doeltekenreekslengte op basis van de grootte van de literal. Conversie van wchar_t is tijdrovend op sommige platforms, dus impliciete conversies zijn niet toegestaan. |
| explicit [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, wchar_t\>::value\>::type *) | Construeert een tekenreeks op basis van een widecharacter-pointer. Beschouwt de aangewezen tekenreeks als null-terminerend en berekent de doeltekenreekslengte op basis van het null-teken. Conversie van wchar_t is tijdrovend op sommige platforms, dus impliciete conversies zijn niet toegestaan. |
| explicit [String](./string/)(const wchar_t *, int) | Construeert een tekenreeks vanuit een widecharacter-pointer en een expliciete lengte. Conversie van wchar_t is tijdrovend op sommige platforms, dus impliciete conversies zijn niet toegestaan. |
| explicit [String](./string/)(const wchar_t, int) | Vulconstructor. Conversie van wchar_t is tijdrovend op sommige platforms, dus impliciete conversies zijn niet toegestaan. |
| [String](./string/)(const String\&) | Copy-constructor. |
| [String](./string/)(String\&&) | Move-constructor. |
| [String](./string/)(const ArrayPtr\<char16_t\>\&) | Converteert een volledige tekenarray naar een string. |
| [String](./string/)(const ArrayPtr\<char16_t\>\&, int, int) | Converteert een subbereik van een tekenarray naar een string. Als parameters buiten de arraygrenzen vallen, wordt een lege string geconstrueerd. |
| explicit [String](./string/)(const codeporting_icu::UnicodeString\&) | Verpakt UnicodeString in [String](./). |
| explicit [String](./string/)(codeporting_icu::UnicodeString\&&) | Move-constructor. |
| explicit [String](./string/)(const std::wstring\&) | Maakt een [String](./) aan vanuit een wide‑string. |
| explicit [String](./string/)(const std::u16string\&) | Maakt een [String](./) aan vanuit een UTF‑16‑string. |
| explicit [String](./string/)(const std::string\&) | Maakt een [String](./) van een std::string die in UTF-8-indeling wordt gepresenteerd. |
| explicit [String](./string/)(const std::u32string\&) | Maakt een [String](./) van een std::u32string. |
| [Substring](./substring/)(int32_t) const | Extraheert een substring. |
| [Substring](./substring/)(int32_t, int32_t) const | Extraheert een substring. |
| [ToAsciiString](./toasciistring/)() const | Converteert een string naar std::string. Gebruikt ASCII-codering. |
| [ToByteArray](./tobytearray/)(int32_t, int32_t, bool) const | Converteert een string of substring naar een array van bytes. |
| [ToCharArray](./tochararray/)(int32_t, int32_t) const | Converteert een string of substring naar een array van tekens. |
| [ToLower](./tolower/)() const | Converteert alle tekens van de string naar kleine letters. |
| [ToLower](./tolower/)(const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Converteert alle tekens van de string naar kleine letters met behulp van een specifieke cultuur. |
| [ToLowerInvariant](./tolowerinvariant/)() const | Converteert alle tekens van de string naar kleine letters met behulp van een ongewijzigde cultuur. |
| [ToString](./tostring/)() const | Wrapper voor het afhandelen van de [String](./)-klasse in contexten waarin [ToString()](./tostring/) wordt aangeroepen op waarde-typen. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Wrapper voor het afhandelen van de [String](./)-klasse in contexten waarin [ToString()](./tostring/) wordt aangeroepen op waarde-typen. |
| [ToU16Str](./tou16str/)() const | Converteert een string naar std::u16string. |
| [ToU32Str](./tou32str/)() const | Converteert een string naar std::u32string. |
| [ToUpper](./toupper/)() const | Converteert alle tekens van de string naar hoofdletters. |
| [ToUpper](./toupper/)(const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Converteert alle tekens van de string naar hoofdletters met behulp van een specifieke cultuur. |
| [ToUpperInvariant](./toupperinvariant/)() const | Converteert alle tekens van de string naar hoofdletters met behulp van een ongewijzigde cultuur. |
| [ToUtf8String](./toutf8string/)() const | Converteert een string naar std::string. Gebruikt UTF-8-codering. |
| [ToWCS](./towcs/)() const | Converteert een string naar std::wstring. |
| [Trim](./trim/)() const | Verwijdert alle witruimte‑tekens zowel aan het begin als aan het einde van de string. |
| [Trim](./trim/)(char_t) const | Verwijdert alle voorkomens van het opgegeven teken zowel aan het begin als aan het einde van de string. |
| [Trim](./trim/)(const String\&) const | Verwijdert alle voorkomens van de opgegeven tekens zowel aan het begin als aan het einde van de string. |
| [Trim](./trim/)(const ArrayPtr\<char_t\>\&) const | Verwijdert alle voorkomens van de opgegeven tekens zowel aan het begin als aan het einde van de string. |
| [TrimEnd](./trimend/)() const | Verwijdert alle witruimte‑tekens aan het einde van de string. |
| [TrimEnd](./trimend/)(char_t) const | Verwijdert alle voorkomens van het opgegeven teken aan het einde van de string. |
| [TrimEnd](./trimend/)(const String\&) const | Verwijdert alle voorkomens van meegegeven tekens van het einde van de string. |
| [TrimEnd](./trimend/)(const ArrayPtr\<char_t\>\&) const | Verwijdert alle voorkomens van meegegeven tekens van het einde van de string. |
| [TrimStart](./trimstart/)() const | Verwijdert alle witruimte‑tekens van het begin van de string. |
| [TrimStart](./trimstart/)(char_t) const | Verwijdert alle voorkomens van het meegegeven teken van het begin van de string. |
| [TrimStart](./trimstart/)(const String\&) const | Verwijdert alle voorkomens van meegegeven tekens van het begin van de string. |
| [TrimStart](./trimstart/)(const ArrayPtr\<char_t\>\&) const | Verwijdert alle voorkomens van meegegeven tekens van het begin van de string. |
| [u_str](./u_str/)() const | Retourneert een ICU‑stijl null‑geterminateerde buffer. Kan de string opnieuw toewijzen. |
| [~String](./~string/)() | Destructor. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Empty](./empty/) | Lege string. |
| static [Null](./null/) | Null‑string. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [reverse_iterator](./reverse_iterator/) | Reverse-iterator type. |
## Opmerkingen



```cpp
#include "system/string.h"
#include <iostream>

int main()
{
  // Construeer een string uit de array van tekens en druk deze af.
  const auto chars = {u'h', u'e', u'l', u'l', u'o'};
  const System::String string1(chars);
  std::cout << string1 << std::endl;

  // Construeer een string uit de array van bytes en druk deze af.
  const uint8_t bytes[] = {0x77, 0x6f, 0x72, 0x6c, 0x64, 0x0};
  const auto string2 = System::String::FromUtf8(bytes);
  std::cout << string2 << std::endl;

  // Trim de onderstaande string en druk deze af.
  const System::String string3(u"   This string contains whitespaces in the beginning and at the end.   ");
  std::cout << '"' << string3.Trim() << '"' << std::endl;

  // Druk het aantal woorden af in de .
  std::cout << "Number of words: " << string3.Trim().Split(' ')->get_Length() << std::endl;

  return 0;
}
/*
This code example produces the following output:
hello
world
"This string contains whitespaces in the beginning and at the end."
Number of words: 11
*/
```

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
