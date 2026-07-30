---
title: "System::Security::Cryptography::ICryptoTransform classe"
linktitle: "ICryptoTransform"
second_title: "Aspose.Font pour C++"
description: "Classe System::Security::Cryptography::ICryptoTransform. Classe de base du transformateur cryptographique. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la passer aux fonctions en argument en C++."
type: docs
weight: 2000
url: /fr/cpp/system.security.cryptography/icryptotransform/
---
## ICryptoTransform class


Classe de base du transformateur cryptographique. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la passer aux fonctions en argument.

```cpp
class ICryptoTransform : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | Taille du bloc d'entrée. |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | Taille du bloc de sortie. |
| virtual [TransformBlock](./transformblock/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<uint8_t\>, int) | Informations RTTI. |
| virtual [TransformFinalBlock](./transformfinalblock/)(ArrayPtr\<uint8_t\>, int, int) | Traite le dernier bloc de données et calcule la valeur de sortie. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
