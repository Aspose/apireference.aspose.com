---
title: "Classe System::Char"
linktitle: "Char"
second_title: "Aspose.Font per C++"
description: "Classe System::Char. Fornisce metodi per la manipolazione di caratteri rappresentati come unità di codice UTF-16. Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo in C++."
type: docs
weight: 1200
url: /it/cpp/system/char/
---
## Char class


Fornisce metodi per la manipolazione di caratteri rappresentati come unità di codice UTF-16. Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo.

```cpp
class Char
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [ConvertFromUtf32](./convertfromutf32/)(uint32_t) | Converte un'unità di codice UTF-32 in un'istanza della classe [System::String](../string/). |
| static [ConvertToUtf32](./converttoutf32/)(char_t, char_t) | Converte la coppia surrogata UTF-16 specificata in un'unità di codice UTF-32. |
| static [ConvertToUtf32](./converttoutf32/)(const String\&, int) | Converte il valore di un carattere codificato UTF-16 o di una coppia surrogata in una posizione specificata di una stringa in un'unità di codice UTF-32. |
| static [GetNumericValue](./getnumericvalue/)(char_t) | Converte il carattere UTF-16 specificato in un valore numerico a virgola mobile a doppia precisione. |
| static [GetUnicodeCategory](./getunicodecategory/)(char_t) | Restituisce un valore che rappresenta la categoria Unicode del carattere specificato. |
| static [IsAsciiWhiteSpace](./isasciiwhitespace/)(char_t) | Determina se il carattere specificato è classificato come carattere di spazio bianco ASCII. |
| static [IsControl](./iscontrol/)(const char_t *, int) | Determina se il carattere all'indice specificato nel buffer di caratteri specificato è classificato come carattere di controllo Unicode. |
| static [IsControl](./iscontrol/)(char_t) | Determina se il carattere specificato è classificato come carattere di controllo Unicode. |
| static [IsDigit](./isdigit/)(const char_t *, int) | Determina se il carattere all'indice specificato nel buffer di caratteri specificato è classificato come cifra decimale. |
| static [IsDigit](./isdigit/)(const String\&, const int32_t) | Determina se il carattere all'indice specificato nella stringa specificata è classificato come cifra decimale. |
| static [IsDigit](./isdigit/)(char_t) | Determina se il carattere specificato è classificato come cifra decimale. |
| static [IsHighSurrogate](./ishighsurrogate/)(const String\&, int) | Determina se il carattere all'indice specificato nella stringa specificata è una unità di codice surrogate alto UTF-16. |
| static [IsHighSurrogate](./ishighsurrogate/)(const char_t *, int) | Determina se il carattere all'indice specificato nel buffer di caratteri specificato è un high surrogate. |
| static [IsHighSurrogate](./ishighsurrogate/)(char_t) | Determina se il carattere specificato è un high surrogate. |
| static [IsLetter](./isletter/)(const char_t *, int) | Determina se il carattere all'indice specificato nel buffer di caratteri specificato è classificato come lettera Unicode. |
| static [IsLetter](./isletter/)(char_t) | Determina se il carattere specificato è classificato come lettera Unicode. |
| static [IsLetterOrDigit](./isletterordigit/)(const char_t *, int) | Determina se il carattere all'indice specificato nel buffer di caratteri specificato è classificato come lettera Unicode o cifra decimale. |
| static [IsLetterOrDigit](./isletterordigit/)(char_t) | Determina se il carattere specificato è classificato come lettera Unicode o cifra decimale. |
| static [IsLower](./islower/)(const char_t *, int) | Determina se il carattere all'indice specificato nel buffer di caratteri specificato è classificato come lettera minuscola. |
| static [IsLower](./islower/)(char_t) | Determina se il carattere specificato è classificato come lettera minuscola. |
| static [IsLower](./islower/)(const String\&, int) | Determina se il carattere all'indice specificato nella stringa specificata è classificato come lettera minuscola. |
| static [IsLowSurrogate](./islowsurrogate/)(const char_t *, int) | Determina se il carattere all'indice specificato nel buffer di caratteri specificato è un low surrogate. |
| static [IsLowSurrogate](./islowsurrogate/)(char_t) | Determina se il carattere specificato è un low surrogate. |
| static [IsNumber](./isnumber/)(const char_t *, int) | Determina se il carattere all'indice specificato nel buffer di caratteri specificato è classificato come numero. |
| static [IsNumber](./isnumber/)(char_t) | Determina se il carattere specificato è classificato come numero. |
| static [IsPunctuation](./ispunctuation/)(const char_t *, int) | Determina se il carattere all'indice specificato nel buffer di caratteri specificato è classificato come carattere di punteggiatura. |
| static [IsPunctuation](./ispunctuation/)(char_t) | Determina se il carattere specificato è classificato come carattere di punteggiatura. |
| static [IsSeparator](./isseparator/)(const char_t *, int) | Determina se il carattere all'indice specificato nel buffer di caratteri specificato è classificato come carattere separatore. |
| static [IsSeparator](./isseparator/)(char_t) | Determina se il carattere specificato è classificato come carattere separatore. |
| static [IsSurrogate](./issurrogate/)(char_t) | Determina se il carattere specificato è un'unità di codice surrogate UTF-16. |
| static [IsSurrogate](./issurrogate/)(const String\&, int) | Determina se il carattere all'indice specificato nella stringa specificata è un'unità di codice surrogate UTF-16. |
| static [IsSurrogatePair](./issurrogatepair/)(char_t, char_t) | Determina se i due caratteri specificati per una coppia surrogate UTF-16. |
| static [IsSurrogatePair](./issurrogatepair/)(const String\&, int) | Determina se due caratteri consecutivi nel buffer di caratteri specificato formano una coppia surrogate. |
| static [IsSymbol](./issymbol/)(const char_t *, int) | Determina se il carattere all'indice specificato nel buffer di caratteri specificato è classificato come carattere simbolo. |
| static [IsSymbol](./issymbol/)(char_t) | Determina se il carattere specificato è classificato come carattere simbolo. |
| static [IsUpper](./isupper/)(const String\&, int) | Determina se il carattere all'indice specificato nella stringa specificata è classificato come lettera maiuscola. |
| static [IsUpper](./isupper/)(const char_t *, int) | Determina se il carattere all'indice specificato nel buffer di caratteri specificato è classificato come lettera maiuscola. |
| static [IsUpper](./isupper/)(char_t) | Determina se il carattere specificato è classificato come lettera maiuscola. |
| static [IsWhiteSpace](./iswhitespace/)(const char_t *, int) | Determina se il carattere all'indice specificato nel buffer di caratteri specificato è classificato come carattere di spazio bianco. |
| static [IsWhiteSpace](./iswhitespace/)(char_t) | Determina se il carattere specificato è classificato come carattere di spazio bianco. |
| static [IsWhiteSpace](./iswhitespace/)(const String\&, int) | Determina se il carattere all'indice specificato nella stringa specificata è classificato come carattere di spazio bianco. |
| static [Parse](./parse/)(const String\&) | Converte il primo e unico carattere della stringa specificata in un valore char_t. |
| static [ToLower](./tolower/)(char_t) | Converte il carattere specificato in minuscolo. |
| static [ToLower](./tolower/)(char_t, const SharedPtr\<Globalization::CultureInfo\>\&) | Converte il carattere specificato in minuscolo. |
| static [ToLowerInvariant](./tolowerinvariant/)(char_t) | Converte il carattere specificato in minuscolo. |
| static [ToUpper](./toupper/)(char_t) | Converte il carattere specificato in maiuscolo. |
| static [ToUpper](./toupper/)(char_t, const SharedPtr\<Globalization::CultureInfo\>\&) | Converte il carattere specificato in maiuscolo. |
| static [ToUpperInvariant](./toupperinvariant/)(char_t) | Converte il carattere specificato in maiuscolo. |
| static [TryParse](./tryparse/)(const System::String\&, char_t\&) | Tenta di convertire una stringa composta da un singolo carattere in un carattere UTF-16. La funzione riesce solo quando la stringa di input non è nulla e ha una lunghezza di esattamente un carattere. |
## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
