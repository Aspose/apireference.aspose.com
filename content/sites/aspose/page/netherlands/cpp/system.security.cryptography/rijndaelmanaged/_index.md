---
title: "System::Security::Cryptography::RijndaelManaged class"
linktitle: "RijndaelManaged"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::RijndaelManaged class. Beheerd Rijndael-algoritme. Ondersteunt alleen ECB- en CFB-modi met geen opvulling (None) en CBC-modus met geen en nul‑opvullingen. Objecten van deze klasse mogen alleen worden aangemaakt met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument door te geven aan functies in C++."
type: docs
weight: 3100
url: /nl/cpp/system.security.cryptography/rijndaelmanaged/
---
## RijndaelManaged class


Beheerd [Rijndael](../rijndael/) algoritme. Ondersteunt alleen ECB- en CFB-modi met geen opvulling (None) en CBC-modus met geen en nul‑opvullingen. Objecten van deze klasse mogen alleen worden aangemaakt met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument door te geven aan functies.

```cpp
class RijndaelManaged : public System::Security::Cryptography::Rijndael
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

* Class [Rijndael](../rijndael/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
