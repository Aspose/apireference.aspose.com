---
title: "System::Security::Cryptography::TripleDESManaged-klass"
linktitle: "TripleDESManaged"
second_title: "Aspose.Page för C++"
description: "System::Security::Cryptography::TripleDESManaged-klass. Hanterad TripleDES-implementation. Stöder endast ECB- och CFB-lägen med ingen fyllning och CBC-läge med ingen, nollor och PKCS7-fyllningar. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 5200
url: /sv/cpp/system.security.cryptography/tripledesmanaged/
---
## TripleDESManaged class


Hanterad [TripleDES](../tripledes/)-implementation. Stöder endast ECB- och CFB-lägen med ingen fyllning och CBC-läge med ingen, nollor och PKCS7-fyllningar. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/)-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/)-pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class TripleDESManaged : public System::Security::Cryptography::TripleDES
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Skapar avkrypteringsobjekt med explicita parametrar. |
| virtual [CreateDecryptor](./createdecryptor/)() | Skapar avkrypteringsobjekt med parametrar definierade av algoritmobjektet. |
| [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Skapar krypteringsobjekt med explicita parametrar. |
| virtual [CreateEncryptor](./createencryptor/)() | Skapar krypteringsobjekt med parametrar definierade av algoritmobjektet. |
| [GenerateIV](./generateiv/)() override | Skapar ett slumpmässigt startvärde och lagrar det i algoritmens interna data. |
| [GenerateKey](./generatekey/)() override | Skapar en slumpmässig nyckel och lagrar den i algoritmens interna data. |
## Se även

* Class [TripleDES](../tripledes/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
