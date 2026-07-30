---
title: "System::Security::Cryptography::ToBase64Transform classe"
linktitle: "ToBase64Transform"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::ToBase64Transform classe. Convertit l'instance de la classe CryptoStream en base 64. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 5000
url: /fr/cpp/system.security.cryptography/tobase64transform/
---
## ToBase64Transform class


Convertit l'instance de la classe [CryptoStream](../cryptostream/) en base 64. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class ToBase64Transform : public System::Security::Cryptography::ICryptoTransform
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clear](./clear/)() | Libère toutes les ressources. |
| [Dispose](./dispose/)() | Libère les ressources du système d'exploitation acquises par l'objet actuel. |
| virtual [get_CanReuseTransform](./get_canreusetransform/)() | Obtient une valeur indiquant si la transformation actuelle peut être réutilisée. |
| [get_CanTransformMultipleBlocks](./get_cantransformmultipleblocks/)() | Obtient une valeur indiquant si plusieurs blocs peuvent être transformés. |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | Taille du bloc d'entrée. |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | Taille du bloc de sortie. |
| [TransformBlock](./transformblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, System::ArrayPtr\<uint8_t\>, int32_t) | Traite un bloc de données et copie les données dans le tableau de sortie. |
| [TransformFinalBlock](./transformfinalblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) | Traite le dernier bloc de données et calcule la valeur de sortie. |
| virtual [~ToBase64Transform](./~tobase64transform/)() | Destructeur. |
## Voir aussi

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
