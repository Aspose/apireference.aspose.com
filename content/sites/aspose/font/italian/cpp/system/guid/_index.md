---
title: "System::Guid class"
linktitle: "Guid"
second_title: "Aspose.Font per C++"
description: "System::Guid class. Rappresenta un Identificatore Unico Globale. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe System::SmartPtr per gestire oggetti di questo tipo in C++."
type: docs
weight: 3000
url: /it/cpp/system/guid/
---
## Guid class


Rappresenta un Identificatore Unico Globale. Questo tipo dovrebbe essere allocato nello stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe [System::SmartPtr](../smartptr/) per gestire oggetti di questo tipo.

```cpp
class Guid
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CompareTo](./compareto/)(const Guid\&) const | Esegue il confronto aritmetico dei GUID rappresentati dall'oggetto corrente e da quello specificato. |
| [Equals](./equals/)(const Guid\&) const | Determina se i GUID rappresentati dall'oggetto corrente e da quello specificato sono uguali. |
| [GetHashCode](./gethashcode/)() const | Restituisce un codice hash per l'oggetto corrente. |
| [Guid](./guid/)() | Costruisce un oggetto che rappresenta un GUID composto interamente da zeri. |
| [Guid](./guid/)(const ArrayPtr\<uint8_t\>\&) | Costruisce un oggetto che rappresenta un GUID specificato come un array di valori interi senza segno a 8 bit. |
| [Guid](./guid/)(const System::Details::ArrayView\<uint8_t\>\&) | Costruisce un oggetto che rappresenta un GUID specificato come una vista di array di valori interi senza segno a 8 bit. |
| [Guid](./guid/)(const String\&) | Costruisce un oggetto che rappresenta un GUID specificato come stringa. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, const ArrayPtr\<uint8_t\>\&) | Costruisce un'istanza della classe [Guid](./) dai componenti GUID specificati. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, const System::Details::ArrayView\<uint8_t\>\&) | Costruisce un'istanza della classe [Guid](./) dai componenti GUID specificati. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) | Costruisce un'istanza della classe [Guid](./) dai numeri interi senza segno e byte specificati. |
| [Guid](./guid/)(uint32_t, uint16_t, uint16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) | Costruisce un'istanza della classe [Guid](./) dai numeri interi senza segno e byte specificati. |
| [Guid](./guid/)(const Guid\&) | Costruisce un oggetto che rappresenta lo stesso GUID dell'oggetto specificato. |
| static [NewGuid](./newguid/)() | Genera un nuovo GUID e restituisce un oggetto [Guid](./) che lo rappresenta. |
| [operator!=](./operator!=/)(const Guid\&) const | Determina se i GUID rappresentati dall'oggetto corrente e da quello specificato non sono uguali. |
| [operator=](./operator=/)(const Guid\&) | Assegna all'oggetto corrente il valore GUID rappresentato dall'oggetto [Guid](./) specificato. |
| [operator==](./operator==/)(const Guid\&) const | Determina se i GUID rappresentati dall'oggetto corrente e da quello specificato sono uguali. |
| static [Parse](./parse/)(const String\&) | Converte la rappresentazione stringa specificata di un GUID in un oggetto [Guid](./) equivalente. |
| [ToByteArray](./tobytearray/)() const | Converte il GUID rappresentato dall'oggetto corrente in un array di byte. |
| [ToString](./tostring/)() const | Converte il GUID rappresentato dall'oggetto corrente nella sua rappresentazione stringa. |
| [ToString](./tostring/)(const String\&) const | Converte il GUID rappresentato dall'oggetto corrente nella sua rappresentazione stringa usando il formato stringa specificato. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const | Converte il GUID rappresentato dall'oggetto corrente nella sua rappresentazione stringa usando il formato stringa e la cultura specificati. |
| static [TryParse](./tryparse/)(const String\&, Guid\&) | Prova a convertire la stringa specificata in un oggetto [Guid](./). |
| [~Guid](./~guid/)() | Distruttore. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Empty](./empty/) | Rappresenta un GUID con valore 0. |
## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
