---
title: "Classe Aspose::Page::Plugins::IOperationResult"
linktitle: "IOperationResult"
second_title: "Aspose.Page pour C++"
description: "Classe Aspose::Page::Plugins::IOperationResult. Interface de résultat d'opération générale qui définit les méthodes communes qu'un résultat d'opération de plugin concret doit implémenter en C++."
type: docs
weight: 700
url: /fr/cpp/aspose.page.plugins/ioperationresult/
---
## IOperationResult class


Interface générale de résultat d'opération qui définit les méthodes communes que le résultat d'opération de plugin concret doit implémenter.

```cpp
class IOperationResult : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [get_Data](./get_data/)() | Obtient les données brutes. |
| virtual [get_IsByteArray](./get_isbytearray/)() | Indique si le résultat est un tableau d'octets. |
| virtual [get_IsFile](./get_isfile/)() | Indique si le résultat est un chemin vers un fichier de sortie. |
| virtual [get_IsStream](./get_isstream/)() | Indique si le résultat est un flux de sortie. |
| virtual [get_IsString](./get_isstring/)() | Indique si le résultat est une chaîne de texte. |
| virtual [ToFile](./tofile/)() | Tente de convertir le résultat dans le fichier. |
| virtual [ToStream](./tostream/)() | Essaie de convertir le résultat en objet flux. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
