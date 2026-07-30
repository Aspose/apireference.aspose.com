---
title: "System::Decimal classe"
linktitle: "Decimal"
second_title: "Aspose.Font per C++"
description: "System::Decimal classe. Rappresenta un numero decimale. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe System::SmartPtr per gestire oggetti di questo tipo in C++."
type: docs
weight: 1900
url: /it/cpp/system/decimal/
---
## Decimal class


Rappresenta un numero decimale. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe [System::SmartPtr](../smartptr/) per gestire oggetti di questo tipo.

```cpp
class Decimal
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [Add](./add/)(const Decimal\&, const Decimal\&) | Aggiunge due valori [Decimal](./) specificati. |
| static [Ceiling](./ceiling/)(const Decimal\&) | Restituisce il più piccolo valore intero maggiore o uguale al valore specificato. |
| static [Compare](./compare/)(const Decimal\&, const Decimal\&) | Determina se il valore rappresentato dal primo oggetto [Decimal](./) è minore, uguale o maggiore del valore rappresentato dal secondo oggetto [Decimal](./). |
| [CompareTo](./compareto/)(const Decimal\&) const | Determina se il valore rappresentato dall'oggetto corrente è minore, uguale o maggiore del valore rappresentato dall'oggetto specificato. |
| [Decimal](./decimal/)() | Costruisce un'istanza che rappresenta 0. |
| [Decimal](./decimal/)(std::int8_t) | Costruisce un'istanza che rappresenta il valore specificato. |
| [Decimal](./decimal/)(std::int16_t) | Costruisce un'istanza che rappresenta il valore specificato. |
| [Decimal](./decimal/)(std::int32_t) | Costruisce un'istanza che rappresenta il valore specificato. |
| [Decimal](./decimal/)(std::int64_t) | Costruisce un'istanza che rappresenta il valore specificato. |
| [Decimal](./decimal/)(std::uint8_t) | Costruisce un'istanza che rappresenta il valore specificato. |
| [Decimal](./decimal/)(std::uint16_t) | Costruisce un'istanza che rappresenta il valore specificato. |
| [Decimal](./decimal/)(std::uint32_t) | Costruisce un'istanza che rappresenta il valore specificato. |
| [Decimal](./decimal/)(std::uint64_t) | Costruisce un'istanza che rappresenta il valore specificato. |
| [Decimal](./decimal/)(float) | Costruisce un'istanza che rappresenta il valore specificato. |
| [Decimal](./decimal/)(double) | Costruisce un'istanza che rappresenta il valore specificato. |
| explicit [Decimal](./decimal/)(const std::string\&) | Costruisce un'istanza che rappresenta un valore la cui rappresentazione stringa è specificata come un'istanza della classe std::string. |
| [Decimal](./decimal/)(int32_t, int32_t, int32_t, bool, uint8_t) | Costruisce un oggetto [Decimal](./) dai componenti specificati. |
| [Decimal](./decimal/)(const Decimal\&) | Costruisce un'istanza della classe [Decimal](./) che rappresenta lo stesso numero dell'oggetto [Decimal](./) specificato. |
| [Decimal](./decimal/)(const ArrayPtr\<int32_t\>\&) | Costruisce un'istanza della classe [Decimal](./) da un array di interi contenente una rappresentazione binaria. |
| [Decimal](./decimal/)(std::nullptr_t) | Lancia sempre ArgumentNullException. |
| [Decimal](./decimal/)(const number_type\&) | Costruisce un'istanza della classe [Decimal](./) che rappresenta il valore specificato. |
| static [Divide](./divide/)(const Decimal\&, const Decimal\&) | Divide due valori [Decimal](./) specificati. |
| [Equals](./equals/)(const Decimal\&) const | Determina se i valori rappresentati dall'oggetto corrente e dall'oggetto specificato sono uguali. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | Determina se i valori rappresentati dall'oggetto corrente e dall'oggetto specificato sono uguali. |
| static [Equals](./equals/)(const Decimal\&, const Decimal\&) | Determina se i valori rappresentati dagli oggetti specificati sono uguali. |
| static [Floor](./floor/)(const Decimal\&) | Restituisce il più grande valore intero minore o uguale al valore specificato. |
| static [FromOACurrency](./fromoacurrency/)(int64_t) | [Convert](../convert/) il valore di valuta OLE specificato nel valore [Decimal](./) equivalente. NOT IMPLEMENTED. |
| static [GetBits](./getbits/)(const Decimal\&) | Converte l'oggetto [Decimal](./) specificato nella rappresentazione binaria del valore che rappresenta. |
| static [GetBytes](./getbytes/)(const Decimal\&, const System::ArrayPtr\<uint8_t\>\&) | [Convert](../convert/) il valore [Decimal](./) specificato in un array di byte. |
| [GetHashCode](./gethashcode/)() const | Restituisce un codice hash per l'oggetto corrente. |
| [GetTypeCode](./gettypecode/)() const | Ottiene il codice del tipo di oggetto. |
| static [Multiply](./multiply/)(const Decimal\&, const Decimal\&) | Moltiplica due valori [Decimal](./) specificati. |
| static [Negate](./negate/)(const Decimal\&) | Restituisce una nuova istanza della classe [Decimal](./) che rappresenta un valore risultante dalla negazione del valore rappresentato dall'oggetto specificato. |
| explicit [operator bool](./operatorbool/)() const | Converte il valore rappresentato dall'oggetto corrente in un valore booleano. |
| explicit [operator double](./operatordouble/)() const | Converte il valore rappresentato dall'oggetto corrente in un valore a virgola mobile a doppia precisione. |
| explicit [operator float](./operatorfloat/)() const | Converte il valore rappresentato dall'oggetto corrente in un valore a virgola mobile a precisione singola. |
| [operator!=](./operator!=/)(const Decimal\&) const | Determina se i valori rappresentati dall'oggetto corrente e dall'oggetto specificato non sono uguali. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Determina se il valore rappresentato dall'oggetto corrente è diverso da 0. |
| [operator%](./operator%/)(const Decimal\&) const | Restituisce una nuova istanza della classe [Decimal](./) che rappresenta un valore risultato dell'operazione modulo con i valori rappresentati dall'oggetto corrente e da quello specificato. |
| [operator%=](./operator%=/)(const Decimal\&) | Assegna all'oggetto corrente un nuovo valore che è il risultato dell'operazione modulo con i valori rappresentati dall'oggetto corrente e da quello specificato. |
| [operator*](./operator_/)(const Decimal\&) const | Restituisce una nuova istanza della classe [Decimal](./) che rappresenta un valore risultato della moltiplicazione dei valori rappresentati dall'oggetto corrente e da quello specificato. |
| [operator*=](./operator_=/)(const Decimal\&) | Assegna all'oggetto corrente un nuovo valore che è il risultato della moltiplicazione dei valori rappresentati dall'oggetto corrente e da quello specificato. |
| [operator+](./operator+/)(const Decimal\&) const | Restituisce una nuova istanza della classe [Decimal](./) che rappresenta un valore che è la somma dei valori rappresentati dall'oggetto corrente e da quello specificato. |
| [operator++](./operator++/)() | Incrementa il valore rappresentato dall'oggetto corrente. |
| [operator+=](./operator+=/)(const Decimal\&) | Assegna all'oggetto corrente un nuovo valore che è la somma dei valori rappresentati dall'oggetto corrente e da quello specificato. |
| [operator-](./operator-/)(const Decimal\&) const | Restituisce una nuova istanza della classe [Decimal](./) che rappresenta un valore risultato della sottrazione del valore rappresentato dall'oggetto specificato dal valore rappresentato dall'oggetto corrente. |
| [operator-](./operator-/)() const | Restituisce una nuova istanza della classe [Decimal](./) che rappresenta un valore risultante dalla negazione del valore rappresentato dall'oggetto corrente. |
| [operator--](./operator--/)() | Decrementa il valore rappresentato dall'oggetto corrente. |
| [operator-=](./operator-=/)(const Decimal\&) | Assegna all'oggetto corrente un nuovo valore che è il risultato della sottrazione del valore rappresentato dall'oggetto specificato dal valore rappresentato dall'oggetto corrente. |
| [operator/](./operator//)(const Decimal\&) const | Restituisce una nuova istanza della classe [Decimal](./) che rappresenta un valore risultato della divisione del valore rappresentato dall'oggetto corrente per il valore rappresentato dall'oggetto specificato. |
| [operator/=](./operator/=/)(const Decimal\&) | Assegna all'oggetto corrente un nuovo valore che è il risultato della divisione del valore rappresentato dall'oggetto corrente per il valore rappresentato dall'oggetto specificato. |
| [operator<](./operator_/)(const Decimal\&) const | Determina se il valore rappresentato dall'oggetto corrente è inferiore al valore rappresentato dall'oggetto specificato. |
| [operator<=](./operator_=/)(const Decimal\&) const | Determina se il valore rappresentato dall'oggetto corrente è inferiore o uguale al valore rappresentato dall'oggetto specificato. |
| [operator=](./operator=/)(const Decimal\&) | Assegna il valore rappresentato dall'oggetto specificato all'oggetto corrente. |
| [operator==](./operator==/)(const Decimal\&) const | Determina se i valori rappresentati dall'oggetto corrente e dall'oggetto specificato sono uguali. |
| [operator==](./operator==/)(std::nullptr_t) const | Determina se il valore rappresentato dall'oggetto corrente è 0. |
| [operator>](./operator_/)(const Decimal\&) const | Determina se il valore rappresentato dall'oggetto corrente è maggiore del valore rappresentato dall'oggetto specificato. |
| [operator>=](./operator_=/)(const Decimal\&) const | Determina se il valore rappresentato dall'oggetto corrente è maggiore o uguale al valore rappresentato dall'oggetto specificato. |
| static [Parse](./parse/)(const String\&) | Converte la rappresentazione stringa di un numero decimale in un'istanza equivalente della classe [Decimal](./). |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles) | Converte la rappresentazione stringa di un numero decimale in un'istanza equivalente della classe [Decimal](./) utilizzando lo stile specificato. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | Converte la rappresentazione stringa di un numero decimale in un'istanza equivalente della classe [Decimal](./) utilizzando il provider di formato specificato. |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) | Converte la rappresentazione stringa di un numero decimale in un'istanza equivalente della classe [Decimal](./) utilizzando lo stile e il provider di formato specificati. |
| static [Remainder](./remainder/)(const Decimal\&, const Decimal\&) | Calcola il resto dopo la divisione di due valori [Decimal](./). |
| static [Round](./round/)(const Decimal\&, MidpointRounding) | Arrotonda il valore specificato al numero intero più vicino. Un parametro specifica il comportamento della funzione se il valore specificato è equidistante dai due numeri più vicini. |
| static [Round](./round/)(const Decimal\&, int, MidpointRounding) | Arrotonda il valore specificato al valore più vicino con il numero specificato di cifre frazionarie. Un parametro specifica il comportamento della funzione se il valore specificato è equidistante dai due numeri più vicini. |
| static [Subtract](./subtract/)(const Decimal\&, const Decimal\&) | Sottrae un valore [Decimal](./) specificato da un altro. |
| static [ToByte](./tobyte/)(Decimal) | Converte il valore [Decimal](./) in un valore intero senza segno a 8 bit. |
| static [ToDouble](./todouble/)(Decimal) | Converte il valore [Decimal](./) in un numero a virgola mobile a doppia precisione. |
| static [ToInt16](./toint16/)(Decimal) | Converte il valore [Decimal](./) in un valore intero con segno a 16 bit. |
| static [ToInt32](./toint32/)(Decimal) | Converte il valore [Decimal](./) in un valore intero con segno a 32 bit. |
| static [ToInt64](./toint64/)(Decimal) | Converte il valore [Decimal](./) in un valore intero con segno a 64 bit. |
| static [ToOACurrency](./tooacurrency/)(const Decimal\&) | [Convert](../convert/) il valore [Decimal](./) specificato nel valore di valuta OLE equivalente. NON IMPLEMENTATO. |
| static [ToSByte](./tosbyte/)(Decimal) | Converte il valore [Decimal](./) in un valore intero con segno a 8 bit. |
| static [ToSingle](./tosingle/)(Decimal) | Converte il valore [Decimal](./) in un numero a virgola mobile a precisione singola. |
| [ToStdString](./tostdstring/)() const | Restituisce un'istanza di std::string che contiene la rappresentazione stringa del valore rappresentato dall'oggetto. |
| [ToString](./tostring/)() const | Restituisce la rappresentazione stringa del valore rappresentato dall'oggetto. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Converte l'oggetto corrente in stringa utilizzando le informazioni di formattazione specifiche della cultura. |
| [ToString](./tostring/)(const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const SharedPtr\<Globalization::NumberFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const Decimal\&, std::nullptr_t) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Converte l'oggetto corrente alla sua rappresentazione stringa utilizzando il formato stringa specificato e le informazioni di formattazione specifiche della cultura fornite dall'oggetto [IFormatProvider](../iformatprovider/) specificato. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| [ToStringInternal](./tostringinternal/)() const | Restituisce la rappresentazione stringa del valore rappresentato dall'oggetto. Per uso interno. |
| static [ToUInt16](./touint16/)(Decimal) | Converte il valore [Decimal](./) in un valore intero senza segno a 16 bit. |
| static [ToUInt32](./touint32/)(Decimal) | Converte il valore [Decimal](./) in un valore intero senza segno a 32 bit. |
| static [ToUInt64](./touint64/)(Decimal) | Converte il valore [Decimal](./) in un valore intero senza segno a 64 bit. |
| static [Truncate](./truncate/)(const Decimal\&) | Restituisce l'oggetto [Decimal](./) che rappresenta un valore la cui parte intera è uguale a quella del valore rappresentato dall'oggetto [Decimal](./) specificato, con tutte le cifre frazionarie scartate. |
| static [TryParse](./tryparse/)(const String\&, Decimal\&) | Converte la stringa specificata contenente la rappresentazione stringa di un numero nel valore [Decimal](./) equivalente. |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, Decimal\&) | Converte la stringa specificata contenente la rappresentazione stringa di un numero nel valore [Decimal](./) equivalente utilizzando le informazioni di formattazione e lo stile numerico forniti. |
| static [Type](./type/)() | Restituisce un riferimento all'oggetto [TypeInfo](../typeinfo/) che rappresenta le informazioni di tipo della classe [Decimal](./). |
| [~Decimal](./~decimal/)() | Distruttore. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [MaxValue](./maxvalue/) | Rappresenta il numero più grande che può essere rappresentato dalla classe [Decimal](./). |
| static [MinusOne](./minusone/) | Rappresenta il numero -1. |
| static [MinValue](./minvalue/) | Rappresenta il numero più piccolo che può essere rappresentato dalla classe [Decimal](./). |
| static [One](./one/) | Rappresenta il numero 1. |
| static [Zero](./zero/) | Rappresenta il numero 0. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [number_type](./number_type/) | Un alias per Detail::decimal_number_type. |
## Osservazioni



```cpp
#include "system/console.h"
#include "system/decimal.h"

int main()
{
  using namespace System;

  Console::WriteLine(Decimal::MinValue);
  Console::WriteLine(Decimal::MaxValue);

  auto dividend = Decimal::One;
  auto divisor = 6;
  Console::WriteLine(dividend/divisor);

  return 0;
}
/*
This code example produces the following output:
-79228162514264337593543950335
79228162514264337593543950335
0,1666666666666666666666666667
*/
```

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
