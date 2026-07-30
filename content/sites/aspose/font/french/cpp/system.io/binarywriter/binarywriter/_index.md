---
title: "constructeur System::IO::BinaryWriter::BinaryWriter"
linktitle: "BinaryWriter"
second_title: "Aspose.Font pour C++"
description: "constructeur System::IO::BinaryWriter::BinaryWriter. Construit une instance de la classe BinaryWriter qui écrit des données dans le flux spécifié en utilisant le codage spécifié en C++."
type: docs
weight: 100
url: /fr/cpp/system.io/binarywriter/binarywriter/
---
## BinaryWriter::BinaryWriter constructor


Construit une instance de la classe [BinaryWriter](../) qui écrit des données dans le flux spécifié en utilisant le codage spécifié.

```cpp
System::IO::BinaryWriter::BinaryWriter(const StreamPtr &stream, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked(), bool leaveopen=false)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | const StreamPtr\& | Le flux de sortie |
| encoding | const EncodingPtr\& | L'encodage à utiliser |
| leaveopen | bool | Spécifie si le flux **stream** doit rester ouvert (true) après que l'objet actuel a été libéré ou non (false) |

## Voir aussi

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
