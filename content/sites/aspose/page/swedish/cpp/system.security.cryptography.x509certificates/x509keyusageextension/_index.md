---
title: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension klass"
linktitle: "X509KeyUsageExtension"
second_title: "Aspose.Page för C++"
description: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension klass. Förlängningsobjekt för att behålla extra information om nyckelanvändning. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 1600
url: /sv/cpp/system.security.cryptography.x509certificates/x509keyusageextension/
---
## X509KeyUsageExtension class


Förlängningsobjekt för att behålla extra information om nyckelanvändning. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/)‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/)‑pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
class X509KeyUsageExtension : public System::Security::Cryptography::X509Certificates::X509Extension
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | Kopierar förlängningsdata från ett annat objekt. |
| [get_KeyUsages](./get_keyusages/)() | Hämtar nyckelanvändningar. |
| [X509KeyUsageExtension](./x509keyusageextension/)() | RTTI-information. |
| [X509KeyUsageExtension](./x509keyusageextension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | Konstruktor. |
| [X509KeyUsageExtension](./x509keyusageextension/)(X509KeyUsageFlags, bool) | Konstruktor. |
## Se även

* Class [X509Extension](../x509extension/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
