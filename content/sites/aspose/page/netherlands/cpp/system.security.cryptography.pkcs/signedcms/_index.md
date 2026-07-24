---
title: "System::Security::Cryptography::Pkcs::SignedCms-klasse"
linktitle: "SignedCms"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::Pkcs::SignedCms-klasse. Ondertekent inhoud volgens de CMS/PKCS #7-standaard. Niet geïmplementeerd. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()-functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik die pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 300
url: /nl/cpp/system.security.cryptography.pkcs/signedcms/
---
## SignedCms class


Ondertekent inhoud volgens de CMS/PKCS #7-standaard. Niet geïmplementeerd. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class SignedCms : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [ComputeSignature](./computesignature/)(const SharedPtr\<CmsSigner\>\&, bool) | Maakt een handtekening. |
| [Encode](./encode/)() | Encodeert CMS/PKCS #7-bericht. |
| [SignedCms](./signedcms/)(const SharedPtr\<ContentInfo\>\&, bool) | Constructor. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Pkcs](../)
* Library [Aspose.Page for C++](../../)
