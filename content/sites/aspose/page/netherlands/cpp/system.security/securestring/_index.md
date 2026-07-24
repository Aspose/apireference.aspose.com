---
title: "System::Security::SecureString klasse"
linktitle: "SecureString"
second_title: "Aspose.Page voor C++"
description: "System::Security::SecureString klasse. Secure string, vertegenwoordigt tekst die vertrouwelijk moet blijven. Deze klasse ENCRYPTING DE interne gegevens NIET. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 100
url: /nl/cpp/system.security/securestring/
---
## SecureString class


Secure string, vertegenwoordigt tekst die vertrouwelijk moet blijven. Deze klasse ENCRYPTING DE interne gegevens NIET. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class SecureString : public System::IDisposable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AppendChar](./appendchar/)(char16_t) | Voegt een teken toe aan het einde van de string. |
| [Clear](./clear/)() | Verwijder alle tekens uit de huidige beveiligde string. |
| [Copy](./copy/)() const | Maakt een duplicaat van deze beveiligde string. |
| [Dispose](./dispose/)() override | Geef alle resources vrij die door het huidige object worden gebruikt. |
| [get_Length](./get_length/)() const | Haalt het aantal tekens op in deze beveiligde string. |
| [InsertAt](./insertat/)(int32_t, char16_t) | Voegt een teken in op de opgegeven index. |
| [IsReadOnly](./isreadonly/)() const | Haalt de vlag op die aangeeft of dit object als alleen-lezen is gemarkeerd. |
| [MakeReadOnly](./makereadonly/)() | Maakt deze beveiligde string alleen-lezen. |
| [operator=](./operator=/)(const SecureString\&) |  |
| [RemoveAt](./removeat/)(int32_t) | Verwijdert het teken op de opgegeven positie. |
| [SecureString](./securestring/)() | RTTI-informatie. |
| [SecureString](./securestring/)(const char16_t *, int32_t) | Constructor. |
| [SecureString](./securestring/)(const SecureString\&) |  |
| [SetAt](./setat/)(int32_t, char16_t) | Vervangt het bestaande teken op de opgegeven positie. |
| [ToUnsecureString](./tounsecurestring/)() const | Kopieert de inhoud van deze beveiligde string naar een onveilige [String](../../system/string/) object. Gebruik met voorzichtigheid. |
| [~SecureString](./~securestring/)() | Destructor. |
## Zie ook

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security](../)
* Library [Aspose.Page for C++](../../)
