---
title: "Enumération System::Security::Cryptography::CipherMode"
linktitle: "CipherMode"
second_title: "Aspose.Font pour C++"
description: "Enumération System::Security::Cryptography::CipherMode. Mode de chiffrement par blocs en C++."
type: docs
weight: 5300
url: /fr/cpp/system.security.cryptography/ciphermode/
---
## CipherMode enum


Mode de chiffrement par blocs.

```cpp
enum class CipherMode
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| CBC | 1 | Chaînage de blocs de chiffrement qui combine le bloc actuel avec le bloc précédent pour améliorer le chiffrement. |
| ECB | 2 | Mode codebook électronique sans influence inter-blocs ; entraîne un chiffrement plus faible. |
| OFB | 3 | Mode de rétroaction de sortie qui traite les gros blocs d'entrée en petits morceaux. |
| CFB | 4 | Mode de rétroaction de chiffrement qui traite les gros blocs d'entrée en petits morceaux. Les règles de transformation diffèrent de celles de l'OFB. |
| CTS | 5 | Mode de vol de texte chiffré, se comporte comme le CBC pour tous les blocs sauf les deux derniers blocs de texte. |

## Voir aussi

* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
