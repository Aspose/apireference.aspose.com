---
title: "enum System::Security::Cryptography::CipherMode"
linktitle: "CipherMode"
second_title: "Aspose.Page pour C++"
description: "enum System::Security::Cryptography::CipherMode. Mode de chiffrement par bloc en C++."
type: docs
weight: 5300
url: /fr/cpp/system.security.cryptography/ciphermode/
---
## CipherMode enum


Mode de chiffrement par bloc.

```cpp
enum class CipherMode
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| CBC | 1 | Chaînage de blocs de chiffrement qui combine le bloc actuel avec le bloc précédent pour améliorer le chiffrement. |
| ECB | 2 | Mode de registre de code électronique sans influence entre les blocs ; entraîne un chiffrement plus faible. |
| OFB | 3 | Mode de rétroaction de sortie qui traite de gros blocs d’entrée en petites portions. |
| CFB | 4 | Mode de rétroaction de chiffrement qui traite de gros blocs d’entrée en petites portions. Les règles de mélange diffèrent de celles de l’OFB. |
| CTS | 5 | Mode de vol de texte chiffré, se comporte comme le CBC pour tous les blocs sauf les deux derniers. |

## Voir aussi

* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
