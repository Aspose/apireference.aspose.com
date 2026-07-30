---
title: "System::Security::Cryptography::CipherMode enum"
linktitle: "CipherMode"
second_title: "Aspose.Font для C++"
description: "System::Security::Cryptography::CipherMode enum. Режим блочного шифрования в C++."
type: docs
weight: 5300
url: /ru/cpp/system.security.cryptography/ciphermode/
---
## CipherMode enum


Режим блочного шифра.

```cpp
enum class CipherMode
```

### Значения

| Имя | Значение | Описание |
| --- | --- | --- |
| CBC | 1 | Cipher block chaining, который комбинирует текущий блок с предыдущим для улучшения шифрования. |
| ECB | 2 | Electronic codebook режим без взаимного влияния блоков; приводит к более слабому шифрованию. |
| OFB | 3 | Output feedback режим, который обрабатывает большие входные блоки небольшими частями. |
| CFB | 4 | Режим обратной связи шифра (CFB), который обрабатывает большие входные блоки небольшими частями. Правила перемешивания отличаются от аналогичных в OFB. |
| CTS | 5 | Режим захвата текста шифра (CTS), ведёт себя как CBC для всех блоков, кроме двух последних блоков текста. |

## См. также

* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
