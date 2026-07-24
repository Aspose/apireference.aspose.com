---
title: "System::Security::Cryptography::SymmetricAlgorithm klasse"
linktitle: "SymmetricAlgorithm"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::SymmetricAlgorithm klasse. Symmetrisch algoritme dat dezelfde sleutel gebruikt voor versleuteling en ontsleuteling, basisklasse. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject() function. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 4900
url: /nl/cpp/system.security.cryptography/symmetricalgorithm/
---
## SymmetricAlgorithm class


Symmetrisch algoritme dat dezelfde sleutel gebruikt voor versleuteling en ontsleuteling, basisklasse. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/) function. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class SymmetricAlgorithm : public virtual System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [Create](./create/)(const String\&) | Maakt een algoritme‑instantie aan. |
| virtual [CreateDecryptor](./createdecryptor/)() | Maakt een decryptor aan met parameters die bij het algoritme‑object horen. |
| virtual [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Maakt een decryptor aan met expliciete parameters. |
| virtual [CreateEncryptor](./createencryptor/)() | Maakt een encryptor aan met parameters die bij het algoritme‑object horen. |
| virtual [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Maakt een encryptor aan met expliciete parameters. |
| virtual [GenerateIV](./generateiv/)() | Genereert een willekeurige initiële waarde voor het algoritme. Overschrijft de bestaande (indien aanwezig). |
| virtual [GenerateKey](./generatekey/)() | Genereert een willekeurige sleutel voor het algoritme. Overschrijft de bestaande (indien aanwezig). |
| virtual [get_BlockSize](./get_blocksize/)() | Haalt de blokgrootte op van de cryptografische bewerking. |
| virtual [get_FeedbackSize](./get_feedbacksize/)() | Haalt de feedbackgrootte op van de cryptografische bewerking. |
| virtual [get_IV](./get_iv/)() | Haalt de initiële waarde op van de cryptografische bewerking. Maakt een nieuwe aan indien nog niet aangemaakt. |
| virtual [get_Key](./get_key/)() | Haalt de sleutel op van de cryptografische bewerking. Maakt een nieuwe aan indien nog niet aangemaakt. |
| virtual [get_KeySize](./get_keysize/)() | Haalt de sleutelgrootte op van de cryptografische bewerking. |
| virtual [get_Mode](./get_mode/)() | Haalt de modus op van de cryptografische bewerking. |
| virtual [get_Padding](./get_padding/)() | Haalt de opvulling op van de cryptografische bewerking. |
| virtual [set_BlockSize](./set_blocksize/)(int) | Stelt de blokgrootte in van de cryptografische bewerking. |
| virtual [set_FeedbackSize](./set_feedbacksize/)(int) | Stelt de feedbackgrootte in van de cryptografische bewerking. |
| virtual [set_IV](./set_iv/)(System::ArrayPtr\<uint8_t\>) | Stelt de initiële waarde in van de cryptografische bewerking. |
| virtual [set_Key](./set_key/)(System::ArrayPtr\<uint8_t\>) | Stelt de sleutel in van de cryptografische bewerking. |
| virtual [set_KeySize](./set_keysize/)(int) | Stelt de sleutelgrootte in van de cryptografische bewerking. |
| virtual [set_Mode](./set_mode/)(CipherMode) | Stelt de modus in van de cryptografische bewerking. |
| virtual [set_Padding](./set_padding/)(PaddingMode) | Stelt de opvulling van de cryptografische bewerking in. |
| [ValidKeySize](./validkeysize/)(int) | Controleert of de sleutelgrootte geldig is. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
