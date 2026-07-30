---
title: "System::String classe"
linktitle: "Stringa"
second_title: "Aspose.Font per C++"
description: "System::String classe. Classe String utilizzata in tutta la libreria. È un sostituto per C# System.String durante la traduzione del codice. Per motivi di ottimizzazione, non è considerata una sottoclasse di Object. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe System::SmartPtr per gestire oggetti di questo tipo in C++."
type: docs
weight: 5800
url: /it/cpp/system/string/
---
## String class


[String](./) class used across the library. Is a substitute for C# [System.String](./) when translating code. For optimization reasons, isn't considered an [Object](../object/) subclass. This type should be allocated on stack and passed to functions by value or by reference. Never use [System::SmartPtr](../smartptr/) class to manage objects of this type.

```cpp
class String
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ASPOSECPP_VALUE_TYPE_IMPLEMENTS_INTERFACES](./asposecpp_value_type_implements_interfaces/)() | [String](./) è un tipo valore sul lato C++ che implicitamente (senza ereditarietà) implementa alcune interfacce. |
| [begin](./begin/)() const | Restituisce un puntatore all'inizio del buffer della stringa reale. Non rialloca mai nulla. Non garantisce che il buffer sia terminato con null. |
| [Clone](./clone/)() const | Crea una copia della stringa corrente. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, bool) | Less-equal-greater confronta due sottostringhe. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) | Less-equal-greater confronta due sottostringhe. |
| static [Compare](./compare/)(const String\&, const String\&, System::StringComparison) | Less-equal-greater confronta due stringhe. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, System::StringComparison) | Less-equal-greater confronta due stringhe. |
| static [Compare](./compare/)(const String\&, const String\&, bool) | Less-equal-greater confronta due stringhe. |
| static [Compare](./compare/)(const String\&, const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) | Less-equal-greater confronta due stringhe. |
| static [CompareOrdinal](./compareordinal/)(const String\&, const String\&) | Less-equal-greater confronta due stringhe usando la modalità ordinal. |
| static [CompareOrdinal](./compareordinal/)(const String\&, int, const String\&, int, int) | Less-equal-greater confronta due stringhe usando la modalità ordinal. |
| [CompareTo](./compareto/)(const String\&) const | Confronta due stringhe nello stile 'less-equals-more'. Usa la cultura corrente. |
| static [Concat](./concat/)(const ArrayPtr\<String\>\&) | Concatena stringhe. |
| static [Concat](./concat/)(const String\&, const String\&) | Concatena stringhe. |
| static [Concat](./concat/)(const String\&, const String\&, const String\&) | Concatena stringhe. |
| static [Concat](./concat/)(const String\&, const String\&, const String\&, const String\&) | Concatena stringhe. |
| [Contains](./contains/)(const String\&) const | Verifica se str è una sottostringa della stringa corrente. |
| [Contains](./contains/)(char16_t) const | Verifica se la stringa contiene il carattere fornito. |
| static [Copy](./copy/)(const String\&) | Crea una copia della stringa. |
| [CopyTo](./copyto/)(int, const ArrayPtr\<char_t\>\&, int, int) const | Copia i caratteri della stringa negli elementi esistenti dell'array. Non viene ridimensionato. |
| [end](./end/)() const | Restituisce un puntatore alla fine del buffer della stringa reale. Non riassegna mai nulla. Non garantisce che il buffer sia terminato con null. |
| [EndsWith](./endswith/)(const String\&) const | Verifica se la stringa termina con la sottostringa specificata. |
| [EndsWith](./endswith/)(const String\&, System::StringComparison) const | Verifica se la stringa termina con la sottostringa specificata. |
| [EndsWith](./endswith/)(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Verifica se la stringa termina con la sottostringa specificata. |
| [Equals](./equals/)(const String\&, System::StringComparison) const | [String](./) confronto di uguaglianza. Sono supportate diverse modalità fornite dall'enumerazione [StringComparison](../stringcomparison/). |
| [Equals](./equals/)(const String\&) const | [String](./) confronto di uguaglianza. Usa la modalità di confronto [System::StringComparison::Ordinal](../stringcomparison/). |
| static [Equals](./equals/)(const String\&, const String\&) | Equal confronta due stringhe usando la modalità di confronto Ordial. |
| static [Equals](./equals/)(const String\&, const String\&, System::StringComparison) | Equal confronta due stringhe. |
| [FastToAscii](./fasttoascii/)(char, int) const | Prova a convertire una [String](./) in una stringa ASCII. |
| static [Format](./format/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const Args\&...) | Formatta la stringa in stile C#. |
| static [Format](./format/)(std::nullptr_t, const String\&, const Args\&...) | Formatta la stringa in stile C#. |
| static [Format](./format/)(std::nullptr_t, const char16_t(&), const Args\&...) | Formatta la stringa in stile C#. |
| static [Format](./format/)(const String\&, const Args\&...) | Formatta la stringa in stile C#. |
| static [Format](./format/)(const String\&, const System::ArrayPtr\<T\>\&) | Formatta la stringa in stile C#. |
| static [FromAscii](./fromascii/)(const char *) | Crea una [String](./) da una stringa ASCII. |
| static [FromAscii](./fromascii/)(const char *, int) | Crea una [String](./) da una stringa ASCII. |
| static [FromAscii](./fromascii/)(const std::string\&) | Crea una [String](./) da una stringa ASCII. |
| static [FromUtf16](./fromutf16/)(const std::u16string\&) | Crea una [String](./) da una stringa utf16. |
| static [FromUtf32](./fromutf32/)(const uint32_t *, int32_t) | Crea una [String](./) da una stringa utf32. |
| static [FromUtf8](./fromutf8/)(const char *) | Crea una [String](./) da una stringa utf8. |
| static [FromUtf8](./fromutf8/)(const char *, int) | Crea una [String](./) da una stringa utf8. |
| static [FromUtf8](./fromutf8/)(const uint8_t *) | Crea una [String](./) da una stringa utf8. |
| static [FromUtf8](./fromutf8/)(const std::string\&) | Crea una [String](./) da una stringa utf8. |
| static [FromWCS](./fromwcs/)(const std::wstring\&) | Crea una [String](./) da una widestring. |
| [get_Length](./get_length/)() const | Ottiene la lunghezza della stringa. |
| [GetHashCode](./gethashcode/)() const | Calcola l'hash della stringa contenuta. Implementato in ICU, non corrisponde agli hash in C#. |
| [IndexOf](./indexof/)(const String\&, System::StringComparison) const | Ricerca in avanti di sottostringa. |
| [IndexOf](./indexof/)(char_t, int) const | Ricerca in avanti del carattere. |
| [IndexOf](./indexof/)(char_t, int, int) const | Ricerca in avanti del carattere nella sottostringa. |
| [IndexOf](./indexof/)(const String\&, int) const | Ricerca in avanti di sottostringa. |
| [IndexOf](./indexof/)(const String\&, int, System::StringComparison) const | Ricerca in avanti di sottostringa. |
| [IndexOf](./indexof/)(const String\&, int, int, System::StringComparison) const | Ricerca in avanti di sottostringa. |
| [IndexOf](./indexof/)(const String\&, int, int) const | Ricerca in avanti di sottostringa. |
| [IndexOfAny](./indexofany/)(char_t, int) const | Ricerca in avanti del carattere. |
| [IndexOfAny](./indexofany/)(const String\&, int) const | Di conseguenza cerca tutti i caratteri di str in questo. Se il primo carattere è trovato, viene restituita la sua posizione, altrimenti cerca il secondo e così via. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&) const | Cerca uno qualsiasi dei caratteri passati nell'intera stringa. Confronta il primo carattere della stringa con tutti i caratteri in anyOf, poi confronta il secondo e così via. Restituisce l'indice del primo che corrisponde a uno dei caratteri target. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&, int32_t) const | Cerca uno qualsiasi dei caratteri passati nella sottostringa. Confronta il primo carattere della stringa con tutti i caratteri in anyOf, poi confronta il secondo e così via. Restituisce l'indice del primo che corrisponde a uno dei caratteri target. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const | Cerca uno qualsiasi dei caratteri passati nella sottostringa. Confronta il primo carattere della stringa con tutti i caratteri in anyOf, poi confronta il secondo e così via. Restituisce l'indice del primo che corrisponde a uno dei caratteri target. |
| [Insert](./insert/)(int, const String\&) const | Inserisce la sottostringa nella posizione specificata. |
| [Is](./is/)(const System::TypeInfo\&) const | Verifica se l'oggetto stringa è del tipo specificato da [TypeInfo](../typeinfo/) passato. |
| [IsAsciiString](./isasciistring/)() const | Indica se un [String](./) contiene solo simboli ASCII. |
| [IsEmpty](./isempty/)() const | Verifica se la stringa è sia non nulla che vuota. |
| [IsNormalized](./isnormalized/)(System::Text::NormalizationForm) const | Verifica se la stringa Unicode è normalizzata usando la forma di normalizzazione specificata. |
| [IsNull](./isnull/)() const | Verifica se la stringa è considerata nulla. [String](./) è nulla solo se è costruita tramite il costruttore [String()](./string/), spostata, copiata o assegnata da una stringa nulla o è stato chiamato il metodo [reset()](./reset/). |
| [IsNullOrEmpty](./isnullorempty/)() const | Verifica se la stringa è vuota o è considerata nulla. |
| static [IsNullOrEmpty](./isnullorempty/)(const String\&) | Verifica se la stringa passata è nulla o vuota. |
| static [IsNullOrWhiteSpace](./isnullorwhitespace/)(const String\&) | Indica se una stringa specificata è nulla, vuota o è composta solo da caratteri di spazio bianco. |
| static [Join](./join/)(const String\&, const ArrayPtr\<String\>\&, int, int) | Unisce l'array usando la stringa come separatore. |
| static [Join](./join/)(const String\&, const System::Details::ArrayView\<String\>\&, int, int) | Unisce l'array usando la stringa come separatore. |
| static [Join](./join/)(const String\&, const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\&) | Unisce l'array usando la stringa come separatore. |
| static [Join](./join/)(const String\&, const ArrayPtr\<SharedPtr\<Object\>\>\&) | Unisce l'array usando la stringa come separatore. |
| [LastIndexOf](./lastindexof/)(const String\&, int) const | Ricerca all'indietro della sottostringa. |
| [LastIndexOf](./lastindexof/)(const String\&, System::StringComparison) const | Ricerca all'indietro della sottostringa. |
| [LastIndexOf](./lastindexof/)(const String\&, int, System::StringComparison) const | Ricerca all'indietro della sottostringa. |
| [LastIndexOf](./lastindexof/)(const String\&, int, int, StringComparison) const | Ricerca all'indietro della sottostringa. |
| [LastIndexOf](./lastindexof/)(char_t) const | Ricerca all'indietro del carattere. |
| [LastIndexOf](./lastindexof/)(char_t, int32_t) const | Ricerca all'indietro del carattere. |
| [LastIndexOf](./lastindexof/)(char_t, int32_t, int32_t) const | Ricerca all'indietro del carattere. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&) const | Cerca uno qualsiasi dei caratteri passati nell'intera stringa all'indietro. Confronta l'ultimo carattere della stringa con tutti i caratteri in anyOf, poi confronta il precedente e così via. Restituisce l'indice della prima corrispondenza trovata. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&, int32_t) const | Cerca uno qualsiasi dei caratteri passati nella sottostringa all'indietro. Confronta l'ultimo carattere della stringa con tutti i caratteri in anyOf, poi confronta il precedente e così via. Restituisce l'indice della prima corrispondenza trovata. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const | Cerca uno qualsiasi dei caratteri passati nella sottostringa all'indietro. Confronta l'ultimo carattere della stringa con tutti i caratteri in anyOf, poi confronta il precedente e così via. Restituisce l'indice della prima corrispondenza trovata. |
| [Normalize](./normalize/)(System::Text::NormalizationForm) const | Normalizza la stringa Unicode usando la forma di normalizzazione specificata. |
| [operator!=](./operator!=/)(const String\&) const | Operatore di confronto di non uguaglianza. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Verifica se la stringa non è nulla. Applica la stessa logica della chiamata [IsNull()](./isnull/). |
| [operator+](./operator+/)(const String\&) const | Operatore di concatenazione di [String](./). |
| [operator+](./operator+/)(const T\&) const | Concatenazione di [String](./) con letterale stringa o puntatore a stringa di caratteri. |
| [operator+](./operator+/)(char_t) const | Aggiunge un carattere alla fine della stringa. |
| [operator+](./operator+/)(int) const | Aggiunge la rappresentazione stringa del valore intero alla fine della stringa. |
| [operator+](./operator+/)(uint32_t) const | Aggiunge la rappresentazione stringa del valore intero senza segno alla fine della stringa. |
| [operator+](./operator+/)(double) const | Aggiunge la rappresentazione stringa del valore a virgola mobile alla fine della stringa. |
| [operator+](./operator+/)(int64_t) const | Aggiunge la rappresentazione stringa del valore intero alla fine della stringa. |
| [operator+](./operator+/)(const T\&) const | Aggiunge la rappresentazione stringa dell'oggetto di tipo riferimento alla fine della stringa. |
| [operator+](./operator+/)(const T\&) const | Aggiunge la rappresentazione stringa dell'oggetto di tipo riferimento alla fine della stringa. |
| [operator+](./operator+/)(T) const | Aggiunge la rappresentazione stringa del valore booleano alla fine della stringa. |
| [operator+=](./operator+=/)(char_t) | Operatore di assegnazione di concatenazione. |
| [operator+=](./operator+=/)(const String\&) | Operatore di assegnazione di concatenazione. |
| [operator+=](./operator+=/)(double) | Operatore di assegnazione di concatenazione. |
| [operator+=](./operator+=/)(uint8_t) | Operatore di assegnazione di concatenazione. |
| [operator+=](./operator+=/)(int16_t) | Operatore di assegnazione di concatenazione. |
| [operator+=](./operator+=/)(uint16_t) | Operatore di assegnazione di concatenazione. |
| [operator+=](./operator+=/)(int32_t) | Operatore di assegnazione di concatenazione. |
| [operator+=](./operator+=/)(uint32_t) | Operatore di assegnazione di concatenazione. |
| [operator+=](./operator+=/)(int64_t) | Operatore di assegnazione di concatenazione. |
| [operator+=](./operator+=/)(uint64_t) | Operatore di assegnazione di concatenazione. |
| [operator+=](./operator+=/)(T) | Operatore di assegnazione di concatenazione. |
| [operator<](./operator_/)(const String\&) const | Confronta le stringhe in ordine. |
| [operator=](./operator=/)(const String\&) | Operatore di assegnazione. |
| [operator=](./operator=/)(String\&&) | Operatore di assegnazione di spostamento. |
| [operator==](./operator==/)(const String\&) const | Operatore di confronto di uguaglianza. |
| [operator==](./operator==/)(std::nullptr_t) const | Verifica se la stringa è nulla. Applica la stessa logica della chiamata [IsNull()](./isnull/). |
| [operator>](./operator_/)(const String\&) const | Confronta le stringhe in ordine. |
| [operator[]](./operator[]/)(int) const | Ottiene il carattere nella posizione specificata. |
| [PadLeft](./padleft/)(int, char_t) const | Aggiunge riempimento a sinistra della stringa originale. |
| [PadRight](./padright/)(int, char_t) const | Aggiunge riempimento a destra della stringa originale. |
| [rbegin](./rbegin/)() const | Restituisce l'iteratore inverso all'ultimo carattere (se presente) del buffer della stringa attuale. |
| [Remove](./remove/)(int32_t, int32_t) const | Estrae tutto tranne la sottostringa dalla stringa corrente. |
| [rend](./rend/)() const | Restituisce l'iteratore inverso al carattere precedente al primo (se presente) del buffer della stringa attuale. |
| [Replace](./replace/)(char_t, char_t) const | Sostituisce tutte le occorrenze del carattere nella stringa. |
| [Replace](./replace/)(const String\&, const String\&) const | Sostituisce tutte le occorrenze della ricerca in questa stringa. |
| [reset](./reset/)() | Imposta la stringa a null. È analogo a 'string_variable_name = null' in C#. |
| [SetCharAt](./setcharat/)(int, char_t) | Imposta il carattere nella posizione specificata. |
| [Split](./split/)(char_t, StringSplitOptions) const | Dividi la stringa per carattere. |
| [Split](./split/)(char_t, int32_t, StringSplitOptions) const | Dividi la stringa per carattere. |
| [Split](./split/)(char_t, char_t, StringSplitOptions) const | Dividi la stringa per uno dei due caratteri. |
| [Split](./split/)(const ArrayPtr\<char_t\>\&, StringSplitOptions) const | Dividi la stringa per uno dei caratteri specificati. |
| [Split](./split/)(const ArrayPtr\<char_t\>\&, int32_t, StringSplitOptions) const | Dividi la stringa per uno dei caratteri specificati. |
| [Split](./split/)(const String\&, StringSplitOptions) const | Dividi la stringa per sottostringa. |
| [Split](./split/)(const String\&, int, StringSplitOptions) const | Dividi la stringa per sottostringa. |
| [Split](./split/)(const ArrayPtr\<String\>\&, StringSplitOptions) const | Dividi la stringa per sottostringa. |
| [Split](./split/)(const ArrayPtr\<String\>\&, int, StringSplitOptions) const | Divide la stringa per sottostringa. Attualmente supporta solo un array di separatori con zero o un elemento. |
| [StartsWith](./startswith/)(const String\&) const | Verifica se la stringa inizia con la sottostringa specificata. |
| [StartsWith](./startswith/)(const String\&, System::StringComparison) const | Verifica se la stringa inizia con la sottostringa specificata. |
| [StartsWith](./startswith/)(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Verifica se la stringa inizia con la sottostringa specificata. |
| [String](./string/)() | Costruttore predefinito. Crea un oggetto stringa considerato nullo. |
| [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, char16_t\>::value\>::type *) | Costruisce una stringa basata su un letterale di stringa. Considera il letterale una stringa terminata da null, calcola la lunghezza della stringa di destinazione in base alla dimensione del letterale. |
| [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, char16_t\>::value\>::type *) | Costruisce una stringa basata su un puntatore a stringa di caratteri. Tratta la stringa puntata come terminata da null, calcola la lunghezza della stringa di destinazione in base al carattere null. |
| explicit [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, char\>::value\>::type *) | Costruisce una stringa basata su un letterale di stringa. Considera il letterale una stringa terminata da null in UTF‑8, calcola la lunghezza della stringa di destinazione in base alla dimensione del letterale. |
| explicit [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, char\>::value\>::type *) | Costruisce una stringa basata su un puntatore a stringa di caratteri. Tratta la stringa puntata come terminata da null in UTF‑8, calcola la lunghezza della stringa di destinazione in base al carattere null. |
| [String](./string/)(const char16_t *, int) | Costruisce una stringa da un puntatore a stringa di caratteri e una lunghezza esplicita. |
| [String](./string/)(const char *, int) | Costruisce una stringa da un puntatore a stringa di caratteri e una lunghezza esplicita. |
| [String](./string/)(const char16_t *, int, int) | Costruisce una stringa da un puntatore a stringa di caratteri a partire da una posizione iniziale usando la lunghezza. |
| explicit [String](./string/)(const char16_t, int) | Costruttore di riempimento. |
| [String](./string/)(const T\&, typename std::enable_if\<std::is_same\<T, std::nullptr_t\>::value\>::type *) | Costruttore nullptr. Dichiarato come modello per risolvere le priorità con altri costruttori modello. |
| explicit [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, wchar_t\>::value\>::type *) | Costruisce una stringa basata su un letterale widestring. Considera il letterale una stringa terminata da null, calcola la lunghezza della stringa di destinazione in base alla dimensione del letterale. La conversione da wchar_t richiede molto tempo su alcune piattaforme, quindi non sono consentite conversioni implicite. |
| explicit [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, wchar_t\>::value\>::type *) | Costruisce una stringa basata su un puntatore a stringa widecharacter. Tratta la stringa puntata come terminata da null, calcola la lunghezza della stringa di destinazione in base al carattere null. La conversione da wchar_t richiede molto tempo su alcune piattaforme, quindi non sono consentite conversioni implicite. |
| explicit [String](./string/)(const wchar_t *, int) | Costruisce una stringa da un puntatore a stringa widecharacter e una lunghezza esplicita. La conversione da wchar_t richiede molto tempo su alcune piattaforme, quindi non sono consentite conversioni implicite. |
| explicit [String](./string/)(const wchar_t, int) | Costruttore di riempimento. La conversione da wchar_t richiede molto tempo su alcune piattaforme, quindi non sono consentite conversioni implicite. |
| [String](./string/)(const String\&) | Costruttore di copia. |
| [String](./string/)(String\&&) | Costruttore di spostamento. |
| [String](./string/)(const ArrayPtr\<char16_t\>\&) | Converte l'intero array di caratteri in una stringa. |
| [String](./string/)(const ArrayPtr\<char16_t\>\&, int, int) | Converte un sottointervallo di un array di caratteri in una stringa. Se i parametri sono fuori dai limiti dell'array, viene costruita una stringa vuota. |
| explicit [String](./string/)(const codeporting_icu::UnicodeString\&) | Avvolge UnicodeString in [String](./). |
| explicit [String](./string/)(codeporting_icu::UnicodeString\&&) | Costruttore di spostamento. |
| explicit [String](./string/)(const std::wstring\&) | Crea una [String](./) da una widestring. |
| explicit [String](./string/)(const std::u16string\&) | Crea una [String](./) da una stringa utf16. |
| explicit [String](./string/)(const std::string\&) | Crea [String](./) da una stringa std::string presentata nel formato UTF‑8. |
| explicit [String](./string/)(const std::u32string\&) | Crea [String](./) da una stringa std::u32string. |
| [Substring](./substring/)(int32_t) const | Estrae una sottostringa. |
| [Substring](./substring/)(int32_t, int32_t) const | Estrae una sottostringa. |
| [ToAsciiString](./toasciistring/)() const | Converte la stringa in std::string. Usa la codifica ASCII. |
| [ToByteArray](./tobytearray/)(int32_t, int32_t, bool) const | Converte la stringa o la sottostringa in un array di byte. |
| [ToCharArray](./tochararray/)(int32_t, int32_t) const | Converte la stringa o la sottostringa in un array di caratteri. |
| [ToLower](./tolower/)() const | Converte tutti i caratteri della stringa in minuscolo. |
| [ToLower](./tolower/)(const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Converte tutti i caratteri della stringa in minuscolo usando una cultura specifica. |
| [ToLowerInvariant](./tolowerinvariant/)() const | Converte tutti i caratteri della stringa in minuscolo usando la cultura invariata. |
| [ToString](./tostring/)() const | Wrapper per gestire la classe [String](./) in contesti in cui [ToString()](./tostring/) viene chiamato su oggetti di tipo valore. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Wrapper per gestire la classe [String](./) in contesti in cui [ToString()](./tostring/) viene chiamato su oggetti di tipo valore. |
| [ToU16Str](./tou16str/)() const | Converte la stringa in std::u16string. |
| [ToU32Str](./tou32str/)() const | Converte la stringa in std::u32string. |
| [ToUpper](./toupper/)() const | Converte tutti i caratteri della stringa in maiuscolo. |
| [ToUpper](./toupper/)(const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Converte tutti i caratteri della stringa in maiuscolo usando una cultura specifica. |
| [ToUpperInvariant](./toupperinvariant/)() const | Converte tutti i caratteri della stringa in maiuscolo usando la cultura invariata. |
| [ToUtf8String](./toutf8string/)() const | Converte la stringa in std::string. Usa la codifica UTF-8. |
| [ToWCS](./towcs/)() const | Converte la stringa in std::wstring. |
| [Trim](./trim/)() const | Rimuove tutti i caratteri di spaziatura sia dall'inizio che dalla fine della stringa. |
| [Trim](./trim/)(char_t) const | Rimuove tutte le occorrenze del carattere passato sia dall'inizio che dalla fine della stringa. |
| [Trim](./trim/)(const String\&) const | Rimuove tutte le occorrenze dei caratteri passati sia dall'inizio che dalla fine della stringa. |
| [Trim](./trim/)(const ArrayPtr\<char_t\>\&) const | Rimuove tutte le occorrenze dei caratteri passati sia dall'inizio che dalla fine della stringa. |
| [TrimEnd](./trimend/)() const | Rimuove tutti i caratteri di spaziatura dalla fine della stringa. |
| [TrimEnd](./trimend/)(char_t) const | Rimuove tutte le occorrenze del carattere passato dalla fine della stringa. |
| [TrimEnd](./trimend/)(const String\&) const | Rimuove tutte le occorrenze dei caratteri passati dalla fine della stringa. |
| [TrimEnd](./trimend/)(const ArrayPtr\<char_t\>\&) const | Rimuove tutte le occorrenze dei caratteri passati dalla fine della stringa. |
| [TrimStart](./trimstart/)() const | Rimuove tutti i caratteri di spaziatura dall'inizio della stringa. |
| [TrimStart](./trimstart/)(char_t) const | Rimuove tutte le occorrenze del carattere passato dall'inizio della stringa. |
| [TrimStart](./trimstart/)(const String\&) const | Rimuove tutte le occorrenze dei caratteri passati dall'inizio della stringa. |
| [TrimStart](./trimstart/)(const ArrayPtr\<char_t\>\&) const | Rimuove tutte le occorrenze dei caratteri passati dall'inizio della stringa. |
| [u_str](./u_str/)() const | Restituisce un buffer terminato da null in stile ICU. Può riallocare la stringa. |
| [~String](./~string/)() | Distruttore. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Empty](./empty/) | Stringa vuota. |
| static [Null](./null/) | Stringa nulla. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [reverse_iterator](./reverse_iterator/) | Tipo di iteratore inverso. |
## Osservazioni



```cpp
#include "system/string.h"
#include <iostream>

int main()
{
  // Costruisci una stringa dall'array di caratteri e stampala.
  const auto chars = {u'h', u'e', u'l', u'l', u'o'};
  const System::String string1(chars);
  std::cout << string1 << std::endl;

  // Costruisci una stringa dall'array di byte e stampala.
  const uint8_t bytes[] = {0x77, 0x6f, 0x72, 0x6c, 0x64, 0x0};
  const auto string2 = System::String::FromUtf8(bytes);
  std::cout << string2 << std::endl;

  // Rimuovi gli spazi dalla stringa sotto e stampala.
  const System::String string3(u"   This string contains whitespaces in the beginning and at the end.   ");
  std::cout << '"' << string3.Trim() << '"' << std::endl;

  // Stampa il numero di parole in .
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

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
