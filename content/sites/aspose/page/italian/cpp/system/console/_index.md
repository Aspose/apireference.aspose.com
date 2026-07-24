---
title: "System::Console class"
linktitle: "Console"
second_title: "Aspose.Page per C++"
description: "System::Console class. Fornisce metodi per l'emissione di dati sullo stream di output standard. Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo in C++."
type: docs
weight: 1400
url: /it/cpp/system/console/
---
## Console class


Fornisce metodi per l'output dei dati sullo stream di output standard. Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo.

```cpp
class Console
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [Beep](./beep/)() | NOT IMPLEMENTED. |
| static [get_Error](./get_error/)() | Restituisce un puntatore condiviso che punta all'oggetto che rappresenta lo stream di errore standard. |
| static [get_In](./get_in/)() | Restituisce un puntatore condiviso che punta all'oggetto che rappresenta lo stream di input standard. |
| static [get_Out](./get_out/)() | Restituisce un puntatore condiviso che punta all'oggetto che rappresenta lo stream di output standard. |
| static [Mute](./mute/)(bool) | Silenzia o riattiva lo stream di output standard. |
| static [ReadKey](./readkey/)() | NOT IMPLEMENTED. |
| static [SetError](./seterror/)(const SharedPtr\<System::IO::TextWriter\>\&) | Assegna l'oggetto specificato alla proprietà Error della classe. |
| static [SetIn](./setin/)(const SharedPtr\<System::IO::TextReader\>\&) | Imposta la proprietà In sull'oggetto TextReader specificato. |
| static [SetOut](./setout/)(const SharedPtr\<System::IO::TextWriter\>\&) | Assegna l'oggetto specificato alla proprietà Out della classe. |
| static [Write](./write/)(const SharedPtr\<T\>\&) | Scrive la rappresentazione stringa dell'oggetto specificato sullo stream di output standard. |
| static [Write](./write/)(bool) | Scrive la rappresentazione stringa del valore bool sullo stream di output standard. |
| static [Write](./write/)(char_t) | Scrive il valore del carattere specificato sullo stream di output standard. |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&) | Scrive la rappresentazione stringa dell'array di caratteri specificato sullo stream di output standard. |
| static [Write](./write/)(const Decimal\&) | Scrive la rappresentazione stringa del valore [Decimal](../decimal/) sullo stream di output standard. |
| static [Write](./write/)(double) | Scrive la rappresentazione stringa del valore a virgola mobile a doppia precisione sullo stream di output standard. |
| static [Write](./write/)(float) | Scrive la rappresentazione stringa del valore a virgola mobile a precisione singola sullo stream di output standard. |
| static [Write](./write/)(int32_t) | Scrive la rappresentazione stringa del valore intero a 32 bit sullo stream di output standard. |
| static [Write](./write/)(int64_t) | Scrive la rappresentazione stringa del valore intero a 64 bit sullo stream di output standard. |
| static [Write](./write/)(const String\&) | Scrive l'oggetto stringa specificato sullo stream di output standard. |
| static [Write](./write/)(const char_t *) | Scrive la c-string specificata sullo stream di output standard. |
| static [Write](./write/)(const TypeInfo\&) | Scrive la rappresentazione stringa del valore [TypeInfo](../typeinfo/) sullo stream di output standard. |
| static [Write](./write/)(uint32_t) | Scrive la rappresentazione stringa del valore intero senza segno a 32 bit sullo stream di output standard. |
| static [Write](./write/)(uint64_t) | Scrive la rappresentazione stringa del valore intero senza segno a 64 bit sullo stream di output standard. |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | Scrive la rappresentazione stringa dell'intervallo specificato dell'array di caratteri specificato sullo stream di output standard. |
| static [Write](./write/)(const String\&, Args\&&...) | Scrive la rappresentazione stringa degli argomenti specificati formattati secondo il formato specificato sullo stream di output standard. |
| static [Write](./write/)(const char *) |  |
| static [WriteLine](./writeline/)() | Scrive il terminatore di riga corrente sullo stream di output standard. |
| static [WriteLine](./writeline/)(const SharedPtr\<T\>\&) | Scrive la rappresentazione stringa dell'oggetto specificato seguita dal terminatore di riga corrente sullo stream di output standard. |
| static [WriteLine](./writeline/)(bool) | Scrive la rappresentazione stringa del valore bool seguita dal terminatore di riga corrente sullo stream di output standard. |
| static [WriteLine](./writeline/)(char_t) | Scrive il valore del carattere specificato seguito dal terminatore di riga corrente sullo stream di output standard. |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) | Restituisce la rappresentazione stringa dell'array di caratteri specificato seguita dal terminatore di riga corrente allo stream di output standard. |
| static [WriteLine](./writeline/)(const Decimal\&) | Restituisce la rappresentazione stringa del valore [Decimal](../decimal/) seguita dal terminatore di riga corrente allo stream di output standard. |
| static [WriteLine](./writeline/)(double) | Restituisce la rappresentazione stringa del valore a virgola mobile a doppia precisione seguita dal terminatore di riga corrente allo stream di output standard. |
| static [WriteLine](./writeline/)(float) | Restituisce la rappresentazione stringa del valore a virgola mobile a precisione singola seguita dal terminatore di riga corrente allo stream di output standard. |
| static [WriteLine](./writeline/)(int32_t) | Restituisce la rappresentazione stringa del valore intero a 32 bit seguita dal terminatore di riga corrente allo stream di output standard. |
| static [WriteLine](./writeline/)(int64_t) | Restituisce la rappresentazione stringa del valore intero a 64 bit seguita dal terminatore di riga corrente allo stream di output standard. |
| static [WriteLine](./writeline/)(const String\&) | Restituisce l'oggetto stringa specificato seguito dal terminatore di riga corrente allo stream di output standard. |
| static [WriteLine](./writeline/)(const char_t *) | Restituisce la c-stringa specificata seguita dal terminatore di riga corrente allo stream di output standard. |
| static [WriteLine](./writeline/)(const TypeInfo\&) | Restituisce la rappresentazione stringa del valore [TypeInfo](../typeinfo/) seguita dal terminatore di riga corrente allo stream di output standard. |
| static [WriteLine](./writeline/)(uint32_t) | Restituisce la rappresentazione stringa del valore intero senza segno a 32 bit seguita dal terminatore di riga corrente allo stream di output standard. |
| static [WriteLine](./writeline/)(uint64_t) | Restituisce la rappresentazione stringa del valore intero senza segno a 64 bit seguita dal terminatore di riga corrente allo stream di output standard. |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int, int) | Restituisce la rappresentazione stringa dell'intervallo specificato dell'array di caratteri specificato seguita dal terminatore di riga corrente allo stream di output standard. |
| static [WriteLine](./writeline/)(const Exception\&) | Restituisce la rappresentazione stringa dell'oggetto [Exception](../exception/) specificato seguita dal terminatore di riga corrente allo stream di output standard. |
| static [WriteLine](./writeline/)(const String\&, Args\&&...) | Restituisce la rappresentazione stringa degli argomenti specificati formattati secondo il formato specificato seguita dal terminatore di riga corrente allo stream di output standard. |
| static [WriteLine](./writeline/)(const char *) |  |
## Osservazioni



```cpp
#include "system/console.h"
#include <array>

int main()
{
  using namespace System;

  // Stampa il messaggio di saluto.
  Console::WriteLine(u"Hello, world!");

  // Crea un'istanza della classe 'std::array'.
  std::array<int, 5> arr = {1, 2, 3, 4, 5};

  // Stampa gli elementi dell'array.
  for (auto el: arr)
  {
    Console::Write(u"{0} ", el);
  }
  Console::WriteLine();

  return 0;
}
/*
This code example produces the following output:
Hello, world!
1 2 3 4 5
*/
```

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
