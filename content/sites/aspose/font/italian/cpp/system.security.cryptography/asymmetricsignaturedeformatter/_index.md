---
title: "classe System::Security::Cryptography::AsymmetricSignatureDeformatter"
linktitle: "AsymmetricSignatureDeformatter"
second_title: "Aspose.Font per C++"
description: "classe System::Security::Cryptography::AsymmetricSignatureDeformatter. Classe base per i deformatori di firme asimmetriche. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo nello stack o usando l'operatore new, poiché causerà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 300
url: /it/cpp/system.security.cryptography/asymmetricsignaturedeformatter/
---
## AsymmetricSignatureDeformatter class


Classe base per i deformatori di firme asimmetriche. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo nello stack o usando l'operatore new, poiché causerà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class AsymmetricSignatureDeformatter : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [SetHashAlgorithm](./sethashalgorithm/)(System::String) | Informazioni RTTI. |
| virtual [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) | Imposta la chiave da utilizzare con l'algoritmo. |
| virtual [VerifySignature](./verifysignature/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Verifica la firma sui dati. |
| virtual [VerifySignature](./verifysignature/)(System::SharedPtr\<HashAlgorithm\>, System::ArrayPtr\<uint8_t\>) | Verifica la firma sui dati. Non implementato. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
