---
title: "Classe System::Version"
linktitle: "Versione"
second_title: "Aspose.Font per C++"
description: "Classe System::Version. Rappresenta un numero di versione. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe System::SmartPtr per gestire oggetti di questo tipo in C++."
type: docs
weight: 7300
url: /it/cpp/system/version/
---
## Version class


Rappresenta un numero di versione. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe [System::SmartPtr](../smartptr/) per gestire oggetti di questo tipo.

```cpp
class Version
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CompareTo](./compareto/)(const Version\&) const | Confronta le versioni rappresentate dall'oggetto corrente e dall'oggetto specificato. |
| [Equals](./equals/)(const Version\&) const | Determina se i numeri di versione rappresentati dagli oggetti corrente e specificato sono uguali. |
| [get_Build](./get_build/)() const | Restituisce il numero di build. |
| [get_Major](./get_major/)() const | Restituisce la versione principale. |
| [get_MajorRevision](./get_majorrevision/)() const | Restituisce il valore a 16 bit alto del numero di revisione. |
| [get_Minor](./get_minor/)() const | Restituisce la versione secondaria. |
| [get_MinorRevision](./get_minorrevision/)() const | Restituisce il valore a 16 bit basso del numero di revisione. |
| [get_Revision](./get_revision/)() const | Restituisce il numero di revisione. |
| [GetHashCode](./gethashcode/)() const | Restituisce un codice hash per l'oggetto corrente. |
| static [Parse](./parse/)(const String\&) | Converte la rappresentazione stringa di un numero di versione in un'istanza equivalente della classe [Version](./). |
| [ToString](./tostring/)() const | Restituisce la rappresentazione stringa del numero di versione rappresentato dall'oggetto corrente. |
| [ToString](./tostring/)(int) const | Restituisce la rappresentazione stringa del numero specificato di sezioni del numero di versione rappresentato dall'oggetto corrente. |
| [Version](./version/)(int, int, int, int) | Crea un'istanza che rappresenta i valori specificati di major, minor, build e revsion. |
| [Version](./version/)(int, int, int) | Crea un'istanza che rappresenta i valori specificati di major, minor e build. |
| [Version](./version/)(int, int) | Crea un'istanza che rappresenta i valori specificati di major e values. |
| [Version](./version/)(const String\&) | Crea un'istanza che rappresenta il numero di versione rappresentato come stringa. |
| [Version](./version/)() | Crea un'istanza che rappresenta il numero di versione 0.0.-1.-1. |
## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
