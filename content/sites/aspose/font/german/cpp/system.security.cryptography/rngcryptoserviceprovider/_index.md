---
title: "System::Security::Cryptography::RNGCryptoServiceProvider Klasse"
linktitle: "RNGCryptoServiceProvider"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::RNGCryptoServiceProvider Klasse. Zufallszahlengenerator, der dem CSP-Konzept folgt. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 3300
url: /de/cpp/system.security.cryptography/rngcryptoserviceprovider/
---
## RNGCryptoServiceProvider class


Zufallszahlengenerator, der dem CSP-Konzept folgt. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class RNGCryptoServiceProvider : public System::Security::Cryptography::RandomNumberGenerator
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) override | Füllt vorhandene Array-Elemente mit zufälligen Bytes. |
| [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) override | Füllt vorhandene Array‑View-Elemente mit zufälligen Bytes. |
| [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) override | Füllt vorhandene Array-Elemente mit zufälligen Nicht‑Null‑Bytes. |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) override | Füllt vorhandene Array‑View-Elemente mit zufälligen Nicht‑Null‑Bytes. |
| [RNGCryptoServiceProvider](./rngcryptoserviceprovider/)() | Konstruktor. |
| virtual [~RNGCryptoServiceProvider](./~rngcryptoserviceprovider/)() | Destruktor. |
## Siehe auch

* Class [RandomNumberGenerator](../randomnumbergenerator/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
