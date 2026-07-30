---
title: "System::Security::Cryptography::AsymmetricSignatureFormatter classe"
linktitle: "AsymmetricSignatureFormatter"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::AsymmetricSignatureFormatter class. Classe base per formattatori di firme asimmetriche. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 400
url: /it/cpp/system.security.cryptography/asymmetricsignatureformatter/
---
## AsymmetricSignatureFormatter class


Classe base per formattatori di firme asimmetriche. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class AsymmetricSignatureFormatter : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [CreateSignature](./createsignature/)(System::ArrayPtr\<uint8_t\>) | Informazioni RTTI. |
| virtual [CreateSignature](./createsignature/)(System::SharedPtr\<HashAlgorithm\>) | Crea la firma per il valore hash specificato. |
| virtual [SetHashAlgorithm](./sethashalgorithm/)(System::String) | Imposta l'algoritmo hash da utilizzare. |
| virtual [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) | Imposta l'algoritmo asimmetrico da utilizzare durante il calcolo della firma. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
