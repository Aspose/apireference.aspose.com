---
title: "System::Security::Cryptography::RC2Managed klasse"
linktitle: "RC2Managed"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::RC2Managed klasse. Beheerde RC2-algoritme. Alleen ECB-, CFB- en CBC-ciphermodi worden ondersteund. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2800
url: /nl/cpp/system.security.cryptography/rc2managed/
---
## RC2Managed class


Beheerd [RC2](../rc2/) algoritme. Alleen ECB-, CFB- en CBC-ciphermodi worden ondersteund. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)-pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class RC2Managed : public System::Security::Cryptography::RC2
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Maakt een decryptor-object aan met expliciete parameters. |
| virtual [CreateDecryptor](./createdecryptor/)() | Maakt een decryptor-object aan met parameters gedefinieerd door het algoritme-object. |
| [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Maakt een encryptor-object aan met expliciete parameters. |
| virtual [CreateEncryptor](./createencryptor/)() | Maakt een encryptor-object aan met parameters gedefinieerd door het algoritme-object. |
| [GenerateIV](./generateiv/)() override | Maakt een willekeurige initiële waarde aan en slaat deze op in de interne gegevens van het algoritme. |
| [GenerateKey](./generatekey/)() override | Maakt een willekeurige sleutel aan en slaat deze op in de interne gegevens van het algoritme. |
## Zie ook

* Class [RC2](../rc2/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
