---
title: "System::Security::Cryptography::FromBase64Transform classe"
linktitle: "FromBase64Transform"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::FromBase64Transform classe. Convertit l'instance de la classe CryptoStream depuis le base 64. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne jamais créer d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1500
url: /fr/cpp/system.security.cryptography/frombase64transform/
---
## FromBase64Transform class


Convertit l'instance de la classe [CryptoStream](../cryptostream/) depuis le base 64. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne jamais créer d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class FromBase64Transform : public System::Security::Cryptography::ICryptoTransform
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clear](./clear/)() | Libère toutes les ressources. |
| [Dispose](./dispose/)() | Libère les ressources du système d'exploitation acquises par l'objet actuel. |
| [FromBase64Transform](./frombase64transform/)() | Constructeur. |
| [FromBase64Transform](./frombase64transform/)(FromBase64TransformMode) | Constructeur. |
| virtual [get_CanReuseTransform](./get_canreusetransform/)() | Obtient une valeur indiquant si la transformation actuelle peut être réutilisée. |
| [get_CanTransformMultipleBlocks](./get_cantransformmultipleblocks/)() | Obtient une valeur indiquant si plusieurs blocs peuvent être transformés. |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | Taille du bloc d'entrée. |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | Taille du bloc de sortie. |
| [TransformBlock](./transformblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, System::ArrayPtr\<uint8_t\>, int32_t) |  |
| [TransformFinalBlock](./transformfinalblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) |  |
| virtual [~FromBase64Transform](./~frombase64transform/)() | Destructeur. |
## Voir aussi

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
