---
title: "System::Security::Cryptography::Pkcs::CmsSigner-klasse"
linktitle: "CmsSigner"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::Pkcs::CmsSigner-klasse. Biedt een API om objecten te ondertekenen met CMS. Ondertekent geen objecten zelf; gebruik de SignedCMS-klasse om dit te doen. Niet geïmplementeerd. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()-functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik die pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 100
url: /nl/cpp/system.security.cryptography.pkcs/cmssigner/
---
## CmsSigner class


Biedt API om objecten te ondertekenen met CMS. Ondertekent geen objecten zelf, gebruik de SignedCMS-klasse om dit te doen. Niet geïmplementeerd. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class CmsSigner : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CmsSigner](./cmssigner/)(const SharedPtr\<X509Certificates::X509Certificate2\>\&) | Initialiseert ondertekenaar met X509-certificaat. |
| [get_DigestAlgorithm](./get_digestalgorithm/)() const | Haalt het hash-algoritme op dat wordt gebruikt met de handtekening. |
| [get_IncludeOption](./get_includeoption/)() const | Controleert welke certificaten uit de keten worden opgenomen in de handtekening. |
| [set_DigestAlgorithm](./set_digestalgorithm/)(const SharedPtr\<Oid\>\&) | Stelt het hash-algoritme in dat wordt gebruikt met de handtekening. |
| [set_IncludeOption](./set_includeoption/)(X509Certificates::X509IncludeOption) | Specificeert welke certificaten uit de keten worden opgenomen in de handtekening. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Pkcs](../)
* Library [Aspose.Page for C++](../../)
