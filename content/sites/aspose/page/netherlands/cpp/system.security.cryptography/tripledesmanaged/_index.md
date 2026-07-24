---
title: "System::Security::Cryptography::TripleDESManaged klasse"
linktitle: "TripleDESManaged"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::TripleDESManaged klasse. Beheerde TripleDES-implementatie. Ondersteunt alleen ECB- en CFB-modi met None padding en CBC-modus met None, Zeros en PKCS7 paddings. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 5200
url: /nl/cpp/system.security.cryptography/tripledesmanaged/
---
## TripleDESManaged class


Beheerde [TripleDES](../tripledes/) implementatie. Ondersteunt alleen ECB- en CFB-modi met None padding en CBC-modus met None, Zeros en PKCS7 paddings. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class TripleDESManaged : public System::Security::Cryptography::TripleDES
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

* Class [TripleDES](../tripledes/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
